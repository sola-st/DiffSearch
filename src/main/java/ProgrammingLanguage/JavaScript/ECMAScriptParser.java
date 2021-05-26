package ProgrammingLanguage.JavaScript;

// Generated from ECMAScript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ECMAScriptParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
            WILDCARD=112, NEWLINE=113, LITERALS=114, Identifier=115, StringLiteral=116,
            WhiteSpaces=117, MultiLineComment=118, SingleLineComment=119, UnexpectedCharacter=120;
    public static final int
            RULE_program = 0, RULE_querySnippet = 1, RULE_sourceElements = 2, RULE_sourceElement = 3,
            RULE_statement = 4, RULE_block = 5, RULE_statementList = 6, RULE_variableStatement = 7,
            RULE_variableDeclarationList = 8, RULE_variableDeclaration = 9, RULE_initialiser = 10,
            RULE_emptyStatement = 11, RULE_expressionStatement = 12, RULE_ifStatement = 13,
            RULE_iterationStatement = 14, RULE_continueStatement = 15, RULE_breakStatement = 16,
            RULE_returnStatement = 17, RULE_withStatement = 18, RULE_switchStatement = 19,
            RULE_caseBlock = 20, RULE_caseClauses = 21, RULE_caseClause = 22, RULE_defaultClause = 23,
            RULE_labelledStatement = 24, RULE_throwStatement = 25, RULE_tryStatement = 26,
            RULE_catchProduction = 27, RULE_finallyProduction = 28, RULE_debuggerStatement = 29,
            RULE_functionDeclaration = 30, RULE_formalParameterList = 31, RULE_functionBody = 32,
            RULE_arrayLiteral = 33, RULE_elementList = 34, RULE_elision = 35, RULE_objectLiteral = 36,
            RULE_propertyNameAndValueList = 37, RULE_propertyAssignment = 38, RULE_propertyName = 39,
            RULE_propertySetParameterList = 40, RULE_arguments = 41, RULE_argumentList = 42,
            RULE_expressionSequence = 43, RULE_singleExpression = 44, RULE_assignmentOperator = 45,
            RULE_literal = 46, RULE_numericLiteral = 47, RULE_identifierName = 48,
            RULE_reservedWord = 49, RULE_keyword = 50, RULE_futureReservedWord = 51,
            RULE_getter = 52, RULE_setter = 53, RULE_eos = 54, RULE_eof = 55, RULE_binOperator = 56;
    public static final String[] ruleNames = {
            "program", "querySnippet", "sourceElements", "sourceElement", "statement",
            "block", "statementList", "variableStatement", "variableDeclarationList",
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

    private static final String[] _LITERAL_NAMES = {
            null, "'OP'", "'OP<0>'", "'OP<1>'", "'OP<2>'", "'OP<3>'", "'from'", "'binOP'",
            "'binOP<0>'", "'binOP<1>'", "'binOP<2>'", "'binOP<3>'", null, null, "'['",
            "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'?'", "':'",
            "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'",
            "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='",
            "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='",
            "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='",
            "'null'", null, null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'",
            "'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'",
            "'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'",
            "'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'",
            "'in'", "'try'", "'class'", "'enum'", "'extends'", "'super'", "'const'",
            "'export'", "'import'", null, null, null, null, null, null, null, null,
            null, "'-->'", null, "'_'", "'<...>'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
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
            "Yield", "QUERY_ARROW", "EXPR", "EMPTY", "WILDCARD", "NEWLINE", "LITERALS",
            "Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", "SingleLineComment",
            "UnexpectedCharacter"
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
                setState(114);
                querySnippet();
                setState(116);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NEWLINE) {
                    {
                        setState(115);
                        match(NEWLINE);
                    }
                }

                setState(118);
                match(QUERY_ARROW);
                setState(119);
                querySnippet();
                setState(121);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NEWLINE) {
                    {
                        setState(120);
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
            setState(142);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(123);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(124);
                    variableStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(125);
                    emptyStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(126);
                    if (!(_input.LA(1) != OpenBrace)) throw new FailedPredicateException(this, "_input.LA(1) != OpenBrace");
                    setState(127);
                    expressionStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(128);
                    ifStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(129);
                    iterationStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(130);
                    continueStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(131);
                    breakStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(132);
                    returnStatement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(133);
                    withStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(134);
                    labelledStatement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(135);
                    switchStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(136);
                    throwStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(137);
                    tryStatement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(138);
                    futureReservedWord();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(139);
                    debuggerStatement();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(140);
                    match(WILDCARD);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(141);
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
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(145);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                    case 1:
                    {
                        setState(144);
                        match(WILDCARD);
                    }
                    break;
                }
                setState(147);
                sourceElement();
                setState(149);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
                    case 1:
                    {
                        setState(148);
                        match(WILDCARD);
                    }
                    break;
                }
                setState(154);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(151);
                                sourceElement();
                            }
                        }
                    }
                    setState(156);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
                }
                setState(158);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==WILDCARD) {
                    {
                        setState(157);
                        match(WILDCARD);
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
            setState(164);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(160);
                    if (!(_input.LA(1) != Function)) throw new FailedPredicateException(this, "_input.LA(1) != Function");
                    setState(161);
                    statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(162);
                    functionDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(163);
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
            setState(183);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(166);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(167);
                    variableStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(168);
                    emptyStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(169);
                    if (!(_input.LA(1) != OpenBrace)) throw new FailedPredicateException(this, "_input.LA(1) != OpenBrace");
                    setState(170);
                    expressionStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(171);
                    ifStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(172);
                    iterationStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(173);
                    continueStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(174);
                    breakStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(175);
                    returnStatement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(176);
                    withStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(177);
                    labelledStatement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(178);
                    switchStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(179);
                    throwStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(180);
                    tryStatement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(181);
                    debuggerStatement();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(182);
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

    public static class BlockContext extends ParserRuleContext {
        public StatementListContext statementList() {
            return getRuleContext(StatementListContext.class,0);
        }
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
        enterRule(_localctx, 10, RULE_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                match(OpenBrace);
                setState(187);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
                    case 1:
                    {
                        setState(186);
                        statementList();
                    }
                    break;
                }
                setState(190);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                    case 1:
                    {
                        setState(189);
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
        enterRule(_localctx, 12, RULE_statementList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(192);
                                statement();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(195);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

    public static class VariableStatementContext extends ParserRuleContext {
        public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
        public VariableDeclarationListContext variableDeclarationList() {
            return getRuleContext(VariableDeclarationListContext.class,0);
        }
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
        enterRule(_localctx, 14, RULE_variableStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                match(Var);
                setState(198);
                variableDeclarationList();
                setState(200);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
                    case 1:
                    {
                        setState(199);
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
        enterRule(_localctx, 16, RULE_variableDeclarationList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                variableDeclaration();
                setState(207);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(203);
                                match(Comma);
                                setState(204);
                                variableDeclaration();
                            }
                        }
                    }
                    setState(209);
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
        enterRule(_localctx, 18, RULE_variableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                match(Identifier);
                setState(212);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
                    case 1:
                    {
                        setState(211);
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
        enterRule(_localctx, 20, RULE_initialiser);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(214);
                match(Assign);
                setState(215);
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
        enterRule(_localctx, 22, RULE_emptyStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
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
        enterRule(_localctx, 24, RULE_expressionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(219);
                expressionSequence();
                setState(221);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
                    case 1:
                    {
                        setState(220);
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        enterRule(_localctx, 26, RULE_ifStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(223);
                match(If);
                setState(224);
                match(OpenParen);
                setState(225);
                expressionSequence();
                setState(226);
                match(CloseParen);
                setState(228);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
                    case 1:
                    {
                        setState(227);
                        statement();
                    }
                    break;
                }
                setState(232);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
                    case 1:
                    {
                        setState(230);
                        match(Else);
                        setState(231);
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
        public VariableDeclarationListContext variableDeclarationList() {
            return getRuleContext(VariableDeclarationListContext.class,0);
        }
        public StatementContext statement() {
            return getRuleContext(StatementContext.class,0);
        }
        public List<ExpressionSequenceContext> expressionSequence() {
            return getRuleContexts(ExpressionSequenceContext.class);
        }
        public ExpressionSequenceContext expressionSequence(int i) {
            return getRuleContext(ExpressionSequenceContext.class,i);
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
        public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class,0);
        }
        public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        public StatementContext statement() {
            return getRuleContext(StatementContext.class,0);
        }
        public List<ExpressionSequenceContext> expressionSequence() {
            return getRuleContexts(ExpressionSequenceContext.class);
        }
        public ExpressionSequenceContext expressionSequence(int i) {
            return getRuleContext(ExpressionSequenceContext.class,i);
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
        public SingleExpressionContext singleExpression() {
            return getRuleContext(SingleExpressionContext.class,0);
        }
        public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        enterRule(_localctx, 28, RULE_iterationStatement);
        int _la;
        try {
            setState(296);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
                case 1:
                    _localctx = new DoStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(234);
                    match(Do);
                    setState(235);
                    statement();
                    setState(236);
                    match(While);
                    setState(237);
                    match(OpenParen);
                    setState(238);
                    expressionSequence();
                    setState(239);
                    match(CloseParen);
                    setState(241);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
                        case 1:
                        {
                            setState(240);
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
                    setState(243);
                    match(While);
                    setState(244);
                    match(OpenParen);
                    setState(245);
                    expressionSequence();
                    setState(246);
                    match(CloseParen);
                    setState(247);
                    statement();
                }
                break;
                case 3:
                    _localctx = new ForStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(249);
                    match(For);
                    setState(250);
                    match(OpenParen);
                    setState(252);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(251);
                            expressionSequence();
                        }
                    }

                    setState(254);
                    match(SemiColon);
                    setState(256);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(255);
                            expressionSequence();
                        }
                    }

                    setState(258);
                    match(SemiColon);
                    setState(260);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(259);
                            expressionSequence();
                        }
                    }

                    setState(262);
                    match(CloseParen);
                    setState(263);
                    statement();
                }
                break;
                case 4:
                    _localctx = new ForVarStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(264);
                    match(For);
                    setState(265);
                    match(OpenParen);
                    setState(266);
                    match(Var);
                    setState(267);
                    variableDeclarationList();
                    setState(268);
                    match(SemiColon);
                    setState(270);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(269);
                            expressionSequence();
                        }
                    }

                    setState(272);
                    match(SemiColon);
                    setState(274);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(273);
                            expressionSequence();
                        }
                    }

                    setState(276);
                    match(CloseParen);
                    setState(277);
                    statement();
                }
                break;
                case 5:
                    _localctx = new ForInStatementContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(279);
                    match(For);
                    setState(280);
                    match(OpenParen);
                    setState(281);
                    singleExpression(0);
                    setState(282);
                    match(In);
                    setState(283);
                    expressionSequence();
                    setState(284);
                    match(CloseParen);
                    setState(285);
                    statement();
                }
                break;
                case 6:
                    _localctx = new ForVarInStatementContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(287);
                    match(For);
                    setState(288);
                    match(OpenParen);
                    setState(289);
                    match(Var);
                    setState(290);
                    variableDeclaration();
                    setState(291);
                    match(In);
                    setState(292);
                    expressionSequence();
                    setState(293);
                    match(CloseParen);
                    setState(294);
                    statement();
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
        enterRule(_localctx, 30, RULE_continueStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(298);
                match(Continue);
                setState(301);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
                    case 1:
                    {
                        setState(299);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(300);
                        match(Identifier);
                    }
                    break;
                }
                setState(304);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
                    case 1:
                    {
                        setState(303);
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
        enterRule(_localctx, 32, RULE_breakStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(306);
                match(Break);
                setState(309);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
                    case 1:
                    {
                        setState(307);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(308);
                        match(Identifier);
                    }
                    break;
                }
                setState(312);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
                    case 1:
                    {
                        setState(311);
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
        enterRule(_localctx, 34, RULE_returnStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(314);
                match(Return);
                setState(317);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
                    case 1:
                    {
                        setState(315);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(316);
                        expressionSequence();
                    }
                    break;
                }
                setState(320);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
                    case 1:
                    {
                        setState(319);
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        enterRule(_localctx, 36, RULE_withStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(322);
                match(With);
                setState(323);
                match(OpenParen);
                setState(324);
                expressionSequence();
                setState(325);
                match(CloseParen);
                setState(326);
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        enterRule(_localctx, 38, RULE_switchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(328);
                match(Switch);
                setState(329);
                match(OpenParen);
                setState(330);
                expressionSequence();
                setState(331);
                match(CloseParen);
                setState(332);
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
        enterRule(_localctx, 40, RULE_caseBlock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
                match(OpenBrace);
                setState(336);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Case) {
                    {
                        setState(335);
                        caseClauses();
                    }
                }

                setState(342);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Default) {
                    {
                        setState(338);
                        defaultClause();
                        setState(340);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Case) {
                            {
                                setState(339);
                                caseClauses();
                            }
                        }

                    }
                }

                setState(344);
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
        enterRule(_localctx, 42, RULE_caseClauses);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(347);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(346);
                            caseClause();
                        }
                    }
                    setState(349);
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
        enterRule(_localctx, 44, RULE_caseClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(351);
                match(Case);
                setState(352);
                expressionSequence();
                setState(353);
                match(Colon);
                setState(355);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
                    case 1:
                    {
                        setState(354);
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
        enterRule(_localctx, 46, RULE_defaultClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(357);
                match(Default);
                setState(358);
                match(Colon);
                setState(360);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
                    case 1:
                    {
                        setState(359);
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
        enterRule(_localctx, 48, RULE_labelledStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(362);
                match(Identifier);
                setState(363);
                match(Colon);
                setState(364);
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
        enterRule(_localctx, 50, RULE_throwStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(366);
                match(Throw);
                setState(367);
                if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                setState(368);
                expressionSequence();
                setState(370);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
                    case 1:
                    {
                        setState(369);
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
        enterRule(_localctx, 52, RULE_tryStatement);
        try {
            setState(385);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(372);
                    match(Try);
                    setState(373);
                    block();
                    setState(374);
                    catchProduction();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(376);
                    match(Try);
                    setState(377);
                    block();
                    setState(378);
                    finallyProduction();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(380);
                    match(Try);
                    setState(381);
                    block();
                    setState(382);
                    catchProduction();
                    setState(383);
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
        public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
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
        enterRule(_localctx, 54, RULE_catchProduction);
        try {
            setState(397);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(387);
                    match(Catch);
                    setState(388);
                    match(OpenParen);
                    setState(389);
                    match(Identifier);
                    setState(390);
                    match(CloseParen);
                    setState(391);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(392);
                    match(Catch);
                    setState(393);
                    match(OpenParen);
                    setState(394);
                    match(WILDCARD);
                    setState(395);
                    match(CloseParen);
                    setState(396);
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
        enterRule(_localctx, 56, RULE_finallyProduction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(399);
                match(Finally);
                setState(400);
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
        enterRule(_localctx, 58, RULE_debuggerStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(402);
                match(Debugger);
                setState(404);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
                    case 1:
                    {
                        setState(403);
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
        public FunctionBodyContext functionBody() {
            return getRuleContext(FunctionBodyContext.class,0);
        }
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
        enterRule(_localctx, 60, RULE_functionDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(406);
                match(Function);
                setState(407);
                match(Identifier);
                setState(408);
                match(OpenParen);
                setState(410);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Identifier) {
                    {
                        setState(409);
                        formalParameterList();
                    }
                }

                setState(412);
                match(CloseParen);
                setState(413);
                match(OpenBrace);
                setState(414);
                functionBody();
                setState(415);
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
        enterRule(_localctx, 62, RULE_formalParameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(417);
                match(Identifier);
                setState(422);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==Comma) {
                    {
                        {
                            setState(418);
                            match(Comma);
                            setState(419);
                            match(Identifier);
                        }
                    }
                    setState(424);
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
        enterRule(_localctx, 64, RULE_functionBody);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
                    case 1:
                    {
                        setState(425);
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
        public ElementListContext elementList() {
            return getRuleContext(ElementListContext.class,0);
        }
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
        enterRule(_localctx, 66, RULE_arrayLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(428);
                match(OpenBracket);
                setState(430);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
                    case 1:
                    {
                        setState(429);
                        elementList();
                    }
                    break;
                }
                setState(433);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
                    case 1:
                    {
                        setState(432);
                        match(Comma);
                    }
                    break;
                }
                setState(436);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Comma) {
                    {
                        setState(435);
                        elision();
                    }
                }

                setState(438);
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
        enterRule(_localctx, 68, RULE_elementList);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(441);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Comma) {
                    {
                        setState(440);
                        elision();
                    }
                }

                setState(443);
                singleExpression(0);
                setState(451);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,49,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(444);
                                match(Comma);
                                setState(446);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==Comma) {
                                    {
                                        setState(445);
                                        elision();
                                    }
                                }

                                setState(448);
                                singleExpression(0);
                            }
                        }
                    }
                    setState(453);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
        enterRule(_localctx, 70, RULE_elision);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(455);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(454);
                            match(Comma);
                        }
                    }
                    setState(457);
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
        public PropertyNameAndValueListContext propertyNameAndValueList() {
            return getRuleContext(PropertyNameAndValueListContext.class,0);
        }
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
        enterRule(_localctx, 72, RULE_objectLiteral);
        int _la;
        try {
            setState(468);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(459);
                    match(OpenBrace);
                    setState(460);
                    match(CloseBrace);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(461);
                    match(OpenBrace);
                    setState(462);
                    propertyNameAndValueList();
                    setState(464);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==Comma) {
                        {
                            setState(463);
                            match(Comma);
                        }
                    }

                    setState(466);
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
        enterRule(_localctx, 74, RULE_propertyNameAndValueList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(470);
                propertyAssignment();
                setState(475);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,53,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(471);
                                match(Comma);
                                setState(472);
                                propertyAssignment();
                            }
                        }
                    }
                    setState(477);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
        public PropertySetParameterListContext propertySetParameterList() {
            return getRuleContext(PropertySetParameterListContext.class,0);
        }
        public FunctionBodyContext functionBody() {
            return getRuleContext(FunctionBodyContext.class,0);
        }
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
        public FunctionBodyContext functionBody() {
            return getRuleContext(FunctionBodyContext.class,0);
        }
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
        enterRule(_localctx, 76, RULE_propertyAssignment);
        try {
            setState(497);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
                case 1:
                    _localctx = new PropertyExpressionAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(478);
                    propertyName();
                    setState(479);
                    match(Colon);
                    setState(480);
                    singleExpression(0);
                }
                break;
                case 2:
                    _localctx = new PropertyGetterContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(482);
                    getter();
                    setState(483);
                    match(OpenParen);
                    setState(484);
                    match(CloseParen);
                    setState(485);
                    match(OpenBrace);
                    setState(486);
                    functionBody();
                    setState(487);
                    match(CloseBrace);
                }
                break;
                case 3:
                    _localctx = new PropertySetterContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(489);
                    setter();
                    setState(490);
                    match(OpenParen);
                    setState(491);
                    propertySetParameterList();
                    setState(492);
                    match(CloseParen);
                    setState(493);
                    match(OpenBrace);
                    setState(494);
                    functionBody();
                    setState(495);
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
        enterRule(_localctx, 78, RULE_propertyName);
        try {
            setState(504);
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
                    setState(499);
                    identifierName();
                }
                break;
                case StringLiteral:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(500);
                    match(StringLiteral);
                }
                break;
                case DecimalLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(501);
                    match(DecimalLiteral);
                }
                break;
                case HexIntegerLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(502);
                    match(HexIntegerLiteral);
                }
                break;
                case OctalIntegerLiteral:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(503);
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
        enterRule(_localctx, 80, RULE_propertySetParameterList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(506);
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
        enterRule(_localctx, 82, RULE_arguments);
        int _la;
        try {
            setState(516);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(508);
                    match(OpenParen);
                    setState(510);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(509);
                            argumentList();
                        }
                    }

                    setState(512);
                    match(CloseParen);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(513);
                    match(OpenParen);
                    setState(514);
                    match(WILDCARD);
                    setState(515);
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
        enterRule(_localctx, 84, RULE_argumentList);
        int _la;
        try {
            setState(527);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(518);
                    singleExpression(0);
                    setState(523);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==Comma) {
                        {
                            {
                                setState(519);
                                match(Comma);
                                setState(520);
                                singleExpression(0);
                            }
                        }
                        setState(525);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(526);
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
        enterRule(_localctx, 86, RULE_expressionSequence);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(529);
                singleExpression(0);
                setState(534);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,60,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(530);
                                match(Comma);
                                setState(531);
                                singleExpression(0);
                            }
                        }
                    }
                    setState(536);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
        public FunctionBodyContext functionBody() {
            return getRuleContext(FunctionBodyContext.class,0);
        }
        public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class,0);
        }
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        public ExpressionSequenceContext expressionSequence() {
            return getRuleContext(ExpressionSequenceContext.class,0);
        }
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
        int _startState = 88;
        enterRecursionRule(_localctx, 88, RULE_singleExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(585);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Function:
                    {
                        _localctx = new FunctionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(538);
                        match(Function);
                        setState(540);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Identifier) {
                            {
                                setState(539);
                                match(Identifier);
                            }
                        }

                        setState(542);
                        match(OpenParen);
                        setState(544);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Identifier) {
                            {
                                setState(543);
                                formalParameterList();
                            }
                        }

                        setState(546);
                        match(CloseParen);
                        setState(547);
                        match(OpenBrace);
                        setState(548);
                        functionBody();
                        setState(549);
                        match(CloseBrace);
                    }
                    break;
                    case New:
                    {
                        _localctx = new NewExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(551);
                        match(New);
                        setState(552);
                        singleExpression(0);
                        setState(554);
                        _errHandler.sync(this);
                        switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
                            case 1:
                            {
                                setState(553);
                                arguments();
                            }
                            break;
                        }
                    }
                    break;
                    case Delete:
                    {
                        _localctx = new DeleteExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(556);
                        match(Delete);
                        setState(557);
                        singleExpression(21);
                    }
                    break;
                    case Void:
                    {
                        _localctx = new VoidExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(558);
                        match(Void);
                        setState(559);
                        singleExpression(20);
                    }
                    break;
                    case Typeof:
                    {
                        _localctx = new TypeofExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(560);
                        match(Typeof);
                        setState(561);
                        singleExpression(19);
                    }
                    break;
                    case PlusPlus:
                    {
                        _localctx = new PreIncrementExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(562);
                        match(PlusPlus);
                        setState(563);
                        singleExpression(18);
                    }
                    break;
                    case MinusMinus:
                    {
                        _localctx = new PreDecreaseExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(564);
                        match(MinusMinus);
                        setState(565);
                        singleExpression(17);
                    }
                    break;
                    case Plus:
                    {
                        _localctx = new UnaryPlusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(566);
                        match(Plus);
                        setState(567);
                        singleExpression(16);
                    }
                    break;
                    case Minus:
                    {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(568);
                        match(Minus);
                        setState(569);
                        singleExpression(15);
                    }
                    break;
                    case BitNot:
                    {
                        _localctx = new BitNotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(570);
                        match(BitNot);
                        setState(571);
                        singleExpression(14);
                    }
                    break;
                    case Not:
                    {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(572);
                        match(Not);
                        setState(573);
                        singleExpression(13);
                    }
                    break;
                    case EXPR:
                    {
                        _localctx = new GeneralExpressionclearContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(574);
                        match(EXPR);
                    }
                    break;
                    case This:
                    {
                        _localctx = new ThisExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(575);
                        match(This);
                    }
                    break;
                    case Identifier:
                    {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(576);
                        match(Identifier);
                    }
                    break;
                    case RegularExpressionLiteral:
                    case NullLiteral:
                    case BooleanLiteral:
                    case DecimalLiteral:
                    case HexIntegerLiteral:
                    case OctalIntegerLiteral:
                    case LITERALS:
                    case StringLiteral:
                    {
                        _localctx = new LiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(577);
                        literal();
                    }
                    break;
                    case OpenBracket:
                    {
                        _localctx = new ArrayLiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(578);
                        arrayLiteral();
                    }
                    break;
                    case OpenBrace:
                    {
                        _localctx = new ObjectLiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(579);
                        objectLiteral();
                    }
                    break;
                    case WILDCARD:
                    {
                        _localctx = new WildcardContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(580);
                        match(WILDCARD);
                    }
                    break;
                    case OpenParen:
                    {
                        _localctx = new ParenthesizedExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(581);
                        match(OpenParen);
                        setState(582);
                        expressionSequence();
                        setState(583);
                        match(CloseParen);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(619);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,66,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(617);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new BinaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(587);
                                    if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(588);
                                    binOperator();
                                    setState(589);
                                    singleExpression(13);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(591);
                                    if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(592);
                                    match(Instanceof);
                                    setState(593);
                                    singleExpression(12);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(594);
                                    if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(595);
                                    match(In);
                                    setState(596);
                                    singleExpression(11);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(597);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(598);
                                    assignmentOperator();
                                    setState(599);
                                    singleExpression(10);
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(601);
                                    if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
                                    setState(602);
                                    match(OpenBracket);
                                    setState(603);
                                    expressionSequence();
                                    setState(604);
                                    match(CloseBracket);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(606);
                                    if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                                    setState(607);
                                    match(Dot);
                                    setState(608);
                                    identifierName();
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(609);
                                    if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(610);
                                    arguments();
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(611);
                                    if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(612);
                                    if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                                    setState(613);
                                    match(PlusPlus);
                                }
                                break;
                                case 9:
                                {
                                    _localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(614);
                                    if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(615);
                                    if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                                    setState(616);
                                    match(MinusMinus);
                                }
                                break;
                            }
                        }
                    }
                    setState(621);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
        enterRule(_localctx, 90, RULE_assignmentOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(622);
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
        enterRule(_localctx, 92, RULE_literal);
        int _la;
        try {
            setState(629);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case RegularExpressionLiteral:
                case NullLiteral:
                case BooleanLiteral:
                case StringLiteral:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(624);
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
                    setState(625);
                    match(DecimalLiteral);
                }
                break;
                case HexIntegerLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(626);
                    match(HexIntegerLiteral);
                }
                break;
                case OctalIntegerLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(627);
                    match(OctalIntegerLiteral);
                }
                break;
                case LITERALS:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(628);
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
        enterRule(_localctx, 94, RULE_numericLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(631);
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
        enterRule(_localctx, 96, RULE_identifierName);
        try {
            setState(635);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(633);
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
                    setState(634);
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
        enterRule(_localctx, 98, RULE_reservedWord);
        int _la;
        try {
            setState(640);
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
                    setState(637);
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
                    setState(638);
                    futureReservedWord();
                }
                break;
                case NullLiteral:
                case BooleanLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(639);
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
        enterRule(_localctx, 100, RULE_keyword);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(642);
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
        enterRule(_localctx, 102, RULE_futureReservedWord);
        try {
            int _alt;
            setState(668);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Class:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(644);
                    match(Class);
                }
                break;
                case Enum:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(645);
                    match(Enum);
                }
                break;
                case Extends:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(646);
                    match(Extends);
                }
                break;
                case Super:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(647);
                    match(Super);
                }
                break;
                case Const:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(648);
                    match(Const);
                }
                break;
                case Export:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(649);
                    match(Export);
                }
                break;
                case Import:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(650);
                    match(Import);
                    setState(651);
                    match(Identifier);
                    setState(656);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,70,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(652);
                                    match(T__5);
                                    setState(653);
                                    match(Identifier);
                                }
                            }
                        }
                        setState(658);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,70,_ctx);
                    }
                }
                break;
                case Implements:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(659);
                    match(Implements);
                }
                break;
                case Let:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(660);
                    match(Let);
                }
                break;
                case Private:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(661);
                    match(Private);
                }
                break;
                case Public:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(662);
                    match(Public);
                }
                break;
                case Interface:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(663);
                    match(Interface);
                }
                break;
                case Package:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(664);
                    match(Package);
                }
                break;
                case Protected:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(665);
                    match(Protected);
                }
                break;
                case Static:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(666);
                    match(Static);
                }
                break;
                case Yield:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(667);
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
        enterRule(_localctx, 104, RULE_getter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(670);
                if (!(_input.LT(1).getText().equals("get"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"get\")");
                setState(671);
                match(Identifier);
                setState(672);
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
        enterRule(_localctx, 106, RULE_setter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(674);
                if (!(_input.LT(1).getText().equals("set"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"set\")");
                setState(675);
                match(Identifier);
                setState(676);
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
        enterRule(_localctx, 108, RULE_eos);
        try {
            setState(682);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(678);
                    match(SemiColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(679);
                    match(EOF);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(680);
                    if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(681);
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
        enterRule(_localctx, 110, RULE_eof);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(684);
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
        enterRule(_localctx, 112, RULE_binOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(686);
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
            case 15:
                return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
            case 16:
                return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
            case 17:
                return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
            case 25:
                return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
            case 44:
                return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
            case 52:
                return getter_sempred((GetterContext)_localctx, predIndex);
            case 53:
                return setter_sempred((SetterContext)_localctx, predIndex);
            case 54:
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\u02b3\4\2\t\2\4"+
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\5\2w\n\2\3"+
                    "\2\3\2\3\2\5\2|\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0091\n\3\3\4\5\4\u0094\n\4\3\4\3\4\5\4"+
                    "\u0098\n\4\3\4\7\4\u009b\n\4\f\4\16\4\u009e\13\4\3\4\5\4\u00a1\n\4\3\5"+
                    "\3\5\3\5\3\5\5\5\u00a7\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
                    "\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ba\n\6\3\7\3\7\5\7\u00be\n\7\3\7\5\7\u00c1"+
                    "\n\7\3\b\6\b\u00c4\n\b\r\b\16\b\u00c5\3\t\3\t\3\t\5\t\u00cb\n\t\3\n\3"+
                    "\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\13\3\13\5\13\u00d7\n\13\3\f"+
                    "\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\17\3\17\3\17\5"+
                    "\17\u00e7\n\17\3\17\3\17\5\17\u00eb\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
                    "\3\20\5\20\u00f4\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
                    "\u00ff\n\20\3\20\3\20\5\20\u0103\n\20\3\20\3\20\5\20\u0107\n\20\3\20\3"+
                    "\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0111\n\20\3\20\3\20\5\20\u0115"+
                    "\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012b\n\20\3\21\3\21\3\21\5\21"+
                    "\u0130\n\21\3\21\5\21\u0133\n\21\3\22\3\22\3\22\5\22\u0138\n\22\3\22\5"+
                    "\22\u013b\n\22\3\23\3\23\3\23\5\23\u0140\n\23\3\23\5\23\u0143\n\23\3\24"+
                    "\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
                    "\u0153\n\26\3\26\3\26\5\26\u0157\n\26\5\26\u0159\n\26\3\26\3\26\3\27\6"+
                    "\27\u015e\n\27\r\27\16\27\u015f\3\30\3\30\3\30\3\30\5\30\u0166\n\30\3"+
                    "\31\3\31\3\31\5\31\u016b\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
                    "\5\33\u0175\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
                    "\3\34\3\34\5\34\u0184\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
                    "\3\35\5\35\u0190\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u0197\n\37\3 \3 \3"+
                    " \3 \5 \u019d\n \3 \3 \3 \3 \3 \3!\3!\3!\7!\u01a7\n!\f!\16!\u01aa\13!"+
                    "\3\"\5\"\u01ad\n\"\3#\3#\5#\u01b1\n#\3#\5#\u01b4\n#\3#\5#\u01b7\n#\3#"+
                    "\3#\3$\5$\u01bc\n$\3$\3$\3$\5$\u01c1\n$\3$\7$\u01c4\n$\f$\16$\u01c7\13"+
                    "$\3%\6%\u01ca\n%\r%\16%\u01cb\3&\3&\3&\3&\3&\5&\u01d3\n&\3&\3&\5&\u01d7"+
                    "\n&\3\'\3\'\3\'\7\'\u01dc\n\'\f\'\16\'\u01df\13\'\3(\3(\3(\3(\3(\3(\3"+
                    "(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01f4\n(\3)\3)\3)\3)\3)\5)\u01fb"+
                    "\n)\3*\3*\3+\3+\5+\u0201\n+\3+\3+\3+\3+\5+\u0207\n+\3,\3,\3,\7,\u020c"+
                    "\n,\f,\16,\u020f\13,\3,\5,\u0212\n,\3-\3-\3-\7-\u0217\n-\f-\16-\u021a"+
                    "\13-\3.\3.\3.\5.\u021f\n.\3.\3.\5.\u0223\n.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
                    ".\u022d\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
                    ".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u024c\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
                    ".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u026c"+
                    "\n.\f.\16.\u026f\13.\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u0278\n\60\3"+
                    "\61\3\61\3\62\3\62\5\62\u027e\n\62\3\63\3\63\3\63\5\63\u0283\n\63\3\64"+
                    "\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0291\n\65"+
                    "\f\65\16\65\u0294\13\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5"+
                    "\65\u029f\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\58"+
                    "\u02ad\n8\39\39\3:\3:\3:\2\3Z;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
                    " \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\b\5\2\3\7\30\30"+
                    "\65?\5\2\16\16@Avv\3\2BD\3\2@A\3\2E^\5\2\t\r\36\37\"\64\2\u0316\2t\3\2"+
                    "\2\2\4\u0090\3\2\2\2\6\u0093\3\2\2\2\b\u00a6\3\2\2\2\n\u00b9\3\2\2\2\f"+
                    "\u00bb\3\2\2\2\16\u00c3\3\2\2\2\20\u00c7\3\2\2\2\22\u00cc\3\2\2\2\24\u00d4"+
                    "\3\2\2\2\26\u00d8\3\2\2\2\30\u00db\3\2\2\2\32\u00dd\3\2\2\2\34\u00e1\3"+
                    "\2\2\2\36\u012a\3\2\2\2 \u012c\3\2\2\2\"\u0134\3\2\2\2$\u013c\3\2\2\2"+
                    "&\u0144\3\2\2\2(\u014a\3\2\2\2*\u0150\3\2\2\2,\u015d\3\2\2\2.\u0161\3"+
                    "\2\2\2\60\u0167\3\2\2\2\62\u016c\3\2\2\2\64\u0170\3\2\2\2\66\u0183\3\2"+
                    "\2\28\u018f\3\2\2\2:\u0191\3\2\2\2<\u0194\3\2\2\2>\u0198\3\2\2\2@\u01a3"+
                    "\3\2\2\2B\u01ac\3\2\2\2D\u01ae\3\2\2\2F\u01bb\3\2\2\2H\u01c9\3\2\2\2J"+
                    "\u01d6\3\2\2\2L\u01d8\3\2\2\2N\u01f3\3\2\2\2P\u01fa\3\2\2\2R\u01fc\3\2"+
                    "\2\2T\u0206\3\2\2\2V\u0211\3\2\2\2X\u0213\3\2\2\2Z\u024b\3\2\2\2\\\u0270"+
                    "\3\2\2\2^\u0277\3\2\2\2`\u0279\3\2\2\2b\u027d\3\2\2\2d\u0282\3\2\2\2f"+
                    "\u0284\3\2\2\2h\u029e\3\2\2\2j\u02a0\3\2\2\2l\u02a4\3\2\2\2n\u02ac\3\2"+
                    "\2\2p\u02ae\3\2\2\2r\u02b0\3\2\2\2tv\5\4\3\2uw\7s\2\2vu\3\2\2\2vw\3\2"+
                    "\2\2wx\3\2\2\2xy\7o\2\2y{\5\4\3\2z|\7s\2\2{z\3\2\2\2{|\3\2\2\2|\3\3\2"+
                    "\2\2}\u0091\5\f\7\2~\u0091\5\20\t\2\177\u0091\5\30\r\2\u0080\u0081\6\3"+
                    "\2\2\u0081\u0091\5\32\16\2\u0082\u0091\5\34\17\2\u0083\u0091\5\36\20\2"+
                    "\u0084\u0091\5 \21\2\u0085\u0091\5\"\22\2\u0086\u0091\5$\23\2\u0087\u0091"+
                    "\5&\24\2\u0088\u0091\5\62\32\2\u0089\u0091\5(\25\2\u008a\u0091\5\64\33"+
                    "\2\u008b\u0091\5\66\34\2\u008c\u0091\5h\65\2\u008d\u0091\5<\37\2\u008e"+
                    "\u0091\7r\2\2\u008f\u0091\7q\2\2\u0090}\3\2\2\2\u0090~\3\2\2\2\u0090\177"+
                    "\3\2\2\2\u0090\u0080\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0083\3\2\2\2\u0090"+
                    "\u0084\3\2\2\2\u0090\u0085\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u0087\3\2"+
                    "\2\2\u0090\u0088\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
                    "\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2"+
                    "\2\2\u0090\u008f\3\2\2\2\u0091\5\3\2\2\2\u0092\u0094\7r\2\2\u0093\u0092"+
                    "\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\5\b\5\2\u0096"+
                    "\u0098\7r\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\3\2"+
                    "\2\2\u0099\u009b\5\b\5\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
                    "\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
                    "\2\2\u009f\u00a1\7r\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
                    "\7\3\2\2\2\u00a2\u00a3\6\5\3\2\u00a3\u00a7\5\n\6\2\u00a4\u00a7\5> \2\u00a5"+
                    "\u00a7\7r\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2"+
                    "\2\2\u00a7\t\3\2\2\2\u00a8\u00ba\5\f\7\2\u00a9\u00ba\5\20\t\2\u00aa\u00ba"+
                    "\5\30\r\2\u00ab\u00ac\6\6\4\2\u00ac\u00ba\5\32\16\2\u00ad\u00ba\5\34\17"+
                    "\2\u00ae\u00ba\5\36\20\2\u00af\u00ba\5 \21\2\u00b0\u00ba\5\"\22\2\u00b1"+
                    "\u00ba\5$\23\2\u00b2\u00ba\5&\24\2\u00b3\u00ba\5\62\32\2\u00b4\u00ba\5"+
                    "(\25\2\u00b5\u00ba\5\64\33\2\u00b6\u00ba\5\66\34\2\u00b7\u00ba\5<\37\2"+
                    "\u00b8\u00ba\7r\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00aa"+
                    "\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9"+
                    "\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2"+
                    "\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
                    "\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\13\3\2\2"+
                    "\2\u00bb\u00bd\7\24\2\2\u00bc\u00be\5\16\b\2\u00bd\u00bc\3\2\2\2\u00bd"+
                    "\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\7\25\2\2\u00c0\u00bf\3"+
                    "\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c4\5\n\6\2\u00c3\u00c2"+
                    "\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
                    "\17\3\2\2\2\u00c7\u00c8\7L\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00cb\7\26\2"+
                    "\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\21\3\2\2\2\u00cc\u00d1"+
                    "\5\24\13\2\u00cd\u00ce\7\27\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00cd\3\2"+
                    "\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
                    "\23\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7u\2\2\u00d5\u00d7\5\26\f"+
                    "\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d9"+
                    "\7\30\2\2\u00d9\u00da\5Z.\2\u00da\27\3\2\2\2\u00db\u00dc\7\26\2\2\u00dc"+
                    "\31\3\2\2\2\u00dd\u00df\5X-\2\u00de\u00e0\7\26\2\2\u00df\u00de\3\2\2\2"+
                    "\u00df\u00e0\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\7Z\2\2\u00e2\u00e3\7"+
                    "\22\2\2\u00e3\u00e4\5X-\2\u00e4\u00e6\7\23\2\2\u00e5\u00e7\5\n\6\2\u00e6"+
                    "\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9\7J"+
                    "\2\2\u00e9\u00eb\5\n\6\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
                    "\35\3\2\2\2\u00ec\u00ed\7F\2\2\u00ed\u00ee\5\n\6\2\u00ee\u00ef\7T\2\2"+
                    "\u00ef\u00f0\7\22\2\2\u00f0\u00f1\5X-\2\u00f1\u00f3\7\23\2\2\u00f2\u00f4"+
                    "\7\26\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u012b\3\2\2\2"+
                    "\u00f5\u00f6\7T\2\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\5X-\2\u00f8\u00f9"+
                    "\7\23\2\2\u00f9\u00fa\5\n\6\2\u00fa\u012b\3\2\2\2\u00fb\u00fc\7R\2\2\u00fc"+
                    "\u00fe\7\22\2\2\u00fd\u00ff\5X-\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2"+
                    "\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7\26\2\2\u0101\u0103\5X-\2\u0102"+
                    "\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7\26"+
                    "\2\2\u0105\u0107\5X-\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
                    "\3\2\2\2\u0108\u0109\7\23\2\2\u0109\u012b\5\n\6\2\u010a\u010b\7R\2\2\u010b"+
                    "\u010c\7\22\2\2\u010c\u010d\7L\2\2\u010d\u010e\5\22\n\2\u010e\u0110\7"+
                    "\26\2\2\u010f\u0111\5X-\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
                    "\u0112\3\2\2\2\u0112\u0114\7\26\2\2\u0113\u0115\5X-\2\u0114\u0113\3\2"+
                    "\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\23\2\2\u0117"+
                    "\u0118\5\n\6\2\u0118\u012b\3\2\2\2\u0119\u011a\7R\2\2\u011a\u011b\7\22"+
                    "\2\2\u011b\u011c\5Z.\2\u011c\u011d\7]\2\2\u011d\u011e\5X-\2\u011e\u011f"+
                    "\7\23\2\2\u011f\u0120\5\n\6\2\u0120\u012b\3\2\2\2\u0121\u0122\7R\2\2\u0122"+
                    "\u0123\7\22\2\2\u0123\u0124\7L\2\2\u0124\u0125\5\24\13\2\u0125\u0126\7"+
                    "]\2\2\u0126\u0127\5X-\2\u0127\u0128\7\23\2\2\u0128\u0129\5\n\6\2\u0129"+
                    "\u012b\3\2\2\2\u012a\u00ec\3\2\2\2\u012a\u00f5\3\2\2\2\u012a\u00fb\3\2"+
                    "\2\2\u012a\u010a\3\2\2\2\u012a\u0119\3\2\2\2\u012a\u0121\3\2\2\2\u012b"+
                    "\37\3\2\2\2\u012c\u012f\7Q\2\2\u012d\u012e\6\21\5\2\u012e\u0130\7u\2\2"+
                    "\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133"+
                    "\7\26\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133!\3\2\2\2\u0134"+
                    "\u0137\7E\2\2\u0135\u0136\6\22\6\2\u0136\u0138\7u\2\2\u0137\u0135\3\2"+
                    "\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\7\26\2\2\u013a"+
                    "\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b#\3\2\2\2\u013c\u013f\7O\2\2\u013d"+
                    "\u013e\6\23\7\2\u013e\u0140\5X-\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
                    "\2\2\u0140\u0142\3\2\2\2\u0141\u0143\7\26\2\2\u0142\u0141\3\2\2\2\u0142"+
                    "\u0143\3\2\2\2\u0143%\3\2\2\2\u0144\u0145\7X\2\2\u0145\u0146\7\22\2\2"+
                    "\u0146\u0147\5X-\2\u0147\u0148\7\23\2\2\u0148\u0149\5\n\6\2\u0149\'\3"+
                    "\2\2\2\u014a\u014b\7S\2\2\u014b\u014c\7\22\2\2\u014c\u014d\5X-\2\u014d"+
                    "\u014e\7\23\2\2\u014e\u014f\5*\26\2\u014f)\3\2\2\2\u0150\u0152\7\24\2"+
                    "\2\u0151\u0153\5,\27\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0158"+
                    "\3\2\2\2\u0154\u0156\5\60\31\2\u0155\u0157\5,\27\2\u0156\u0155\3\2\2\2"+
                    "\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0159"+
                    "\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\25\2\2\u015b+\3\2\2\2\u015c"+
                    "\u015e\5.\30\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2"+
                    "\2\2\u015f\u0160\3\2\2\2\u0160-\3\2\2\2\u0161\u0162\7I\2\2\u0162\u0163"+
                    "\5X-\2\u0163\u0165\7\32\2\2\u0164\u0166\5\16\b\2\u0165\u0164\3\2\2\2\u0165"+
                    "\u0166\3\2\2\2\u0166/\3\2\2\2\u0167\u0168\7Y\2\2\u0168\u016a\7\32\2\2"+
                    "\u0169\u016b\5\16\b\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\61"+
                    "\3\2\2\2\u016c\u016d\7u\2\2\u016d\u016e\7\32\2\2\u016e\u016f\5\n\6\2\u016f"+
                    "\63\3\2\2\2\u0170\u0171\7[\2\2\u0171\u0172\6\33\b\2\u0172\u0174\5X-\2"+
                    "\u0173\u0175\7\26\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\65"+
                    "\3\2\2\2\u0176\u0177\7^\2\2\u0177\u0178\5\f\7\2\u0178\u0179\58\35\2\u0179"+
                    "\u0184\3\2\2\2\u017a\u017b\7^\2\2\u017b\u017c\5\f\7\2\u017c\u017d\5:\36"+
                    "\2\u017d\u0184\3\2\2\2\u017e\u017f\7^\2\2\u017f\u0180\5\f\7\2\u0180\u0181"+
                    "\58\35\2\u0181\u0182\5:\36\2\u0182\u0184\3\2\2\2\u0183\u0176\3\2\2\2\u0183"+
                    "\u017a\3\2\2\2\u0183\u017e\3\2\2\2\u0184\67\3\2\2\2\u0185\u0186\7M\2\2"+
                    "\u0186\u0187\7\22\2\2\u0187\u0188\7u\2\2\u0188\u0189\7\23\2\2\u0189\u0190"+
                    "\5\f\7\2\u018a\u018b\7M\2\2\u018b\u018c\7\22\2\2\u018c\u018d\7r\2\2\u018d"+
                    "\u018e\7\23\2\2\u018e\u0190\5\f\7\2\u018f\u0185\3\2\2\2\u018f\u018a\3"+
                    "\2\2\2\u01909\3\2\2\2\u0191\u0192\7N\2\2\u0192\u0193\5\f\7\2\u0193;\3"+
                    "\2\2\2\u0194\u0196\7U\2\2\u0195\u0197\7\26\2\2\u0196\u0195\3\2\2\2\u0196"+
                    "\u0197\3\2\2\2\u0197=\3\2\2\2\u0198\u0199\7V\2\2\u0199\u019a\7u\2\2\u019a"+
                    "\u019c\7\22\2\2\u019b\u019d\5@!\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2"+
                    "\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\23\2\2\u019f\u01a0\7\24\2\2\u01a0"+
                    "\u01a1\5B\"\2\u01a1\u01a2\7\25\2\2\u01a2?\3\2\2\2\u01a3\u01a8\7u\2\2\u01a4"+
                    "\u01a5\7\27\2\2\u01a5\u01a7\7u\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2"+
                    "\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9A\3\2\2\2\u01aa\u01a8"+
                    "\3\2\2\2\u01ab\u01ad\5\6\4\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
                    "C\3\2\2\2\u01ae\u01b0\7\20\2\2\u01af\u01b1\5F$\2\u01b0\u01af\3\2\2\2\u01b0"+
                    "\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\7\27\2\2\u01b3\u01b2\3"+
                    "\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b7\5H%\2\u01b6"+
                    "\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7\21"+
                    "\2\2\u01b9E\3\2\2\2\u01ba\u01bc\5H%\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc"+
                    "\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c5\5Z.\2\u01be\u01c0\7\27\2\2\u01bf"+
                    "\u01c1\5H%\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2"+
                    "\2\u01c2\u01c4\5Z.\2\u01c3\u01be\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
                    "\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6G\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
                    "\u01ca\7\27\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3"+
                    "\2\2\2\u01cb\u01cc\3\2\2\2\u01ccI\3\2\2\2\u01cd\u01ce\7\24\2\2\u01ce\u01d7"+
                    "\7\25\2\2\u01cf\u01d0\7\24\2\2\u01d0\u01d2\5L\'\2\u01d1\u01d3\7\27\2\2"+
                    "\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
                    "\7\25\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d6\u01cf\3\2\2\2"+
                    "\u01d7K\3\2\2\2\u01d8\u01dd\5N(\2\u01d9\u01da\7\27\2\2\u01da\u01dc\5N"+
                    "(\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
                    "\u01de\3\2\2\2\u01deM\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\5P)\2\u01e1"+
                    "\u01e2\7\32\2\2\u01e2\u01e3\5Z.\2\u01e3\u01f4\3\2\2\2\u01e4\u01e5\5j\66"+
                    "\2\u01e5\u01e6\7\22\2\2\u01e6\u01e7\7\23\2\2\u01e7\u01e8\7\24\2\2\u01e8"+
                    "\u01e9\5B\"\2\u01e9\u01ea\7\25\2\2\u01ea\u01f4\3\2\2\2\u01eb\u01ec\5l"+
                    "\67\2\u01ec\u01ed\7\22\2\2\u01ed\u01ee\5R*\2\u01ee\u01ef\7\23\2\2\u01ef"+
                    "\u01f0\7\24\2\2\u01f0\u01f1\5B\"\2\u01f1\u01f2\7\25\2\2\u01f2\u01f4\3"+
                    "\2\2\2\u01f3\u01e0\3\2\2\2\u01f3\u01e4\3\2\2\2\u01f3\u01eb\3\2\2\2\u01f4"+
                    "O\3\2\2\2\u01f5\u01fb\5b\62\2\u01f6\u01fb\7v\2\2\u01f7\u01fb\7B\2\2\u01f8"+
                    "\u01fb\7C\2\2\u01f9\u01fb\7D\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f6\3\2\2"+
                    "\2\u01fa\u01f7\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbQ"+
                    "\3\2\2\2\u01fc\u01fd\7u\2\2\u01fdS\3\2\2\2\u01fe\u0200\7\22\2\2\u01ff"+
                    "\u0201\5V,\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2"+
                    "\2\u0202\u0207\7\23\2\2\u0203\u0204\7\22\2\2\u0204\u0205\7r\2\2\u0205"+
                    "\u0207\7\23\2\2\u0206\u01fe\3\2\2\2\u0206\u0203\3\2\2\2\u0207U\3\2\2\2"+
                    "\u0208\u020d\5Z.\2\u0209\u020a\7\27\2\2\u020a\u020c\5Z.\2\u020b\u0209"+
                    "\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
                    "\u0212\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\7r\2\2\u0211\u0208\3\2"+
                    "\2\2\u0211\u0210\3\2\2\2\u0212W\3\2\2\2\u0213\u0218\5Z.\2\u0214\u0215"+
                    "\7\27\2\2\u0215\u0217\5Z.\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
                    "\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219Y\3\2\2\2\u021a\u0218\3\2\2\2"+
                    "\u021b\u021c\b.\1\2\u021c\u021e\7V\2\2\u021d\u021f\7u\2\2\u021e\u021d"+
                    "\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\7\22\2\2"+
                    "\u0221\u0223\5@!\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224"+
                    "\3\2\2\2\u0224\u0225\7\23\2\2\u0225\u0226\7\24\2\2\u0226\u0227\5B\"\2"+
                    "\u0227\u0228\7\25\2\2\u0228\u024c\3\2\2\2\u0229\u022a\7K\2\2\u022a\u022c"+
                    "\5Z.\2\u022b\u022d\5T+\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
                    "\u024c\3\2\2\2\u022e\u022f\7\\\2\2\u022f\u024c\5Z.\27\u0230\u0231\7P\2"+
                    "\2\u0231\u024c\5Z.\26\u0232\u0233\7H\2\2\u0233\u024c\5Z.\25\u0234\u0235"+
                    "\7\34\2\2\u0235\u024c\5Z.\24\u0236\u0237\7\35\2\2\u0237\u024c\5Z.\23\u0238"+
                    "\u0239\7\36\2\2\u0239\u024c\5Z.\22\u023a\u023b\7\37\2\2\u023b\u024c\5"+
                    "Z.\21\u023c\u023d\7 \2\2\u023d\u024c\5Z.\20\u023e\u023f\7!\2\2\u023f\u024c"+
                    "\5Z.\17\u0240\u024c\7p\2\2\u0241\u024c\7W\2\2\u0242\u024c\7u\2\2\u0243"+
                    "\u024c\5^\60\2\u0244\u024c\5D#\2\u0245\u024c\5J&\2\u0246\u024c\7r\2\2"+
                    "\u0247\u0248\7\22\2\2\u0248\u0249\5X-\2\u0249\u024a\7\23\2\2\u024a\u024c"+
                    "\3\2\2\2\u024b\u021b\3\2\2\2\u024b\u0229\3\2\2\2\u024b\u022e\3\2\2\2\u024b"+
                    "\u0230\3\2\2\2\u024b\u0232\3\2\2\2\u024b\u0234\3\2\2\2\u024b\u0236\3\2"+
                    "\2\2\u024b\u0238\3\2\2\2\u024b\u023a\3\2\2\2\u024b\u023c\3\2\2\2\u024b"+
                    "\u023e\3\2\2\2\u024b\u0240\3\2\2\2\u024b\u0241\3\2\2\2\u024b\u0242\3\2"+
                    "\2\2\u024b\u0243\3\2\2\2\u024b\u0244\3\2\2\2\u024b\u0245\3\2\2\2\u024b"+
                    "\u0246\3\2\2\2\u024b\u0247\3\2\2\2\u024c\u026d\3\2\2\2\u024d\u024e\f\16"+
                    "\2\2\u024e\u024f\5r:\2\u024f\u0250\5Z.\17\u0250\u026c\3\2\2\2\u0251\u0252"+
                    "\f\r\2\2\u0252\u0253\7G\2\2\u0253\u026c\5Z.\16\u0254\u0255\f\f\2\2\u0255"+
                    "\u0256\7]\2\2\u0256\u026c\5Z.\r\u0257\u0258\f\13\2\2\u0258\u0259\5\\/"+
                    "\2\u0259\u025a\5Z.\f\u025a\u026c\3\2\2\2\u025b\u025c\f\35\2\2\u025c\u025d"+
                    "\7\20\2\2\u025d\u025e\5X-\2\u025e\u025f\7\21\2\2\u025f\u026c\3\2\2\2\u0260"+
                    "\u0261\f\34\2\2\u0261\u0262\7\33\2\2\u0262\u026c\5b\62\2\u0263\u0264\f"+
                    "\33\2\2\u0264\u026c\5T+\2\u0265\u0266\f\31\2\2\u0266\u0267\6.\21\2\u0267"+
                    "\u026c\7\34\2\2\u0268\u0269\f\30\2\2\u0269\u026a\6.\23\2\u026a\u026c\7"+
                    "\35\2\2\u026b\u024d\3\2\2\2\u026b\u0251\3\2\2\2\u026b\u0254\3\2\2\2\u026b"+
                    "\u0257\3\2\2\2\u026b\u025b\3\2\2\2\u026b\u0260\3\2\2\2\u026b\u0263\3\2"+
                    "\2\2\u026b\u0265\3\2\2\2\u026b\u0268\3\2\2\2\u026c\u026f\3\2\2\2\u026d"+
                    "\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e[\3\2\2\2\u026f\u026d\3\2\2\2"+
                    "\u0270\u0271\t\2\2\2\u0271]\3\2\2\2\u0272\u0278\t\3\2\2\u0273\u0278\7"+
                    "B\2\2\u0274\u0278\7C\2\2\u0275\u0278\7D\2\2\u0276\u0278\7t\2\2\u0277\u0272"+
                    "\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0274\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
                    "\u0276\3\2\2\2\u0278_\3\2\2\2\u0279\u027a\t\4\2\2\u027aa\3\2\2\2\u027b"+
                    "\u027e\7u\2\2\u027c\u027e\5d\63\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2"+
                    "\2\2\u027ec\3\2\2\2\u027f\u0283\5f\64\2\u0280\u0283\5h\65\2\u0281\u0283"+
                    "\t\5\2\2\u0282\u027f\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283"+
                    "e\3\2\2\2\u0284\u0285\t\6\2\2\u0285g\3\2\2\2\u0286\u029f\7_\2\2\u0287"+
                    "\u029f\7`\2\2\u0288\u029f\7a\2\2\u0289\u029f\7b\2\2\u028a\u029f\7c\2\2"+
                    "\u028b\u029f\7d\2\2\u028c\u028d\7e\2\2\u028d\u0292\7u\2\2\u028e\u028f"+
                    "\7\b\2\2\u028f\u0291\7u\2\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
                    "\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029f\3\2\2\2\u0294\u0292\3\2"+
                    "\2\2\u0295\u029f\7f\2\2\u0296\u029f\7g\2\2\u0297\u029f\7h\2\2\u0298\u029f"+
                    "\7i\2\2\u0299\u029f\7j\2\2\u029a\u029f\7k\2\2\u029b\u029f\7l\2\2\u029c"+
                    "\u029f\7m\2\2\u029d\u029f\7n\2\2\u029e\u0286\3\2\2\2\u029e\u0287\3\2\2"+
                    "\2\u029e\u0288\3\2\2\2\u029e\u0289\3\2\2\2\u029e\u028a\3\2\2\2\u029e\u028b"+
                    "\3\2\2\2\u029e\u028c\3\2\2\2\u029e\u0295\3\2\2\2\u029e\u0296\3\2\2\2\u029e"+
                    "\u0297\3\2\2\2\u029e\u0298\3\2\2\2\u029e\u0299\3\2\2\2\u029e\u029a\3\2"+
                    "\2\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f"+
                    "i\3\2\2\2\u02a0\u02a1\6\66\24\2\u02a1\u02a2\7u\2\2\u02a2\u02a3\5P)\2\u02a3"+
                    "k\3\2\2\2\u02a4\u02a5\6\67\25\2\u02a5\u02a6\7u\2\2\u02a6\u02a7\5P)\2\u02a7"+
                    "m\3\2\2\2\u02a8\u02ad\7\26\2\2\u02a9\u02ad\7\2\2\3\u02aa\u02ad\68\26\2"+
                    "\u02ab\u02ad\68\27\2\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa"+
                    "\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ado\3\2\2\2\u02ae\u02af\7\2\2\3\u02af"+
                    "q\3\2\2\2\u02b0\u02b1\t\7\2\2\u02b1s\3\2\2\2Kv{\u0090\u0093\u0097\u009c"+
                    "\u00a0\u00a6\u00b9\u00bd\u00c0\u00c5\u00ca\u00d1\u00d6\u00df\u00e6\u00ea"+
                    "\u00f3\u00fe\u0102\u0106\u0110\u0114\u012a\u012f\u0132\u0137\u013a\u013f"+
                    "\u0142\u0152\u0156\u0158\u015f\u0165\u016a\u0174\u0183\u018f\u0196\u019c"+
                    "\u01a8\u01ac\u01b0\u01b3\u01b6\u01bb\u01c0\u01c5\u01cb\u01d2\u01d6\u01dd"+
                    "\u01f3\u01fa\u0200\u0206\u020d\u0211\u0218\u021e\u0222\u022c\u024b\u026b"+
                    "\u026d\u0277\u027d\u0282\u0292\u029e\u02ac";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}