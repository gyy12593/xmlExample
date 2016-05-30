package Rule5;
// Generated from Rule.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RuleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RuleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printDate}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintDate(RuleParser.PrintDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printDate}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintDate(RuleParser.PrintDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printIP}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintIP(RuleParser.PrintIPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printIP}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintIP(RuleParser.PrintIPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(RuleParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(RuleParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printEnum}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintEnum(RuleParser.PrintEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printEnum}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintEnum(RuleParser.PrintEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printAttribute}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintAttribute(RuleParser.PrintAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printAttribute}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintAttribute(RuleParser.PrintAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printInteger}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintInteger(RuleParser.PrintIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printInteger}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintInteger(RuleParser.PrintIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printValue}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintValue(RuleParser.PrintValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printValue}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintValue(RuleParser.PrintValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printAssociationAtt}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void enterPrintAssociationAtt(RuleParser.PrintAssociationAttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printAssociationAtt}
	 * labeled alternative in {@link RuleParser#express4Data}.
	 * @param ctx the parse tree
	 */
	void exitPrintAssociationAtt(RuleParser.PrintAssociationAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#attAndTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAttAndTypeName(RuleParser.AttAndTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#attAndTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAttAndTypeName(RuleParser.AttAndTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#classN}.
	 * @param ctx the parse tree
	 */
	void enterClassN(RuleParser.ClassNContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#classN}.
	 * @param ctx the parse tree
	 */
	void exitClassN(RuleParser.ClassNContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(RuleParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(RuleParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#typeNames}.
	 * @param ctx the parse tree
	 */
	void enterTypeNames(RuleParser.TypeNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#typeNames}.
	 * @param ctx the parse tree
	 */
	void exitTypeNames(RuleParser.TypeNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(RuleParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(RuleParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#isList}.
	 * @param ctx the parse tree
	 */
	void enterIsList(RuleParser.IsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#isList}.
	 * @param ctx the parse tree
	 */
	void exitIsList(RuleParser.IsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RuleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RuleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#chooseD}.
	 * @param ctx the parse tree
	 */
	void enterChooseD(RuleParser.ChooseDContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#chooseD}.
	 * @param ctx the parse tree
	 */
	void exitChooseD(RuleParser.ChooseDContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterRelationship(RuleParser.RelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitRelationship(RuleParser.RelationshipContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(RuleParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(RuleParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(RuleParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(RuleParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#limitedInteger}.
	 * @param ctx the parse tree
	 */
	void enterLimitedInteger(RuleParser.LimitedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#limitedInteger}.
	 * @param ctx the parse tree
	 */
	void exitLimitedInteger(RuleParser.LimitedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(RuleParser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(RuleParser.IpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#range4Ip}.
	 * @param ctx the parse tree
	 */
	void enterRange4Ip(RuleParser.Range4IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#range4Ip}.
	 * @param ctx the parse tree
	 */
	void exitRange4Ip(RuleParser.Range4IpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#number4Ip}.
	 * @param ctx the parse tree
	 */
	void enterNumber4Ip(RuleParser.Number4IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#number4Ip}.
	 * @param ctx the parse tree
	 */
	void exitNumber4Ip(RuleParser.Number4IpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#startIp}.
	 * @param ctx the parse tree
	 */
	void enterStartIp(RuleParser.StartIpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#startIp}.
	 * @param ctx the parse tree
	 */
	void exitStartIp(RuleParser.StartIpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#endIp}.
	 * @param ctx the parse tree
	 */
	void enterEndIp(RuleParser.EndIpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#endIp}.
	 * @param ctx the parse tree
	 */
	void exitEndIp(RuleParser.EndIpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#value4Attribute}.
	 * @param ctx the parse tree
	 */
	void enterValue4Attribute(RuleParser.Value4AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#value4Attribute}.
	 * @param ctx the parse tree
	 */
	void exitValue4Attribute(RuleParser.Value4AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link RuleParser#express4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Data}.
	 * @param ctx the parse tree
	 */
	void enterValues(RuleParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link RuleParser#express4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Dataexpress4Data}.
	 * @param ctx the parse tree
	 */
	void exitValues(RuleParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RuleParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RuleParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#zero}.
	 * @param ctx the parse tree
	 */
	void enterZero(RuleParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#zero}.
	 * @param ctx the parse tree
	 */
	void exitZero(RuleParser.ZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(RuleParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(RuleParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#numberBelow255}.
	 * @param ctx the parse tree
	 */
	void enterNumberBelow255(RuleParser.NumberBelow255Context ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#numberBelow255}.
	 * @param ctx the parse tree
	 */
	void exitNumberBelow255(RuleParser.NumberBelow255Context ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(RuleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(RuleParser.NumberContext ctx);
}