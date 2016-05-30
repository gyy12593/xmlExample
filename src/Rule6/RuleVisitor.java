package Rule6;
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
	 * Visit a parse tree produced by the {@code printAssociationAtt}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAssociationAtt(RuleParser.PrintAssociationAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#attAndTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttAndTypeName(RuleParser.AttAndTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#classN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassN(RuleParser.ClassNContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(RuleParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#isList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsList(RuleParser.IsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(RuleParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#chooseD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseD(RuleParser.ChooseDContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationship(RuleParser.RelationshipContext ctx);
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
	 * Visit a parse tree produced by {@link RuleParser#limitedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitedInteger(RuleParser.LimitedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#integerScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerScope(RuleParser.IntegerScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#character4Start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter4Start(RuleParser.Character4StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#character4End}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter4End(RuleParser.Character4EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#startNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartNumber(RuleParser.StartNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#endNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndNumber(RuleParser.EndNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp(RuleParser.IpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#range4Ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange4Ip(RuleParser.Range4IpContext ctx);
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
	 * Visit a parse tree produced by {@link RuleParser#value4Attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue4Attribute(RuleParser.Value4AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link RuleParser#express4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(RuleParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(RuleParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#zero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero(RuleParser.ZeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(RuleParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#numberBelow255}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBelow255(RuleParser.NumberBelow255Context ctx);
	/**
	 * Visit a parse tree produced by {@link RuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(RuleParser.NumberContext ctx);
}