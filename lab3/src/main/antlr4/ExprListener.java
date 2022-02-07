// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ExprParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ExprParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ExprParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ExprParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tab_scope_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterTab_scope_wrapper(ExprParser.Tab_scope_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tab_scope_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitTab_scope_wrapper(ExprParser.Tab_scope_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tab_scope}.
	 * @param ctx the parse tree
	 */
	void enterTab_scope(ExprParser.Tab_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tab_scope}.
	 * @param ctx the parse tree
	 */
	void exitTab_scope(ExprParser.Tab_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tab_tab_scope_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterTab_tab_scope_wrapper(ExprParser.Tab_tab_scope_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tab_tab_scope_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitTab_tab_scope_wrapper(ExprParser.Tab_tab_scope_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tab_tab_scope}.
	 * @param ctx the parse tree
	 */
	void enterTab_tab_scope(ExprParser.Tab_tab_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tab_tab_scope}.
	 * @param ctx the parse tree
	 */
	void exitTab_tab_scope(ExprParser.Tab_tab_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#simple_operations}.
	 * @param ctx the parse tree
	 */
	void enterSimple_operations(ExprParser.Simple_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#simple_operations}.
	 * @param ctx the parse tree
	 */
	void exitSimple_operations(ExprParser.Simple_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(ExprParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(ExprParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment_operand}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operand(ExprParser.Assignment_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment_operand}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operand(ExprParser.Assignment_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(ExprParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(ExprParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(ExprParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(ExprParser.Unary_operatorContext ctx);
}