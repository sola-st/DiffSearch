package ProgrammingLanguage.JavaScript;// Generated from src/main/resources/ANTLR/ECMAScript.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ECMAScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, RegularExpressionLiteral=12, LineTerminator=13, OpenBracket=14, 
		CloseBracket=15, OpenParen=16, CloseParen=17, OpenBrace=18, CloseBrace=19, 
		SemiColon=20, Comma=21, Assign=22, QuestionMark=23, Colon=24, Dot=25, 
		PlusPlus=26, MinusMinus=27, Plus=28, Minus=29, BitNot=30, Not=31, Multiply=32, 
		Divide=33, Modulus=34, RightShiftArithmetic=35, LeftShiftArithmetic=36, 
		RightShiftLogical=37, LessThan=38, MoreThan=39, LessThanEquals=40, GreaterThanEquals=41, 
		Equals=42, NotEquals=43, IdentityEquals=44, IdentityNotEquals=45, BitAnd=46, 
		BitXOr=47, BitOr=48, And=49, Or=50, MultiplyAssign=51, DivideAssign=52, 
		ModulusAssign=53, PlusAssign=54, MinusAssign=55, LeftShiftArithmeticAssign=56, 
		RightShiftArithmeticAssign=57, RightShiftLogicalAssign=58, BitAndAssign=59, 
		BitXorAssign=60, BitOrAssign=61, NullLiteral=62, BooleanLiteral=63, DecimalLiteral=64, 
		HexIntegerLiteral=65, OctalIntegerLiteral=66, Break=67, Do=68, Instanceof=69, 
		Typeof=70, Case=71, Else=72, New=73, Var=74, Catch=75, Finally=76, Return=77, 
		Void=78, Continue=79, For=80, Switch=81, While=82, Debugger=83, Function=84, 
		This=85, With=86, Default=87, If=88, Throw=89, Delete=90, In=91, Try=92, 
		Class=93, Enum=94, Extends=95, Super=96, Const=97, Export=98, Import=99, 
		Implements=100, Let=101, Private=102, Public=103, Interface=104, Package=105, 
		Protected=106, Static=107, Yield=108, QUERY_ARROW=109, EXPR=110, EMPTY=111, 
		WILDCARD=112, NEWLINE=113, UNOP=114, LITERALS=115, Identifier=116, StringLiteral=117, 
		WhiteSpaces=118, MultiLineComment=119, SingleLineComment=120, UnexpectedCharacter=121;
	public static final int
		RULE_program = 0, RULE_querySnippet = 1, RULE_sourceElements = 2, RULE_sourceElement = 3, 
		RULE_statement = 4, RULE_multipleStatement = 5, RULE_block = 6, RULE_statementList = 7, 
		RULE_variableStatement = 8, RULE_variableDeclarationList = 9, RULE_variableDeclaration = 10, 
		RULE_initialiser = 11, RULE_emptyStatement = 12, RULE_expressionStatement = 13, 
		RULE_ifStatement = 14, RULE_iterationStatement = 15, RULE_continueStatement = 16, 
		RULE_breakStatement = 17, RULE_returnStatement = 18, RULE_withStatement = 19, 
		RULE_switchStatement = 20, RULE_caseBlock = 21, RULE_caseClauses = 22, 
		RULE_caseClause = 23, RULE_defaultClause = 24, RULE_labelledStatement = 25, 
		RULE_throwStatement = 26, RULE_tryStatement = 27, RULE_catchProduction = 28, 
		RULE_finallyProduction = 29, RULE_debuggerStatement = 30, RULE_functionDeclaration = 31, 
		RULE_formalParameterList = 32, RULE_functionBody = 33, RULE_arrayLiteral = 34, 
		RULE_elementList = 35, RULE_elision = 36, RULE_objectLiteral = 37, RULE_propertyNameAndValueList = 38, 
		RULE_propertyAssignment = 39, RULE_propertyName = 40, RULE_propertySetParameterList = 41, 
		RULE_arguments = 42, RULE_argumentList = 43, RULE_expressionSequence = 44, 
		RULE_singleExpression = 45, RULE_assignmentOperator = 46, RULE_literal = 47, 
		RULE_numericLiteral = 48, RULE_identifierName = 49, RULE_reservedWord = 50, 
		RULE_keyword = 51, RULE_futureReservedWord = 52, RULE_getter = 53, RULE_setter = 54, 
		RULE_eos = 55, RULE_eof = 56, RULE_binOperator = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "querySnippet", "sourceElements", "sourceElement", "statement", 
			"multipleStatement", "block", "statementList", "variableStatement", "variableDeclarationList", 
			"variableDeclaration", "initialiser", "emptyStatement", "expressionStatement", 
			"ifStatement", "iterationStatement", "continueStatement", "breakStatement", 
			"returnStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses", 
			"caseClause", "defaultClause", "labelledStatement", "throwStatement", 
			"tryStatement", "catchProduction", "finallyProduction", "debuggerStatement", 
			"functionDeclaration", "formalParameterList", "functionBody", "arrayLiteral", 
			"elementList", "elision", "objectLiteral", "propertyNameAndValueList", 
			"propertyAssignment", "propertyName", "propertySetParameterList", "arguments", 
			"argumentList", "expressionSequence", "singleExpression", "assignmentOperator", 
			"literal", "numericLiteral", "identifierName", "reservedWord", "keyword", 
			"futureReservedWord", "getter", "setter", "eos", "eof", "binOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'OP'", "'OP<0>'", "'OP<1>'", "'OP<2>'", "'OP<3>'", "'from'", "'binOP'", 
			"'binOP<0>'", "'binOP<1>'", "'binOP<2>'", "'binOP<3>'", null, null, "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'?'", "':'", 
			"'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", 
			"'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
			"'null'", null, null, null, null, "'break'", "'do'", "'instanceof'", 
			"'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", 
			"'return'", "'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'class'", "'enum'", "'extends'", "'super'", "'const'", 
			"'export'", "'import'", null, null, null, null, null, null, null, null, 
			null, "'-->'", null, "'_'", "'<...>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"RegularExpressionLiteral", "LineTerminator", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", "MinusMinus", "Plus", 
			"Minus", "BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "Break", "Do", "Instanceof", 
			"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
			"Void", "Continue", "For", "Switch", "While", "Debugger", "Function", 
			"This", "With", "Default", "If", "Throw", "Delete", "In", "Try", "Class", 
			"Enum", "Extends", "Super", "Const", "Export", "Import", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Yield", "QUERY_ARROW", "EXPR", "EMPTY", "WILDCARD", "NEWLINE", "UNOP", 
			"LITERALS", "Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", 
			"SingleLineComment", "UnexpectedCharacter"
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
	public String getGrammarFileName() { return "ECMAScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  
	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token of the given {@code type} exists on the
	     * {@code HIDDEN} channel.
	     *
	     * @param type
	     *         the type of the token on the {@code HIDDEN} channel
	     *         to check.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token of the given {@code type} exists on the
	     * {@code HIDDEN} channel.
	     */
	    private boolean here(final int type) {

	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);

	        // Check if the token resides on the HIDDEN channel and if it's of the
	        // provided type.
	        return (ahead.getChannel() == Lexer.HIDDEN) && (ahead.getType() == type);
	    }

	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     */
	    private boolean lineTerminatorAhead() {

	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);

	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the HIDDEN channel.
	            return false;
	        }

	        if (ahead.getType() == LineTerminator) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WhiteSpaces) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == MultiLineComment && (text.contains("\r") || text.contains("\n"))) ||
	                (type == LineTerminator);
	    }                                

	public ECMAScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<QuerySnippetContext> querySnippet() {
			return getRuleContexts(QuerySnippetContext.class);
		}
		public QuerySnippetContext querySnippet(int i) {
			return getRuleContext(QuerySnippetContext.class,i);
		}
		public TerminalNode QUERY_ARROW() { return getToken(ECMAScriptParser.QUERY_ARROW, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ECMAScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ECMAScriptParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			querySnippet();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(117);
				match(NEWLINE);
				}
			}

			setState(120);
			match(QUERY_ARROW);
			setState(121);
			querySnippet();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(122);
				match(NEWLINE);
				}
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

	public static class QuerySnippetContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MultipleStatementContext multipleStatement() {
			return getRuleContext(MultipleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public TerminalNode EMPTY() { return getToken(ECMAScriptParser.EMPTY, 0); }
		public QuerySnippetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySnippet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterQuerySnippet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitQuerySnippet(this);
		}
	}

	public final QuerySnippetContext querySnippet() throws RecognitionException {
		QuerySnippetContext _localctx = new QuerySnippetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_querySnippet);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				if (!(_input.LA(1) != OpenBrace)) throw new FailedPredicateException(this, "_input.LA(1) != OpenBrace");
				setState(129);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				multipleStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				iterationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(136);
				withStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(137);
				labelledStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(138);
				switchStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(139);
				throwStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(140);
				tryStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(141);
				futureReservedWord();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(142);
				debuggerStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(143);
				match(WILDCARD);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(144);
				match(EMPTY);
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

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public List<TerminalNode> WILDCARD() { return getTokens(ECMAScriptParser.WILDCARD); }
		public TerminalNode WILDCARD(int i) {
			return getToken(ECMAScriptParser.WILDCARD, i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitSourceElements(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(147);
				match(WILDCARD);
				}
				break;
			}
			setState(150);
			sourceElement();
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(151);
				match(WILDCARD);
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					sourceElement();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(160);
				match(WILDCARD);
				}
				break;
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

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitSourceElement(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sourceElement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				if (!(_input.LA(1) != Function)) throw new FailedPredicateException(this, "_input.LA(1) != Function");
				setState(164);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(WILDCARD);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				if (!(_input.LA(1) != OpenBrace)) throw new FailedPredicateException(this, "_input.LA(1) != OpenBrace");
				setState(173);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(180);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(181);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(182);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(183);
				tryStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(184);
				debuggerStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(185);
				match(WILDCARD);
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

	public static class MultipleStatementContext extends ParserRuleContext {
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public MultipleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterMultipleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitMultipleStatement(this);
		}
	}

	public final MultipleStatementContext multipleStatement() throws RecognitionException {
		MultipleStatementContext _localctx = new MultipleStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expressionStatement();
			setState(189);
			expressionStatement();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(190);
				expressionStatement();
				}
				}
				setState(195);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(OpenBrace);
			setState(197);
			statementList();
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(198);
				match(CloseBrace);
				}
				break;
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER );
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

	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Var);
			setState(207);
			variableDeclarationList();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(208);
				match(SemiColon);
				}
				break;
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			variableDeclaration();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(Comma);
					setState(213);
					variableDeclaration();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Identifier);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(220);
				initialiser();
				}
				break;
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

	public static class InitialiserContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(ECMAScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitInitialiser(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(Assign);
			setState(224);
			singleExpression(0);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(SemiColon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expressionSequence();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(229);
				match(SemiColon);
				}
				break;
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ECMAScriptParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ECMAScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(If);
			setState(233);
			match(OpenParen);
			setState(234);
			expressionSequence();
			setState(235);
			match(CloseParen);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(236);
				statement();
				}
				break;
			}
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(239);
				match(Else);
				setState(240);
				statement();
				}
				break;
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ECMAScriptParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitDoStatement(this);
		}
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ECMAScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ECMAScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterForVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitForVarStatement(this);
		}
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterForVarInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitForVarInStatement(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ECMAScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ECMAScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitForStatement(this);
		}
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitForInStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iterationStatement);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(Do);
				setState(244);
				statement();
				setState(245);
				match(While);
				setState(246);
				match(OpenParen);
				setState(247);
				expressionSequence();
				setState(248);
				match(CloseParen);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(249);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(While);
				setState(253);
				match(OpenParen);
				setState(254);
				expressionSequence();
				setState(255);
				match(CloseParen);
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(256);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(For);
				setState(260);
				match(OpenParen);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(261);
					expressionSequence();
					}
				}

				setState(264);
				match(SemiColon);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(265);
					expressionSequence();
					}
				}

				setState(268);
				match(SemiColon);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(269);
					expressionSequence();
					}
				}

				setState(272);
				match(CloseParen);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(273);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(For);
				setState(277);
				match(OpenParen);
				setState(278);
				match(Var);
				setState(279);
				variableDeclarationList();
				setState(280);
				match(SemiColon);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(281);
					expressionSequence();
					}
				}

				setState(284);
				match(SemiColon);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(285);
					expressionSequence();
					}
				}

				setState(288);
				match(CloseParen);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(289);
					statement();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(For);
				setState(293);
				match(OpenParen);
				setState(294);
				singleExpression(0);
				setState(295);
				match(In);
				setState(296);
				expressionSequence();
				setState(297);
				match(CloseParen);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(298);
					statement();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(For);
				setState(302);
				match(OpenParen);
				setState(303);
				match(Var);
				setState(304);
				variableDeclaration();
				setState(305);
				match(In);
				setState(306);
				expressionSequence();
				setState(307);
				match(CloseParen);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(308);
					statement();
					}
					break;
				}
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(ECMAScriptParser.Continue, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Continue);
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(314);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(315);
				match(Identifier);
				}
				break;
			}
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(318);
				match(SemiColon);
				}
				break;
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ECMAScriptParser.Break, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Break);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(322);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(323);
				match(Identifier);
				}
				break;
			}
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(326);
				match(SemiColon);
				}
				break;
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ECMAScriptParser.Return, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(Return);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(330);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(331);
				expressionSequence();
				}
				break;
			}
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(334);
				match(SemiColon);
				}
				break;
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

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(ECMAScriptParser.With, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(With);
			setState(338);
			match(OpenParen);
			setState(339);
			expressionSequence();
			setState(340);
			match(CloseParen);
			setState(341);
			statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ECMAScriptParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Switch);
			setState(344);
			match(OpenParen);
			setState(345);
			expressionSequence();
			setState(346);
			match(CloseParen);
			setState(347);
			caseBlock();
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

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitCaseBlock(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(OpenBrace);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(350);
				caseClauses();
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(353);
				defaultClause();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(354);
					caseClauses();
					}
				}

				}
			}

			setState(359);
			match(CloseBrace);
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

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitCaseClauses(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				caseClause();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
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

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ECMAScriptParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Case);
			setState(367);
			expressionSequence();
			setState(368);
			match(Colon);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(369);
				statementList();
				}
				break;
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

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ECMAScriptParser.Default, 0); }
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitDefaultClause(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Default);
			setState(373);
			match(Colon);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(374);
				statementList();
				}
				break;
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

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitLabelledStatement(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Identifier);
			setState(378);
			match(Colon);
			setState(379);
			statement();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(ECMAScriptParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(Throw);
			setState(382);
			if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
			setState(383);
			expressionSequence();
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(384);
				match(SemiColon);
				}
				break;
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ECMAScriptParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tryStatement);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(Try);
				setState(388);
				block();
				setState(389);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(Try);
				setState(392);
				block();
				setState(393);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(Try);
				setState(396);
				block();
				setState(397);
				catchProduction();
				setState(398);
				finallyProduction();
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

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(ECMAScriptParser.Catch, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitCatchProduction(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_catchProduction);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(Catch);
				setState(403);
				match(OpenParen);
				setState(404);
				match(Identifier);
				setState(405);
				match(CloseParen);
				setState(406);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(Catch);
				setState(408);
				match(OpenParen);
				setState(409);
				match(WILDCARD);
				setState(410);
				match(CloseParen);
				setState(411);
				block();
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

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(ECMAScriptParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitFinallyProduction(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(Finally);
			setState(415);
			block();
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

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(ECMAScriptParser.Debugger, 0); }
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitDebuggerStatement(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(Debugger);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(418);
				match(SemiColon);
				}
				break;
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Function);
			setState(422);
			match(Identifier);
			setState(423);
			match(OpenParen);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(424);
				formalParameterList();
				}
			}

			setState(427);
			match(CloseParen);
			setState(428);
			match(OpenBrace);
			setState(429);
			functionBody();
			setState(430);
			match(CloseBrace);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ECMAScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ECMAScriptParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Identifier);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(433);
				match(Comma);
				setState(434);
				match(Identifier);
				}
				}
				setState(439);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(440);
				sourceElements();
				}
				break;
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ECMAScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ECMAScriptParser.CloseBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ECMAScriptParser.Comma, 0); }
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(OpenBracket);
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(444);
				elementList();
				}
				break;
			}
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(447);
				match(Comma);
				}
				break;
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(450);
				elision();
				}
			}

			setState(453);
			match(CloseBracket);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(455);
				elision();
				}
			}

			setState(458);
			singleExpression(0);
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(459);
					match(Comma);
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(460);
						elision();
						}
					}

					setState(463);
					singleExpression(0);
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class ElisionContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterElision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitElision(this);
		}
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469);
				match(Comma);
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ECMAScriptParser.Comma, 0); }
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_objectLiteral);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(OpenBrace);
				setState(475);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(OpenBrace);
				setState(477);
				propertyNameAndValueList();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(478);
					match(Comma);
					}
				}

				setState(481);
				match(CloseBrace);
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

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPropertyNameAndValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPropertyNameAndValueList(this);
		}
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			propertyAssignment();
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					match(Comma);
					setState(487);
					propertyAssignment();
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPropertyExpressionAssignment(this);
		}
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public PropertySetParameterListContext propertySetParameterList() {
			return getRuleContext(PropertySetParameterListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPropertySetter(this);
		}
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPropertyGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPropertyGetter(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertyAssignment);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				propertyName();
				setState(494);
				match(Colon);
				setState(495);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				getter();
				setState(498);
				match(OpenParen);
				setState(499);
				match(CloseParen);
				setState(500);
				match(OpenBrace);
				setState(501);
				functionBody();
				setState(502);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				setter();
				setState(505);
				match(OpenParen);
				setState(506);
				propertySetParameterList();
				setState(507);
				match(CloseParen);
				setState(508);
				match(OpenBrace);
				setState(509);
				functionBody();
				setState(510);
				match(CloseBrace);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(ECMAScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ECMAScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ECMAScriptParser.OctalIntegerLiteral, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyName);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(DecimalLiteral);
				}
				break;
			case HexIntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				match(HexIntegerLiteral);
				}
				break;
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				match(OctalIntegerLiteral);
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

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPropertySetParameterList(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(Identifier);
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
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arguments);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(OpenParen);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (UNOP - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(524);
					argumentList();
					}
				}

				setState(527);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(OpenParen);
				setState(529);
				match(WILDCARD);
				setState(530);
				match(CloseParen);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argumentList);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				singleExpression(0);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(534);
					match(Comma);
					setState(535);
					singleExpression(0);
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(WILDCARD);
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			singleExpression(0);
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(545);
					match(Comma);
					setState(546);
					singleExpression(0);
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ECMAScriptParser.PlusPlus, 0); }
		public TerminalNode UNOP() { return getToken(ECMAScriptParser.UNOP, 0); }
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPreIncrementExpression(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitObjectLiteralExpression(this);
		}
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitInExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(ECMAScriptParser.Not, 0); }
		public TerminalNode UNOP() { return getToken(ECMAScriptParser.UNOP, 0); }
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitNotExpression(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(ECMAScriptParser.MinusMinus, 0); }
		public TerminalNode UNOP() { return getToken(ECMAScriptParser.UNOP, 0); }
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPreDecreaseExpression(this);
		}
	}
	public static class WildcardContext extends SingleExpressionContext {
		public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
		public WildcardContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitWildcard(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(ECMAScriptParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitThisExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitFunctionExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(ECMAScriptParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class BinaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BinOperatorContext binOperator() {
			return getRuleContext(BinOperatorContext.class,0);
		}
		public BinaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBinaryExpression(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(ECMAScriptParser.MinusMinus, 0); }
		public TerminalNode UNOP() { return getToken(ECMAScriptParser.UNOP, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPostDecreaseExpression(this);
		}
	}
	public static class GeneralExpressionclearContext extends SingleExpressionContext {
		public TerminalNode EXPR() { return getToken(ECMAScriptParser.EXPR, 0); }
		public GeneralExpressionclearContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterGeneralExpressionclear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitGeneralExpressionclear(this);
		}
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(ECMAScriptParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitTypeofExpression(this);
		}
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(ECMAScriptParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitInstanceofExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(ECMAScriptParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(ECMAScriptParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitDeleteExpression(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ECMAScriptParser.PlusPlus, 0); }
		public TerminalNode UNOP() { return getToken(ECMAScriptParser.UNOP, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitPostIncrementExpression(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode BitNot() { return getToken(ECMAScriptParser.BitNot, 0); }
		public TerminalNode UNOP() { return getToken(ECMAScriptParser.UNOP, 0); }
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBitNotExpression(this);
		}
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(ECMAScriptParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitNewExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitLiteralExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ECMAScriptParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitMemberDotExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ECMAScriptParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ECMAScriptParser.CloseBracket, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitAssignmentOperatorExpression(this);
		}
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(ECMAScriptParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitVoidExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(553);
				match(Function);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(554);
					match(Identifier);
					}
				}

				setState(557);
				match(OpenParen);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(558);
					formalParameterList();
					}
				}

				setState(561);
				match(CloseParen);
				setState(562);
				match(OpenBrace);
				setState(563);
				functionBody();
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(564);
					match(CloseBrace);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567);
				match(New);
				setState(568);
				singleExpression(0);
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(569);
					arguments();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(572);
				match(Delete);
				setState(573);
				singleExpression(21);
				}
				break;
			case 4:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(574);
				match(Void);
				setState(575);
				singleExpression(20);
				}
				break;
			case 5:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576);
				match(Typeof);
				setState(577);
				singleExpression(19);
				}
				break;
			case 6:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==UNOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				singleExpression(18);
				}
				break;
			case 7:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==MinusMinus || _la==UNOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(581);
				singleExpression(17);
				}
				break;
			case 8:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(582);
				match(Plus);
				setState(583);
				singleExpression(16);
				}
				break;
			case 9:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(584);
				match(Minus);
				setState(585);
				singleExpression(15);
				}
				break;
			case 10:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(586);
				_la = _input.LA(1);
				if ( !(_la==BitNot || _la==UNOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(587);
				singleExpression(14);
				}
				break;
			case 11:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==Not || _la==UNOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				singleExpression(13);
				}
				break;
			case 12:
				{
				_localctx = new GeneralExpressionclearContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(590);
				match(EXPR);
				}
				break;
			case 13:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(591);
				match(This);
				}
				break;
			case 14:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(Identifier);
				}
				break;
			case 15:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593);
				literal();
				}
				break;
			case 16:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(594);
				arrayLiteral();
				}
				break;
			case 17:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(595);
				objectLiteral();
				}
				break;
			case 18:
				{
				_localctx = new WildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(596);
				match(WILDCARD);
				}
				break;
			case 19:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(597);
				match(OpenParen);
				setState(598);
				expressionSequence();
				setState(599);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(603);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(604);
						binOperator();
						setState(605);
						singleExpression(13);
						}
						break;
					case 2:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(607);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(608);
						match(Instanceof);
						setState(609);
						singleExpression(12);
						}
						break;
					case 3:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(610);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(611);
						match(In);
						setState(612);
						singleExpression(11);
						}
						break;
					case 4:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(613);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(614);
						assignmentOperator();
						setState(615);
						singleExpression(10);
						}
						break;
					case 5:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(617);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(618);
						match(OpenBracket);
						setState(619);
						expressionSequence();
						setState(620);
						match(CloseBracket);
						}
						break;
					case 6:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(622);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(623);
						match(Dot);
						setState(624);
						identifierName();
						}
						break;
					case 7:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(625);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(626);
						arguments();
						setState(628);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
							{
							setState(627);
							match(OpenBrace);
							}
							break;
						}
						setState(630);
						functionBody();
						setState(632);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(631);
							match(CloseBrace);
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(634);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(635);
						if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
						setState(636);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==UNOP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 9:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(637);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(638);
						if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
						setState(639);
						_la = _input.LA(1);
						if ( !(_la==MinusMinus || _la==UNOP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(ECMAScriptParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(ECMAScriptParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(ECMAScriptParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(ECMAScriptParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(ECMAScriptParser.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(ECMAScriptParser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(ECMAScriptParser.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(ECMAScriptParser.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(ECMAScriptParser.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(ECMAScriptParser.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(ECMAScriptParser.BitOrAssign, 0); }
		public TerminalNode Assign() { return getToken(ECMAScriptParser.Assign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Assign) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ECMAScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ECMAScriptParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(ECMAScriptParser.RegularExpressionLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(ECMAScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ECMAScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ECMAScriptParser.OctalIntegerLiteral, 0); }
		public TerminalNode LITERALS() { return getToken(ECMAScriptParser.LITERALS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || _la==StringLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				match(DecimalLiteral);
				}
				break;
			case HexIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				match(HexIntegerLiteral);
				}
				break;
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				match(OctalIntegerLiteral);
				}
				break;
			case LITERALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(651);
				match(LITERALS);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ECMAScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ECMAScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ECMAScriptParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_identifierName);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(Identifier);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				reservedWord();
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ECMAScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ECMAScriptParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_reservedWord);
		int _la;
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				keyword();
				}
				break;
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ECMAScriptParser.Break, 0); }
		public TerminalNode Do() { return getToken(ECMAScriptParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ECMAScriptParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ECMAScriptParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(ECMAScriptParser.Case, 0); }
		public TerminalNode Else() { return getToken(ECMAScriptParser.Else, 0); }
		public TerminalNode New() { return getToken(ECMAScriptParser.New, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public TerminalNode Catch() { return getToken(ECMAScriptParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(ECMAScriptParser.Finally, 0); }
		public TerminalNode Return() { return getToken(ECMAScriptParser.Return, 0); }
		public TerminalNode Void() { return getToken(ECMAScriptParser.Void, 0); }
		public TerminalNode Continue() { return getToken(ECMAScriptParser.Continue, 0); }
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode Switch() { return getToken(ECMAScriptParser.Switch, 0); }
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode Debugger() { return getToken(ECMAScriptParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode This() { return getToken(ECMAScriptParser.This, 0); }
		public TerminalNode With() { return getToken(ECMAScriptParser.With, 0); }
		public TerminalNode Default() { return getToken(ECMAScriptParser.Default, 0); }
		public TerminalNode If() { return getToken(ECMAScriptParser.If, 0); }
		public TerminalNode Throw() { return getToken(ECMAScriptParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(ECMAScriptParser.Delete, 0); }
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public TerminalNode Try() { return getToken(ECMAScriptParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Break - 67)) | (1L << (Do - 67)) | (1L << (Instanceof - 67)) | (1L << (Typeof - 67)) | (1L << (Case - 67)) | (1L << (Else - 67)) | (1L << (New - 67)) | (1L << (Var - 67)) | (1L << (Catch - 67)) | (1L << (Finally - 67)) | (1L << (Return - 67)) | (1L << (Void - 67)) | (1L << (Continue - 67)) | (1L << (For - 67)) | (1L << (Switch - 67)) | (1L << (While - 67)) | (1L << (Debugger - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (With - 67)) | (1L << (Default - 67)) | (1L << (If - 67)) | (1L << (Throw - 67)) | (1L << (Delete - 67)) | (1L << (In - 67)) | (1L << (Try - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class FutureReservedWordContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ECMAScriptParser.Class, 0); }
		public TerminalNode Enum() { return getToken(ECMAScriptParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(ECMAScriptParser.Extends, 0); }
		public TerminalNode Super() { return getToken(ECMAScriptParser.Super, 0); }
		public TerminalNode Const() { return getToken(ECMAScriptParser.Const, 0); }
		public TerminalNode Export() { return getToken(ECMAScriptParser.Export, 0); }
		public TerminalNode Import() { return getToken(ECMAScriptParser.Import, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ECMAScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ECMAScriptParser.Identifier, i);
		}
		public TerminalNode Implements() { return getToken(ECMAScriptParser.Implements, 0); }
		public TerminalNode Let() { return getToken(ECMAScriptParser.Let, 0); }
		public TerminalNode Private() { return getToken(ECMAScriptParser.Private, 0); }
		public TerminalNode Public() { return getToken(ECMAScriptParser.Public, 0); }
		public TerminalNode Interface() { return getToken(ECMAScriptParser.Interface, 0); }
		public TerminalNode Package() { return getToken(ECMAScriptParser.Package, 0); }
		public TerminalNode Protected() { return getToken(ECMAScriptParser.Protected, 0); }
		public TerminalNode Static() { return getToken(ECMAScriptParser.Static, 0); }
		public TerminalNode Yield() { return getToken(ECMAScriptParser.Yield, 0); }
		public FutureReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futureReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterFutureReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitFutureReservedWord(this);
		}
	}

	public final FutureReservedWordContext futureReservedWord() throws RecognitionException {
		FutureReservedWordContext _localctx = new FutureReservedWordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_futureReservedWord);
		try {
			int _alt;
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(Class);
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(Enum);
				}
				break;
			case Extends:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				match(Extends);
				}
				break;
			case Super:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				match(Super);
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 5);
				{
				setState(671);
				match(Const);
				}
				break;
			case Export:
				enterOuterAlt(_localctx, 6);
				{
				setState(672);
				match(Export);
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 7);
				{
				setState(673);
				match(Import);
				setState(674);
				match(Identifier);
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						match(T__5);
						setState(676);
						match(Identifier);
						}
						} 
					}
					setState(681);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case Implements:
				enterOuterAlt(_localctx, 8);
				{
				setState(682);
				match(Implements);
				}
				break;
			case Let:
				enterOuterAlt(_localctx, 9);
				{
				setState(683);
				match(Let);
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 10);
				{
				setState(684);
				match(Private);
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 11);
				{
				setState(685);
				match(Public);
				}
				break;
			case Interface:
				enterOuterAlt(_localctx, 12);
				{
				setState(686);
				match(Interface);
				}
				break;
			case Package:
				enterOuterAlt(_localctx, 13);
				{
				setState(687);
				match(Package);
				}
				break;
			case Protected:
				enterOuterAlt(_localctx, 14);
				{
				setState(688);
				match(Protected);
				}
				break;
			case Static:
				enterOuterAlt(_localctx, 15);
				{
				setState(689);
				match(Static);
				}
				break;
			case Yield:
				enterOuterAlt(_localctx, 16);
				{
				setState(690);
				match(Yield);
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			if (!(_input.LT(1).getText().equals("get"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"get\")");
			setState(694);
			match(Identifier);
			setState(695);
			propertyName();
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			if (!(_input.LT(1).getText().equals("set"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"set\")");
			setState(698);
			match(Identifier);
			setState(699);
			propertyName();
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_eos);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(704);
				if (!(_input.LT(1).getType() == CloseBrace)) throw new FailedPredicateException(this, "_input.LT(1).getType() == CloseBrace");
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(EOF);
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

	public static class BinOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(ECMAScriptParser.Or, 0); }
		public TerminalNode And() { return getToken(ECMAScriptParser.And, 0); }
		public TerminalNode BitOr() { return getToken(ECMAScriptParser.BitOr, 0); }
		public TerminalNode BitXOr() { return getToken(ECMAScriptParser.BitXOr, 0); }
		public TerminalNode BitAnd() { return getToken(ECMAScriptParser.BitAnd, 0); }
		public TerminalNode Equals() { return getToken(ECMAScriptParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(ECMAScriptParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ECMAScriptParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ECMAScriptParser.IdentityNotEquals, 0); }
		public TerminalNode Minus() { return getToken(ECMAScriptParser.Minus, 0); }
		public TerminalNode LeftShiftArithmetic() { return getToken(ECMAScriptParser.LeftShiftArithmetic, 0); }
		public TerminalNode RightShiftArithmetic() { return getToken(ECMAScriptParser.RightShiftArithmetic, 0); }
		public TerminalNode RightShiftLogical() { return getToken(ECMAScriptParser.RightShiftLogical, 0); }
		public TerminalNode LessThan() { return getToken(ECMAScriptParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ECMAScriptParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ECMAScriptParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ECMAScriptParser.GreaterThanEquals, 0); }
		public TerminalNode Multiply() { return getToken(ECMAScriptParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ECMAScriptParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ECMAScriptParser.Modulus, 0); }
		public TerminalNode Plus() { return getToken(ECMAScriptParser.Plus, 0); }
		public BinOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBinOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBinOperator(this);
		}
	}

	public final BinOperatorContext binOperator() throws RecognitionException {
		BinOperatorContext _localctx = new BinOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_binOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Plus) | (1L << Minus) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return querySnippet_sempred((QuerySnippetContext)_localctx, predIndex);
		case 3:
			return sourceElement_sempred((SourceElementContext)_localctx, predIndex);
		case 4:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 16:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 17:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 18:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 26:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 45:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 53:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 54:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 55:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean querySnippet_sempred(QuerySnippetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(1) != OpenBrace;
		}
		return true;
	}
	private boolean sourceElement_sempred(SourceElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _input.LA(1) != Function;
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LA(1) != OpenBrace;
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 27);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return !here(LineTerminator);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return _input.LT(1).getText().equals("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return _input.LT(1).getText().equals("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return lineTerminatorAhead();
		case 21:
			return _input.LT(1).getType() == CloseBrace;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u02ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\5\2"+
		"y\n\2\3\2\3\2\3\2\5\2~\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0094\n\3\3\4\5\4\u0097\n\4\3"+
		"\4\3\4\5\4\u009b\n\4\3\4\7\4\u009e\n\4\f\4\16\4\u00a1\13\4\3\4\5\4\u00a4"+
		"\n\4\3\5\3\5\3\5\3\5\5\5\u00aa\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7\3\7\7\7\u00c2\n"+
		"\7\f\7\16\7\u00c5\13\7\3\b\3\b\3\b\5\b\u00ca\n\b\3\t\6\t\u00cd\n\t\r\t"+
		"\16\t\u00ce\3\n\3\n\3\n\5\n\u00d4\n\n\3\13\3\13\3\13\7\13\u00d9\n\13\f"+
		"\13\16\13\u00dc\13\13\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\5\17\u00e9\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00f0\n\20\3\20\3"+
		"\20\5\20\u00f4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fd\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0104\n\21\3\21\3\21\3\21\5\21\u0109\n"+
		"\21\3\21\3\21\5\21\u010d\n\21\3\21\3\21\5\21\u0111\n\21\3\21\3\21\5\21"+
		"\u0115\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3\21\3\21\5"+
		"\21\u0121\n\21\3\21\3\21\5\21\u0125\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u012e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138"+
		"\n\21\5\21\u013a\n\21\3\22\3\22\3\22\5\22\u013f\n\22\3\22\5\22\u0142\n"+
		"\22\3\23\3\23\3\23\5\23\u0147\n\23\3\23\5\23\u014a\n\23\3\24\3\24\3\24"+
		"\5\24\u014f\n\24\3\24\5\24\u0152\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0162\n\27\3\27\3\27\5\27"+
		"\u0166\n\27\5\27\u0168\n\27\3\27\3\27\3\30\6\30\u016d\n\30\r\30\16\30"+
		"\u016e\3\31\3\31\3\31\3\31\5\31\u0175\n\31\3\32\3\32\3\32\5\32\u017a\n"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0184\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0193\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019f\n\36\3\37"+
		"\3\37\3\37\3 \3 \5 \u01a6\n \3!\3!\3!\3!\5!\u01ac\n!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\7\"\u01b6\n\"\f\"\16\"\u01b9\13\"\3#\5#\u01bc\n#\3$\3$\5$\u01c0"+
		"\n$\3$\5$\u01c3\n$\3$\5$\u01c6\n$\3$\3$\3%\5%\u01cb\n%\3%\3%\3%\5%\u01d0"+
		"\n%\3%\7%\u01d3\n%\f%\16%\u01d6\13%\3&\6&\u01d9\n&\r&\16&\u01da\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u01e2\n\'\3\'\3\'\5\'\u01e6\n\'\3(\3(\3(\7(\u01eb\n"+
		"(\f(\16(\u01ee\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u0203\n)\3*\3*\3*\3*\3*\5*\u020a\n*\3+\3+\3,\3,\5,\u0210\n,"+
		"\3,\3,\3,\3,\5,\u0216\n,\3-\3-\3-\7-\u021b\n-\f-\16-\u021e\13-\3-\5-\u0221"+
		"\n-\3.\3.\3.\7.\u0226\n.\f.\16.\u0229\13.\3/\3/\3/\5/\u022e\n/\3/\3/\5"+
		"/\u0232\n/\3/\3/\3/\3/\5/\u0238\n/\3/\3/\3/\5/\u023d\n/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u025c\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\5/\u0277\n/\3/\3/\5/\u027b\n/\3/\3/\3/\3/\3/\3"+
		"/\7/\u0283\n/\f/\16/\u0286\13/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u028f\n\61\3\62\3\62\3\63\3\63\5\63\u0295\n\63\3\64\3\64\3\64\5\64\u029a"+
		"\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66"+
		"\u02a8\n\66\f\66\16\66\u02ab\13\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u02b6\n\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\3"+
		"9\59\u02c4\n9\3:\3:\3;\3;\3;\2\3\\<\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\f\4\2\34\34"+
		"tt\4\2\35\35tt\4\2  tt\4\2!!tt\5\2\3\7\30\30\65?\5\2\16\16@Aww\3\2BD\3"+
		"\2@A\3\2E^\5\2\t\r\36\37\"\64\2\u0335\2v\3\2\2\2\4\u0093\3\2\2\2\6\u0096"+
		"\3\2\2\2\b\u00a9\3\2\2\2\n\u00bc\3\2\2\2\f\u00be\3\2\2\2\16\u00c6\3\2"+
		"\2\2\20\u00cc\3\2\2\2\22\u00d0\3\2\2\2\24\u00d5\3\2\2\2\26\u00dd\3\2\2"+
		"\2\30\u00e1\3\2\2\2\32\u00e4\3\2\2\2\34\u00e6\3\2\2\2\36\u00ea\3\2\2\2"+
		" \u0139\3\2\2\2\"\u013b\3\2\2\2$\u0143\3\2\2\2&\u014b\3\2\2\2(\u0153\3"+
		"\2\2\2*\u0159\3\2\2\2,\u015f\3\2\2\2.\u016c\3\2\2\2\60\u0170\3\2\2\2\62"+
		"\u0176\3\2\2\2\64\u017b\3\2\2\2\66\u017f\3\2\2\28\u0192\3\2\2\2:\u019e"+
		"\3\2\2\2<\u01a0\3\2\2\2>\u01a3\3\2\2\2@\u01a7\3\2\2\2B\u01b2\3\2\2\2D"+
		"\u01bb\3\2\2\2F\u01bd\3\2\2\2H\u01ca\3\2\2\2J\u01d8\3\2\2\2L\u01e5\3\2"+
		"\2\2N\u01e7\3\2\2\2P\u0202\3\2\2\2R\u0209\3\2\2\2T\u020b\3\2\2\2V\u0215"+
		"\3\2\2\2X\u0220\3\2\2\2Z\u0222\3\2\2\2\\\u025b\3\2\2\2^\u0287\3\2\2\2"+
		"`\u028e\3\2\2\2b\u0290\3\2\2\2d\u0294\3\2\2\2f\u0299\3\2\2\2h\u029b\3"+
		"\2\2\2j\u02b5\3\2\2\2l\u02b7\3\2\2\2n\u02bb\3\2\2\2p\u02c3\3\2\2\2r\u02c5"+
		"\3\2\2\2t\u02c7\3\2\2\2vx\5\4\3\2wy\7s\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2"+
		"\2z{\7o\2\2{}\5\4\3\2|~\7s\2\2}|\3\2\2\2}~\3\2\2\2~\3\3\2\2\2\177\u0094"+
		"\5\16\b\2\u0080\u0094\5\22\n\2\u0081\u0094\5\32\16\2\u0082\u0083\6\3\2"+
		"\2\u0083\u0094\5\34\17\2\u0084\u0094\5\f\7\2\u0085\u0094\5\36\20\2\u0086"+
		"\u0094\5 \21\2\u0087\u0094\5\"\22\2\u0088\u0094\5$\23\2\u0089\u0094\5"+
		"&\24\2\u008a\u0094\5(\25\2\u008b\u0094\5\64\33\2\u008c\u0094\5*\26\2\u008d"+
		"\u0094\5\66\34\2\u008e\u0094\58\35\2\u008f\u0094\5j\66\2\u0090\u0094\5"+
		"> \2\u0091\u0094\7r\2\2\u0092\u0094\7q\2\2\u0093\177\3\2\2\2\u0093\u0080"+
		"\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0082\3\2\2\2\u0093\u0084\3\2\2\2\u0093"+
		"\u0085\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u0088\3\2"+
		"\2\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093"+
		"\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\5\3\2\2\2\u0095\u0097\7r\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\5\b\5\2\u0099\u009b\7r\2\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009e\5\b\5\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7r\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\7\3\2\2\2\u00a5\u00a6\6\5\3\2"+
		"\u00a6\u00aa\5\n\6\2\u00a7\u00aa\5@!\2\u00a8\u00aa\7r\2\2\u00a9\u00a5"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\t\3\2\2\2\u00ab"+
		"\u00bd\5\16\b\2\u00ac\u00bd\5\22\n\2\u00ad\u00bd\5\32\16\2\u00ae\u00af"+
		"\6\6\4\2\u00af\u00bd\5\34\17\2\u00b0\u00bd\5\36\20\2\u00b1\u00bd\5 \21"+
		"\2\u00b2\u00bd\5\"\22\2\u00b3\u00bd\5$\23\2\u00b4\u00bd\5&\24\2\u00b5"+
		"\u00bd\5(\25\2\u00b6\u00bd\5\64\33\2\u00b7\u00bd\5*\26\2\u00b8\u00bd\5"+
		"\66\34\2\u00b9\u00bd\58\35\2\u00ba\u00bd\5> \2\u00bb\u00bd\7r\2\2\u00bc"+
		"\u00ab\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00ae\3\2"+
		"\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2"+
		"\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\13\3\2\2\2\u00be\u00bf\5\34\17"+
		"\2\u00bf\u00c3\5\34\17\2\u00c0\u00c2\5\34\17\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\r\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c9\5\20\t\2\u00c8\u00ca"+
		"\7\25\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\17\3\2\2\2\u00cb"+
		"\u00cd\5\n\6\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\7L\2\2\u00d1\u00d3"+
		"\5\24\13\2\u00d2\u00d4\7\26\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\23\3\2\2\2\u00d5\u00da\5\26\f\2\u00d6\u00d7\7\27\2\2\u00d7\u00d9"+
		"\5\26\f\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\25\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df"+
		"\7v\2\2\u00de\u00e0\5\30\r\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00e2\7\30\2\2\u00e2\u00e3\5\\/\2\u00e3\31\3\2\2\2\u00e4"+
		"\u00e5\7\26\2\2\u00e5\33\3\2\2\2\u00e6\u00e8\5Z.\2\u00e7\u00e9\7\26\2"+
		"\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\35\3\2\2\2\u00ea\u00eb"+
		"\7Z\2\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\5Z.\2\u00ed\u00ef\7\23\2\2\u00ee"+
		"\u00f0\5\n\6\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00f2\7J\2\2\u00f2\u00f4\5\n\6\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\5\n\6\2"+
		"\u00f7\u00f8\7T\2\2\u00f8\u00f9\7\22\2\2\u00f9\u00fa\5Z.\2\u00fa\u00fc"+
		"\7\23\2\2\u00fb\u00fd\7\26\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u013a\3\2\2\2\u00fe\u00ff\7T\2\2\u00ff\u0100\7\22\2\2\u0100\u0101"+
		"\5Z.\2\u0101\u0103\7\23\2\2\u0102\u0104\5\n\6\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u013a\3\2\2\2\u0105\u0106\7R\2\2\u0106\u0108\7\22"+
		"\2\2\u0107\u0109\5Z.\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\7\26\2\2\u010b\u010d\5Z.\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\26\2\2\u010f\u0111\5"+
		"Z.\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\7\23\2\2\u0113\u0115\5\n\6\2\u0114\u0113\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u013a\3\2\2\2\u0116\u0117\7R\2\2\u0117\u0118\7\22\2\2\u0118"+
		"\u0119\7L\2\2\u0119\u011a\5\24\13\2\u011a\u011c\7\26\2\2\u011b\u011d\5"+
		"Z.\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\7\26\2\2\u011f\u0121\5Z.\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\7\23\2\2\u0123\u0125\5\n\6\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u013a\3\2\2\2\u0126\u0127\7R"+
		"\2\2\u0127\u0128\7\22\2\2\u0128\u0129\5\\/\2\u0129\u012a\7]\2\2\u012a"+
		"\u012b\5Z.\2\u012b\u012d\7\23\2\2\u012c\u012e\5\n\6\2\u012d\u012c\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u013a\3\2\2\2\u012f\u0130\7R\2\2\u0130"+
		"\u0131\7\22\2\2\u0131\u0132\7L\2\2\u0132\u0133\5\26\f\2\u0133\u0134\7"+
		"]\2\2\u0134\u0135\5Z.\2\u0135\u0137\7\23\2\2\u0136\u0138\5\n\6\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u00f5\3\2"+
		"\2\2\u0139\u00fe\3\2\2\2\u0139\u0105\3\2\2\2\u0139\u0116\3\2\2\2\u0139"+
		"\u0126\3\2\2\2\u0139\u012f\3\2\2\2\u013a!\3\2\2\2\u013b\u013e\7Q\2\2\u013c"+
		"\u013d\6\22\5\2\u013d\u013f\7v\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u0142\7\26\2\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142#\3\2\2\2\u0143\u0146\7E\2\2\u0144\u0145\6\23\6\2"+
		"\u0145\u0147\7v\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u014a\7\26\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2"+
		"\u014a%\3\2\2\2\u014b\u014e\7O\2\2\u014c\u014d\6\24\7\2\u014d\u014f\5"+
		"Z.\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0152\7\26\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\'\3\2\2"+
		"\2\u0153\u0154\7X\2\2\u0154\u0155\7\22\2\2\u0155\u0156\5Z.\2\u0156\u0157"+
		"\7\23\2\2\u0157\u0158\5\n\6\2\u0158)\3\2\2\2\u0159\u015a\7S\2\2\u015a"+
		"\u015b\7\22\2\2\u015b\u015c\5Z.\2\u015c\u015d\7\23\2\2\u015d\u015e\5,"+
		"\27\2\u015e+\3\2\2\2\u015f\u0161\7\24\2\2\u0160\u0162\5.\30\2\u0161\u0160"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0167\3\2\2\2\u0163\u0165\5\62\32\2"+
		"\u0164\u0166\5.\30\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\7\25\2\2\u016a-\3\2\2\2\u016b\u016d\5\60\31\2\u016c\u016b\3\2\2"+
		"\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f/"+
		"\3\2\2\2\u0170\u0171\7I\2\2\u0171\u0172\5Z.\2\u0172\u0174\7\32\2\2\u0173"+
		"\u0175\5\20\t\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\61\3\2\2"+
		"\2\u0176\u0177\7Y\2\2\u0177\u0179\7\32\2\2\u0178\u017a\5\20\t\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\63\3\2\2\2\u017b\u017c\7v\2\2"+
		"\u017c\u017d\7\32\2\2\u017d\u017e\5\n\6\2\u017e\65\3\2\2\2\u017f\u0180"+
		"\7[\2\2\u0180\u0181\6\34\b\2\u0181\u0183\5Z.\2\u0182\u0184\7\26\2\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\67\3\2\2\2\u0185\u0186\7^\2\2"+
		"\u0186\u0187\5\16\b\2\u0187\u0188\5:\36\2\u0188\u0193\3\2\2\2\u0189\u018a"+
		"\7^\2\2\u018a\u018b\5\16\b\2\u018b\u018c\5<\37\2\u018c\u0193\3\2\2\2\u018d"+
		"\u018e\7^\2\2\u018e\u018f\5\16\b\2\u018f\u0190\5:\36\2\u0190\u0191\5<"+
		"\37\2\u0191\u0193\3\2\2\2\u0192\u0185\3\2\2\2\u0192\u0189\3\2\2\2\u0192"+
		"\u018d\3\2\2\2\u01939\3\2\2\2\u0194\u0195\7M\2\2\u0195\u0196\7\22\2\2"+
		"\u0196\u0197\7v\2\2\u0197\u0198\7\23\2\2\u0198\u019f\5\16\b\2\u0199\u019a"+
		"\7M\2\2\u019a\u019b\7\22\2\2\u019b\u019c\7r\2\2\u019c\u019d\7\23\2\2\u019d"+
		"\u019f\5\16\b\2\u019e\u0194\3\2\2\2\u019e\u0199\3\2\2\2\u019f;\3\2\2\2"+
		"\u01a0\u01a1\7N\2\2\u01a1\u01a2\5\16\b\2\u01a2=\3\2\2\2\u01a3\u01a5\7"+
		"U\2\2\u01a4\u01a6\7\26\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"?\3\2\2\2\u01a7\u01a8\7V\2\2\u01a8\u01a9\7v\2\2\u01a9\u01ab\7\22\2\2\u01aa"+
		"\u01ac\5B\"\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ae\7\23\2\2\u01ae\u01af\7\24\2\2\u01af\u01b0\5D#\2\u01b0"+
		"\u01b1\7\25\2\2\u01b1A\3\2\2\2\u01b2\u01b7\7v\2\2\u01b3\u01b4\7\27\2\2"+
		"\u01b4\u01b6\7v\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8C\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bc\5\6\4\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcE\3\2\2\2"+
		"\u01bd\u01bf\7\20\2\2\u01be\u01c0\5H%\2\u01bf\u01be\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3\7\27\2\2\u01c2\u01c1\3\2\2\2"+
		"\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5J&\2\u01c5\u01c4"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\21\2\2"+
		"\u01c8G\3\2\2\2\u01c9\u01cb\5J&\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d4\5\\/\2\u01cd\u01cf\7\27\2\2\u01ce"+
		"\u01d0\5J&\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2"+
		"\2\u01d1\u01d3\5\\/\2\u01d2\u01cd\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5I\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01d9\7\27\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3"+
		"\2\2\2\u01da\u01db\3\2\2\2\u01dbK\3\2\2\2\u01dc\u01dd\7\24\2\2\u01dd\u01e6"+
		"\7\25\2\2\u01de\u01df\7\24\2\2\u01df\u01e1\5N(\2\u01e0\u01e2\7\27\2\2"+
		"\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\7\25\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01dc\3\2\2\2\u01e5\u01de\3\2\2\2"+
		"\u01e6M\3\2\2\2\u01e7\u01ec\5P)\2\u01e8\u01e9\7\27\2\2\u01e9\u01eb\5P"+
		")\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01edO\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\5R*\2\u01f0"+
		"\u01f1\7\32\2\2\u01f1\u01f2\5\\/\2\u01f2\u0203\3\2\2\2\u01f3\u01f4\5l"+
		"\67\2\u01f4\u01f5\7\22\2\2\u01f5\u01f6\7\23\2\2\u01f6\u01f7\7\24\2\2\u01f7"+
		"\u01f8\5D#\2\u01f8\u01f9\7\25\2\2\u01f9\u0203\3\2\2\2\u01fa\u01fb\5n8"+
		"\2\u01fb\u01fc\7\22\2\2\u01fc\u01fd\5T+\2\u01fd\u01fe\7\23\2\2\u01fe\u01ff"+
		"\7\24\2\2\u01ff\u0200\5D#\2\u0200\u0201\7\25\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u01ef\3\2\2\2\u0202\u01f3\3\2\2\2\u0202\u01fa\3\2\2\2\u0203Q\3\2\2\2"+
		"\u0204\u020a\5d\63\2\u0205\u020a\7w\2\2\u0206\u020a\7B\2\2\u0207\u020a"+
		"\7C\2\2\u0208\u020a\7D\2\2\u0209\u0204\3\2\2\2\u0209\u0205\3\2\2\2\u0209"+
		"\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020aS\3\2\2\2"+
		"\u020b\u020c\7v\2\2\u020cU\3\2\2\2\u020d\u020f\7\22\2\2\u020e\u0210\5"+
		"X-\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0216\7\23\2\2\u0212\u0213\7\22\2\2\u0213\u0214\7r\2\2\u0214\u0216\7"+
		"\23\2\2\u0215\u020d\3\2\2\2\u0215\u0212\3\2\2\2\u0216W\3\2\2\2\u0217\u021c"+
		"\5\\/\2\u0218\u0219\7\27\2\2\u0219\u021b\5\\/\2\u021a\u0218\3\2\2\2\u021b"+
		"\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0221\3\2"+
		"\2\2\u021e\u021c\3\2\2\2\u021f\u0221\7r\2\2\u0220\u0217\3\2\2\2\u0220"+
		"\u021f\3\2\2\2\u0221Y\3\2\2\2\u0222\u0227\5\\/\2\u0223\u0224\7\27\2\2"+
		"\u0224\u0226\5\\/\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228[\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022b\b/\1\2\u022b\u022d\7V\2\2\u022c\u022e\7v\2\2\u022d\u022c\3\2\2"+
		"\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\7\22\2\2\u0230"+
		"\u0232\5B\"\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\7\23\2\2\u0234\u0235\7\24\2\2\u0235\u0237\5D#\2\u0236"+
		"\u0238\7\25\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u025c\3"+
		"\2\2\2\u0239\u023a\7K\2\2\u023a\u023c\5\\/\2\u023b\u023d\5V,\2\u023c\u023b"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u025c\3\2\2\2\u023e\u023f\7\\\2\2\u023f"+
		"\u025c\5\\/\27\u0240\u0241\7P\2\2\u0241\u025c\5\\/\26\u0242\u0243\7H\2"+
		"\2\u0243\u025c\5\\/\25\u0244\u0245\t\2\2\2\u0245\u025c\5\\/\24\u0246\u0247"+
		"\t\3\2\2\u0247\u025c\5\\/\23\u0248\u0249\7\36\2\2\u0249\u025c\5\\/\22"+
		"\u024a\u024b\7\37\2\2\u024b\u025c\5\\/\21\u024c\u024d\t\4\2\2\u024d\u025c"+
		"\5\\/\20\u024e\u024f\t\5\2\2\u024f\u025c\5\\/\17\u0250\u025c\7p\2\2\u0251"+
		"\u025c\7W\2\2\u0252\u025c\7v\2\2\u0253\u025c\5`\61\2\u0254\u025c\5F$\2"+
		"\u0255\u025c\5L\'\2\u0256\u025c\7r\2\2\u0257\u0258\7\22\2\2\u0258\u0259"+
		"\5Z.\2\u0259\u025a\7\23\2\2\u025a\u025c\3\2\2\2\u025b\u022a\3\2\2\2\u025b"+
		"\u0239\3\2\2\2\u025b\u023e\3\2\2\2\u025b\u0240\3\2\2\2\u025b\u0242\3\2"+
		"\2\2\u025b\u0244\3\2\2\2\u025b\u0246\3\2\2\2\u025b\u0248\3\2\2\2\u025b"+
		"\u024a\3\2\2\2\u025b\u024c\3\2\2\2\u025b\u024e\3\2\2\2\u025b\u0250\3\2"+
		"\2\2\u025b\u0251\3\2\2\2\u025b\u0252\3\2\2\2\u025b\u0253\3\2\2\2\u025b"+
		"\u0254\3\2\2\2\u025b\u0255\3\2\2\2\u025b\u0256\3\2\2\2\u025b\u0257\3\2"+
		"\2\2\u025c\u0284\3\2\2\2\u025d\u025e\f\16\2\2\u025e\u025f\5t;\2\u025f"+
		"\u0260\5\\/\17\u0260\u0283\3\2\2\2\u0261\u0262\f\r\2\2\u0262\u0263\7G"+
		"\2\2\u0263\u0283\5\\/\16\u0264\u0265\f\f\2\2\u0265\u0266\7]\2\2\u0266"+
		"\u0283\5\\/\r\u0267\u0268\f\13\2\2\u0268\u0269\5^\60\2\u0269\u026a\5\\"+
		"/\f\u026a\u0283\3\2\2\2\u026b\u026c\f\35\2\2\u026c\u026d\7\20\2\2\u026d"+
		"\u026e\5Z.\2\u026e\u026f\7\21\2\2\u026f\u0283\3\2\2\2\u0270\u0271\f\34"+
		"\2\2\u0271\u0272\7\33\2\2\u0272\u0283\5d\63\2\u0273\u0274\f\33\2\2\u0274"+
		"\u0276\5V,\2\u0275\u0277\7\24\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027a\5D#\2\u0279\u027b\7\25\2\2\u027a"+
		"\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0283\3\2\2\2\u027c\u027d\f\31"+
		"\2\2\u027d\u027e\6/\21\2\u027e\u0283\t\2\2\2\u027f\u0280\f\30\2\2\u0280"+
		"\u0281\6/\23\2\u0281\u0283\t\3\2\2\u0282\u025d\3\2\2\2\u0282\u0261\3\2"+
		"\2\2\u0282\u0264\3\2\2\2\u0282\u0267\3\2\2\2\u0282\u026b\3\2\2\2\u0282"+
		"\u0270\3\2\2\2\u0282\u0273\3\2\2\2\u0282\u027c\3\2\2\2\u0282\u027f\3\2"+
		"\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"]\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\t\6\2\2\u0288_\3\2\2\2\u0289"+
		"\u028f\t\7\2\2\u028a\u028f\7B\2\2\u028b\u028f\7C\2\2\u028c\u028f\7D\2"+
		"\2\u028d\u028f\7u\2\2\u028e\u0289\3\2\2\2\u028e\u028a\3\2\2\2\u028e\u028b"+
		"\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028fa\3\2\2\2\u0290"+
		"\u0291\t\b\2\2\u0291c\3\2\2\2\u0292\u0295\7v\2\2\u0293\u0295\5f\64\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295e\3\2\2\2\u0296\u029a\5h\65\2"+
		"\u0297\u029a\5j\66\2\u0298\u029a\t\t\2\2\u0299\u0296\3\2\2\2\u0299\u0297"+
		"\3\2\2\2\u0299\u0298\3\2\2\2\u029ag\3\2\2\2\u029b\u029c\t\n\2\2\u029c"+
		"i\3\2\2\2\u029d\u02b6\7_\2\2\u029e\u02b6\7`\2\2\u029f\u02b6\7a\2\2\u02a0"+
		"\u02b6\7b\2\2\u02a1\u02b6\7c\2\2\u02a2\u02b6\7d\2\2\u02a3\u02a4\7e\2\2"+
		"\u02a4\u02a9\7v\2\2\u02a5\u02a6\7\b\2\2\u02a6\u02a8\7v\2\2\u02a7\u02a5"+
		"\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02b6\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02b6\7f\2\2\u02ad\u02b6\7g\2"+
		"\2\u02ae\u02b6\7h\2\2\u02af\u02b6\7i\2\2\u02b0\u02b6\7j\2\2\u02b1\u02b6"+
		"\7k\2\2\u02b2\u02b6\7l\2\2\u02b3\u02b6\7m\2\2\u02b4\u02b6\7n\2\2\u02b5"+
		"\u029d\3\2\2\2\u02b5\u029e\3\2\2\2\u02b5\u029f\3\2\2\2\u02b5\u02a0\3\2"+
		"\2\2\u02b5\u02a1\3\2\2\2\u02b5\u02a2\3\2\2\2\u02b5\u02a3\3\2\2\2\u02b5"+
		"\u02ac\3\2\2\2\u02b5\u02ad\3\2\2\2\u02b5\u02ae\3\2\2\2\u02b5\u02af\3\2"+
		"\2\2\u02b5\u02b0\3\2\2\2\u02b5\u02b1\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6k\3\2\2\2\u02b7\u02b8\6\67\24"+
		"\2\u02b8\u02b9\7v\2\2\u02b9\u02ba\5R*\2\u02bam\3\2\2\2\u02bb\u02bc\68"+
		"\25\2\u02bc\u02bd\7v\2\2\u02bd\u02be\5R*\2\u02beo\3\2\2\2\u02bf\u02c4"+
		"\7\26\2\2\u02c0\u02c4\7\2\2\3\u02c1\u02c4\69\26\2\u02c2\u02c4\69\27\2"+
		"\u02c3\u02bf\3\2\2\2\u02c3\u02c0\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2"+
		"\3\2\2\2\u02c4q\3\2\2\2\u02c5\u02c6\7\2\2\3\u02c6s\3\2\2\2\u02c7\u02c8"+
		"\t\13\2\2\u02c8u\3\2\2\2Sx}\u0093\u0096\u009a\u009f\u00a3\u00a9\u00bc"+
		"\u00c3\u00c9\u00ce\u00d3\u00da\u00df\u00e8\u00ef\u00f3\u00fc\u0103\u0108"+
		"\u010c\u0110\u0114\u011c\u0120\u0124\u012d\u0137\u0139\u013e\u0141\u0146"+
		"\u0149\u014e\u0151\u0161\u0165\u0167\u016e\u0174\u0179\u0183\u0192\u019e"+
		"\u01a5\u01ab\u01b7\u01bb\u01bf\u01c2\u01c5\u01ca\u01cf\u01d4\u01da\u01e1"+
		"\u01e5\u01ec\u0202\u0209\u020f\u0215\u021c\u0220\u0227\u022d\u0231\u0237"+
		"\u023c\u025b\u0276\u027a\u0282\u0284\u028e\u0294\u0299\u02a9\u02b5\u02c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}