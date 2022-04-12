# Generated from C:/Users/panto/Documents/Repositórios/Compilador-Python\pyGram.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .pyGramParser import pyGramParser
else:
    from pyGramParser import pyGramParser

# This class defines a complete generic visitor for a parse tree produced by pyGramParser.

class pyGramVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by pyGramParser#prog.
    def visitProg(self, ctx:pyGramParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#main.
    def visitMain(self, ctx:pyGramParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#local.
    def visitLocal(self, ctx:pyGramParser.LocalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#function.
    def visitFunction(self, ctx:pyGramParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_return.
    def visitR_return(self, ctx:pyGramParser.R_returnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#function_call.
    def visitFunction_call(self, ctx:pyGramParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_for.
    def visitR_for(self, ctx:pyGramParser.R_forContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_while.
    def visitR_while(self, ctx:pyGramParser.R_whileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_break.
    def visitR_break(self, ctx:pyGramParser.R_breakContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_if.
    def visitR_if(self, ctx:pyGramParser.R_ifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_else.
    def visitR_else(self, ctx:pyGramParser.R_elseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_print.
    def visitR_print(self, ctx:pyGramParser.R_printContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#declaration.
    def visitDeclaration(self, ctx:pyGramParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#assigment.
    def visitAssigment(self, ctx:pyGramParser.AssigmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#expr.
    def visitExpr(self, ctx:pyGramParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term.
    def visitTerm(self, ctx:pyGramParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term2.
    def visitTerm2(self, ctx:pyGramParser.Term2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term3.
    def visitTerm3(self, ctx:pyGramParser.Term3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term4.
    def visitTerm4(self, ctx:pyGramParser.Term4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term5.
    def visitTerm5(self, ctx:pyGramParser.Term5Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term6.
    def visitTerm6(self, ctx:pyGramParser.Term6Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#term7.
    def visitTerm7(self, ctx:pyGramParser.Term7Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#factor.
    def visitFactor(self, ctx:pyGramParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_input.
    def visitR_input(self, ctx:pyGramParser.R_inputContext):
        return self.visitChildren(ctx)



del pyGramParser