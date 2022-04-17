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


    # Visit a parse tree produced by pyGramParser#l_type.
    def visitL_type(self, ctx:pyGramParser.L_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_void.
    def visitL_void(self, ctx:pyGramParser.L_voidContext):
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


    # Visit a parse tree produced by pyGramParser#or_logic.
    def visitOr_logic(self, ctx:pyGramParser.Or_logicContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_term.
    def visitE_term(self, ctx:pyGramParser.E_termContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#and_logic.
    def visitAnd_logic(self, ctx:pyGramParser.And_logicContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_term2.
    def visitE_term2(self, ctx:pyGramParser.E_term2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#comp_logic.
    def visitComp_logic(self, ctx:pyGramParser.Comp_logicContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_term3.
    def visitE_term3(self, ctx:pyGramParser.E_term3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#eq_logic.
    def visitEq_logic(self, ctx:pyGramParser.Eq_logicContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_term4.
    def visitE_term4(self, ctx:pyGramParser.E_term4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#sum_minus.
    def visitSum_minus(self, ctx:pyGramParser.Sum_minusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_term5.
    def visitE_term5(self, ctx:pyGramParser.E_term5Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_term6.
    def visitE_term6(self, ctx:pyGramParser.E_term6Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#time_div.
    def visitTime_div(self, ctx:pyGramParser.Time_divContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#minus_not.
    def visitMinus_not(self, ctx:pyGramParser.Minus_notContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#e_factor.
    def visitE_factor(self, ctx:pyGramParser.E_factorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_expr.
    def visitL_expr(self, ctx:pyGramParser.L_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_id.
    def visitL_id(self, ctx:pyGramParser.L_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_int_value.
    def visitL_int_value(self, ctx:pyGramParser.L_int_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_float_value.
    def visitL_float_value(self, ctx:pyGramParser.L_float_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_str_value.
    def visitL_str_value(self, ctx:pyGramParser.L_str_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_bool_value.
    def visitL_bool_value(self, ctx:pyGramParser.L_bool_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_input.
    def visitL_input(self, ctx:pyGramParser.L_inputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#l_function_call.
    def visitL_function_call(self, ctx:pyGramParser.L_function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyGramParser#r_input.
    def visitR_input(self, ctx:pyGramParser.R_inputContext):
        return self.visitChildren(ctx)



del pyGramParser