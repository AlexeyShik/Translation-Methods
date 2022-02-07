// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parser_rules}.
	 * @param ctx the parse tree
	 */
	void enterParser_rules(GrammarParser.Parser_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parser_rules}.
	 * @param ctx the parse tree
	 */
	void exitParser_rules(GrammarParser.Parser_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(GrammarParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(GrammarParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexer_rules}.
	 * @param ctx the parse tree
	 */
	void enterLexer_rules(GrammarParser.Lexer_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexer_rules}.
	 * @param ctx the parse tree
	 */
	void exitLexer_rules(GrammarParser.Lexer_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#right_part_parser}.
	 * @param ctx the parse tree
	 */
	void enterRight_part_parser(GrammarParser.Right_part_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#right_part_parser}.
	 * @param ctx the parse tree
	 */
	void exitRight_part_parser(GrammarParser.Right_part_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#right_part_lexer}.
	 * @param ctx the parse tree
	 */
	void enterRight_part_lexer(GrammarParser.Right_part_lexerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#right_part_lexer}.
	 * @param ctx the parse tree
	 */
	void exitRight_part_lexer(GrammarParser.Right_part_lexerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#field_declarations}.
	 * @param ctx the parse tree
	 */
	void enterField_declarations(GrammarParser.Field_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#field_declarations}.
	 * @param ctx the parse tree
	 */
	void exitField_declarations(GrammarParser.Field_declarationsContext ctx);
}