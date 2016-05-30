package Rule6;
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
		T__9=10, DATE=11, ENUM=12, LIST=13, ASSOCIATION=14, SEPARATOR=15, Style4generate=16, 
		INTEGER=17, Alphas=18, Zero=19, Number1To9=20, Number10To255=21, NumberAfter255=22, 
		WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "DATE", "ENUM", "LIST", "ASSOCIATION", "SEPARATOR", "RANDOM", 
		"CYCLE", "TRAVERSAL", "BOUNDARY", "COMPLEX", "Style4generate", "INTEGER", 
		"Alphas", "Zero", "Number1To9", "Number10To255", "NumberAfter255", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u009b\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u00b6\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\6\34\u00c5\n\34\r\34\16\34\u00c6\5\34\u00c9\n\34\3\35"+
		"\6\35\u00cc\n\35\r\35\16\35\u00cd\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2"+
		")\2+\22-\23/\24\61\25\63\26\65\27\67\309\31\3\2\16\5\2C\\aac|\3\2\62\62"+
		"\3\2\63;\3\2\62;\3\2\63\63\3\2\64\64\3\2\62\66\3\2\67\67\3\2\62\67\3\2"+
		"8;\3\2\65;\5\2\13\f\17\17\"\"\u00d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3"+
		"\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3"+
		"\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31U\3\2\2\2\33Z\3\2\2\2\35_\3\2\2\2\37"+
		"k\3\2\2\2!m\3\2\2\2#t\3\2\2\2%z\3\2\2\2\'\u0084\3\2\2\2)\u008d\3\2\2\2"+
		"+\u009a\3\2\2\2-\u009c\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00b5\3\2\2\2\67\u00c8\3\2\2\29\u00cb\3\2\2\2;<\7]\2\2<\4"+
		"\3\2\2\2=>\7`\2\2>\6\3\2\2\2?@\7_\2\2@\b\3\2\2\2AB\7/\2\2B\n\3\2\2\2C"+
		"D\7\60\2\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2GH\7.\2\2H\20\3\2\2\2IJ\7*\2"+
		"\2J\22\3\2\2\2KL\7+\2\2L\24\3\2\2\2MN\7K\2\2NO\7R\2\2O\26\3\2\2\2PQ\7"+
		"F\2\2QR\7C\2\2RS\7V\2\2ST\7G\2\2T\30\3\2\2\2UV\7G\2\2VW\7P\2\2WX\7W\2"+
		"\2XY\7O\2\2Y\32\3\2\2\2Z[\7N\2\2[\\\7K\2\2\\]\7U\2\2]^\7V\2\2^\34\3\2"+
		"\2\2_`\7C\2\2`a\7U\2\2ab\7U\2\2bc\7Q\2\2cd\7E\2\2de\7K\2\2ef\7C\2\2fg"+
		"\7V\2\2gh\7K\2\2hi\7Q\2\2ij\7P\2\2j\36\3\2\2\2kl\7&\2\2l \3\2\2\2mn\7"+
		"T\2\2no\7C\2\2op\7P\2\2pq\7F\2\2qr\7Q\2\2rs\7O\2\2s\"\3\2\2\2tu\7E\2\2"+
		"uv\7[\2\2vw\7E\2\2wx\7N\2\2xy\7G\2\2y$\3\2\2\2z{\7V\2\2{|\7T\2\2|}\7C"+
		"\2\2}~\7X\2\2~\177\7G\2\2\177\u0080\7T\2\2\u0080\u0081\7U\2\2\u0081\u0082"+
		"\7C\2\2\u0082\u0083\7N\2\2\u0083&\3\2\2\2\u0084\u0085\7D\2\2\u0085\u0086"+
		"\7Q\2\2\u0086\u0087\7W\2\2\u0087\u0088\7P\2\2\u0088\u0089\7F\2\2\u0089"+
		"\u008a\7C\2\2\u008a\u008b\7T\2\2\u008b\u008c\7[\2\2\u008c(\3\2\2\2\u008d"+
		"\u008e\7E\2\2\u008e\u008f\7Q\2\2\u008f\u0090\7O\2\2\u0090\u0091\7R\2\2"+
		"\u0091\u0092\7N\2\2\u0092\u0093\7G\2\2\u0093\u0094\7Z\2\2\u0094*\3\2\2"+
		"\2\u0095\u009b\5!\21\2\u0096\u009b\5#\22\2\u0097\u009b\5%\23\2\u0098\u009b"+
		"\5\'\24\2\u0099\u009b\5)\25\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2"+
		"\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b,\3"+
		"\2\2\2\u009c\u009d\7K\2\2\u009d\u009e\7P\2\2\u009e\u009f\7V\2\2\u009f"+
		"\u00a0\7G\2\2\u00a0\u00a1\7I\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7T\2\2"+
		"\u00a3.\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\t\3\2"+
		"\2\u00a7\62\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\t"+
		"\4\2\2\u00ab\u00b6\t\5\2\2\u00ac\u00ad\t\6\2\2\u00ad\u00ae\t\5\2\2\u00ae"+
		"\u00b6\t\5\2\2\u00af\u00b0\t\7\2\2\u00b0\u00b1\t\b\2\2\u00b1\u00b6\t\5"+
		"\2\2\u00b2\u00b3\t\7\2\2\u00b3\u00b4\t\t\2\2\u00b4\u00b6\t\n\2\2\u00b5"+
		"\u00aa\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2"+
		"\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8\u00b9\t\t\2\2\u00b9\u00c9"+
		"\t\13\2\2\u00ba\u00bb\t\7\2\2\u00bb\u00bc\t\13\2\2\u00bc\u00c9\t\5\2\2"+
		"\u00bd\u00be\t\f\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c9\t\5\2\2\u00c0\u00c1"+
		"\t\4\2\2\u00c1\u00c2\t\5\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c5\t\5\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8\u00ba\3\2\2\2\u00c8"+
		"\u00bd\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c98\3\2\2\2\u00ca\u00cc\t\r\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\35\2\2\u00d0:\3\2\2\2\b\2\u009a"+
		"\u00b5\u00c6\u00c8\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}