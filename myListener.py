if __name__ is not None and "." in __name__:
    from gen.pyGramParser import pyGramParser
else:
    from gen.pyGramParser import pyGramParser
from gen.pyGramListener import pyGramListener

class myListener(pyGramListener):
    symbol_table = {'teste': 'integer'}
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
        ctx.type = ctx.expr().symbol.type

    def exitL_id(self, ctx:pyGramParser.L_idContext):
        ctx.type = self.symbol_table[ctx.ID().getText()]

    def exitL_int_value(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = 'integer'

    def exitL_float_value(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = 'float'

    def exitL_str_value(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = 'string'

    def exitL_bool_value(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = 'boolean'

    def exitL_input(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = 'string'

    def exitL_function_call(self, ctx:pyGramParser.L_int_valueContext):
        ctx.type = ctx.function_call().symbol.type