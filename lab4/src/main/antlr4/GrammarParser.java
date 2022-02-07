// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ENDL=2, COLON=3, ARROW=4, TYPE=5, BEFORE=6, INSIDE=7, AFTER=8, TERMINAL_OPS=9, 
		NON_TERMINAL=10, TERMINAL=11, NUMBER=12, REGEXP=13, EPS=14, LBRACKET=15, 
		RBRACKET=16, SHARP=17, OTHER=18, ALPHANUM=19, ALL=20, REG_CONTENT=21;
	public static final int
		RULE_prog = 0, RULE_parser_rules = 1, RULE_attributes = 2, RULE_lexer_rules = 3, 
		RULE_right_part_parser = 4, RULE_right_part_lexer = 5, RULE_field_declarations = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "parser_rules", "attributes", "lexer_rules", "right_part_parser", 
			"right_part_lexer", "field_declarations"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public java.util.List<model.ParserRule> parserRules;
		public java.util.List<model.LexerRule> lexerRules;
		public java.util.Map<String, String> fieldDeclarations;
		public java.util.Set<String> inherited;
		public Field_declarationsContext field_declarations;
		public Parser_rulesContext parser_rules;
		public Lexer_rulesContext lexer_rules;
		public Field_declarationsContext field_declarations() {
			return getRuleContext(Field_declarationsContext.class,0);
		}
		public Parser_rulesContext parser_rules() {
			return getRuleContext(Parser_rulesContext.class,0);
		}
		public Lexer_rulesContext lexer_rules() {
			return getRuleContext(Lexer_rulesContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(GrammarParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(GrammarParser.ENDL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);

		        ((ProgContext)_localctx).parserRules =  new java.util.ArrayList<>();
		        ((ProgContext)_localctx).lexerRules =  new java.util.ArrayList<>();
		        ((ProgContext)_localctx).fieldDeclarations =  new java.util.HashMap<>();
		        ((ProgContext)_localctx).inherited =  new java.util.HashSet<>();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((ProgContext)_localctx).field_declarations = field_declarations();

			        ((ProgContext)_localctx).fieldDeclarations =  new java.util.HashMap<>();
			        for (java.util.Map.Entry<String, java.util.Set<String>> entry : ((ProgContext)_localctx).field_declarations.value.entrySet()) {
			            String accum = "";
			            for (String s : entry.getValue()) {
			                accum += s;
			            }
			            _localctx.fieldDeclarations.put(entry.getKey(), accum);
			        }
			        ((ProgContext)_localctx).inherited =  ((ProgContext)_localctx).field_declarations.inherited;
			    
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16);
					match(ENDL);
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22);
			((ProgContext)_localctx).parser_rules = parser_rules(_localctx.inherited);

			        ((ProgContext)_localctx).parserRules =  ((ProgContext)_localctx).parser_rules.rules;
			    
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					match(ENDL);
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(30);
			((ProgContext)_localctx).lexer_rules = lexer_rules();

			        ((ProgContext)_localctx).lexerRules =  ((ProgContext)_localctx).lexer_rules.rules;
			    
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(32);
				match(ENDL);
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

	public static class Parser_rulesContext extends ParserRuleContext {
		public java.util.Set<String> inherited;
		public java.util.List<model.ParserRule> rules;
		public String pre;
		public String in;
		public String post;
		public Integer pos;
		public Token NON_TERMINAL;
		public Right_part_parserContext right_part_parser;
		public AttributesContext before;
		public Token NUMBER;
		public AttributesContext inside;
		public AttributesContext after;
		public List<TerminalNode> NON_TERMINAL() { return getTokens(GrammarParser.NON_TERMINAL); }
		public TerminalNode NON_TERMINAL(int i) {
			return getToken(GrammarParser.NON_TERMINAL, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(GrammarParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(GrammarParser.ARROW, i);
		}
		public List<Right_part_parserContext> right_part_parser() {
			return getRuleContexts(Right_part_parserContext.class);
		}
		public Right_part_parserContext right_part_parser(int i) {
			return getRuleContext(Right_part_parserContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public List<TerminalNode> BEFORE() { return getTokens(GrammarParser.BEFORE); }
		public TerminalNode BEFORE(int i) {
			return getToken(GrammarParser.BEFORE, i);
		}
		public List<TerminalNode> INSIDE() { return getTokens(GrammarParser.INSIDE); }
		public TerminalNode INSIDE(int i) {
			return getToken(GrammarParser.INSIDE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public List<TerminalNode> AFTER() { return getTokens(GrammarParser.AFTER); }
		public TerminalNode AFTER(int i) {
			return getToken(GrammarParser.AFTER, i);
		}
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Parser_rulesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parser_rulesContext(ParserRuleContext parent, int invokingState, java.util.Set<String> inherited) {
			super(parent, invokingState);
			this.inherited = inherited;
		}
		@Override public int getRuleIndex() { return RULE_parser_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParser_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParser_rules(this);
		}
	}

	public final Parser_rulesContext parser_rules(java.util.Set<String> inherited) throws RecognitionException {
		Parser_rulesContext _localctx = new Parser_rulesContext(_ctx, getState(), inherited);
		enterRule(_localctx, 2, RULE_parser_rules);

		        ((Parser_rulesContext)_localctx).rules =  new java.util.ArrayList<>();
		        ((Parser_rulesContext)_localctx).pre =  null;
		        ((Parser_rulesContext)_localctx).in =  null;
		        ((Parser_rulesContext)_localctx).post =  null;
		        ((Parser_rulesContext)_localctx).pos =  -1;
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERMINAL) {
				{
				{
				setState(38);
				((Parser_rulesContext)_localctx).NON_TERMINAL = match(NON_TERMINAL);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					match(WS);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(44);
				match(ARROW);
				setState(46); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(45);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(48); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(50);
				((Parser_rulesContext)_localctx).right_part_parser = right_part_parser(_localctx.inherited);
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(51);
						match(WS);
						}
						} 
					}
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BEFORE) {
					{
					setState(57);
					match(BEFORE);
					setState(58);
					((Parser_rulesContext)_localctx).before = attributes();
					((Parser_rulesContext)_localctx).pre =  ((Parser_rulesContext)_localctx).before.value;
					}
				}

				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						match(WS);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSIDE) {
					{
					setState(69);
					match(INSIDE);
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(70);
						match(WS);
						}
						}
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(76);
					((Parser_rulesContext)_localctx).NUMBER = match(NUMBER);
					setState(77);
					((Parser_rulesContext)_localctx).inside = attributes();

					          ((Parser_rulesContext)_localctx).in =  ((Parser_rulesContext)_localctx).inside.value;
					          ((Parser_rulesContext)_localctx).pos =  Integer.parseInt((((Parser_rulesContext)_localctx).NUMBER!=null?((Parser_rulesContext)_localctx).NUMBER.getText():null));
					      
					}
				}

				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(82);
					match(WS);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(88);
					match(AFTER);
					setState(89);
					((Parser_rulesContext)_localctx).after = attributes();
					((Parser_rulesContext)_localctx).post =  ((Parser_rulesContext)_localctx).after.value;
					}
				}

				}

				        _localctx.rules.add(new model.ParserRule(new model.NonTerm((((Parser_rulesContext)_localctx).NON_TERMINAL!=null?((Parser_rulesContext)_localctx).NON_TERMINAL.getText():null), _localctx.inherited.contains((((Parser_rulesContext)_localctx).NON_TERMINAL!=null?((Parser_rulesContext)_localctx).NON_TERMINAL.getText():null))), ((Parser_rulesContext)_localctx).right_part_parser.value, _localctx.pre, _localctx.in, _localctx.post, _localctx.pos));
				        ((Parser_rulesContext)_localctx).pre =  null;
				        ((Parser_rulesContext)_localctx).in =  null;
				        ((Parser_rulesContext)_localctx).post =  null;
				        ((Parser_rulesContext)_localctx).pos =  -1;
				    
				}
				}
				setState(100);
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

	public static class AttributesContext extends ParserRuleContext {
		public String value;
		public String accum;
		public Token WS;
		public Token ENDL;
		public Token TERMINAL;
		public Token NON_TERMINAL;
		public Token NUMBER;
		public Token LBRACKET;
		public Token RBRACKET;
		public Token TERMINAL_OPS;
		public Token TYPE;
		public Token OTHER;
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode SHARP() { return getToken(GrammarParser.SHARP, 0); }
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public List<TerminalNode> ENDL() { return getTokens(GrammarParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(GrammarParser.ENDL, i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public List<TerminalNode> NON_TERMINAL() { return getTokens(GrammarParser.NON_TERMINAL); }
		public TerminalNode NON_TERMINAL(int i) {
			return getToken(GrammarParser.NON_TERMINAL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GrammarParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GrammarParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GrammarParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GrammarParser.RBRACKET, i);
		}
		public List<TerminalNode> TERMINAL_OPS() { return getTokens(GrammarParser.TERMINAL_OPS); }
		public TerminalNode TERMINAL_OPS(int i) {
			return getToken(GrammarParser.TERMINAL_OPS, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(GrammarParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(GrammarParser.TYPE, i);
		}
		public List<TerminalNode> OTHER() { return getTokens(GrammarParser.OTHER); }
		public TerminalNode OTHER(int i) {
			return getToken(GrammarParser.OTHER, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributes);
		((AttributesContext)_localctx).value =  ""; ((AttributesContext)_localctx).accum =  "";
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(101);
				((AttributesContext)_localctx).WS = match(WS);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(COLON);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					((AttributesContext)_localctx).ENDL = match(ENDL);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					((AttributesContext)_localctx).WS = match(WS);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TERMINAL:
					{
					setState(120);
					((AttributesContext)_localctx).TERMINAL = match(TERMINAL);
					_localctx.accum += (((AttributesContext)_localctx).TERMINAL!=null?((AttributesContext)_localctx).TERMINAL.getText():null);
					}
					break;
				case NON_TERMINAL:
					{
					setState(122);
					((AttributesContext)_localctx).NON_TERMINAL = match(NON_TERMINAL);
					_localctx.accum += (((AttributesContext)_localctx).NON_TERMINAL!=null?((AttributesContext)_localctx).NON_TERMINAL.getText():null);
					}
					break;
				case NUMBER:
					{
					setState(124);
					((AttributesContext)_localctx).NUMBER = match(NUMBER);
					_localctx.accum += (((AttributesContext)_localctx).NUMBER!=null?((AttributesContext)_localctx).NUMBER.getText():null);
					}
					break;
				case LBRACKET:
					{
					setState(126);
					((AttributesContext)_localctx).LBRACKET = match(LBRACKET);
					_localctx.accum += (((AttributesContext)_localctx).LBRACKET!=null?((AttributesContext)_localctx).LBRACKET.getText():null);
					}
					break;
				case RBRACKET:
					{
					setState(128);
					((AttributesContext)_localctx).RBRACKET = match(RBRACKET);
					_localctx.accum += (((AttributesContext)_localctx).RBRACKET!=null?((AttributesContext)_localctx).RBRACKET.getText():null);
					}
					break;
				case TERMINAL_OPS:
					{
					setState(130);
					((AttributesContext)_localctx).TERMINAL_OPS = match(TERMINAL_OPS);
					_localctx.accum += (((AttributesContext)_localctx).TERMINAL_OPS!=null?((AttributesContext)_localctx).TERMINAL_OPS.getText():null);
					}
					break;
				case TYPE:
					{
					setState(132);
					((AttributesContext)_localctx).TYPE = match(TYPE);
					_localctx.accum += (((AttributesContext)_localctx).TYPE!=null?((AttributesContext)_localctx).TYPE.getText():null);
					}
					break;
				case OTHER:
					{
					setState(134);
					((AttributesContext)_localctx).OTHER = match(OTHER);
					_localctx.accum += (((AttributesContext)_localctx).OTHER!=null?((AttributesContext)_localctx).OTHER.getText():null);
					}
					break;
				case WS:
					{
					setState(136);
					((AttributesContext)_localctx).WS = match(WS);
					_localctx.accum += (((AttributesContext)_localctx).WS!=null?((AttributesContext)_localctx).WS.getText():null);
					}
					break;
				case ENDL:
					{
					setState(138);
					((AttributesContext)_localctx).ENDL = match(ENDL);
					_localctx.accum += (((AttributesContext)_localctx).ENDL!=null?((AttributesContext)_localctx).ENDL.getText():null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << ENDL) | (1L << TYPE) | (1L << TERMINAL_OPS) | (1L << NON_TERMINAL) | (1L << TERMINAL) | (1L << NUMBER) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << OTHER))) != 0) );
			setState(144);
			match(SHARP);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					((AttributesContext)_localctx).ENDL = match(ENDL);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					((AttributesContext)_localctx).WS = match(WS);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}

			        ((AttributesContext)_localctx).value =  _localctx.accum;
			    
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

	public static class Lexer_rulesContext extends ParserRuleContext {
		public java.util.List<model.LexerRule> rules;
		public Token TERMINAL;
		public Right_part_lexerContext right_part_lexer;
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(GrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GrammarParser.COLON, i);
		}
		public List<Right_part_lexerContext> right_part_lexer() {
			return getRuleContexts(Right_part_lexerContext.class);
		}
		public Right_part_lexerContext right_part_lexer(int i) {
			return getRuleContext(Right_part_lexerContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public Lexer_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexer_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexer_rules(this);
		}
	}

	public final Lexer_rulesContext lexer_rules() throws RecognitionException {
		Lexer_rulesContext _localctx = new Lexer_rulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lexer_rules);
		((Lexer_rulesContext)_localctx).rules =  new java.util.ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERMINAL) {
				{
				{
				setState(159);
				((Lexer_rulesContext)_localctx).TERMINAL = match(TERMINAL);
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					match(WS);
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(165);
				match(COLON);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(WS);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(171);
				((Lexer_rulesContext)_localctx).right_part_lexer = right_part_lexer();

				        _localctx.rules.add(new model.LexerRule(new model.Term((((Lexer_rulesContext)_localctx).TERMINAL!=null?((Lexer_rulesContext)_localctx).TERMINAL.getText():null)), ((Lexer_rulesContext)_localctx).right_part_lexer.value));
				    
				}
				}
				setState(178);
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

	public static class Right_part_parserContext extends ParserRuleContext {
		public java.util.Set<String> inherited;
		public java.util.List<model.RuleElement> value;
		public Token NON_TERMINAL;
		public Token TERMINAL;
		public List<TerminalNode> ENDL() { return getTokens(GrammarParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(GrammarParser.ENDL, i);
		}
		public TerminalNode EPS() { return getToken(GrammarParser.EPS, 0); }
		public List<TerminalNode> NON_TERMINAL() { return getTokens(GrammarParser.NON_TERMINAL); }
		public TerminalNode NON_TERMINAL(int i) {
			return getToken(GrammarParser.NON_TERMINAL, i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public Right_part_parserContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Right_part_parserContext(ParserRuleContext parent, int invokingState, java.util.Set<String> inherited) {
			super(parent, invokingState);
			this.inherited = inherited;
		}
		@Override public int getRuleIndex() { return RULE_right_part_parser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRight_part_parser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRight_part_parser(this);
		}
	}

	public final Right_part_parserContext right_part_parser(java.util.Set<String> inherited) throws RecognitionException {
		Right_part_parserContext _localctx = new Right_part_parserContext(_ctx, getState(), inherited);
		enterRule(_localctx, 8, RULE_right_part_parser);
		((Right_part_parserContext)_localctx).value =  new java.util.ArrayList<>();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(197);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							{
							setState(182);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(179);
								match(WS);
								}
								}
								setState(184);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(185);
							((Right_part_parserContext)_localctx).NON_TERMINAL = match(NON_TERMINAL);
							}

							        _localctx.value.add(new model.NonTerm((((Right_part_parserContext)_localctx).NON_TERMINAL!=null?((Right_part_parserContext)_localctx).NON_TERMINAL.getText():null), _localctx.inherited.contains((((Right_part_parserContext)_localctx).NON_TERMINAL!=null?((Right_part_parserContext)_localctx).NON_TERMINAL.getText():null))));
							    
							}
							break;
						case 2:
							{
							{
							setState(191);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(188);
								match(WS);
								}
								}
								setState(193);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(194);
							((Right_part_parserContext)_localctx).TERMINAL = match(TERMINAL);
							}

							        _localctx.value.add(new model.Term((((Right_part_parserContext)_localctx).TERMINAL!=null?((Right_part_parserContext)_localctx).TERMINAL.getText():null)));
							    
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(201);
					match(WS);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(EPS);
				}

				        _localctx.value.add(model.Term.EPS);
				    
				}
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(ENDL);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Right_part_lexerContext extends ParserRuleContext {
		public java.lang.String value;
		public Token REGEXP;
		public Token REG_CONTENT;
		public Token TERMINAL;
		public Token TERMINAL_OPS;
		public TerminalNode REGEXP() { return getToken(GrammarParser.REGEXP, 0); }
		public TerminalNode REG_CONTENT() { return getToken(GrammarParser.REG_CONTENT, 0); }
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode TERMINAL_OPS() { return getToken(GrammarParser.TERMINAL_OPS, 0); }
		public List<TerminalNode> ENDL() { return getTokens(GrammarParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(GrammarParser.ENDL, i);
		}
		public Right_part_lexerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_part_lexer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRight_part_lexer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRight_part_lexer(this);
		}
	}

	public final Right_part_lexerContext right_part_lexer() throws RecognitionException {
		Right_part_lexerContext _localctx = new Right_part_lexerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_right_part_lexer);
		((Right_part_lexerContext)_localctx).value =  "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEXP:
				{
				setState(218);
				((Right_part_lexerContext)_localctx).REGEXP = match(REGEXP);
				setState(219);
				((Right_part_lexerContext)_localctx).REG_CONTENT = match(REG_CONTENT);

				        ((Right_part_lexerContext)_localctx).value =  (((Right_part_lexerContext)_localctx).REGEXP!=null?((Right_part_lexerContext)_localctx).REGEXP.getText():null) + (((Right_part_lexerContext)_localctx).REG_CONTENT!=null?((Right_part_lexerContext)_localctx).REG_CONTENT.getText():null);
				    
				}
				break;
			case TERMINAL:
				{
				setState(221);
				((Right_part_lexerContext)_localctx).TERMINAL = match(TERMINAL);

				        ((Right_part_lexerContext)_localctx).value =  (((Right_part_lexerContext)_localctx).TERMINAL!=null?((Right_part_lexerContext)_localctx).TERMINAL.getText():null);
				    
				}
				break;
			case TERMINAL_OPS:
				{
				setState(223);
				((Right_part_lexerContext)_localctx).TERMINAL_OPS = match(TERMINAL_OPS);

				        ((Right_part_lexerContext)_localctx).value =  (((Right_part_lexerContext)_localctx).TERMINAL_OPS!=null?((Right_part_lexerContext)_localctx).TERMINAL_OPS.getText():null);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					match(ENDL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Field_declarationsContext extends ParserRuleContext {
		public java.util.Map<String, java.util.Set<String>> value;
		public java.util.Set<String> inherited;
		public Token NON_TERMINAL;
		public Token TYPE;
		public Token TERMINAL;
		public List<TerminalNode> NON_TERMINAL() { return getTokens(GrammarParser.NON_TERMINAL); }
		public TerminalNode NON_TERMINAL(int i) {
			return getToken(GrammarParser.NON_TERMINAL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(GrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GrammarParser.COLON, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GrammarParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GrammarParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GrammarParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GrammarParser.RBRACKET, i);
		}
		public List<TerminalNode> SHARP() { return getTokens(GrammarParser.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(GrammarParser.SHARP, i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public List<TerminalNode> ENDL() { return getTokens(GrammarParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(GrammarParser.ENDL, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(GrammarParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(GrammarParser.TYPE, i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public Field_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterField_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitField_declarations(this);
		}
	}

	public final Field_declarationsContext field_declarations() throws RecognitionException {
		Field_declarationsContext _localctx = new Field_declarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_declarations);

		        ((Field_declarationsContext)_localctx).value =  new java.util.HashMap<>();
		        ((Field_declarationsContext)_localctx).inherited =  new java.util.HashSet<>();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					((Field_declarationsContext)_localctx).NON_TERMINAL = match(NON_TERMINAL);
					_localctx.value.putIfAbsent((((Field_declarationsContext)_localctx).NON_TERMINAL!=null?((Field_declarationsContext)_localctx).NON_TERMINAL.getText():null), new java.util.HashSet<>());
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SHARP) {
						{
						setState(234);
						match(SHARP);
						_localctx.inherited.add((((Field_declarationsContext)_localctx).NON_TERMINAL!=null?((Field_declarationsContext)_localctx).NON_TERMINAL.getText():null));
						}
					}

					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(238);
						match(WS);
						}
						}
						setState(243);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(244);
					match(COLON);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(245);
						match(WS);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(251);
					match(LBRACKET);
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(252);
							match(ENDL);
							}
							} 
						}
						setState(257);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TYPE) {
						{
						{
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(258);
							match(WS);
							}
							}
							setState(263);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(264);
						((Field_declarationsContext)_localctx).TYPE = match(TYPE);
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(265);
							match(WS);
							}
							}
							setState(270);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(271);
						((Field_declarationsContext)_localctx).TERMINAL = match(TERMINAL);
						setState(275);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(272);
								match(ENDL);
								}
								} 
							}
							setState(277);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						}

						            _localctx.value.get((((Field_declarationsContext)_localctx).NON_TERMINAL!=null?((Field_declarationsContext)_localctx).NON_TERMINAL.getText():null)).add("public " + (((Field_declarationsContext)_localctx).TYPE!=null?((Field_declarationsContext)_localctx).TYPE.getText():null) + " " + (((Field_declarationsContext)_localctx).TERMINAL!=null?((Field_declarationsContext)_localctx).TERMINAL.getText():null) + ";\n");
						        
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDL) {
						{
						{
						setState(284);
						match(ENDL);
						}
						}
						setState(289);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(290);
					match(RBRACKET);
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(291);
							match(ENDL);
							}
							} 
						}
						setState(296);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					}
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3"+
		"\2\7\2$\n\2\f\2\16\2\'\13\2\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\6\3\61"+
		"\n\3\r\3\16\3\62\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\3\5\3"+
		"@\n\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3"+
		"\3\3\3\3\3\3\5\3S\n\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\3\3\3\5\3"+
		"_\n\3\3\3\3\3\7\3c\n\3\f\3\16\3f\13\3\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4"+
		"\3\4\7\4p\n\4\f\4\16\4s\13\4\3\4\7\4v\n\4\f\4\16\4y\13\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4"+
		"\u008f\n\4\r\4\16\4\u0090\3\4\3\4\7\4\u0095\n\4\f\4\16\4\u0098\13\4\3"+
		"\4\7\4\u009b\n\4\f\4\16\4\u009e\13\4\3\4\3\4\3\5\3\5\6\5\u00a4\n\5\r\5"+
		"\16\5\u00a5\3\5\3\5\6\5\u00aa\n\5\r\5\16\5\u00ab\3\5\3\5\3\5\7\5\u00b1"+
		"\n\5\f\5\16\5\u00b4\13\5\3\6\7\6\u00b7\n\6\f\6\16\6\u00ba\13\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00c0\n\6\f\6\16\6\u00c3\13\6\3\6\3\6\3\6\6\6\u00c8\n\6\r"+
		"\6\16\6\u00c9\3\6\7\6\u00cd\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\3\6\5\6\u00d5"+
		"\n\6\3\6\7\6\u00d8\n\6\f\6\16\6\u00db\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00e4\n\7\3\7\6\7\u00e7\n\7\r\7\16\7\u00e8\3\b\3\b\3\b\3\b\5\b\u00ef"+
		"\n\b\3\b\7\b\u00f2\n\b\f\b\16\b\u00f5\13\b\3\b\3\b\7\b\u00f9\n\b\f\b\16"+
		"\b\u00fc\13\b\3\b\3\b\7\b\u0100\n\b\f\b\16\b\u0103\13\b\3\b\7\b\u0106"+
		"\n\b\f\b\16\b\u0109\13\b\3\b\3\b\7\b\u010d\n\b\f\b\16\b\u0110\13\b\3\b"+
		"\3\b\7\b\u0114\n\b\f\b\16\b\u0117\13\b\3\b\7\b\u011a\n\b\f\b\16\b\u011d"+
		"\13\b\3\b\7\b\u0120\n\b\f\b\16\b\u0123\13\b\3\b\3\b\7\b\u0127\n\b\f\b"+
		"\16\b\u012a\13\b\7\b\u012c\n\b\f\b\16\b\u012f\13\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\2\2\u015d\2\20\3\2\2\2\4d\3\2\2\2\6j\3\2\2\2\b\u00b2\3\2\2\2\n"+
		"\u00d4\3\2\2\2\f\u00e3\3\2\2\2\16\u012d\3\2\2\2\20\21\5\16\b\2\21\25\b"+
		"\2\1\2\22\24\7\4\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3"+
		"\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\5\4\3\2\31\35\b\2\1\2\32\34\7"+
		"\4\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2"+
		"\2\2\37\35\3\2\2\2 !\5\b\5\2!%\b\2\1\2\"$\7\4\2\2#\"\3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2(*\7\f\2\2)+\7\3\2\2*)\3\2"+
		"\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\7\6\2\2/\61\7\3\2\2\60"+
		"/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\648"+
		"\5\n\6\2\65\67\7\3\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9?\3\2\2\2:8\3\2\2\2;<\7\b\2\2<=\5\6\4\2=>\b\3\1\2>@\3\2\2\2?;\3\2\2\2"+
		"?@\3\2\2\2@D\3\2\2\2AC\7\3\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"ER\3\2\2\2FD\3\2\2\2GK\7\t\2\2HJ\7\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\16\2\2OP\5\6\4\2PQ\b\3\1\2QS\3\2\2"+
		"\2RG\3\2\2\2RS\3\2\2\2SW\3\2\2\2TV\7\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2X^\3\2\2\2YW\3\2\2\2Z[\7\n\2\2[\\\5\6\4\2\\]\b\3\1\2]_\3\2"+
		"\2\2^Z\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\3\1\2ac\3\2\2\2b(\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e\5\3\2\2\2fd\3\2\2\2gi\7\3\2\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mq\7\5\2\2np\7\4\2\2on\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\7\3\2\2ut\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u008e\3\2\2\2yw\3\2\2\2z{\7\r\2"+
		"\2{\u008f\b\4\1\2|}\7\f\2\2}\u008f\b\4\1\2~\177\7\16\2\2\177\u008f\b\4"+
		"\1\2\u0080\u0081\7\21\2\2\u0081\u008f\b\4\1\2\u0082\u0083\7\22\2\2\u0083"+
		"\u008f\b\4\1\2\u0084\u0085\7\13\2\2\u0085\u008f\b\4\1\2\u0086\u0087\7"+
		"\7\2\2\u0087\u008f\b\4\1\2\u0088\u0089\7\24\2\2\u0089\u008f\b\4\1\2\u008a"+
		"\u008b\7\3\2\2\u008b\u008f\b\4\1\2\u008c\u008d\7\4\2\2\u008d\u008f\b\4"+
		"\1\2\u008ez\3\2\2\2\u008e|\3\2\2\2\u008e~\3\2\2\2\u008e\u0080\3\2\2\2"+
		"\u008e\u0082\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0088"+
		"\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0096\7\23"+
		"\2\2\u0093\u0095\7\4\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\7\3\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\b\4\1\2\u00a0\7\3\2\2\2\u00a1\u00a3\7\r\2\2\u00a2\u00a4"+
		"\7\3\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\5\2\2\u00a8\u00aa\7\3"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\b\5"+
		"\1\2\u00af\u00b1\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\t\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b7\7\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7\f\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c8\b\6\1\2\u00be\u00c0\7\3"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\r"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\b\6\1\2\u00c7\u00b8\3\2\2\2\u00c7"+
		"\u00c1\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00d5\3\2\2\2\u00cb\u00cd\7\3\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\b\6\1\2\u00d4\u00c7\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d5\u00d9\3\2"+
		"\2\2\u00d6\u00d8\7\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\13\3\2\2\2\u00db\u00d9\3\2\2"+
		"\2\u00dc\u00dd\7\17\2\2\u00dd\u00de\7\27\2\2\u00de\u00e4\b\7\1\2\u00df"+
		"\u00e0\7\r\2\2\u00e0\u00e4\b\7\1\2\u00e1\u00e2\7\13\2\2\u00e2\u00e4\b"+
		"\7\1\2\u00e3\u00dc\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e7\7\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\r\3\2\2\2\u00ea\u00eb"+
		"\7\f\2\2\u00eb\u00ee\b\b\1\2\u00ec\u00ed\7\23\2\2\u00ed\u00ef\b\b\1\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2"+
		"\7\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa\7\5"+
		"\2\2\u00f7\u00f9\7\3\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u0101\7\21\2\2\u00fe\u0100\7\4\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u011b\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0106\7\3\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010e\7\7\2\2\u010b\u010d\7\3\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\7\r\2\2\u0112"+
		"\u0114\7\4\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011a\b\b\1\2\u0119\u0107\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u0121\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0120\7\4\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0128\7\22\2\2\u0125\u0127\7\4\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u00ea\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\17\3\2\2\2\u012f\u012d\3\2\2\2-\25\35%"+
		",\628?DKRW^djqw\u008e\u0090\u0096\u009c\u00a5\u00ab\u00b2\u00b8\u00c1"+
		"\u00c7\u00c9\u00ce\u00d4\u00d9\u00e3\u00e8\u00ee\u00f3\u00fa\u0101\u0107"+
		"\u010e\u0115\u011b\u0121\u0128\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}