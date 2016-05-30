package Rule1;
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
		T__9=10, T__10=11, DATE=12, ENUM=13, Style4generate=14, INTEGER=15, ALPHAS=16, 
		DIGIT=17, INT=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_express4Data = 1, RULE_attAndTypeName = 2, RULE_attName = 3, 
		RULE_typeName = 4, RULE_id = 5, RULE_chooseD = 6, RULE_relationship = 7, 
		RULE_className = 8, RULE_attributeName = 9, RULE_limitedInteger = 10, 
		RULE_number4Integer = 11, RULE_ip = 12, RULE_range4Ip = 13, RULE_number4Ip = 14, 
		RULE_startIp = 15, RULE_endIp = 16, RULE_value4Attribute = 17, RULE_values = 18, 
		RULE_value = 19;
	public static final String[] ruleNames = {
		"prog", "express4Data", "attAndTypeName", "attName", "typeName", "id", 
		"chooseD", "relationship", "className", "attributeName", "limitedInteger", 
		"number4Integer", "ip", "range4Ip", "number4Ip", "startIp", "endIp", "value4Attribute", 
		"values", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'['", "'^'", "']'", "'-'", "'.'", "'='", "'IP'", "','", 
		"'('", "')'", "'DATE'", "'ENUM'", null, "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"DATE", "ENUM", "Style4generate", "INTEGER", "ALPHAS", "DIGIT", "INT", 
		"WS"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				express4Data();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << DATE) | (1L << ENUM) | (1L << INTEGER) | (1L << ALPHAS))) != 0) );
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
		public AttAndTypeNameContext attAndTypeName() {
			return getRuleContext(AttAndTypeNameContext.class,0);
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PrintDateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(45);
					attAndTypeName();
					}
				}

				setState(48);
				match(DATE);
				setState(50);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(49);
					match(Style4generate);
					}
				}

				setState(52);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new PrintIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(53);
					attAndTypeName();
					}
				}

				setState(56);
				ip();
				setState(58);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(57);
					match(Style4generate);
					}
				}

				setState(60);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(62);
					attAndTypeName();
					}
					break;
				}
				setState(65);
				id();
				setState(67);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(66);
					match(Style4generate);
					}
				}

				setState(69);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new PrintEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(71);
					attAndTypeName();
					}
				}

				setState(74);
				match(ENUM);
				setState(76);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(75);
					match(Style4generate);
					}
				}

				setState(78);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new PrintAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(79);
					attAndTypeName();
					}
					break;
				}
				setState(82);
				relationship();
				setState(84);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(83);
					match(Style4generate);
					}
				}

				setState(86);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new PrintIntegerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(88);
					attAndTypeName();
					}
				}

				setState(91);
				limitedInteger();
				setState(93);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(92);
					match(Style4generate);
					}
				}

				setState(95);
				match(T__0);
				}
				break;
			case 7:
				_localctx = new PrintValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(97);
					attAndTypeName();
					}
					break;
				}
				setState(100);
				value4Attribute();
				setState(102);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(101);
					match(Style4generate);
					}
				}

				setState(104);
				match(T__0);
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
			setState(108);
			attName();
			setState(109);
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
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(111);
				match(ALPHAS);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__0);
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
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(119);
				match(ALPHAS);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__0);
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
		public TerminalNode INT() { return getToken(RuleParser.INT, 0); }
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
		public TerminalNode DIGIT() { return getToken(RuleParser.DIGIT, 0); }
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
		enterRule(_localctx, 10, RULE_id);
		int _la;
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Process4Id1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALPHAS) {
					{
					{
					setState(127);
					match(ALPHAS);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__1);
				setState(134);
				chooseD();
				setState(135);
				match(T__2);
				setState(136);
				match(DIGIT);
				setState(137);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new Process4Id2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALPHAS) {
					{
					{
					setState(139);
					match(ALPHAS);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__1);
				setState(146);
				chooseD();
				setState(147);
				match(T__2);
				setState(148);
				match(INT);
				setState(149);
				match(T__3);
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
		public List<TerminalNode> DIGIT() { return getTokens(RuleParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RuleParser.DIGIT, i);
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
		enterRule(_localctx, 12, RULE_chooseD);
		try {
			_localctx = new ChooseDigitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__1);
			setState(154);
			match(DIGIT);
			setState(155);
			match(T__4);
			setState(156);
			match(DIGIT);
			setState(157);
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
		enterRule(_localctx, 14, RULE_relationship);
		try {
			_localctx = new Process4relationshipContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			className();
			setState(160);
			match(T__5);
			setState(161);
			attributeName();
			setState(162);
			match(T__6);
			setState(163);
			className();
			setState(164);
			match(T__5);
			setState(165);
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
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
		enterRule(_localctx, 16, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(ALPHAS);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHAS );
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
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
		enterRule(_localctx, 18, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				match(ALPHAS);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHAS );
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
		enterRule(_localctx, 20, RULE_limitedInteger);
		try {
			_localctx = new Process4limitedInteger1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(INTEGER);
			setState(178);
			number4Integer();
			setState(179);
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
		public TerminalNode DIGIT() { return getToken(RuleParser.DIGIT, 0); }
		public TerminalNode INT() { return getToken(RuleParser.INT, 0); }
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
		enterRule(_localctx, 22, RULE_number4Integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==INT) ) {
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
		enterRule(_localctx, 24, RULE_ip);
		int _la;
		try {
			_localctx = new Process4IpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__7);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				range4Ip();
				}
				}
				setState(187); 
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
		enterRule(_localctx, 26, RULE_range4Ip);
		try {
			_localctx = new Process4Range4IpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__1);
			setState(190);
			startIp();
			setState(191);
			match(T__8);
			setState(192);
			endIp();
			setState(193);
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
		public TerminalNode DIGIT() { return getToken(RuleParser.DIGIT, 0); }
		public TerminalNode INT() { return getToken(RuleParser.INT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==INT) ) {
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
		enterRule(_localctx, 30, RULE_startIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			number4Ip();
			setState(198);
			match(T__5);
			setState(199);
			number4Ip();
			setState(200);
			match(T__5);
			setState(201);
			number4Ip();
			setState(202);
			match(T__5);
			setState(203);
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
			setState(205);
			number4Ip();
			setState(206);
			match(T__5);
			setState(207);
			number4Ip();
			setState(208);
			match(T__5);
			setState(209);
			number4Ip();
			setState(210);
			match(T__5);
			setState(211);
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
		enterRule(_localctx, 34, RULE_value4Attribute);
		try {
			_localctx = new Process4value4AttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			attributeName();
			setState(214);
			match(T__9);
			setState(215);
			values();
			setState(216);
			match(T__10);
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
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
		enterRule(_localctx, 36, RULE_values);
		int _la;
		try {
			int _alt;
			_localctx = new Process4valuesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					value();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(224);
				match(ALPHAS);
				}
				}
				setState(229);
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
		public List<TerminalNode> ALPHAS() { return getTokens(RuleParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(RuleParser.ALPHAS, i);
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(230);
				match(ALPHAS);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00f1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\5\3\61\n\3\3"+
		"\3\3\3\5\3\65\n\3\3\3\3\3\5\39\n\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\5\3B\n"+
		"\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\5\3O\n\3\3\3\3\3\5\3"+
		"S\n\3\3\3\3\3\5\3W\n\3\3\3\3\3\3\3\5\3\\\n\3\3\3\3\3\5\3`\n\3\3\3\3\3"+
		"\3\3\5\3e\n\3\3\3\3\3\5\3i\n\3\3\3\3\3\5\3m\n\3\3\4\3\4\3\4\3\5\7\5s\n"+
		"\5\f\5\16\5v\13\5\3\5\3\5\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\7\7\7"+
		"\u0083\n\7\f\7\16\7\u0086\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008f\n"+
		"\7\f\7\16\7\u0092\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n\u00ab\n\n\r\n\16"+
		"\n\u00ac\3\13\6\13\u00b0\n\13\r\13\16\13\u00b1\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\6\16\u00bc\n\16\r\16\16\16\u00bd\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\7\24\u00de\n\24"+
		"\f\24\16\24\u00e1\13\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7\13\24\3"+
		"\25\7\25\u00ea\n\25\f\25\16\25\u00ed\13\25\3\25\3\25\3\25\2\2\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\23\24\u00fc\2+\3\2\2\2"+
		"\4l\3\2\2\2\6n\3\2\2\2\bt\3\2\2\2\n|\3\2\2\2\f\u0099\3\2\2\2\16\u009b"+
		"\3\2\2\2\20\u00a1\3\2\2\2\22\u00aa\3\2\2\2\24\u00af\3\2\2\2\26\u00b3\3"+
		"\2\2\2\30\u00b7\3\2\2\2\32\u00b9\3\2\2\2\34\u00bf\3\2\2\2\36\u00c5\3\2"+
		"\2\2 \u00c7\3\2\2\2\"\u00cf\3\2\2\2$\u00d7\3\2\2\2&\u00df\3\2\2\2(\u00eb"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2"+
		"/\61\5\6\4\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\64\7\16\2\2\63"+
		"\65\7\20\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66m\7\3\2\2\67"+
		"9\5\6\4\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:<\5\32\16\2;=\7\20\2\2<;\3\2"+
		"\2\2<=\3\2\2\2=>\3\2\2\2>?\7\3\2\2?m\3\2\2\2@B\5\6\4\2A@\3\2\2\2AB\3\2"+
		"\2\2BC\3\2\2\2CE\5\f\7\2DF\7\20\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7"+
		"\3\2\2Hm\3\2\2\2IK\5\6\4\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LN\7\17\2\2MO"+
		"\7\20\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2Pm\7\3\2\2QS\5\6\4\2RQ\3\2\2\2"+
		"RS\3\2\2\2ST\3\2\2\2TV\5\20\t\2UW\7\20\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2"+
		"\2XY\7\3\2\2Ym\3\2\2\2Z\\\5\6\4\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\5"+
		"\26\f\2^`\7\20\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\3\2\2bm\3\2\2\2c"+
		"e\5\6\4\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\5$\23\2gi\7\20\2\2hg\3\2\2\2"+
		"hi\3\2\2\2ij\3\2\2\2jk\7\3\2\2km\3\2\2\2l\60\3\2\2\2l8\3\2\2\2lA\3\2\2"+
		"\2lJ\3\2\2\2lR\3\2\2\2l[\3\2\2\2ld\3\2\2\2m\5\3\2\2\2no\5\b\5\2op\5\n"+
		"\6\2p\7\3\2\2\2qs\7\22\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3"+
		"\2\2\2vt\3\2\2\2wx\7\3\2\2x\t\3\2\2\2y{\7\22\2\2zy\3\2\2\2{~\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\3\2\2\u0080\13"+
		"\3\2\2\2\u0081\u0083\7\22\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\5\2\2"+
		"\u008a\u008b\7\23\2\2\u008b\u008c\7\6\2\2\u008c\u009a\3\2\2\2\u008d\u008f"+
		"\7\22\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094"+
		"\7\4\2\2\u0094\u0095\5\16\b\2\u0095\u0096\7\5\2\2\u0096\u0097\7\24\2\2"+
		"\u0097\u0098\7\6\2\2\u0098\u009a\3\2\2\2\u0099\u0084\3\2\2\2\u0099\u0090"+
		"\3\2\2\2\u009a\r\3\2\2\2\u009b\u009c\7\4\2\2\u009c\u009d\7\23\2\2\u009d"+
		"\u009e\7\7\2\2\u009e\u009f\7\23\2\2\u009f\u00a0\7\6\2\2\u00a0\17\3\2\2"+
		"\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5\24\13\2\u00a4"+
		"\u00a5\7\t\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\5"+
		"\24\13\2\u00a8\21\3\2\2\2\u00a9\u00ab\7\22\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2"+
		"\2\u00ae\u00b0\7\22\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7\21\2"+
		"\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\5\30\r\2\u00b6\27\3\2\2\2\u00b7\u00b8"+
		"\t\2\2\2\u00b8\31\3\2\2\2\u00b9\u00bb\7\n\2\2\u00ba\u00bc\5\34\17\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\33\3\2\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2"+
		"\7\13\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\7\6\2\2\u00c4\35\3\2\2\2\u00c5"+
		"\u00c6\t\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9\7\b"+
		"\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7\b\2\2\u00cd\u00ce\5\36\20\2\u00ce!\3\2\2\2\u00cf\u00d0\5\36\20"+
		"\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\b\2\2\u00d3"+
		"\u00d4\5\36\20\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5\36\20\2\u00d6#\3\2"+
		"\2\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\5&\24\2\u00da"+
		"\u00db\7\r\2\2\u00db%\3\2\2\2\u00dc\u00de\5(\25\2\u00dd\u00dc\3\2\2\2"+
		"\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e5"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\22\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\7\22\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\13\2\2\u00ef)\3\2\2\2\35-\60\64"+
		"8<AEJNRV[_dhlt|\u0084\u0090\u0099\u00ac\u00b1\u00bd\u00df\u00e5\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}