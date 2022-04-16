if __name__ is not None and "." in __name__:
    from gen.pyGramParser import pyGramParser
else:
    from gen.pyGramParser import pyGramParser
from gen.pyGramListener import pyGramListener
from SematicErrors import *

class myListener(pyGramListener):
    symbol_table = {}
    functions_args = {}
    stack_block = []

    def __isNumeric(self, type):
        return (type == 'float') or (type == 'int')

    def enterFunction_call(self, ctx:pyGramParser.Function_callContext):
        self.stack_block.append('function')

    def enterR_for(self, ctx:pyGramParser.R_forContext):
        self.stack_block.append('loop')

    def enterR_while(self, ctx:pyGramParser.R_whileContext):
        self.stack_block.append('loop')

    def enterR_return(self, ctx: pyGramParser.R_returnContext):
        if not 'function' in self.stack_block:
            raise ReturnException()

    def enterR_break(self, ctx:pyGramParser.R_breakContext):
        if self.stack_block[len(self.stack_block)] != 'loop':
            raise BreakException()

    def exitR_for(self, ctx:pyGramParser.R_forContext):
        self.stack_block.pop()

    def exitR_while(self, ctx:pyGramParser.R_whileContext):
        self.stack_block.pop()

    def exitDeclaration(self, ctx:pyGramParser.DeclarationContext):
        ctx_type = ctx.TYPE().getText() if ctx.TYPE().getText() != 'int' else 'integer'

        for token in ctx.getTokens(pyGramParser.ID):
            self.symbol_table[token.getText()] = ctx_type

    def exitL_type(self, ctx:pyGramParser.L_typeContext):
        ctx_type = ctx.TYPE(0).getText() if ctx.TYPE(0).getText() != 'int' else 'integer'
        function_id = ctx.ID(0).getText()
        self.symbol_table[function_id] = ctx_type

        args = []
        for token_type in ctx.getTokens(pyGramParser.TYPE)[1:]:
            arg_type = token_type.getText() if token_type.getText() != 'int' else 'integer'
            args.append(arg_type)

        self.functions_args[function_id] = args

    def exitL_void(self, ctx:pyGramParser.L_voidContext):
        function_id = ctx.ID(0).getText()
        self.symbol_table[function_id] = 'NoneType'

        args = []
        for token_type in ctx.getTokens(pyGramParser.TYPE):
            arg_type = token_type.getText() if token_type.getText() != 'int' else 'integer'
            args.append(arg_type)

        self.functions_args[function_id] = args

    def exitFunction_call(self, ctx:pyGramParser.Function_callContext):
        function_id = ctx.ID().getText()
        self.stack_block.pop()

        if len(self.functions_args[function_id]) != len(ctx.expr()):
            ctx.type = 'TypeError'
            return

        for expected, recieved in list(zip(self.functions_args[function_id], ctx.expr())):
            if expected != recieved.type:
                ctx.type = 'TypeError'
                return

        ctx.type = self.symbol_table[ctx.ID().getText()]

    def exitL_expr(self, ctx:pyGramParser.L_exprContext):
        ctx.type = ctx.expr().type

    def exitL_id(self, ctx:pyGramParser.L_idContext):
        ctx.type = self.symbol_table[ctx.ID().getText()]

    def exitL_int_value(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = 'integer'

    def exitL_float_value(self, ctx:pyGramParser.L_float_valueContext):
        ctx.type = 'float'

    def exitL_str_value(self, ctx:pyGramParser.L_str_valueContext):
        ctx.type = 'string'

    def exitL_bool_value(self, ctx:pyGramParser.L_bool_valueContext):
        ctx.type = 'boolean'

    def exitL_input(self, ctx:pyGramParser.L_inputContext):
        ctx.type = 'string'

    def exitL_function_call(self, ctx:pyGramParser.L_function_callContext):
        ctx.type = ctx.function_call().type

    def exitOr_logic(self, ctx: pyGramParser.Or_logicContext):
        if (ctx.children[0].type != 'boolean' or ctx.children[2].type != 'boolean'):
            raise ExprTypeError(ctx.children[0].type, ctx.children[2].type, ctx.children[1].symbol.text)
            return
        ctx.type = 'boolean'

    def exitAnd_logic(self, ctx: pyGramParser.Or_logicContext):
        if (ctx.children[0].type != 'boolean' or ctx.children[2].type != 'boolean'):
            raise ExprTypeError(ctx.children[0].type, ctx.children[2].type, ctx.children[1].symbol.text)
            return
        ctx.type = 'boolean'

    def exitComp_logic(self, ctx: pyGramParser.Comp_logicContext):
        ctx.type = 'boolean'

    def exitEq_logic(self, ctx: pyGramParser.Eq_logicContext):
        ctx.type = 'boolean'

    def exitSum_minus(self, ctx: pyGramParser.Sum_minusContext):
        if self.__isNumeric(ctx.children[0].type) and self.__isNumeric(ctx.children[2].type):
            if ctx.children[0].type == 'float' or ctx.children[2].type == 'float':
                ctx.type = 'float'
            else:
                ctx.type = 'int'
            return
        raise ExprTypeError(ctx.children[0].type, ctx.children[2].type, ctx.children[1].symbol.text)

    def exitTime_div(self, ctx:pyGramParser.Time_divContext):
        if self.__isNumeric(ctx.children[0].type) and self.__isNumeric(ctx.children[2].type):
            if ctx.children[0].type == 'float' or ctx.children[2].type == 'float':
                ctx.type = 'float'
            else:
                ctx.type = 'int'
            return
        raise ExprTypeError(ctx.children[0].type, ctx.children[2].type, ctx.children[1].symbol.text)

    def exitMinus_not(self, ctx:pyGramParser.Minus_notContext):
        if ctx.children[0].symbol.text == '-': #minus
            if (self.__isNumeric(ctx.children[1].type)):
                ctx.type = ctx.children[1].type
                return
            raise ExprTypeError(ctx.children[1].type, ctx.children[0].symbol.text)
        elif ctx.children[0].symbol.text == 'not': #not
            if (ctx.children[1].type == 'boolean'):
                ctx.type = 'boolean'
                return
            raise ExprTypeError(ctx.children[1].type, ctx.children[0].symbol.text)

    def exitE_term(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term().type

    def exitE_term2(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term2().type

    def exitE_term3(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term3().type

    def exitE_term4(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term4().type

    def exitE_term5(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term5().type

    def exitE_term6(self, ctx: pyGramParser.E_termContext):
        ctx.type = ctx.term6().type

    def exitE_factor(self, ctx:pyGramParser.E_factorContext):
        ctx.type = ctx.factor().type
