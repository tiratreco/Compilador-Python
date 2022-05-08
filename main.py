import os

from antlr4 import *

from gen.pyGramLexer import pyGramLexer
from gen.pyGramParser import pyGramParser
from myListener import myListener

if __name__ == '__main__':
    fileName = 'input'
    data = FileStream(fileName + ".py")

    # Lexer
    lexer = pyGramLexer(data)
    stream = CommonTokenStream(lexer)

    # Parser
    parser = pyGramParser(stream)
    tree = parser.prog()

    # Walker using listener
    l = myListener(fileName)
    walker = ParseTreeWalker()
    walker.walk(l, tree)

    # Autoexecute
    os.system('java -jar jasmin.jar {}'.format(fileName + '.j'))
    os.system('java {}'.format(fileName))
