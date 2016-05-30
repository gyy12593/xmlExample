package Rule2;
// Generated from Rule.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DATE=11, ENUM=12, LIST=13, SEPARATOR=14, Style4generate=15, INTEGER=16, 
		Alphas=17, Digit=18, Int=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_express4Data = 1, RULE_attAndTypeName = 2, RULE_attName = 3, 
		RULE_typeName = 4, RULE_isList = 5, RULE_number4List = 6, RULE_id = 7, 
		RULE_chooseD = 8, RULE_relationship = 9, RULE_className = 10, RULE_attributeName = 11, 
		RULE_limitedInteger = 12, RULE_number4Integer = 13, RULE_ip = 14, RULE_range4Ip = 15, 
		RULE_number4Ip = 16, RULE_startIp = 17, RULE_endIp = 18, RULE_value4Attribute = 19, 
		RULE_values = 20, RULE_value = 21;
	public static final String[] ruleNames = {
		"prog", "express4Data", "attAndTypeName", "attName", "typeName", "isList", 
		"number4List", "id", "chooseD", "relationship", "className", "attributeName", 
		"limitedInteger", "number4Integer", "ip", "range4Ip", "number4Ip", "startIp", 
		"endIp", "value4Attribute", "values", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'^'", "']'", "'-'", "'.'", "'='", "'IP'", "','", "'('", 
		"')'", "'DATE'", "'ENUM'", "'LIST'", "'$'", null, "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "DATE", 
		"ENUM", "LIST", "SEPARATOR", "Style4generate", "INTEGER", "Alphas", "Digit", 
		"Int", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<Express4DataContext> express4Data() {
			return getRuleContexts(Express4DataContext.class);
		}
		public Express4DataContext express4Data(int i) {
			return getRuleContext(Express4DataContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				express4Data();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << DATE) | (1L << ENUM) | (1L << LIST) | (1L << SEPARATOR) | (1L << INTEGER) | (1L << Alphas))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Express4DataContext extends ParserRuleContext {
		public Express4DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express4Data; }
	 
		public Express4DataContext() { }
		public void copyFrom(Express4DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintValueContext extends Express4DataContext {
		public Value4AttributeContext value4Attribute() {
			return getRuleContext(Value4AttributeContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintValueContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIPContext extends Express4DataContext {
		public IpContext ip() {
			return getRuleContext(IpContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintIPContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintIP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintEnumContext extends Express4DataContext {
		public TerminalNode ENUM() { return getToken(RuleParser.ENUM, 0); }
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintEnumContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintEnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntegerContext extends Express4DataContext {
		public LimitedIntegerContext limitedInteger() {
			return getRuleContext(LimitedIntegerContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintIntegerContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintDateContext extends Express4DataContext {
		public TerminalNode DATE() { return getToken(RuleParser.DATE, 0); }
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintDateContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintAttributeContext extends Express4DataContext {
		public RelationshipContext relationship() {
			return getRuleContext(RelationshipContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintAttributeContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIdContext extends Express4DataContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintIdContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Express4DataContext express4Data() throws RecognitionException {
		Express4DataContext _localctx = new Express4DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_express4Data);
		int _la;
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new PrintDateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(49);
					attAndTypeName();
					}
				}

				setState(53);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(52);
					isList();
					}
				}

				setState(55);
				match(DATE);
				setState(57);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(56);
					match(Style4generate);
					}
				}

				setState(59);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new PrintIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(60);
					attAndTypeName();
					}
				}

				setState(64);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(63);
					isList();
					}
				}

				setState(66);
				ip();
				setState(68);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(67);
					match(Style4generate);
					}
				}

				setState(70);
				match(SEPARATOR);
				}
				break;
			case 3:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(72);
					attAndTypeName();
					}
					break;
				}
				setState(76);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(75);
					isList();
					}
				}

				setState(78);
				id();
				setState(80);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(79);
					match(Style4generate);
					}
				}

				setState(82);
				match(SEPARATOR);
				}
				break;
			case 4:
				_localctx = new PrintEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(84);
					attAndTypeName();
					}
				}

				setState(88);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(87);
					isList();
					}
				}

				setState(90);
				match(ENUM);
				setState(92);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(91);
					match(Style4generate);
					}
				}

				setState(94);
				match(SEPARATOR);
				}
				break;
			case 5:
				_localctx = new PrintAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(95);
					attAndTypeName();
					}
					break;
				}
				setState(99);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(98);
					isList();
					}
				}

				setState(101);
				relationship();
				setState(103);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(102);
					match(Style4generate);
					}
				}

				setState(105);
				match(SEPARATOR);
				}
				break;
			case 6:
				_localctx = new PrintIntegerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(107);
					attAndTypeName();
					}
				}

				setState(111);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(110);
					isList();
					}
				}

				setState(113);
				limitedInteger();
				setState(115);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(114);
					match(Style4generate);
					}
				}

				setState(117);
				match(SEPARATOR);
				}
				break;
			case 7:
				_localctx = new PrintValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(119);
					attAndTypeName();
					}
					break;
				}
				setState(123);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(122);
					isList();
					}
				}

				setState(125);
				value4Attribute();
				setState(127);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(126);
					match(Style4generate);
					}
				}

				setState(129);
				match(SEPARATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttAndTypeNameContext extends ParserRuleContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AttAndTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attAndTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitAttAndTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttAndTypeNameContext attAndTypeName() throws RecognitionException {
		AttAndTypeNameContext _localctx = new AttAndTypeNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attAndTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			attName();
			setState(134);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(136);
				match(Alphas);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(144);
				match(Alphas);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(RuleParser.LIST, 0); }
		public Number4ListContext number4List() {
			return getRuleContext(Number4ListContext.class,0);
		}
		public IsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitIsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsListContext isList() throws RecognitionException {
		IsListContext _localctx = new IsListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_isList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(LIST);
			setState(153);
			number4List();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number4ListContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(RuleParser.Digit, 0); }
		public TerminalNode Int() { return getToken(RuleParser.Int, 0); }
		public Number4ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number4List; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNumber4List(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number4ListContext number4List() throws RecognitionException {
		Number4ListContext _localctx = new Number4ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number4List);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==Digit || _la==Int) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	 
		public IdContext() { }
		public void copyFrom(IdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4Id2Context extends IdContext {
		public ChooseDContext chooseD() {
			return getRuleContext(ChooseDContext.class,0);
		}
		public TerminalNode Int() { return getToken(RuleParser.Int, 0); }
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public Process4Id2Context(IdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4Id2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Process4Id1Context extends IdContext {
		public ChooseDContext chooseD() {
			return getRuleContext(ChooseDContext.class,0);
		}
		public TerminalNode Digit() { return getToken(RuleParser.Digit, 0); }
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public Process4Id1Context(IdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4Id1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id);
		int _la;
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new Process4Id1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Alphas) {
					{
					{
					setState(157);
					match(Alphas);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(T__0);
				setState(164);
				chooseD();
				setState(165);
				match(T__1);
				setState(166);
				match(Digit);
				setState(167);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new Process4Id2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Alphas) {
					{
					{
					setState(169);
					match(Alphas);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__0);
				setState(176);
				chooseD();
				setState(177);
				match(T__1);
				setState(178);
				match(Int);
				setState(179);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChooseDContext extends ParserRuleContext {
		public ChooseDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseD; }
	 
		public ChooseDContext() { }
		public void copyFrom(ChooseDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChooseDigitContext extends ChooseDContext {
		public List<TerminalNode> Digit() { return getTokens(RuleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(RuleParser.Digit, i);
		}
		public ChooseDigitContext(ChooseDContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitChooseDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseDContext chooseD() throws RecognitionException {
		ChooseDContext _localctx = new ChooseDContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chooseD);
		try {
			_localctx = new ChooseDigitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__0);
			setState(184);
			match(Digit);
			setState(185);
			match(T__3);
			setState(186);
			match(Digit);
			setState(187);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipContext extends ParserRuleContext {
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
	 
		public RelationshipContext() { }
		public void copyFrom(RelationshipContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4relationshipContext extends RelationshipContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public Process4relationshipContext(RelationshipContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4relationship(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relationship);
		try {
			_localctx = new Process4relationshipContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			className();
			setState(190);
			match(T__4);
			setState(191);
			attributeName();
			setState(192);
			match(T__5);
			setState(193);
			className();
			setState(194);
			match(T__4);
			setState(195);
			attributeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				match(Alphas);
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Alphas );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(Alphas);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Alphas );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitedIntegerContext extends ParserRuleContext {
		public LimitedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitedInteger; }
	 
		public LimitedIntegerContext() { }
		public void copyFrom(LimitedIntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4limitedInteger1Context extends LimitedIntegerContext {
		public TerminalNode INTEGER() { return getToken(RuleParser.INTEGER, 0); }
		public List<Number4IntegerContext> number4Integer() {
			return getRuleContexts(Number4IntegerContext.class);
		}
		public Number4IntegerContext number4Integer(int i) {
			return getRuleContext(Number4IntegerContext.class,i);
		}
		public Process4limitedInteger1Context(LimitedIntegerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4limitedInteger1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitedIntegerContext limitedInteger() throws RecognitionException {
		LimitedIntegerContext _localctx = new LimitedIntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_limitedInteger);
		try {
			_localctx = new Process4limitedInteger1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(INTEGER);
			setState(208);
			number4Integer();
			setState(209);
			number4Integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number4IntegerContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(RuleParser.Digit, 0); }
		public TerminalNode Int() { return getToken(RuleParser.Int, 0); }
		public Number4IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number4Integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNumber4Integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number4IntegerContext number4Integer() throws RecognitionException {
		Number4IntegerContext _localctx = new Number4IntegerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number4Integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==Digit || _la==Int) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IpContext extends ParserRuleContext {
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
	 
		public IpContext() { }
		public void copyFrom(IpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4IpContext extends IpContext {
		public List<Range4IpContext> range4Ip() {
			return getRuleContexts(Range4IpContext.class);
		}
		public Range4IpContext range4Ip(int i) {
			return getRuleContext(Range4IpContext.class,i);
		}
		public Process4IpContext(IpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4Ip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ip);
		int _la;
		try {
			_localctx = new Process4IpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__6);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				range4Ip();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range4IpContext extends ParserRuleContext {
		public Range4IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range4Ip; }
	 
		public Range4IpContext() { }
		public void copyFrom(Range4IpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4Range4IpContext extends Range4IpContext {
		public StartIpContext startIp() {
			return getRuleContext(StartIpContext.class,0);
		}
		public EndIpContext endIp() {
			return getRuleContext(EndIpContext.class,0);
		}
		public Process4Range4IpContext(Range4IpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4Range4Ip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range4IpContext range4Ip() throws RecognitionException {
		Range4IpContext _localctx = new Range4IpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_range4Ip);
		try {
			_localctx = new Process4Range4IpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__0);
			setState(220);
			startIp();
			setState(221);
			match(T__7);
			setState(222);
			endIp();
			setState(223);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number4IpContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(RuleParser.Digit, 0); }
		public TerminalNode Int() { return getToken(RuleParser.Int, 0); }
		public Number4IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number4Ip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNumber4Ip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number4IpContext number4Ip() throws RecognitionException {
		Number4IpContext _localctx = new Number4IpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number4Ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==Digit || _la==Int) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartIpContext extends ParserRuleContext {
		public List<Number4IpContext> number4Ip() {
			return getRuleContexts(Number4IpContext.class);
		}
		public Number4IpContext number4Ip(int i) {
			return getRuleContext(Number4IpContext.class,i);
		}
		public StartIpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startIp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitStartIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartIpContext startIp() throws RecognitionException {
		StartIpContext _localctx = new StartIpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_startIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			number4Ip();
			setState(228);
			match(T__4);
			setState(229);
			number4Ip();
			setState(230);
			match(T__4);
			setState(231);
			number4Ip();
			setState(232);
			match(T__4);
			setState(233);
			number4Ip();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndIpContext extends ParserRuleContext {
		public List<Number4IpContext> number4Ip() {
			return getRuleContexts(Number4IpContext.class);
		}
		public Number4IpContext number4Ip(int i) {
			return getRuleContext(Number4IpContext.class,i);
		}
		public EndIpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endIp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEndIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndIpContext endIp() throws RecognitionException {
		EndIpContext _localctx = new EndIpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_endIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			number4Ip();
			setState(236);
			match(T__4);
			setState(237);
			number4Ip();
			setState(238);
			match(T__4);
			setState(239);
			number4Ip();
			setState(240);
			match(T__4);
			setState(241);
			number4Ip();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value4AttributeContext extends ParserRuleContext {
		public Value4AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value4Attribute; }
	 
		public Value4AttributeContext() { }
		public void copyFrom(Value4AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4value4AttributeContext extends Value4AttributeContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Process4value4AttributeContext(Value4AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4value4Attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value4AttributeContext value4Attribute() throws RecognitionException {
		Value4AttributeContext _localctx = new Value4AttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value4Attribute);
		try {
			_localctx = new Process4value4AttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			attributeName();
			setState(244);
			match(T__8);
			setState(245);
			values();
			setState(246);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	 
		public ValuesContext() { }
		public void copyFrom(ValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4valuesContext extends ValuesContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public Process4valuesContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitProcess4values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_values);
		int _la;
		try {
			int _alt;
			_localctx = new Process4valuesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					value();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(254);
				match(Alphas);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(260);
				match(Alphas);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\3\5\3\65\n\3\3\3\5\38\n\3\3\3\3\3\5\3<\n\3\3\3\3\3\5\3@\n\3"+
		"\3\3\5\3C\n\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\5\3L\n\3\3\3\5\3O\n\3\3\3\3"+
		"\3\5\3S\n\3\3\3\3\3\3\3\5\3X\n\3\3\3\5\3[\n\3\3\3\3\3\5\3_\n\3\3\3\3\3"+
		"\5\3c\n\3\3\3\5\3f\n\3\3\3\3\3\5\3j\n\3\3\3\3\3\3\3\5\3o\n\3\3\3\5\3r"+
		"\n\3\3\3\3\3\5\3v\n\3\3\3\3\3\3\3\5\3{\n\3\3\3\5\3~\n\3\3\3\3\3\5\3\u0082"+
		"\n\3\3\3\3\3\5\3\u0086\n\3\3\4\3\4\3\4\3\5\7\5\u008c\n\5\f\5\16\5\u008f"+
		"\13\5\3\5\3\5\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b8"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\6\f\u00c9\n\f\r\f\16\f\u00ca\3\r\6\r\u00ce\n\r\r\r\16\r\u00cf\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\6\20\u00da\n\20\r\20\16\20\u00db\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\7\26\u00fc\n\26\f\26\16\26\u00ff\13\26\3\26\7\26\u0102\n\26\f"+
		"\26\16\26\u0105\13\26\3\27\7\27\u0108\n\27\f\27\16\27\u010b\13\27\3\27"+
		"\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3"+
		"\2\24\25\u011f\2/\3\2\2\2\4\u0085\3\2\2\2\6\u0087\3\2\2\2\b\u008d\3\2"+
		"\2\2\n\u0095\3\2\2\2\f\u009a\3\2\2\2\16\u009d\3\2\2\2\20\u00b7\3\2\2\2"+
		"\22\u00b9\3\2\2\2\24\u00bf\3\2\2\2\26\u00c8\3\2\2\2\30\u00cd\3\2\2\2\32"+
		"\u00d1\3\2\2\2\34\u00d5\3\2\2\2\36\u00d7\3\2\2\2 \u00dd\3\2\2\2\"\u00e3"+
		"\3\2\2\2$\u00e5\3\2\2\2&\u00ed\3\2\2\2(\u00f5\3\2\2\2*\u00fd\3\2\2\2,"+
		"\u0109\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\3\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\64\65\3\2\2\2\65\67\3"+
		"\2\2\2\668\5\f\7\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29;\7\r\2\2:<\7\21"+
		"\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=\u0086\7\20\2\2>@\5\6\4\2?>\3\2\2\2"+
		"?@\3\2\2\2@B\3\2\2\2AC\5\f\7\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\5\36\20"+
		"\2EG\7\21\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\20\2\2I\u0086\3\2\2\2"+
		"JL\5\6\4\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\5\f\7\2NM\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PR\5\20\t\2QS\7\21\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\20"+
		"\2\2U\u0086\3\2\2\2VX\5\6\4\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\f\7\2"+
		"ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\16\2\2]_\7\21\2\2^]\3\2\2\2^_\3\2"+
		"\2\2_`\3\2\2\2`\u0086\7\20\2\2ac\5\6\4\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2"+
		"df\5\f\7\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\24\13\2hj\7\21\2\2ih\3\2"+
		"\2\2ij\3\2\2\2jk\3\2\2\2kl\7\20\2\2l\u0086\3\2\2\2mo\5\6\4\2nm\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pr\5\f\7\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5\32\16"+
		"\2tv\7\21\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\20\2\2x\u0086\3\2\2\2"+
		"y{\5\6\4\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2"+
		"~\177\3\2\2\2\177\u0081\5(\25\2\u0080\u0082\7\21\2\2\u0081\u0080\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\20\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\64\3\2\2\2\u0085?\3\2\2\2\u0085K\3\2\2\2\u0085W\3"+
		"\2\2\2\u0085b\3\2\2\2\u0085n\3\2\2\2\u0085z\3\2\2\2\u0086\5\3\2\2\2\u0087"+
		"\u0088\5\b\5\2\u0088\u0089\5\n\6\2\u0089\7\3\2\2\2\u008a\u008c\7\23\2"+
		"\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\20\2\2"+
		"\u0091\t\3\2\2\2\u0092\u0094\7\23\2\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\20\2\2\u0099\13\3\2\2\2\u009a\u009b\7\17"+
		"\2\2\u009b\u009c\5\16\b\2\u009c\r\3\2\2\2\u009d\u009e\t\2\2\2\u009e\17"+
		"\3\2\2\2\u009f\u00a1\7\23\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7\4\2\2"+
		"\u00a8\u00a9\7\24\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00b8\3\2\2\2\u00ab\u00ad"+
		"\7\23\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2"+
		"\7\3\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\7\25\2\2"+
		"\u00b5\u00b6\7\5\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a2\3\2\2\2\u00b7\u00ae"+
		"\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\7\24\2\2\u00bb"+
		"\u00bc\7\6\2\2\u00bc\u00bd\7\24\2\2\u00bd\u00be\7\5\2\2\u00be\23\3\2\2"+
		"\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\5\30\r\2\u00c2"+
		"\u00c3\7\b\2\2\u00c3\u00c4\5\26\f\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5"+
		"\30\r\2\u00c6\25\3\2\2\2\u00c7\u00c9\7\23\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2"+
		"\2\u00cc\u00ce\7\23\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\31\3\2\2\2\u00d1\u00d2\7\22\2"+
		"\2\u00d2\u00d3\5\34\17\2\u00d3\u00d4\5\34\17\2\u00d4\33\3\2\2\2\u00d5"+
		"\u00d6\t\2\2\2\u00d6\35\3\2\2\2\u00d7\u00d9\7\t\2\2\u00d8\u00da\5 \21"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00de\7\3\2\2\u00de\u00df\5$\23\2\u00df"+
		"\u00e0\7\n\2\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\7\5\2\2\u00e2!\3\2\2\2"+
		"\u00e3\u00e4\t\2\2\2\u00e4#\3\2\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7"+
		"\7\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\7\7\2\2\u00e9\u00ea\5\"\22\2\u00ea"+
		"\u00eb\7\7\2\2\u00eb\u00ec\5\"\22\2\u00ec%\3\2\2\2\u00ed\u00ee\5\"\22"+
		"\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0\5\"\22\2\u00f0\u00f1\7\7\2\2\u00f1"+
		"\u00f2\5\"\22\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\5\"\22\2\u00f4\'\3\2\2"+
		"\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7\13\2\2\u00f7\u00f8\5*\26\2\u00f8"+
		"\u00f9\7\f\2\2\u00f9)\3\2\2\2\u00fa\u00fc\5,\27\2\u00fb\u00fa\3\2\2\2"+
		"\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7\23\2\2\u0101\u0100\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104+\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7\23\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\n\2\2\u010d-\3\2\2\2$\61\64\67"+
		";?BFKNRWZ^beinquz}\u0081\u0085\u008d\u0095\u00a2\u00ae\u00b7\u00ca\u00cf"+
		"\u00db\u00fd\u0103\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}