package Rule;
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
		DATE=10, ENUM=11, Style4generate=12, INTEGER=13, ALPHAS=14, DIGIT=15, 
		INT=16, WS=17;
	public static final int
		RULE_prog = 0, RULE_express4Data = 1, RULE_attName = 2, RULE_typeName = 3, 
		RULE_id = 4, RULE_chooseD = 5, RULE_relationship = 6, RULE_className = 7, 
		RULE_attributeName = 8, RULE_limitedInteger = 9, RULE_number4Integer = 10, 
		RULE_ip = 11, RULE_range4Ip = 12, RULE_number4Ip = 13, RULE_startIp = 14, 
		RULE_endIp = 15;
	public static final String[] ruleNames = {
		"prog", "express4Data", "attName", "typeName", "id", "chooseD", "relationship", 
		"className", "attributeName", "limitedInteger", "number4Integer", "ip", 
		"range4Ip", "number4Ip", "startIp", "endIp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'['", "'^'", "']'", "'-'", "'.'", "'='", "'IP'", "','", 
		"'DATE'", "'ENUM'", null, "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "DATE", "ENUM", 
		"Style4generate", "INTEGER", "ALPHAS", "DIGIT", "INT", "WS"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				express4Data();
				}
				}
				setState(35); 
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
	public static class PrintIPContext extends Express4DataContext {
		public IpContext ip() {
			return getRuleContext(IpContext.class,0);
		}
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new PrintDateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(37);
					attName();
					}
					break;
				}
				setState(41);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(40);
					typeName();
					}
				}

				setState(43);
				match(DATE);
				setState(45);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(44);
					match(Style4generate);
					}
				}

				setState(47);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new PrintIPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(48);
					attName();
					}
					break;
				}
				setState(52);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(51);
					typeName();
					}
				}

				setState(54);
				ip();
				setState(56);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(55);
					match(Style4generate);
					}
				}

				setState(58);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(60);
					attName();
					}
					break;
				}
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(63);
					typeName();
					}
					break;
				}
				setState(66);
				id();
				setState(68);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(67);
					match(Style4generate);
					}
				}

				setState(70);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new PrintEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(72);
					attName();
					}
					break;
				}
				setState(76);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(75);
					typeName();
					}
				}

				setState(78);
				match(ENUM);
				setState(80);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(79);
					match(Style4generate);
					}
				}

				setState(82);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new PrintAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(83);
					attName();
					}
					break;
				}
				setState(87);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(86);
					typeName();
					}
					break;
				}
				setState(89);
				relationship();
				setState(91);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(90);
					match(Style4generate);
					}
				}

				setState(93);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new PrintIntegerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(95);
					attName();
					}
					break;
				}
				setState(99);
				_la = _input.LA(1);
				if (_la==T__0 || _la==ALPHAS) {
					{
					setState(98);
					typeName();
					}
				}

				setState(101);
				limitedInteger();
				setState(103);
				_la = _input.LA(1);
				if (_la==Style4generate) {
					{
					setState(102);
					match(Style4generate);
					}
				}

				setState(105);
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
		enterRule(_localctx, 4, RULE_attName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(109);
				match(ALPHAS);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		enterRule(_localctx, 6, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(117);
				match(ALPHAS);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		enterRule(_localctx, 8, RULE_id);
		int _la;
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Process4Id1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALPHAS) {
					{
					{
					setState(125);
					match(ALPHAS);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__1);
				setState(132);
				chooseD();
				setState(133);
				match(T__2);
				setState(134);
				match(DIGIT);
				setState(135);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new Process4Id2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALPHAS) {
					{
					{
					setState(137);
					match(ALPHAS);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__1);
				setState(144);
				chooseD();
				setState(145);
				match(T__2);
				setState(146);
				match(INT);
				setState(147);
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
		enterRule(_localctx, 10, RULE_chooseD);
		try {
			_localctx = new ChooseDigitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__1);
			setState(152);
			match(DIGIT);
			setState(153);
			match(T__4);
			setState(154);
			match(DIGIT);
			setState(155);
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
		enterRule(_localctx, 12, RULE_relationship);
		try {
			_localctx = new Process4relationshipContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			className();
			setState(158);
			match(T__5);
			setState(159);
			attributeName();
			setState(160);
			match(T__6);
			setState(161);
			className();
			setState(162);
			match(T__5);
			setState(163);
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
		enterRule(_localctx, 14, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(ALPHAS);
				}
				}
				setState(168); 
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
		enterRule(_localctx, 16, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(ALPHAS);
				}
				}
				setState(173); 
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
		enterRule(_localctx, 18, RULE_limitedInteger);
		try {
			_localctx = new Process4limitedInteger1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(INTEGER);
			setState(176);
			number4Integer();
			setState(177);
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
		enterRule(_localctx, 20, RULE_number4Integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 22, RULE_ip);
		int _la;
		try {
			_localctx = new Process4IpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__7);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				range4Ip();
				}
				}
				setState(185); 
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
		enterRule(_localctx, 24, RULE_range4Ip);
		try {
			_localctx = new Process4Range4IpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__1);
			setState(188);
			startIp();
			setState(189);
			match(T__8);
			setState(190);
			endIp();
			setState(191);
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
		enterRule(_localctx, 26, RULE_number4Ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 28, RULE_startIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			number4Ip();
			setState(196);
			match(T__5);
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
		enterRule(_localctx, 30, RULE_endIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			number4Ip();
			setState(204);
			match(T__5);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\5\3)\n\3\3\3\5\3,\n\3\3\3\3\3\5\3\60\n\3\3\3\3\3\5"+
		"\3\64\n\3\3\3\5\3\67\n\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\5\3@\n\3\3\3\5\3"+
		"C\n\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\5\3L\n\3\3\3\5\3O\n\3\3\3\3\3\5\3S"+
		"\n\3\3\3\3\3\5\3W\n\3\3\3\5\3Z\n\3\3\3\3\3\5\3^\n\3\3\3\3\3\3\3\5\3c\n"+
		"\3\3\3\5\3f\n\3\3\3\3\3\5\3j\n\3\3\3\3\3\5\3n\n\3\3\4\7\4q\n\4\f\4\16"+
		"\4t\13\4\3\4\3\4\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\6\7\6\u0081\n\6"+
		"\f\6\16\6\u0084\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16"+
		"\6\u0090\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0098\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\t\u00a9\n\t\r\t\16\t\u00aa"+
		"\3\n\6\n\u00ae\n\n\r\n\16\n\u00af\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\6\r\u00ba\n\r\r\r\16\r\u00bb\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2"+
		"\21\22\u00e5\2#\3\2\2\2\4m\3\2\2\2\6r\3\2\2\2\bz\3\2\2\2\n\u0097\3\2\2"+
		"\2\f\u0099\3\2\2\2\16\u009f\3\2\2\2\20\u00a8\3\2\2\2\22\u00ad\3\2\2\2"+
		"\24\u00b1\3\2\2\2\26\u00b5\3\2\2\2\30\u00b7\3\2\2\2\32\u00bd\3\2\2\2\34"+
		"\u00c3\3\2\2\2\36\u00c5\3\2\2\2 \u00cd\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$"+
		"%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2"+
		"\2)+\3\2\2\2*,\5\b\5\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\f\2\2.\60\7\16"+
		"\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61n\7\3\2\2\62\64\5\6\4\2\63"+
		"\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\66"+
		"\67\3\2\2\2\678\3\2\2\28:\5\30\r\29;\7\16\2\2:9\3\2\2\2:;\3\2\2\2;<\3"+
		"\2\2\2<=\7\3\2\2=n\3\2\2\2>@\5\6\4\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\5"+
		"\b\5\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\5\n\6\2EG\7\16\2\2FE\3\2\2\2FG"+
		"\3\2\2\2GH\3\2\2\2HI\7\3\2\2In\3\2\2\2JL\5\6\4\2KJ\3\2\2\2KL\3\2\2\2L"+
		"N\3\2\2\2MO\5\b\5\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7\r\2\2QS\7\16\2\2"+
		"RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2Tn\7\3\2\2UW\5\6\4\2VU\3\2\2\2VW\3\2\2\2"+
		"WY\3\2\2\2XZ\5\b\5\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\5\16\b\2\\^\7\16"+
		"\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\3\2\2`n\3\2\2\2ac\5\6\4\2ba\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\b\5\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5"+
		"\24\13\2hj\7\16\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\3\2\2ln\3\2\2\2"+
		"m(\3\2\2\2m\63\3\2\2\2m?\3\2\2\2mK\3\2\2\2mV\3\2\2\2mb\3\2\2\2n\5\3\2"+
		"\2\2oq\7\20\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3"+
		"\2\2\2uv\7\3\2\2v\7\3\2\2\2wy\7\20\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z"+
		"{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\3\2\2~\t\3\2\2\2\177\u0081\7\20\2\2"+
		"\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0087\5\f\7\2\u0087\u0088\7\5\2\2\u0088\u0089\7\21\2\2\u0089\u008a\7"+
		"\6\2\2\u008a\u0098\3\2\2\2\u008b\u008d\7\20\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\4\2\2\u0092\u0093\5\f\7\2\u0093"+
		"\u0094\7\5\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7\6\2\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0082\3\2\2\2\u0097\u008e\3\2\2\2\u0098\13\3\2\2\2\u0099"+
		"\u009a\7\4\2\2\u009a\u009b\7\21\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7"+
		"\21\2\2\u009d\u009e\7\6\2\2\u009e\r\3\2\2\2\u009f\u00a0\5\20\t\2\u00a0"+
		"\u00a1\7\b\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5"+
		"\20\t\2\u00a4\u00a5\7\b\2\2\u00a5\u00a6\5\22\n\2\u00a6\17\3\2\2\2\u00a7"+
		"\u00a9\7\20\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00ae\7\20\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\5\26\f\2\u00b3"+
		"\u00b4\5\26\f\2\u00b4\25\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\27\3\2\2\2"+
		"\u00b7\u00b9\7\n\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd"+
		"\u00be\7\4\2\2\u00be\u00bf\5\36\20\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1"+
		"\5 \21\2\u00c1\u00c2\7\6\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5\34"+
		"\17\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\7\b\2\2\u00cb"+
		"\u00cc\5\34\17\2\u00cc\37\3\2\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\7"+
		"\b\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5\34\17\2"+
		"\u00d2\u00d3\7\b\2\2\u00d3\u00d4\5\34\17\2\u00d4!\3\2\2\2\36%(+/\63\66"+
		":?BFKNRVY]beimrz\u0082\u008e\u0097\u00aa\u00af\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}