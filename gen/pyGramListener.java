// Generated from C:/Users/gstvu/Documents/Compilador-Python\pyGram.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pyGramParser}.
 */
public interface pyGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pyGramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pyGramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pyGramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(pyGramParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(pyGramParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(pyGramParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(pyGramParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_type}
	 * labeled alternative in {@link pyGramParser#function}.
	 * @param ctx the parse tree
	 */
	void enterL_type(pyGramParser.L_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_type}
	 * labeled alternative in {@link pyGramParser#function}.
	 * @param ctx the parse tree
	 */
	void exitL_type(pyGramParser.L_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_void}
	 * labeled alternative in {@link pyGramParser#function}.
	 * @param ctx the parse tree
	 */
	void enterL_void(pyGramParser.L_voidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_void}
	 * labeled alternative in {@link pyGramParser#function}.
	 * @param ctx the parse tree
	 */
	void exitL_void(pyGramParser.L_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_return}.
	 * @param ctx the parse tree
	 */
	void enterR_return(pyGramParser.R_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_return}.
	 * @param ctx the parse tree
	 */
	void exitR_return(pyGramParser.R_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(pyGramParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(pyGramParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_for}.
	 * @param ctx the parse tree
	 */
	void enterR_for(pyGramParser.R_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_for}.
	 * @param ctx the parse tree
	 */
	void exitR_for(pyGramParser.R_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_while}.
	 * @param ctx the parse tree
	 */
	void enterR_while(pyGramParser.R_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_while}.
	 * @param ctx the parse tree
	 */
	void exitR_while(pyGramParser.R_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_break}.
	 * @param ctx the parse tree
	 */
	void enterR_break(pyGramParser.R_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_break}.
	 * @param ctx the parse tree
	 */
	void exitR_break(pyGramParser.R_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_if}.
	 * @param ctx the parse tree
	 */
	void enterR_if(pyGramParser.R_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_if}.
	 * @param ctx the parse tree
	 */
	void exitR_if(pyGramParser.R_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_else}.
	 * @param ctx the parse tree
	 */
	void enterR_else(pyGramParser.R_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_else}.
	 * @param ctx the parse tree
	 */
	void exitR_else(pyGramParser.R_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_print}.
	 * @param ctx the parse tree
	 */
	void enterR_print(pyGramParser.R_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_print}.
	 * @param ctx the parse tree
	 */
	void exitR_print(pyGramParser.R_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(pyGramParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(pyGramParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_assigment}
	 * labeled alternative in {@link pyGramParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterE_assigment(pyGramParser.E_assigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_assigment}
	 * labeled alternative in {@link pyGramParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitE_assigment(pyGramParser.E_assigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link pyGramParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterInput(pyGramParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link pyGramParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitInput(pyGramParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_logic}
	 * labeled alternative in {@link pyGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_logic(pyGramParser.Or_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_logic}
	 * labeled alternative in {@link pyGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_logic(pyGramParser.Or_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_term}
	 * labeled alternative in {@link pyGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterE_term(pyGramParser.E_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_term}
	 * labeled alternative in {@link pyGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitE_term(pyGramParser.E_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_logic}
	 * labeled alternative in {@link pyGramParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAnd_logic(pyGramParser.And_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_logic}
	 * labeled alternative in {@link pyGramParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAnd_logic(pyGramParser.And_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_term2}
	 * labeled alternative in {@link pyGramParser#term}.
	 * @param ctx the parse tree
	 */
	void enterE_term2(pyGramParser.E_term2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code e_term2}
	 * labeled alternative in {@link pyGramParser#term}.
	 * @param ctx the parse tree
	 */
	void exitE_term2(pyGramParser.E_term2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code comp_logic}
	 * labeled alternative in {@link pyGramParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterComp_logic(pyGramParser.Comp_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp_logic}
	 * labeled alternative in {@link pyGramParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitComp_logic(pyGramParser.Comp_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_term3}
	 * labeled alternative in {@link pyGramParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterE_term3(pyGramParser.E_term3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code e_term3}
	 * labeled alternative in {@link pyGramParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitE_term3(pyGramParser.E_term3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eq_logic}
	 * labeled alternative in {@link pyGramParser#term3}.
	 * @param ctx the parse tree
	 */
	void enterEq_logic(pyGramParser.Eq_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq_logic}
	 * labeled alternative in {@link pyGramParser#term3}.
	 * @param ctx the parse tree
	 */
	void exitEq_logic(pyGramParser.Eq_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_term4}
	 * labeled alternative in {@link pyGramParser#term3}.
	 * @param ctx the parse tree
	 */
	void enterE_term4(pyGramParser.E_term4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code e_term4}
	 * labeled alternative in {@link pyGramParser#term3}.
	 * @param ctx the parse tree
	 */
	void exitE_term4(pyGramParser.E_term4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sum_minus}
	 * labeled alternative in {@link pyGramParser#term4}.
	 * @param ctx the parse tree
	 */
	void enterSum_minus(pyGramParser.Sum_minusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum_minus}
	 * labeled alternative in {@link pyGramParser#term4}.
	 * @param ctx the parse tree
	 */
	void exitSum_minus(pyGramParser.Sum_minusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_term5}
	 * labeled alternative in {@link pyGramParser#term4}.
	 * @param ctx the parse tree
	 */
	void enterE_term5(pyGramParser.E_term5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code e_term5}
	 * labeled alternative in {@link pyGramParser#term4}.
	 * @param ctx the parse tree
	 */
	void exitE_term5(pyGramParser.E_term5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code e_term6}
	 * labeled alternative in {@link pyGramParser#term5}.
	 * @param ctx the parse tree
	 */
	void enterE_term6(pyGramParser.E_term6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code e_term6}
	 * labeled alternative in {@link pyGramParser#term5}.
	 * @param ctx the parse tree
	 */
	void exitE_term6(pyGramParser.E_term6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code time_div}
	 * labeled alternative in {@link pyGramParser#term5}.
	 * @param ctx the parse tree
	 */
	void enterTime_div(pyGramParser.Time_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code time_div}
	 * labeled alternative in {@link pyGramParser#term5}.
	 * @param ctx the parse tree
	 */
	void exitTime_div(pyGramParser.Time_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus_not}
	 * labeled alternative in {@link pyGramParser#term6}.
	 * @param ctx the parse tree
	 */
	void enterMinus_not(pyGramParser.Minus_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus_not}
	 * labeled alternative in {@link pyGramParser#term6}.
	 * @param ctx the parse tree
	 */
	void exitMinus_not(pyGramParser.Minus_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_factor}
	 * labeled alternative in {@link pyGramParser#term6}.
	 * @param ctx the parse tree
	 */
	void enterE_factor(pyGramParser.E_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_factor}
	 * labeled alternative in {@link pyGramParser#term6}.
	 * @param ctx the parse tree
	 */
	void exitE_factor(pyGramParser.E_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_expr}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_expr(pyGramParser.L_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_expr}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_expr(pyGramParser.L_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_id}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_id(pyGramParser.L_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_id}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_id(pyGramParser.L_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_int_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_int_value(pyGramParser.L_int_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_int_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_int_value(pyGramParser.L_int_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_float_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_float_value(pyGramParser.L_float_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_float_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_float_value(pyGramParser.L_float_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_str_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_str_value(pyGramParser.L_str_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_str_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_str_value(pyGramParser.L_str_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_bool_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_bool_value(pyGramParser.L_bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_bool_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_bool_value(pyGramParser.L_bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l_function_call}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterL_function_call(pyGramParser.L_function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l_function_call}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitL_function_call(pyGramParser.L_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyGramParser#r_input}.
	 * @param ctx the parse tree
	 */
	void enterR_input(pyGramParser.R_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyGramParser#r_input}.
	 * @param ctx the parse tree
	 */
	void exitR_input(pyGramParser.R_inputContext ctx);
}