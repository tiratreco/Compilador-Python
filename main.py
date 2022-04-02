from antlr4 import *

from gen.customLexer import customLexer

if __name__ == '__main__':
    program = ""
    with open('input.py') as file:
        for line in file:
            program += line

    data = InputStream(program)
    # Lexer
    lexer = customLexer(data)
    stream = CommonTokenStream(lexer)
    symbol_table = lexer.getSymbolTable()

    max_len = 5
    for token, _ in symbol_table:
        max_len = max(max_len, len(token))

    str_out = "Token{}|Tipo\n".format(' '*(max_len-5))
    for token, type in symbol_table:
        str_out += "{}{}|{}\n".format(token, ' '*(max_len-len(token)), type)

    with open('output.txt', 'w') as file:
        file.write(str_out)
