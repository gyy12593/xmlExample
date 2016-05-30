package Rule4Containment2;
// Generated from Rule4Containment.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Rule4ContainmentParser}.
 */
public interface Rule4ContainmentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Rule4ContainmentParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Rule4ContainmentParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule4ContainmentParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Rule4ContainmentParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule4ContainmentParser#description4instances}.
	 * @param ctx the parse tree
	 */
	void enterDescription4instances(Rule4ContainmentParser.Description4instancesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule4ContainmentParser#description4instances}.
	 * @param ctx the parse tree
	 */
	void exitDescription4instances(Rule4ContainmentParser.Description4instancesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4special}
	 * labeled alternative in {@link Rule4ContainmentParser#example4class}.
	 * @param ctx the parse tree
	 */
	void enterProcess4special(Rule4ContainmentParser.Process4specialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4special}
	 * labeled alternative in {@link Rule4ContainmentParser#example4class}.
	 * @param ctx the parse tree
	 */
	void exitProcess4special(Rule4ContainmentParser.Process4specialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4simple}
	 * labeled alternative in {@link Rule4ContainmentParser#example4class}.
	 * @param ctx the parse tree
	 */
	void enterProcess4simple(Rule4ContainmentParser.Process4simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4simple}
	 * labeled alternative in {@link Rule4ContainmentParser#example4class}.
	 * @param ctx the parse tree
	 */
	void exitProcess4simple(Rule4ContainmentParser.Process4simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule4ContainmentParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(Rule4ContainmentParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule4ContainmentParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(Rule4ContainmentParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule4ContainmentParser#number4class}.
	 * @param ctx the parse tree
	 */
	void enterNumber4class(Rule4ContainmentParser.Number4classContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule4ContainmentParser#number4class}.
	 * @param ctx the parse tree
	 */
	void exitNumber4class(Rule4ContainmentParser.Number4classContext ctx);
}