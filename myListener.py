if __name__ is not None and "." in __name__:
    from gen.pyGramParser import pyGramParser
else:
    from gen.pyGramParser import pyGramParser
from SematicErrors import *
from gen.pyGramListener import pyGramListener


class myListener(pyGramListener):
    symbol_table = {}
    functions_args = {}
    stack_block = []

    def __isNumeric(self, type):
        return (type == 'float') or (type == 'int')

    def __isInsideFunction(self):
        return 'function' in self.stack_block

    def enterL_type(self, ctx: pyGramParser.L_typeContext):
        self.stack_block.append('function')
        function_id = ctx.ID(0).getText()
        if function_id in self.symbol_table:
            raise AlreadyDeclaredError(function_id)

        self.symbol_table[function_id] = ctx.TYPE(0).getText()

        args = []
        for arg_id, arg_type in list(zip(ctx.ID()[1:], ctx.TYPE()[1:])):
            if arg_id.getText() in self.symbol_table:
                raise AlreadyDeclaredError(arg_id.getText())
            self.symbol_table[arg_id.getText()] = arg_type.getText()
            args.append(arg_type.getText())

        self.functions_args[function_id] = args

    def enterL_void(self, ctx: pyGramParser.L_voidContext):
        self.stack_block.append('function')
        function_id = ctx.ID(0).getText()
        self.symbol_table[function_id] = 'NoneType'

        args = []
        for arg_id, arg_type in list(zip(ctx.ID()[1:], ctx.TYPE())):
            self.symbol_table[arg_id.getText()] = arg_type.getText()
            args.append(arg_type.getText())

        self.functions_args[function_id] = args

    def enterR_return(self, ctx: pyGramParser.R_returnContext):
        if not self.__isInsideFunction():
            raise ReturnException()

    def enterFunction_call(self, ctx: pyGramParser.Function_callContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table.keys():
            raise UndeclaredVariable(ctx_id)

    def enterR_for(self, ctx: pyGramParser.R_forContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table.keys():
            raise UndeclaredVariable(ctx_id)

        if not self.__isNumeric(self.symbol_table[ctx_id]):
            raise UnexpectedTypeError('int', self.symbol_table[ctx_id])

        self.stack_block.append('loop')

    def enterR_while(self, ctx: pyGramParser.R_whileContext):
        self.stack_block.append('loop')

    def enterR_break(self, ctx: pyGramParser.R_breakContext):
        if 'loop' not in self.stack_block:
            raise BreakException()

    def exitR_if(self, ctx: pyGramParser.R_ifContext):
        if ctx.expr().type != 'boolean':
            raise UnexpectedTypeError('boolean', ctx.expr().type)

    def exitL_type(self, ctx: pyGramParser.L_typeContext):
        self.stack_block.pop()

        for arg_id in ctx.ID()[1:]:
            del self.symbol_table[arg_id.getText()]

    def exitL_void(self, ctx: pyGramParser.L_voidContext):
        self.stack_block.pop()

        for arg_id in ctx.ID()[1:]:
            del self.symbol_table[arg_id.getText()]

    def exitFunction_call(self, ctx: pyGramParser.Function_callContext):
        function_id = ctx.ID().getText()

        if len(self.functions_args[function_id]) != len(ctx.expr()):
            raise MissingArgument(len(self.functions_args[function_id]), len(ctx.expr()))

        for expected, recieved in list(zip(self.functions_args[function_id], ctx.expr())):
            if expected != recieved.type:
                raise UnexpectedTypeError(expected, recieved.type)

        ctx.type = self.symbol_table[ctx.ID().getText()]

    def exitR_for(self, ctx: pyGramParser.R_forContext):
        self.stack_block.pop()

    def exitR_while(self, ctx: pyGramParser.R_whileContext):
        if ctx.expr().type != 'boolean':
            raise UnexpectedTypeError('boolean', ctx.expr().type)
        self.stack_block.pop()

    def exitDeclaration(self, ctx: pyGramParser.DeclarationContext):
        for token in ctx.ID():
            if token.getText() in self.symbol_table:
                raise AlreadyDeclaredError(token.getText())
            self.symbol_table[token.getText()] = ctx.TYPE().getText()

    def exitE_assigment(self, ctx: pyGramParser.E_assigmentContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table.keys():
            raise UndeclaredVariable(ctx_id)

        expected = self.symbol_table[ctx_id]
        recieved = ctx.expr().type
        if expected != recieved:
            raise UnexpectedTypeError(expected, recieved)

    def exitInput(self, ctx: pyGramParser.InputContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table.keys():
            raise UndeclaredVariable(ctx_id)

    def exitOr_logic(self, ctx: pyGramParser.Or_logicContext):
        if ctx.expr().type != 'boolean':
            raise ExprTypeError(ctx.expr().type, ctx.op.text)
        elif ctx.term().type != 'boolean':
            raise ExprTypeError(ctx.term().type, ctx.op.text)
        else:
            ctx.type = 'boolean'

    def exitE_term(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term().type

    def exitAnd_logic(self, ctx: pyGramParser.Or_logicContext):
        if ctx.term().type != 'boolean':
            raise ExprTypeError(ctx.term().type, ctx.op.text)
        elif ctx.term2().type != 'boolean':
            raise ExprTypeError(ctx.term2().type, ctx.op.text)
        else:
            ctx.type = 'boolean'

    def exitE_term2(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term2().type

    def exitComp_logic(self, ctx: pyGramParser.Comp_logicContext):
        if ctx.term2().type != ctx.term3().type:
            raise ExprTypeError(ctx.term2().type, ctx.term3().type, ctx.op.text)
        ctx.type = 'boolean'

    def exitE_term3(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term3().type

    def exitEq_logic(self, ctx: pyGramParser.Eq_logicContext):
        if ctx.term3().type != ctx.term4().type:
            raise ExprTypeError(ctx.term3().type, ctx.term4().type, ctx.op.text)
        ctx.type = 'boolean'

    def exitE_term4(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term4().type

    def exitSum_minus(self, ctx: pyGramParser.Sum_minusContext):
        if not self.__isNumeric(ctx.term4().type):
            raise ExprTypeError(ctx.term4().type, ctx.op.text)
        elif not self.__isNumeric(ctx.term5().type):
            raise ExprTypeError(ctx.term5().type, ctx.op.text)
        else:
            if ctx.term4().type == 'float' or ctx.term5().type == 'float':
                ctx.type = 'float'
            else:
                ctx.type = 'int'

    def exitE_term5(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term5().type

    def exitTime_div(self, ctx: pyGramParser.Time_divContext):
        if not self.__isNumeric(ctx.term5().type):
            raise ExprTypeError(ctx.term5().type, ctx.op.text)
        if not self.__isNumeric(ctx.term6().type):
            raise ExprTypeError(ctx.term6().type, ctx.op.text)
        else:
            if self.__isNumeric(ctx.term5().type) and self.__isNumeric(ctx.term6().type):
                if ctx.term5().type == 'float' or ctx.term6().type == 'float':
                    ctx.type = 'float'
                else:
                    ctx.type = 'int'

    def exitE_term6(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term6().type

    def exitMinus_not(self, ctx: pyGramParser.Minus_notContext):
        if ctx.op.text == '-':  # minus
            if self.__isNumeric(ctx.term6().type):
                ctx.type = ctx.term6().type
            else:
                raise ExprTypeError(ctx.term6().type, ctx.op.text)
        elif ctx.op.text == 'not':  # not
            if ctx.term6().type == 'boolean':
                ctx.type = 'boolean'
            else:
                raise ExprTypeError(ctx.term6().type, ctx.op.text)

    def exitE_factor(self, ctx: pyGramParser.E_factorContext):
        ctx.type = ctx.factor().type

    def exitL_expr(self, ctx: pyGramParser.L_exprContext):
        ctx.type = ctx.expr().type

    def exitL_id(self, ctx: pyGramParser.L_idContext):
        ctx_id = ctx.ID().getText()
        if ctx_id not in self.symbol_table.keys():
            raise UndeclaredVariable(ctx_id)
        ctx.type = self.symbol_table[ctx_id]

    def exitL_int_value(self, ctx: pyGramParser.L_int_valueContext):
        ctx.type = 'int'

    def exitL_float_value(self, ctx: pyGramParser.L_float_valueContext):
        ctx.type = 'float'

    def exitL_str_value(self, ctx: pyGramParser.L_str_valueContext):
        ctx.type = 'string'

    def exitL_bool_value(self, ctx: pyGramParser.L_bool_valueContext):
        ctx.type = 'boolean'

    def exitL_function_call(self, ctx: pyGramParser.L_function_callContext):
        ctx.type = ctx.function_call().type
