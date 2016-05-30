package Rule3;
// Generated from Rule.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DATE=11, ENUM=12, LIST=13, SEPARATOR=14, Style4generate=15, INTEGER=16, 
		Alphas=17, Zero=18, Number1To9=19, Number10To255=20, NumberAfter255=21, 
		WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "DATE", "ENUM", "LIST", "SEPARATOR", "RANDOM", "CYCLE", "TRAVERSAL", 
		"BOUNDARY", "COMPLEX", "Style4generate", "INTEGER", "Alphas", "Zero", 
		"Number1To9", "Number10To255", "NumberAfter255", "WS"
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


	public RuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00c3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u008d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00a8\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\6\33\u00b7\n\33\r\33\16\33\u00b8\5\33\u00bb\n\33\3\34"+
		"\6\34\u00be\n\34\r\34\16\34\u00bf\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\2\'\2)"+
		"\21+\22-\23/\24\61\25\63\26\65\27\67\30\3\2\16\5\2C\\aac|\3\2\62\62\3"+
		"\2\63;\3\2\62;\3\2\63\63\3\2\64\64\3\2\62\66\3\2\67\67\3\2\62\67\3\28"+
		";\3\2\65;\5\2\13\f\17\17\"\"\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2"+
		"\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2"+
		"\2\2\27N\3\2\2\2\31S\3\2\2\2\33X\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!f\3\2"+
		"\2\2#l\3\2\2\2%v\3\2\2\2\'\177\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-"+
		"\u0096\3\2\2\2/\u0098\3\2\2\2\61\u009a\3\2\2\2\63\u00a7\3\2\2\2\65\u00ba"+
		"\3\2\2\2\67\u00bd\3\2\2\29:\7]\2\2:\4\3\2\2\2;<\7`\2\2<\6\3\2\2\2=>\7"+
		"_\2\2>\b\3\2\2\2?@\7/\2\2@\n\3\2\2\2AB\7\60\2\2B\f\3\2\2\2CD\7?\2\2D\16"+
		"\3\2\2\2EF\7K\2\2FG\7R\2\2G\20\3\2\2\2HI\7.\2\2I\22\3\2\2\2JK\7*\2\2K"+
		"\24\3\2\2\2LM\7+\2\2M\26\3\2\2\2NO\7F\2\2OP\7C\2\2PQ\7V\2\2QR\7G\2\2R"+
		"\30\3\2\2\2ST\7G\2\2TU\7P\2\2UV\7W\2\2VW\7O\2\2W\32\3\2\2\2XY\7N\2\2Y"+
		"Z\7K\2\2Z[\7U\2\2[\\\7V\2\2\\\34\3\2\2\2]^\7&\2\2^\36\3\2\2\2_`\7T\2\2"+
		"`a\7C\2\2ab\7P\2\2bc\7F\2\2cd\7Q\2\2de\7O\2\2e \3\2\2\2fg\7E\2\2gh\7["+
		"\2\2hi\7E\2\2ij\7N\2\2jk\7G\2\2k\"\3\2\2\2lm\7V\2\2mn\7T\2\2no\7C\2\2"+
		"op\7X\2\2pq\7G\2\2qr\7T\2\2rs\7U\2\2st\7C\2\2tu\7N\2\2u$\3\2\2\2vw\7D"+
		"\2\2wx\7Q\2\2xy\7W\2\2yz\7P\2\2z{\7F\2\2{|\7C\2\2|}\7T\2\2}~\7[\2\2~&"+
		"\3\2\2\2\177\u0080\7E\2\2\u0080\u0081\7Q\2\2\u0081\u0082\7O\2\2\u0082"+
		"\u0083\7R\2\2\u0083\u0084\7N\2\2\u0084\u0085\7G\2\2\u0085\u0086\7Z\2\2"+
		"\u0086(\3\2\2\2\u0087\u008d\5\37\20\2\u0088\u008d\5!\21\2\u0089\u008d"+
		"\5#\22\2\u008a\u008d\5%\23\2\u008b\u008d\5\'\24\2\u008c\u0087\3\2\2\2"+
		"\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d*\3\2\2\2\u008e\u008f\7K\2\2\u008f\u0090\7P\2\2\u0090\u0091"+
		"\7V\2\2\u0091\u0092\7G\2\2\u0092\u0093\7I\2\2\u0093\u0094\7G\2\2\u0094"+
		"\u0095\7T\2\2\u0095,\3\2\2\2\u0096\u0097\t\2\2\2\u0097.\3\2\2\2\u0098"+
		"\u0099\t\3\2\2\u0099\60\3\2\2\2\u009a\u009b\t\4\2\2\u009b\62\3\2\2\2\u009c"+
		"\u009d\t\4\2\2\u009d\u00a8\t\5\2\2\u009e\u009f\t\6\2\2\u009f\u00a0\t\5"+
		"\2\2\u00a0\u00a8\t\5\2\2\u00a1\u00a2\t\7\2\2\u00a2\u00a3\t\b\2\2\u00a3"+
		"\u00a8\t\5\2\2\u00a4\u00a5\t\7\2\2\u00a5\u00a6\t\t\2\2\u00a6\u00a8\t\n"+
		"\2\2\u00a7\u009c\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\t\7\2\2\u00aa\u00ab\t\t\2"+
		"\2\u00ab\u00bb\t\13\2\2\u00ac\u00ad\t\7\2\2\u00ad\u00ae\t\13\2\2\u00ae"+
		"\u00bb\t\5\2\2\u00af\u00b0\t\f\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00bb\t\5"+
		"\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00b6\t\5\2\2\u00b5"+
		"\u00b7\t\5\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00a9\3\2\2\2\u00ba"+
		"\u00ac\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b2\3\2\2\2\u00bb\66\3\2\2"+
		"\2\u00bc\u00be\t\r\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\34\2\2"+
		"\u00c28\3\2\2\2\b\2\u008c\u00a7\u00b8\u00ba\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}