// Generated from C:/Users/gstvu/Documents/Compilador-Python\pyGram.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pyGramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pyGramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pyGramParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(pyGramParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(pyGramParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(pyGramParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_type}
	 * labeled alternative in {@link pyGramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_type(pyGramParser.L_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_void}
	 * labeled alternative in {@link pyGramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_void(pyGramParser.L_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_return(pyGramParser.R_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(pyGramParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_for(pyGramParser.R_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_while(pyGramParser.R_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_break(pyGramParser.R_breakContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_if(pyGramParser.R_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_else(pyGramParser.R_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_print(pyGramParser.R_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(pyGramParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_assigment}
	 * labeled alternative in {@link pyGramParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_assigment(pyGramParser.E_assigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link pyGramParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(pyGramParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_logic}
	 * labeled alternative in {@link pyGramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_logic(pyGramParser.Or_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_term}
	 * labeled alternative in {@link pyGramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_term(pyGramParser.E_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_logic}
	 * labeled alternative in {@link pyGramParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_logic(pyGramParser.And_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_term2}
	 * labeled alternative in {@link pyGramParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_term2(pyGramParser.E_term2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code comp_logic}
	 * labeled alternative in {@link pyGramParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_logic(pyGramParser.Comp_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_term3}
	 * labeled alternative in {@link pyGramParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_term3(pyGramParser.E_term3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code eq_logic}
	 * labeled alternative in {@link pyGramParser#term3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_logic(pyGramParser.Eq_logicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_term4}
	 * labeled alternative in {@link pyGramParser#term3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_term4(pyGramParser.E_term4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code sum_minus}
	 * labeled alternative in {@link pyGramParser#term4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_minus(pyGramParser.Sum_minusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_term5}
	 * labeled alternative in {@link pyGramParser#term4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_term5(pyGramParser.E_term5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code e_term6}
	 * labeled alternative in {@link pyGramParser#term5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_term6(pyGramParser.E_term6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code time_div}
	 * labeled alternative in {@link pyGramParser#term5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_div(pyGramParser.Time_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus_not}
	 * labeled alternative in {@link pyGramParser#term6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_not(pyGramParser.Minus_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_factor}
	 * labeled alternative in {@link pyGramParser#term6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_factor(pyGramParser.E_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_expr}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_expr(pyGramParser.L_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_function_call}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_function_call(pyGramParser.L_function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_id}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_id(pyGramParser.L_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_int_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_int_value(pyGramParser.L_int_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_float_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_float_value(pyGramParser.L_float_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_str_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_str_value(pyGramParser.L_str_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l_bool_value}
	 * labeled alternative in {@link pyGramParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_bool_value(pyGramParser.L_bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyGramParser#r_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_input(pyGramParser.R_inputContext ctx);
}