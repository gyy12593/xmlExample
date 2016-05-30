package Rule1;
// Generated from Rule.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RuleParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printDate}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintDate(RuleParser.PrintDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printIP}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintIP(RuleParser.PrintIPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(RuleParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printEnum}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintEnum(RuleParser.PrintEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printAttribute}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAttribute(RuleParser.PrintAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInteger}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInteger(RuleParser.PrintIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printValue}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintValue(RuleParser.PrintValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#attAndTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttAndTypeName(RuleParser.AttAndTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(RuleParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(RuleParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4Id1}
	 * labeled alternative in {@link RuleParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4Id1(RuleParser.Process4Id1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code process4Id2}
	 * labeled alternative in {@link RuleParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4Id2(RuleParser.Process4Id2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ChooseDigit}
	 * labeled alternative in {@link RuleParser#chooseD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseDigit(RuleParser.ChooseDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4relationship}
	 * labeled alternative in {@link RuleParser#relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4relationship(RuleParser.Process4relationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(RuleParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(RuleParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4limitedInteger1}
	 * labeled alternative in {@link RuleParser#limitedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4limitedInteger1(RuleParser.Process4limitedInteger1Context ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#number4Integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber4Integer(RuleParser.Number4IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4Ip}
	 * labeled alternative in {@link RuleParser#ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4Ip(RuleParser.Process4IpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4Range4Ip}
	 * labeled alternative in {@link RuleParser#range4Ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4Range4Ip(RuleParser.Process4Range4IpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#number4Ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber4Ip(RuleParser.Number4IpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#startIp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartIp(RuleParser.StartIpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#endIp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndIp(RuleParser.EndIpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4value4Attribute}
	 * labeled alternative in {@link RuleParser#value4Attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4value4Attribute(RuleParser.Process4value4AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code process4values}
	 * labeled alternative in {@link RuleParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess4values(RuleParser.Process4valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RuleParser.ValueContext ctx);
}