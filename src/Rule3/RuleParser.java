package Rule3;
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
		Alphas=17, Zero=18, Number1To9=19, Number10To255=20, NumberAfter255=21, 
		WS=22;
	public static final int
		RULE_prog = 0, RULE_express4Data = 1, RULE_attAndTypeName = 2, RULE_attName = 3, 
		RULE_typeName = 4, RULE_isList = 5, RULE_id = 6, RULE_chooseD = 7, RULE_relationship = 8, 
		RULE_className = 9, RULE_attributeName = 10, RULE_limitedInteger = 11, 
		RULE_ip = 12, RULE_range4Ip = 13, RULE_number4Ip = 14, RULE_startIp = 15, 
		RULE_endIp = 16, RULE_value4Attribute = 17, RULE_values = 18, RULE_value = 19, 
		RULE_zero = 20, RULE_digit = 21, RULE_numberBelow255 = 22, RULE_number = 23;
	public static final String[] ruleNames = {
		"prog", "express4Data", "attAndTypeName", "attName", "typeName", "isList", 
		"id", "chooseD", "relationship", "className", "attributeName", "limitedInteger", 
		"ip", "range4Ip", "number4Ip", "startIp", "endIp", "value4Attribute", 
		"values", "value", "zero", "digit", "numberBelow255", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "'^'", "']'", "'-'", "'.'", "'='", "'IP'", "','", "'('", 
		"')'", "'DATE'", "'ENUM'", "'LIST'", "'$'", null, "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "DATE", 
		"ENUM", "LIST", "SEPARATOR", "Style4generate", "INTEGER", "Alphas", "Zero", 
		"Number1To9", "Number10To255", "NumberAfter255", "WS"
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				express4Data();
				}
				}
				setState(51); 
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
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new PrintDateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(53);
					attAndTypeName();
					}
				}

				setState(57);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(56);
					isList();
					}
				}

				setState(59);
				match(DATE);
				setState(61);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(60);
					match(Style4generate);
					}
				}

				setState(63);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new PrintIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(64);
					attAndTypeName();
					}
				}

				setState(68);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(67);
					isList();
					}
				}

				setState(70);
				ip();
				setState(72);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(71);
					match(Style4generate);
					}
				}

				setState(74);
				match(SEPARATOR);
				}
				break;
			case 3:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(76);
					attAndTypeName();
					}
					break;
				}
				setState(80);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(79);
					isList();
					}
				}

				setState(82);
				id();
				setState(84);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(83);
					match(Style4generate);
					}
				}

				setState(86);
				match(SEPARATOR);
				}
				break;
			case 4:
				_localctx = new PrintEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(88);
					attAndTypeName();
					}
				}

				setState(92);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(91);
					isList();
					}
				}

				setState(94);
				match(ENUM);
				setState(96);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(95);
					match(Style4generate);
					}
				}

				setState(98);
				match(SEPARATOR);
				}
				break;
			case 5:
				_localctx = new PrintAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(99);
					attAndTypeName();
					}
					break;
				}
				setState(103);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(102);
					isList();
					}
				}

				setState(105);
				relationship();
				setState(107);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(106);
					match(Style4generate);
					}
				}

				setState(109);
				match(SEPARATOR);
				}
				break;
			case 6:
				_localctx = new PrintIntegerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(111);
					attAndTypeName();
					}
				}

				setState(115);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(114);
					isList();
					}
				}

				setState(117);
				limitedInteger();
				setState(119);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(118);
					match(Style4generate);
					}
				}

				setState(121);
				match(SEPARATOR);
				}
				break;
			case 7:
				_localctx = new PrintValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(123);
					attAndTypeName();
					}
					break;
				}
				setState(127);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(126);
					isList();
					}
				}

				setState(129);
				value4Attribute();
				setState(131);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(130);
					match(Style4generate);
					}
				}

				setState(133);
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
			setState(137);
			attName();
			setState(138);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(140);
				match(Alphas);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(148);
				match(Alphas);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
			setState(156);
			match(LIST);
			setState(157);
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
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(159);
				match(Alphas);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__0);
			setState(166);
			chooseD();
			setState(167);
			match(T__1);
			setState(168);
			number();
			setState(169);
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
			setState(171);
			match(T__0);
			setState(172);
			digit();
			setState(173);
			match(T__3);
			setState(174);
			digit();
			setState(175);
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
			setState(177);
			className();
			setState(178);
			match(T__4);
			setState(179);
			attributeName();
			setState(180);
			match(T__5);
			setState(181);
			className();
			setState(182);
			match(T__4);
			setState(183);
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
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(Alphas);
				}
				}
				setState(188); 
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
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				match(Alphas);
				}
				}
				setState(193); 
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(INTEGER);
			setState(196);
			number();
			setState(197);
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
		enterRule(_localctx, 24, RULE_ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__6);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				range4Ip();
				}
				}
				setState(203); 
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
		enterRule(_localctx, 26, RULE_range4Ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__0);
			setState(206);
			startIp();
			setState(207);
			match(T__7);
			setState(208);
			endIp();
			setState(209);
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
		enterRule(_localctx, 28, RULE_number4Ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 30, RULE_startIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			number4Ip();
			setState(214);
			match(T__4);
			setState(215);
			number4Ip();
			setState(216);
			match(T__4);
			setState(217);
			number4Ip();
			setState(218);
			match(T__4);
			setState(219);
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
		enterRule(_localctx, 32, RULE_endIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			number4Ip();
			setState(222);
			match(T__4);
			setState(223);
			number4Ip();
			setState(224);
			match(T__4);
			setState(225);
			number4Ip();
			setState(226);
			match(T__4);
			setState(227);
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
		enterRule(_localctx, 34, RULE_value4Attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			attributeName();
			setState(230);
			match(T__8);
			setState(231);
			values();
			setState(232);
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
		enterRule(_localctx, 36, RULE_values);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					value();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(240);
				match(Alphas);
				}
				}
				setState(245);
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
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(246);
				match(Alphas);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
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
		enterRule(_localctx, 40, RULE_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 42, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 44, RULE_numberBelow255);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case Zero:
			case Number1To9:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				digit();
				}
				break;
			case Number10To255:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
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
		enterRule(_localctx, 46, RULE_number);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case Zero:
			case Number1To9:
			case Number10To255:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				numberBelow255();
				}
				break;
			case NumberAfter255:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u010d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\5\39\n\3\3\3\5\3<\n\3\3\3\3\3\5\3@\n\3"+
		"\3\3\3\3\5\3D\n\3\3\3\5\3G\n\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\3\5\3S\n\3\3\3\3\3\5\3W\n\3\3\3\3\3\3\3\5\3\\\n\3\3\3\5\3_\n\3\3\3\3"+
		"\3\5\3c\n\3\3\3\3\3\5\3g\n\3\3\3\5\3j\n\3\3\3\3\3\5\3n\n\3\3\3\3\3\3\3"+
		"\5\3s\n\3\3\3\5\3v\n\3\3\3\3\3\5\3z\n\3\3\3\3\3\3\3\5\3\177\n\3\3\3\5"+
		"\3\u0082\n\3\3\3\3\3\5\3\u0086\n\3\3\3\3\3\5\3\u008a\n\3\3\4\3\4\3\4\3"+
		"\5\7\5\u0090\n\5\f\5\16\5\u0093\13\5\3\5\3\5\3\6\7\6\u0098\n\6\f\6\16"+
		"\6\u009b\13\6\3\6\3\6\3\7\3\7\3\7\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\6\13\u00bd\n\13\r\13\16\13\u00be\3\f\6\f\u00c2\n\f\r"+
		"\f\16\f\u00c3\3\r\3\r\3\r\3\r\3\16\3\16\6\16\u00cc\n\16\r\16\16\16\u00cd"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\3\24\7\24\u00f4\n\24"+
		"\f\24\16\24\u00f7\13\24\3\25\7\25\u00fa\n\25\f\25\16\25\u00fd\13\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0107\n\30\3\31\3\31\5\31"+
		"\u010b\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\2\3\3\2\24\25\u011b\2\63\3\2\2\2\4\u0089\3\2\2\2\6\u008b\3\2\2\2"+
		"\b\u0091\3\2\2\2\n\u0099\3\2\2\2\f\u009e\3\2\2\2\16\u00a4\3\2\2\2\20\u00ad"+
		"\3\2\2\2\22\u00b3\3\2\2\2\24\u00bc\3\2\2\2\26\u00c1\3\2\2\2\30\u00c5\3"+
		"\2\2\2\32\u00c9\3\2\2\2\34\u00cf\3\2\2\2\36\u00d5\3\2\2\2 \u00d7\3\2\2"+
		"\2\"\u00df\3\2\2\2$\u00e7\3\2\2\2&\u00ef\3\2\2\2(\u00fb\3\2\2\2*\u0100"+
		"\3\2\2\2,\u0102\3\2\2\2.\u0106\3\2\2\2\60\u010a\3\2\2\2\62\64\5\4\3\2"+
		"\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2"+
		"\679\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\f\7\2;:\3\2\2\2;<\3\2"+
		"\2\2<=\3\2\2\2=?\7\r\2\2>@\7\21\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2A\u008a"+
		"\7\20\2\2BD\5\6\4\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\f\7\2FE\3\2\2\2"+
		"FG\3\2\2\2GH\3\2\2\2HJ\5\32\16\2IK\7\21\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2"+
		"\2\2LM\7\20\2\2M\u008a\3\2\2\2NP\5\6\4\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2"+
		"QS\5\f\7\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\5\16\b\2UW\7\21\2\2VU\3\2\2"+
		"\2VW\3\2\2\2WX\3\2\2\2XY\7\20\2\2Y\u008a\3\2\2\2Z\\\5\6\4\2[Z\3\2\2\2"+
		"[\\\3\2\2\2\\^\3\2\2\2]_\5\f\7\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\16"+
		"\2\2ac\7\21\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2d\u008a\7\20\2\2eg\5\6\4"+
		"\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\f\7\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2"+
		"\2km\5\22\n\2ln\7\21\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\20\2\2p\u008a"+
		"\3\2\2\2qs\5\6\4\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\5\f\7\2ut\3\2\2\2u"+
		"v\3\2\2\2vw\3\2\2\2wy\5\30\r\2xz\7\21\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{|\7\20\2\2|\u008a\3\2\2\2}\177\5\6\4\2~}\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\5$\23\2\u0084\u0086\7\21\2\2\u0085\u0084\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\20\2\2\u0088"+
		"\u008a\3\2\2\2\u00898\3\2\2\2\u0089C\3\2\2\2\u0089O\3\2\2\2\u0089[\3\2"+
		"\2\2\u0089f\3\2\2\2\u0089r\3\2\2\2\u0089~\3\2\2\2\u008a\5\3\2\2\2\u008b"+
		"\u008c\5\b\5\2\u008c\u008d\5\n\6\2\u008d\7\3\2\2\2\u008e\u0090\7\23\2"+
		"\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\20\2\2"+
		"\u0095\t\3\2\2\2\u0096\u0098\7\23\2\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\7\20\2\2\u009d\13\3\2\2\2\u009e\u009f\7\17"+
		"\2\2\u009f\u00a0\5\60\31\2\u00a0\r\3\2\2\2\u00a1\u00a3\7\23\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\3\2\2\u00a8"+
		"\u00a9\5\20\t\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\5\60\31\2\u00ab\u00ac"+
		"\7\5\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00af\5,\27\2\u00af"+
		"\u00b0\7\6\2\2\u00b0\u00b1\5,\27\2\u00b1\u00b2\7\5\2\2\u00b2\21\3\2\2"+
		"\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5\26\f\2\u00b6"+
		"\u00b7\7\b\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\5"+
		"\26\f\2\u00ba\23\3\2\2\2\u00bb\u00bd\7\23\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\25\3\2\2"+
		"\2\u00c0\u00c2\7\23\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\27\3\2\2\2\u00c5\u00c6\7\22\2"+
		"\2\u00c6\u00c7\5\60\31\2\u00c7\u00c8\5\60\31\2\u00c8\31\3\2\2\2\u00c9"+
		"\u00cb\7\t\2\2\u00ca\u00cc\5\34\17\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d0\7\3\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5\""+
		"\22\2\u00d3\u00d4\7\5\2\2\u00d4\35\3\2\2\2\u00d5\u00d6\5.\30\2\u00d6\37"+
		"\3\2\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\36\20"+
		"\2\u00da\u00db\7\7\2\2\u00db\u00dc\5\36\20\2\u00dc\u00dd\7\7\2\2\u00dd"+
		"\u00de\5\36\20\2\u00de!\3\2\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\7\7"+
		"\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\5\36\20\2\u00e4"+
		"\u00e5\7\7\2\2\u00e5\u00e6\5\36\20\2\u00e6#\3\2\2\2\u00e7\u00e8\5\26\f"+
		"\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\7\f\2\2\u00eb"+
		"%\3\2\2\2\u00ec\u00ee\5(\25\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f5\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f4\7\23\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f8\u00fa\7\23\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u00ff\7\n\2\2\u00ff)\3\2\2\2\u0100\u0101\7\24\2\2\u0101+\3"+
		"\2\2\2\u0102\u0103\t\2\2\2\u0103-\3\2\2\2\u0104\u0107\5,\27\2\u0105\u0107"+
		"\7\26\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107/\3\2\2\2\u0108"+
		"\u010b\5.\30\2\u0109\u010b\7\27\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3"+
		"\2\2\2\u010b\61\3\2\2\2$\658;?CFJORV[^bfimruy~\u0081\u0085\u0089\u0091"+
		"\u0099\u00a4\u00be\u00c3\u00cd\u00ef\u00f5\u00fb\u0106\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}