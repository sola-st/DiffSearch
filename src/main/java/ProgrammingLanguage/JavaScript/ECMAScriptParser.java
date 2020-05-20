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
            Protected=106, Static=107, Yield=108, EXPR=109, EMPTY=110, WILDCARD=111,
            NEWLINE=112, LITERALS=113, Identifier=114, StringLiteral=115, WhiteSpaces=116,
            MultiLineComment=117, SingleLineComment=118, UnexpectedCharacter=119;
    public static final int
            RULE_program = 0, RULE_sourceElements = 1, RULE_sourceElement = 2, RULE_statement = 3,
            RULE_block = 4, RULE_statementList = 5, RULE_variableStatement = 6, RULE_variableDeclarationList = 7,
            RULE_variableDeclaration = 8, RULE_initialiser = 9, RULE_emptyStatement = 10,
            RULE_expressionStatement = 11, RULE_ifStatement = 12, RULE_iterationStatement = 13,
            RULE_continueStatement = 14, RULE_breakStatement = 15, RULE_returnStatement = 16,
            RULE_withStatement = 17, RULE_switchStatement = 18, RULE_caseBlock = 19,
            RULE_caseClauses = 20, RULE_caseClause = 21, RULE_defaultClause = 22,
            RULE_labelledStatement = 23, RULE_throwStatement = 24, RULE_tryStatement = 25,
            RULE_catchProduction = 26, RULE_finallyProduction = 27, RULE_debuggerStatement = 28,
            RULE_functionDeclaration = 29, RULE_formalParameterList = 30, RULE_functionBody = 31,
            RULE_arrayLiteral = 32, RULE_elementList = 33, RULE_elision = 34, RULE_objectLiteral = 35,
            RULE_propertyNameAndValueList = 36, RULE_propertyAssignment = 37, RULE_propertyName = 38,
            RULE_propertySetParameterList = 39, RULE_arguments = 40, RULE_argumentList = 41,
            RULE_expressionSequence = 42, RULE_singleExpression = 43, RULE_assignmentOperator = 44,
            RULE_literal = 45, RULE_numericLiteral = 46, RULE_identifierName = 47,
            RULE_reservedWord = 48, RULE_keyword = 49, RULE_futureReservedWord = 50,
            RULE_getter = 51, RULE_setter = 52, RULE_eos = 53, RULE_eof = 54, RULE_binOperator = 55;
    public static final String[] ruleNames = {
            "program", "sourceElements", "sourceElement", "statement", "block", "statementList",
            "variableStatement", "variableDeclarationList", "variableDeclaration",
            "initialiser", "emptyStatement", "expressionStatement", "ifStatement",
            "iterationStatement", "continueStatement", "breakStatement", "returnStatement",
            "withStatement", "switchStatement", "caseBlock", "caseClauses", "caseClause",
            "defaultClause", "labelledStatement", "throwStatement", "tryStatement",
            "catchProduction", "finallyProduction", "debuggerStatement", "functionDeclaration",
            "formalParameterList", "functionBody", "arrayLiteral", "elementList",
            "elision", "objectLiteral", "propertyNameAndValueList", "propertyAssignment",
            "propertyName", "propertySetParameterList", "arguments", "argumentList",
            "expressionSequence", "singleExpression", "assignmentOperator", "literal",
            "numericLiteral", "identifierName", "reservedWord", "keyword", "futureReservedWord",
            "getter", "setter", "eos", "eof", "binOperator"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'->'", "'OP'", "'OP<0>'", "'OP<1>'", "'OP<2>'", "'OP<3>'", "'binOP'",
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
            null, null, "'_'", "'<...>'"
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
            "Yield", "EXPR", "EMPTY", "WILDCARD", "NEWLINE", "LITERALS", "Identifier",
            "StringLiteral", "WhiteSpaces", "MultiLineComment", "SingleLineComment",
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
        public List<SourceElementsContext> sourceElements() {
            return getRuleContexts(SourceElementsContext.class);
        }
        public SourceElementsContext sourceElements(int i) {
            return getRuleContext(SourceElementsContext.class,i);
        }
        public List<TerminalNode> NEWLINE() { return getTokens(ECMAScriptParser.NEWLINE); }
        public TerminalNode NEWLINE(int i) {
            return getToken(ECMAScriptParser.NEWLINE, i);
        }
        public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
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
                setState(112);
                sourceElements();
                setState(117);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==NEWLINE) {
                    {
                        {
                            setState(113);
                            match(NEWLINE);
                            setState(114);
                            sourceElements();
                        }
                    }
                    setState(119);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(120);
                match(T__0);
                setState(121);
                sourceElements();
                setState(126);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==NEWLINE) {
                    {
                        {
                            setState(122);
                            match(NEWLINE);
                            setState(123);
                            sourceElements();
                        }
                    }
                    setState(128);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(130);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
                    case 1:
                    {
                        setState(129);
                        match(EOF);
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

    public static class SourceElementsContext extends ParserRuleContext {
        public List<SourceElementContext> sourceElement() {
            return getRuleContexts(SourceElementContext.class);
        }
        public SourceElementContext sourceElement(int i) {
            return getRuleContext(SourceElementContext.class,i);
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
        enterRule(_localctx, 2, RULE_sourceElements);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(133);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(132);
                                sourceElement();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(135);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

    public static class SourceElementContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class,0);
        }
        public FunctionDeclarationContext functionDeclaration() {
            return getRuleContext(FunctionDeclarationContext.class,0);
        }
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
        enterRule(_localctx, 4, RULE_sourceElement);
        try {
            setState(140);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(137);
                    if (!(_input.LA(1) != Function)) throw new FailedPredicateException(this, "_input.LA(1) != Function");
                    setState(138);
                    statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(139);
                    functionDeclaration();
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
        enterRule(_localctx, 6, RULE_statement);
        try {
            setState(158);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(142);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(143);
                    variableStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(144);
                    emptyStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(145);
                    if (!(_input.LA(1) != OpenBrace)) throw new FailedPredicateException(this, "_input.LA(1) != OpenBrace");
                    setState(146);
                    expressionStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(147);
                    ifStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(148);
                    iterationStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(149);
                    continueStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(150);
                    breakStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(151);
                    returnStatement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(152);
                    withStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(153);
                    labelledStatement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(154);
                    switchStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(155);
                    throwStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(156);
                    tryStatement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(157);
                    debuggerStatement();
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
        enterRule(_localctx, 8, RULE_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(160);
                match(OpenBrace);
                setState(162);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                    case 1:
                    {
                        setState(161);
                        statementList();
                    }
                    break;
                }
                setState(165);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                    case 1:
                    {
                        setState(164);
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
        enterRule(_localctx, 10, RULE_statementList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(168);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(167);
                                statement();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(170);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
        enterRule(_localctx, 12, RULE_variableStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(172);
                match(Var);
                setState(173);
                variableDeclarationList();
                setState(175);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
                    case 1:
                    {
                        setState(174);
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
        enterRule(_localctx, 14, RULE_variableDeclarationList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                variableDeclaration();
                setState(182);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(178);
                                match(Comma);
                                setState(179);
                                variableDeclaration();
                            }
                        }
                    }
                    setState(184);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
        enterRule(_localctx, 16, RULE_variableDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                match(Identifier);
                setState(187);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
                    case 1:
                    {
                        setState(186);
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
        enterRule(_localctx, 18, RULE_initialiser);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                match(Assign);
                setState(190);
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
        enterRule(_localctx, 20, RULE_emptyStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(192);
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
        enterRule(_localctx, 22, RULE_expressionStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                expressionSequence();
                setState(196);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
                    case 1:
                    {
                        setState(195);
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
        enterRule(_localctx, 24, RULE_ifStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(If);
                setState(199);
                match(OpenParen);
                setState(200);
                expressionSequence();
                setState(201);
                match(CloseParen);
                setState(203);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
                    case 1:
                    {
                        setState(202);
                        statement();
                    }
                    break;
                }
                setState(207);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
                    case 1:
                    {
                        setState(205);
                        match(Else);
                        setState(206);
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
        enterRule(_localctx, 26, RULE_iterationStatement);
        int _la;
        try {
            setState(271);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
                case 1:
                    _localctx = new DoStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(209);
                    match(Do);
                    setState(210);
                    statement();
                    setState(211);
                    match(While);
                    setState(212);
                    match(OpenParen);
                    setState(213);
                    expressionSequence();
                    setState(214);
                    match(CloseParen);
                    setState(216);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
                        case 1:
                        {
                            setState(215);
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
                    setState(218);
                    match(While);
                    setState(219);
                    match(OpenParen);
                    setState(220);
                    expressionSequence();
                    setState(221);
                    match(CloseParen);
                    setState(222);
                    statement();
                }
                break;
                case 3:
                    _localctx = new ForStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(224);
                    match(For);
                    setState(225);
                    match(OpenParen);
                    setState(227);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(226);
                            expressionSequence();
                        }
                    }

                    setState(229);
                    match(SemiColon);
                    setState(231);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(230);
                            expressionSequence();
                        }
                    }

                    setState(233);
                    match(SemiColon);
                    setState(235);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(234);
                            expressionSequence();
                        }
                    }

                    setState(237);
                    match(CloseParen);
                    setState(238);
                    statement();
                }
                break;
                case 4:
                    _localctx = new ForVarStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(239);
                    match(For);
                    setState(240);
                    match(OpenParen);
                    setState(241);
                    match(Var);
                    setState(242);
                    variableDeclarationList();
                    setState(243);
                    match(SemiColon);
                    setState(245);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(244);
                            expressionSequence();
                        }
                    }

                    setState(247);
                    match(SemiColon);
                    setState(249);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(248);
                            expressionSequence();
                        }
                    }

                    setState(251);
                    match(CloseParen);
                    setState(252);
                    statement();
                }
                break;
                case 5:
                    _localctx = new ForInStatementContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(254);
                    match(For);
                    setState(255);
                    match(OpenParen);
                    setState(256);
                    singleExpression(0);
                    setState(257);
                    match(In);
                    setState(258);
                    expressionSequence();
                    setState(259);
                    match(CloseParen);
                    setState(260);
                    statement();
                }
                break;
                case 6:
                    _localctx = new ForVarInStatementContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(262);
                    match(For);
                    setState(263);
                    match(OpenParen);
                    setState(264);
                    match(Var);
                    setState(265);
                    variableDeclaration();
                    setState(266);
                    match(In);
                    setState(267);
                    expressionSequence();
                    setState(268);
                    match(CloseParen);
                    setState(269);
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
        enterRule(_localctx, 28, RULE_continueStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(273);
                match(Continue);
                setState(276);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
                    case 1:
                    {
                        setState(274);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(275);
                        match(Identifier);
                    }
                    break;
                }
                setState(279);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
                    case 1:
                    {
                        setState(278);
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
        enterRule(_localctx, 30, RULE_breakStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(281);
                match(Break);
                setState(284);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
                    case 1:
                    {
                        setState(282);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(283);
                        match(Identifier);
                    }
                    break;
                }
                setState(287);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
                    case 1:
                    {
                        setState(286);
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
        enterRule(_localctx, 32, RULE_returnStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(289);
                match(Return);
                setState(292);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
                    case 1:
                    {
                        setState(290);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(291);
                        expressionSequence();
                    }
                    break;
                }
                setState(295);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
                    case 1:
                    {
                        setState(294);
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
        enterRule(_localctx, 34, RULE_withStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(297);
                match(With);
                setState(298);
                match(OpenParen);
                setState(299);
                expressionSequence();
                setState(300);
                match(CloseParen);
                setState(301);
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
        enterRule(_localctx, 36, RULE_switchStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                match(Switch);
                setState(304);
                match(OpenParen);
                setState(305);
                expressionSequence();
                setState(306);
                match(CloseParen);
                setState(307);
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
        enterRule(_localctx, 38, RULE_caseBlock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                match(OpenBrace);
                setState(311);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Case) {
                    {
                        setState(310);
                        caseClauses();
                    }
                }

                setState(317);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Default) {
                    {
                        setState(313);
                        defaultClause();
                        setState(315);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Case) {
                            {
                                setState(314);
                                caseClauses();
                            }
                        }

                    }
                }

                setState(319);
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
        enterRule(_localctx, 40, RULE_caseClauses);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(322);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(321);
                            caseClause();
                        }
                    }
                    setState(324);
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
        enterRule(_localctx, 42, RULE_caseClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(326);
                match(Case);
                setState(327);
                expressionSequence();
                setState(328);
                match(Colon);
                setState(330);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
                    case 1:
                    {
                        setState(329);
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
        enterRule(_localctx, 44, RULE_defaultClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(332);
                match(Default);
                setState(333);
                match(Colon);
                setState(335);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
                    case 1:
                    {
                        setState(334);
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
        enterRule(_localctx, 46, RULE_labelledStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(337);
                match(Identifier);
                setState(338);
                match(Colon);
                setState(339);
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
        enterRule(_localctx, 48, RULE_throwStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(341);
                match(Throw);
                setState(342);
                if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                setState(343);
                expressionSequence();
                setState(345);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
                    case 1:
                    {
                        setState(344);
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
        enterRule(_localctx, 50, RULE_tryStatement);
        try {
            setState(360);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(347);
                    match(Try);
                    setState(348);
                    block();
                    setState(349);
                    catchProduction();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(351);
                    match(Try);
                    setState(352);
                    block();
                    setState(353);
                    finallyProduction();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(355);
                    match(Try);
                    setState(356);
                    block();
                    setState(357);
                    catchProduction();
                    setState(358);
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
        enterRule(_localctx, 52, RULE_catchProduction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(362);
                match(Catch);
                setState(363);
                match(OpenParen);
                setState(364);
                match(Identifier);
                setState(365);
                match(CloseParen);
                setState(366);
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
        enterRule(_localctx, 54, RULE_finallyProduction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(368);
                match(Finally);
                setState(369);
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
        enterRule(_localctx, 56, RULE_debuggerStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(371);
                match(Debugger);
                setState(373);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
                    case 1:
                    {
                        setState(372);
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
        enterRule(_localctx, 58, RULE_functionDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(375);
                match(Function);
                setState(376);
                match(Identifier);
                setState(377);
                match(OpenParen);
                setState(379);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Identifier) {
                    {
                        setState(378);
                        formalParameterList();
                    }
                }

                setState(381);
                match(CloseParen);
                setState(382);
                match(OpenBrace);
                setState(383);
                functionBody();
                setState(384);
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
        enterRule(_localctx, 60, RULE_formalParameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(386);
                match(Identifier);
                setState(391);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==Comma) {
                    {
                        {
                            setState(387);
                            match(Comma);
                            setState(388);
                            match(Identifier);
                        }
                    }
                    setState(393);
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
        enterRule(_localctx, 62, RULE_functionBody);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(395);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
                    case 1:
                    {
                        setState(394);
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
        enterRule(_localctx, 64, RULE_arrayLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(397);
                match(OpenBracket);
                setState(399);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
                    case 1:
                    {
                        setState(398);
                        elementList();
                    }
                    break;
                }
                setState(402);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
                    case 1:
                    {
                        setState(401);
                        match(Comma);
                    }
                    break;
                }
                setState(405);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Comma) {
                    {
                        setState(404);
                        elision();
                    }
                }

                setState(407);
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
        enterRule(_localctx, 66, RULE_elementList);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(410);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Comma) {
                    {
                        setState(409);
                        elision();
                    }
                }

                setState(412);
                singleExpression(0);
                setState(420);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(413);
                                match(Comma);
                                setState(415);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==Comma) {
                                    {
                                        setState(414);
                                        elision();
                                    }
                                }

                                setState(417);
                                singleExpression(0);
                            }
                        }
                    }
                    setState(422);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
        enterRule(_localctx, 68, RULE_elision);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(424);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(423);
                            match(Comma);
                        }
                    }
                    setState(426);
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
        enterRule(_localctx, 70, RULE_objectLiteral);
        int _la;
        try {
            setState(437);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(428);
                    match(OpenBrace);
                    setState(429);
                    match(CloseBrace);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(430);
                    match(OpenBrace);
                    setState(431);
                    propertyNameAndValueList();
                    setState(433);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==Comma) {
                        {
                            setState(432);
                            match(Comma);
                        }
                    }

                    setState(435);
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
        enterRule(_localctx, 72, RULE_propertyNameAndValueList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(439);
                propertyAssignment();
                setState(444);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,49,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(440);
                                match(Comma);
                                setState(441);
                                propertyAssignment();
                            }
                        }
                    }
                    setState(446);
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
        enterRule(_localctx, 74, RULE_propertyAssignment);
        try {
            setState(466);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
                case 1:
                    _localctx = new PropertyExpressionAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(447);
                    propertyName();
                    setState(448);
                    match(Colon);
                    setState(449);
                    singleExpression(0);
                }
                break;
                case 2:
                    _localctx = new PropertyGetterContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(451);
                    getter();
                    setState(452);
                    match(OpenParen);
                    setState(453);
                    match(CloseParen);
                    setState(454);
                    match(OpenBrace);
                    setState(455);
                    functionBody();
                    setState(456);
                    match(CloseBrace);
                }
                break;
                case 3:
                    _localctx = new PropertySetterContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(458);
                    setter();
                    setState(459);
                    match(OpenParen);
                    setState(460);
                    propertySetParameterList();
                    setState(461);
                    match(CloseParen);
                    setState(462);
                    match(OpenBrace);
                    setState(463);
                    functionBody();
                    setState(464);
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
        enterRule(_localctx, 76, RULE_propertyName);
        try {
            setState(473);
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
                    setState(468);
                    identifierName();
                }
                break;
                case StringLiteral:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(469);
                    match(StringLiteral);
                }
                break;
                case DecimalLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(470);
                    match(DecimalLiteral);
                }
                break;
                case HexIntegerLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(471);
                    match(HexIntegerLiteral);
                }
                break;
                case OctalIntegerLiteral:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(472);
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
        enterRule(_localctx, 78, RULE_propertySetParameterList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(475);
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
        enterRule(_localctx, 80, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(477);
                match(OpenParen);
                setState(479);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                    {
                        setState(478);
                        argumentList();
                    }
                }

                setState(481);
                match(CloseParen);
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
        enterRule(_localctx, 82, RULE_argumentList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(483);
                singleExpression(0);
                setState(488);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==Comma) {
                    {
                        {
                            setState(484);
                            match(Comma);
                            setState(485);
                            singleExpression(0);
                        }
                    }
                    setState(490);
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
        enterRule(_localctx, 84, RULE_expressionSequence);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(491);
                singleExpression(0);
                setState(496);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,54,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(492);
                                match(Comma);
                                setState(493);
                                singleExpression(0);
                            }
                        }
                    }
                    setState(498);
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
        int _startState = 86;
        enterRecursionRule(_localctx, 86, RULE_singleExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(545);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Function:
                    {
                        _localctx = new FunctionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(500);
                        match(Function);
                        setState(502);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Identifier) {
                            {
                                setState(501);
                                match(Identifier);
                            }
                        }

                        setState(504);
                        match(OpenParen);
                        setState(506);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Identifier) {
                            {
                                setState(505);
                                formalParameterList();
                            }
                        }

                        setState(508);
                        match(CloseParen);
                        setState(509);
                        match(OpenBrace);
                        setState(510);
                        functionBody();
                        setState(511);
                        match(CloseBrace);
                    }
                    break;
                    case New:
                    {
                        _localctx = new NewExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(513);
                        match(New);
                        setState(514);
                        singleExpression(0);
                        setState(516);
                        _errHandler.sync(this);
                        switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
                            case 1:
                            {
                                setState(515);
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
                        setState(518);
                        match(Delete);
                        setState(519);
                        singleExpression(19);
                    }
                    break;
                    case Void:
                    {
                        _localctx = new VoidExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(520);
                        match(Void);
                        setState(521);
                        singleExpression(18);
                    }
                    break;
                    case Typeof:
                    {
                        _localctx = new TypeofExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(522);
                        match(Typeof);
                        setState(523);
                        singleExpression(17);
                    }
                    break;
                    case PlusPlus:
                    {
                        _localctx = new PreIncrementExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(524);
                        match(PlusPlus);
                        setState(525);
                        singleExpression(16);
                    }
                    break;
                    case MinusMinus:
                    {
                        _localctx = new PreDecreaseExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(526);
                        match(MinusMinus);
                        setState(527);
                        singleExpression(15);
                    }
                    break;
                    case Plus:
                    {
                        _localctx = new UnaryPlusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(528);
                        match(Plus);
                        setState(529);
                        singleExpression(14);
                    }
                    break;
                    case Minus:
                    {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(530);
                        match(Minus);
                        setState(531);
                        singleExpression(13);
                    }
                    break;
                    case BitNot:
                    {
                        _localctx = new BitNotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(532);
                        match(BitNot);
                        setState(533);
                        singleExpression(12);
                    }
                    break;
                    case Not:
                    {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(534);
                        match(Not);
                        setState(535);
                        singleExpression(11);
                    }
                    break;
                    case This:
                    {
                        _localctx = new ThisExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(536);
                        match(This);
                    }
                    break;
                    case Identifier:
                    {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(537);
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
                        setState(538);
                        literal();
                    }
                    break;
                    case OpenBracket:
                    {
                        _localctx = new ArrayLiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(539);
                        arrayLiteral();
                    }
                    break;
                    case OpenBrace:
                    {
                        _localctx = new ObjectLiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(540);
                        objectLiteral();
                    }
                    break;
                    case OpenParen:
                    {
                        _localctx = new ParenthesizedExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(541);
                        match(OpenParen);
                        setState(542);
                        expressionSequence();
                        setState(543);
                        match(CloseParen);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(579);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,60,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(577);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new BinaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(547);
                                    if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(548);
                                    binOperator();
                                    setState(549);
                                    singleExpression(11);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(551);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(552);
                                    match(Instanceof);
                                    setState(553);
                                    singleExpression(10);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(554);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(555);
                                    match(In);
                                    setState(556);
                                    singleExpression(9);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(557);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(558);
                                    assignmentOperator();
                                    setState(559);
                                    singleExpression(8);
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(561);
                                    if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(562);
                                    match(OpenBracket);
                                    setState(563);
                                    expressionSequence();
                                    setState(564);
                                    match(CloseBracket);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(566);
                                    if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                                    setState(567);
                                    match(Dot);
                                    setState(568);
                                    identifierName();
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(569);
                                    if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(570);
                                    arguments();
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(571);
                                    if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(572);
                                    if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                                    setState(573);
                                    match(PlusPlus);
                                }
                                break;
                                case 9:
                                {
                                    _localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(574);
                                    if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(575);
                                    if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                                    setState(576);
                                    match(MinusMinus);
                                }
                                break;
                            }
                        }
                    }
                    setState(581);
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
        enterRule(_localctx, 88, RULE_assignmentOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(582);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Assign) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
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
        enterRule(_localctx, 90, RULE_literal);
        int _la;
        try {
            setState(589);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case RegularExpressionLiteral:
                case NullLiteral:
                case BooleanLiteral:
                case StringLiteral:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(584);
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
                    setState(585);
                    match(DecimalLiteral);
                }
                break;
                case HexIntegerLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(586);
                    match(HexIntegerLiteral);
                }
                break;
                case OctalIntegerLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(587);
                    match(OctalIntegerLiteral);
                }
                break;
                case LITERALS:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(588);
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
        enterRule(_localctx, 92, RULE_numericLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(591);
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
        enterRule(_localctx, 94, RULE_identifierName);
        try {
            setState(595);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(593);
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
                    setState(594);
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
        enterRule(_localctx, 96, RULE_reservedWord);
        int _la;
        try {
            setState(600);
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
                    setState(597);
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
                    setState(598);
                    futureReservedWord();
                }
                break;
                case NullLiteral:
                case BooleanLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(599);
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
        enterRule(_localctx, 98, RULE_keyword);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(602);
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
        enterRule(_localctx, 100, RULE_futureReservedWord);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(604);
                _la = _input.LA(1);
                if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Class - 93)) | (1L << (Enum - 93)) | (1L << (Extends - 93)) | (1L << (Super - 93)) | (1L << (Const - 93)) | (1L << (Export - 93)) | (1L << (Import - 93)) | (1L << (Implements - 93)) | (1L << (Let - 93)) | (1L << (Private - 93)) | (1L << (Public - 93)) | (1L << (Interface - 93)) | (1L << (Package - 93)) | (1L << (Protected - 93)) | (1L << (Static - 93)) | (1L << (Yield - 93)))) != 0)) ) {
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
        enterRule(_localctx, 102, RULE_getter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(606);
                if (!(_input.LT(1).getText().equals("get"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"get\")");
                setState(607);
                match(Identifier);
                setState(608);
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
        enterRule(_localctx, 104, RULE_setter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(610);
                if (!(_input.LT(1).getText().equals("set"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"set\")");
                setState(611);
                match(Identifier);
                setState(612);
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
        enterRule(_localctx, 106, RULE_eos);
        try {
            setState(618);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(614);
                    match(SemiColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(615);
                    match(EOF);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(616);
                    if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(617);
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
        enterRule(_localctx, 108, RULE_eof);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(620);
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
        enterRule(_localctx, 110, RULE_binOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(622);
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
            case 2:
                return sourceElement_sempred((SourceElementContext)_localctx, predIndex);
            case 3:
                return statement_sempred((StatementContext)_localctx, predIndex);
            case 14:
                return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
            case 15:
                return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
            case 16:
                return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
            case 24:
                return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
            case 43:
                return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
            case 51:
                return getter_sempred((GetterContext)_localctx, predIndex);
            case 52:
                return setter_sempred((SetterContext)_localctx, predIndex);
            case 53:
                return eos_sempred((EosContext)_localctx, predIndex);
        }
        return true;
    }
    private boolean sourceElement_sempred(SourceElementContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return _input.LA(1) != Function;
        }
        return true;
    }
    private boolean statement_sempred(StatementContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return _input.LA(1) != OpenBrace;
        }
        return true;
    }
    private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return !here(LineTerminator);
        }
        return true;
    }
    private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
        switch (predIndex) {
            case 3:
                return !here(LineTerminator);
        }
        return true;
    }
    private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
        switch (predIndex) {
            case 4:
                return !here(LineTerminator);
        }
        return true;
    }
    private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
        switch (predIndex) {
            case 5:
                return !here(LineTerminator);
        }
        return true;
    }
    private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 6:
                return precpred(_ctx, 10);
            case 7:
                return precpred(_ctx, 9);
            case 8:
                return precpred(_ctx, 8);
            case 9:
                return precpred(_ctx, 7);
            case 10:
                return precpred(_ctx, 25);
            case 11:
                return precpred(_ctx, 24);
            case 12:
                return precpred(_ctx, 23);
            case 13:
                return precpred(_ctx, 21);
            case 14:
                return !here(LineTerminator);
            case 15:
                return precpred(_ctx, 20);
            case 16:
                return !here(LineTerminator);
        }
        return true;
    }
    private boolean getter_sempred(GetterContext _localctx, int predIndex) {
        switch (predIndex) {
            case 17:
                return _input.LT(1).getText().equals("get");
        }
        return true;
    }
    private boolean setter_sempred(SetterContext _localctx, int predIndex) {
        switch (predIndex) {
            case 18:
                return _input.LT(1).getText().equals("set");
        }
        return true;
    }
    private boolean eos_sempred(EosContext _localctx, int predIndex) {
        switch (predIndex) {
            case 19:
                return lineTerminatorAhead();
            case 20:
                return _input.LT(1).getType() == CloseBrace;
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u0273\4\2\t\2\4"+
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\7\2v\n\2\f\2"+
                    "\16\2y\13\2\3\2\3\2\3\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2\5\2\u0085"+
                    "\n\2\3\3\6\3\u0088\n\3\r\3\16\3\u0089\3\4\3\4\3\4\5\4\u008f\n\4\3\5\3"+
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n"+
                    "\5\3\6\3\6\5\6\u00a5\n\6\3\6\5\6\u00a8\n\6\3\7\6\7\u00ab\n\7\r\7\16\7"+
                    "\u00ac\3\b\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\t\7\t\u00b7\n\t\f\t\16\t\u00ba"+
                    "\13\t\3\n\3\n\5\n\u00be\n\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00c7\n"+
                    "\r\3\16\3\16\3\16\3\16\3\16\5\16\u00ce\n\16\3\16\3\16\5\16\u00d2\n\16"+
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00db\n\17\3\17\3\17\3\17\3\17"+
                    "\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17\5\17\u00ea\n\17\3"+
                    "\17\3\17\5\17\u00ee\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
                    "\u00f8\n\17\3\17\3\17\5\17\u00fc\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
                    "\17\u0112\n\17\3\20\3\20\3\20\5\20\u0117\n\20\3\20\5\20\u011a\n\20\3\21"+
                    "\3\21\3\21\5\21\u011f\n\21\3\21\5\21\u0122\n\21\3\22\3\22\3\22\5\22\u0127"+
                    "\n\22\3\22\5\22\u012a\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
                    "\3\24\3\24\3\24\3\25\3\25\5\25\u013a\n\25\3\25\3\25\5\25\u013e\n\25\5"+
                    "\25\u0140\n\25\3\25\3\25\3\26\6\26\u0145\n\26\r\26\16\26\u0146\3\27\3"+
                    "\27\3\27\3\27\5\27\u014d\n\27\3\30\3\30\3\30\5\30\u0152\n\30\3\31\3\31"+
                    "\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u015c\n\32\3\33\3\33\3\33\3\33\3\33"+
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016b\n\33\3\34\3\34\3\34"+
                    "\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\5\36\u0178\n\36\3\37\3\37\3\37"+
                    "\3\37\5\37\u017e\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u0188\n \f"+
                    " \16 \u018b\13 \3!\5!\u018e\n!\3\"\3\"\5\"\u0192\n\"\3\"\5\"\u0195\n\""+
                    "\3\"\5\"\u0198\n\"\3\"\3\"\3#\5#\u019d\n#\3#\3#\3#\5#\u01a2\n#\3#\7#\u01a5"+
                    "\n#\f#\16#\u01a8\13#\3$\6$\u01ab\n$\r$\16$\u01ac\3%\3%\3%\3%\3%\5%\u01b4"+
                    "\n%\3%\3%\5%\u01b8\n%\3&\3&\3&\7&\u01bd\n&\f&\16&\u01c0\13&\3\'\3\'\3"+
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
                    "\u01d5\n\'\3(\3(\3(\3(\3(\5(\u01dc\n(\3)\3)\3*\3*\5*\u01e2\n*\3*\3*\3"+
                    "+\3+\3+\7+\u01e9\n+\f+\16+\u01ec\13+\3,\3,\3,\7,\u01f1\n,\f,\16,\u01f4"+
                    "\13,\3-\3-\3-\5-\u01f9\n-\3-\3-\5-\u01fd\n-\3-\3-\3-\3-\3-\3-\3-\3-\5"+
                    "-\u0207\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\5-\u0224\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0244\n-\f"+
                    "-\16-\u0247\13-\3.\3.\3/\3/\3/\3/\3/\5/\u0250\n/\3\60\3\60\3\61\3\61\5"+
                    "\61\u0256\n\61\3\62\3\62\3\62\5\62\u025b\n\62\3\63\3\63\3\64\3\64\3\65"+
                    "\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u026d\n\67"+
                    "\38\38\39\39\39\2\3X:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
                    "\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\t\5\2\4\b\30\30\65?\5\2\16"+
                    "\16@Auu\3\2BD\3\2@A\3\2E^\3\2_n\5\2\t\r\36\37\"\64\2\u02ad\2r\3\2\2\2"+
                    "\4\u0087\3\2\2\2\6\u008e\3\2\2\2\b\u00a0\3\2\2\2\n\u00a2\3\2\2\2\f\u00aa"+
                    "\3\2\2\2\16\u00ae\3\2\2\2\20\u00b3\3\2\2\2\22\u00bb\3\2\2\2\24\u00bf\3"+
                    "\2\2\2\26\u00c2\3\2\2\2\30\u00c4\3\2\2\2\32\u00c8\3\2\2\2\34\u0111\3\2"+
                    "\2\2\36\u0113\3\2\2\2 \u011b\3\2\2\2\"\u0123\3\2\2\2$\u012b\3\2\2\2&\u0131"+
                    "\3\2\2\2(\u0137\3\2\2\2*\u0144\3\2\2\2,\u0148\3\2\2\2.\u014e\3\2\2\2\60"+
                    "\u0153\3\2\2\2\62\u0157\3\2\2\2\64\u016a\3\2\2\2\66\u016c\3\2\2\28\u0172"+
                    "\3\2\2\2:\u0175\3\2\2\2<\u0179\3\2\2\2>\u0184\3\2\2\2@\u018d\3\2\2\2B"+
                    "\u018f\3\2\2\2D\u019c\3\2\2\2F\u01aa\3\2\2\2H\u01b7\3\2\2\2J\u01b9\3\2"+
                    "\2\2L\u01d4\3\2\2\2N\u01db\3\2\2\2P\u01dd\3\2\2\2R\u01df\3\2\2\2T\u01e5"+
                    "\3\2\2\2V\u01ed\3\2\2\2X\u0223\3\2\2\2Z\u0248\3\2\2\2\\\u024f\3\2\2\2"+
                    "^\u0251\3\2\2\2`\u0255\3\2\2\2b\u025a\3\2\2\2d\u025c\3\2\2\2f\u025e\3"+
                    "\2\2\2h\u0260\3\2\2\2j\u0264\3\2\2\2l\u026c\3\2\2\2n\u026e\3\2\2\2p\u0270"+
                    "\3\2\2\2rw\5\4\3\2st\7r\2\2tv\5\4\3\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx"+
                    "\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\3\2\2{\u0080\5\4\3\2|}\7r\2\2}\177\5"+
                    "\4\3\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
                    "\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\7\2\2\3\u0084\u0083"+
                    "\3\2\2\2\u0084\u0085\3\2\2\2\u0085\3\3\2\2\2\u0086\u0088\5\6\4\2\u0087"+
                    "\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
                    "\2\2\u008a\5\3\2\2\2\u008b\u008c\6\4\2\2\u008c\u008f\5\b\5\2\u008d\u008f"+
                    "\5<\37\2\u008e\u008b\3\2\2\2\u008e\u008d\3\2\2\2\u008f\7\3\2\2\2\u0090"+
                    "\u00a1\5\n\6\2\u0091\u00a1\5\16\b\2\u0092\u00a1\5\26\f\2\u0093\u0094\6"+
                    "\5\3\2\u0094\u00a1\5\30\r\2\u0095\u00a1\5\32\16\2\u0096\u00a1\5\34\17"+
                    "\2\u0097\u00a1\5\36\20\2\u0098\u00a1\5 \21\2\u0099\u00a1\5\"\22\2\u009a"+
                    "\u00a1\5$\23\2\u009b\u00a1\5\60\31\2\u009c\u00a1\5&\24\2\u009d\u00a1\5"+
                    "\62\32\2\u009e\u00a1\5\64\33\2\u009f\u00a1\5:\36\2\u00a0\u0090\3\2\2\2"+
                    "\u00a0\u0091\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u0095"+
                    "\3\2\2\2\u00a0\u0096\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0"+
                    "\u0099\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2"+
                    "\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
                    "\t\3\2\2\2\u00a2\u00a4\7\24\2\2\u00a3\u00a5\5\f\7\2\u00a4\u00a3\3\2\2"+
                    "\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\7\25\2\2\u00a7"+
                    "\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\13\3\2\2\2\u00a9\u00ab\5\b\5"+
                    "\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
                    "\3\2\2\2\u00ad\r\3\2\2\2\u00ae\u00af\7L\2\2\u00af\u00b1\5\20\t\2\u00b0"+
                    "\u00b2\7\26\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\17\3\2\2"+
                    "\2\u00b3\u00b8\5\22\n\2\u00b4\u00b5\7\27\2\2\u00b5\u00b7\5\22\n\2\u00b6"+
                    "\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
                    "\2\2\u00b9\21\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7t\2\2\u00bc\u00be"+
                    "\5\24\13\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\23\3\2\2\2\u00bf"+
                    "\u00c0\7\30\2\2\u00c0\u00c1\5X-\2\u00c1\25\3\2\2\2\u00c2\u00c3\7\26\2"+
                    "\2\u00c3\27\3\2\2\2\u00c4\u00c6\5V,\2\u00c5\u00c7\7\26\2\2\u00c6\u00c5"+
                    "\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\7Z\2\2\u00c9"+
                    "\u00ca\7\22\2\2\u00ca\u00cb\5V,\2\u00cb\u00cd\7\23\2\2\u00cc\u00ce\5\b"+
                    "\5\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
                    "\u00d0\7J\2\2\u00d0\u00d2\5\b\5\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
                    "\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6"+
                    "\7T\2\2\u00d6\u00d7\7\22\2\2\u00d7\u00d8\5V,\2\u00d8\u00da\7\23\2\2\u00d9"+
                    "\u00db\7\26\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u0112\3"+
                    "\2\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de\7\22\2\2\u00de\u00df\5V,\2\u00df"+
                    "\u00e0\7\23\2\2\u00e0\u00e1\5\b\5\2\u00e1\u0112\3\2\2\2\u00e2\u00e3\7"+
                    "R\2\2\u00e3\u00e5\7\22\2\2\u00e4\u00e6\5V,\2\u00e5\u00e4\3\2\2\2\u00e5"+
                    "\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\26\2\2\u00e8\u00ea\5"+
                    "V,\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
                    "\u00ed\7\26\2\2\u00ec\u00ee\5V,\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2"+
                    "\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\23\2\2\u00f0\u0112\5\b\5\2\u00f1"+
                    "\u00f2\7R\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\7L\2\2\u00f4\u00f5\5\20"+
                    "\t\2\u00f5\u00f7\7\26\2\2\u00f6\u00f8\5V,\2\u00f7\u00f6\3\2\2\2\u00f7"+
                    "\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7\26\2\2\u00fa\u00fc\5"+
                    "V,\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
                    "\u00fe\7\23\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0112\3\2\2\2\u0100\u0101\7"+
                    "R\2\2\u0101\u0102\7\22\2\2\u0102\u0103\5X-\2\u0103\u0104\7]\2\2\u0104"+
                    "\u0105\5V,\2\u0105\u0106\7\23\2\2\u0106\u0107\5\b\5\2\u0107\u0112\3\2"+
                    "\2\2\u0108\u0109\7R\2\2\u0109\u010a\7\22\2\2\u010a\u010b\7L\2\2\u010b"+
                    "\u010c\5\22\n\2\u010c\u010d\7]\2\2\u010d\u010e\5V,\2\u010e\u010f\7\23"+
                    "\2\2\u010f\u0110\5\b\5\2\u0110\u0112\3\2\2\2\u0111\u00d3\3\2\2\2\u0111"+
                    "\u00dc\3\2\2\2\u0111\u00e2\3\2\2\2\u0111\u00f1\3\2\2\2\u0111\u0100\3\2"+
                    "\2\2\u0111\u0108\3\2\2\2\u0112\35\3\2\2\2\u0113\u0116\7Q\2\2\u0114\u0115"+
                    "\6\20\4\2\u0115\u0117\7t\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
                    "\u0119\3\2\2\2\u0118\u011a\7\26\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3"+
                    "\2\2\2\u011a\37\3\2\2\2\u011b\u011e\7E\2\2\u011c\u011d\6\21\5\2\u011d"+
                    "\u011f\7t\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2"+
                    "\2\2\u0120\u0122\7\26\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
                    "!\3\2\2\2\u0123\u0126\7O\2\2\u0124\u0125\6\22\6\2\u0125\u0127\5V,\2\u0126"+
                    "\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\7\26"+
                    "\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a#\3\2\2\2\u012b\u012c"+
                    "\7X\2\2\u012c\u012d\7\22\2\2\u012d\u012e\5V,\2\u012e\u012f\7\23\2\2\u012f"+
                    "\u0130\5\b\5\2\u0130%\3\2\2\2\u0131\u0132\7S\2\2\u0132\u0133\7\22\2\2"+
                    "\u0133\u0134\5V,\2\u0134\u0135\7\23\2\2\u0135\u0136\5(\25\2\u0136\'\3"+
                    "\2\2\2\u0137\u0139\7\24\2\2\u0138\u013a\5*\26\2\u0139\u0138\3\2\2\2\u0139"+
                    "\u013a\3\2\2\2\u013a\u013f\3\2\2\2\u013b\u013d\5.\30\2\u013c\u013e\5*"+
                    "\26\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
                    "\u013b\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\25"+
                    "\2\2\u0142)\3\2\2\2\u0143\u0145\5,\27\2\u0144\u0143\3\2\2\2\u0145\u0146"+
                    "\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147+\3\2\2\2\u0148"+
                    "\u0149\7I\2\2\u0149\u014a\5V,\2\u014a\u014c\7\32\2\2\u014b\u014d\5\f\7"+
                    "\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d-\3\2\2\2\u014e\u014f"+
                    "\7Y\2\2\u014f\u0151\7\32\2\2\u0150\u0152\5\f\7\2\u0151\u0150\3\2\2\2\u0151"+
                    "\u0152\3\2\2\2\u0152/\3\2\2\2\u0153\u0154\7t\2\2\u0154\u0155\7\32\2\2"+
                    "\u0155\u0156\5\b\5\2\u0156\61\3\2\2\2\u0157\u0158\7[\2\2\u0158\u0159\6"+
                    "\32\7\2\u0159\u015b\5V,\2\u015a\u015c\7\26\2\2\u015b\u015a\3\2\2\2\u015b"+
                    "\u015c\3\2\2\2\u015c\63\3\2\2\2\u015d\u015e\7^\2\2\u015e\u015f\5\n\6\2"+
                    "\u015f\u0160\5\66\34\2\u0160\u016b\3\2\2\2\u0161\u0162\7^\2\2\u0162\u0163"+
                    "\5\n\6\2\u0163\u0164\58\35\2\u0164\u016b\3\2\2\2\u0165\u0166\7^\2\2\u0166"+
                    "\u0167\5\n\6\2\u0167\u0168\5\66\34\2\u0168\u0169\58\35\2\u0169\u016b\3"+
                    "\2\2\2\u016a\u015d\3\2\2\2\u016a\u0161\3\2\2\2\u016a\u0165\3\2\2\2\u016b"+
                    "\65\3\2\2\2\u016c\u016d\7M\2\2\u016d\u016e\7\22\2\2\u016e\u016f\7t\2\2"+
                    "\u016f\u0170\7\23\2\2\u0170\u0171\5\n\6\2\u0171\67\3\2\2\2\u0172\u0173"+
                    "\7N\2\2\u0173\u0174\5\n\6\2\u01749\3\2\2\2\u0175\u0177\7U\2\2\u0176\u0178"+
                    "\7\26\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178;\3\2\2\2\u0179"+
                    "\u017a\7V\2\2\u017a\u017b\7t\2\2\u017b\u017d\7\22\2\2\u017c\u017e\5> "+
                    "\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
                    "\7\23\2\2\u0180\u0181\7\24\2\2\u0181\u0182\5@!\2\u0182\u0183\7\25\2\2"+
                    "\u0183=\3\2\2\2\u0184\u0189\7t\2\2\u0185\u0186\7\27\2\2\u0186\u0188\7"+
                    "t\2\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
                    "\u018a\3\2\2\2\u018a?\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\5\4\3\2"+
                    "\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018eA\3\2\2\2\u018f\u0191\7"+
                    "\20\2\2\u0190\u0192\5D#\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
                    "\u0194\3\2\2\2\u0193\u0195\7\27\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3"+
                    "\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5F$\2\u0197\u0196\3\2\2\2\u0197"+
                    "\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7\21\2\2\u019aC\3\2\2\2"+
                    "\u019b\u019d\5F$\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
                    "\3\2\2\2\u019e\u01a6\5X-\2\u019f\u01a1\7\27\2\2\u01a0\u01a2\5F$\2\u01a1"+
                    "\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\5X"+
                    "-\2\u01a4\u019f\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
                    "\u01a7\3\2\2\2\u01a7E\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\7\27\2\2"+
                    "\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad"+
                    "\3\2\2\2\u01adG\3\2\2\2\u01ae\u01af\7\24\2\2\u01af\u01b8\7\25\2\2\u01b0"+
                    "\u01b1\7\24\2\2\u01b1\u01b3\5J&\2\u01b2\u01b4\7\27\2\2\u01b3\u01b2\3\2"+
                    "\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\25\2\2\u01b6"+
                    "\u01b8\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b8I\3\2\2\2"+
                    "\u01b9\u01be\5L\'\2\u01ba\u01bb\7\27\2\2\u01bb\u01bd\5L\'\2\u01bc\u01ba"+
                    "\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
                    "K\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\5N(\2\u01c2\u01c3\7\32\2\2\u01c3"+
                    "\u01c4\5X-\2\u01c4\u01d5\3\2\2\2\u01c5\u01c6\5h\65\2\u01c6\u01c7\7\22"+
                    "\2\2\u01c7\u01c8\7\23\2\2\u01c8\u01c9\7\24\2\2\u01c9\u01ca\5@!\2\u01ca"+
                    "\u01cb\7\25\2\2\u01cb\u01d5\3\2\2\2\u01cc\u01cd\5j\66\2\u01cd\u01ce\7"+
                    "\22\2\2\u01ce\u01cf\5P)\2\u01cf\u01d0\7\23\2\2\u01d0\u01d1\7\24\2\2\u01d1"+
                    "\u01d2\5@!\2\u01d2\u01d3\7\25\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01c1\3\2"+
                    "\2\2\u01d4\u01c5\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d5M\3\2\2\2\u01d6\u01dc"+
                    "\5`\61\2\u01d7\u01dc\7u\2\2\u01d8\u01dc\7B\2\2\u01d9\u01dc\7C\2\2\u01da"+
                    "\u01dc\7D\2\2\u01db\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01d8\3\2"+
                    "\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dcO\3\2\2\2\u01dd\u01de"+
                    "\7t\2\2\u01deQ\3\2\2\2\u01df\u01e1\7\22\2\2\u01e0\u01e2\5T+\2\u01e1\u01e0"+
                    "\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\23\2\2"+
                    "\u01e4S\3\2\2\2\u01e5\u01ea\5X-\2\u01e6\u01e7\7\27\2\2\u01e7\u01e9\5X"+
                    "-\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
                    "\u01eb\3\2\2\2\u01ebU\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f2\5X-\2\u01ee"+
                    "\u01ef\7\27\2\2\u01ef\u01f1\5X-\2\u01f0\u01ee\3\2\2\2\u01f1\u01f4\3\2"+
                    "\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3W\3\2\2\2\u01f4\u01f2"+
                    "\3\2\2\2\u01f5\u01f6\b-\1\2\u01f6\u01f8\7V\2\2\u01f7\u01f9\7t\2\2\u01f8"+
                    "\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\7\22"+
                    "\2\2\u01fb\u01fd\5> \2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe"+
                    "\3\2\2\2\u01fe\u01ff\7\23\2\2\u01ff\u0200\7\24\2\2\u0200\u0201\5@!\2\u0201"+
                    "\u0202\7\25\2\2\u0202\u0224\3\2\2\2\u0203\u0204\7K\2\2\u0204\u0206\5X"+
                    "-\2\u0205\u0207\5R*\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0224"+
                    "\3\2\2\2\u0208\u0209\7\\\2\2\u0209\u0224\5X-\25\u020a\u020b\7P\2\2\u020b"+
                    "\u0224\5X-\24\u020c\u020d\7H\2\2\u020d\u0224\5X-\23\u020e\u020f\7\34\2"+
                    "\2\u020f\u0224\5X-\22\u0210\u0211\7\35\2\2\u0211\u0224\5X-\21\u0212\u0213"+
                    "\7\36\2\2\u0213\u0224\5X-\20\u0214\u0215\7\37\2\2\u0215\u0224\5X-\17\u0216"+
                    "\u0217\7 \2\2\u0217\u0224\5X-\16\u0218\u0219\7!\2\2\u0219\u0224\5X-\r"+
                    "\u021a\u0224\7W\2\2\u021b\u0224\7t\2\2\u021c\u0224\5\\/\2\u021d\u0224"+
                    "\5B\"\2\u021e\u0224\5H%\2\u021f\u0220\7\22\2\2\u0220\u0221\5V,\2\u0221"+
                    "\u0222\7\23\2\2\u0222\u0224\3\2\2\2\u0223\u01f5\3\2\2\2\u0223\u0203\3"+
                    "\2\2\2\u0223\u0208\3\2\2\2\u0223\u020a\3\2\2\2\u0223\u020c\3\2\2\2\u0223"+
                    "\u020e\3\2\2\2\u0223\u0210\3\2\2\2\u0223\u0212\3\2\2\2\u0223\u0214\3\2"+
                    "\2\2\u0223\u0216\3\2\2\2\u0223\u0218\3\2\2\2\u0223\u021a\3\2\2\2\u0223"+
                    "\u021b\3\2\2\2\u0223\u021c\3\2\2\2\u0223\u021d\3\2\2\2\u0223\u021e\3\2"+
                    "\2\2\u0223\u021f\3\2\2\2\u0224\u0245\3\2\2\2\u0225\u0226\f\f\2\2\u0226"+
                    "\u0227\5p9\2\u0227\u0228\5X-\r\u0228\u0244\3\2\2\2\u0229\u022a\f\13\2"+
                    "\2\u022a\u022b\7G\2\2\u022b\u0244\5X-\f\u022c\u022d\f\n\2\2\u022d\u022e"+
                    "\7]\2\2\u022e\u0244\5X-\13\u022f\u0230\f\t\2\2\u0230\u0231\5Z.\2\u0231"+
                    "\u0232\5X-\n\u0232\u0244\3\2\2\2\u0233\u0234\f\33\2\2\u0234\u0235\7\20"+
                    "\2\2\u0235\u0236\5V,\2\u0236\u0237\7\21\2\2\u0237\u0244\3\2\2\2\u0238"+
                    "\u0239\f\32\2\2\u0239\u023a\7\33\2\2\u023a\u0244\5`\61\2\u023b\u023c\f"+
                    "\31\2\2\u023c\u0244\5R*\2\u023d\u023e\f\27\2\2\u023e\u023f\6-\20\2\u023f"+
                    "\u0244\7\34\2\2\u0240\u0241\f\26\2\2\u0241\u0242\6-\22\2\u0242\u0244\7"+
                    "\35\2\2\u0243\u0225\3\2\2\2\u0243\u0229\3\2\2\2\u0243\u022c\3\2\2\2\u0243"+
                    "\u022f\3\2\2\2\u0243\u0233\3\2\2\2\u0243\u0238\3\2\2\2\u0243\u023b\3\2"+
                    "\2\2\u0243\u023d\3\2\2\2\u0243\u0240\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
                    "\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246Y\3\2\2\2\u0247\u0245\3\2\2\2"+
                    "\u0248\u0249\t\2\2\2\u0249[\3\2\2\2\u024a\u0250\t\3\2\2\u024b\u0250\7"+
                    "B\2\2\u024c\u0250\7C\2\2\u024d\u0250\7D\2\2\u024e\u0250\7s\2\2\u024f\u024a"+
                    "\3\2\2\2\u024f\u024b\3\2\2\2\u024f\u024c\3\2\2\2\u024f\u024d\3\2\2\2\u024f"+
                    "\u024e\3\2\2\2\u0250]\3\2\2\2\u0251\u0252\t\4\2\2\u0252_\3\2\2\2\u0253"+
                    "\u0256\7t\2\2\u0254\u0256\5b\62\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2"+
                    "\2\2\u0256a\3\2\2\2\u0257\u025b\5d\63\2\u0258\u025b\5f\64\2\u0259\u025b"+
                    "\t\5\2\2\u025a\u0257\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b"+
                    "c\3\2\2\2\u025c\u025d\t\6\2\2\u025de\3\2\2\2\u025e\u025f\t\7\2\2\u025f"+
                    "g\3\2\2\2\u0260\u0261\6\65\23\2\u0261\u0262\7t\2\2\u0262\u0263\5N(\2\u0263"+
                    "i\3\2\2\2\u0264\u0265\6\66\24\2\u0265\u0266\7t\2\2\u0266\u0267\5N(\2\u0267"+
                    "k\3\2\2\2\u0268\u026d\7\26\2\2\u0269\u026d\7\2\2\3\u026a\u026d\6\67\25"+
                    "\2\u026b\u026d\6\67\26\2\u026c\u0268\3\2\2\2\u026c\u0269\3\2\2\2\u026c"+
                    "\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026dm\3\2\2\2\u026e\u026f\7\2\2\3"+
                    "\u026fo\3\2\2\2\u0270\u0271\t\b\2\2\u0271q\3\2\2\2Cw\u0080\u0084\u0089"+
                    "\u008e\u00a0\u00a4\u00a7\u00ac\u00b1\u00b8\u00bd\u00c6\u00cd\u00d1\u00da"+
                    "\u00e5\u00e9\u00ed\u00f7\u00fb\u0111\u0116\u0119\u011e\u0121\u0126\u0129"+
                    "\u0139\u013d\u013f\u0146\u014c\u0151\u015b\u016a\u0177\u017d\u0189\u018d"+
                    "\u0191\u0194\u0197\u019c\u01a1\u01a6\u01ac\u01b3\u01b7\u01be\u01d4\u01db"+
                    "\u01e1\u01ea\u01f2\u01f8\u01fc\u0206\u0223\u0243\u0245\u024f\u0255\u025a"+
                    "\u026c";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}