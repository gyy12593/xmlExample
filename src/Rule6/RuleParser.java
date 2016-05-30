package Rule6;
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
		T__9=10, DATE=11, ENUM=12, LIST=13, ASSOCIATION=14, SEPARATOR=15, Style4generate=16, 
		INTEGER=17, Alphas=18, Zero=19, Number1To9=20, Number10To255=21, NumberAfter255=22, 
		WS=23;
	public static final int
		RULE_prog = 0, RULE_express4Data = 1, RULE_attAndTypeName = 2, RULE_classN = 3, 
		RULE_attName = 4, RULE_isList = 5, RULE_id = 6, RULE_chooseD = 7, RULE_relationship = 8, 
		RULE_className = 9, RULE_attributeName = 10, RULE_limitedInteger = 11, 
		RULE_integerScope = 12, RULE_character4Start = 13, RULE_character4End = 14, 
		RULE_startNumber = 15, RULE_endNumber = 16, RULE_ip = 17, RULE_range4Ip = 18, 
		RULE_number4Ip = 19, RULE_startIp = 20, RULE_endIp = 21, RULE_value4Attribute = 22, 
		RULE_values = 23, RULE_value = 24, RULE_zero = 25, RULE_digit = 26, RULE_numberBelow255 = 27, 
		RULE_number = 28;
	public static final String[] ruleNames = {
		"prog", "express4Data", "attAndTypeName", "classN", "attName", "isList", 
		"id", "chooseD", "relationship", "className", "attributeName", "limitedInteger", 
		"integerScope", "character4Start", "character4End", "startNumber", "endNumber", 
		"ip", "range4Ip", "number4Ip", "startIp", "endIp", "value4Attribute", 
		"values", "value", "zero", "digit", "numberBelow255", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'^'", "']'", "'-'", "'.'", "'='", "','", "'('", "')'", "'IP'", 
		"'DATE'", "'ENUM'", "'LIST'", "'ASSOCIATION'", "'$'", null, "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "DATE", 
		"ENUM", "LIST", "ASSOCIATION", "SEPARATOR", "Style4generate", "INTEGER", 
		"Alphas", "Zero", "Number1To9", "Number10To255", "NumberAfter255", "WS"
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
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				express4Data();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << DATE) | (1L << ENUM) | (1L << LIST) | (1L << ASSOCIATION) | (1L << SEPARATOR) | (1L << INTEGER) | (1L << Alphas))) != 0) );
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
	public static class PrintAssociationAttContext extends Express4DataContext {
		public TerminalNode ASSOCIATION() { return getToken(RuleParser.ASSOCIATION, 0); }
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
		}
		public IsListContext isList() {
			return getRuleContext(IsListContext.class,0);
		}
		public TerminalNode Style4generate() { return getToken(RuleParser.Style4generate, 0); }
		public PrintAssociationAttContext(Express4DataContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitPrintAssociationAtt(this);
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
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new PrintDateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(63);
					attAndTypeName();
					}
				}

				setState(67);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(66);
					isList();
					}
				}

				setState(69);
				match(DATE);
				setState(71);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(70);
					match(Style4generate);
					}
				}

				setState(73);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new PrintIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(74);
					attAndTypeName();
					}
				}

				setState(78);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(77);
					isList();
					}
				}

				setState(80);
				ip();
				setState(82);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(81);
					match(Style4generate);
					}
				}

				setState(84);
				match(SEPARATOR);
				}
				break;
			case 3:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(86);
					attAndTypeName();
					}
					break;
				}
				setState(90);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(89);
					isList();
					}
				}

				setState(92);
				id();
				setState(94);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(93);
					match(Style4generate);
					}
				}

				setState(96);
				match(SEPARATOR);
				}
				break;
			case 4:
				_localctx = new PrintEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(98);
					attAndTypeName();
					}
				}

				setState(102);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(101);
					isList();
					}
				}

				setState(104);
				match(ENUM);
				setState(106);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(105);
					match(Style4generate);
					}
				}

				setState(108);
				match(SEPARATOR);
				}
				break;
			case 5:
				_localctx = new PrintAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(109);
					attAndTypeName();
					}
					break;
				}
				setState(113);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(112);
					isList();
					}
				}

				setState(115);
				relationship();
				setState(117);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(116);
					match(Style4generate);
					}
				}

				setState(119);
				match(SEPARATOR);
				}
				break;
			case 6:
				_localctx = new PrintIntegerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(121);
					attAndTypeName();
					}
				}

				setState(125);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(124);
					isList();
					}
				}

				setState(127);
				limitedInteger();
				setState(129);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(128);
					match(Style4generate);
					}
				}

				setState(131);
				match(SEPARATOR);
				}
				break;
			case 7:
				_localctx = new PrintValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(133);
					attAndTypeName();
					}
					break;
				}
				setState(137);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(136);
					isList();
					}
				}

				setState(139);
				value4Attribute();
				setState(141);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(140);
					match(Style4generate);
					}
				}

				setState(143);
				match(SEPARATOR);
				}
				break;
			case 8:
				_localctx = new PrintAssociationAttContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(145);
					attAndTypeName();
					}
				}

				setState(149);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(148);
					isList();
					}
				}

				setState(151);
				match(ASSOCIATION);
				setState(153);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(152);
					match(Style4generate);
					}
				}

				setState(155);
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
		public ClassNContext classN() {
			return getRuleContext(ClassNContext.class,0);
		}
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
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
			setState(158);
			classN();
			setState(159);
			attName();
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

	public static class ClassNContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public ClassNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classN; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitClassN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNContext classN() throws RecognitionException {
		ClassNContext _localctx = new ClassNContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(161);
				match(Alphas);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
		enterRule(_localctx, 8, RULE_attName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
			setState(177);
			match(LIST);
			setState(178);
			number();
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
		public ChooseDContext chooseD() {
			return getRuleContext(ChooseDContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(180);
				match(Alphas);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__0);
			setState(187);
			chooseD();
			setState(188);
			match(T__1);
			setState(189);
			number();
			setState(190);
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

	public static class ChooseDContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public ChooseDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseD; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitChooseD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseDContext chooseD() throws RecognitionException {
		ChooseDContext _localctx = new ChooseDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chooseD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__0);
			setState(193);
			digit();
			setState(194);
			match(T__3);
			setState(195);
			digit();
			setState(196);
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
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRelationship(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			className();
			setState(199);
			match(T__4);
			setState(200);
			attributeName();
			setState(201);
			match(T__5);
			setState(202);
			className();
			setState(203);
			match(T__4);
			setState(204);
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
		enterRule(_localctx, 18, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				match(Alphas);
				}
				}
				setState(209); 
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
		enterRule(_localctx, 20, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(Alphas);
				}
				}
				setState(214); 
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
		public TerminalNode INTEGER() { return getToken(RuleParser.INTEGER, 0); }
		public List<IntegerScopeContext> integerScope() {
			return getRuleContexts(IntegerScopeContext.class);
		}
		public IntegerScopeContext integerScope(int i) {
			return getRuleContext(IntegerScopeContext.class,i);
		}
		public LimitedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitedInteger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitLimitedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitedIntegerContext limitedInteger() throws RecognitionException {
		LimitedIntegerContext _localctx = new LimitedIntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_limitedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(INTEGER);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				integerScope();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__7 );
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

	public static class IntegerScopeContext extends ParserRuleContext {
		public Character4StartContext character4Start() {
			return getRuleContext(Character4StartContext.class,0);
		}
		public StartNumberContext startNumber() {
			return getRuleContext(StartNumberContext.class,0);
		}
		public EndNumberContext endNumber() {
			return getRuleContext(EndNumberContext.class,0);
		}
		public Character4EndContext character4End() {
			return getRuleContext(Character4EndContext.class,0);
		}
		public IntegerScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerScope; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitIntegerScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerScopeContext integerScope() throws RecognitionException {
		IntegerScopeContext _localctx = new IntegerScopeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integerScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			character4Start();
			setState(223);
			startNumber();
			setState(224);
			match(T__6);
			setState(225);
			endNumber();
			setState(226);
			character4End();
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

	public static class Character4StartContext extends ParserRuleContext {
		public Character4StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character4Start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitCharacter4Start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character4StartContext character4Start() throws RecognitionException {
		Character4StartContext _localctx = new Character4StartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_character4Start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__7) ) {
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

	public static class Character4EndContext extends ParserRuleContext {
		public Character4EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character4End; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitCharacter4End(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character4EndContext character4End() throws RecognitionException {
		Character4EndContext _localctx = new Character4EndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_character4End);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__8) ) {
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

	public static class StartNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StartNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitStartNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartNumberContext startNumber() throws RecognitionException {
		StartNumberContext _localctx = new StartNumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_startNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			number();
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

	public static class EndNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public EndNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEndNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndNumberContext endNumber() throws RecognitionException {
		EndNumberContext _localctx = new EndNumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_endNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			number();
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
		public List<Range4IpContext> range4Ip() {
			return getRuleContexts(Range4IpContext.class);
		}
		public Range4IpContext range4Ip(int i) {
			return getRuleContext(Range4IpContext.class,i);
		}
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__9);
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				range4Ip();
				}
				}
				setState(240); 
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
		public StartIpContext startIp() {
			return getRuleContext(StartIpContext.class,0);
		}
		public EndIpContext endIp() {
			return getRuleContext(EndIpContext.class,0);
		}
		public Range4IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range4Ip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRange4Ip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range4IpContext range4Ip() throws RecognitionException {
		Range4IpContext _localctx = new Range4IpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_range4Ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__0);
			setState(243);
			startIp();
			setState(244);
			match(T__6);
			setState(245);
			endIp();
			setState(246);
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
		public NumberBelow255Context numberBelow255() {
			return getRuleContext(NumberBelow255Context.class,0);
		}
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
		enterRule(_localctx, 38, RULE_number4Ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			numberBelow255();
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
		enterRule(_localctx, 40, RULE_startIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			number4Ip();
			setState(251);
			match(T__4);
			setState(252);
			number4Ip();
			setState(253);
			match(T__4);
			setState(254);
			number4Ip();
			setState(255);
			match(T__4);
			setState(256);
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
		enterRule(_localctx, 42, RULE_endIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			number4Ip();
			setState(259);
			match(T__4);
			setState(260);
			number4Ip();
			setState(261);
			match(T__4);
			setState(262);
			number4Ip();
			setState(263);
			match(T__4);
			setState(264);
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
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Value4AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value4Attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitValue4Attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value4AttributeContext value4Attribute() throws RecognitionException {
		Value4AttributeContext _localctx = new Value4AttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value4Attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			attributeName();
			setState(267);
			match(T__7);
			setState(268);
			values();
			setState(269);
			match(T__8);
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
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_values);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					value();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(277);
				match(Alphas);
				}
				}
				setState(282);
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
		enterRule(_localctx, 48, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(283);
				match(Alphas);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(T__6);
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

	public static class ZeroContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(RuleParser.Zero, 0); }
		public ZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroContext zero() throws RecognitionException {
		ZeroContext _localctx = new ZeroContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Zero);
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

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(RuleParser.Zero, 0); }
		public TerminalNode Number1To9() { return getToken(RuleParser.Number1To9, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==Zero || _la==Number1To9) ) {
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

	public static class NumberBelow255Context extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode Number10To255() { return getToken(RuleParser.Number10To255, 0); }
		public NumberBelow255Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberBelow255; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNumberBelow255(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberBelow255Context numberBelow255() throws RecognitionException {
		NumberBelow255Context _localctx = new NumberBelow255Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_numberBelow255);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case Zero:
			case Number1To9:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				digit();
				}
				break;
			case Number10To255:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(Number10To255);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberBelow255Context numberBelow255() {
			return getRuleContext(NumberBelow255Context.class,0);
		}
		public TerminalNode NumberAfter255() { return getToken(RuleParser.NumberAfter255, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case Zero:
			case Number1To9:
			case Number10To255:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				numberBelow255();
				}
				break;
			case NumberAfter255:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(NumberAfter255);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2>\n\2\r\2\16"+
		"\2?\3\3\5\3C\n\3\3\3\5\3F\n\3\3\3\3\3\5\3J\n\3\3\3\3\3\5\3N\n\3\3\3\5"+
		"\3Q\n\3\3\3\3\3\5\3U\n\3\3\3\3\3\3\3\5\3Z\n\3\3\3\5\3]\n\3\3\3\3\3\5\3"+
		"a\n\3\3\3\3\3\3\3\5\3f\n\3\3\3\5\3i\n\3\3\3\3\3\5\3m\n\3\3\3\3\3\5\3q"+
		"\n\3\3\3\5\3t\n\3\3\3\3\3\5\3x\n\3\3\3\3\3\3\3\5\3}\n\3\3\3\5\3\u0080"+
		"\n\3\3\3\3\3\5\3\u0084\n\3\3\3\3\3\3\3\5\3\u0089\n\3\3\3\5\3\u008c\n\3"+
		"\3\3\3\3\5\3\u0090\n\3\3\3\3\3\3\3\5\3\u0095\n\3\3\3\5\3\u0098\n\3\3\3"+
		"\3\3\5\3\u009c\n\3\3\3\5\3\u009f\n\3\3\4\3\4\3\4\3\5\7\5\u00a5\n\5\f\5"+
		"\16\5\u00a8\13\5\3\5\3\5\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13"+
		"\u00d2\n\13\r\13\16\13\u00d3\3\f\6\f\u00d7\n\f\r\f\16\f\u00d8\3\r\3\r"+
		"\6\r\u00dd\n\r\r\r\16\r\u00de\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u00f1\n\23\r\23\16\23\u00f2"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\7\31\u0113\n\31\f\31\16\31\u0116\13\31\3\31\7\31\u0119\n\31"+
		"\f\31\16\31\u011c\13\31\3\32\7\32\u011f\n\32\f\32\16\32\u0122\13\32\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u012c\n\35\3\36\3\36\5\36"+
		"\u0130\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:\2\5\4\2\3\3\n\n\4\2\5\5\13\13\3\2\25\26\u0140\2=\3\2"+
		"\2\2\4\u009e\3\2\2\2\6\u00a0\3\2\2\2\b\u00a6\3\2\2\2\n\u00ae\3\2\2\2\f"+
		"\u00b3\3\2\2\2\16\u00b9\3\2\2\2\20\u00c2\3\2\2\2\22\u00c8\3\2\2\2\24\u00d1"+
		"\3\2\2\2\26\u00d6\3\2\2\2\30\u00da\3\2\2\2\32\u00e0\3\2\2\2\34\u00e6\3"+
		"\2\2\2\36\u00e8\3\2\2\2 \u00ea\3\2\2\2\"\u00ec\3\2\2\2$\u00ee\3\2\2\2"+
		"&\u00f4\3\2\2\2(\u00fa\3\2\2\2*\u00fc\3\2\2\2,\u0104\3\2\2\2.\u010c\3"+
		"\2\2\2\60\u0114\3\2\2\2\62\u0120\3\2\2\2\64\u0125\3\2\2\2\66\u0127\3\2"+
		"\2\28\u012b\3\2\2\2:\u012f\3\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@\3\3\2\2\2AC\5\6\4\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\5"+
		"\f\7\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\7\r\2\2HJ\7\22\2\2IH\3\2\2\2IJ"+
		"\3\2\2\2JK\3\2\2\2K\u009f\7\21\2\2LN\5\6\4\2ML\3\2\2\2MN\3\2\2\2NP\3\2"+
		"\2\2OQ\5\f\7\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\5$\23\2SU\7\22\2\2TS\3"+
		"\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\21\2\2W\u009f\3\2\2\2XZ\5\6\4\2YX\3\2\2"+
		"\2YZ\3\2\2\2Z\\\3\2\2\2[]\5\f\7\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5"+
		"\16\b\2_a\7\22\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\21\2\2c\u009f\3\2"+
		"\2\2df\5\6\4\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5\f\7\2hg\3\2\2\2hi\3\2"+
		"\2\2ij\3\2\2\2jl\7\16\2\2km\7\22\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2n\u009f"+
		"\7\21\2\2oq\5\6\4\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\f\7\2sr\3\2\2\2"+
		"st\3\2\2\2tu\3\2\2\2uw\5\22\n\2vx\7\22\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2"+
		"\2yz\7\21\2\2z\u009f\3\2\2\2{}\5\6\4\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2"+
		"\2~\u0080\5\f\7\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\5\30\r\2\u0082\u0084\7\22\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u009f\3\2\2\2\u0087"+
		"\u0089\5\6\4\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\5.\30\2\u008e\u0090\7\22\2\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\21\2\2\u0092"+
		"\u009f\3\2\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\f\7\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\7\20\2\2\u009a\u009c\7"+
		"\22\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\7\21\2\2\u009eB\3\2\2\2\u009eM\3\2\2\2\u009eY\3\2\2\2\u009ee\3"+
		"\2\2\2\u009ep\3\2\2\2\u009e|\3\2\2\2\u009e\u0088\3\2\2\2\u009e\u0094\3"+
		"\2\2\2\u009f\5\3\2\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\5\n\6\2\u00a2\7"+
		"\3\2\2\2\u00a3\u00a5\7\24\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\t\3\2\2\2\u00ab\u00ad\7\24\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\21\2\2\u00b2"+
		"\13\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\5:\36\2\u00b5\r\3\2\2\2\u00b6"+
		"\u00b8\7\24\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\3\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\5"+
		":\36\2\u00c0\u00c1\7\5\2\2\u00c1\17\3\2\2\2\u00c2\u00c3\7\3\2\2\u00c3"+
		"\u00c4\5\66\34\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\5\66\34\2\u00c6\u00c7"+
		"\7\5\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\5\24\13\2\u00c9\u00ca\7\7\2\2\u00ca"+
		"\u00cb\5\26\f\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce"+
		"\7\7\2\2\u00ce\u00cf\5\26\f\2\u00cf\23\3\2\2\2\u00d0\u00d2\7\24\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\25\3\2\2\2\u00d5\u00d7\7\24\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\27\3\2\2\2\u00da"+
		"\u00dc\7\23\2\2\u00db\u00dd\5\32\16\2\u00dc\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\31\3\2\2\2\u00e0"+
		"\u00e1\5\34\17\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\t\2\2\u00e3\u00e4\5"+
		"\"\22\2\u00e4\u00e5\5\36\20\2\u00e5\33\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7"+
		"\35\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\5:\36\2\u00eb"+
		"!\3\2\2\2\u00ec\u00ed\5:\36\2\u00ed#\3\2\2\2\u00ee\u00f0\7\f\2\2\u00ef"+
		"\u00f1\5&\24\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3%\3\2\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6"+
		"\5*\26\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\5,\27\2\u00f8\u00f9\7\5\2\2\u00f9"+
		"\'\3\2\2\2\u00fa\u00fb\58\35\2\u00fb)\3\2\2\2\u00fc\u00fd\5(\25\2\u00fd"+
		"\u00fe\7\7\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100\7\7\2\2\u0100\u0101\5("+
		"\25\2\u0101\u0102\7\7\2\2\u0102\u0103\5(\25\2\u0103+\3\2\2\2\u0104\u0105"+
		"\5(\25\2\u0105\u0106\7\7\2\2\u0106\u0107\5(\25\2\u0107\u0108\7\7\2\2\u0108"+
		"\u0109\5(\25\2\u0109\u010a\7\7\2\2\u010a\u010b\5(\25\2\u010b-\3\2\2\2"+
		"\u010c\u010d\5\26\f\2\u010d\u010e\7\n\2\2\u010e\u010f\5\60\31\2\u010f"+
		"\u0110\7\13\2\2\u0110/\3\2\2\2\u0111\u0113\5\62\32\2\u0112\u0111\3\2\2"+
		"\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011a"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7\24\2\2\u0118\u0117\3\2\2\2"+
		"\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\61"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\24\2\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\t\2\2\u0124\63\3\2\2\2\u0125"+
		"\u0126\7\25\2\2\u0126\65\3\2\2\2\u0127\u0128\t\4\2\2\u0128\67\3\2\2\2"+
		"\u0129\u012c\5\66\34\2\u012a\u012c\7\27\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c9\3\2\2\2\u012d\u0130\58\35\2\u012e\u0130\7\30\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130;\3\2\2\2(?BEIMPTY\\`eh"+
		"lpsw|\177\u0083\u0088\u008b\u008f\u0094\u0097\u009b\u009e\u00a6\u00ae"+
		"\u00b9\u00d3\u00d8\u00de\u00f2\u0114\u011a\u0120\u012b\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}