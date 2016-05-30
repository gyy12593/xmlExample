package Rule5;
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
		RULE_attName = 4, RULE_typeNames = 5, RULE_typeName = 6, RULE_isList = 7, 
		RULE_id = 8, RULE_chooseD = 9, RULE_relationship = 10, RULE_className = 11, 
		RULE_attributeName = 12, RULE_limitedInteger = 13, RULE_ip = 14, RULE_range4Ip = 15, 
		RULE_number4Ip = 16, RULE_startIp = 17, RULE_endIp = 18, RULE_value4Attribute = 19, 
		RULE_values = 20, RULE_value = 21, RULE_zero = 22, RULE_digit = 23, RULE_numberBelow255 = 24, 
		RULE_number = 25;
	public static final String[] ruleNames = {
		"prog", "express4Data", "attAndTypeName", "classN", "attName", "typeNames", 
		"typeName", "isList", "id", "chooseD", "relationship", "className", "attributeName", 
		"limitedInteger", "ip", "range4Ip", "number4Ip", "startIp", "endIp", "value4Attribute", 
		"values", "value", "zero", "digit", "numberBelow255", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'['", "'^'", "']'", "'-'", "'='", "'IP'", "','", "'('", 
		"')'", "'DATE'", "'ENUM'", "'LIST'", "'ASSOCIATION'", "'$'", null, "'INTEGER'"
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				express4Data();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << DATE) | (1L << ENUM) | (1L << LIST) | (1L << ASSOCIATION) | (1L << SEPARATOR) | (1L << INTEGER) | (1L << Alphas))) != 0) );
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
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new PrintDateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(57);
					attAndTypeName();
					}
				}

				setState(61);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(60);
					isList();
					}
				}

				setState(63);
				match(DATE);
				setState(65);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(64);
					match(Style4generate);
					}
				}

				setState(67);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new PrintIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(68);
					attAndTypeName();
					}
				}

				setState(72);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(71);
					isList();
					}
				}

				setState(74);
				ip();
				setState(76);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(75);
					match(Style4generate);
					}
				}

				setState(78);
				match(SEPARATOR);
				}
				break;
			case 3:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(80);
					attAndTypeName();
					}
					break;
				}
				setState(84);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(83);
					isList();
					}
				}

				setState(86);
				id();
				setState(88);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(87);
					match(Style4generate);
					}
				}

				setState(90);
				match(SEPARATOR);
				}
				break;
			case 4:
				_localctx = new PrintEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(92);
					attAndTypeName();
					}
				}

				setState(96);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(95);
					isList();
					}
				}

				setState(98);
				match(ENUM);
				setState(100);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(99);
					match(Style4generate);
					}
				}

				setState(102);
				match(SEPARATOR);
				}
				break;
			case 5:
				_localctx = new PrintAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(103);
					attAndTypeName();
					}
					break;
				}
				setState(107);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(106);
					isList();
					}
				}

				setState(109);
				relationship();
				setState(111);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(110);
					match(Style4generate);
					}
				}

				setState(113);
				match(SEPARATOR);
				}
				break;
			case 6:
				_localctx = new PrintIntegerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(115);
					attAndTypeName();
					}
				}

				setState(119);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(118);
					isList();
					}
				}

				setState(121);
				limitedInteger();
				setState(123);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(122);
					match(Style4generate);
					}
				}

				setState(125);
				match(SEPARATOR);
				}
				break;
			case 7:
				_localctx = new PrintValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(127);
					attAndTypeName();
					}
					break;
				}
				setState(131);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(130);
					isList();
					}
				}

				setState(133);
				value4Attribute();
				setState(135);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(134);
					match(Style4generate);
					}
				}

				setState(137);
				match(SEPARATOR);
				}
				break;
			case 8:
				_localctx = new PrintAssociationAttContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==Alphas) {
					{
					setState(139);
					attAndTypeName();
					}
				}

				setState(143);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(142);
					isList();
					}
				}

				setState(145);
				match(ASSOCIATION);
				setState(147);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(146);
					match(Style4generate);
					}
				}

				setState(149);
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
		public TypeNamesContext typeNames() {
			return getRuleContext(TypeNamesContext.class,0);
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
			setState(152);
			classN();
			setState(153);
			attName();
			setState(154);
			typeNames();
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(156);
				match(Alphas);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(164);
				match(Alphas);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
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

	public static class TypeNamesContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(RuleParser.SEPARATOR, 0); }
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> Alphas() { return getTokens(RuleParser.Alphas); }
		public TerminalNode Alphas(int i) {
			return getToken(RuleParser.Alphas, i);
		}
		public TypeNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitTypeNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamesContext typeNames() throws RecognitionException {
		TypeNamesContext _localctx = new TypeNamesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					typeName();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				match(Alphas);
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Alphas );
			setState(183);
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
		enterRule(_localctx, 12, RULE_typeName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					match(Alphas);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(191);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(190);
				match(T__0);
				}
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
		enterRule(_localctx, 14, RULE_isList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LIST);
			setState(194);
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
		enterRule(_localctx, 16, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Alphas) {
				{
				{
				setState(196);
				match(Alphas);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__1);
			setState(203);
			chooseD();
			setState(204);
			match(T__2);
			setState(205);
			number();
			setState(206);
			match(T__3);
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
		enterRule(_localctx, 18, RULE_chooseD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__1);
			setState(209);
			digit();
			setState(210);
			match(T__4);
			setState(211);
			digit();
			setState(212);
			match(T__3);
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
		enterRule(_localctx, 20, RULE_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			className();
			setState(215);
			match(T__0);
			setState(216);
			attributeName();
			setState(217);
			match(T__5);
			setState(218);
			className();
			setState(219);
			match(T__0);
			setState(220);
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
		enterRule(_localctx, 22, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(Alphas);
				}
				}
				setState(225); 
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
		enterRule(_localctx, 24, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				match(Alphas);
				}
				}
				setState(230); 
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
		enterRule(_localctx, 26, RULE_limitedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(INTEGER);
			setState(233);
			number();
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
		enterRule(_localctx, 28, RULE_ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__6);
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
			} while ( _la==T__1 );
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
		enterRule(_localctx, 30, RULE_range4Ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__1);
			setState(243);
			startIp();
			setState(244);
			match(T__7);
			setState(245);
			endIp();
			setState(246);
			match(T__3);
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
		enterRule(_localctx, 32, RULE_number4Ip);
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
		enterRule(_localctx, 34, RULE_startIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			number4Ip();
			setState(251);
			match(T__0);
			setState(252);
			number4Ip();
			setState(253);
			match(T__0);
			setState(254);
			number4Ip();
			setState(255);
			match(T__0);
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
		enterRule(_localctx, 36, RULE_endIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			number4Ip();
			setState(259);
			match(T__0);
			setState(260);
			number4Ip();
			setState(261);
			match(T__0);
			setState(262);
			number4Ip();
			setState(263);
			match(T__0);
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
		enterRule(_localctx, 38, RULE_value4Attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			attributeName();
			setState(267);
			match(T__8);
			setState(268);
			values();
			setState(269);
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
		enterRule(_localctx, 40, RULE_values);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 42, RULE_value);
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
		enterRule(_localctx, 44, RULE_zero);
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
		enterRule(_localctx, 46, RULE_digit);
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
		enterRule(_localctx, 48, RULE_numberBelow255);
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
		enterRule(_localctx, 50, RULE_number);
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
		"\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\5\3=\n\3\3\3\5\3@\n\3"+
		"\3\3\3\3\5\3D\n\3\3\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\3\3\5\3O\n\3\3\3\3"+
		"\3\3\3\5\3T\n\3\3\3\5\3W\n\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\5\3`\n\3\3\3"+
		"\5\3c\n\3\3\3\3\3\5\3g\n\3\3\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\3\3\5\3r"+
		"\n\3\3\3\3\3\3\3\5\3w\n\3\3\3\5\3z\n\3\3\3\3\3\5\3~\n\3\3\3\3\3\3\3\5"+
		"\3\u0083\n\3\3\3\5\3\u0086\n\3\3\3\3\3\5\3\u008a\n\3\3\3\3\3\3\3\5\3\u008f"+
		"\n\3\3\3\5\3\u0092\n\3\3\3\3\3\5\3\u0096\n\3\3\3\5\3\u0099\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3\13\5\3\5\3\5\3\6\7\6\u00a8\n"+
		"\6\f\6\16\6\u00ab\13\6\3\6\3\6\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3"+
		"\7\6\7\u00b6\n\7\r\7\16\7\u00b7\3\7\3\7\3\b\6\b\u00bd\n\b\r\b\16\b\u00be"+
		"\3\b\5\b\u00c2\n\b\3\t\3\t\3\t\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\6\r\u00e2\n\r\r\r\16\r\u00e3\3\16\6\16\u00e7\n\16\r"+
		"\16\16\16\u00e8\3\17\3\17\3\17\3\17\3\20\3\20\6\20\u00f1\n\20\r\20\16"+
		"\20\u00f2\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\7\26\u0113\n\26\f\26\16\26\u0116\13\26\3\26\7\26"+
		"\u0119\n\26\f\26\16\26\u011c\13\26\3\27\7\27\u011f\n\27\f\27\16\27\u0122"+
		"\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u012c\n\32\3\33\3"+
		"\33\5\33\u0130\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\3\3\2\25\26\u0146\2\67\3\2\2\2\4\u0098\3\2\2\2\6"+
		"\u009a\3\2\2\2\b\u00a1\3\2\2\2\n\u00a9\3\2\2\2\f\u00b1\3\2\2\2\16\u00bc"+
		"\3\2\2\2\20\u00c3\3\2\2\2\22\u00c9\3\2\2\2\24\u00d2\3\2\2\2\26\u00d8\3"+
		"\2\2\2\30\u00e1\3\2\2\2\32\u00e6\3\2\2\2\34\u00ea\3\2\2\2\36\u00ee\3\2"+
		"\2\2 \u00f4\3\2\2\2\"\u00fa\3\2\2\2$\u00fc\3\2\2\2&\u0104\3\2\2\2(\u010c"+
		"\3\2\2\2*\u0114\3\2\2\2,\u0120\3\2\2\2.\u0125\3\2\2\2\60\u0127\3\2\2\2"+
		"\62\u012b\3\2\2\2\64\u012f\3\2\2\2\668\5\4\3\2\67\66\3\2\2\289\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;=\5\6\4\2<;\3\2\2\2<=\3\2\2\2=?\3\2"+
		"\2\2>@\5\20\t\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\7\r\2\2BD\7\22\2\2CB\3"+
		"\2\2\2CD\3\2\2\2DE\3\2\2\2E\u0099\7\21\2\2FH\5\6\4\2GF\3\2\2\2GH\3\2\2"+
		"\2HJ\3\2\2\2IK\5\20\t\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LN\5\36\20\2MO\7"+
		"\22\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\21\2\2Q\u0099\3\2\2\2RT\5\6"+
		"\4\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\20\t\2VU\3\2\2\2VW\3\2\2\2WX\3"+
		"\2\2\2XZ\5\22\n\2Y[\7\22\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\21\2"+
		"\2]\u0099\3\2\2\2^`\5\6\4\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\5\20\t\2b"+
		"a\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\7\16\2\2eg\7\22\2\2fe\3\2\2\2fg\3\2\2"+
		"\2gh\3\2\2\2h\u0099\7\21\2\2ik\5\6\4\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2l"+
		"n\5\20\t\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\5\26\f\2pr\7\22\2\2qp\3\2\2"+
		"\2qr\3\2\2\2rs\3\2\2\2st\7\21\2\2t\u0099\3\2\2\2uw\5\6\4\2vu\3\2\2\2v"+
		"w\3\2\2\2wy\3\2\2\2xz\5\20\t\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\5\34\17"+
		"\2|~\7\22\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\21\2\2\u0080"+
		"\u0099\3\2\2\2\u0081\u0083\5\6\4\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\20\t\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\5(\25\2\u0088\u008a\7\22"+
		"\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\7\21\2\2\u008c\u0099\3\2\2\2\u008d\u008f\5\6\4\2\u008e\u008d\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0092\5\20\t\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\20"+
		"\2\2\u0094\u0096\7\22\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\7\21\2\2\u0098<\3\2\2\2\u0098G\3\2\2\2\u0098"+
		"S\3\2\2\2\u0098_\3\2\2\2\u0098j\3\2\2\2\u0098v\3\2\2\2\u0098\u0082\3\2"+
		"\2\2\u0098\u008e\3\2\2\2\u0099\5\3\2\2\2\u009a\u009b\5\b\5\2\u009b\u009c"+
		"\5\n\6\2\u009c\u009d\5\f\7\2\u009d\7\3\2\2\2\u009e\u00a0\7\24\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5"+
		"\t\3\2\2\2\u00a6\u00a8\7\24\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\13\3\2\2\2\u00ae\u00b0\5\16\b\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7\24\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\21\2\2\u00ba\r\3\2\2\2\u00bb\u00bd"+
		"\7\24\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\7\3\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\7\17\2\2\u00c4"+
		"\u00c5\5\64\33\2\u00c5\21\3\2\2\2\u00c6\u00c8\7\24\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\5\24"+
		"\13\2\u00ce\u00cf\7\5\2\2\u00cf\u00d0\5\64\33\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\23\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\5\60\31\2\u00d4\u00d5\7\7"+
		"\2\2\u00d5\u00d6\5\60\31\2\u00d6\u00d7\7\6\2\2\u00d7\25\3\2\2\2\u00d8"+
		"\u00d9\5\30\r\2\u00d9\u00da\7\3\2\2\u00da\u00db\5\32\16\2\u00db\u00dc"+
		"\7\b\2\2\u00dc\u00dd\5\30\r\2\u00dd\u00de\7\3\2\2\u00de\u00df\5\32\16"+
		"\2\u00df\27\3\2\2\2\u00e0\u00e2\7\24\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\31\3\2\2\2\u00e5"+
		"\u00e7\7\24\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\33\3\2\2\2\u00ea\u00eb\7\23\2\2\u00eb"+
		"\u00ec\5\64\33\2\u00ec\u00ed\5\64\33\2\u00ed\35\3\2\2\2\u00ee\u00f0\7"+
		"\t\2\2\u00ef\u00f1\5 \21\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7\4\2"+
		"\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\5&\24\2\u00f8\u00f9"+
		"\7\6\2\2\u00f9!\3\2\2\2\u00fa\u00fb\5\62\32\2\u00fb#\3\2\2\2\u00fc\u00fd"+
		"\5\"\22\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\7\3\2\2"+
		"\u0100\u0101\5\"\22\2\u0101\u0102\7\3\2\2\u0102\u0103\5\"\22\2\u0103%"+
		"\3\2\2\2\u0104\u0105\5\"\22\2\u0105\u0106\7\3\2\2\u0106\u0107\5\"\22\2"+
		"\u0107\u0108\7\3\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7\3\2\2\u010a\u010b"+
		"\5\"\22\2\u010b\'\3\2\2\2\u010c\u010d\5\32\16\2\u010d\u010e\7\13\2\2\u010e"+
		"\u010f\5*\26\2\u010f\u0110\7\f\2\2\u0110)\3\2\2\2\u0111\u0113\5,\27\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u011a\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7\24\2\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b+\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\24\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\n\2\2\u0124"+
		"-\3\2\2\2\u0125\u0126\7\25\2\2\u0126/\3\2\2\2\u0127\u0128\t\2\2\2\u0128"+
		"\61\3\2\2\2\u0129\u012c\5\60\31\2\u012a\u012c\7\27\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012a\3\2\2\2\u012c\63\3\2\2\2\u012d\u0130\5\62\32\2\u012e"+
		"\u0130\7\30\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\65\3\2\2"+
		"\2+9<?CGJNSVZ_bfjmqvy}\u0082\u0085\u0089\u008e\u0091\u0095\u0098\u00a1"+
		"\u00a9\u00b1\u00b7\u00be\u00c1\u00c9\u00e3\u00e8\u00f2\u0114\u011a\u0120"+
		"\u012b\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}