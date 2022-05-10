if __name__ is not None and "." in __name__:
    from gen.pyGramParser import pyGramParser
else:
    from gen.pyGramParser import pyGramParser
from JasminGenerator import Generator, Id
from SematicErrors import *
from gen.pyGramListener import pyGramListener


class myListener(pyGramListener):
    symbol_table = {}
    functions_args = {}
    stack_block = []

    def __init__(self, filename):
        self.jasmin = Generator(filename, self.symbol_table)

    def __is_numeric(self, type):
        return (type == 'float') or (type == 'int')

    def __is_inside_function(self):
        return 'function' in self.stack_block

    def enterMain(self, ctx: pyGramParser.MainContext):
        self.jasmin.enter_main()

    def enterL_type(self, ctx: pyGramParser.L_typeContext):
        self.stack_block.append('function')
        function_id = ctx.ID(0).getText()
        if function_id in self.symbol_table:
            raise AlreadyDeclaredError(ctx.start.line, function_id)

        self.symbol_table[function_id] = Id(type=ctx.TYPE(0).getText())
        if self.symbol_table[function_id].type == 'int':
            self.symbol_table[function_id].type = 'integer'

        args = []
        args_names = []
        for arg_id, arg_type in list(zip(ctx.ID()[1:], ctx.TYPE()[1:])):
            if arg_id.getText() in self.symbol_table:
                raise AlreadyDeclaredError(ctx.start.line, arg_id.getText())
            self.symbol_table[arg_id.getText()] = Id(type=arg_type.getText(), local=True, function=True)
            args.append(arg_type.getText())
            args_names.append(arg_id.getText())

        self.functions_args[function_id] = args
        self.jasmin.enter_function(function_id, args_names)

    def enterL_void(self, ctx: pyGramParser.L_voidContext):
        self.stack_block.append('function')
        function_id = ctx.ID(0).getText()
        self.symbol_table[function_id] = Id(type='NoneType', function=True)

        args = []
        for arg_id, arg_type in list(zip(ctx.ID()[1:], ctx.TYPE())):
            self.symbol_table[arg_id.getText()] = Id(type=arg_type.getText(), local=True)
            args.append(arg_type.getText())

        self.functions_args[function_id] = args
        self.jasmin.enter_function(function_id)

    def enterR_return(self, ctx: pyGramParser.R_returnContext):
        if not self.__is_inside_function():
            raise ReturnException(ctx.start.line)

    def exitR_return(self, ctx: pyGramParser.R_returnContext):
        # TODO : conferir se o tipo do retorno bate com o da função
        self.jasmin.do_return(ctx.expr().val, ctx.expr().type)

    def enterFunction_call(self, ctx: pyGramParser.Function_callContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table:
            raise UndeclaredVariable(ctx.start.line, ctx_id)

    def enterR_for(self, ctx: pyGramParser.R_forContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table:
            raise UndeclaredVariable(ctx.start.line, ctx_id)

        if not self.__is_numeric(self.symbol_table[ctx_id].type):
            raise UnexpectedTypeError(ctx.start.line, 'int', self.symbol_table[ctx_id].type)

        ctx.start, ctx.expr()[len(ctx.expr()) - 1].inh = self.jasmin.enter_for(len(ctx.expr()) == 1)
        ctx.stack_idx = len(self.stack_block)

        self.stack_block.append('loop')

    def enterR_while(self, ctx: pyGramParser.R_whileContext):
        self.stack_block.append('loop')

    def enterR_break(self, ctx: pyGramParser.R_breakContext):
        if 'loop' not in self.stack_block:
            raise BreakException(ctx.start.line)

    def exitMain(self, ctx: pyGramParser.MainContext):
        self.jasmin.exit_main()

    def exitR_if(self, ctx: pyGramParser.R_ifContext):
        if ctx.expr().type != 'boolean':
            raise UnexpectedTypeError(ctx.start.line, 'boolean', ctx.expr().type)

    def exitL_type(self, ctx: pyGramParser.L_typeContext):
        # saindo da função antes de apagar referencias que podem ser importantes
        # TODO : verificar se existe retorno!!
        self.jasmin.exit_function()

        self.stack_block.pop()
        # for arg_id in ctx.ID()[1:]:
        #     del self.symbol_table[arg_id.getText()]

    def exitL_void(self, ctx: pyGramParser.L_voidContext):
        self.jasmin.exit_function()
        self.stack_block.pop()

        for arg_id in ctx.ID()[1:]:
            del self.symbol_table[arg_id.getText()]

    def exitFunction_call(self, ctx: pyGramParser.Function_callContext):
        function_id = ctx.ID().getText()

        if len(self.functions_args[function_id]) != len(ctx.expr()):
            raise MissingArgument(ctx.start.line, len(self.functions_args[function_id]), len(ctx.expr()))

        for expected, recieved in list(zip(self.functions_args[function_id], ctx.expr())):
            if expected != recieved.type:
                raise UnexpectedTypeError(ctx.start.line, expected, recieved.type)

        ctx.type = self.symbol_table[ctx.ID().getText()].type

    def exitR_for(self, ctx: pyGramParser.R_forContext):
        self.stack_block.pop()
        if ctx.start != None:
            self.jasmin.exit_for(ctx.start, ctx.expr()[0].val, ctx.stack_idx)
        else:
            self.jasmin.exit_for(ctx.expr()[0].val, ctx.expr()[1].val, ctx.stack_idx)

    def exitR_while(self, ctx: pyGramParser.R_whileContext):
        if ctx.expr().type != 'boolean':
            raise UnexpectedTypeError(ctx.start.line, 'boolean', ctx.expr().type)
        self.stack_block.pop()

    def exitDeclaration(self, ctx: pyGramParser.DeclarationContext):
        for token in ctx.ID():
            if token.getText() in self.symbol_table:
                raise AlreadyDeclaredError(ctx.start.line, token.getText())
            self.symbol_table[token.getText()] = Id(type=ctx.TYPE().getText())
            if self.symbol_table[token.getText()].type == 'int':
                self.symbol_table[token.getText()].type = 'integer'
            self.jasmin.create_global(token.getText(), ctx.TYPE().getText())

    def exitE_assigment(self, ctx: pyGramParser.E_assigmentContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table:
            raise UndeclaredVariable(ctx.start.line, ctx_id)

        expected = self.symbol_table[ctx_id].type
        recieved = ctx.expr().type
        if recieved == 'int':
            recieved = 'integer'
        if expected != recieved:
            raise UnexpectedTypeError(ctx.start.line, expected, recieved)

        self.jasmin.store_var(ctx_id, ctx.expr().val)

    def exitInput(self, ctx: pyGramParser.InputContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table:
            raise UndeclaredVariable(ctx.start.line, ctx_id)

    def exitR_print(self, ctx: pyGramParser.R_printContext):
        type_val = []
        for expr in ctx.expr():
            type_val.append((expr.type, expr.val))
        self.jasmin.print(type_val)

    def exitOr_logic(self, ctx: pyGramParser.Or_logicContext):
        if ctx.expr().type != 'boolean':
            raise ExprTypeError(ctx.start.line, ctx.expr().type, ctx.op.text)
        elif ctx.term().type != 'boolean':
            raise ExprTypeError(ctx.start.line, ctx.term().type, ctx.op.text)
        else:
            ctx.type = 'boolean'

    def exitE_term(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term().type
        ctx.val = ctx.term().val

        try:
            self.jasmin.write_inh(ctx.inh.format(ctx.val))
        except:
            pass

    def exitAnd_logic(self, ctx: pyGramParser.Or_logicContext):
        if ctx.term().type != 'boolean':
            raise ExprTypeError(ctx.start.line, ctx.term().type, ctx.op.text)
        elif ctx.term2().type != 'boolean':
            raise ExprTypeError(ctx.start.line, ctx.term2().type, ctx.op.text)
        else:
            ctx.type = 'boolean'

    def exitE_term2(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term2().type
        ctx.val = ctx.term2().val

    def exitComp_logic(self, ctx: pyGramParser.Comp_logicContext):
        if ctx.term2().type != ctx.term3().type:
            raise ExprTypeError(ctx.start.line, ctx.term2().type, ctx.term3().type, ctx.op.text)
        ctx.type = 'boolean'

    def exitE_term3(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term3().type
        ctx.val = ctx.term3().val

    def exitEq_logic(self, ctx: pyGramParser.Eq_logicContext):
        if ctx.term3().type != ctx.term4().type:
            raise ExprTypeError(ctx.start.line, ctx.term3().type, ctx.term4().type, ctx.op.text)
        ctx.type = 'boolean'

    def exitE_term4(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term4().type
        ctx.val = ctx.term4().val

    def exitSum_minus(self, ctx: pyGramParser.Sum_minusContext):
        if not self.__is_numeric(ctx.term4().type):
            raise ExprTypeError(ctx.start.line, ctx.term4().type, ctx.op.text)
        elif not self.__is_numeric(ctx.term5().type):
            raise ExprTypeError(ctx.start.line, ctx.term5().type, ctx.op.text)
        elif ctx.term4().type == 'float' and ctx.term5().type == 'float':
            ctx.type = 'float'
            val1, val2 = ctx.term4().val, ctx.term5().val
        elif ctx.term4().type == 'float':
            ctx.type = 'float'
            val1, val2 = ctx.term4().val, self.jasmin.int_to_float(ctx.term5().val)
        elif ctx.term5().type == 'float':
            ctx.type = 'float'
            val1, val2 = self.jasmin.int_to_float(ctx.term4().val), ctx.term5().val
        else:
            ctx.type = 'int'
            val1, val2 = ctx.term4().val, ctx.term5().val

        if ctx.op.text == '+':
            ctx.val = self.jasmin.add(ctx.type, val1, val2)
        else:
            ctx.val = self.jasmin.sub(ctx.type, val1, val2)

    def exitE_term5(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term5().type
        ctx.val = ctx.term5().val

    def exitTime_div(self, ctx: pyGramParser.Time_divContext):
        if not self.__is_numeric(ctx.term5().type):
            raise ExprTypeError(ctx.start.line, ctx.term5().type, ctx.op.text)
        if not self.__is_numeric(ctx.term6().type):
            raise ExprTypeError(ctx.start.line, ctx.term6().type, ctx.op.text)
        elif ctx.term5().type == 'float' and ctx.term6().type == 'float':
            ctx.type = 'float'
            val1, val2 = ctx.term5().val, ctx.term6().val
        elif ctx.term5().type == 'float':
            ctx.type = 'float'
            val1, val2 = ctx.term5().val, self.jasmin.int_to_float(ctx.term6().val)
        elif ctx.term6().type == 'float':
            ctx.type = 'float'
            val1, val2 = self.jasmin.int_to_float(ctx.term5().val), ctx.term6().val
        else:
            ctx.type = 'int'
            val1, val2 = ctx.term5().val, ctx.term6().val

        if ctx.op.text == '*':
            ctx.val = self.jasmin.mul(ctx.type, val1, val2)
        else:
            ctx.val = self.jasmin.div(ctx.type, val1, val2)

    def exitE_term6(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term6().type
        ctx.val = ctx.term6().val

    def exitMinus_not(self, ctx: pyGramParser.Minus_notContext):
        if ctx.op.text == '-':  # minus
            if self.__is_numeric(ctx.term6().type):
                ctx.type = ctx.term6().type
            else:
                raise ExprTypeError(ctx.start.line, ctx.term6().type, ctx.op.text)
        elif ctx.op.text == 'not':  # not
            if ctx.term6().type == 'boolean':
                ctx.type = 'boolean'
            else:
                raise ExprTypeError(ctx.start.line, ctx.term6().type, ctx.op.text)

    def exitE_factor(self, ctx: pyGramParser.E_factorContext):
        ctx.type = ctx.factor().type
        ctx.val = ctx.factor().val

    def exitL_expr(self, ctx: pyGramParser.L_exprContext):
        ctx.type = ctx.expr().type
        ctx.val = ctx.expr().val

    def exitL_id(self, ctx: pyGramParser.L_idContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table:
            raise UndeclaredVariable(ctx.start.line, ctx_id)
        ctx.type = self.symbol_table[ctx_id].type
        ctx.val = self.jasmin.load_var(ctx_id)

    def exitL_int_value(self, ctx: pyGramParser.L_int_valueContext):
        ctx.type = 'int'
        ctx.val = self.jasmin.create_temp(ctx.getText(), ctx.type)

    def exitL_float_value(self, ctx: pyGramParser.L_float_valueContext):
        ctx.type = 'float'
        ctx.val = self.jasmin.create_temp(ctx.getText(), ctx.type)

    def exitL_str_value(self, ctx: pyGramParser.L_str_valueContext):
        ctx.type = 'string'
        ctx.val = self.jasmin.create_temp(ctx.getText(), ctx.type)

    def exitL_bool_value(self, ctx: pyGramParser.L_bool_valueContext):
        ctx.type = 'boolean'
        ctx.val = self.jasmin.create_temp(ctx.getText(), ctx.type)

    def exitFunction_call(self, ctx: pyGramParser.L_function_callContext):
        ctx.type = self.symbol_table[ctx.ID().getText()].type
        args = []
        types = []
        for exp in ctx.expr():
            args.append(exp.val)
            types.append(exp.type)
        ctx.val = self.jasmin.function_call(ctx.ID().getText(), args, types)

    def exitL_function_call(self, ctx: pyGramParser.L_function_callContext):
        ctx.type = ctx.function_call().type
        ctx.val = ctx.function_call().val

    def exitProg(self, ctx: pyGramParser.ProgContext):
        self.jasmin.close_file()

    def exitR_break(self, ctx: pyGramParser.R_breakContext):
        self.jasmin.break_loop(len(self.stack_block) - 1)
