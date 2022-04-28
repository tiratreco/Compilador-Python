// Generated from C:/Users/gstvu/Documents/Compilador-Python\pyGram.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pyGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGNMENT=1, GT=2, LT=3, GE=4, LE=5, EQ=6, NE=7, PLUS=8, MINUS=9, TIMES=10, 
		DIVIDES=11, COMMA=12, COLON=13, SEMI_COLON=14, OPEN=15, CLOSE=16, BRACKET=17, 
		OR=18, AND=19, NOT=20, FOR=21, BREAK=22, IF=23, ELSE=24, WHILE=25, IN=26, 
		DEF=27, MAIN=28, RETURN=29, VOID=30, TYPE=31, PRINT=32, INPUT=33, RANGE=34, 
		INT_VALUE=35, FLOAT_VALUE=36, STR_VALUE=37, BOOL_VALUE=38, ID=39, WS=40;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_local = 2, RULE_function = 3, RULE_r_return = 4, 
		RULE_function_call = 5, RULE_r_for = 6, RULE_r_while = 7, RULE_r_break = 8, 
		RULE_r_if = 9, RULE_r_else = 10, RULE_r_print = 11, RULE_declaration = 12, 
		RULE_assigment = 13, RULE_expr = 14, RULE_term = 15, RULE_term2 = 16, 
		RULE_term3 = 17, RULE_term4 = 18, RULE_term5 = 19, RULE_term6 = 20, RULE_factor = 21, 
		RULE_r_input = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "local", "function", "r_return", "function_call", "r_for", 
			"r_while", "r_break", "r_if", "r_else", "r_print", "declaration", "assigment", 
			"expr", "term", "term2", "term3", "term4", "term5", "term6", "factor", 
			"r_input"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "','", "':'", "';'", "'('", "')'", "'}'", "'or'", "'and'", 
			"'not'", "'for'", "'break'", "'if'", "'else'", "'while'", "'in'", "'def'", 
			"'main'", "'return'", "'void'", null, "'print'", "'input'", "'range'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGNMENT", "GT", "LT", "GE", "LE", "EQ", "NE", "PLUS", "MINUS", 
			"TIMES", "DIVIDES", "COMMA", "COLON", "SEMI_COLON", "OPEN", "CLOSE", 
			"BRACKET", "OR", "AND", "NOT", "FOR", "BREAK", "IF", "ELSE", "WHILE", 
			"IN", "DEF", "MAIN", "RETURN", "VOID", "TYPE", "PRINT", "INPUT", "RANGE", 
			"INT_VALUE", "FLOAT_VALUE", "STR_VALUE", "BOOL_VALUE", "ID", "WS"
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
	public String getGrammarFileName() { return "pyGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pyGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitProg(this);
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
			while (_la==TYPE) {
				{
				{
				setState(46);
				declaration();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(52);
				function();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			main();
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
		public TerminalNode MAIN() { return getToken(pyGramParser.MAIN, 0); }
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(MAIN);
			setState(61);
			match(OPEN);
			setState(62);
			match(CLOSE);
			setState(63);
			match(COLON);
			setState(64);
			local();
			setState(65);
			match(BRACKET);
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

	public static class LocalContext extends ParserRuleContext {
		public R_forContext r_for() {
			return getRuleContext(R_forContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public R_breakContext r_break() {
			return getRuleContext(R_breakContext.class,0);
		}
		public R_whileContext r_while() {
			return getRuleContext(R_whileContext.class,0);
		}
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public R_elseContext r_else() {
			return getRuleContext(R_elseContext.class,0);
		}
		public R_printContext r_print() {
			return getRuleContext(R_printContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public R_returnContext r_return() {
			return getRuleContext(R_returnContext.class,0);
		}
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_local);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				r_for();
				setState(68);
				local();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				r_break();
				setState(71);
				local();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				r_while();
				setState(74);
				local();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				r_if();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(77);
					r_else();
					}
				}

				setState(80);
				local();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				r_print();
				setState(83);
				local();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				assigment();
				setState(86);
				local();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				function_call();
				setState(89);
				match(SEMI_COLON);
				setState(90);
				local();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				r_return();
				setState(93);
				local();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class L_typeContext extends FunctionContext {
		public TerminalNode DEF() { return getToken(pyGramParser.DEF, 0); }
		public List<TerminalNode> TYPE() { return getTokens(pyGramParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(pyGramParser.TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(pyGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pyGramParser.ID, i);
		}
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pyGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyGramParser.COMMA, i);
		}
		public L_typeContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_voidContext extends FunctionContext {
		public TerminalNode DEF() { return getToken(pyGramParser.DEF, 0); }
		public TerminalNode VOID() { return getToken(pyGramParser.VOID, 0); }
		public List<TerminalNode> ID() { return getTokens(pyGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pyGramParser.ID, i);
		}
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public List<TerminalNode> TYPE() { return getTokens(pyGramParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(pyGramParser.TYPE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyGramParser.COMMA, i);
		}
		public L_voidContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_void(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new L_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(DEF);
				setState(99);
				match(TYPE);
				setState(100);
				match(ID);
				setState(101);
				match(OPEN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(102);
					match(TYPE);
					setState(103);
					match(ID);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(104);
						match(COMMA);
						setState(105);
						match(TYPE);
						setState(106);
						match(ID);
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(114);
				match(CLOSE);
				setState(115);
				match(COLON);
				setState(116);
				local();
				setState(117);
				match(BRACKET);
				}
				break;
			case 2:
				_localctx = new L_voidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DEF);
				setState(120);
				match(VOID);
				setState(121);
				match(ID);
				setState(122);
				match(OPEN);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(123);
					match(TYPE);
					setState(124);
					match(ID);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(125);
						match(COMMA);
						setState(126);
						match(TYPE);
						setState(127);
						match(ID);
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(135);
				match(CLOSE);
				setState(136);
				match(COLON);
				setState(137);
				local();
				setState(138);
				match(BRACKET);
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

	public static class R_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pyGramParser.RETURN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public R_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_returnContext r_return() throws RecognitionException {
		R_returnContext _localctx = new R_returnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_r_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(RETURN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OPEN) | (1L << NOT) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << STR_VALUE) | (1L << BOOL_VALUE) | (1L << ID))) != 0)) {
				{
				setState(143);
				expr(0);
				}
			}

			setState(146);
			match(SEMI_COLON);
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

	public static class Function_callContext extends ParserRuleContext {
		public  type;
		public TerminalNode ID() { return getToken(pyGramParser.ID, 0); }
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyGramParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(149);
			match(OPEN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OPEN) | (1L << NOT) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << STR_VALUE) | (1L << BOOL_VALUE) | (1L << ID))) != 0)) {
				{
				setState(150);
				expr(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					expr(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160);
			match(CLOSE);
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

	public static class R_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pyGramParser.FOR, 0); }
		public TerminalNode ID() { return getToken(pyGramParser.ID, 0); }
		public TerminalNode IN() { return getToken(pyGramParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(pyGramParser.RANGE, 0); }
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(pyGramParser.COMMA, 0); }
		public R_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_forContext r_for() throws RecognitionException {
		R_forContext _localctx = new R_forContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_r_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(FOR);
			setState(163);
			match(ID);
			setState(164);
			match(IN);
			setState(165);
			match(RANGE);
			setState(166);
			match(OPEN);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(167);
				expr(0);
				setState(168);
				match(COMMA);
				}
				break;
			}
			setState(172);
			expr(0);
			setState(173);
			match(CLOSE);
			setState(174);
			match(COLON);
			setState(175);
			local();
			setState(176);
			match(BRACKET);
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

	public static class R_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pyGramParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public R_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_whileContext r_while() throws RecognitionException {
		R_whileContext _localctx = new R_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(WHILE);
			setState(179);
			expr(0);
			setState(180);
			match(COLON);
			setState(181);
			local();
			setState(182);
			match(BRACKET);
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

	public static class R_breakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(pyGramParser.BREAK, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public R_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_break(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_breakContext r_break() throws RecognitionException {
		R_breakContext _localctx = new R_breakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_r_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(BREAK);
			setState(185);
			match(SEMI_COLON);
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

	public static class R_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pyGramParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public R_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ifContext r_if() throws RecognitionException {
		R_ifContext _localctx = new R_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IF);
			setState(188);
			expr(0);
			setState(189);
			match(COLON);
			setState(190);
			local();
			setState(191);
			match(BRACKET);
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

	public static class R_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(pyGramParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(pyGramParser.COLON, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(pyGramParser.BRACKET, 0); }
		public R_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_elseContext r_else() throws RecognitionException {
		R_elseContext _localctx = new R_elseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_r_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ELSE);
			setState(194);
			match(COLON);
			setState(195);
			local();
			setState(196);
			match(BRACKET);
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

	public static class R_printContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(pyGramParser.PRINT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyGramParser.COMMA, i);
		}
		public R_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_printContext r_print() throws RecognitionException {
		R_printContext _localctx = new R_printContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_r_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(PRINT);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << OPEN) | (1L << NOT) | (1L << INT_VALUE) | (1L << FLOAT_VALUE) | (1L << STR_VALUE) | (1L << BOOL_VALUE) | (1L << ID))) != 0)) {
				{
				setState(199);
				expr(0);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					expr(0);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(209);
			match(SEMI_COLON);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(pyGramParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(pyGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pyGramParser.ID, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public List<TerminalNode> ASSIGNMENT() { return getTokens(pyGramParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(pyGramParser.ASSIGNMENT, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyGramParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TYPE);
			setState(212);
			match(ID);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(213);
				match(ASSIGNMENT);
				setState(214);
				expr(0);
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				match(ID);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(219);
					match(ASSIGNMENT);
					setState(220);
					expr(0);
					}
				}

				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(SEMI_COLON);
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

	public static class AssigmentContext extends ParserRuleContext {
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
	 
		public AssigmentContext() { }
		public void copyFrom(AssigmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputContext extends AssigmentContext {
		public TerminalNode ID() { return getToken(pyGramParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(pyGramParser.ASSIGNMENT, 0); }
		public R_inputContext r_input() {
			return getRuleContext(R_inputContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public InputContext(AssigmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_assigmentContext extends AssigmentContext {
		public TerminalNode ID() { return getToken(pyGramParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(pyGramParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pyGramParser.SEMI_COLON, 0); }
		public E_assigmentContext(AssigmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_assigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_assigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_assigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assigment);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new E_assigmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(ID);
				setState(231);
				match(ASSIGNMENT);
				setState(232);
				expr(0);
				setState(233);
				match(SEMI_COLON);
				}
				break;
			case 2:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ID);
				setState(236);
				match(ASSIGNMENT);
				setState(237);
				r_input();
				setState(238);
				match(SEMI_COLON);
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

	public static class ExprContext extends ParserRuleContext {
		public  type;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class Or_logicContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(pyGramParser.OR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Or_logicContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterOr_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitOr_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitOr_logic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_termContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public E_termContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E_termContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(243);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_logicContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(245);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(246);
					match(OR);
					setState(247);
					term(0);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public  type;
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class And_logicContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode AND() { return getToken(pyGramParser.AND, 0); }
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public And_logicContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterAnd_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitAnd_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitAnd_logic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_term2Context extends TermContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public E_term2Context(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_term2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_term2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_term2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E_term2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(254);
			term2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_logicContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(256);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(257);
					match(AND);
					setState(258);
					term2(0);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Term2Context extends ParserRuleContext {
		public  type;
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
	 
		public Term2Context() { }
		public void copyFrom(Term2Context ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class Comp_logicContext extends Term2Context {
		public Token op;
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public TerminalNode GT() { return getToken(pyGramParser.GT, 0); }
		public TerminalNode LT() { return getToken(pyGramParser.LT, 0); }
		public TerminalNode LE() { return getToken(pyGramParser.LE, 0); }
		public TerminalNode GE() { return getToken(pyGramParser.GE, 0); }
		public Comp_logicContext(Term2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterComp_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitComp_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitComp_logic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_term3Context extends Term2Context {
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public E_term3Context(Term2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_term3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_term3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_term3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		return term2(0);
	}

	private Term2Context term2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term2Context _localctx = new Term2Context(_ctx, _parentState);
		Term2Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_term2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E_term3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(265);
			term3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comp_logicContext(new Term2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term2);
					setState(267);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(268);
					((Comp_logicContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
						((Comp_logicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(269);
					term3(0);
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Term3Context extends ParserRuleContext {
		public  type;
		public Term3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term3; }
	 
		public Term3Context() { }
		public void copyFrom(Term3Context ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class Eq_logicContext extends Term3Context {
		public Token op;
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public TerminalNode EQ() { return getToken(pyGramParser.EQ, 0); }
		public TerminalNode NE() { return getToken(pyGramParser.NE, 0); }
		public Eq_logicContext(Term3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterEq_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitEq_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitEq_logic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_term4Context extends Term3Context {
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public E_term4Context(Term3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_term4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_term4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_term4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term3Context term3() throws RecognitionException {
		return term3(0);
	}

	private Term3Context term3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term3Context _localctx = new Term3Context(_ctx, _parentState);
		Term3Context _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_term3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E_term4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(276);
			term4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Eq_logicContext(new Term3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term3);
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					((Eq_logicContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NE) ) {
						((Eq_logicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(280);
					term4(0);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Term4Context extends ParserRuleContext {
		public  type;
		public Term4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term4; }
	 
		public Term4Context() { }
		public void copyFrom(Term4Context ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class Sum_minusContext extends Term4Context {
		public Token op;
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(pyGramParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pyGramParser.MINUS, 0); }
		public Sum_minusContext(Term4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterSum_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitSum_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitSum_minus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_term5Context extends Term4Context {
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public E_term5Context(Term4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_term5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_term5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_term5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term4Context term4() throws RecognitionException {
		return term4(0);
	}

	private Term4Context term4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term4Context _localctx = new Term4Context(_ctx, _parentState);
		Term4Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E_term5Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(287);
			term5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sum_minusContext(new Term4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term4);
					setState(289);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(290);
					((Sum_minusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((Sum_minusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(291);
					term5(0);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Term5Context extends ParserRuleContext {
		public  type;
		public Term5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term5; }
	 
		public Term5Context() { }
		public void copyFrom(Term5Context ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class E_term6Context extends Term5Context {
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public E_term6Context(Term5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_term6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_term6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_term6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Time_divContext extends Term5Context {
		public Token op;
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public TerminalNode TIMES() { return getToken(pyGramParser.TIMES, 0); }
		public TerminalNode DIVIDES() { return getToken(pyGramParser.DIVIDES, 0); }
		public Time_divContext(Term5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterTime_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitTime_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitTime_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term5Context term5() throws RecognitionException {
		return term5(0);
	}

	private Term5Context term5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term5Context _localctx = new Term5Context(_ctx, _parentState);
		Term5Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term5, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new E_term6Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(298);
			term6();
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Time_divContext(new Term5Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term5);
					setState(300);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(301);
					((Time_divContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVIDES) ) {
						((Time_divContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(302);
					term6();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Term6Context extends ParserRuleContext {
		public  type;
		public Term6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term6; }
	 
		public Term6Context() { }
		public void copyFrom(Term6Context ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class Minus_notContext extends Term6Context {
		public Token op;
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(pyGramParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(pyGramParser.NOT, 0); }
		public Minus_notContext(Term6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterMinus_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitMinus_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitMinus_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_factorContext extends Term6Context {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public E_factorContext(Term6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterE_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitE_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitE_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term6Context term6() throws RecognitionException {
		Term6Context _localctx = new Term6Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_term6);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				_localctx = new Minus_notContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				((Minus_notContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((Minus_notContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				term6();
				}
				break;
			case OPEN:
			case INT_VALUE:
			case FLOAT_VALUE:
			case STR_VALUE:
			case BOOL_VALUE:
			case ID:
				_localctx = new E_factorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public  type;
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class L_str_valueContext extends FactorContext {
		public TerminalNode STR_VALUE() { return getToken(pyGramParser.STR_VALUE, 0); }
		public L_str_valueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_str_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_str_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_str_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_int_valueContext extends FactorContext {
		public TerminalNode INT_VALUE() { return getToken(pyGramParser.INT_VALUE, 0); }
		public L_int_valueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_int_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_int_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_int_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_bool_valueContext extends FactorContext {
		public TerminalNode BOOL_VALUE() { return getToken(pyGramParser.BOOL_VALUE, 0); }
		public L_bool_valueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_bool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_bool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_bool_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_idContext extends FactorContext {
		public TerminalNode ID() { return getToken(pyGramParser.ID, 0); }
		public L_idContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_float_valueContext extends FactorContext {
		public TerminalNode FLOAT_VALUE() { return getToken(pyGramParser.FLOAT_VALUE, 0); }
		public L_float_valueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_float_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_float_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_float_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_exprContext extends FactorContext {
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public L_exprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class L_function_callContext extends FactorContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public L_function_callContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterL_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitL_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitL_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new L_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(OPEN);
				setState(314);
				expr(0);
				setState(315);
				match(CLOSE);
				}
				break;
			case 2:
				_localctx = new L_idContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(ID);
				}
				break;
			case 3:
				_localctx = new L_int_valueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(INT_VALUE);
				}
				break;
			case 4:
				_localctx = new L_float_valueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(FLOAT_VALUE);
				}
				break;
			case 5:
				_localctx = new L_str_valueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(STR_VALUE);
				}
				break;
			case 6:
				_localctx = new L_bool_valueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				match(BOOL_VALUE);
				}
				break;
			case 7:
				_localctx = new L_function_callContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				function_call();
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

	public static class R_inputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(pyGramParser.INPUT, 0); }
		public TerminalNode OPEN() { return getToken(pyGramParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(pyGramParser.CLOSE, 0); }
		public R_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).enterR_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pyGramListener ) ((pyGramListener)listener).exitR_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pyGramVisitor ) return ((pyGramVisitor<? extends T>)visitor).visitR_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_inputContext r_input() throws RecognitionException {
		R_inputContext _localctx = new R_inputContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_r_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(INPUT);
			setState(326);
			match(OPEN);
			setState(327);
			match(CLOSE);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return term_sempred((TermContext)_localctx, predIndex);
		case 16:
			return term2_sempred((Term2Context)_localctx, predIndex);
		case 17:
			return term3_sempred((Term3Context)_localctx, predIndex);
		case 18:
			return term4_sempred((Term4Context)_localctx, predIndex);
		case 19:
			return term5_sempred((Term5Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term2_sempred(Term2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term3_sempred(Term3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term4_sempred(Term4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term5_sempred(Term5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u00009\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003o\t\u0003\u0003\u0003q\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0081\b\u0003\n\u0003\f\u0003\u0084"+
		"\t\u0003\u0003\u0003\u0086\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u008d\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0091\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009a\b\u0005\n\u0005"+
		"\f\u0005\u009d\t\u0005\u0003\u0005\u009f\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ab\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00cb\b\u000b\n\u000b\f\u000b\u00ce\t\u000b\u0003\u000b\u00d0\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00d8\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00de\b\f\u0005\f\u00e0"+
		"\b\f\n\f\f\f\u00e3\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f1\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00f9\b\u000e\n\u000e\f\u000e\u00fc\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0104\b\u000f"+
		"\n\u000f\f\u000f\u0107\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u010f\b\u0010\n\u0010\f\u0010"+
		"\u0112\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u011a\b\u0011\n\u0011\f\u0011\u011d\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0125\b\u0012\n\u0012\f\u0012\u0128\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0130\b\u0013"+
		"\n\u0013\f\u0013\u0133\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0138\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0144\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0000\u0006\u001c\u001e \"$&\u0017\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0005\u0001\u0000\u0002\u0005\u0001\u0000\u0006\u0007\u0001\u0000\b\t"+
		"\u0001\u0000\n\u000b\u0002\u0000\t\t\u0014\u0014\u0159\u00001\u0001\u0000"+
		"\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000"+
		"\u0006\u008c\u0001\u0000\u0000\u0000\b\u008e\u0001\u0000\u0000\u0000\n"+
		"\u0094\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000\u000e\u00b2"+
		"\u0001\u0000\u0000\u0000\u0010\u00b8\u0001\u0000\u0000\u0000\u0012\u00bb"+
		"\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000\u0000\u0000\u0016\u00c6"+
		"\u0001\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a\u00f0"+
		"\u0001\u0000\u0000\u0000\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u00fd"+
		"\u0001\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000\"\u0113\u0001"+
		"\u0000\u0000\u0000$\u011e\u0001\u0000\u0000\u0000&\u0129\u0001\u0000\u0000"+
		"\u0000(\u0137\u0001\u0000\u0000\u0000*\u0143\u0001\u0000\u0000\u0000,"+
		"\u0145\u0001\u0000\u0000\u0000.0\u0003\u0018\f\u0000/.\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000027\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0003"+
		"\u0006\u0003\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;\u0001\u0001"+
		"\u0000\u0000\u0000<=\u0005\u001c\u0000\u0000=>\u0005\u000f\u0000\u0000"+
		">?\u0005\u0010\u0000\u0000?@\u0005\r\u0000\u0000@A\u0003\u0004\u0002\u0000"+
		"AB\u0005\u0011\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0003\f\u0006"+
		"\u0000DE\u0003\u0004\u0002\u0000Ea\u0001\u0000\u0000\u0000FG\u0003\u0010"+
		"\b\u0000GH\u0003\u0004\u0002\u0000Ha\u0001\u0000\u0000\u0000IJ\u0003\u000e"+
		"\u0007\u0000JK\u0003\u0004\u0002\u0000Ka\u0001\u0000\u0000\u0000LN\u0003"+
		"\u0012\t\u0000MO\u0003\u0014\n\u0000NM\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0003\u0004\u0002\u0000"+
		"Qa\u0001\u0000\u0000\u0000RS\u0003\u0016\u000b\u0000ST\u0003\u0004\u0002"+
		"\u0000Ta\u0001\u0000\u0000\u0000UV\u0003\u001a\r\u0000VW\u0003\u0004\u0002"+
		"\u0000Wa\u0001\u0000\u0000\u0000XY\u0003\n\u0005\u0000YZ\u0005\u000e\u0000"+
		"\u0000Z[\u0003\u0004\u0002\u0000[a\u0001\u0000\u0000\u0000\\]\u0003\b"+
		"\u0004\u0000]^\u0003\u0004\u0002\u0000^a\u0001\u0000\u0000\u0000_a\u0001"+
		"\u0000\u0000\u0000`C\u0001\u0000\u0000\u0000`F\u0001\u0000\u0000\u0000"+
		"`I\u0001\u0000\u0000\u0000`L\u0001\u0000\u0000\u0000`R\u0001\u0000\u0000"+
		"\u0000`U\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`\\\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0005\u0001\u0000\u0000\u0000"+
		"bc\u0005\u001b\u0000\u0000cd\u0005\u001f\u0000\u0000de\u0005\'\u0000\u0000"+
		"ep\u0005\u000f\u0000\u0000fg\u0005\u001f\u0000\u0000gm\u0005\'\u0000\u0000"+
		"hi\u0005\f\u0000\u0000ij\u0005\u001f\u0000\u0000jl\u0005\'\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000pf\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0010\u0000\u0000st\u0005\r\u0000\u0000tu\u0003"+
		"\u0004\u0002\u0000uv\u0005\u0011\u0000\u0000v\u008d\u0001\u0000\u0000"+
		"\u0000wx\u0005\u001b\u0000\u0000xy\u0005\u001e\u0000\u0000yz\u0005\'\u0000"+
		"\u0000z\u0085\u0005\u000f\u0000\u0000{|\u0005\u001f\u0000\u0000|\u0082"+
		"\u0005\'\u0000\u0000}~\u0005\f\u0000\u0000~\u007f\u0005\u001f\u0000\u0000"+
		"\u007f\u0081\u0005\'\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0010\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0003"+
		"\u0004\u0002\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008cb\u0001\u0000\u0000\u0000\u008cw\u0001\u0000\u0000"+
		"\u0000\u008d\u0007\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u001d\u0000"+
		"\u0000\u008f\u0091\u0003\u001c\u000e\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005\u000e\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\'\u0000\u0000\u0095\u009e\u0005\u000f\u0000\u0000\u0096"+
		"\u009b\u0003\u001c\u000e\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u009a"+
		"\u0003\u001c\u000e\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0010\u0000\u0000\u00a1\u000b\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0015\u0000\u0000\u00a3\u00a4\u0005\'\u0000\u0000\u00a4\u00a5\u0005"+
		"\u001a\u0000\u0000\u00a5\u00a6\u0005\"\u0000\u0000\u00a6\u00aa\u0005\u000f"+
		"\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8\u00a9\u0005\f\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0003\u001c\u000e\u0000\u00ad\u00ae\u0005\u0010\u0000"+
		"\u0000\u00ae\u00af\u0005\r\u0000\u0000\u00af\u00b0\u0003\u0004\u0002\u0000"+
		"\u00b0\u00b1\u0005\u0011\u0000\u0000\u00b1\r\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0019\u0000\u0000\u00b3\u00b4\u0003\u001c\u000e\u0000\u00b4"+
		"\u00b5\u0005\r\u0000\u0000\u00b5\u00b6\u0003\u0004\u0002\u0000\u00b6\u00b7"+
		"\u0005\u0011\u0000\u0000\u00b7\u000f\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0016\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u0011"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0017\u0000\u0000\u00bc\u00bd"+
		"\u0003\u001c\u000e\u0000\u00bd\u00be\u0005\r\u0000\u0000\u00be\u00bf\u0003"+
		"\u0004\u0002\u0000\u00bf\u00c0\u0005\u0011\u0000\u0000\u00c0\u0013\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\u0018\u0000\u0000\u00c2\u00c3\u0005"+
		"\r\u0000\u0000\u00c3\u00c4\u0003\u0004\u0002\u0000\u00c4\u00c5\u0005\u0011"+
		"\u0000\u0000\u00c5\u0015\u0001\u0000\u0000\u0000\u00c6\u00cf\u0005 \u0000"+
		"\u0000\u00c7\u00cc\u0003\u001c\u000e\u0000\u00c8\u00c9\u0005\f\u0000\u0000"+
		"\u00c9\u00cb\u0003\u001c\u000e\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00c7\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u000e\u0000\u0000\u00d2\u0017\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d7\u0005\'\u0000\u0000\u00d5"+
		"\u00d6\u0005\u0001\u0000\u0000\u00d6\u00d8\u0003\u001c\u000e\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00e1\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\f\u0000\u0000\u00da\u00dd"+
		"\u0005\'\u0000\u0000\u00db\u00dc\u0005\u0001\u0000\u0000\u00dc\u00de\u0003"+
		"\u001c\u000e\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00d9\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u000e\u0000\u0000\u00e5\u0019\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\'\u0000\u0000\u00e7\u00e8\u0005\u0001\u0000\u0000\u00e8\u00e9\u0003\u001c"+
		"\u000e\u0000\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00f1\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005\'\u0000\u0000\u00ec\u00ed\u0005\u0001\u0000"+
		"\u0000\u00ed\u00ee\u0003,\u0016\u0000\u00ee\u00ef\u0005\u000e\u0000\u0000"+
		"\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f1\u001b\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0006\u000e\uffff\uffff\u0000\u00f3\u00f4\u0003\u001e\u000f"+
		"\u0000\u00f4\u00fa\u0001\u0000\u0000\u0000\u00f5\u00f6\n\u0002\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0012\u0000\u0000\u00f7\u00f9\u0003\u001e\u000f\u0000"+
		"\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u001d\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0006\u000f\uffff\uffff\u0000\u00fe\u00ff\u0003 \u0010\u0000"+
		"\u00ff\u0105\u0001\u0000\u0000\u0000\u0100\u0101\n\u0002\u0000\u0000\u0101"+
		"\u0102\u0005\u0013\u0000\u0000\u0102\u0104\u0003 \u0010\u0000\u0103\u0100"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u001f"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0006\u0010\uffff\uffff\u0000\u0109\u010a\u0003\"\u0011\u0000\u010a\u0110"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\n\u0002\u0000\u0000\u010c\u010d\u0007"+
		"\u0000\u0000\u0000\u010d\u010f\u0003\"\u0011\u0000\u010e\u010b\u0001\u0000"+
		"\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111!\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0006\u0011\uffff"+
		"\uffff\u0000\u0114\u0115\u0003$\u0012\u0000\u0115\u011b\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\n\u0002\u0000\u0000\u0117\u0118\u0007\u0001\u0000\u0000"+
		"\u0118\u011a\u0003$\u0012\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u011a"+
		"\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c#\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0006\u0012\uffff\uffff\u0000\u011f"+
		"\u0120\u0003&\u0013\u0000\u0120\u0126\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\n\u0002\u0000\u0000\u0122\u0123\u0007\u0002\u0000\u0000\u0123\u0125\u0003"+
		"&\u0013\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127%\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0006\u0013\uffff\uffff\u0000\u012a\u012b\u0003(\u0014"+
		"\u0000\u012b\u0131\u0001\u0000\u0000\u0000\u012c\u012d\n\u0002\u0000\u0000"+
		"\u012d\u012e\u0007\u0003\u0000\u0000\u012e\u0130\u0003(\u0014\u0000\u012f"+
		"\u012c\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\'\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0007\u0004\u0000\u0000\u0135\u0138\u0003(\u0014\u0000\u0136\u0138\u0003"+
		"*\u0015\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000"+
		"\u0000\u0000\u0138)\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u000f\u0000"+
		"\u0000\u013a\u013b\u0003\u001c\u000e\u0000\u013b\u013c\u0005\u0010\u0000"+
		"\u0000\u013c\u0144\u0001\u0000\u0000\u0000\u013d\u0144\u0005\'\u0000\u0000"+
		"\u013e\u0144\u0005#\u0000\u0000\u013f\u0144\u0005$\u0000\u0000\u0140\u0144"+
		"\u0005%\u0000\u0000\u0141\u0144\u0005&\u0000\u0000\u0142\u0144\u0003\n"+
		"\u0005\u0000\u0143\u0139\u0001\u0000\u0000\u0000\u0143\u013d\u0001\u0000"+
		"\u0000\u0000\u0143\u013e\u0001\u0000\u0000\u0000\u0143\u013f\u0001\u0000"+
		"\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144+\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005!\u0000\u0000\u0146\u0147\u0005\u000f\u0000\u0000"+
		"\u0147\u0148\u0005\u0010\u0000\u0000\u0148-\u0001\u0000\u0000\u0000\u001b"+
		"17N`mp\u0082\u0085\u008c\u0090\u009b\u009e\u00aa\u00cc\u00cf\u00d7\u00dd"+
		"\u00e1\u00f0\u00fa\u0105\u0110\u011b\u0126\u0131\u0137\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}