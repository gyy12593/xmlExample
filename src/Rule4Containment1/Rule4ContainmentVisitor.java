package Rule4Containment1;
// Generated from Rule4Containment.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Rule4ContainmentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Rule4ContainmentVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Rule4ContainmentParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Rule4ContainmentParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule4ContainmentParser#description4instances}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription4instances(Rule4ContainmentParser.Description4instancesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule4ContainmentParser#example4class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExample4class(Rule4ContainmentParser.Example4classContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule4ContainmentParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(Rule4ContainmentParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule4ContainmentParser#number4class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber4class(Rule4ContainmentParser.Number4classContext ctx);
}