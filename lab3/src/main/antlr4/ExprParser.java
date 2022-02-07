// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TAB=2, NEWLINE=3, WTRUE=4, WFALSE=5, WCOLON=6, WIF=7, WELIF=8, WELSE=9, 
		WWHILE=10, WDEF=11, WRETURN=12, WFOR=13, WIN=14, WRANGE=15, WCOMMA=16, 
		WLPAREN=17, WRPAREN=18, WEQUALS=19, WNEQUALS=20, WASSIGN=21, WPLUS=22, 
		WMINUS=23, WPRODUCT=24, WDIV=25, WMOD=26, WDDIV=27, WPLUSASSIGN=28, WMINUSASSIGN=29, 
		WPRODUCTASSIGN=30, WDIVASSIGN=31, WDDIVASSIGN=32, WXOR=33, WOR=34, WAND=35, 
		WSHL=36, WSHR=37, WLESSEQ=38, WLESS=39, WGREATEREQ=40, WGREATER=41, WLOR=42, 
		WLAND=43, WNEGATE=44, WNOT=45, READ=46, WRITE_BEGIN=47, IDENTIFIER=48, 
		STR_CONST=49, INTEGER=50, ALL=51;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_arguments = 2, RULE_tab_scope_wrapper = 3, 
		RULE_tab_scope = 4, RULE_tab_tab_scope_wrapper = 5, RULE_tab_tab_scope = 6, 
		RULE_simple_operations = 7, RULE_assignment_operator = 8, RULE_assignment_operand = 9, 
		RULE_expression = 10, RULE_binary_operator = 11, RULE_unary_operator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "arguments", "tab_scope_wrapper", "tab_scope", "tab_tab_scope_wrapper", 
			"tab_tab_scope", "simple_operations", "assignment_operator", "assignment_operand", 
			"expression", "binary_operator", "unary_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "TAB", "NEWLINE", "WTRUE", "WFALSE", "WCOLON", "WIF", "WELIF", 
			"WELSE", "WWHILE", "WDEF", "WRETURN", "WFOR", "WIN", "WRANGE", "WCOMMA", 
			"WLPAREN", "WRPAREN", "WEQUALS", "WNEQUALS", "WASSIGN", "WPLUS", "WMINUS", 
			"WPRODUCT", "WDIV", "WMOD", "WDDIV", "WPLUSASSIGN", "WMINUSASSIGN", "WPRODUCTASSIGN", 
			"WDIVASSIGN", "WDDIVASSIGN", "WXOR", "WOR", "WAND", "WSHL", "WSHR", "WLESSEQ", 
			"WLESS", "WGREATEREQ", "WGREATER", "WLOR", "WLAND", "WNEGATE", "WNOT", 
			"READ", "WRITE_BEGIN", "IDENTIFIER", "STR_CONST", "INTEGER", "ALL"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public String value;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		((ProgContext)_localctx).value =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((ProgContext)_localctx).main = main();
			((ProgContext)_localctx).value =  "#include <stdio.h>\n"
			        + ExprUtils.setToString(((ProgContext)_localctx).main.variables, true)
			        + ((ProgContext)_localctx).main.defFunctions
			        + "\nint main() {\n"
			        + ExprUtils.appendTabs(((ProgContext)_localctx).main.body
			        + "return 0;")
			        + "\n}";
			        
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

	public static class MainContext extends ParserRuleContext {
		public java.util.Set<String> variables;
		public String defFunctions;
		public String body;
		public java.util.Set<String> locals;
		public Token IDENTIFIER;
		public Assignment_operatorContext assignment_operator;
		public Assignment_operandContext assignment_operand;
		public ExpressionContext expression;
		public ExpressionContext e;
		public Tab_scope_wrapperContext s1;
		public Tab_scope_wrapperContext tab_scope_wrapper;
		public ExpressionContext ei;
		public Tab_scope_wrapperContext si;
		public Tab_scope_wrapperContext s2;
		public Tab_scope_wrapperContext s;
		public Token i;
		public ExpressionContext l;
		public ExpressionContext r;
		public ExpressionContext step;
		public Token name;
		public ArgumentsContext arguments;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprParser.IDENTIFIER, i);
		}
		public List<Assignment_operatorContext> assignment_operator() {
			return getRuleContexts(Assignment_operatorContext.class);
		}
		public Assignment_operatorContext assignment_operator(int i) {
			return getRuleContext(Assignment_operatorContext.class,i);
		}
		public List<Assignment_operandContext> assignment_operand() {
			return getRuleContexts(Assignment_operandContext.class);
		}
		public Assignment_operandContext assignment_operand(int i) {
			return getRuleContext(Assignment_operandContext.class,i);
		}
		public List<TerminalNode> WRITE_BEGIN() { return getTokens(ExprParser.WRITE_BEGIN); }
		public TerminalNode WRITE_BEGIN(int i) {
			return getToken(ExprParser.WRITE_BEGIN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WRPAREN() { return getTokens(ExprParser.WRPAREN); }
		public TerminalNode WRPAREN(int i) {
			return getToken(ExprParser.WRPAREN, i);
		}
		public List<TerminalNode> WIF() { return getTokens(ExprParser.WIF); }
		public TerminalNode WIF(int i) {
			return getToken(ExprParser.WIF, i);
		}
		public List<TerminalNode> WCOLON() { return getTokens(ExprParser.WCOLON); }
		public TerminalNode WCOLON(int i) {
			return getToken(ExprParser.WCOLON, i);
		}
		public List<TerminalNode> WWHILE() { return getTokens(ExprParser.WWHILE); }
		public TerminalNode WWHILE(int i) {
			return getToken(ExprParser.WWHILE, i);
		}
		public List<TerminalNode> WFOR() { return getTokens(ExprParser.WFOR); }
		public TerminalNode WFOR(int i) {
			return getToken(ExprParser.WFOR, i);
		}
		public List<TerminalNode> WIN() { return getTokens(ExprParser.WIN); }
		public TerminalNode WIN(int i) {
			return getToken(ExprParser.WIN, i);
		}
		public List<TerminalNode> WRANGE() { return getTokens(ExprParser.WRANGE); }
		public TerminalNode WRANGE(int i) {
			return getToken(ExprParser.WRANGE, i);
		}
		public List<TerminalNode> WLPAREN() { return getTokens(ExprParser.WLPAREN); }
		public TerminalNode WLPAREN(int i) {
			return getToken(ExprParser.WLPAREN, i);
		}
		public List<TerminalNode> WCOMMA() { return getTokens(ExprParser.WCOMMA); }
		public TerminalNode WCOMMA(int i) {
			return getToken(ExprParser.WCOMMA, i);
		}
		public List<TerminalNode> WDEF() { return getTokens(ExprParser.WDEF); }
		public TerminalNode WDEF(int i) {
			return getToken(ExprParser.WDEF, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<Tab_scope_wrapperContext> tab_scope_wrapper() {
			return getRuleContexts(Tab_scope_wrapperContext.class);
		}
		public Tab_scope_wrapperContext tab_scope_wrapper(int i) {
			return getRuleContext(Tab_scope_wrapperContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<TerminalNode> WELSE() { return getTokens(ExprParser.WELSE); }
		public TerminalNode WELSE(int i) {
			return getToken(ExprParser.WELSE, i);
		}
		public List<TerminalNode> WELIF() { return getTokens(ExprParser.WELIF); }
		public TerminalNode WELIF(int i) {
			return getToken(ExprParser.WELIF, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);

		    ((MainContext)_localctx).variables =  new java.util.LinkedHashSet<>();
		    ((MainContext)_localctx).defFunctions =  "";
		    ((MainContext)_localctx).body =  "";
		    ((MainContext)_localctx).locals =   new java.util.LinkedHashSet<>();

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WIF) | (1L << WWHILE) | (1L << WDEF) | (1L << WFOR) | (1L << WRITE_BEGIN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(29);
					((MainContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					setState(30);
					((MainContext)_localctx).assignment_operator = assignment_operator();
					setState(31);
					((MainContext)_localctx).assignment_operand = assignment_operand();
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(32);
						match(NEWLINE);
						}
						}
						setState(35); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );

					          _localctx.variables.add((((MainContext)_localctx).IDENTIFIER!=null?((MainContext)_localctx).IDENTIFIER.getText():null));
					          if ("READ".equals(((MainContext)_localctx).assignment_operand.type)) {
					              _localctx.body += "scanf(\"%d\", " + "&" + (((MainContext)_localctx).IDENTIFIER!=null?((MainContext)_localctx).IDENTIFIER.getText():null) + ");\n";
					          } else {
					              _localctx.body += (((MainContext)_localctx).IDENTIFIER!=null?((MainContext)_localctx).IDENTIFIER.getText():null) + ((MainContext)_localctx).assignment_operator.value + ((MainContext)_localctx).assignment_operand.value + ";\n";
					          }
					      
					}
					break;
				case WRITE_BEGIN:
					{
					setState(39);
					match(WRITE_BEGIN);
					setState(40);
					((MainContext)_localctx).expression = expression(0);
					setState(41);
					match(WRPAREN);
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(42);
						match(NEWLINE);
						}
						}
						setState(45); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );

					          _localctx.body += "printf(\"%" + ((MainContext)_localctx).expression.type + "\\n\", " + ((MainContext)_localctx).expression.value + ");\n";
					      
					}
					break;
				case WIF:
					{
					setState(49);
					match(WIF);
					setState(50);
					((MainContext)_localctx).e = ((MainContext)_localctx).expression = expression(0);
					setState(51);
					match(WCOLON);
					setState(53); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(52);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(55); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(57);
					((MainContext)_localctx).s1 = ((MainContext)_localctx).tab_scope_wrapper = tab_scope_wrapper(_localctx.variables);
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(58);
						match(NEWLINE);
						}
						}
						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}

					          _localctx.body += "if (" + ((MainContext)_localctx).e.value + ") {\n" + ((MainContext)_localctx).s1.body + "\n}";
					      
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WELIF || _la==WELSE) {
						{
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WELIF) {
							{
							{
							setState(65);
							match(WELIF);
							setState(66);
							((MainContext)_localctx).ei = ((MainContext)_localctx).expression = expression(0);
							setState(67);
							match(WCOLON);
							setState(69); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(68);
									match(NEWLINE);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(71); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(73);
							((MainContext)_localctx).si = ((MainContext)_localctx).tab_scope_wrapper = tab_scope_wrapper(_localctx.variables);
							setState(77);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(74);
								match(NEWLINE);
								}
								}
								setState(79);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}

							          _localctx.body += " else if (" + ((MainContext)_localctx).ei.value + ") {\n" + ((MainContext)_localctx).si.body + "\n}";
							      
							}
							}
							setState(86);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(87);
						match(WELSE);
						setState(88);
						match(WCOLON);
						setState(90); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(89);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(92); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(94);
						((MainContext)_localctx).s2 = ((MainContext)_localctx).tab_scope_wrapper = tab_scope_wrapper(_localctx.variables);
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(95);
							match(NEWLINE);
							}
							}
							setState(100);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}

						          _localctx.body += " else {\n" + ((MainContext)_localctx).s2.body + "\n}";
						      
						}
					}

					_localctx.body += "\n";
					}
					break;
				case WWHILE:
					{
					setState(107);
					match(WWHILE);
					setState(108);
					((MainContext)_localctx).e = ((MainContext)_localctx).expression = expression(0);
					setState(109);
					match(WCOLON);
					setState(111); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(110);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(113); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(115);
					((MainContext)_localctx).s = ((MainContext)_localctx).tab_scope_wrapper = tab_scope_wrapper(_localctx.variables);
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(116);
						match(NEWLINE);
						}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}

					        _localctx.body += "while (" + ((MainContext)_localctx).e.value + ") {\n" + ((MainContext)_localctx).s.body + "\n}\n";
					      
					}
					break;
				case WFOR:
					{
					setState(124);
					match(WFOR);
					setState(125);
					((MainContext)_localctx).i = match(IDENTIFIER);
					_localctx.variables.add((((MainContext)_localctx).i!=null?((MainContext)_localctx).i.getText():null));
					setState(127);
					match(WIN);
					setState(128);
					match(WRANGE);
					setState(129);
					match(WLPAREN);
					setState(130);
					((MainContext)_localctx).l = ((MainContext)_localctx).expression = expression(0);
					setState(131);
					match(WCOMMA);
					setState(132);
					((MainContext)_localctx).r = ((MainContext)_localctx).expression = expression(0);
					setState(133);
					match(WCOMMA);
					setState(134);
					((MainContext)_localctx).step = ((MainContext)_localctx).expression = expression(0);
					setState(135);
					match(WRPAREN);
					setState(136);
					match(WCOLON);
					setState(138); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(137);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(140); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(142);
					((MainContext)_localctx).s = ((MainContext)_localctx).tab_scope_wrapper = tab_scope_wrapper(_localctx.variables);
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(143);
						match(NEWLINE);
						}
						}
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}

					          _localctx.variables.remove((((MainContext)_localctx).i!=null?((MainContext)_localctx).i.getText():null));
					          _localctx.body += "for (int " + (((MainContext)_localctx).i!=null?((MainContext)_localctx).i.getText():null) + " = " + (((MainContext)_localctx).l!=null?_input.getText(((MainContext)_localctx).l.start,((MainContext)_localctx).l.stop):null) + "; " + (((MainContext)_localctx).i!=null?((MainContext)_localctx).i.getText():null) + " < " + (((MainContext)_localctx).r!=null?_input.getText(((MainContext)_localctx).r.start,((MainContext)_localctx).r.stop):null) + "; "
					                    + (((MainContext)_localctx).i!=null?((MainContext)_localctx).i.getText():null) + " += " + (((MainContext)_localctx).step!=null?_input.getText(((MainContext)_localctx).step.start,((MainContext)_localctx).step.stop):null) + ") {\n" + ((MainContext)_localctx).tab_scope_wrapper.body + "\n}\n";
					      
					}
					break;
				case WDEF:
					{
					setState(151);
					match(WDEF);
					setState(152);
					((MainContext)_localctx).name = match(IDENTIFIER);
					setState(153);
					match(WLPAREN);
					setState(154);
					((MainContext)_localctx).arguments = arguments();

					                _localctx.variables.addAll(ExprUtils.stringToLocals(((MainContext)_localctx).arguments.value));
					                _localctx.locals.addAll(ExprUtils.stringToLocals(((MainContext)_localctx).arguments.value));
					            
					setState(156);
					match(WRPAREN);
					setState(157);
					match(WCOLON);
					setState(159); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(158);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(161); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(163);
					((MainContext)_localctx).s = ((MainContext)_localctx).tab_scope_wrapper = tab_scope_wrapper(_localctx.variables);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(164);
						match(NEWLINE);
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}

					        _localctx.defFunctions += "\nint " + (((MainContext)_localctx).name!=null?((MainContext)_localctx).name.getText():null) + "(int " + ((MainContext)_localctx).arguments.value + ") {\n" + ((MainContext)_localctx).s.body + "\n}\n";
					        _localctx.variables.removeAll(_localctx.locals);
					      
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public String value;
		public Token i0;
		public Token i;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprParser.IDENTIFIER, i);
		}
		public List<TerminalNode> WCOMMA() { return getTokens(ExprParser.WCOMMA); }
		public TerminalNode WCOMMA(int i) {
			return getToken(ExprParser.WCOMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arguments);
		((ArgumentsContext)_localctx).value =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((ArgumentsContext)_localctx).i0 = match(IDENTIFIER);
			_localctx.value += (((ArgumentsContext)_localctx).i0!=null?((ArgumentsContext)_localctx).i0.getText():null);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WCOMMA) {
				{
				{
				setState(179);
				match(WCOMMA);
				setState(180);
				((ArgumentsContext)_localctx).i = match(IDENTIFIER);
				_localctx.value += ", int " + (((ArgumentsContext)_localctx).i!=null?((ArgumentsContext)_localctx).i.getText():null);
				}
				}
				setState(186);
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

	public static class Tab_scope_wrapperContext extends ParserRuleContext {
		public java.util.Set<String> globalVariables;
		public String body;
		public Tab_scopeContext tab_scope;
		public Tab_scopeContext tab_scope() {
			return getRuleContext(Tab_scopeContext.class,0);
		}
		public Tab_scope_wrapperContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Tab_scope_wrapperContext(ParserRuleContext parent, int invokingState, java.util.Set<String> globalVariables) {
			super(parent, invokingState);
			this.globalVariables = globalVariables;
		}
		@Override public int getRuleIndex() { return RULE_tab_scope_wrapper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTab_scope_wrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTab_scope_wrapper(this);
		}
	}

	public final Tab_scope_wrapperContext tab_scope_wrapper(java.util.Set<String> globalVariables) throws RecognitionException {
		Tab_scope_wrapperContext _localctx = new Tab_scope_wrapperContext(_ctx, getState(), globalVariables);
		enterRule(_localctx, 6, RULE_tab_scope_wrapper);
		((Tab_scope_wrapperContext)_localctx).body =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((Tab_scope_wrapperContext)_localctx).tab_scope = tab_scope(globalVariables);

			          ((Tab_scope_wrapperContext)_localctx).tab_scope.variables.removeAll(_localctx.globalVariables);
			          _localctx.body += ExprUtils.appendTabs(
			                             ExprUtils.setToString(((Tab_scope_wrapperContext)_localctx).tab_scope.variables, false)
			                             + ((Tab_scope_wrapperContext)_localctx).tab_scope.body);
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

	public static class Tab_scopeContext extends ParserRuleContext {
		public java.util.Set<String> globalVariables;
		public java.util.Set<String> variables;
		public String body;
		public Simple_operationsContext simple_operations;
		public ExpressionContext e;
		public Tab_tab_scope_wrapperContext s1;
		public Tab_tab_scope_wrapperContext tab_tab_scope_wrapper;
		public ExpressionContext ei;
		public Tab_tab_scope_wrapperContext si;
		public Tab_tab_scope_wrapperContext s2;
		public Tab_tab_scope_wrapperContext s;
		public Token i;
		public ExpressionContext l;
		public ExpressionContext r;
		public ExpressionContext step;
		public List<TerminalNode> TAB() { return getTokens(ExprParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ExprParser.TAB, i);
		}
		public List<Simple_operationsContext> simple_operations() {
			return getRuleContexts(Simple_operationsContext.class);
		}
		public Simple_operationsContext simple_operations(int i) {
			return getRuleContext(Simple_operationsContext.class,i);
		}
		public List<TerminalNode> WIF() { return getTokens(ExprParser.WIF); }
		public TerminalNode WIF(int i) {
			return getToken(ExprParser.WIF, i);
		}
		public List<TerminalNode> WCOLON() { return getTokens(ExprParser.WCOLON); }
		public TerminalNode WCOLON(int i) {
			return getToken(ExprParser.WCOLON, i);
		}
		public List<TerminalNode> WWHILE() { return getTokens(ExprParser.WWHILE); }
		public TerminalNode WWHILE(int i) {
			return getToken(ExprParser.WWHILE, i);
		}
		public List<TerminalNode> WFOR() { return getTokens(ExprParser.WFOR); }
		public TerminalNode WFOR(int i) {
			return getToken(ExprParser.WFOR, i);
		}
		public List<TerminalNode> WIN() { return getTokens(ExprParser.WIN); }
		public TerminalNode WIN(int i) {
			return getToken(ExprParser.WIN, i);
		}
		public List<TerminalNode> WRANGE() { return getTokens(ExprParser.WRANGE); }
		public TerminalNode WRANGE(int i) {
			return getToken(ExprParser.WRANGE, i);
		}
		public List<TerminalNode> WLPAREN() { return getTokens(ExprParser.WLPAREN); }
		public TerminalNode WLPAREN(int i) {
			return getToken(ExprParser.WLPAREN, i);
		}
		public List<TerminalNode> WCOMMA() { return getTokens(ExprParser.WCOMMA); }
		public TerminalNode WCOMMA(int i) {
			return getToken(ExprParser.WCOMMA, i);
		}
		public List<TerminalNode> WRPAREN() { return getTokens(ExprParser.WRPAREN); }
		public TerminalNode WRPAREN(int i) {
			return getToken(ExprParser.WRPAREN, i);
		}
		public List<Tab_tab_scope_wrapperContext> tab_tab_scope_wrapper() {
			return getRuleContexts(Tab_tab_scope_wrapperContext.class);
		}
		public Tab_tab_scope_wrapperContext tab_tab_scope_wrapper(int i) {
			return getRuleContext(Tab_tab_scope_wrapperContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<TerminalNode> WELSE() { return getTokens(ExprParser.WELSE); }
		public TerminalNode WELSE(int i) {
			return getToken(ExprParser.WELSE, i);
		}
		public List<TerminalNode> WELIF() { return getTokens(ExprParser.WELIF); }
		public TerminalNode WELIF(int i) {
			return getToken(ExprParser.WELIF, i);
		}
		public Tab_scopeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Tab_scopeContext(ParserRuleContext parent, int invokingState, java.util.Set<String> globalVariables) {
			super(parent, invokingState);
			this.globalVariables = globalVariables;
		}
		@Override public int getRuleIndex() { return RULE_tab_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTab_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTab_scope(this);
		}
	}

	public final Tab_scopeContext tab_scope(java.util.Set<String> globalVariables) throws RecognitionException {
		Tab_scopeContext _localctx = new Tab_scopeContext(_ctx, getState(), globalVariables);
		enterRule(_localctx, 8, RULE_tab_scope);

		        ((Tab_scopeContext)_localctx).variables =  new java.util.HashSet<>(globalVariables);
		        ((Tab_scopeContext)_localctx).body =  "";
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(190);
					match(TAB);
					setState(191);
					((Tab_scopeContext)_localctx).simple_operations = simple_operations();

					        _localctx.variables.addAll(((Tab_scopeContext)_localctx).simple_operations.variables);
					        _localctx.body += ((Tab_scopeContext)_localctx).simple_operations.body;
					    
					}
					break;
				case 2:
					{
					setState(194);
					match(TAB);
					setState(195);
					match(WIF);
					setState(196);
					((Tab_scopeContext)_localctx).e = expression(0);
					setState(197);
					match(WCOLON);
					setState(199); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(198);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(201); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(203);
					((Tab_scopeContext)_localctx).s1 = ((Tab_scopeContext)_localctx).tab_tab_scope_wrapper = tab_tab_scope_wrapper(_localctx.variables);
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(204);
							match(NEWLINE);
							}
							} 
						}
						setState(209);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}

					        _localctx.body += "if (" + ((Tab_scopeContext)_localctx).e.value + ") {\n" + ((Tab_scopeContext)_localctx).s1.body + "\n}";
					    
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(231);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(211);
								match(TAB);
								setState(212);
								match(WELIF);
								setState(213);
								((Tab_scopeContext)_localctx).ei = expression(0);
								setState(214);
								match(WCOLON);
								setState(216); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(215);
										match(NEWLINE);
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(218); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(220);
								((Tab_scopeContext)_localctx).si = ((Tab_scopeContext)_localctx).tab_tab_scope_wrapper = tab_tab_scope_wrapper(_localctx.variables);
								setState(224);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==NEWLINE) {
									{
									{
									setState(221);
									match(NEWLINE);
									}
									}
									setState(226);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}

								        _localctx.body += " else if (" + ((Tab_scopeContext)_localctx).ei.value + ") {\n" + ((Tab_scopeContext)_localctx).si.body + "\n}";
								    
								}
								} 
							}
							setState(233);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						}
						setState(234);
						match(TAB);
						setState(235);
						match(WELSE);
						setState(236);
						match(WCOLON);
						setState(238); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(237);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(240); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(242);
						((Tab_scopeContext)_localctx).s2 = ((Tab_scopeContext)_localctx).tab_tab_scope_wrapper = tab_tab_scope_wrapper(_localctx.variables);
						setState(246);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(243);
								match(NEWLINE);
								}
								} 
							}
							setState(248);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						}

						        _localctx.body += " else {\n" + ((Tab_scopeContext)_localctx).s2.body + "\n}";
						    
						}
						break;
					}
					_localctx.body += "\n";
					}
					break;
				case 3:
					{
					setState(255);
					match(TAB);
					setState(256);
					match(WWHILE);
					setState(257);
					((Tab_scopeContext)_localctx).e = expression(0);
					setState(258);
					match(WCOLON);
					setState(260); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(259);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(262); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(264);
					((Tab_scopeContext)_localctx).s = ((Tab_scopeContext)_localctx).tab_tab_scope_wrapper = tab_tab_scope_wrapper(_localctx.variables);
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(265);
							match(NEWLINE);
							}
							} 
						}
						setState(270);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}

					      _localctx.body += "while (" + ((Tab_scopeContext)_localctx).e.value + ") {\n" + ((Tab_scopeContext)_localctx).s.body + "\n}\n";
					    
					}
					break;
				case 4:
					{
					setState(273);
					match(TAB);
					setState(274);
					match(WFOR);
					setState(275);
					((Tab_scopeContext)_localctx).i = match(IDENTIFIER);
					_localctx.variables.add((((Tab_scopeContext)_localctx).i!=null?((Tab_scopeContext)_localctx).i.getText():null));
					setState(277);
					match(WIN);
					setState(278);
					match(WRANGE);
					setState(279);
					match(WLPAREN);
					setState(280);
					((Tab_scopeContext)_localctx).l = expression(0);
					setState(281);
					match(WCOMMA);
					setState(282);
					((Tab_scopeContext)_localctx).r = expression(0);
					setState(283);
					match(WCOMMA);
					setState(284);
					((Tab_scopeContext)_localctx).step = expression(0);
					setState(285);
					match(WRPAREN);
					setState(286);
					match(WCOLON);
					setState(288); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(287);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(290); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(292);
					((Tab_scopeContext)_localctx).tab_tab_scope_wrapper = tab_tab_scope_wrapper(_localctx.variables);
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(293);
							match(NEWLINE);
							}
							} 
						}
						setState(298);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					}

					        _localctx.body += "for (int " + (((Tab_scopeContext)_localctx).i!=null?((Tab_scopeContext)_localctx).i.getText():null) + " = " + (((Tab_scopeContext)_localctx).l!=null?_input.getText(((Tab_scopeContext)_localctx).l.start,((Tab_scopeContext)_localctx).l.stop):null) + "; " + (((Tab_scopeContext)_localctx).i!=null?((Tab_scopeContext)_localctx).i.getText():null) + " < " + (((Tab_scopeContext)_localctx).r!=null?_input.getText(((Tab_scopeContext)_localctx).r.start,((Tab_scopeContext)_localctx).r.stop):null) + "; "
					               + (((Tab_scopeContext)_localctx).i!=null?((Tab_scopeContext)_localctx).i.getText():null) + " += " + (((Tab_scopeContext)_localctx).step!=null?_input.getText(((Tab_scopeContext)_localctx).step.start,((Tab_scopeContext)_localctx).step.stop):null) + ") {\n" + ((Tab_scopeContext)_localctx).tab_tab_scope_wrapper.body + "\n}\n";
					        _localctx.variables.remove((((Tab_scopeContext)_localctx).i!=null?((Tab_scopeContext)_localctx).i.getText():null));
					    
					}
					break;
				}
				}
				setState(305);
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

	public static class Tab_tab_scope_wrapperContext extends ParserRuleContext {
		public java.util.Set<String> globalVariables;
		public String body;
		public Tab_tab_scopeContext tab_tab_scope;
		public Tab_tab_scopeContext tab_tab_scope() {
			return getRuleContext(Tab_tab_scopeContext.class,0);
		}
		public Tab_tab_scope_wrapperContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Tab_tab_scope_wrapperContext(ParserRuleContext parent, int invokingState, java.util.Set<String> globalVariables) {
			super(parent, invokingState);
			this.globalVariables = globalVariables;
		}
		@Override public int getRuleIndex() { return RULE_tab_tab_scope_wrapper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTab_tab_scope_wrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTab_tab_scope_wrapper(this);
		}
	}

	public final Tab_tab_scope_wrapperContext tab_tab_scope_wrapper(java.util.Set<String> globalVariables) throws RecognitionException {
		Tab_tab_scope_wrapperContext _localctx = new Tab_tab_scope_wrapperContext(_ctx, getState(), globalVariables);
		enterRule(_localctx, 10, RULE_tab_tab_scope_wrapper);
		((Tab_tab_scope_wrapperContext)_localctx).body =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((Tab_tab_scope_wrapperContext)_localctx).tab_tab_scope = tab_tab_scope(globalVariables);

			          ((Tab_tab_scope_wrapperContext)_localctx).tab_tab_scope.variables.removeAll(_localctx.globalVariables);
			          _localctx.body += ExprUtils.appendTabs(
			                             ExprUtils.setToString(((Tab_tab_scope_wrapperContext)_localctx).tab_tab_scope.variables, false)
			                             + ((Tab_tab_scope_wrapperContext)_localctx).tab_tab_scope.body);
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

	public static class Tab_tab_scopeContext extends ParserRuleContext {
		public java.util.Set<String> globalVariables;
		public java.util.Set<String> variables;
		public String body;
		public Simple_operationsContext simple_operations;
		public List<TerminalNode> TAB() { return getTokens(ExprParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(ExprParser.TAB, i);
		}
		public List<Simple_operationsContext> simple_operations() {
			return getRuleContexts(Simple_operationsContext.class);
		}
		public Simple_operationsContext simple_operations(int i) {
			return getRuleContext(Simple_operationsContext.class,i);
		}
		public Tab_tab_scopeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Tab_tab_scopeContext(ParserRuleContext parent, int invokingState, java.util.Set<String> globalVariables) {
			super(parent, invokingState);
			this.globalVariables = globalVariables;
		}
		@Override public int getRuleIndex() { return RULE_tab_tab_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTab_tab_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTab_tab_scope(this);
		}
	}

	public final Tab_tab_scopeContext tab_tab_scope(java.util.Set<String> globalVariables) throws RecognitionException {
		Tab_tab_scopeContext _localctx = new Tab_tab_scopeContext(_ctx, getState(), globalVariables);
		enterRule(_localctx, 12, RULE_tab_tab_scope);

		        ((Tab_tab_scopeContext)_localctx).variables =  new java.util.HashSet<>(globalVariables);
		        ((Tab_tab_scopeContext)_localctx).body =  "";
		    
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(TAB);
					setState(310);
					match(TAB);
					setState(311);
					((Tab_tab_scopeContext)_localctx).simple_operations = simple_operations();

					        _localctx.variables.addAll(((Tab_tab_scopeContext)_localctx).simple_operations.variables);
					        _localctx.body += ((Tab_tab_scopeContext)_localctx).simple_operations.body;
					    
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Simple_operationsContext extends ParserRuleContext {
		public java.util.Set<String> variables;
		public String body;
		public Token IDENTIFIER;
		public Assignment_operatorContext assignment_operator;
		public Assignment_operandContext assignment_operand;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_operandContext assignment_operand() {
			return getRuleContext(Assignment_operandContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public TerminalNode WRITE_BEGIN() { return getToken(ExprParser.WRITE_BEGIN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WRPAREN() { return getToken(ExprParser.WRPAREN, 0); }
		public TerminalNode WRETURN() { return getToken(ExprParser.WRETURN, 0); }
		public Simple_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSimple_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSimple_operations(this);
		}
	}

	public final Simple_operationsContext simple_operations() throws RecognitionException {
		Simple_operationsContext _localctx = new Simple_operationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_operations);

		        ((Simple_operationsContext)_localctx).variables =  new java.util.LinkedHashSet<>();
		        ((Simple_operationsContext)_localctx).body =  "";
		    
		try {
			int _alt;
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((Simple_operationsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(320);
				((Simple_operationsContext)_localctx).assignment_operator = assignment_operator();
				setState(321);
				((Simple_operationsContext)_localctx).assignment_operand = assignment_operand();
				setState(323); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(322);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(325); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				       _localctx.variables.add((((Simple_operationsContext)_localctx).IDENTIFIER!=null?((Simple_operationsContext)_localctx).IDENTIFIER.getText():null));
				       if ("READ".equals(((Simple_operationsContext)_localctx).assignment_operand.type)) {
				           _localctx.body += "scanf(\"%d\", " + "&" + (((Simple_operationsContext)_localctx).IDENTIFIER!=null?((Simple_operationsContext)_localctx).IDENTIFIER.getText():null) + ");\n";
				       } else {
				           _localctx.body += (((Simple_operationsContext)_localctx).IDENTIFIER!=null?((Simple_operationsContext)_localctx).IDENTIFIER.getText():null) + ((Simple_operationsContext)_localctx).assignment_operator.value + ((Simple_operationsContext)_localctx).assignment_operand.value + ";\n";
				       }
				    
				}
				break;
			case WRITE_BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(WRITE_BEGIN);
				setState(330);
				((Simple_operationsContext)_localctx).expression = expression(0);
				setState(331);
				match(WRPAREN);
				setState(333); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(332);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(335); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				       _localctx.body += "printf(\"%" + ((Simple_operationsContext)_localctx).expression.type + "\\n\", " + ((Simple_operationsContext)_localctx).expression.value + ");\n";
				    
				}
				break;
			case WRETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(WRETURN);
				setState(340);
				((Simple_operationsContext)_localctx).expression = expression(0);
				setState(342); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(341);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(344); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.body += "return " + ((Simple_operationsContext)_localctx).expression.value + ";\n";
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public String value;
		public TerminalNode WASSIGN() { return getToken(ExprParser.WASSIGN, 0); }
		public TerminalNode WPLUSASSIGN() { return getToken(ExprParser.WPLUSASSIGN, 0); }
		public TerminalNode WMINUSASSIGN() { return getToken(ExprParser.WMINUSASSIGN, 0); }
		public TerminalNode WPRODUCTASSIGN() { return getToken(ExprParser.WPRODUCTASSIGN, 0); }
		public TerminalNode WDIVASSIGN() { return getToken(ExprParser.WDIVASSIGN, 0); }
		public TerminalNode WDDIVASSIGN() { return getToken(ExprParser.WDDIVASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment_operator);
		((Assignment_operatorContext)_localctx).value =  "";
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(WASSIGN);
				((Assignment_operatorContext)_localctx).value =  " = ";
				}
				break;
			case WPLUSASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(WPLUSASSIGN);
				((Assignment_operatorContext)_localctx).value =  " += ";
				}
				break;
			case WMINUSASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(WMINUSASSIGN);
				((Assignment_operatorContext)_localctx).value =  " -= ";
				}
				break;
			case WPRODUCTASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(WPRODUCTASSIGN);
				((Assignment_operatorContext)_localctx).value =  " *= ";
				}
				break;
			case WDIVASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(WDIVASSIGN);
				((Assignment_operatorContext)_localctx).value =  " /= ";
				}
				break;
			case WDDIVASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				match(WDDIVASSIGN);
				((Assignment_operatorContext)_localctx).value =  " //= ";
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

	public static class Assignment_operandContext extends ParserRuleContext {
		public String value;
		public String type;
		public ExpressionContext expression;
		public TerminalNode READ() { return getToken(ExprParser.READ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignment_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignment_operand(this);
		}
	}

	public final Assignment_operandContext assignment_operand() throws RecognitionException {
		Assignment_operandContext _localctx = new Assignment_operandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment_operand);
		((Assignment_operandContext)_localctx).value =  ""; ((Assignment_operandContext)_localctx).type =  "";
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(READ);

				       ((Assignment_operandContext)_localctx).value =  "";
				       ((Assignment_operandContext)_localctx).type =  "READ";
				    
				}
				break;
			case WTRUE:
			case WFALSE:
			case WLPAREN:
			case WMINUS:
			case WNEGATE:
			case WNOT:
			case IDENTIFIER:
			case STR_CONST:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((Assignment_operandContext)_localctx).expression = expression(0);

				       ((Assignment_operandContext)_localctx).value =  ((Assignment_operandContext)_localctx).expression.value;
				       ((Assignment_operandContext)_localctx).type =  "expression";
				    
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

	public static class ExpressionContext extends ParserRuleContext {
		public String value;
		public String type;
		public ExpressionContext a;
		public Token STR_CONST;
		public Token INTEGER;
		public Unary_operatorContext up;
		public ExpressionContext b;
		public Token IDENTIFIER;
		public Binary_operatorContext op;
		public TerminalNode WLPAREN() { return getToken(ExprParser.WLPAREN, 0); }
		public TerminalNode WRPAREN() { return getToken(ExprParser.WRPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STR_CONST() { return getToken(ExprParser.STR_CONST, 0); }
		public TerminalNode INTEGER() { return getToken(ExprParser.INTEGER, 0); }
		public TerminalNode WTRUE() { return getToken(ExprParser.WTRUE, 0); }
		public TerminalNode WFALSE() { return getToken(ExprParser.WFALSE, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprParser.IDENTIFIER, 0); }
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		((ExpressionContext)_localctx).value =  ""; ((ExpressionContext)_localctx).type =  "d";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(372);
				match(WLPAREN);
				setState(373);
				((ExpressionContext)_localctx).a = expression(0);
				setState(374);
				match(WRPAREN);
				((ExpressionContext)_localctx).value =  "(" + ((ExpressionContext)_localctx).a.value + ")"; ((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).a.type; ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			case 2:
				{
				setState(377);
				((ExpressionContext)_localctx).STR_CONST = match(STR_CONST);
				((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).STR_CONST!=null?((ExpressionContext)_localctx).STR_CONST.getText():null); ((ExpressionContext)_localctx).type =  "s";
				}
				break;
			case 3:
				{
				setState(379);
				((ExpressionContext)_localctx).INTEGER = match(INTEGER);
				((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).INTEGER!=null?((ExpressionContext)_localctx).INTEGER.getText():null); ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			case 4:
				{
				setState(381);
				match(WTRUE);
				((ExpressionContext)_localctx).value =  "1"; ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			case 5:
				{
				setState(383);
				match(WFALSE);
				((ExpressionContext)_localctx).value =  "0"; ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			case 6:
				{
				setState(385);
				((ExpressionContext)_localctx).up = unary_operator();
				setState(386);
				((ExpressionContext)_localctx).b = expression(3);
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).up.value + ((ExpressionContext)_localctx).b.value; ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			case 7:
				{
				setState(389);
				((ExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(390);
				((ExpressionContext)_localctx).a = expression(2);
				((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).IDENTIFIER!=null?((ExpressionContext)_localctx).IDENTIFIER.getText():null) + ((ExpressionContext)_localctx).a.value; ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			case 8:
				{
				setState(393);
				((ExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((ExpressionContext)_localctx).value =  (((ExpressionContext)_localctx).IDENTIFIER!=null?((ExpressionContext)_localctx).IDENTIFIER.getText():null); ((ExpressionContext)_localctx).type =  "d";
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.a = _prevctx;
					_localctx.a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(397);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(398);
					((ExpressionContext)_localctx).op = binary_operator();
					setState(399);
					((ExpressionContext)_localctx).b = expression(5);
					((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).a.value + ((ExpressionContext)_localctx).op.value + ((ExpressionContext)_localctx).b.value; ((ExpressionContext)_localctx).type =  "d";
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public String value;
		public TerminalNode WPLUS() { return getToken(ExprParser.WPLUS, 0); }
		public TerminalNode WMINUS() { return getToken(ExprParser.WMINUS, 0); }
		public TerminalNode WPRODUCT() { return getToken(ExprParser.WPRODUCT, 0); }
		public TerminalNode WDIV() { return getToken(ExprParser.WDIV, 0); }
		public TerminalNode WMOD() { return getToken(ExprParser.WMOD, 0); }
		public TerminalNode WDDIV() { return getToken(ExprParser.WDDIV, 0); }
		public TerminalNode WPLUSASSIGN() { return getToken(ExprParser.WPLUSASSIGN, 0); }
		public TerminalNode WMINUSASSIGN() { return getToken(ExprParser.WMINUSASSIGN, 0); }
		public TerminalNode WPRODUCTASSIGN() { return getToken(ExprParser.WPRODUCTASSIGN, 0); }
		public TerminalNode WDIVASSIGN() { return getToken(ExprParser.WDIVASSIGN, 0); }
		public TerminalNode WDDIVASSIGN() { return getToken(ExprParser.WDDIVASSIGN, 0); }
		public TerminalNode WEQUALS() { return getToken(ExprParser.WEQUALS, 0); }
		public TerminalNode WNEQUALS() { return getToken(ExprParser.WNEQUALS, 0); }
		public TerminalNode WXOR() { return getToken(ExprParser.WXOR, 0); }
		public TerminalNode WOR() { return getToken(ExprParser.WOR, 0); }
		public TerminalNode WAND() { return getToken(ExprParser.WAND, 0); }
		public TerminalNode WSHL() { return getToken(ExprParser.WSHL, 0); }
		public TerminalNode WLESSEQ() { return getToken(ExprParser.WLESSEQ, 0); }
		public TerminalNode WLESS() { return getToken(ExprParser.WLESS, 0); }
		public TerminalNode WSHR() { return getToken(ExprParser.WSHR, 0); }
		public TerminalNode WGREATEREQ() { return getToken(ExprParser.WGREATEREQ, 0); }
		public TerminalNode WGREATER() { return getToken(ExprParser.WGREATER, 0); }
		public TerminalNode WLOR() { return getToken(ExprParser.WLOR, 0); }
		public TerminalNode WLAND() { return getToken(ExprParser.WLAND, 0); }
		public TerminalNode WCOMMA() { return getToken(ExprParser.WCOMMA, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinary_operator(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binary_operator);
		((Binary_operatorContext)_localctx).value =  "";
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WPLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(WPLUS);
				((Binary_operatorContext)_localctx).value =  " + ";
				}
				break;
			case WMINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(WMINUS);
				((Binary_operatorContext)_localctx).value =  " - ";
				}
				break;
			case WPRODUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(WPRODUCT);
				((Binary_operatorContext)_localctx).value =  " * ";
				}
				break;
			case WDIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(WDIV);
				((Binary_operatorContext)_localctx).value =  " / ";
				}
				break;
			case WMOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				match(WMOD);
				((Binary_operatorContext)_localctx).value =  " % ";
				}
				break;
			case WDDIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				match(WDDIV);
				((Binary_operatorContext)_localctx).value =  " / ";
				}
				break;
			case WPLUSASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				match(WPLUSASSIGN);
				((Binary_operatorContext)_localctx).value =  " += ";
				}
				break;
			case WMINUSASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(421);
				match(WMINUSASSIGN);
				((Binary_operatorContext)_localctx).value =  " -= ";
				}
				break;
			case WPRODUCTASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(423);
				match(WPRODUCTASSIGN);
				((Binary_operatorContext)_localctx).value =  " *= ";
				}
				break;
			case WDIVASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(425);
				match(WDIVASSIGN);
				((Binary_operatorContext)_localctx).value =  " /= ";
				}
				break;
			case WDDIVASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(427);
				match(WDDIVASSIGN);
				((Binary_operatorContext)_localctx).value =  " /= ";
				}
				break;
			case WEQUALS:
				enterOuterAlt(_localctx, 12);
				{
				setState(429);
				match(WEQUALS);
				((Binary_operatorContext)_localctx).value =  " == ";
				}
				break;
			case WNEQUALS:
				enterOuterAlt(_localctx, 13);
				{
				setState(431);
				match(WNEQUALS);
				((Binary_operatorContext)_localctx).value =  " != ";
				}
				break;
			case WXOR:
				enterOuterAlt(_localctx, 14);
				{
				setState(433);
				match(WXOR);
				((Binary_operatorContext)_localctx).value =  " ^ ";
				}
				break;
			case WOR:
				enterOuterAlt(_localctx, 15);
				{
				setState(435);
				match(WOR);
				((Binary_operatorContext)_localctx).value =  " | ";
				}
				break;
			case WAND:
				enterOuterAlt(_localctx, 16);
				{
				setState(437);
				match(WAND);
				((Binary_operatorContext)_localctx).value =  " & ";
				}
				break;
			case WSHL:
				enterOuterAlt(_localctx, 17);
				{
				setState(439);
				match(WSHL);
				((Binary_operatorContext)_localctx).value =  " << ";
				}
				break;
			case WLESSEQ:
				enterOuterAlt(_localctx, 18);
				{
				setState(441);
				match(WLESSEQ);
				((Binary_operatorContext)_localctx).value =  " <= ";
				}
				break;
			case WLESS:
				enterOuterAlt(_localctx, 19);
				{
				setState(443);
				match(WLESS);
				((Binary_operatorContext)_localctx).value =  " < ";
				}
				break;
			case WSHR:
				enterOuterAlt(_localctx, 20);
				{
				setState(445);
				match(WSHR);
				((Binary_operatorContext)_localctx).value =  " >> ";
				}
				break;
			case WGREATEREQ:
				enterOuterAlt(_localctx, 21);
				{
				setState(447);
				match(WGREATEREQ);
				((Binary_operatorContext)_localctx).value =  " >= ";
				}
				break;
			case WGREATER:
				enterOuterAlt(_localctx, 22);
				{
				setState(449);
				match(WGREATER);
				((Binary_operatorContext)_localctx).value =  " > ";
				}
				break;
			case WLOR:
				enterOuterAlt(_localctx, 23);
				{
				setState(451);
				match(WLOR);
				((Binary_operatorContext)_localctx).value =  " || ";
				}
				break;
			case WLAND:
				enterOuterAlt(_localctx, 24);
				{
				setState(453);
				match(WLAND);
				((Binary_operatorContext)_localctx).value =  " && ";
				}
				break;
			case WCOMMA:
				enterOuterAlt(_localctx, 25);
				{
				setState(455);
				match(WCOMMA);
				((Binary_operatorContext)_localctx).value =  ", ";
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public String value;
		public TerminalNode WNEGATE() { return getToken(ExprParser.WNEGATE, 0); }
		public TerminalNode WMINUS() { return getToken(ExprParser.WMINUS, 0); }
		public TerminalNode WNOT() { return getToken(ExprParser.WNOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unary_operator);
		((Unary_operatorContext)_localctx).value =  "";
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WNEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(WNEGATE);
				((Unary_operatorContext)_localctx).value =  " ~";
				}
				break;
			case WMINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(WMINUS);
				((Unary_operatorContext)_localctx).value =  " -";
				}
				break;
			case WNOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(WNOT);
				((Unary_operatorContext)_localctx).value =  " !";
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3$\n\3\r"+
		"\3\16\3%\3\3\3\3\3\3\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\6\3H\n\3\r\3\16\3I\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3\3\3\3\7"+
		"\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\3\6\3]\n\3\r\3\16\3^\3\3\3\3\7\3c\n\3"+
		"\f\3\16\3f\13\3\3\3\3\3\5\3j\n\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3r\n\3\r\3"+
		"\16\3s\3\3\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u008d\n\3\r\3\16\3\u008e\3\3\3\3"+
		"\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\6\3\u00a2\n\3\r\3\16\3\u00a3\3\3\3\3\7\3\u00a8\n\3\f\3\16\3\u00ab"+
		"\13\3\3\3\3\3\7\3\u00af\n\3\f\3\16\3\u00b2\13\3\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u00b9\n\4\f\4\16\4\u00bc\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\6\6\u00ca\n\6\r\6\16\6\u00cb\3\6\3\6\7\6\u00d0\n\6\f\6\16\6"+
		"\u00d3\13\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00db\n\6\r\6\16\6\u00dc\3\6\3"+
		"\6\7\6\u00e1\n\6\f\6\16\6\u00e4\13\6\3\6\3\6\7\6\u00e8\n\6\f\6\16\6\u00eb"+
		"\13\6\3\6\3\6\3\6\3\6\6\6\u00f1\n\6\r\6\16\6\u00f2\3\6\3\6\7\6\u00f7\n"+
		"\6\f\6\16\6\u00fa\13\6\3\6\3\6\5\6\u00fe\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6\u0107\n\6\r\6\16\6\u0108\3\6\3\6\7\6\u010d\n\6\f\6\16\6\u0110\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\6\6\u0123\n\6\r\6\16\6\u0124\3\6\3\6\7\6\u0129\n\6\f\6\16\6\u012c\13"+
		"\6\3\6\3\6\7\6\u0130\n\6\f\6\16\6\u0133\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u013d\n\b\f\b\16\b\u0140\13\b\3\t\3\t\3\t\3\t\6\t\u0146\n\t"+
		"\r\t\16\t\u0147\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0150\n\t\r\t\16\t\u0151\3"+
		"\t\3\t\3\t\3\t\3\t\6\t\u0159\n\t\r\t\16\t\u015a\3\t\3\t\5\t\u015f\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u016d\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0174\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u018e"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u0195\n\f\f\f\16\f\u0198\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01cc\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01d4\n\16\3\16\2\3\26\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\2\2\u021d\2\34\3\2\2\2\4\u00b0\3\2\2\2\6\u00b3\3"+
		"\2\2\2\b\u00bd\3\2\2\2\n\u0131\3\2\2\2\f\u0134\3\2\2\2\16\u013e\3\2\2"+
		"\2\20\u015e\3\2\2\2\22\u016c\3\2\2\2\24\u0173\3\2\2\2\26\u018d\3\2\2\2"+
		"\30\u01cb\3\2\2\2\32\u01d3\3\2\2\2\34\35\5\4\3\2\35\36\b\2\1\2\36\3\3"+
		"\2\2\2\37 \7\62\2\2 !\5\22\n\2!#\5\24\13\2\"$\7\5\2\2#\"\3\2\2\2$%\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b\3\1\2(\u00af\3\2\2\2)*\7\61\2"+
		"\2*+\5\26\f\2+-\7\24\2\2,.\7\5\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\b\3\1\2\62\u00af\3\2\2\2\63\64\7\t\2\2\64\65"+
		"\5\26\f\2\65\67\7\b\2\2\668\7\5\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2"+
		"\29:\3\2\2\2:;\3\2\2\2;?\5\b\5\2<>\7\5\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2Bi\b\3\1\2CD\7\n\2\2DE\5\26\f\2EG\7\b"+
		"\2\2FH\7\5\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KO\5\b"+
		"\5\2LN\7\5\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2"+
		"\2\2RS\b\3\1\2SU\3\2\2\2TC\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2"+
		"\2\2XV\3\2\2\2YZ\7\13\2\2Z\\\7\b\2\2[]\7\5\2\2\\[\3\2\2\2]^\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_`\3\2\2\2`d\5\b\5\2ac\7\5\2\2ba\3\2\2\2cf\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\b\3\1\2hj\3\2\2\2iV\3\2\2\2"+
		"ij\3\2\2\2jk\3\2\2\2kl\b\3\1\2l\u00af\3\2\2\2mn\7\f\2\2no\5\26\f\2oq\7"+
		"\b\2\2pr\7\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uy\5"+
		"\b\5\2vx\7\5\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3"+
		"\2\2\2|}\b\3\1\2}\u00af\3\2\2\2~\177\7\17\2\2\177\u0080\7\62\2\2\u0080"+
		"\u0081\b\3\1\2\u0081\u0082\7\20\2\2\u0082\u0083\7\21\2\2\u0083\u0084\7"+
		"\23\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\22\2\2\u0086\u0087\5\26\f\2"+
		"\u0087\u0088\7\22\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\24\2\2\u008a"+
		"\u008c\7\b\2\2\u008b\u008d\7\5\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0094\5\b\5\2\u0091\u0093\7\5\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\b\3\1\2\u0098\u00af\3\2\2\2\u0099\u009a\7\r"+
		"\2\2\u009a\u009b\7\62\2\2\u009b\u009c\7\23\2\2\u009c\u009d\5\6\4\2\u009d"+
		"\u009e\b\3\1\2\u009e\u009f\7\24\2\2\u009f\u00a1\7\b\2\2\u00a0\u00a2\7"+
		"\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\5\b\5\2\u00a6\u00a8\7\5"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\3"+
		"\1\2\u00ad\u00af\3\2\2\2\u00ae\37\3\2\2\2\u00ae)\3\2\2\2\u00ae\63\3\2"+
		"\2\2\u00aem\3\2\2\2\u00ae~\3\2\2\2\u00ae\u0099\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\5\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b4\7\62\2\2\u00b4\u00ba\b\4\1\2\u00b5\u00b6\7\22\2\2"+
		"\u00b6\u00b7\7\62\2\2\u00b7\u00b9\b\4\1\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\7\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\b\5\1\2\u00bf\t\3\2\2\2"+
		"\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\b\6\1\2\u00c3\u0130"+
		"\3\2\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\7\t\2\2\u00c6\u00c7\5\26\f\2"+
		"\u00c7\u00c9\7\b\2\2\u00c8\u00ca\7\5\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d1\5\f\7\2\u00ce\u00d0\7\5\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00fd\b\6\1\2\u00d5\u00d6\7\4\2\2\u00d6\u00d7\7\n"+
		"\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00da\7\b\2\2\u00d9\u00db\7\5\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\5\f\7\2\u00df\u00e1\7\5\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\6\1\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00d5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\7\4\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00f0\7\b\2\2\u00ef\u00f1\7"+
		"\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f8\5\f\7\2\u00f5\u00f7\7\5"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\b\6"+
		"\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\b\6\1\2\u0100\u0130\3\2\2\2\u0101\u0102\7\4"+
		"\2\2\u0102\u0103\7\f\2\2\u0103\u0104\5\26\f\2\u0104\u0106\7\b\2\2\u0105"+
		"\u0107\7\5\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\5\f\7\2\u010b"+
		"\u010d\7\5\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0112\b\6\1\2\u0112\u0130\3\2\2\2\u0113\u0114\7\4\2\2\u0114\u0115\7\17"+
		"\2\2\u0115\u0116\7\62\2\2\u0116\u0117\b\6\1\2\u0117\u0118\7\20\2\2\u0118"+
		"\u0119\7\21\2\2\u0119\u011a\7\23\2\2\u011a\u011b\5\26\f\2\u011b\u011c"+
		"\7\22\2\2\u011c\u011d\5\26\f\2\u011d\u011e\7\22\2\2\u011e\u011f\5\26\f"+
		"\2\u011f\u0120\7\24\2\2\u0120\u0122\7\b\2\2\u0121\u0123\7\5\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u012a\5\f\7\2\u0127\u0129\7\5\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b\6\1\2\u012e"+
		"\u0130\3\2\2\2\u012f\u00c0\3\2\2\2\u012f\u00c4\3\2\2\2\u012f\u0101\3\2"+
		"\2\2\u012f\u0113\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\13\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\16\b"+
		"\2\u0135\u0136\b\7\1\2\u0136\r\3\2\2\2\u0137\u0138\7\4\2\2\u0138\u0139"+
		"\7\4\2\2\u0139\u013a\5\20\t\2\u013a\u013b\b\b\1\2\u013b\u013d\3\2\2\2"+
		"\u013c\u0137\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\17\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\62\2\2\u0142"+
		"\u0143\5\22\n\2\u0143\u0145\5\24\13\2\u0144\u0146\7\5\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\b\t\1\2\u014a\u015f\3\2\2\2\u014b\u014c\7\61"+
		"\2\2\u014c\u014d\5\26\f\2\u014d\u014f\7\24\2\2\u014e\u0150\7\5\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\t\1\2\u0154\u015f\3\2\2\2\u0155"+
		"\u0156\7\16\2\2\u0156\u0158\5\26\f\2\u0157\u0159\7\5\2\2\u0158\u0157\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\b\t\1\2\u015d\u015f\3\2\2\2\u015e\u0141\3\2"+
		"\2\2\u015e\u014b\3\2\2\2\u015e\u0155\3\2\2\2\u015f\21\3\2\2\2\u0160\u0161"+
		"\7\27\2\2\u0161\u016d\b\n\1\2\u0162\u0163\7\36\2\2\u0163\u016d\b\n\1\2"+
		"\u0164\u0165\7\37\2\2\u0165\u016d\b\n\1\2\u0166\u0167\7 \2\2\u0167\u016d"+
		"\b\n\1\2\u0168\u0169\7!\2\2\u0169\u016d\b\n\1\2\u016a\u016b\7\"\2\2\u016b"+
		"\u016d\b\n\1\2\u016c\u0160\3\2\2\2\u016c\u0162\3\2\2\2\u016c\u0164\3\2"+
		"\2\2\u016c\u0166\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\23\3\2\2\2\u016e\u016f\7\60\2\2\u016f\u0174\b\13\1\2\u0170\u0171\5\26"+
		"\f\2\u0171\u0172\b\13\1\2\u0172\u0174\3\2\2\2\u0173\u016e\3\2\2\2\u0173"+
		"\u0170\3\2\2\2\u0174\25\3\2\2\2\u0175\u0176\b\f\1\2\u0176\u0177\7\23\2"+
		"\2\u0177\u0178\5\26\f\2\u0178\u0179\7\24\2\2\u0179\u017a\b\f\1\2\u017a"+
		"\u018e\3\2\2\2\u017b\u017c\7\63\2\2\u017c\u018e\b\f\1\2\u017d\u017e\7"+
		"\64\2\2\u017e\u018e\b\f\1\2\u017f\u0180\7\6\2\2\u0180\u018e\b\f\1\2\u0181"+
		"\u0182\7\7\2\2\u0182\u018e\b\f\1\2\u0183\u0184\5\32\16\2\u0184\u0185\5"+
		"\26\f\5\u0185\u0186\b\f\1\2\u0186\u018e\3\2\2\2\u0187\u0188\7\62\2\2\u0188"+
		"\u0189\5\26\f\4\u0189\u018a\b\f\1\2\u018a\u018e\3\2\2\2\u018b\u018c\7"+
		"\62\2\2\u018c\u018e\b\f\1\2\u018d\u0175\3\2\2\2\u018d\u017b\3\2\2\2\u018d"+
		"\u017d\3\2\2\2\u018d\u017f\3\2\2\2\u018d\u0181\3\2\2\2\u018d\u0183\3\2"+
		"\2\2\u018d\u0187\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0196\3\2\2\2\u018f"+
		"\u0190\f\6\2\2\u0190\u0191\5\30\r\2\u0191\u0192\5\26\f\7\u0192\u0193\b"+
		"\f\1\2\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\27\3\2\2\2\u0198\u0196\3\2\2"+
		"\2\u0199\u019a\7\30\2\2\u019a\u01cc\b\r\1\2\u019b\u019c\7\31\2\2\u019c"+
		"\u01cc\b\r\1\2\u019d\u019e\7\32\2\2\u019e\u01cc\b\r\1\2\u019f\u01a0\7"+
		"\33\2\2\u01a0\u01cc\b\r\1\2\u01a1\u01a2\7\34\2\2\u01a2\u01cc\b\r\1\2\u01a3"+
		"\u01a4\7\35\2\2\u01a4\u01cc\b\r\1\2\u01a5\u01a6\7\36\2\2\u01a6\u01cc\b"+
		"\r\1\2\u01a7\u01a8\7\37\2\2\u01a8\u01cc\b\r\1\2\u01a9\u01aa\7 \2\2\u01aa"+
		"\u01cc\b\r\1\2\u01ab\u01ac\7!\2\2\u01ac\u01cc\b\r\1\2\u01ad\u01ae\7\""+
		"\2\2\u01ae\u01cc\b\r\1\2\u01af\u01b0\7\25\2\2\u01b0\u01cc\b\r\1\2\u01b1"+
		"\u01b2\7\26\2\2\u01b2\u01cc\b\r\1\2\u01b3\u01b4\7#\2\2\u01b4\u01cc\b\r"+
		"\1\2\u01b5\u01b6\7$\2\2\u01b6\u01cc\b\r\1\2\u01b7\u01b8\7%\2\2\u01b8\u01cc"+
		"\b\r\1\2\u01b9\u01ba\7&\2\2\u01ba\u01cc\b\r\1\2\u01bb\u01bc\7(\2\2\u01bc"+
		"\u01cc\b\r\1\2\u01bd\u01be\7)\2\2\u01be\u01cc\b\r\1\2\u01bf\u01c0\7\'"+
		"\2\2\u01c0\u01cc\b\r\1\2\u01c1\u01c2\7*\2\2\u01c2\u01cc\b\r\1\2\u01c3"+
		"\u01c4\7+\2\2\u01c4\u01cc\b\r\1\2\u01c5\u01c6\7,\2\2\u01c6\u01cc\b\r\1"+
		"\2\u01c7\u01c8\7-\2\2\u01c8\u01cc\b\r\1\2\u01c9\u01ca\7\22\2\2\u01ca\u01cc"+
		"\b\r\1\2\u01cb\u0199\3\2\2\2\u01cb\u019b\3\2\2\2\u01cb\u019d\3\2\2\2\u01cb"+
		"\u019f\3\2\2\2\u01cb\u01a1\3\2\2\2\u01cb\u01a3\3\2\2\2\u01cb\u01a5\3\2"+
		"\2\2\u01cb\u01a7\3\2\2\2\u01cb\u01a9\3\2\2\2\u01cb\u01ab\3\2\2\2\u01cb"+
		"\u01ad\3\2\2\2\u01cb\u01af\3\2\2\2\u01cb\u01b1\3\2\2\2\u01cb\u01b3\3\2"+
		"\2\2\u01cb\u01b5\3\2\2\2\u01cb\u01b7\3\2\2\2\u01cb\u01b9\3\2\2\2\u01cb"+
		"\u01bb\3\2\2\2\u01cb\u01bd\3\2\2\2\u01cb\u01bf\3\2\2\2\u01cb\u01c1\3\2"+
		"\2\2\u01cb\u01c3\3\2\2\2\u01cb\u01c5\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\31\3\2\2\2\u01cd\u01ce\7.\2\2\u01ce\u01d4\b\16\1"+
		"\2\u01cf\u01d0\7\31\2\2\u01d0\u01d4\b\16\1\2\u01d1\u01d2\7/\2\2\u01d2"+
		"\u01d4\b\16\1\2\u01d3\u01cd\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d1\3"+
		"\2\2\2\u01d4\33\3\2\2\2.%/9?IOV^disy\u008e\u0094\u00a3\u00a9\u00ae\u00b0"+
		"\u00ba\u00cb\u00d1\u00dc\u00e2\u00e9\u00f2\u00f8\u00fd\u0108\u010e\u0124"+
		"\u012a\u012f\u0131\u013e\u0147\u0151\u015a\u015e\u016c\u0173\u018d\u0196"+
		"\u01cb\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}