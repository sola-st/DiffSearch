package research.diffsearch;

//Generated from Grammar.g4 by ANTLR 4.7.1
//Generated from Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
* This interface defines a complete listener for a parse tree produced by
* {@link GrammarParser}.
*/
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#diffsearch}.
	 * @param ctx the parse tree
	 */
	void enterDiffsearch(GrammarParser.DiffsearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#diffsearch}.
	 * @param ctx the parse tree
	 */
	void exitDiffsearch(GrammarParser.DiffsearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(GrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(GrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(GrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(GrammarParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(GrammarParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(GrammarParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#punctuator}.
	 * @param ctx the parse tree
	 */
	void enterPunctuator(GrammarParser.PunctuatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#punctuator}.
	 * @param ctx the parse tree
	 */
	void exitPunctuator(GrammarParser.PunctuatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(GrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(GrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
}