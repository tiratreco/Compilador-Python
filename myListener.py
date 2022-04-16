if __name__ is not None and "." in __name__:
    from gen.pyGramParser import pyGramParser
else:
    from gen.pyGramParser import pyGramParser
from gen.pyGramListener import pyGramListener

class myListener(pyGramListener):
    symbol_table = {}
    def exitDeclaration(self, ctx:pyGramParser.DeclarationContext):
        ctx_type = ctx.TYPE().getText() if ctx.TYPE().getText() != 'int' else 'integer'

        for token in ctx.getTokens(pyGramParser.ID):
            self.symbol_table[token.getText()] = ctx_type
