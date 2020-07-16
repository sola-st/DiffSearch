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
        enterRule(_localctx, 4, RULE_sourceElement);
        try {
            setState(141);
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
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(140);
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
            setState(159);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(143);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(144);
                    variableStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(145);
                    emptyStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(146);
                    if (!(_input.LA(1) != OpenBrace)) throw new FailedPredicateException(this, "_input.LA(1) != OpenBrace");
                    setState(147);
                    expressionStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(148);
                    ifStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(149);
                    iterationStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(150);
                    continueStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(151);
                    breakStatement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(152);
                    returnStatement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(153);
                    withStatement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(154);
                    labelledStatement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(155);
                    switchStatement();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(156);
                    throwStatement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(157);
                    tryStatement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(158);
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
                setState(161);
                match(OpenBrace);
                setState(163);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                    case 1:
                    {
                        setState(162);
                        statementList();
                    }
                    break;
                }
                setState(166);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                    case 1:
                    {
                        setState(165);
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
        public TerminalNode WILDCARD() { return getToken(ECMAScriptParser.WILDCARD, 0); }
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
            setState(174);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(169);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1:
                            {
                                {
                                    setState(168);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(171);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
                    } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(173);
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
                setState(176);
                match(Var);
                setState(177);
                variableDeclarationList();
                setState(179);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                    case 1:
                    {
                        setState(178);
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
                setState(181);
                variableDeclaration();
                setState(186);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(182);
                                match(Comma);
                                setState(183);
                                variableDeclaration();
                            }
                        }
                    }
                    setState(188);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
                setState(189);
                match(Identifier);
                setState(191);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
                    case 1:
                    {
                        setState(190);
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
                setState(193);
                match(Assign);
                setState(194);
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
                setState(196);
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
                setState(198);
                expressionSequence();
                setState(200);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
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
                setState(202);
                match(If);
                setState(203);
                match(OpenParen);
                setState(204);
                expressionSequence();
                setState(205);
                match(CloseParen);
                setState(207);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
                    case 1:
                    {
                        setState(206);
                        statement();
                    }
                    break;
                }
                setState(211);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
                    case 1:
                    {
                        setState(209);
                        match(Else);
                        setState(210);
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
            setState(275);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
                case 1:
                    _localctx = new DoStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(213);
                    match(Do);
                    setState(214);
                    statement();
                    setState(215);
                    match(While);
                    setState(216);
                    match(OpenParen);
                    setState(217);
                    expressionSequence();
                    setState(218);
                    match(CloseParen);
                    setState(220);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
                        case 1:
                        {
                            setState(219);
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
                    setState(222);
                    match(While);
                    setState(223);
                    match(OpenParen);
                    setState(224);
                    expressionSequence();
                    setState(225);
                    match(CloseParen);
                    setState(226);
                    statement();
                }
                break;
                case 3:
                    _localctx = new ForStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(228);
                    match(For);
                    setState(229);
                    match(OpenParen);
                    setState(231);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
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
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(234);
                            expressionSequence();
                        }
                    }

                    setState(237);
                    match(SemiColon);
                    setState(239);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(238);
                            expressionSequence();
                        }
                    }

                    setState(241);
                    match(CloseParen);
                    setState(242);
                    statement();
                }
                break;
                case 4:
                    _localctx = new ForVarStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(243);
                    match(For);
                    setState(244);
                    match(OpenParen);
                    setState(245);
                    match(Var);
                    setState(246);
                    variableDeclarationList();
                    setState(247);
                    match(SemiColon);
                    setState(249);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(248);
                            expressionSequence();
                        }
                    }

                    setState(251);
                    match(SemiColon);
                    setState(253);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(252);
                            expressionSequence();
                        }
                    }

                    setState(255);
                    match(CloseParen);
                    setState(256);
                    statement();
                }
                break;
                case 5:
                    _localctx = new ForInStatementContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(258);
                    match(For);
                    setState(259);
                    match(OpenParen);
                    setState(260);
                    singleExpression(0);
                    setState(261);
                    match(In);
                    setState(262);
                    expressionSequence();
                    setState(263);
                    match(CloseParen);
                    setState(264);
                    statement();
                }
                break;
                case 6:
                    _localctx = new ForVarInStatementContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(266);
                    match(For);
                    setState(267);
                    match(OpenParen);
                    setState(268);
                    match(Var);
                    setState(269);
                    variableDeclaration();
                    setState(270);
                    match(In);
                    setState(271);
                    expressionSequence();
                    setState(272);
                    match(CloseParen);
                    setState(273);
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
                setState(277);
                match(Continue);
                setState(280);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
                    case 1:
                    {
                        setState(278);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(279);
                        match(Identifier);
                    }
                    break;
                }
                setState(283);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
                    case 1:
                    {
                        setState(282);
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
                setState(285);
                match(Break);
                setState(288);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
                    case 1:
                    {
                        setState(286);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(287);
                        match(Identifier);
                    }
                    break;
                }
                setState(291);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
                    case 1:
                    {
                        setState(290);
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
                setState(293);
                match(Return);
                setState(296);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
                    case 1:
                    {
                        setState(294);
                        if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                        setState(295);
                        expressionSequence();
                    }
                    break;
                }
                setState(299);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
                    case 1:
                    {
                        setState(298);
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
                setState(301);
                match(With);
                setState(302);
                match(OpenParen);
                setState(303);
                expressionSequence();
                setState(304);
                match(CloseParen);
                setState(305);
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
                setState(307);
                match(Switch);
                setState(308);
                match(OpenParen);
                setState(309);
                expressionSequence();
                setState(310);
                match(CloseParen);
                setState(311);
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
                setState(313);
                match(OpenBrace);
                setState(315);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Case) {
                    {
                        setState(314);
                        caseClauses();
                    }
                }

                setState(321);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Default) {
                    {
                        setState(317);
                        defaultClause();
                        setState(319);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Case) {
                            {
                                setState(318);
                                caseClauses();
                            }
                        }

                    }
                }

                setState(323);
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
                setState(326);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(325);
                            caseClause();
                        }
                    }
                    setState(328);
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
                setState(330);
                match(Case);
                setState(331);
                expressionSequence();
                setState(332);
                match(Colon);
                setState(334);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
                    case 1:
                    {
                        setState(333);
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
                setState(336);
                match(Default);
                setState(337);
                match(Colon);
                setState(339);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
                    case 1:
                    {
                        setState(338);
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
                setState(341);
                match(Identifier);
                setState(342);
                match(Colon);
                setState(343);
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
                setState(345);
                match(Throw);
                setState(346);
                if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                setState(347);
                expressionSequence();
                setState(349);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
                    case 1:
                    {
                        setState(348);
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
            setState(364);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(351);
                    match(Try);
                    setState(352);
                    block();
                    setState(353);
                    catchProduction();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(355);
                    match(Try);
                    setState(356);
                    block();
                    setState(357);
                    finallyProduction();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(359);
                    match(Try);
                    setState(360);
                    block();
                    setState(361);
                    catchProduction();
                    setState(362);
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
                setState(366);
                match(Catch);
                setState(367);
                match(OpenParen);
                setState(368);
                match(Identifier);
                setState(369);
                match(CloseParen);
                setState(370);
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
                setState(372);
                match(Finally);
                setState(373);
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
                setState(375);
                match(Debugger);
                setState(377);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
                    case 1:
                    {
                        setState(376);
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
                setState(379);
                match(Function);
                setState(380);
                match(Identifier);
                setState(381);
                match(OpenParen);
                setState(383);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Identifier) {
                    {
                        setState(382);
                        formalParameterList();
                    }
                }

                setState(385);
                match(CloseParen);
                setState(386);
                match(OpenBrace);
                setState(387);
                functionBody();
                setState(388);
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
                setState(390);
                match(Identifier);
                setState(395);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==Comma) {
                    {
                        {
                            setState(391);
                            match(Comma);
                            setState(392);
                            match(Identifier);
                        }
                    }
                    setState(397);
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
                setState(399);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
                    case 1:
                    {
                        setState(398);
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
                setState(401);
                match(OpenBracket);
                setState(403);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
                    case 1:
                    {
                        setState(402);
                        elementList();
                    }
                    break;
                }
                setState(406);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
                    case 1:
                    {
                        setState(405);
                        match(Comma);
                    }
                    break;
                }
                setState(409);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Comma) {
                    {
                        setState(408);
                        elision();
                    }
                }

                setState(411);
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
                setState(414);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==Comma) {
                    {
                        setState(413);
                        elision();
                    }
                }

                setState(416);
                singleExpression(0);
                setState(424);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,46,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(417);
                                match(Comma);
                                setState(419);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==Comma) {
                                    {
                                        setState(418);
                                        elision();
                                    }
                                }

                                setState(421);
                                singleExpression(0);
                            }
                        }
                    }
                    setState(426);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
                setState(428);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(427);
                            match(Comma);
                        }
                    }
                    setState(430);
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
            setState(441);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(432);
                    match(OpenBrace);
                    setState(433);
                    match(CloseBrace);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(434);
                    match(OpenBrace);
                    setState(435);
                    propertyNameAndValueList();
                    setState(437);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==Comma) {
                        {
                            setState(436);
                            match(Comma);
                        }
                    }

                    setState(439);
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
                setState(443);
                propertyAssignment();
                setState(448);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,50,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(444);
                                match(Comma);
                                setState(445);
                                propertyAssignment();
                            }
                        }
                    }
                    setState(450);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
            setState(470);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
                case 1:
                    _localctx = new PropertyExpressionAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(451);
                    propertyName();
                    setState(452);
                    match(Colon);
                    setState(453);
                    singleExpression(0);
                }
                break;
                case 2:
                    _localctx = new PropertyGetterContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(455);
                    getter();
                    setState(456);
                    match(OpenParen);
                    setState(457);
                    match(CloseParen);
                    setState(458);
                    match(OpenBrace);
                    setState(459);
                    functionBody();
                    setState(460);
                    match(CloseBrace);
                }
                break;
                case 3:
                    _localctx = new PropertySetterContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(462);
                    setter();
                    setState(463);
                    match(OpenParen);
                    setState(464);
                    propertySetParameterList();
                    setState(465);
                    match(CloseParen);
                    setState(466);
                    match(OpenBrace);
                    setState(467);
                    functionBody();
                    setState(468);
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
            setState(477);
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
                    setState(472);
                    identifierName();
                }
                break;
                case StringLiteral:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(473);
                    match(StringLiteral);
                }
                break;
                case DecimalLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(474);
                    match(DecimalLiteral);
                }
                break;
                case HexIntegerLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(475);
                    match(HexIntegerLiteral);
                }
                break;
                case OctalIntegerLiteral:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(476);
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
                setState(479);
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
                setState(481);
                match(OpenParen);
                setState(483);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DecimalLiteral - 64)) | (1L << (HexIntegerLiteral - 64)) | (1L << (OctalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (EXPR - 64)) | (1L << (WILDCARD - 64)) | (1L << (LITERALS - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                    {
                        setState(482);
                        argumentList();
                    }
                }

                setState(485);
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
                setState(487);
                singleExpression(0);
                setState(492);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==Comma) {
                    {
                        {
                            setState(488);
                            match(Comma);
                            setState(489);
                            singleExpression(0);
                        }
                    }
                    setState(494);
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
                setState(495);
                singleExpression(0);
                setState(500);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,55,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(496);
                                match(Comma);
                                setState(497);
                                singleExpression(0);
                            }
                        }
                    }
                    setState(502);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
    public static class TernaryExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterTernaryExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitTernaryExpression(this);
        }
    }
    public static class ExprExpressionContext extends SingleExpressionContext {
        public TerminalNode EXPR() { return getToken(ECMAScriptParser.EXPR, 0); }
        public ExprExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterExprExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitExprExpression(this);
        }
    }
    public static class LogicalAndExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterLogicalAndExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitLogicalAndExpression(this);
        }
    }
    public static class PreIncrementExpressionContext extends SingleExpressionContext {
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
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
    public static class LogicalOrExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterLogicalOrExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitLogicalOrExpression(this);
        }
    }
    public static class NotExpressionContext extends SingleExpressionContext {
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
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
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
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
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
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
    public static class AssignmentExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public AssignmentOperatorContext assignmentOperator() {
            return getRuleContext(AssignmentOperatorContext.class,0);
        }
        public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterAssignmentExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitAssignmentExpression(this);
        }
    }
    public static class PostDecreaseExpressionContext extends SingleExpressionContext {
        public SingleExpressionContext singleExpression() {
            return getRuleContext(SingleExpressionContext.class,0);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
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
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
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
    public static class EqualityExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterEqualityExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitEqualityExpression(this);
        }
    }
    public static class BitXOrExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBitXOrExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBitXOrExpression(this);
        }
    }
    public static class MultiplicativeExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterMultiplicativeExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitMultiplicativeExpression(this);
        }
    }
    public static class BitShiftExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBitShiftExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBitShiftExpression(this);
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
    public static class AdditiveExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterAdditiveExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitAdditiveExpression(this);
        }
    }
    public static class RelationalExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterRelationalExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitRelationalExpression(this);
        }
    }
    public static class PostIncrementExpressionContext extends SingleExpressionContext {
        public SingleExpressionContext singleExpression() {
            return getRuleContext(SingleExpressionContext.class,0);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
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
    public static class GeneralExpressionContext extends SingleExpressionContext {
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public SingleExpressionContext singleExpression() {
            return getRuleContext(SingleExpressionContext.class,0);
        }
        public GeneralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterGeneralExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitGeneralExpression(this);
        }
    }
    public static class BitNotExpressionContext extends SingleExpressionContext {
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
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
    public static class BitAndExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBitAndExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBitAndExpression(this);
        }
    }
    public static class BitOrExpressionContext extends SingleExpressionContext {
        public List<SingleExpressionContext> singleExpression() {
            return getRuleContexts(SingleExpressionContext.class);
        }
        public SingleExpressionContext singleExpression(int i) {
            return getRuleContext(SingleExpressionContext.class,i);
        }
        public BinOperatorContext binOperator() {
            return getRuleContext(BinOperatorContext.class,0);
        }
        public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).enterBitOrExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ECMAScriptListener ) ((ECMAScriptListener)listener).exitBitOrExpression(this);
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
                setState(560);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
                    case 1:
                    {
                        _localctx = new FunctionExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(504);
                        match(Function);
                        setState(506);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Identifier) {
                            {
                                setState(505);
                                match(Identifier);
                            }
                        }

                        setState(508);
                        match(OpenParen);
                        setState(510);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==Identifier) {
                            {
                                setState(509);
                                formalParameterList();
                            }
                        }

                        setState(512);
                        match(CloseParen);
                        setState(513);
                        match(OpenBrace);
                        setState(514);
                        functionBody();
                        setState(515);
                        match(CloseBrace);
                    }
                    break;
                    case 2:
                    {
                        _localctx = new NewExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(517);
                        match(New);
                        setState(518);
                        singleExpression(0);
                        setState(520);
                        _errHandler.sync(this);
                        switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
                            case 1:
                            {
                                setState(519);
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
                        setState(522);
                        match(Delete);
                        setState(523);
                        singleExpression(33);
                    }
                    break;
                    case 4:
                    {
                        _localctx = new VoidExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(524);
                        match(Void);
                        setState(525);
                        singleExpression(32);
                    }
                    break;
                    case 5:
                    {
                        _localctx = new TypeofExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(526);
                        match(Typeof);
                        setState(527);
                        singleExpression(31);
                    }
                    break;
                    case 6:
                    {
                        _localctx = new PreIncrementExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(528);
                        binOperator();
                        setState(529);
                        singleExpression(30);
                    }
                    break;
                    case 7:
                    {
                        _localctx = new PreDecreaseExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(531);
                        binOperator();
                        setState(532);
                        singleExpression(29);
                    }
                    break;
                    case 8:
                    {
                        _localctx = new UnaryPlusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(534);
                        binOperator();
                        setState(535);
                        singleExpression(28);
                    }
                    break;
                    case 9:
                    {
                        _localctx = new UnaryMinusExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(537);
                        binOperator();
                        setState(538);
                        singleExpression(27);
                    }
                    break;
                    case 10:
                    {
                        _localctx = new BitNotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(540);
                        binOperator();
                        setState(541);
                        singleExpression(26);
                    }
                    break;
                    case 11:
                    {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(543);
                        binOperator();
                        setState(544);
                        singleExpression(25);
                    }
                    break;
                    case 12:
                    {
                        _localctx = new GeneralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(546);
                        binOperator();
                        setState(547);
                        singleExpression(24);
                    }
                    break;
                    case 13:
                    {
                        _localctx = new WildcardContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(549);
                        match(WILDCARD);
                    }
                    break;
                    case 14:
                    {
                        _localctx = new ThisExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(550);
                        match(This);
                    }
                    break;
                    case 15:
                    {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(551);
                        match(Identifier);
                    }
                    break;
                    case 16:
                    {
                        _localctx = new ExprExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(552);
                        match(EXPR);
                    }
                    break;
                    case 17:
                    {
                        _localctx = new LiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(553);
                        literal();
                    }
                    break;
                    case 18:
                    {
                        _localctx = new ArrayLiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(554);
                        arrayLiteral();
                    }
                    break;
                    case 19:
                    {
                        _localctx = new ObjectLiteralExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(555);
                        objectLiteral();
                    }
                    break;
                    case 20:
                    {
                        _localctx = new ParenthesizedExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(556);
                        match(OpenParen);
                        setState(557);
                        expressionSequence();
                        setState(558);
                        match(CloseParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(640);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,61,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(638);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(562);
                                    if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(563);
                                    binOperator();
                                    setState(564);
                                    singleExpression(24);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(566);
                                    if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(567);
                                    binOperator();
                                    setState(568);
                                    singleExpression(23);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(570);
                                    if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(571);
                                    binOperator();
                                    setState(572);
                                    singleExpression(22);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(574);
                                    if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(575);
                                    binOperator();
                                    setState(576);
                                    singleExpression(21);
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(578);
                                    if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(579);
                                    match(Instanceof);
                                    setState(580);
                                    singleExpression(20);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(581);
                                    if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(582);
                                    match(In);
                                    setState(583);
                                    singleExpression(19);
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(584);
                                    if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(585);
                                    binOperator();
                                    setState(586);
                                    singleExpression(18);
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(588);
                                    if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(589);
                                    binOperator();
                                    setState(590);
                                    singleExpression(17);
                                }
                                break;
                                case 9:
                                {
                                    _localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(592);
                                    if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(593);
                                    binOperator();
                                    setState(594);
                                    singleExpression(16);
                                }
                                break;
                                case 10:
                                {
                                    _localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(596);
                                    if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(597);
                                    binOperator();
                                    setState(598);
                                    singleExpression(15);
                                }
                                break;
                                case 11:
                                {
                                    _localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(600);
                                    if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(601);
                                    binOperator();
                                    setState(602);
                                    singleExpression(14);
                                }
                                break;
                                case 12:
                                {
                                    _localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(604);
                                    if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(605);
                                    binOperator();
                                    setState(606);
                                    singleExpression(13);
                                }
                                break;
                                case 13:
                                {
                                    _localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(608);
                                    if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(609);
                                    match(QuestionMark);
                                    setState(610);
                                    singleExpression(0);
                                    setState(611);
                                    match(Colon);
                                    setState(612);
                                    singleExpression(12);
                                }
                                break;
                                case 14:
                                {
                                    _localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(614);
                                    if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(615);
                                    assignmentOperator();
                                    setState(616);
                                    singleExpression(11);
                                }
                                break;
                                case 15:
                                {
                                    _localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(618);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(619);
                                    assignmentOperator();
                                    setState(620);
                                    singleExpression(10);
                                }
                                break;
                                case 16:
                                {
                                    _localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(622);
                                    if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
                                    setState(623);
                                    match(OpenBracket);
                                    setState(624);
                                    expressionSequence();
                                    setState(625);
                                    match(CloseBracket);
                                }
                                break;
                                case 17:
                                {
                                    _localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(627);
                                    if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
                                    setState(628);
                                    match(Dot);
                                    setState(629);
                                    identifierName();
                                }
                                break;
                                case 18:
                                {
                                    _localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(630);
                                    if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
                                    setState(631);
                                    arguments();
                                }
                                break;
                                case 19:
                                {
                                    _localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(632);
                                    if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
                                    setState(633);
                                    if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                                    setState(634);
                                    binOperator();
                                }
                                break;
                                case 20:
                                {
                                    _localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                                    setState(635);
                                    if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
                                    setState(636);
                                    if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
                                    setState(637);
                                    binOperator();
                                }
                                break;
                            }
                        }
                    }
                    setState(642);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
                setState(643);
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
            setState(650);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case RegularExpressionLiteral:
                case NullLiteral:
                case BooleanLiteral:
                case StringLiteral:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(645);
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
                    setState(646);
                    match(DecimalLiteral);
                }
                break;
                case HexIntegerLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(647);
                    match(HexIntegerLiteral);
                }
                break;
                case OctalIntegerLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(648);
                    match(OctalIntegerLiteral);
                }
                break;
                case LITERALS:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(649);
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
                setState(652);
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
            setState(656);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(654);
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
                    setState(655);
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
            setState(661);
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
                    setState(658);
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
                    setState(659);
                    futureReservedWord();
                }
                break;
                case NullLiteral:
                case BooleanLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(660);
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
                setState(663);
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
                setState(665);
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
                setState(667);
                if (!(_input.LT(1).getText().equals("get"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"get\")");
                setState(668);
                match(Identifier);
                setState(669);
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
                setState(671);
                if (!(_input.LT(1).getText().equals("set"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"set\")");
                setState(672);
                match(Identifier);
                setState(673);
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
            setState(679);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(675);
                    match(SemiColon);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(676);
                    match(EOF);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(677);
                    if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(678);
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
                setState(681);
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
                setState(683);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals) | (1L << BitAnd) | (1L << BitXOr) | (1L << BitOr) | (1L << And) | (1L << Or))) != 0)) ) {
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
                return precpred(_ctx, 23);
            case 7:
                return precpred(_ctx, 22);
            case 8:
                return precpred(_ctx, 21);
            case 9:
                return precpred(_ctx, 20);
            case 10:
                return precpred(_ctx, 19);
            case 11:
                return precpred(_ctx, 18);
            case 12:
                return precpred(_ctx, 17);
            case 13:
                return precpred(_ctx, 16);
            case 14:
                return precpred(_ctx, 15);
            case 15:
                return precpred(_ctx, 14);
            case 16:
                return precpred(_ctx, 13);
            case 17:
                return precpred(_ctx, 12);
            case 18:
                return precpred(_ctx, 11);
            case 19:
                return precpred(_ctx, 10);
            case 20:
                return precpred(_ctx, 9);
            case 21:
                return precpred(_ctx, 39);
            case 22:
                return precpred(_ctx, 38);
            case 23:
                return precpred(_ctx, 37);
            case 24:
                return precpred(_ctx, 35);
            case 25:
                return !here(LineTerminator);
            case 26:
                return precpred(_ctx, 34);
            case 27:
                return !here(LineTerminator);
        }
        return true;
    }
    private boolean getter_sempred(GetterContext _localctx, int predIndex) {
        switch (predIndex) {
            case 28:
                return _input.LT(1).getText().equals("get");
        }
        return true;
    }
    private boolean setter_sempred(SetterContext _localctx, int predIndex) {
        switch (predIndex) {
            case 29:
                return _input.LT(1).getText().equals("set");
        }
        return true;
    }
    private boolean eos_sempred(EosContext _localctx, int predIndex) {
        switch (predIndex) {
            case 30:
                return lineTerminatorAhead();
            case 31:
                return _input.LT(1).getType() == CloseBrace;
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u02b0\4\2\t\2\4"+
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\7\2v\n\2\f\2"+
                    "\16\2y\13\2\3\2\3\2\3\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2\5\2\u0085"+
                    "\n\2\3\3\6\3\u0088\n\3\r\3\16\3\u0089\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3"+
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a2"+
                    "\n\5\3\6\3\6\5\6\u00a6\n\6\3\6\5\6\u00a9\n\6\3\7\6\7\u00ac\n\7\r\7\16"+
                    "\7\u00ad\3\7\5\7\u00b1\n\7\3\b\3\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t\7\t\u00bb"+
                    "\n\t\f\t\16\t\u00be\13\t\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\f\3\f"+
                    "\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d2\n\16\3\16\3"+
                    "\16\5\16\u00d6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17"+
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\17\3\17"+
                    "\5\17\u00ee\n\17\3\17\3\17\5\17\u00f2\n\17\3\17\3\17\3\17\3\17\3\17\3"+
                    "\17\3\17\3\17\5\17\u00fc\n\17\3\17\3\17\5\17\u0100\n\17\3\17\3\17\3\17"+
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
                    "\3\17\3\17\3\17\5\17\u0116\n\17\3\20\3\20\3\20\5\20\u011b\n\20\3\20\5"+
                    "\20\u011e\n\20\3\21\3\21\3\21\5\21\u0123\n\21\3\21\5\21\u0126\n\21\3\22"+
                    "\3\22\3\22\5\22\u012b\n\22\3\22\5\22\u012e\n\22\3\23\3\23\3\23\3\23\3"+
                    "\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u013e\n\25\3\25"+
                    "\3\25\5\25\u0142\n\25\5\25\u0144\n\25\3\25\3\25\3\26\6\26\u0149\n\26\r"+
                    "\26\16\26\u014a\3\27\3\27\3\27\3\27\5\27\u0151\n\27\3\30\3\30\3\30\5\30"+
                    "\u0156\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0160\n\32\3"+
                    "\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016f"+
                    "\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\5\36\u017c"+
                    "\n\36\3\37\3\37\3\37\3\37\5\37\u0182\n\37\3\37\3\37\3\37\3\37\3\37\3 "+
                    "\3 \3 \7 \u018c\n \f \16 \u018f\13 \3!\5!\u0192\n!\3\"\3\"\5\"\u0196\n"+
                    "\"\3\"\5\"\u0199\n\"\3\"\5\"\u019c\n\"\3\"\3\"\3#\5#\u01a1\n#\3#\3#\3"+
                    "#\5#\u01a6\n#\3#\7#\u01a9\n#\f#\16#\u01ac\13#\3$\6$\u01af\n$\r$\16$\u01b0"+
                    "\3%\3%\3%\3%\3%\5%\u01b8\n%\3%\3%\5%\u01bc\n%\3&\3&\3&\7&\u01c1\n&\f&"+
                    "\16&\u01c4\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
                    "\3\'\3\'\3\'\3\'\3\'\5\'\u01d9\n\'\3(\3(\3(\3(\3(\5(\u01e0\n(\3)\3)\3"+
                    "*\3*\5*\u01e6\n*\3*\3*\3+\3+\3+\7+\u01ed\n+\f+\16+\u01f0\13+\3,\3,\3,"+
                    "\7,\u01f5\n,\f,\16,\u01f8\13,\3-\3-\3-\5-\u01fd\n-\3-\3-\5-\u0201\n-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\5-\u020b\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\5-\u0233\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
                    "-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0281\n-\f-\16-\u0284\13"+
                    "-\3.\3.\3/\3/\3/\3/\3/\5/\u028d\n/\3\60\3\60\3\61\3\61\5\61\u0293\n\61"+
                    "\3\62\3\62\3\62\5\62\u0298\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65"+
                    "\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u02aa\n\67\38\38\39\39\3"+
                    "9\2\3X:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
                    "<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\t\5\2\4\b\30\30\65?\5\2\16\16@Auu\3\2B"+
                    "D\3\2@A\3\2E^\3\2_n\4\2\t\r\34\64\2\u02fa\2r\3\2\2\2\4\u0087\3\2\2\2\6"+
                    "\u008f\3\2\2\2\b\u00a1\3\2\2\2\n\u00a3\3\2\2\2\f\u00b0\3\2\2\2\16\u00b2"+
                    "\3\2\2\2\20\u00b7\3\2\2\2\22\u00bf\3\2\2\2\24\u00c3\3\2\2\2\26\u00c6\3"+
                    "\2\2\2\30\u00c8\3\2\2\2\32\u00cc\3\2\2\2\34\u0115\3\2\2\2\36\u0117\3\2"+
                    "\2\2 \u011f\3\2\2\2\"\u0127\3\2\2\2$\u012f\3\2\2\2&\u0135\3\2\2\2(\u013b"+
                    "\3\2\2\2*\u0148\3\2\2\2,\u014c\3\2\2\2.\u0152\3\2\2\2\60\u0157\3\2\2\2"+
                    "\62\u015b\3\2\2\2\64\u016e\3\2\2\2\66\u0170\3\2\2\28\u0176\3\2\2\2:\u0179"+
                    "\3\2\2\2<\u017d\3\2\2\2>\u0188\3\2\2\2@\u0191\3\2\2\2B\u0193\3\2\2\2D"+
                    "\u01a0\3\2\2\2F\u01ae\3\2\2\2H\u01bb\3\2\2\2J\u01bd\3\2\2\2L\u01d8\3\2"+
                    "\2\2N\u01df\3\2\2\2P\u01e1\3\2\2\2R\u01e3\3\2\2\2T\u01e9\3\2\2\2V\u01f1"+
                    "\3\2\2\2X\u0232\3\2\2\2Z\u0285\3\2\2\2\\\u028c\3\2\2\2^\u028e\3\2\2\2"+
                    "`\u0292\3\2\2\2b\u0297\3\2\2\2d\u0299\3\2\2\2f\u029b\3\2\2\2h\u029d\3"+
                    "\2\2\2j\u02a1\3\2\2\2l\u02a9\3\2\2\2n\u02ab\3\2\2\2p\u02ad\3\2\2\2rw\5"+
                    "\4\3\2st\7r\2\2tv\5\4\3\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3"+
                    "\2\2\2yw\3\2\2\2z{\7\3\2\2{\u0080\5\4\3\2|}\7r\2\2}\177\5\4\3\2~|\3\2"+
                    "\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084"+
                    "\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\7\2\2\3\u0084\u0083\3\2\2\2\u0084"+
                    "\u0085\3\2\2\2\u0085\3\3\2\2\2\u0086\u0088\5\6\4\2\u0087\u0086\3\2\2\2"+
                    "\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\5\3"+
                    "\2\2\2\u008b\u008c\6\4\2\2\u008c\u0090\5\b\5\2\u008d\u0090\5<\37\2\u008e"+
                    "\u0090\7q\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
                    "\2\2\u0090\7\3\2\2\2\u0091\u00a2\5\n\6\2\u0092\u00a2\5\16\b\2\u0093\u00a2"+
                    "\5\26\f\2\u0094\u0095\6\5\3\2\u0095\u00a2\5\30\r\2\u0096\u00a2\5\32\16"+
                    "\2\u0097\u00a2\5\34\17\2\u0098\u00a2\5\36\20\2\u0099\u00a2\5 \21\2\u009a"+
                    "\u00a2\5\"\22\2\u009b\u00a2\5$\23\2\u009c\u00a2\5\60\31\2\u009d\u00a2"+
                    "\5&\24\2\u009e\u00a2\5\62\32\2\u009f\u00a2\5\64\33\2\u00a0\u00a2\5:\36"+
                    "\2\u00a1\u0091\3\2\2\2\u00a1\u0092\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u0094"+
                    "\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1"+
                    "\u0099\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2"+
                    "\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
                    "\u00a0\3\2\2\2\u00a2\t\3\2\2\2\u00a3\u00a5\7\24\2\2\u00a4\u00a6\5\f\7"+
                    "\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9"+
                    "\7\25\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\13\3\2\2\2\u00aa"+
                    "\u00ac\5\b\5\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2"+
                    "\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\7q\2\2\u00b0"+
                    "\u00ab\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b3\7L\2\2"+
                    "\u00b3\u00b5\5\20\t\2\u00b4\u00b6\7\26\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6"+
                    "\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00bc\5\22\n\2\u00b8\u00b9\7\27\2\2\u00b9"+
                    "\u00bb\5\22\n\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
                    "\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
                    "\u00c1\7t\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3"+
                    "\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\5X-\2\u00c5\25"+
                    "\3\2\2\2\u00c6\u00c7\7\26\2\2\u00c7\27\3\2\2\2\u00c8\u00ca\5V,\2\u00c9"+
                    "\u00cb\7\26\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\31\3\2\2"+
                    "\2\u00cc\u00cd\7Z\2\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5V,\2\u00cf\u00d1"+
                    "\7\23\2\2\u00d0\u00d2\5\b\5\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2"+
                    "\u00d2\u00d5\3\2\2\2\u00d3\u00d4\7J\2\2\u00d4\u00d6\5\b\5\2\u00d5\u00d3"+
                    "\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d8\7F\2\2\u00d8"+
                    "\u00d9\5\b\5\2\u00d9\u00da\7T\2\2\u00da\u00db\7\22\2\2\u00db\u00dc\5V"+
                    ",\2\u00dc\u00de\7\23\2\2\u00dd\u00df\7\26\2\2\u00de\u00dd\3\2\2\2\u00de"+
                    "\u00df\3\2\2\2\u00df\u0116\3\2\2\2\u00e0\u00e1\7T\2\2\u00e1\u00e2\7\22"+
                    "\2\2\u00e2\u00e3\5V,\2\u00e3\u00e4\7\23\2\2\u00e4\u00e5\5\b\5\2\u00e5"+
                    "\u0116\3\2\2\2\u00e6\u00e7\7R\2\2\u00e7\u00e9\7\22\2\2\u00e8\u00ea\5V"+
                    ",\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
                    "\u00ed\7\26\2\2\u00ec\u00ee\5V,\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2"+
                    "\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7\26\2\2\u00f0\u00f2\5V,\2\u00f1"+
                    "\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\23"+
                    "\2\2\u00f4\u0116\5\b\5\2\u00f5\u00f6\7R\2\2\u00f6\u00f7\7\22\2\2\u00f7"+
                    "\u00f8\7L\2\2\u00f8\u00f9\5\20\t\2\u00f9\u00fb\7\26\2\2\u00fa\u00fc\5"+
                    "V,\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
                    "\u00ff\7\26\2\2\u00fe\u0100\5V,\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2"+
                    "\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\23\2\2\u0102\u0103\5\b\5\2\u0103"+
                    "\u0116\3\2\2\2\u0104\u0105\7R\2\2\u0105\u0106\7\22\2\2\u0106\u0107\5X"+
                    "-\2\u0107\u0108\7]\2\2\u0108\u0109\5V,\2\u0109\u010a\7\23\2\2\u010a\u010b"+
                    "\5\b\5\2\u010b\u0116\3\2\2\2\u010c\u010d\7R\2\2\u010d\u010e\7\22\2\2\u010e"+
                    "\u010f\7L\2\2\u010f\u0110\5\22\n\2\u0110\u0111\7]\2\2\u0111\u0112\5V,"+
                    "\2\u0112\u0113\7\23\2\2\u0113\u0114\5\b\5\2\u0114\u0116\3\2\2\2\u0115"+
                    "\u00d7\3\2\2\2\u0115\u00e0\3\2\2\2\u0115\u00e6\3\2\2\2\u0115\u00f5\3\2"+
                    "\2\2\u0115\u0104\3\2\2\2\u0115\u010c\3\2\2\2\u0116\35\3\2\2\2\u0117\u011a"+
                    "\7Q\2\2\u0118\u0119\6\20\4\2\u0119\u011b\7t\2\2\u011a\u0118\3\2\2\2\u011a"+
                    "\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\7\26\2\2\u011d\u011c\3"+
                    "\2\2\2\u011d\u011e\3\2\2\2\u011e\37\3\2\2\2\u011f\u0122\7E\2\2\u0120\u0121"+
                    "\6\21\5\2\u0121\u0123\7t\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
                    "\u0125\3\2\2\2\u0124\u0126\7\26\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3"+
                    "\2\2\2\u0126!\3\2\2\2\u0127\u012a\7O\2\2\u0128\u0129\6\22\6\2\u0129\u012b"+
                    "\5V,\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
                    "\u012e\7\26\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e#\3\2\2\2"+
                    "\u012f\u0130\7X\2\2\u0130\u0131\7\22\2\2\u0131\u0132\5V,\2\u0132\u0133"+
                    "\7\23\2\2\u0133\u0134\5\b\5\2\u0134%\3\2\2\2\u0135\u0136\7S\2\2\u0136"+
                    "\u0137\7\22\2\2\u0137\u0138\5V,\2\u0138\u0139\7\23\2\2\u0139\u013a\5("+
                    "\25\2\u013a\'\3\2\2\2\u013b\u013d\7\24\2\2\u013c\u013e\5*\26\2\u013d\u013c"+
                    "\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u0141\5.\30\2\u0140"+
                    "\u0142\5*\26\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
                    "\2\2\u0143\u013f\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
                    "\u0146\7\25\2\2\u0146)\3\2\2\2\u0147\u0149\5,\27\2\u0148\u0147\3\2\2\2"+
                    "\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b+\3"+
                    "\2\2\2\u014c\u014d\7I\2\2\u014d\u014e\5V,\2\u014e\u0150\7\32\2\2\u014f"+
                    "\u0151\5\f\7\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151-\3\2\2\2"+
                    "\u0152\u0153\7Y\2\2\u0153\u0155\7\32\2\2\u0154\u0156\5\f\7\2\u0155\u0154"+
                    "\3\2\2\2\u0155\u0156\3\2\2\2\u0156/\3\2\2\2\u0157\u0158\7t\2\2\u0158\u0159"+
                    "\7\32\2\2\u0159\u015a\5\b\5\2\u015a\61\3\2\2\2\u015b\u015c\7[\2\2\u015c"+
                    "\u015d\6\32\7\2\u015d\u015f\5V,\2\u015e\u0160\7\26\2\2\u015f\u015e\3\2"+
                    "\2\2\u015f\u0160\3\2\2\2\u0160\63\3\2\2\2\u0161\u0162\7^\2\2\u0162\u0163"+
                    "\5\n\6\2\u0163\u0164\5\66\34\2\u0164\u016f\3\2\2\2\u0165\u0166\7^\2\2"+
                    "\u0166\u0167\5\n\6\2\u0167\u0168\58\35\2\u0168\u016f\3\2\2\2\u0169\u016a"+
                    "\7^\2\2\u016a\u016b\5\n\6\2\u016b\u016c\5\66\34\2\u016c\u016d\58\35\2"+
                    "\u016d\u016f\3\2\2\2\u016e\u0161\3\2\2\2\u016e\u0165\3\2\2\2\u016e\u0169"+
                    "\3\2\2\2\u016f\65\3\2\2\2\u0170\u0171\7M\2\2\u0171\u0172\7\22\2\2\u0172"+
                    "\u0173\7t\2\2\u0173\u0174\7\23\2\2\u0174\u0175\5\n\6\2\u0175\67\3\2\2"+
                    "\2\u0176\u0177\7N\2\2\u0177\u0178\5\n\6\2\u01789\3\2\2\2\u0179\u017b\7"+
                    "U\2\2\u017a\u017c\7\26\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
                    ";\3\2\2\2\u017d\u017e\7V\2\2\u017e\u017f\7t\2\2\u017f\u0181\7\22\2\2\u0180"+
                    "\u0182\5> \2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2"+
                    "\2\u0183\u0184\7\23\2\2\u0184\u0185\7\24\2\2\u0185\u0186\5@!\2\u0186\u0187"+
                    "\7\25\2\2\u0187=\3\2\2\2\u0188\u018d\7t\2\2\u0189\u018a\7\27\2\2\u018a"+
                    "\u018c\7t\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
                    "\2\2\u018d\u018e\3\2\2\2\u018e?\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192"+
                    "\5\4\3\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192A\3\2\2\2\u0193"+
                    "\u0195\7\20\2\2\u0194\u0196\5D#\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2"+
                    "\2\2\u0196\u0198\3\2\2\2\u0197\u0199\7\27\2\2\u0198\u0197\3\2\2\2\u0198"+
                    "\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\5F$\2\u019b\u019a\3\2\2"+
                    "\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\21\2\2\u019e"+
                    "C\3\2\2\2\u019f\u01a1\5F$\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
                    "\u01a2\3\2\2\2\u01a2\u01aa\5X-\2\u01a3\u01a5\7\27\2\2\u01a4\u01a6\5F$"+
                    "\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9"+
                    "\5X-\2\u01a8\u01a3\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
                    "\u01ab\3\2\2\2\u01abE\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\7\27\2\2"+
                    "\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
                    "\3\2\2\2\u01b1G\3\2\2\2\u01b2\u01b3\7\24\2\2\u01b3\u01bc\7\25\2\2\u01b4"+
                    "\u01b5\7\24\2\2\u01b5\u01b7\5J&\2\u01b6\u01b8\7\27\2\2\u01b7\u01b6\3\2"+
                    "\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\25\2\2\u01ba"+
                    "\u01bc\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bcI\3\2\2\2"+
                    "\u01bd\u01c2\5L\'\2\u01be\u01bf\7\27\2\2\u01bf\u01c1\5L\'\2\u01c0\u01be"+
                    "\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
                    "K\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\5N(\2\u01c6\u01c7\7\32\2\2\u01c7"+
                    "\u01c8\5X-\2\u01c8\u01d9\3\2\2\2\u01c9\u01ca\5h\65\2\u01ca\u01cb\7\22"+
                    "\2\2\u01cb\u01cc\7\23\2\2\u01cc\u01cd\7\24\2\2\u01cd\u01ce\5@!\2\u01ce"+
                    "\u01cf\7\25\2\2\u01cf\u01d9\3\2\2\2\u01d0\u01d1\5j\66\2\u01d1\u01d2\7"+
                    "\22\2\2\u01d2\u01d3\5P)\2\u01d3\u01d4\7\23\2\2\u01d4\u01d5\7\24\2\2\u01d5"+
                    "\u01d6\5@!\2\u01d6\u01d7\7\25\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01c5\3\2"+
                    "\2\2\u01d8\u01c9\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d9M\3\2\2\2\u01da\u01e0"+
                    "\5`\61\2\u01db\u01e0\7u\2\2\u01dc\u01e0\7B\2\2\u01dd\u01e0\7C\2\2\u01de"+
                    "\u01e0\7D\2\2\u01df\u01da\3\2\2\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2"+
                    "\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0O\3\2\2\2\u01e1\u01e2"+
                    "\7t\2\2\u01e2Q\3\2\2\2\u01e3\u01e5\7\22\2\2\u01e4\u01e6\5T+\2\u01e5\u01e4"+
                    "\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7\23\2\2"+
                    "\u01e8S\3\2\2\2\u01e9\u01ee\5X-\2\u01ea\u01eb\7\27\2\2\u01eb\u01ed\5X"+
                    "-\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
                    "\u01ef\3\2\2\2\u01efU\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f6\5X-\2\u01f2"+
                    "\u01f3\7\27\2\2\u01f3\u01f5\5X-\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2"+
                    "\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7W\3\2\2\2\u01f8\u01f6"+
                    "\3\2\2\2\u01f9\u01fa\b-\1\2\u01fa\u01fc\7V\2\2\u01fb\u01fd\7t\2\2\u01fc"+
                    "\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\7\22"+
                    "\2\2\u01ff\u0201\5> \2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
                    "\3\2\2\2\u0202\u0203\7\23\2\2\u0203\u0204\7\24\2\2\u0204\u0205\5@!\2\u0205"+
                    "\u0206\7\25\2\2\u0206\u0233\3\2\2\2\u0207\u0208\7K\2\2\u0208\u020a\5X"+
                    "-\2\u0209\u020b\5R*\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0233"+
                    "\3\2\2\2\u020c\u020d\7\\\2\2\u020d\u0233\5X-#\u020e\u020f\7P\2\2\u020f"+
                    "\u0233\5X-\"\u0210\u0211\7H\2\2\u0211\u0233\5X-!\u0212\u0213\5p9\2\u0213"+
                    "\u0214\5X- \u0214\u0233\3\2\2\2\u0215\u0216\5p9\2\u0216\u0217\5X-\37\u0217"+
                    "\u0233\3\2\2\2\u0218\u0219\5p9\2\u0219\u021a\5X-\36\u021a\u0233\3\2\2"+
                    "\2\u021b\u021c\5p9\2\u021c\u021d\5X-\35\u021d\u0233\3\2\2\2\u021e\u021f"+
                    "\5p9\2\u021f\u0220\5X-\34\u0220\u0233\3\2\2\2\u0221\u0222\5p9\2\u0222"+
                    "\u0223\5X-\33\u0223\u0233\3\2\2\2\u0224\u0225\5p9\2\u0225\u0226\5X-\32"+
                    "\u0226\u0233\3\2\2\2\u0227\u0233\7q\2\2\u0228\u0233\7W\2\2\u0229\u0233"+
                    "\7t\2\2\u022a\u0233\7o\2\2\u022b\u0233\5\\/\2\u022c\u0233\5B\"\2\u022d"+
                    "\u0233\5H%\2\u022e\u022f\7\22\2\2\u022f\u0230\5V,\2\u0230\u0231\7\23\2"+
                    "\2\u0231\u0233\3\2\2\2\u0232\u01f9\3\2\2\2\u0232\u0207\3\2\2\2\u0232\u020c"+
                    "\3\2\2\2\u0232\u020e\3\2\2\2\u0232\u0210\3\2\2\2\u0232\u0212\3\2\2\2\u0232"+
                    "\u0215\3\2\2\2\u0232\u0218\3\2\2\2\u0232\u021b\3\2\2\2\u0232\u021e\3\2"+
                    "\2\2\u0232\u0221\3\2\2\2\u0232\u0224\3\2\2\2\u0232\u0227\3\2\2\2\u0232"+
                    "\u0228\3\2\2\2\u0232\u0229\3\2\2\2\u0232\u022a\3\2\2\2\u0232\u022b\3\2"+
                    "\2\2\u0232\u022c\3\2\2\2\u0232\u022d\3\2\2\2\u0232\u022e\3\2\2\2\u0233"+
                    "\u0282\3\2\2\2\u0234\u0235\f\31\2\2\u0235\u0236\5p9\2\u0236\u0237\5X-"+
                    "\32\u0237\u0281\3\2\2\2\u0238\u0239\f\30\2\2\u0239\u023a\5p9\2\u023a\u023b"+
                    "\5X-\31\u023b\u0281\3\2\2\2\u023c\u023d\f\27\2\2\u023d\u023e\5p9\2\u023e"+
                    "\u023f\5X-\30\u023f\u0281\3\2\2\2\u0240\u0241\f\26\2\2\u0241\u0242\5p"+
                    "9\2\u0242\u0243\5X-\27\u0243\u0281\3\2\2\2\u0244\u0245\f\25\2\2\u0245"+
                    "\u0246\7G\2\2\u0246\u0281\5X-\26\u0247\u0248\f\24\2\2\u0248\u0249\7]\2"+
                    "\2\u0249\u0281\5X-\25\u024a\u024b\f\23\2\2\u024b\u024c\5p9\2\u024c\u024d"+
                    "\5X-\24\u024d\u0281\3\2\2\2\u024e\u024f\f\22\2\2\u024f\u0250\5p9\2\u0250"+
                    "\u0251\5X-\23\u0251\u0281\3\2\2\2\u0252\u0253\f\21\2\2\u0253\u0254\5p"+
                    "9\2\u0254\u0255\5X-\22\u0255\u0281\3\2\2\2\u0256\u0257\f\20\2\2\u0257"+
                    "\u0258\5p9\2\u0258\u0259\5X-\21\u0259\u0281\3\2\2\2\u025a\u025b\f\17\2"+
                    "\2\u025b\u025c\5p9\2\u025c\u025d\5X-\20\u025d\u0281\3\2\2\2\u025e\u025f"+
                    "\f\16\2\2\u025f\u0260\5p9\2\u0260\u0261\5X-\17\u0261\u0281\3\2\2\2\u0262"+
                    "\u0263\f\r\2\2\u0263\u0264\7\31\2\2\u0264\u0265\5X-\2\u0265\u0266\7\32"+
                    "\2\2\u0266\u0267\5X-\16\u0267\u0281\3\2\2\2\u0268\u0269\f\f\2\2\u0269"+
                    "\u026a\5Z.\2\u026a\u026b\5X-\r\u026b\u0281\3\2\2\2\u026c\u026d\f\13\2"+
                    "\2\u026d\u026e\5Z.\2\u026e\u026f\5X-\f\u026f\u0281\3\2\2\2\u0270\u0271"+
                    "\f)\2\2\u0271\u0272\7\20\2\2\u0272\u0273\5V,\2\u0273\u0274\7\21\2\2\u0274"+
                    "\u0281\3\2\2\2\u0275\u0276\f(\2\2\u0276\u0277\7\33\2\2\u0277\u0281\5`"+
                    "\61\2\u0278\u0279\f\'\2\2\u0279\u0281\5R*\2\u027a\u027b\f%\2\2\u027b\u027c"+
                    "\6-\33\2\u027c\u0281\5p9\2\u027d\u027e\f$\2\2\u027e\u027f\6-\35\2\u027f"+
                    "\u0281\5p9\2\u0280\u0234\3\2\2\2\u0280\u0238\3\2\2\2\u0280\u023c\3\2\2"+
                    "\2\u0280\u0240\3\2\2\2\u0280\u0244\3\2\2\2\u0280\u0247\3\2\2\2\u0280\u024a"+
                    "\3\2\2\2\u0280\u024e\3\2\2\2\u0280\u0252\3\2\2\2\u0280\u0256\3\2\2\2\u0280"+
                    "\u025a\3\2\2\2\u0280\u025e\3\2\2\2\u0280\u0262\3\2\2\2\u0280\u0268\3\2"+
                    "\2\2\u0280\u026c\3\2\2\2\u0280\u0270\3\2\2\2\u0280\u0275\3\2\2\2\u0280"+
                    "\u0278\3\2\2\2\u0280\u027a\3\2\2\2\u0280\u027d\3\2\2\2\u0281\u0284\3\2"+
                    "\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283Y\3\2\2\2\u0284\u0282"+
                    "\3\2\2\2\u0285\u0286\t\2\2\2\u0286[\3\2\2\2\u0287\u028d\t\3\2\2\u0288"+
                    "\u028d\7B\2\2\u0289\u028d\7C\2\2\u028a\u028d\7D\2\2\u028b\u028d\7s\2\2"+
                    "\u028c\u0287\3\2\2\2\u028c\u0288\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028a"+
                    "\3\2\2\2\u028c\u028b\3\2\2\2\u028d]\3\2\2\2\u028e\u028f\t\4\2\2\u028f"+
                    "_\3\2\2\2\u0290\u0293\7t\2\2\u0291\u0293\5b\62\2\u0292\u0290\3\2\2\2\u0292"+
                    "\u0291\3\2\2\2\u0293a\3\2\2\2\u0294\u0298\5d\63\2\u0295\u0298\5f\64\2"+
                    "\u0296\u0298\t\5\2\2\u0297\u0294\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0296"+
                    "\3\2\2\2\u0298c\3\2\2\2\u0299\u029a\t\6\2\2\u029ae\3\2\2\2\u029b\u029c"+
                    "\t\7\2\2\u029cg\3\2\2\2\u029d\u029e\6\65\36\2\u029e\u029f\7t\2\2\u029f"+
                    "\u02a0\5N(\2\u02a0i\3\2\2\2\u02a1\u02a2\6\66\37\2\u02a2\u02a3\7t\2\2\u02a3"+
                    "\u02a4\5N(\2\u02a4k\3\2\2\2\u02a5\u02aa\7\26\2\2\u02a6\u02aa\7\2\2\3\u02a7"+
                    "\u02aa\6\67 \2\u02a8\u02aa\6\67!\2\u02a9\u02a5\3\2\2\2\u02a9\u02a6\3\2"+
                    "\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aam\3\2\2\2\u02ab\u02ac"+
                    "\7\2\2\3\u02aco\3\2\2\2\u02ad\u02ae\t\b\2\2\u02aeq\3\2\2\2Dw\u0080\u0084"+
                    "\u0089\u008f\u00a1\u00a5\u00a8\u00ad\u00b0\u00b5\u00bc\u00c1\u00ca\u00d1"+
                    "\u00d5\u00de\u00e9\u00ed\u00f1\u00fb\u00ff\u0115\u011a\u011d\u0122\u0125"+
                    "\u012a\u012d\u013d\u0141\u0143\u014a\u0150\u0155\u015f\u016e\u017b\u0181"+
                    "\u018d\u0191\u0195\u0198\u019b\u01a0\u01a5\u01aa\u01b0\u01b7\u01bb\u01c2"+
                    "\u01d8\u01df\u01e5\u01ee\u01f6\u01fc\u0200\u020a\u0232\u0280\u0282\u028c"+
                    "\u0292\u0297\u02a9";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}