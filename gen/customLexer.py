from .pyGramLexer import pyGramLexer

class customLexer(pyGramLexer):
    ttype_map = ["<INVALID>", 'ASSIGNMENT', 'EQ', 'GT', 'LT', 'GE', 'LE', 'PLUS', 'MINUS', 'TIMES', 'DIVIDES', 'MODULUS', 'COMMA', 'COLON', 'OPEN', 'CLOSE', 'OR', 'AND', 'NOT', 'FOR',
    'IF', 'WHILE', 'IN', 'PRINT', 'RANGE', 'ID', 'NUM', 'TAB', 'NL', 'WS']

    grammarFileName = "myPython.g4"

    def getSymbolTable(self):
        tokens = self.getAllTokens()
        symbol_table = []
        for token in tokens:
            symbol_table.append((token.text, self.ttype_map[token.type]))

        return symbol_table
