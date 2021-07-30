package ProgrammingLanguage.Python;

// Generated from Python3.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
			T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
			T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24,
			T__24=25, T__25=26, T__26=27, STRING=28, NUMBER=29, INTEGER=30, DEF=31,
			RETURN=32, RAISE=33, FROM=34, IMPORT=35, AS=36, GLOBAL=37, NONLOCAL=38,
			ASSERT=39, IF=40, ELIF=41, ELSE=42, WHILE=43, FOR=44, IN=45, TRY=46, FINALLY=47,
			WITH=48, EXCEPT=49, LAMBDA=50, OR=51, AND=52, NOT=53, IS=54, NONE=55,
			TRUE=56, FALSE=57, CLASS=58, YIELD=59, DEL=60, PASS=61, CONTINUE=62, BREAK=63,
			ASYNC=64, AWAIT=65, NEWLINE=66, NAME=67, STRING_LITERAL=68, BYTES_LITERAL=69,
			DECIMAL_INTEGER=70, OCT_INTEGER=71, HEX_INTEGER=72, BIN_INTEGER=73, FLOAT_NUMBER=74,
			IMAG_NUMBER=75, WILDCARD=76, QUERY_ARROW=77, EMPTY=78, DOT=79, ELLIPSIS=80,
			STAR=81, OPEN_PAREN=82, CLOSE_PAREN=83, COMMA=84, COLON=85, SEMI_COLON=86,
			POWER=87, ASSIGN=88, OPEN_BRACK=89, CLOSE_BRACK=90, OR_OP=91, XOR=92,
			AND_OP=93, LEFT_SHIFT=94, RIGHT_SHIFT=95, ADD=96, MINUS=97, DIV=98, MOD=99,
			IDIV=100, NOT_OP=101, OPEN_BRACE=102, CLOSE_BRACE=103, LESS_THAN=104,
			GREATER_THAN=105, EQUALS=106, GT_EQ=107, LT_EQ=108, NOT_EQ_1=109, NOT_EQ_2=110,
			AT=111, ARROW=112, ADD_ASSIGN=113, SUB_ASSIGN=114, MULT_ASSIGN=115, AT_ASSIGN=116,
			DIV_ASSIGN=117, MOD_ASSIGN=118, AND_ASSIGN=119, OR_ASSIGN=120, XOR_ASSIGN=121,
			LEFT_SHIFT_ASSIGN=122, RIGHT_SHIFT_ASSIGN=123, POWER_ASSIGN=124, IDIV_ASSIGN=125,
			SKIP_=126, UNKNOWN_CHAR=127;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
				"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
				"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
				"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24",
				"T__25", "T__26", "STRING", "NUMBER", "INTEGER", "DEF", "RETURN", "RAISE",
				"FROM", "IMPORT", "AS", "GLOBAL", "NONLOCAL", "ASSERT", "IF", "ELIF",
				"ELSE", "WHILE", "FOR", "IN", "TRY", "FINALLY", "WITH", "EXCEPT", "LAMBDA",
				"OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", "CLASS", "YIELD",
				"DEL", "PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", "NEWLINE", "NAME",
				"STRING_LITERAL", "BYTES_LITERAL", "DECIMAL_INTEGER", "OCT_INTEGER",
				"HEX_INTEGER", "BIN_INTEGER", "FLOAT_NUMBER", "IMAG_NUMBER", "WILDCARD",
				"QUERY_ARROW", "EMPTY", "DOT", "ELLIPSIS", "STAR", "OPEN_PAREN", "CLOSE_PAREN",
				"COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK",
				"OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS",
				"DIV", "MOD", "IDIV", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN",
				"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT",
				"ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN",
				"MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN",
				"RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", "SKIP_", "UNKNOWN_CHAR",
				"SHORT_STRING", "LONG_STRING", "LONG_STRING_ITEM", "LONG_STRING_CHAR",
				"STRING_ESCAPE_SEQ", "NON_ZERO_DIGIT", "DIGIT", "OCT_DIGIT", "HEX_DIGIT",
				"BIN_DIGIT", "POINT_FLOAT", "EXPONENT_FLOAT", "INT_PART", "FRACTION",
				"EXPONENT", "SHORT_BYTES", "LONG_BYTES", "LONG_BYTES_ITEM", "SHORT_BYTES_CHAR_NO_SINGLE_QUOTE",
				"SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE", "LONG_BYTES_CHAR", "BYTES_ESCAPE_SEQ",
				"SPACES", "COMMENT", "LINE_JOINING", "ID_START", "ID_CONTINUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'OP'", "'OP<0>'", "'OP<1>'", "'OP<2>'", "'OP<3>'", "'ID'", "'ID<0>'",
				"'ID<1>'", "'ID<2>'", "'ID<3>'", "'BLK<'", "'BLK'", "'EXPR<0>'", "'EXPR<1>'",
				"'EXPR<2>'", "'EXPR<3>'", "'EXPR'", "'binOP'", "'binOP<0>'", "'binOP<1>'",
				"'binOP<2>'", "'binOP<3>'", "'LT<0>'", "'LT<1>'", "'LT<2>'", "'LT<3>'",
				"'LT'", null, null, null, "'def'", "'return'", "'raise'", "'from'", "'import'",
				"'as'", "'global'", "'nonlocal'", "'assert'", "'if'", "'elif'", "'else'",
				"'while'", "'for'", "'in'", "'try'", "'finally'", "'with'", "'except'",
				"'lambda'", "'or'", "'and'", "'not'", "'is'", "'None'", "'True'", "'False'",
				"'class'", "'yield'", "'del'", "'pass'", "'continue'", "'break'", "'async'",
				"'await'", null, null, null, null, null, null, null, null, null, null,
				"'<...>'", "'-->'", "'_'", "'.'", "'...'", "'*'", "'('", "')'", "','",
				"':'", "';'", "'**'", "'='", "'['", "']'", "'|'", "'^'", "'&'", "'<<'",
				"'>>'", "'+'", "'-'", "'/'", "'%'", "'//'", "'~'", "'{'", "'}'", "'<'",
				"'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'@'", "'->'", "'+='",
				"'-='", "'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='",
				"'>>='", "'**='", "'//='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, "STRING", "NUMBER", "INTEGER", "DEF", "RETURN",
				"RAISE", "FROM", "IMPORT", "AS", "GLOBAL", "NONLOCAL", "ASSERT", "IF",
				"ELIF", "ELSE", "WHILE", "FOR", "IN", "TRY", "FINALLY", "WITH", "EXCEPT",
				"LAMBDA", "OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", "CLASS",
				"YIELD", "DEL", "PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", "NEWLINE",
				"NAME", "STRING_LITERAL", "BYTES_LITERAL", "DECIMAL_INTEGER", "OCT_INTEGER",
				"HEX_INTEGER", "BIN_INTEGER", "FLOAT_NUMBER", "IMAG_NUMBER", "WILDCARD",
				"QUERY_ARROW", "EMPTY", "DOT", "ELLIPSIS", "STAR", "OPEN_PAREN", "CLOSE_PAREN",
				"COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK",
				"OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS",
				"DIV", "MOD", "IDIV", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN",
				"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT",
				"ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN",
				"MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN",
				"RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", "SKIP_", "UNKNOWN_CHAR"
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


	// A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	// The stack that keeps track of the indentation level.
	private java.util.Stack<Integer> indents = new java.util.Stack<>();
	// The amount of opened braces, brackets and parenthesis.
	private int opened = 0;
	// The most recently produced token.
	private Token lastToken = null;
	@Override
	public void emit(Token t) {
		super.setToken(t);
		tokens.offer(t);
	}

	@Override
	public Token nextToken() {
		// Check if the end-of-file is ahead and there are still some DEDENTS expected.
		if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
			// Remove any trailing EOF tokens from our buffer.
			for (int i = tokens.size() - 1; i >= 0; i--) {
				if (tokens.get(i).getType() == EOF) {
					tokens.remove(i);
				}
			}

			// First emit an extra line break that serves as the end of the statement.
			this.emit(commonToken(Python3Parser.NEWLINE, "\n"));

			// Now emit as much DEDENT tokens as needed.
			while (!indents.isEmpty()) {
				this.emit(createDedent());
				indents.pop();
			}

			// Put the EOF back on the token stream.
			this.emit(commonToken(Python3Parser.EOF, "<EOF>"));
		}

		Token next = super.nextToken();

		if (next.getChannel() == Token.DEFAULT_CHANNEL) {
			// Keep track of the last token on the default channel.
			this.lastToken = next;
		}

		return tokens.isEmpty() ? next : tokens.poll();
	}

	private Token createDedent() {
		CommonToken dedent = commonToken(Python3Parser.DEDENT, "");
		dedent.setLine(this.lastToken.getLine());
		return dedent;
	}

	private CommonToken commonToken(int type, String text) {
		int stop = this.getCharIndex() - 1;
		int start = text.isEmpty() ? stop : stop - text.length() + 1;
		return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	}

	// Calculates the indentation of the provided spaces, taking the
	// following rules into account:
	//
	// "Tabs are replaced (from left to right) by one to eight spaces
	//  such that the total number of characters up to and including
	//  the replacement is a multiple of eight [...]"
	//
	//  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	static int getIndentationCount(String spaces) {
		int count = 0;
		for (char ch : spaces.toCharArray()) {
			switch (ch) {
				case '\t':
					count += 8 - (count % 8);
					break;
				default:
					// A normal space char.
					count++;
			}
		}

		return count;
	}

	boolean atStartOfInput() {
		return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	}


	public Python3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python3.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
			case 65:
				NEWLINE_action((RuleContext)_localctx, actionIndex);
				break;
			case 81:
				OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
				break;
			case 82:
				CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
				break;
			case 88:
				OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
				break;
			case 89:
				CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
				break;
			case 101:
				OPEN_BRACE_action((RuleContext)_localctx, actionIndex);
				break;
			case 102:
				CLOSE_BRACE_action((RuleContext)_localctx, actionIndex);
				break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 0:

				String newLine = getText().replaceAll("[^\r\n\f]+", "");
				String spaces = getText().replaceAll("[\r\n\f]+", "");
				int next = _input.LA(1);
				if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == '#') {
					// If we're inside a list or on a blank line, ignore all indents,
					// dedents and line breaks.
					skip();
				}
				else {
					emit(commonToken(NEWLINE, newLine));
					int indent = getIndentationCount(spaces);
					int previous = indents.isEmpty() ? 0 : indents.peek();
					if (indent == previous) {
						// skip indents of the same size as the present indent-size
						skip();
					}
					else if (indent > previous) {
						indents.push(indent);
						emit(commonToken(Python3Parser.INDENT, spaces));
					}
					else {
						// Possibly emit more than 1 DEDENT token.
						while(!indents.isEmpty() && indents.peek() > indent) {
							this.emit(createDedent());
							indents.pop();
						}
					}
				}

				break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 1:
				opened++;
				break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 2:
				opened--;
				break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 3:
				opened++;
				break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 4:
				opened--;
				break;
		}
	}
	private void OPEN_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 5:
				opened++;
				break;
		}
	}
	private void CLOSE_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 6:
				opened--;
				break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 65:
				return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0081\u0465\b\1\4"+
					"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
					"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
					"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
					"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
					" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
					"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
					"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
					"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
					"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
					"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
					"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
					"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
					"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
					"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
					"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
					"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
					"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
					"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
					"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
					"\t\u009b\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
					"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
					"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
					"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
					"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
					"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
					"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
					"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
					"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
					"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
					"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u01e3\n\35\3\36\3\36\3\36\5\36"+
					"\u01e8\n\36\3\37\3\37\3\37\3\37\5\37\u01ee\n\37\3 \3 \3 \3 \3!\3!\3!\3"+
					"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
					"$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
					"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
					",\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
					"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
					"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
					"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3"+
					":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3"+
					">\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3"+
					"A\3B\3B\3B\3B\3B\3B\3C\3C\3C\5C\u02b1\nC\3C\3C\5C\u02b5\nC\3C\5C\u02b8"+
					"\nC\5C\u02ba\nC\3C\3C\3D\3D\7D\u02c0\nD\fD\16D\u02c3\13D\3E\3E\3E\3E\3"+
					"E\5E\u02ca\nE\3E\3E\5E\u02ce\nE\3F\3F\3F\3F\3F\5F\u02d5\nF\3F\3F\5F\u02d9"+
					"\nF\3G\3G\7G\u02dd\nG\fG\16G\u02e0\13G\3G\6G\u02e3\nG\rG\16G\u02e4\5G"+
					"\u02e7\nG\3H\3H\3H\6H\u02ec\nH\rH\16H\u02ed\3I\3I\3I\6I\u02f3\nI\rI\16"+
					"I\u02f4\3J\3J\3J\6J\u02fa\nJ\rJ\16J\u02fb\3K\3K\5K\u0300\nK\3L\3L\5L\u0304"+
					"\nL\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\3R"+
					"\3S\3S\3S\3T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3[\3[\3["+
					"\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3`\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3"+
					"e\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m\3m\3n\3"+
					"n\3n\3o\3o\3o\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3"+
					"v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3{\3|\3|\3|\3|\3}\3"+
					"}\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\5\177\u0398\n\177\3\177\3\177\3"+
					"\u0080\3\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u03a1\n\u0081\f\u0081\16"+
					"\u0081\u03a4\13\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u03aa\n"+
					"\u0081\f\u0081\16\u0081\u03ad\13\u0081\3\u0081\5\u0081\u03b0\n\u0081\3"+
					"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u03b7\n\u0082\f\u0082\16"+
					"\u0082\u03ba\13\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
					"\3\u0082\3\u0082\7\u0082\u03c4\n\u0082\f\u0082\16\u0082\u03c7\13\u0082"+
					"\3\u0082\3\u0082\3\u0082\5\u0082\u03cc\n\u0082\3\u0083\3\u0083\5\u0083"+
					"\u03d0\n\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
					"\u03d8\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
					"\3\u0089\3\u008a\3\u008a\3\u008b\5\u008b\u03e5\n\u008b\3\u008b\3\u008b"+
					"\3\u008b\3\u008b\5\u008b\u03eb\n\u008b\3\u008c\3\u008c\5\u008c\u03ef\n"+
					"\u008c\3\u008c\3\u008c\3\u008d\6\u008d\u03f4\n\u008d\r\u008d\16\u008d"+
					"\u03f5\3\u008e\3\u008e\6\u008e\u03fa\n\u008e\r\u008e\16\u008e\u03fb\3"+
					"\u008f\3\u008f\5\u008f\u0400\n\u008f\3\u008f\6\u008f\u0403\n\u008f\r\u008f"+
					"\16\u008f\u0404\3\u0090\3\u0090\3\u0090\7\u0090\u040a\n\u0090\f\u0090"+
					"\16\u0090\u040d\13\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0413"+
					"\n\u0090\f\u0090\16\u0090\u0416\13\u0090\3\u0090\5\u0090\u0419\n\u0090"+
					"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0420\n\u0091\f\u0091"+
					"\16\u0091\u0423\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
					"\3\u0091\3\u0091\7\u0091\u042d\n\u0091\f\u0091\16\u0091\u0430\13\u0091"+
					"\3\u0091\3\u0091\3\u0091\5\u0091\u0435\n\u0091\3\u0092\3\u0092\5\u0092"+
					"\u0439\n\u0092\3\u0093\5\u0093\u043c\n\u0093\3\u0094\5\u0094\u043f\n\u0094"+
					"\3\u0095\5\u0095\u0442\n\u0095\3\u0096\3\u0096\3\u0096\3\u0097\6\u0097"+
					"\u0448\n\u0097\r\u0097\16\u0097\u0449\3\u0098\3\u0098\7\u0098\u044e\n"+
					"\u0098\f\u0098\16\u0098\u0451\13\u0098\3\u0099\3\u0099\5\u0099\u0455\n"+
					"\u0099\3\u0099\5\u0099\u0458\n\u0099\3\u0099\3\u0099\5\u0099\u045c\n\u0099"+
					"\3\u009a\3\u009a\5\u009a\u0460\n\u009a\3\u009b\3\u009b\5\u009b\u0464\n"+
					"\u009b\6\u03b8\u03c5\u0421\u042e\2\u009c\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
					"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
					"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
					"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
					"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
					"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
					"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bf"+
					"a\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3"+
					"k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7"+
					"u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb"+
					"\177\u00fd\u0080\u00ff\u0081\u0101\2\u0103\2\u0105\2\u0107\2\u0109\2\u010b"+
					"\2\u010d\2\u010f\2\u0111\2\u0113\2\u0115\2\u0117\2\u0119\2\u011b\2\u011d"+
					"\2\u011f\2\u0121\2\u0123\2\u0125\2\u0127\2\u0129\2\u012b\2\u012d\2\u012f"+
					"\2\u0131\2\u0133\2\u0135\2\3\2\33\b\2HHTTWWhhttww\4\2HHhh\4\2TTtt\4\2"+
					"DDdd\4\2QQqq\4\2ZZzz\4\2LLll\6\2\f\f\16\17))^^\6\2\f\f\16\17$$^^\3\2^"+
					"^\3\2\63;\3\2\62;\3\2\629\5\2\62;CHch\3\2\62\63\4\2GGgg\4\2--//\7\2\2"+
					"\13\r\16\20(*]_\u0081\7\2\2\13\r\16\20#%]_\u0081\4\2\2]_\u0081\3\2\2\u0081"+
					"\4\2\13\13\"\"\4\2\f\f\16\17\u0128\2C\\c|\u00ac\u00ac\u00b7\u00b7\u00bc"+
					"\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0243\u0252\u02c3\u02c8\u02d3\u02e2"+
					"\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390"+
					"\u03a3\u03a5\u03d0\u03d2\u03f7\u03f9\u0483\u048c\u04d0\u04d2\u04fb\u0502"+
					"\u0511\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623"+
					"\u063c\u0642\u064c\u0670\u0671\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0"+
					"\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712\u0714\u0731\u074f\u076f\u0782"+
					"\u07a7\u07b3\u07b3\u0906\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u097f"+
					"\u097f\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8"+
					"\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07"+
					"\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a"+
					"\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95"+
					"\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2"+
					"\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37"+
					"\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87"+
					"\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5"+
					"\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c"+
					"\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac"+
					"\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10"+
					"\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5"+
					"\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83"+
					"\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b"+
					"\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4"+
					"\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42"+
					"\u0f49\u0f4b\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c\u1052"+
					"\u1057\u10a2\u10c7\u10d2\u10fc\u10fe\u10fe\u1102\u115b\u1161\u11a4\u11aa"+
					"\u11fb\u1202\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262"+
					"\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4"+
					"\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2"+
					"\u13f6\u1403\u166e\u1671\u1678\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702"+
					"\u170e\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782"+
					"\u17b5\u17d9\u17d9\u17de\u17de\u1822\u1879\u1882\u18aa\u1902\u191e\u1952"+
					"\u196f\u1972\u1976\u1982\u19ab\u19c3\u19c9\u1a02\u1a18\u1d02\u1dc1\u1e02"+
					"\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52"+
					"\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8"+
					"\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2"+
					"\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2073\u2073\u2081\u2081\u2092\u2096\u2104"+
					"\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211a\u211f\u2126\u2126\u2128"+
					"\u2128\u212a\u212a\u212c\u2133\u2135\u213b\u213e\u2141\u2147\u214b\u2162"+
					"\u2185\u2c02\u2c30\u2c32\u2c60\u2c82\u2ce6\u2d02\u2d27\u2d32\u2d67\u2d71"+
					"\u2d71\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2"+
					"\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u3007\u3009\u3023\u302b\u3033"+
					"\u3037\u303a\u303e\u3043\u3098\u309d\u30a1\u30a3\u30fc\u30fe\u3101\u3107"+
					"\u312e\u3133\u3190\u31a2\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fbd\ua002"+
					"\ua48e\ua802\ua803\ua805\ua807\ua809\ua80c\ua80e\ua824\uac02\ud7a5\uf902"+
					"\ufa2f\ufa32\ufa6c\ufa72\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21"+
					"\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48"+
					"\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76\ufe78"+
					"\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4"+
					"\uffd9\uffdc\uffde\u0096\2\62;\u0302\u0371\u0485\u0488\u0593\u05bb\u05bd"+
					"\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c7\u05c9\u05c9\u0612\u0617\u064d"+
					"\u0660\u0662\u066b\u0672\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec"+
					"\u06ef\u06f2\u06fb\u0713\u0713\u0732\u074c\u07a8\u07b2\u0903\u0905\u093e"+
					"\u093e\u0940\u094f\u0953\u0956\u0964\u0965\u0968\u0971\u0983\u0985\u09be"+
					"\u09be\u09c0\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8"+
					"\u09f1\u0a03\u0a05\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a68"+
					"\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4"+
					"\u0ae5\u0ae8\u0af1\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d"+
					"\u0b4f\u0b58\u0b59\u0b68\u0b71\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca\u0bcc"+
					"\u0bcf\u0bd9\u0bd9\u0be8\u0bf1\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c"+
					"\u0c4f\u0c57\u0c58\u0c68\u0c71\u0c84\u0c85\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8"+
					"\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce8\u0cf1\u0d04\u0d05\u0d40\u0d45\u0d48"+
					"\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1"+
					"\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49"+
					"\u0e50\u0e52\u0e5b\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2"+
					"\u0edb\u0f1a\u0f1b\u0f22\u0f2b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40"+
					"\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102e"+
					"\u1034\u1038\u103b\u1042\u104b\u1058\u105b\u1361\u1361\u136b\u1373\u1714"+
					"\u1716\u1734\u1736\u1754\u1755\u1774\u1775\u17b8\u17d5\u17df\u17df\u17e2"+
					"\u17eb\u180d\u180f\u1812\u181b\u18ab\u18ab\u1922\u192d\u1932\u193d\u1948"+
					"\u1951\u19b2\u19c2\u19ca\u19cb\u19d2\u19db\u1a19\u1a1d\u1dc2\u1dc5\u2041"+
					"\u2042\u2056\u2056\u20d2\u20de\u20e3\u20e3\u20e7\u20ed\u302c\u3031\u309b"+
					"\u309c\ua804\ua804\ua808\ua808\ua80d\ua80d\ua825\ua829\ufb20\ufb20\ufe02"+
					"\ufe11\ufe22\ufe25\ufe35\ufe36\ufe4f\ufe51\uff12\uff1b\uff41\uff41\2\u0486"+
					"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
					"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
					"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
					"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
					"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
					"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
					"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
					"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
					"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
					"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
					"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
					"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
					"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
					"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
					"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
					"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
					"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
					"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
					"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
					"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
					"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
					"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2"+
					"\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1"+
					"\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2"+
					"\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\3\u0137\3\2\2\2\5\u013a"+
					"\3\2\2\2\7\u0140\3\2\2\2\t\u0146\3\2\2\2\13\u014c\3\2\2\2\r\u0152\3\2"+
					"\2\2\17\u0155\3\2\2\2\21\u015b\3\2\2\2\23\u0161\3\2\2\2\25\u0167\3\2\2"+
					"\2\27\u016d\3\2\2\2\31\u0172\3\2\2\2\33\u0176\3\2\2\2\35\u017e\3\2\2\2"+
					"\37\u0186\3\2\2\2!\u018e\3\2\2\2#\u0196\3\2\2\2%\u019b\3\2\2\2\'\u01a1"+
					"\3\2\2\2)\u01aa\3\2\2\2+\u01b3\3\2\2\2-\u01bc\3\2\2\2/\u01c5\3\2\2\2\61"+
					"\u01cb\3\2\2\2\63\u01d1\3\2\2\2\65\u01d7\3\2\2\2\67\u01dd\3\2\2\29\u01e2"+
					"\3\2\2\2;\u01e7\3\2\2\2=\u01ed\3\2\2\2?\u01ef\3\2\2\2A\u01f3\3\2\2\2C"+
					"\u01fa\3\2\2\2E\u0200\3\2\2\2G\u0205\3\2\2\2I\u020c\3\2\2\2K\u020f\3\2"+
					"\2\2M\u0216\3\2\2\2O\u021f\3\2\2\2Q\u0226\3\2\2\2S\u0229\3\2\2\2U\u022e"+
					"\3\2\2\2W\u0233\3\2\2\2Y\u0239\3\2\2\2[\u023d\3\2\2\2]\u0240\3\2\2\2_"+
					"\u0244\3\2\2\2a\u024c\3\2\2\2c\u0251\3\2\2\2e\u0258\3\2\2\2g\u025f\3\2"+
					"\2\2i\u0262\3\2\2\2k\u0266\3\2\2\2m\u026a\3\2\2\2o\u026d\3\2\2\2q\u0272"+
					"\3\2\2\2s\u0277\3\2\2\2u\u027d\3\2\2\2w\u0283\3\2\2\2y\u0289\3\2\2\2{"+
					"\u028d\3\2\2\2}\u0292\3\2\2\2\177\u029b\3\2\2\2\u0081\u02a1\3\2\2\2\u0083"+
					"\u02a7\3\2\2\2\u0085\u02b9\3\2\2\2\u0087\u02bd\3\2\2\2\u0089\u02c9\3\2"+
					"\2\2\u008b\u02d4\3\2\2\2\u008d\u02e6\3\2\2\2\u008f\u02e8\3\2\2\2\u0091"+
					"\u02ef\3\2\2\2\u0093\u02f6\3\2\2\2\u0095\u02ff\3\2\2\2\u0097\u0303\3\2"+
					"\2\2\u0099\u0307\3\2\2\2\u009b\u030d\3\2\2\2\u009d\u0311\3\2\2\2\u009f"+
					"\u0313\3\2\2\2\u00a1\u0315\3\2\2\2\u00a3\u0319\3\2\2\2\u00a5\u031b\3\2"+
					"\2\2\u00a7\u031e\3\2\2\2\u00a9\u0321\3\2\2\2\u00ab\u0323\3\2\2\2\u00ad"+
					"\u0325\3\2\2\2\u00af\u0327\3\2\2\2\u00b1\u032a\3\2\2\2\u00b3\u032c\3\2"+
					"\2\2\u00b5\u032f\3\2\2\2\u00b7\u0332\3\2\2\2\u00b9\u0334\3\2\2\2\u00bb"+
					"\u0336\3\2\2\2\u00bd\u0338\3\2\2\2\u00bf\u033b\3\2\2\2\u00c1\u033e\3\2"+
					"\2\2\u00c3\u0340\3\2\2\2\u00c5\u0342\3\2\2\2\u00c7\u0344\3\2\2\2\u00c9"+
					"\u0346\3\2\2\2\u00cb\u0349\3\2\2\2\u00cd\u034b\3\2\2\2\u00cf\u034e\3\2"+
					"\2\2\u00d1\u0351\3\2\2\2\u00d3\u0353\3\2\2\2\u00d5\u0355\3\2\2\2\u00d7"+
					"\u0358\3\2\2\2\u00d9\u035b\3\2\2\2\u00db\u035e\3\2\2\2\u00dd\u0361\3\2"+
					"\2\2\u00df\u0364\3\2\2\2\u00e1\u0366\3\2\2\2\u00e3\u0369\3\2\2\2\u00e5"+
					"\u036c\3\2\2\2\u00e7\u036f\3\2\2\2\u00e9\u0372\3\2\2\2\u00eb\u0375\3\2"+
					"\2\2\u00ed\u0378\3\2\2\2\u00ef\u037b\3\2\2\2\u00f1\u037e\3\2\2\2\u00f3"+
					"\u0381\3\2\2\2\u00f5\u0384\3\2\2\2\u00f7\u0388\3\2\2\2\u00f9\u038c\3\2"+
					"\2\2\u00fb\u0390\3\2\2\2\u00fd\u0397\3\2\2\2\u00ff\u039b\3\2\2\2\u0101"+
					"\u03af\3\2\2\2\u0103\u03cb\3\2\2\2\u0105\u03cf\3\2\2\2\u0107\u03d1\3\2"+
					"\2\2\u0109\u03d7\3\2\2\2\u010b\u03d9\3\2\2\2\u010d\u03db\3\2\2\2\u010f"+
					"\u03dd\3\2\2\2\u0111\u03df\3\2\2\2\u0113\u03e1\3\2\2\2\u0115\u03ea\3\2"+
					"\2\2\u0117\u03ee\3\2\2\2\u0119\u03f3\3\2\2\2\u011b\u03f7\3\2\2\2\u011d"+
					"\u03fd\3\2\2\2\u011f\u0418\3\2\2\2\u0121\u0434\3\2\2\2\u0123\u0438\3\2"+
					"\2\2\u0125\u043b\3\2\2\2\u0127\u043e\3\2\2\2\u0129\u0441\3\2\2\2\u012b"+
					"\u0443\3\2\2\2\u012d\u0447\3\2\2\2\u012f\u044b\3\2\2\2\u0131\u0452\3\2"+
					"\2\2\u0133\u045f\3\2\2\2\u0135\u0463\3\2\2\2\u0137\u0138\7Q\2\2\u0138"+
					"\u0139\7R\2\2\u0139\4\3\2\2\2\u013a\u013b\7Q\2\2\u013b\u013c\7R\2\2\u013c"+
					"\u013d\7>\2\2\u013d\u013e\7\62\2\2\u013e\u013f\7@\2\2\u013f\6\3\2\2\2"+
					"\u0140\u0141\7Q\2\2\u0141\u0142\7R\2\2\u0142\u0143\7>\2\2\u0143\u0144"+
					"\7\63\2\2\u0144\u0145\7@\2\2\u0145\b\3\2\2\2\u0146\u0147\7Q\2\2\u0147"+
					"\u0148\7R\2\2\u0148\u0149\7>\2\2\u0149\u014a\7\64\2\2\u014a\u014b\7@\2"+
					"\2\u014b\n\3\2\2\2\u014c\u014d\7Q\2\2\u014d\u014e\7R\2\2\u014e\u014f\7"+
					">\2\2\u014f\u0150\7\65\2\2\u0150\u0151\7@\2\2\u0151\f\3\2\2\2\u0152\u0153"+
					"\7K\2\2\u0153\u0154\7F\2\2\u0154\16\3\2\2\2\u0155\u0156\7K\2\2\u0156\u0157"+
					"\7F\2\2\u0157\u0158\7>\2\2\u0158\u0159\7\62\2\2\u0159\u015a\7@\2\2\u015a"+
					"\20\3\2\2\2\u015b\u015c\7K\2\2\u015c\u015d\7F\2\2\u015d\u015e\7>\2\2\u015e"+
					"\u015f\7\63\2\2\u015f\u0160\7@\2\2\u0160\22\3\2\2\2\u0161\u0162\7K\2\2"+
					"\u0162\u0163\7F\2\2\u0163\u0164\7>\2\2\u0164\u0165\7\64\2\2\u0165\u0166"+
					"\7@\2\2\u0166\24\3\2\2\2\u0167\u0168\7K\2\2\u0168\u0169\7F\2\2\u0169\u016a"+
					"\7>\2\2\u016a\u016b\7\65\2\2\u016b\u016c\7@\2\2\u016c\26\3\2\2\2\u016d"+
					"\u016e\7D\2\2\u016e\u016f\7N\2\2\u016f\u0170\7M\2\2\u0170\u0171\7>\2\2"+
					"\u0171\30\3\2\2\2\u0172\u0173\7D\2\2\u0173\u0174\7N\2\2\u0174\u0175\7"+
					"M\2\2\u0175\32\3\2\2\2\u0176\u0177\7G\2\2\u0177\u0178\7Z\2\2\u0178\u0179"+
					"\7R\2\2\u0179\u017a\7T\2\2\u017a\u017b\7>\2\2\u017b\u017c\7\62\2\2\u017c"+
					"\u017d\7@\2\2\u017d\34\3\2\2\2\u017e\u017f\7G\2\2\u017f\u0180\7Z\2\2\u0180"+
					"\u0181\7R\2\2\u0181\u0182\7T\2\2\u0182\u0183\7>\2\2\u0183\u0184\7\63\2"+
					"\2\u0184\u0185\7@\2\2\u0185\36\3\2\2\2\u0186\u0187\7G\2\2\u0187\u0188"+
					"\7Z\2\2\u0188\u0189\7R\2\2\u0189\u018a\7T\2\2\u018a\u018b\7>\2\2\u018b"+
					"\u018c\7\64\2\2\u018c\u018d\7@\2\2\u018d \3\2\2\2\u018e\u018f\7G\2\2\u018f"+
					"\u0190\7Z\2\2\u0190\u0191\7R\2\2\u0191\u0192\7T\2\2\u0192\u0193\7>\2\2"+
					"\u0193\u0194\7\65\2\2\u0194\u0195\7@\2\2\u0195\"\3\2\2\2\u0196\u0197\7"+
					"G\2\2\u0197\u0198\7Z\2\2\u0198\u0199\7R\2\2\u0199\u019a\7T\2\2\u019a$"+
					"\3\2\2\2\u019b\u019c\7d\2\2\u019c\u019d\7k\2\2\u019d\u019e\7p\2\2\u019e"+
					"\u019f\7Q\2\2\u019f\u01a0\7R\2\2\u01a0&\3\2\2\2\u01a1\u01a2\7d\2\2\u01a2"+
					"\u01a3\7k\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7Q\2\2\u01a5\u01a6\7R\2\2"+
					"\u01a6\u01a7\7>\2\2\u01a7\u01a8\7\62\2\2\u01a8\u01a9\7@\2\2\u01a9(\3\2"+
					"\2\2\u01aa\u01ab\7d\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae"+
					"\7Q\2\2\u01ae\u01af\7R\2\2\u01af\u01b0\7>\2\2\u01b0\u01b1\7\63\2\2\u01b1"+
					"\u01b2\7@\2\2\u01b2*\3\2\2\2\u01b3\u01b4\7d\2\2\u01b4\u01b5\7k\2\2\u01b5"+
					"\u01b6\7p\2\2\u01b6\u01b7\7Q\2\2\u01b7\u01b8\7R\2\2\u01b8\u01b9\7>\2\2"+
					"\u01b9\u01ba\7\64\2\2\u01ba\u01bb\7@\2\2\u01bb,\3\2\2\2\u01bc\u01bd\7"+
					"d\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7Q\2\2\u01c0\u01c1"+
					"\7R\2\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7\65\2\2\u01c3\u01c4\7@\2\2\u01c4"+
					".\3\2\2\2\u01c5\u01c6\7N\2\2\u01c6\u01c7\7V\2\2\u01c7\u01c8\7>\2\2\u01c8"+
					"\u01c9\7\62\2\2\u01c9\u01ca\7@\2\2\u01ca\60\3\2\2\2\u01cb\u01cc\7N\2\2"+
					"\u01cc\u01cd\7V\2\2\u01cd\u01ce\7>\2\2\u01ce\u01cf\7\63\2\2\u01cf\u01d0"+
					"\7@\2\2\u01d0\62\3\2\2\2\u01d1\u01d2\7N\2\2\u01d2\u01d3\7V\2\2\u01d3\u01d4"+
					"\7>\2\2\u01d4\u01d5\7\64\2\2\u01d5\u01d6\7@\2\2\u01d6\64\3\2\2\2\u01d7"+
					"\u01d8\7N\2\2\u01d8\u01d9\7V\2\2\u01d9\u01da\7>\2\2\u01da\u01db\7\65\2"+
					"\2\u01db\u01dc\7@\2\2\u01dc\66\3\2\2\2\u01dd\u01de\7N\2\2\u01de\u01df"+
					"\7V\2\2\u01df8\3\2\2\2\u01e0\u01e3\5\u0089E\2\u01e1\u01e3\5\u008bF\2\u01e2"+
					"\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3:\3\2\2\2\u01e4\u01e8\5=\37\2"+
					"\u01e5\u01e8\5\u0095K\2\u01e6\u01e8\5\u0097L\2\u01e7\u01e4\3\2\2\2\u01e7"+
					"\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8<\3\2\2\2\u01e9\u01ee\5\u008d"+
					"G\2\u01ea\u01ee\5\u008fH\2\u01eb\u01ee\5\u0091I\2\u01ec\u01ee\5\u0093"+
					"J\2\u01ed\u01e9\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
					"\u01ec\3\2\2\2\u01ee>\3\2\2\2\u01ef\u01f0\7f\2\2\u01f0\u01f1\7g\2\2\u01f1"+
					"\u01f2\7h\2\2\u01f2@\3\2\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7g\2\2\u01f5"+
					"\u01f6\7v\2\2\u01f6\u01f7\7w\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7p\2\2"+
					"\u01f9B\3\2\2\2\u01fa\u01fb\7t\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd\7k\2"+
					"\2\u01fd\u01fe\7u\2\2\u01fe\u01ff\7g\2\2\u01ffD\3\2\2\2\u0200\u0201\7"+
					"h\2\2\u0201\u0202\7t\2\2\u0202\u0203\7q\2\2\u0203\u0204\7o\2\2\u0204F"+
					"\3\2\2\2\u0205\u0206\7k\2\2\u0206\u0207\7o\2\2\u0207\u0208\7r\2\2\u0208"+
					"\u0209\7q\2\2\u0209\u020a\7t\2\2\u020a\u020b\7v\2\2\u020bH\3\2\2\2\u020c"+
					"\u020d\7c\2\2\u020d\u020e\7u\2\2\u020eJ\3\2\2\2\u020f\u0210\7i\2\2\u0210"+
					"\u0211\7n\2\2\u0211\u0212\7q\2\2\u0212\u0213\7d\2\2\u0213\u0214\7c\2\2"+
					"\u0214\u0215\7n\2\2\u0215L\3\2\2\2\u0216\u0217\7p\2\2\u0217\u0218\7q\2"+
					"\2\u0218\u0219\7p\2\2\u0219\u021a\7n\2\2\u021a\u021b\7q\2\2\u021b\u021c"+
					"\7e\2\2\u021c\u021d\7c\2\2\u021d\u021e\7n\2\2\u021eN\3\2\2\2\u021f\u0220"+
					"\7c\2\2\u0220\u0221\7u\2\2\u0221\u0222\7u\2\2\u0222\u0223\7g\2\2\u0223"+
					"\u0224\7t\2\2\u0224\u0225\7v\2\2\u0225P\3\2\2\2\u0226\u0227\7k\2\2\u0227"+
					"\u0228\7h\2\2\u0228R\3\2\2\2\u0229\u022a\7g\2\2\u022a\u022b\7n\2\2\u022b"+
					"\u022c\7k\2\2\u022c\u022d\7h\2\2\u022dT\3\2\2\2\u022e\u022f\7g\2\2\u022f"+
					"\u0230\7n\2\2\u0230\u0231\7u\2\2\u0231\u0232\7g\2\2\u0232V\3\2\2\2\u0233"+
					"\u0234\7y\2\2\u0234\u0235\7j\2\2\u0235\u0236\7k\2\2\u0236\u0237\7n\2\2"+
					"\u0237\u0238\7g\2\2\u0238X\3\2\2\2\u0239\u023a\7h\2\2\u023a\u023b\7q\2"+
					"\2\u023b\u023c\7t\2\2\u023cZ\3\2\2\2\u023d\u023e\7k\2\2\u023e\u023f\7"+
					"p\2\2\u023f\\\3\2\2\2\u0240\u0241\7v\2\2\u0241\u0242\7t\2\2\u0242\u0243"+
					"\7{\2\2\u0243^\3\2\2\2\u0244\u0245\7h\2\2\u0245\u0246\7k\2\2\u0246\u0247"+
					"\7p\2\2\u0247\u0248\7c\2\2\u0248\u0249\7n\2\2\u0249\u024a\7n\2\2\u024a"+
					"\u024b\7{\2\2\u024b`\3\2\2\2\u024c\u024d\7y\2\2\u024d\u024e\7k\2\2\u024e"+
					"\u024f\7v\2\2\u024f\u0250\7j\2\2\u0250b\3\2\2\2\u0251\u0252\7g\2\2\u0252"+
					"\u0253\7z\2\2\u0253\u0254\7e\2\2\u0254\u0255\7g\2\2\u0255\u0256\7r\2\2"+
					"\u0256\u0257\7v\2\2\u0257d\3\2\2\2\u0258\u0259\7n\2\2\u0259\u025a\7c\2"+
					"\2\u025a\u025b\7o\2\2\u025b\u025c\7d\2\2\u025c\u025d\7f\2\2\u025d\u025e"+
					"\7c\2\2\u025ef\3\2\2\2\u025f\u0260\7q\2\2\u0260\u0261\7t\2\2\u0261h\3"+
					"\2\2\2\u0262\u0263\7c\2\2\u0263\u0264\7p\2\2\u0264\u0265\7f\2\2\u0265"+
					"j\3\2\2\2\u0266\u0267\7p\2\2\u0267\u0268\7q\2\2\u0268\u0269\7v\2\2\u0269"+
					"l\3\2\2\2\u026a\u026b\7k\2\2\u026b\u026c\7u\2\2\u026cn\3\2\2\2\u026d\u026e"+
					"\7P\2\2\u026e\u026f\7q\2\2\u026f\u0270\7p\2\2\u0270\u0271\7g\2\2\u0271"+
					"p\3\2\2\2\u0272\u0273\7V\2\2\u0273\u0274\7t\2\2\u0274\u0275\7w\2\2\u0275"+
					"\u0276\7g\2\2\u0276r\3\2\2\2\u0277\u0278\7H\2\2\u0278\u0279\7c\2\2\u0279"+
					"\u027a\7n\2\2\u027a\u027b\7u\2\2\u027b\u027c\7g\2\2\u027ct\3\2\2\2\u027d"+
					"\u027e\7e\2\2\u027e\u027f\7n\2\2\u027f\u0280\7c\2\2\u0280\u0281\7u\2\2"+
					"\u0281\u0282\7u\2\2\u0282v\3\2\2\2\u0283\u0284\7{\2\2\u0284\u0285\7k\2"+
					"\2\u0285\u0286\7g\2\2\u0286\u0287\7n\2\2\u0287\u0288\7f\2\2\u0288x\3\2"+
					"\2\2\u0289\u028a\7f\2\2\u028a\u028b\7g\2\2\u028b\u028c\7n\2\2\u028cz\3"+
					"\2\2\2\u028d\u028e\7r\2\2\u028e\u028f\7c\2\2\u028f\u0290\7u\2\2\u0290"+
					"\u0291\7u\2\2\u0291|\3\2\2\2\u0292\u0293\7e\2\2\u0293\u0294\7q\2\2\u0294"+
					"\u0295\7p\2\2\u0295\u0296\7v\2\2\u0296\u0297\7k\2\2\u0297\u0298\7p\2\2"+
					"\u0298\u0299\7w\2\2\u0299\u029a\7g\2\2\u029a~\3\2\2\2\u029b\u029c\7d\2"+
					"\2\u029c\u029d\7t\2\2\u029d\u029e\7g\2\2\u029e\u029f\7c\2\2\u029f\u02a0"+
					"\7m\2\2\u02a0\u0080\3\2\2\2\u02a1\u02a2\7c\2\2\u02a2\u02a3\7u\2\2\u02a3"+
					"\u02a4\7{\2\2\u02a4\u02a5\7p\2\2\u02a5\u02a6\7e\2\2\u02a6\u0082\3\2\2"+
					"\2\u02a7\u02a8\7c\2\2\u02a8\u02a9\7y\2\2\u02a9\u02aa\7c\2\2\u02aa\u02ab"+
					"\7k\2\2\u02ab\u02ac\7v\2\2\u02ac\u0084\3\2\2\2\u02ad\u02ae\6C\2\2\u02ae"+
					"\u02ba\5\u012d\u0097\2\u02af\u02b1\7\17\2\2\u02b0\u02af\3\2\2\2\u02b0"+
					"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b5\7\f\2\2\u02b3\u02b5\4\16"+
					"\17\2\u02b4\u02b0\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6"+
					"\u02b8\5\u012d\u0097\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba"+
					"\3\2\2\2\u02b9\u02ad\3\2\2\2\u02b9\u02b4\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
					"\u02bc\bC\2\2\u02bc\u0086\3\2\2\2\u02bd\u02c1\5\u0133\u009a\2\u02be\u02c0"+
					"\5\u0135\u009b\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3"+
					"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u0088\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4"+
					"\u02ca\t\2\2\2\u02c5\u02c6\t\3\2\2\u02c6\u02ca\t\4\2\2\u02c7\u02c8\t\4"+
					"\2\2\u02c8\u02ca\t\3\2\2\u02c9\u02c4\3\2\2\2\u02c9\u02c5\3\2\2\2\u02c9"+
					"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02ce\5\u0101"+
					"\u0081\2\u02cc\u02ce\5\u0103\u0082\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3"+
					"\2\2\2\u02ce\u008a\3\2\2\2\u02cf\u02d5\t\5\2\2\u02d0\u02d1\t\5\2\2\u02d1"+
					"\u02d5\t\4\2\2\u02d2\u02d3\t\4\2\2\u02d3\u02d5\t\5\2\2\u02d4\u02cf\3\2"+
					"\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6"+
					"\u02d9\5\u011f\u0090\2\u02d7\u02d9\5\u0121\u0091\2\u02d8\u02d6\3\2\2\2"+
					"\u02d8\u02d7\3\2\2\2\u02d9\u008c\3\2\2\2\u02da\u02de\5\u010b\u0086\2\u02db"+
					"\u02dd\5\u010d\u0087\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc"+
					"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e7\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1"+
					"\u02e3\7\62\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e2\3"+
					"\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02da\3\2\2\2\u02e6"+
					"\u02e2\3\2\2\2\u02e7\u008e\3\2\2\2\u02e8\u02e9\7\62\2\2\u02e9\u02eb\t"+
					"\6\2\2\u02ea\u02ec\5\u010f\u0088\2\u02eb\u02ea\3\2\2\2\u02ec\u02ed\3\2"+
					"\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u0090\3\2\2\2\u02ef"+
					"\u02f0\7\62\2\2\u02f0\u02f2\t\7\2\2\u02f1\u02f3\5\u0111\u0089\2\u02f2"+
					"\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2"+
					"\2\2\u02f5\u0092\3\2\2\2\u02f6\u02f7\7\62\2\2\u02f7\u02f9\t\5\2\2\u02f8"+
					"\u02fa\5\u0113\u008a\2\u02f9\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02f9"+
					"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0094\3\2\2\2\u02fd\u0300\5\u0115\u008b"+
					"\2\u02fe\u0300\5\u0117\u008c\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2"+
					"\u0300\u0096\3\2\2\2\u0301\u0304\5\u0095K\2\u0302\u0304\5\u0119\u008d"+
					"\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306"+
					"\t\b\2\2\u0306\u0098\3\2\2\2\u0307\u0308\7>\2\2\u0308\u0309\7\60\2\2\u0309"+
					"\u030a\7\60\2\2\u030a\u030b\7\60\2\2\u030b\u030c\7@\2\2\u030c\u009a\3"+
					"\2\2\2\u030d\u030e\7/\2\2\u030e\u030f\7/\2\2\u030f\u0310\7@\2\2\u0310"+
					"\u009c\3\2\2\2\u0311\u0312\7a\2\2\u0312\u009e\3\2\2\2\u0313\u0314\7\60"+
					"\2\2\u0314\u00a0\3\2\2\2\u0315\u0316\7\60\2\2\u0316\u0317\7\60\2\2\u0317"+
					"\u0318\7\60\2\2\u0318\u00a2\3\2\2\2\u0319\u031a\7,\2\2\u031a\u00a4\3\2"+
					"\2\2\u031b\u031c\7*\2\2\u031c\u031d\bS\3\2\u031d\u00a6\3\2\2\2\u031e\u031f"+
					"\7+\2\2\u031f\u0320\bT\4\2\u0320\u00a8\3\2\2\2\u0321\u0322\7.\2\2\u0322"+
					"\u00aa\3\2\2\2\u0323\u0324\7<\2\2\u0324\u00ac\3\2\2\2\u0325\u0326\7=\2"+
					"\2\u0326\u00ae\3\2\2\2\u0327\u0328\7,\2\2\u0328\u0329\7,\2\2\u0329\u00b0"+
					"\3\2\2\2\u032a\u032b\7?\2\2\u032b\u00b2\3\2\2\2\u032c\u032d\7]\2\2\u032d"+
					"\u032e\bZ\5\2\u032e\u00b4\3\2\2\2\u032f\u0330\7_\2\2\u0330\u0331\b[\6"+
					"\2\u0331\u00b6\3\2\2\2\u0332\u0333\7~\2\2\u0333\u00b8\3\2\2\2\u0334\u0335"+
					"\7`\2\2\u0335\u00ba\3\2\2\2\u0336\u0337\7(\2\2\u0337\u00bc\3\2\2\2\u0338"+
					"\u0339\7>\2\2\u0339\u033a\7>\2\2\u033a\u00be\3\2\2\2\u033b\u033c\7@\2"+
					"\2\u033c\u033d\7@\2\2\u033d\u00c0\3\2\2\2\u033e\u033f\7-\2\2\u033f\u00c2"+
					"\3\2\2\2\u0340\u0341\7/\2\2\u0341\u00c4\3\2\2\2\u0342\u0343\7\61\2\2\u0343"+
					"\u00c6\3\2\2\2\u0344\u0345\7\'\2\2\u0345\u00c8\3\2\2\2\u0346\u0347\7\61"+
					"\2\2\u0347\u0348\7\61\2\2\u0348\u00ca\3\2\2\2\u0349\u034a\7\u0080\2\2"+
					"\u034a\u00cc\3\2\2\2\u034b\u034c\7}\2\2\u034c\u034d\bg\7\2\u034d\u00ce"+
					"\3\2\2\2\u034e\u034f\7\177\2\2\u034f\u0350\bh\b\2\u0350\u00d0\3\2\2\2"+
					"\u0351\u0352\7>\2\2\u0352\u00d2\3\2\2\2\u0353\u0354\7@\2\2\u0354\u00d4"+
					"\3\2\2\2\u0355\u0356\7?\2\2\u0356\u0357\7?\2\2\u0357\u00d6\3\2\2\2\u0358"+
					"\u0359\7@\2\2\u0359\u035a\7?\2\2\u035a\u00d8\3\2\2\2\u035b\u035c\7>\2"+
					"\2\u035c\u035d\7?\2\2\u035d\u00da\3\2\2\2\u035e\u035f\7>\2\2\u035f\u0360"+
					"\7@\2\2\u0360\u00dc\3\2\2\2\u0361\u0362\7#\2\2\u0362\u0363\7?\2\2\u0363"+
					"\u00de\3\2\2\2\u0364\u0365\7B\2\2\u0365\u00e0\3\2\2\2\u0366\u0367\7/\2"+
					"\2\u0367\u0368\7@\2\2\u0368\u00e2\3\2\2\2\u0369\u036a\7-\2\2\u036a\u036b"+
					"\7?\2\2\u036b\u00e4\3\2\2\2\u036c\u036d\7/\2\2\u036d\u036e\7?\2\2\u036e"+
					"\u00e6\3\2\2\2\u036f\u0370\7,\2\2\u0370\u0371\7?\2\2\u0371\u00e8\3\2\2"+
					"\2\u0372\u0373\7B\2\2\u0373\u0374\7?\2\2\u0374\u00ea\3\2\2\2\u0375\u0376"+
					"\7\61\2\2\u0376\u0377\7?\2\2\u0377\u00ec\3\2\2\2\u0378\u0379\7\'\2\2\u0379"+
					"\u037a\7?\2\2\u037a\u00ee\3\2\2\2\u037b\u037c\7(\2\2\u037c\u037d\7?\2"+
					"\2\u037d\u00f0\3\2\2\2\u037e\u037f\7~\2\2\u037f\u0380\7?\2\2\u0380\u00f2"+
					"\3\2\2\2\u0381\u0382\7`\2\2\u0382\u0383\7?\2\2\u0383\u00f4\3\2\2\2\u0384"+
					"\u0385\7>\2\2\u0385\u0386\7>\2\2\u0386\u0387\7?\2\2\u0387\u00f6\3\2\2"+
					"\2\u0388\u0389\7@\2\2\u0389\u038a\7@\2\2\u038a\u038b\7?\2\2\u038b\u00f8"+
					"\3\2\2\2\u038c\u038d\7,\2\2\u038d\u038e\7,\2\2\u038e\u038f\7?\2\2\u038f"+
					"\u00fa\3\2\2\2\u0390\u0391\7\61\2\2\u0391\u0392\7\61\2\2\u0392\u0393\7"+
					"?\2\2\u0393\u00fc\3\2\2\2\u0394\u0398\5\u012d\u0097\2\u0395\u0398\5\u012f"+
					"\u0098\2\u0396\u0398\5\u0131\u0099\2\u0397\u0394\3\2\2\2\u0397\u0395\3"+
					"\2\2\2\u0397\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\b\177\t\2\u039a"+
					"\u00fe\3\2\2\2\u039b\u039c\13\2\2\2\u039c\u0100\3\2\2\2\u039d\u03a2\7"+
					")\2\2\u039e\u03a1\5\u0109\u0085\2\u039f\u03a1\n\t\2\2\u03a0\u039e\3\2"+
					"\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2"+
					"\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03b0\7)"+
					"\2\2\u03a6\u03ab\7$\2\2\u03a7\u03aa\5\u0109\u0085\2\u03a8\u03aa\n\n\2"+
					"\2\u03a9\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9"+
					"\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae"+
					"\u03b0\7$\2\2\u03af\u039d\3\2\2\2\u03af\u03a6\3\2\2\2\u03b0\u0102\3\2"+
					"\2\2\u03b1\u03b2\7)\2\2\u03b2\u03b3\7)\2\2\u03b3\u03b4\7)\2\2\u03b4\u03b8"+
					"\3\2\2\2\u03b5\u03b7\5\u0105\u0083\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3"+
					"\2\2\2\u03b8\u03b9\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba"+
					"\u03b8\3\2\2\2\u03bb\u03bc\7)\2\2\u03bc\u03bd\7)\2\2\u03bd\u03cc\7)\2"+
					"\2\u03be\u03bf\7$\2\2\u03bf\u03c0\7$\2\2\u03c0\u03c1\7$\2\2\u03c1\u03c5"+
					"\3\2\2\2\u03c2\u03c4\5\u0105\u0083\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7\3"+
					"\2\2\2\u03c5\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
					"\u03c5\3\2\2\2\u03c8\u03c9\7$\2\2\u03c9\u03ca\7$\2\2\u03ca\u03cc\7$\2"+
					"\2\u03cb\u03b1\3\2\2\2\u03cb\u03be\3\2\2\2\u03cc\u0104\3\2\2\2\u03cd\u03d0"+
					"\5\u0107\u0084\2\u03ce\u03d0\5\u0109\u0085\2\u03cf\u03cd\3\2\2\2\u03cf"+
					"\u03ce\3\2\2\2\u03d0\u0106\3\2\2\2\u03d1\u03d2\n\13\2\2\u03d2\u0108\3"+
					"\2\2\2\u03d3\u03d4\7^\2\2\u03d4\u03d8\13\2\2\2\u03d5\u03d6\7^\2\2\u03d6"+
					"\u03d8\5\u0085C\2\u03d7\u03d3\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u010a"+
					"\3\2\2\2\u03d9\u03da\t\f\2\2\u03da\u010c\3\2\2\2\u03db\u03dc\t\r\2\2\u03dc"+
					"\u010e\3\2\2\2\u03dd\u03de\t\16\2\2\u03de\u0110\3\2\2\2\u03df\u03e0\t"+
					"\17\2\2\u03e0\u0112\3\2\2\2\u03e1\u03e2\t\20\2\2\u03e2\u0114\3\2\2\2\u03e3"+
					"\u03e5\5\u0119\u008d\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6"+
					"\3\2\2\2\u03e6\u03eb\5\u011b\u008e\2\u03e7\u03e8\5\u0119\u008d\2\u03e8"+
					"\u03e9\7\60\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e4\3\2\2\2\u03ea\u03e7\3"+
					"\2\2\2\u03eb\u0116\3\2\2\2\u03ec\u03ef\5\u0119\u008d\2\u03ed\u03ef\5\u0115"+
					"\u008b\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0"+
					"\u03f1\5\u011d\u008f\2\u03f1\u0118\3\2\2\2\u03f2\u03f4\5\u010d\u0087\2"+
					"\u03f3\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6"+
					"\3\2\2\2\u03f6\u011a\3\2\2\2\u03f7\u03f9\7\60\2\2\u03f8\u03fa\5\u010d"+
					"\u0087\2\u03f9\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb"+
					"\u03fc\3\2\2\2\u03fc\u011c\3\2\2\2\u03fd\u03ff\t\21\2\2\u03fe\u0400\t"+
					"\22\2\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401"+
					"\u0403\5\u010d\u0087\2\u0402\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0402"+
					"\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u011e\3\2\2\2\u0406\u040b\7)\2\2\u0407"+
					"\u040a\5\u0125\u0093\2\u0408\u040a\5\u012b\u0096\2\u0409\u0407\3\2\2\2"+
					"\u0409\u0408\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c"+
					"\3\2\2\2\u040c\u040e\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0419\7)\2\2\u040f"+
					"\u0414\7$\2\2\u0410\u0413\5\u0127\u0094\2\u0411\u0413\5\u012b\u0096\2"+
					"\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412"+
					"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
					"\u0419\7$\2\2\u0418\u0406\3\2\2\2\u0418\u040f\3\2\2\2\u0419\u0120\3\2"+
					"\2\2\u041a\u041b\7)\2\2\u041b\u041c\7)\2\2\u041c\u041d\7)\2\2\u041d\u0421"+
					"\3\2\2\2\u041e\u0420\5\u0123\u0092\2\u041f\u041e\3\2\2\2\u0420\u0423\3"+
					"\2\2\2\u0421\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\3\2\2\2\u0423"+
					"\u0421\3\2\2\2\u0424\u0425\7)\2\2\u0425\u0426\7)\2\2\u0426\u0435\7)\2"+
					"\2\u0427\u0428\7$\2\2\u0428\u0429\7$\2\2\u0429\u042a\7$\2\2\u042a\u042e"+
					"\3\2\2\2\u042b\u042d\5\u0123\u0092\2\u042c\u042b\3\2\2\2\u042d\u0430\3"+
					"\2\2\2\u042e\u042f\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0431\3\2\2\2\u0430"+
					"\u042e\3\2\2\2\u0431\u0432\7$\2\2\u0432\u0433\7$\2\2\u0433\u0435\7$\2"+
					"\2\u0434\u041a\3\2\2\2\u0434\u0427\3\2\2\2\u0435\u0122\3\2\2\2\u0436\u0439"+
					"\5\u0129\u0095\2\u0437\u0439\5\u012b\u0096\2\u0438\u0436\3\2\2\2\u0438"+
					"\u0437\3\2\2\2\u0439\u0124\3\2\2\2\u043a\u043c\t\23\2\2\u043b\u043a\3"+
					"\2\2\2\u043c\u0126\3\2\2\2\u043d\u043f\t\24\2\2\u043e\u043d\3\2\2\2\u043f"+
					"\u0128\3\2\2\2\u0440\u0442\t\25\2\2\u0441\u0440\3\2\2\2\u0442\u012a\3"+
					"\2\2\2\u0443\u0444\7^\2\2\u0444\u0445\t\26\2\2\u0445\u012c\3\2\2\2\u0446"+
					"\u0448\t\27\2\2\u0447\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u0447\3"+
					"\2\2\2\u0449\u044a\3\2\2\2\u044a\u012e\3\2\2\2\u044b\u044f\7%\2\2\u044c"+
					"\u044e\n\30\2\2\u044d\u044c\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3"+
					"\2\2\2\u044f\u0450\3\2\2\2\u0450\u0130\3\2\2\2\u0451\u044f\3\2\2\2\u0452"+
					"\u0454\7^\2\2\u0453\u0455\5\u012d\u0097\2\u0454\u0453\3\2\2\2\u0454\u0455"+
					"\3\2\2\2\u0455\u045b\3\2\2\2\u0456\u0458\7\17\2\2\u0457\u0456\3\2\2\2"+
					"\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045c\7\f\2\2\u045a\u045c"+
					"\4\16\17\2\u045b\u0457\3\2\2\2\u045b\u045a\3\2\2\2\u045c\u0132\3\2\2\2"+
					"\u045d\u0460\5\u009dO\2\u045e\u0460\t\31\2\2\u045f\u045d\3\2\2\2\u045f"+
					"\u045e\3\2\2\2\u0460\u0134\3\2\2\2\u0461\u0464\5\u0133\u009a\2\u0462\u0464"+
					"\t\32\2\2\u0463\u0461\3\2\2\2\u0463\u0462\3\2\2\2\u0464\u0136\3\2\2\2"+
					"<\2\u01e2\u01e7\u01ed\u02b0\u02b4\u02b7\u02b9\u02c1\u02c9\u02cd\u02d4"+
					"\u02d8\u02de\u02e4\u02e6\u02ed\u02f4\u02fb\u02ff\u0303\u0397\u03a0\u03a2"+
					"\u03a9\u03ab\u03af\u03b8\u03c5\u03cb\u03cf\u03d7\u03e4\u03ea\u03ee\u03f5"+
					"\u03fb\u03ff\u0404\u0409\u040b\u0412\u0414\u0418\u0421\u042e\u0434\u0438"+
					"\u043b\u043e\u0441\u0449\u044f\u0454\u0457\u045b\u045f\u0463\n\3C\2\3"+
					"S\3\3T\4\3Z\5\3[\6\3g\7\3h\b\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
