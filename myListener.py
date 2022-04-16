if __name__ is not None and "." in __name__:
    from gen.pyGramParser import pyGramParser
else:
    from gen.pyGramParser import pyGramParser
from gen.pyGramListener import pyGramListener

class myListener(pyGramListener):
    symbol_table = {}


    def __isNumeric(self, type):
        return (type == 'float') or (type == 'int')


    def exitDeclaration(self, ctx:pyGramParser.DeclarationContext):
        ctx_type = ctx.TYPE().getText() if ctx.TYPE().getText() != 'int' else 'integer'

        for token in ctx.getTokens(pyGramParser.ID):
            self.symbol_table[token.getText()] = ctx_type

    def exitL_type(self, ctx:pyGramParser.L_typeContext):
        ctx_type = ctx.TYPE().getText() if ctx.TYPE().getText() != 'int' else 'integer'
        self.symbol_table[ctx.ID().getText()] = ctx_type

    def exitL_void(self, ctx:pyGramParser.L_typeContext):
        self.symbol_table[ctx.ID().getText()] = 'NoneType'

    def exitFunction_call(self, ctx:pyGramParser.Function_callContext):
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
            ctx.type = 'TypeError'
            return
        ctx.type = 'boolean'

    def exitAnd_logic(self, ctx: pyGramParser.Or_logicContext):
        if (ctx.children[0].type != 'boolean' or ctx.children[2].type != 'boolean'):
            ctx.type = 'TypeError'
            return
        ctx.type = 'boolean'

    def exitComp_logic(self, ctx: pyGramParser.Comp_logicContext):
        if (ctx.children[0].type == 'TypeError' or ctx.children[2].type == 'TypeError'):
            ctx.type = 'TypeError'
            return
        ctx.type = 'boolean'

    def exitEq_logic(self, ctx: pyGramParser.Eq_logicContext):
        if (ctx.children[0].type == 'TypeError' or ctx.children[2].type == 'TypeError'):
            ctx.type = 'TypeError'
            return
        ctx.type = 'boolean'

    def exitSum_minus(self, ctx: pyGramParser.Sum_minusContext):
        if self.__isNumeric(ctx.children[0]) and self.__isNumeric(ctx.children[2]):
            ctx.type = 'boolean'
            return
        ctx.type = 'TypeError'

    def exitTime_div(self, ctx:pyGramParser.Time_divContext):
        if self.__isNumeric(ctx.children[0]) and self.__isNumeric(ctx.children[2]):
            ctx.type = 'boolean'
            return
        ctx.type = 'TypeError'

    def exitMinus_not(self, ctx:pyGramParser.Minus_notContext):
        if self.__isNumeric(ctx.children[0]) and self.__isNumeric(ctx.children[2]):
            ctx.type = 'boolean'
            return
        ctx.type = 'TypeError'

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
