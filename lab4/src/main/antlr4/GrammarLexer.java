// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ENDL=2, COLON=3, ARROW=4, TYPE=5, BEFORE=6, INSIDE=7, AFTER=8, TERMINAL_OPS=9, 
		NON_TERMINAL=10, TERMINAL=11, NUMBER=12, REGEXP=13, EPS=14, LBRACKET=15, 
		RBRACKET=16, SHARP=17, OTHER=18, ALPHANUM=19, ALL=20, REG_CONTENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "ENDL", "COLON", "ARROW", "TYPE", "BEFORE", "INSIDE", "AFTER", 
			"TERMINAL_OPS", "NON_TERMINAL", "TERMINAL", "NUMBER", "REGEXP", "EPS", 
			"LBRACKET", "RBRACKET", "SHARP", "OTHER", "LBRACE", "RBRACE", "MINUS", 
			"STAR", "ALPHANUM", "ALL", "REG_CONTENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", null, "':'", "'->'", null, "'@before'", "'@inside'", "'@after'", 
			null, null, null, null, "'\\\\reg'", "'\\\\eps'", "'{'", "'}'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ENDL", "COLON", "ARROW", "TYPE", "BEFORE", "INSIDE", "AFTER", 
			"TERMINAL_OPS", "NON_TERMINAL", "TERMINAL", "NUMBER", "REGEXP", "EPS", 
			"LBRACKET", "RBRACKET", "SHARP", "OTHER", "ALPHANUM", "ALL", "REG_CONTENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\6\3?\n\3\r\3\16"+
		"\3@\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\7\13n\n\13\f\13\16\13q\13\13\3"+
		"\f\3\f\7\fu\n\f\f\f\16\fx\13\f\3\r\6\r{\n\r\r\r\16\r|\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\5\30\u009f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00a9"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u00b0\n\32\f\32\16\32\u00b3\13\32"+
		"\3\32\3\32\6\32\u00b7\n\32\r\32\16\32\u00b8\3\32\5\32\u00bc\n\32\2\2\33"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\2)\2+\2-\2/\25\61\26\63\27\3\2\13\4\2\f\f\17\17\t"+
		"\2##((*-//\61\61``~~\3\2C\\\4\2\62;C\\\3\2c|\5\2\62;aac|\3\2\62;\7\2."+
		".\60\60==??aa\4\2&&\60\60\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\3\65\3\2\2\2\5:\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13P\3\2"+
		"\2\2\rR\3\2\2\2\17Z\3\2\2\2\21b\3\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27r\3"+
		"\2\2\2\31z\3\2\2\2\33~\3\2\2\2\35\u0084\3\2\2\2\37\u008a\3\2\2\2!\u008c"+
		"\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0094\3\2\2\2"+
		"+\u0096\3\2\2\2-\u0098\3\2\2\2/\u009e\3\2\2\2\61\u00a8\3\2\2\2\63\u00b6"+
		"\3\2\2\2\65\66\7\"\2\2\66\4\3\2\2\2\679\5\3\2\28\67\3\2\2\29<\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2A\6\3\2\2\2BC\7<\2\2C\b\3\2\2\2DE\7/\2\2EF\7@\2\2"+
		"F\n\3\2\2\2GH\7k\2\2HI\7p\2\2IQ\7v\2\2JK\7U\2\2KL\7v\2\2LM\7t\2\2MN\7"+
		"k\2\2NO\7p\2\2OQ\7i\2\2PG\3\2\2\2PJ\3\2\2\2Q\f\3\2\2\2RS\7B\2\2ST\7d\2"+
		"\2TU\7g\2\2UV\7h\2\2VW\7q\2\2WX\7t\2\2XY\7g\2\2Y\16\3\2\2\2Z[\7B\2\2["+
		"\\\7k\2\2\\]\7p\2\2]^\7u\2\2^_\7k\2\2_`\7f\2\2`a\7g\2\2a\20\3\2\2\2bc"+
		"\7B\2\2cd\7c\2\2de\7h\2\2ef\7v\2\2fg\7g\2\2gh\7t\2\2h\22\3\2\2\2ij\t\3"+
		"\2\2j\24\3\2\2\2ko\t\4\2\2ln\t\5\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2p\26\3\2\2\2qo\3\2\2\2rv\t\6\2\2su\t\7\2\2ts\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2vw\3\2\2\2w\30\3\2\2\2xv\3\2\2\2y{\t\b\2\2zy\3\2\2\2{|\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\32\3\2\2\2~\177\7^\2\2\177\u0080\7^\2\2\u0080"+
		"\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7i\2\2\u0083\34\3\2\2\2\u0084"+
		"\u0085\7^\2\2\u0085\u0086\7^\2\2\u0086\u0087\7g\2\2\u0087\u0088\7r\2\2"+
		"\u0088\u0089\7u\2\2\u0089\36\3\2\2\2\u008a\u008b\7}\2\2\u008b \3\2\2\2"+
		"\u008c\u008d\7\177\2\2\u008d\"\3\2\2\2\u008e\u008f\7%\2\2\u008f$\3\2\2"+
		"\2\u0090\u0091\t\t\2\2\u0091&\3\2\2\2\u0092\u0093\7]\2\2\u0093(\3\2\2"+
		"\2\u0094\u0095\7_\2\2\u0095*\3\2\2\2\u0096\u0097\7/\2\2\u0097,\3\2\2\2"+
		"\u0098\u0099\7,\2\2\u0099.\3\2\2\2\u009a\u009f\5\27\f\2\u009b\u009f\5"+
		"\25\13\2\u009c\u009f\5\31\r\2\u009d\u009f\t\n\2\2\u009e\u009a\3\2\2\2"+
		"\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\60"+
		"\3\2\2\2\u00a0\u00a9\5\27\f\2\u00a1\u00a9\5\25\13\2\u00a2\u00a9\5\31\r"+
		"\2\u00a3\u00a9\5\37\20\2\u00a4\u00a9\5!\21\2\u00a5\u00a9\5\5\3\2\u00a6"+
		"\u00a9\5\23\n\2\u00a7\u00a9\5%\23\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1\3"+
		"\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\62\3\2\2"+
		"\2\u00aa\u00b1\5\'\24\2\u00ab\u00ac\5/\30\2\u00ac\u00ad\5+\26\2\u00ad"+
		"\u00ae\5/\30\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\5)\25\2\u00b5\u00b7\3\2\2\2\u00b6\u00aa\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00bc\5-\27\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\64\3\2\2\2\16\2:@Pov|\u009e\u00a8\u00b1\u00b8\u00bb\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}