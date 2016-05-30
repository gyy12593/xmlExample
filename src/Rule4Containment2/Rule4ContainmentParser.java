package Rule4Containment2;
// Generated from Rule4Containment.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Rule4ContainmentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ALPHAS=2, CONTAINS=3, EVERY=4, DIGIT=5, INT=6, WS=7;
	public static final int
		RULE_prog = 0, RULE_description4instances = 1, RULE_example4class = 2, 
		RULE_className = 3, RULE_number4class = 4;
	public static final String[] ruleNames = {
		"prog", "description4instances", "example4class", "className", "number4class"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", null, "'contains'", "'every'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ALPHAS", "CONTAINS", "EVERY", "DIGIT", "INT", "WS"
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
	public String getGrammarFileName() { return "Rule4Containment.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Rule4ContainmentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Description4instancesContext description4instances() {
			return getRuleContext(Description4instancesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rule4ContainmentVisitor ) return ((Rule4ContainmentVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			description4instances();
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

	public static class Description4instancesContext extends ParserRuleContext {
		public List<Example4classContext> example4class() {
			return getRuleContexts(Example4classContext.class);
		}
		public Example4classContext example4class(int i) {
			return getRuleContext(Example4classContext.class,i);
		}
		public Description4instancesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description4instances; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rule4ContainmentVisitor ) return ((Rule4ContainmentVisitor<? extends T>)visitor).visitDescription4instances(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Description4instancesContext description4instances() throws RecognitionException {
		Description4instancesContext _localctx = new Description4instancesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_description4instances);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				example4class();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHAS) | (1L << CONTAINS) | (1L << EVERY))) != 0) );
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

	public static class Example4classContext extends ParserRuleContext {
		public Example4classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example4class; }
	 
		public Example4classContext() { }
		public void copyFrom(Example4classContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Process4simpleContext extends Example4classContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public TerminalNode CONTAINS() { return getToken(Rule4ContainmentParser.CONTAINS, 0); }
		public Number4classContext number4class() {
			return getRuleContext(Number4classContext.class,0);
		}
		public Process4simpleContext(Example4classContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rule4ContainmentVisitor ) return ((Rule4ContainmentVisitor<? extends T>)visitor).visitProcess4simple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Process4specialContext extends Example4classContext {
		public TerminalNode EVERY() { return getToken(Rule4ContainmentParser.EVERY, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public TerminalNode CONTAINS() { return getToken(Rule4ContainmentParser.CONTAINS, 0); }
		public Number4classContext number4class() {
			return getRuleContext(Number4classContext.class,0);
		}
		public Process4specialContext(Example4classContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rule4ContainmentVisitor ) return ((Rule4ContainmentVisitor<? extends T>)visitor).visitProcess4special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Example4classContext example4class() throws RecognitionException {
		Example4classContext _localctx = new Example4classContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_example4class);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case EVERY:
				_localctx = new Process4specialContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(EVERY);
				setState(18);
				className();
				setState(19);
				match(CONTAINS);
				setState(20);
				number4class();
				setState(21);
				className();
				setState(22);
				match(T__0);
				}
				break;
			case ALPHAS:
			case CONTAINS:
				_localctx = new Process4simpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				className();
				setState(25);
				match(CONTAINS);
				setState(26);
				number4class();
				setState(27);
				className();
				setState(28);
				match(T__0);
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

	public static class ClassNameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHAS() { return getTokens(Rule4ContainmentParser.ALPHAS); }
		public TerminalNode ALPHAS(int i) {
			return getToken(Rule4ContainmentParser.ALPHAS, i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rule4ContainmentVisitor ) return ((Rule4ContainmentVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHAS) {
				{
				{
				setState(32);
				match(ALPHAS);
				}
				}
				setState(37);
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

	public static class Number4classContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(Rule4ContainmentParser.DIGIT, 0); }
		public TerminalNode INT() { return getToken(Rule4ContainmentParser.INT, 0); }
		public Number4classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number4class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rule4ContainmentVisitor ) return ((Rule4ContainmentVisitor<? extends T>)visitor).visitNumber4class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number4classContext number4class() throws RecognitionException {
		Number4classContext _localctx = new Number4classContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number4class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\6\3\20\n\3\r\3\16\3\21\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\7\5$\n\5\f\5"+
		"\16\5\'\13\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\7\b(\2\f\3\2\2\2\4\17"+
		"\3\2\2\2\6 \3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\20"+
		"\5\6\4\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\5"+
		"\3\2\2\2\23\24\7\6\2\2\24\25\5\b\5\2\25\26\7\5\2\2\26\27\5\n\6\2\27\30"+
		"\5\b\5\2\30\31\7\3\2\2\31!\3\2\2\2\32\33\5\b\5\2\33\34\7\5\2\2\34\35\5"+
		"\n\6\2\35\36\5\b\5\2\36\37\7\3\2\2\37!\3\2\2\2 \23\3\2\2\2 \32\3\2\2\2"+
		"!\7\3\2\2\2\"$\7\4\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\t\3"+
		"\2\2\2\'%\3\2\2\2()\t\2\2\2)\13\3\2\2\2\5\21 %";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}