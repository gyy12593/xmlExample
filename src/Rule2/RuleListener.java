package Rule2;
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
	 * Enter a parse tree produced by {@link RuleParser#number4List}.
	 * @param ctx the parse tree
	 */
	void enterNumber4List(RuleParser.Number4ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#number4List}.
	 * @param ctx the parse tree
	 */
	void exitNumber4List(RuleParser.Number4ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4Id1}
	 * labeled alternative in {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterProcess4Id1(RuleParser.Process4Id1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code process4Id1}
	 * labeled alternative in {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitProcess4Id1(RuleParser.Process4Id1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code process4Id2}
	 * labeled alternative in {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterProcess4Id2(RuleParser.Process4Id2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code process4Id2}
	 * labeled alternative in {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitProcess4Id2(RuleParser.Process4Id2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ChooseDigit}
	 * labeled alternative in {@link RuleParser#chooseD}.
	 * @param ctx the parse tree
	 */
	void enterChooseDigit(RuleParser.ChooseDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChooseDigit}
	 * labeled alternative in {@link RuleParser#chooseD}.
	 * @param ctx the parse tree
	 */
	void exitChooseDigit(RuleParser.ChooseDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4relationship}
	 * labeled alternative in {@link RuleParser#relationship}.
	 * @param ctx the parse tree
	 */
	void enterProcess4relationship(RuleParser.Process4relationshipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4relationship}
	 * labeled alternative in {@link RuleParser#relationship}.
	 * @param ctx the parse tree
	 */
	void exitProcess4relationship(RuleParser.Process4relationshipContext ctx);
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
	 * Enter a parse tree produced by the {@code process4limitedInteger1}
	 * labeled alternative in {@link RuleParser#limitedInteger}.
	 * @param ctx the parse tree
	 */
	void enterProcess4limitedInteger1(RuleParser.Process4limitedInteger1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code process4limitedInteger1}
	 * labeled alternative in {@link RuleParser#limitedInteger}.
	 * @param ctx the parse tree
	 */
	void exitProcess4limitedInteger1(RuleParser.Process4limitedInteger1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#number4Integer}.
	 * @param ctx the parse tree
	 */
	void enterNumber4Integer(RuleParser.Number4IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#number4Integer}.
	 * @param ctx the parse tree
	 */
	void exitNumber4Integer(RuleParser.Number4IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4Ip}
	 * labeled alternative in {@link RuleParser#ip}.
	 * @param ctx the parse tree
	 */
	void enterProcess4Ip(RuleParser.Process4IpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4Ip}
	 * labeled alternative in {@link RuleParser#ip}.
	 * @param ctx the parse tree
	 */
	void exitProcess4Ip(RuleParser.Process4IpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4Range4Ip}
	 * labeled alternative in {@link RuleParser#range4Ip}.
	 * @param ctx the parse tree
	 */
	void enterProcess4Range4Ip(RuleParser.Process4Range4IpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4Range4Ip}
	 * labeled alternative in {@link RuleParser#range4Ip}.
	 * @param ctx the parse tree
	 */
	void exitProcess4Range4Ip(RuleParser.Process4Range4IpContext ctx);
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
	 * Enter a parse tree produced by the {@code process4value4Attribute}
	 * labeled alternative in {@link RuleParser#value4Attribute}.
	 * @param ctx the parse tree
	 */
	void enterProcess4value4Attribute(RuleParser.Process4value4AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4value4Attribute}
	 * labeled alternative in {@link RuleParser#value4Attribute}.
	 * @param ctx the parse tree
	 */
	void exitProcess4value4Attribute(RuleParser.Process4value4AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code process4values}
	 * labeled alternative in {@link RuleParser#values}.
	 * @param ctx the parse tree
	 */
	void enterProcess4values(RuleParser.Process4valuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code process4values}
	 * labeled alternative in {@link RuleParser#values}.
	 * @param ctx the parse tree
	 */
	void exitProcess4values(RuleParser.Process4valuesContext ctx);
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
}