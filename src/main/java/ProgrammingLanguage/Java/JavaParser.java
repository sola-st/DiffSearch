package ProgrammingLanguage.Java;

// Generated from JavaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8,
            CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15,
            ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23,
            IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29,
            NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36,
            SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42,
            THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49,
            WHILE=50, EXPR=51, EMPTY=52, WILDCARD=53, NEWLINE=54, LITERALS=55, DECIMAL_LITERAL=56,
            HEX_LITERAL=57, OCT_LITERAL=58, BINARY_LITERAL=59, FLOAT_LITERAL=60, HEX_FLOAT_LITERAL=61,
            BOOL_LITERAL=62, CHAR_LITERAL=63, STRING_LITERAL=64, NULL_LITERAL=65,
            LPAREN=66, RPAREN=67, LBRACE=68, RBRACE=69, LBRACK=70, RBRACK=71, SEMI=72,
            COMMA=73, DOT=74, ASSIGN=75, GT=76, LT=77, BANG=78, TILDE=79, QUESTION=80,
            COLON=81, EQUAL=82, LE=83, GE=84, NOTEQUAL=85, AND=86, OR=87, INC=88,
            DEC=89, ADD=90, SUB=91, MUL=92, DIV=93, BITAND=94, BITOR=95, CARET=96,
            MOD=97, OP=98, BINOP=99, QUERY_ARROW=100, ADD_ASSIGN=101, SUB_ASSIGN=102,
            MUL_ASSIGN=103, DIV_ASSIGN=104, AND_ASSIGN=105, OR_ASSIGN=106, XOR_ASSIGN=107,
            MOD_ASSIGN=108, LSHIFT_ASSIGN=109, RSHIFT_ASSIGN=110, URSHIFT_ASSIGN=111,
            ARROW=112, COLONCOLON=113, AT=114, ELLIPSIS=115, WS=116, COMMENT=117,
            LINE_COMMENT=118, IDENTIFIER=119;
    public static final int
            RULE_program = 0, RULE_querySnippet = 1, RULE_compilationUnit = 2, RULE_packageDeclaration = 3,
            RULE_importDeclaration = 4, RULE_typeDeclaration = 5, RULE_modifier = 6,
            RULE_classOrInterfaceModifier = 7, RULE_variableModifier = 8, RULE_classDeclaration = 9,
            RULE_typeParameters = 10, RULE_typeParameter = 11, RULE_typeBound = 12,
            RULE_enumDeclaration = 13, RULE_enumConstants = 14, RULE_enumConstant = 15,
            RULE_enumBodyDeclarations = 16, RULE_interfaceDeclaration = 17, RULE_classBody = 18,
            RULE_interfaceBody = 19, RULE_classBodyDeclaration = 20, RULE_memberDeclaration = 21,
            RULE_methodDeclaration = 22, RULE_methodBody = 23, RULE_typeTypeOrVoid = 24,
            RULE_genericMethodDeclaration = 25, RULE_genericConstructorDeclaration = 26,
            RULE_constructorDeclaration = 27, RULE_fieldDeclaration = 28, RULE_interfaceBodyDeclaration = 29,
            RULE_interfaceMemberDeclaration = 30, RULE_constDeclaration = 31, RULE_constantDeclarator = 32,
            RULE_interfaceMethodDeclaration = 33, RULE_interfaceMethodModifier = 34,
            RULE_genericInterfaceMethodDeclaration = 35, RULE_variableDeclarators = 36,
            RULE_variableDeclarator = 37, RULE_variableDeclaratorId = 38, RULE_variableInitializer = 39,
            RULE_arrayInitializer = 40, RULE_classOrInterfaceType = 41, RULE_typeArgument = 42,
            RULE_qualifiedNameList = 43, RULE_formalParameters = 44, RULE_formalParameterList = 45,
            RULE_formalParameter = 46, RULE_lastFormalParameter = 47, RULE_qualifiedName = 48,
            RULE_literal = 49, RULE_integerLiteral = 50, RULE_floatLiteral = 51, RULE_annotation = 52,
            RULE_elementValuePairs = 53, RULE_elementValuePair = 54, RULE_elementValue = 55,
            RULE_elementValueArrayInitializer = 56, RULE_annotationTypeDeclaration = 57,
            RULE_annotationTypeBody = 58, RULE_annotationTypeElementDeclaration = 59,
            RULE_annotationTypeElementRest = 60, RULE_annotationMethodOrConstantRest = 61,
            RULE_annotationMethodRest = 62, RULE_annotationConstantRest = 63, RULE_defaultValue = 64,
            RULE_block = 65, RULE_multipleStatements = 66, RULE_blockStatement = 67,
            RULE_localVariableDeclaration = 68, RULE_localTypeDeclaration = 69, RULE_statement = 70,
            RULE_catchClause = 71, RULE_catchType = 72, RULE_finallyBlock = 73, RULE_resourceSpecification = 74,
            RULE_resources = 75, RULE_resource = 76, RULE_switchBlockStatementGroup = 77,
            RULE_switchLabel = 78, RULE_forControl = 79, RULE_forInit = 80, RULE_enhancedForControl = 81,
            RULE_parExpression = 82, RULE_expressionList = 83, RULE_methodCall = 84,
            RULE_binary_operators = 85, RULE_assign_operators = 86, RULE_expression = 87,
            RULE_lambdaExpression = 88, RULE_lambdaParameters = 89, RULE_lambdaBody = 90,
            RULE_primary = 91, RULE_classType = 92, RULE_creator = 93, RULE_createdName = 94,
            RULE_innerCreator = 95, RULE_arrayCreatorRest = 96, RULE_classCreatorRest = 97,
            RULE_explicitGenericInvocation = 98, RULE_typeArgumentsOrDiamond = 99,
            RULE_nonWildcardTypeArgumentsOrDiamond = 100, RULE_nonWildcardTypeArguments = 101,
            RULE_typeList = 102, RULE_typeType = 103, RULE_primitiveType = 104, RULE_typeArguments = 105,
            RULE_superSuffix = 106, RULE_explicitGenericInvocationSuffix = 107, RULE_arguments = 108;
    public static final String[] ruleNames = {
            "program", "querySnippet", "compilationUnit", "packageDeclaration", "importDeclaration",
            "typeDeclaration", "modifier", "classOrInterfaceModifier", "variableModifier",
            "classDeclaration", "typeParameters", "typeParameter", "typeBound", "enumDeclaration",
            "enumConstants", "enumConstant", "enumBodyDeclarations", "interfaceDeclaration",
            "classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration",
            "methodDeclaration", "methodBody", "typeTypeOrVoid", "genericMethodDeclaration",
            "genericConstructorDeclaration", "constructorDeclaration", "fieldDeclaration",
            "interfaceBodyDeclaration", "interfaceMemberDeclaration", "constDeclaration",
            "constantDeclarator", "interfaceMethodDeclaration", "interfaceMethodModifier",
            "genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator",
            "variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType",
            "typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList",
            "formalParameter", "lastFormalParameter", "qualifiedName", "literal",
            "integerLiteral", "floatLiteral", "annotation", "elementValuePairs", "elementValuePair",
            "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration",
            "annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest",
            "annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest",
            "defaultValue", "block", "multipleStatements", "blockStatement", "localVariableDeclaration",
            "localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock",
            "resourceSpecification", "resources", "resource", "switchBlockStatementGroup",
            "switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression",
            "expressionList", "methodCall", "binary_operators", "assign_operators",
            "expression", "lambdaExpression", "lambdaParameters", "lambdaBody", "primary",
            "classType", "creator", "createdName", "innerCreator", "arrayCreatorRest",
            "classCreatorRest", "explicitGenericInvocation", "typeArgumentsOrDiamond",
            "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", "typeList",
            "typeType", "primitiveType", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix",
            "arguments"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
            "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
            "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
            "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
            "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
            "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
            "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
            "'transient'", "'try'", "'void'", "'volatile'", "'while'", null, "'_'",
            "'<...>'", null, null, null, null, null, null, null, null, null, null,
            null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','",
            "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='",
            "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'",
            "'&'", "'|'", "'^'", "'%'", null, null, "'-->'", "'+='", "'-='", "'*='",
            "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'",
            "'::'", "'@'", "'...'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
            "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
            "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE",
            "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
            "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
            "TRY", "VOID", "VOLATILE", "WHILE", "EXPR", "EMPTY", "WILDCARD", "NEWLINE",
            "LITERALS", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL",
            "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL",
            "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
            "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG",
            "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND",
            "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET",
            "MOD", "OP", "BINOP", "QUERY_ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN",
            "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN",
            "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS",
            "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
    public String getGrammarFileName() { return "JavaParser.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public JavaParser(TokenStream input) {
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
        public TerminalNode QUERY_ARROW() { return getToken(JavaParser.QUERY_ARROW, 0); }
        public List<TerminalNode> NEWLINE() { return getTokens(JavaParser.NEWLINE); }
        public TerminalNode NEWLINE(int i) {
            return getToken(JavaParser.NEWLINE, i);
        }
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_program; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterProgram(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitProgram(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(218);
                querySnippet();
                setState(220);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NEWLINE) {
                    {
                        setState(219);
                        match(NEWLINE);
                    }
                }

                setState(222);
                match(QUERY_ARROW);
                setState(224);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
                    case 1:
                    {
                        setState(223);
                        match(NEWLINE);
                    }
                    break;
                }
                setState(226);
                querySnippet();
                setState(228);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NEWLINE) {
                    {
                        setState(227);
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
        public PackageDeclarationContext packageDeclaration() {
            return getRuleContext(PackageDeclarationContext.class,0);
        }
        public ImportDeclarationContext importDeclaration() {
            return getRuleContext(ImportDeclarationContext.class,0);
        }
        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class,0);
        }
        public EnumConstantContext enumConstant() {
            return getRuleContext(EnumConstantContext.class,0);
        }
        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class,0);
        }
        public MemberDeclarationContext memberDeclaration() {
            return getRuleContext(MemberDeclarationContext.class,0);
        }
        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class,0);
        }
        public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
            return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
        }
        public VariableDeclaratorContext variableDeclarator() {
            return getRuleContext(VariableDeclaratorContext.class,0);
        }
        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class,0);
        }
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class,0);
        }
        public ElementValuePairContext elementValuePair() {
            return getRuleContext(ElementValuePairContext.class,0);
        }
        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class,0);
        }
        public MultipleStatementsContext multipleStatements() {
            return getRuleContext(MultipleStatementsContext.class,0);
        }
        public BlockStatementContext blockStatement() {
            return getRuleContext(BlockStatementContext.class,0);
        }
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public ParExpressionContext parExpression() {
            return getRuleContext(ParExpressionContext.class,0);
        }
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class,0);
        }
        public MethodCallContext methodCall() {
            return getRuleContext(MethodCallContext.class,0);
        }
        public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
        public TerminalNode EMPTY() { return getToken(JavaParser.EMPTY, 0); }
        public QuerySnippetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_querySnippet; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQuerySnippet(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQuerySnippet(this);
        }
    }

    public final QuerySnippetContext querySnippet() throws RecognitionException {
        QuerySnippetContext _localctx = new QuerySnippetContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_querySnippet);
        try {
            setState(252);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(230);
                    packageDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(231);
                    importDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(232);
                    enumDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(233);
                    enumConstant();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(234);
                    interfaceDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(235);
                    memberDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(236);
                    interfaceMethodDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(237);
                    genericInterfaceMethodDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(238);
                    variableDeclarator();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(239);
                    literal();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(240);
                    annotation();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(241);
                    elementValuePair();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(242);
                    annotationTypeDeclaration();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(243);
                    multipleStatements();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(244);
                    blockStatement();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(245);
                    block();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(246);
                    expression(0);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(247);
                    parExpression();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(248);
                    expressionList();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(249);
                    methodCall();
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(250);
                    match(WILDCARD);
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(251);
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

    public static class CompilationUnitContext extends ParserRuleContext {
        public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
        public PackageDeclarationContext packageDeclaration() {
            return getRuleContext(PackageDeclarationContext.class,0);
        }
        public List<ImportDeclarationContext> importDeclaration() {
            return getRuleContexts(ImportDeclarationContext.class);
        }
        public ImportDeclarationContext importDeclaration(int i) {
            return getRuleContext(ImportDeclarationContext.class,i);
        }
        public List<TypeDeclarationContext> typeDeclaration() {
            return getRuleContexts(TypeDeclarationContext.class);
        }
        public TypeDeclarationContext typeDeclaration(int i) {
            return getRuleContext(TypeDeclarationContext.class,i);
        }
        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_compilationUnit; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCompilationUnit(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCompilationUnit(this);
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
                    case 1:
                    {
                        setState(254);
                        packageDeclaration();
                    }
                    break;
                }
                setState(260);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==IMPORT) {
                    {
                        {
                            setState(257);
                            importDeclaration();
                        }
                    }
                    setState(262);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(266);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
                    {
                        {
                            setState(263);
                            typeDeclaration();
                        }
                    }
                    setState(268);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(269);
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

    public static class PackageDeclarationContext extends ParserRuleContext {
        public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class,0);
        }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_packageDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPackageDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPackageDeclaration(this);
        }
    }

    public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
        PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_packageDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(271);
                            annotation();
                        }
                    }
                    setState(276);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(277);
                match(PACKAGE);
                setState(278);
                qualifiedName();
                setState(280);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
                    case 1:
                    {
                        setState(279);
                        match(SEMI);
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

    public static class ImportDeclarationContext extends ParserRuleContext {
        public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class,0);
        }
        public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
        public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_importDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclaration(this);
        }
    }

    public final ImportDeclarationContext importDeclaration() throws RecognitionException {
        ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_importDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                match(IMPORT);
                setState(284);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==STATIC) {
                    {
                        setState(283);
                        match(STATIC);
                    }
                }

                setState(286);
                qualifiedName();
                setState(289);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DOT) {
                    {
                        setState(287);
                        match(DOT);
                        setState(288);
                        match(MUL);
                    }
                }

                setState(292);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
                    case 1:
                    {
                        setState(291);
                        match(SEMI);
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

    public static class TypeDeclarationContext extends ParserRuleContext {
        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class,0);
        }
        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class,0);
        }
        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class,0);
        }
        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class,0);
        }
        public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
            return getRuleContexts(ClassOrInterfaceModifierContext.class);
        }
        public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
            return getRuleContext(ClassOrInterfaceModifierContext.class,i);
        }
        public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclaration(this);
        }
    }

    public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
        TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_typeDeclaration);
        try {
            int _alt;
            setState(307);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case CLASS:
                case ENUM:
                case FINAL:
                case INTERFACE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(297);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,12,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(294);
                                    classOrInterfaceModifier();
                                }
                            }
                        }
                        setState(299);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,12,_ctx);
                    }
                    setState(304);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS:
                        {
                            setState(300);
                            classDeclaration();
                        }
                        break;
                        case ENUM:
                        {
                            setState(301);
                            enumDeclaration();
                        }
                        break;
                        case INTERFACE:
                        {
                            setState(302);
                            interfaceDeclaration();
                        }
                        break;
                        case AT:
                        {
                            setState(303);
                            annotationTypeDeclaration();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(306);
                    match(SEMI);
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

    public static class ModifierContext extends ParserRuleContext {
        public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
            return getRuleContext(ClassOrInterfaceModifierContext.class,0);
        }
        public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
        public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
        public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
        public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
        public ModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_modifier; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModifier(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModifier(this);
        }
    }

    public final ModifierContext modifier() throws RecognitionException {
        ModifierContext _localctx = new ModifierContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_modifier);
        try {
            setState(314);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case FINAL:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(309);
                    classOrInterfaceModifier();
                }
                break;
                case NATIVE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(310);
                    match(NATIVE);
                }
                break;
                case SYNCHRONIZED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(311);
                    match(SYNCHRONIZED);
                }
                break;
                case TRANSIENT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(312);
                    match(TRANSIENT);
                }
                break;
                case VOLATILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(313);
                    match(VOLATILE);
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

    public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class,0);
        }
        public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
        public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
        public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
        public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
        public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
        public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
        public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
        public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceModifier(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceModifier(this);
        }
    }

    public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
        ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_classOrInterfaceModifier);
        try {
            setState(324);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(316);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(317);
                    match(PUBLIC);
                }
                break;
                case PROTECTED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(318);
                    match(PROTECTED);
                }
                break;
                case PRIVATE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(319);
                    match(PRIVATE);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(320);
                    match(STATIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(321);
                    match(ABSTRACT);
                }
                break;
                case FINAL:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(322);
                    match(FINAL);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(323);
                    match(STRICTFP);
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

    public static class VariableModifierContext extends ParserRuleContext {
        public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class,0);
        }
        public VariableModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_variableModifier; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableModifier(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableModifier(this);
        }
    }

    public final VariableModifierContext variableModifier() throws RecognitionException {
        VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_variableModifier);
        try {
            setState(328);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FINAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(326);
                    match(FINAL);
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(327);
                    annotation();
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

    public static class ClassDeclarationContext extends ParserRuleContext {
        public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class,0);
        }
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class,0);
        }
        public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class,0);
        }
        public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassDeclaration(this);
        }
    }

    public final ClassDeclarationContext classDeclaration() throws RecognitionException {
        ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_classDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(CLASS);
                setState(331);
                match(IDENTIFIER);
                setState(333);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(332);
                        typeParameters();
                    }
                }

                setState(337);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(335);
                        match(EXTENDS);
                        setState(336);
                        typeType();
                    }
                }

                setState(341);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==IMPLEMENTS) {
                    {
                        setState(339);
                        match(IMPLEMENTS);
                        setState(340);
                        typeList();
                    }
                }

                setState(343);
                classBody();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeParametersContext extends ParserRuleContext {
        public List<TypeParameterContext> typeParameter() {
            return getRuleContexts(TypeParameterContext.class);
        }
        public TypeParameterContext typeParameter(int i) {
            return getRuleContext(TypeParameterContext.class,i);
        }
        public TypeParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeParameters; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameters(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameters(this);
        }
    }

    public final TypeParametersContext typeParameters() throws RecognitionException {
        TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_typeParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(345);
                match(LT);
                setState(346);
                typeParameter();
                setState(351);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(347);
                            match(COMMA);
                            setState(348);
                            typeParameter();
                        }
                    }
                    setState(353);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(354);
                match(GT);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeParameterContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
        public TypeBoundContext typeBound() {
            return getRuleContext(TypeBoundContext.class,0);
        }
        public TypeParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeParameter; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameter(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameter(this);
        }
    }

    public final TypeParameterContext typeParameter() throws RecognitionException {
        TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_typeParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(359);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(356);
                            annotation();
                        }
                    }
                    setState(361);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(362);
                match(IDENTIFIER);
                setState(365);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(363);
                        match(EXTENDS);
                        setState(364);
                        typeBound();
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

    public static class TypeBoundContext extends ParserRuleContext {
        public List<TypeTypeContext> typeType() {
            return getRuleContexts(TypeTypeContext.class);
        }
        public TypeTypeContext typeType(int i) {
            return getRuleContext(TypeTypeContext.class,i);
        }
        public TypeBoundContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeBound; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeBound(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeBound(this);
        }
    }

    public final TypeBoundContext typeBound() throws RecognitionException {
        TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_typeBound);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(367);
                typeType();
                setState(372);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==BITAND) {
                    {
                        {
                            setState(368);
                            match(BITAND);
                            setState(369);
                            typeType();
                        }
                    }
                    setState(374);
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

    public static class EnumDeclarationContext extends ParserRuleContext {
        public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class,0);
        }
        public EnumConstantsContext enumConstants() {
            return getRuleContext(EnumConstantsContext.class,0);
        }
        public EnumBodyDeclarationsContext enumBodyDeclarations() {
            return getRuleContext(EnumBodyDeclarationsContext.class,0);
        }
        public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_enumDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumDeclaration(this);
        }
    }

    public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
        EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_enumDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(375);
                match(ENUM);
                setState(376);
                match(IDENTIFIER);
                setState(379);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==IMPLEMENTS) {
                    {
                        setState(377);
                        match(IMPLEMENTS);
                        setState(378);
                        typeList();
                    }
                }

                setState(381);
                match(LBRACE);
                setState(383);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==AT || _la==IDENTIFIER) {
                    {
                        setState(382);
                        enumConstants();
                    }
                }

                setState(386);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMA) {
                    {
                        setState(385);
                        match(COMMA);
                    }
                }

                setState(389);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SEMI) {
                    {
                        setState(388);
                        enumBodyDeclarations();
                    }
                }

                setState(391);
                match(RBRACE);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EnumConstantsContext extends ParserRuleContext {
        public List<EnumConstantContext> enumConstant() {
            return getRuleContexts(EnumConstantContext.class);
        }
        public EnumConstantContext enumConstant(int i) {
            return getRuleContext(EnumConstantContext.class,i);
        }
        public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_enumConstants; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstants(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstants(this);
        }
    }

    public final EnumConstantsContext enumConstants() throws RecognitionException {
        EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_enumConstants);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(393);
                enumConstant();
                setState(398);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,29,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(394);
                                match(COMMA);
                                setState(395);
                                enumConstant();
                            }
                        }
                    }
                    setState(400);
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

    public static class EnumConstantContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class,0);
        }
        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class,0);
        }
        public EnumConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_enumConstant; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstant(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstant(this);
        }
    }

    public final EnumConstantContext enumConstant() throws RecognitionException {
        EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_enumConstant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(404);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(401);
                            annotation();
                        }
                    }
                    setState(406);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(407);
                match(IDENTIFIER);
                setState(409);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LPAREN) {
                    {
                        setState(408);
                        arguments();
                    }
                }

                setState(412);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LBRACE) {
                    {
                        setState(411);
                        classBody();
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

    public static class EnumBodyDeclarationsContext extends ParserRuleContext {
        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }
        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class,i);
        }
        public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumBodyDeclarations(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumBodyDeclarations(this);
        }
    }

    public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
        EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_enumBodyDeclarations);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(414);
                match(SEMI);
                setState(418);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
                    {
                        {
                            setState(415);
                            classBodyDeclaration();
                        }
                    }
                    setState(420);
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

    public static class InterfaceDeclarationContext extends ParserRuleContext {
        public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public InterfaceBodyContext interfaceBody() {
            return getRuleContext(InterfaceBodyContext.class,0);
        }
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class,0);
        }
        public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class,0);
        }
        public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceDeclaration(this);
        }
    }

    public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
        InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_interfaceDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(421);
                match(INTERFACE);
                setState(422);
                match(IDENTIFIER);
                setState(424);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(423);
                        typeParameters();
                    }
                }

                setState(428);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(426);
                        match(EXTENDS);
                        setState(427);
                        typeList();
                    }
                }

                setState(430);
                interfaceBody();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassBodyContext extends ParserRuleContext {
        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }
        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class,i);
        }
        public ClassBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classBody; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBody(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBody(this);
        }
    }

    public final ClassBodyContext classBody() throws RecognitionException {
        ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_classBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(432);
                match(LBRACE);
                setState(436);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
                    {
                        {
                            setState(433);
                            classBodyDeclaration();
                        }
                    }
                    setState(438);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(439);
                match(RBRACE);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceBodyContext extends ParserRuleContext {
        public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
            return getRuleContexts(InterfaceBodyDeclarationContext.class);
        }
        public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
            return getRuleContext(InterfaceBodyDeclarationContext.class,i);
        }
        public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_interfaceBody; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBody(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBody(this);
        }
    }

    public final InterfaceBodyContext interfaceBody() throws RecognitionException {
        InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_interfaceBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(441);
                match(LBRACE);
                setState(445);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
                    {
                        {
                            setState(442);
                            interfaceBodyDeclaration();
                        }
                    }
                    setState(447);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(448);
                match(RBRACE);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassBodyDeclarationContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
        public MemberDeclarationContext memberDeclaration() {
            return getRuleContext(MemberDeclarationContext.class,0);
        }
        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }
        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class,i);
        }
        public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclaration(this);
        }
    }

    public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
        ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_classBodyDeclaration);
        int _la;
        try {
            int _alt;
            setState(462);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(450);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(452);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==STATIC) {
                        {
                            setState(451);
                            match(STATIC);
                        }
                    }

                    setState(454);
                    block();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(458);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,39,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(455);
                                    modifier();
                                }
                            }
                        }
                        setState(460);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,39,_ctx);
                    }
                    setState(461);
                    memberDeclaration();
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

    public static class MemberDeclarationContext extends ParserRuleContext {
        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class,0);
        }
        public GenericMethodDeclarationContext genericMethodDeclaration() {
            return getRuleContext(GenericMethodDeclarationContext.class,0);
        }
        public FieldDeclarationContext fieldDeclaration() {
            return getRuleContext(FieldDeclarationContext.class,0);
        }
        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class,0);
        }
        public GenericConstructorDeclarationContext genericConstructorDeclaration() {
            return getRuleContext(GenericConstructorDeclarationContext.class,0);
        }
        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class,0);
        }
        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class,0);
        }
        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class,0);
        }
        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class,0);
        }
        public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_memberDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMemberDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMemberDeclaration(this);
        }
    }

    public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
        MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_memberDeclaration);
        try {
            setState(473);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(464);
                    methodDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(465);
                    genericMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(466);
                    fieldDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(467);
                    constructorDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(468);
                    genericConstructorDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(469);
                    interfaceDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(470);
                    annotationTypeDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(471);
                    classDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(472);
                    enumDeclaration();
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

    public static class MethodDeclarationContext extends ParserRuleContext {
        public TypeTypeOrVoidContext typeTypeOrVoid() {
            return getRuleContext(TypeTypeOrVoidContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class,0);
        }
        public MethodBodyContext methodBody() {
            return getRuleContext(MethodBodyContext.class,0);
        }
        public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class,0);
        }
        public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_methodDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodDeclaration(this);
        }
    }

    public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
        MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_methodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(475);
                typeTypeOrVoid();
                setState(476);
                match(IDENTIFIER);
                setState(477);
                formalParameters();
                setState(482);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(478);
                            match(LBRACK);
                            setState(479);
                            match(RBRACK);
                        }
                    }
                    setState(484);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(487);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(485);
                        match(THROWS);
                        setState(486);
                        qualifiedNameList();
                    }
                }

                setState(489);
                methodBody();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodBodyContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public MethodBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_methodBody; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodBody(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodBody(this);
        }
    }

    public final MethodBodyContext methodBody() throws RecognitionException {
        MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_methodBody);
        try {
            setState(493);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NEWLINE:
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(491);
                    block();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(492);
                    match(SEMI);
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

    public static class TypeTypeOrVoidContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
        public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeTypeOrVoid(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeTypeOrVoid(this);
        }
    }

    public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
        TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_typeTypeOrVoid);
        try {
            setState(497);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(495);
                    typeType();
                }
                break;
                case VOID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(496);
                    match(VOID);
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

    public static class GenericMethodDeclarationContext extends ParserRuleContext {
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class,0);
        }
        public MethodDeclarationContext methodDeclaration() {
            return getRuleContext(MethodDeclarationContext.class,0);
        }
        public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericMethodDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericMethodDeclaration(this);
        }
    }

    public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
        GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_genericMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(499);
                typeParameters();
                setState(500);
                methodDeclaration();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GenericConstructorDeclarationContext extends ParserRuleContext {
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class,0);
        }
        public ConstructorDeclarationContext constructorDeclaration() {
            return getRuleContext(ConstructorDeclarationContext.class,0);
        }
        public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericConstructorDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericConstructorDeclaration(this);
        }
    }

    public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
        GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_genericConstructorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(502);
                typeParameters();
                setState(503);
                constructorDeclaration();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConstructorDeclarationContext extends ParserRuleContext {
        public BlockContext constructorBody;
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class,0);
        }
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class,0);
        }
        public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_constructorDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorDeclaration(this);
        }
    }

    public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
        ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_constructorDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(505);
                match(IDENTIFIER);
                setState(506);
                formalParameters();
                setState(509);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(507);
                        match(THROWS);
                        setState(508);
                        qualifiedNameList();
                    }
                }

                setState(511);
                ((ConstructorDeclarationContext)_localctx).constructorBody = block();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FieldDeclarationContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class,0);
        }
        public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_fieldDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldDeclaration(this);
        }
    }

    public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
        FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_fieldDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(513);
                typeType();
                setState(514);
                variableDeclarators();
                setState(516);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
                    case 1:
                    {
                        setState(515);
                        match(SEMI);
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

    public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
        public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
            return getRuleContext(InterfaceMemberDeclarationContext.class,0);
        }
        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }
        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class,i);
        }
        public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBodyDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBodyDeclaration(this);
        }
    }

    public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
        InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_interfaceBodyDeclaration);
        try {
            int _alt;
            setState(526);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DEFAULT:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case NATIVE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOID:
                case VOLATILE:
                case LT:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(521);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(518);
                                    modifier();
                                }
                            }
                        }
                        setState(523);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
                    }
                    setState(524);
                    interfaceMemberDeclaration();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(525);
                    match(SEMI);
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

    public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
        public ConstDeclarationContext constDeclaration() {
            return getRuleContext(ConstDeclarationContext.class,0);
        }
        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class,0);
        }
        public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
            return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
        }
        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class,0);
        }
        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class,0);
        }
        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class,0);
        }
        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class,0);
        }
        public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMemberDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMemberDeclaration(this);
        }
    }

    public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
        InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_interfaceMemberDeclaration);
        try {
            setState(535);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(528);
                    constDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(529);
                    interfaceMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(530);
                    genericInterfaceMethodDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(531);
                    interfaceDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(532);
                    annotationTypeDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(533);
                    classDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(534);
                    enumDeclaration();
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

    public static class ConstDeclarationContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public List<ConstantDeclaratorContext> constantDeclarator() {
            return getRuleContexts(ConstantDeclaratorContext.class);
        }
        public ConstantDeclaratorContext constantDeclarator(int i) {
            return getRuleContext(ConstantDeclaratorContext.class,i);
        }
        public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_constDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstDeclaration(this);
        }
    }

    public final ConstDeclarationContext constDeclaration() throws RecognitionException {
        ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_constDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(537);
                typeType();
                setState(538);
                constantDeclarator();
                setState(543);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(539);
                            match(COMMA);
                            setState(540);
                            constantDeclarator();
                        }
                    }
                    setState(545);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(547);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
                    case 1:
                    {
                        setState(546);
                        match(SEMI);
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

    public static class ConstantDeclaratorContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class,0);
        }
        public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_constantDeclarator; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantDeclarator(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantDeclarator(this);
        }
    }

    public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
        ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_constantDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(549);
                match(IDENTIFIER);
                setState(554);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(550);
                            match(LBRACK);
                            setState(551);
                            match(RBRACK);
                        }
                    }
                    setState(556);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(557);
                match(ASSIGN);
                setState(558);
                variableInitializer();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public FormalParametersContext formalParameters() {
            return getRuleContext(FormalParametersContext.class,0);
        }
        public MethodBodyContext methodBody() {
            return getRuleContext(MethodBodyContext.class,0);
        }
        public TypeTypeOrVoidContext typeTypeOrVoid() {
            return getRuleContext(TypeTypeOrVoidContext.class,0);
        }
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class,0);
        }
        public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
            return getRuleContexts(InterfaceMethodModifierContext.class);
        }
        public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
            return getRuleContext(InterfaceMethodModifierContext.class,i);
        }
        public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
        public QualifiedNameListContext qualifiedNameList() {
            return getRuleContext(QualifiedNameListContext.class,0);
        }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodDeclaration(this);
        }
    }

    public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
        InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_interfaceMethodDeclaration);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(563);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,54,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(560);
                                interfaceMethodModifier();
                            }
                        }
                    }
                    setState(565);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,54,_ctx);
                }
                setState(576);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                    case VOID:
                    case AT:
                    case IDENTIFIER:
                    {
                        setState(566);
                        typeTypeOrVoid();
                    }
                    break;
                    case LT:
                    {
                        setState(567);
                        typeParameters();
                        setState(571);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,55,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(568);
                                        annotation();
                                    }
                                }
                            }
                            setState(573);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,55,_ctx);
                        }
                        setState(574);
                        typeTypeOrVoid();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(578);
                match(IDENTIFIER);
                setState(579);
                formalParameters();
                setState(584);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(580);
                            match(LBRACK);
                            setState(581);
                            match(RBRACK);
                        }
                    }
                    setState(586);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(589);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(587);
                        match(THROWS);
                        setState(588);
                        qualifiedNameList();
                    }
                }

                setState(591);
                methodBody();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InterfaceMethodModifierContext extends ParserRuleContext {
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class,0);
        }
        public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
        public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
        public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
        public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
        public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
        public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodModifier(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodModifier(this);
        }
    }

    public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
        InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_interfaceMethodModifier);
        try {
            setState(599);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(593);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(594);
                    match(PUBLIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(595);
                    match(ABSTRACT);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(596);
                    match(DEFAULT);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(597);
                    match(STATIC);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(598);
                    match(STRICTFP);
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

    public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class,0);
        }
        public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
            return getRuleContext(InterfaceMethodDeclarationContext.class,0);
        }
        public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
        }
    }

    public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
        GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_genericInterfaceMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(601);
                typeParameters();
                setState(602);
                interfaceMethodDeclaration();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclaratorsContext extends ParserRuleContext {
        public List<VariableDeclaratorContext> variableDeclarator() {
            return getRuleContexts(VariableDeclaratorContext.class);
        }
        public VariableDeclaratorContext variableDeclarator(int i) {
            return getRuleContext(VariableDeclaratorContext.class,i);
        }
        public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_variableDeclarators; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarators(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarators(this);
        }
    }

    public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
        VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_variableDeclarators);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(604);
                variableDeclarator();
                setState(609);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,60,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(605);
                                match(COMMA);
                                setState(606);
                                variableDeclarator();
                            }
                        }
                    }
                    setState(611);
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

    public static class VariableDeclaratorContext extends ParserRuleContext {
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class,0);
        }
        public VariableInitializerContext variableInitializer() {
            return getRuleContext(VariableInitializerContext.class,0);
        }
        public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_variableDeclarator; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarator(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarator(this);
        }
    }

    public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
        VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_variableDeclarator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(612);
                variableDeclaratorId();
                setState(615);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
                    case 1:
                    {
                        setState(613);
                        match(ASSIGN);
                        setState(614);
                        variableInitializer();
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

    public static class VariableDeclaratorIdContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclaratorId(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclaratorId(this);
        }
    }

    public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
        VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_variableDeclaratorId);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(617);
                match(IDENTIFIER);
                setState(622);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,62,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(618);
                                match(LBRACK);
                                setState(619);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(624);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

    public static class VariableInitializerContext extends ParserRuleContext {
        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class,0);
        }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_variableInitializer; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableInitializer(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableInitializer(this);
        }
    }

    public final VariableInitializerContext variableInitializer() throws RecognitionException {
        VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_variableInitializer);
        try {
            setState(627);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(625);
                    arrayInitializer();
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
                case EXPR:
                case LITERALS:
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                case BOOL_LITERAL:
                case CHAR_LITERAL:
                case STRING_LITERAL:
                case NULL_LITERAL:
                case LPAREN:
                case LT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case ADD:
                case SUB:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(626);
                    expression(0);
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

    public static class ArrayInitializerContext extends ParserRuleContext {
        public List<VariableInitializerContext> variableInitializer() {
            return getRuleContexts(VariableInitializerContext.class);
        }
        public VariableInitializerContext variableInitializer(int i) {
            return getRuleContext(VariableInitializerContext.class,i);
        }
        public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_arrayInitializer; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayInitializer(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayInitializer(this);
        }
    }

    public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
        ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_arrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(629);
                match(LBRACE);
                setState(641);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(630);
                        variableInitializer();
                        setState(635);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,64,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(631);
                                        match(COMMA);
                                        setState(632);
                                        variableInitializer();
                                    }
                                }
                            }
                            setState(637);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,64,_ctx);
                        }
                        setState(639);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==COMMA) {
                            {
                                setState(638);
                                match(COMMA);
                            }
                        }

                    }
                }

                setState(643);
                match(RBRACE);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
        public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }
        public List<TypeArgumentsContext> typeArguments() {
            return getRuleContexts(TypeArgumentsContext.class);
        }
        public TypeArgumentsContext typeArguments(int i) {
            return getRuleContext(TypeArgumentsContext.class,i);
        }
        public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceType(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceType(this);
        }
    }

    public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
        ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_classOrInterfaceType);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(645);
                match(IDENTIFIER);
                setState(647);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
                    case 1:
                    {
                        setState(646);
                        typeArguments();
                    }
                    break;
                }
                setState(656);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,69,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(649);
                                match(DOT);
                                setState(650);
                                match(IDENTIFIER);
                                setState(652);
                                _errHandler.sync(this);
                                switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
                                    case 1:
                                    {
                                        setState(651);
                                        typeArguments();
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    setState(658);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

    public static class TypeArgumentContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
        public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
        public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeArgument; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgument(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgument(this);
        }
    }

    public final TypeArgumentContext typeArgument() throws RecognitionException {
        TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_typeArgument);
        int _la;
        try {
            setState(665);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(659);
                    typeType();
                }
                break;
                case QUESTION:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(660);
                    match(QUESTION);
                    setState(663);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==EXTENDS || _la==SUPER) {
                        {
                            setState(661);
                            _la = _input.LA(1);
                            if ( !(_la==EXTENDS || _la==SUPER) ) {
                                _errHandler.recoverInline(this);
                            }
                            else {
                                if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(662);
                            typeType();
                        }
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

    public static class QualifiedNameListContext extends ParserRuleContext {
        public List<QualifiedNameContext> qualifiedName() {
            return getRuleContexts(QualifiedNameContext.class);
        }
        public QualifiedNameContext qualifiedName(int i) {
            return getRuleContext(QualifiedNameContext.class,i);
        }
        public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_qualifiedNameList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedNameList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedNameList(this);
        }
    }

    public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
        QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_qualifiedNameList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(667);
                qualifiedName();
                setState(672);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(668);
                            match(COMMA);
                            setState(669);
                            qualifiedName();
                        }
                    }
                    setState(674);
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

    public static class FormalParametersContext extends ParserRuleContext {
        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class,0);
        }
        public FormalParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_formalParameters; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameters(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameters(this);
        }
    }

    public final FormalParametersContext formalParameters() throws RecognitionException {
        FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_formalParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(675);
                match(LPAREN);
                setState(677);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
                    {
                        setState(676);
                        formalParameterList();
                    }
                }

                setState(679);
                match(RPAREN);
            }
        }
        catch (RecognitionException re) {
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
        public List<FormalParameterContext> formalParameter() {
            return getRuleContexts(FormalParameterContext.class);
        }
        public FormalParameterContext formalParameter(int i) {
            return getRuleContext(FormalParameterContext.class,i);
        }
        public LastFormalParameterContext lastFormalParameter() {
            return getRuleContext(LastFormalParameterContext.class,0);
        }
        public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_formalParameterList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameterList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameterList(this);
        }
    }

    public final FormalParameterListContext formalParameterList() throws RecognitionException {
        FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_formalParameterList);
        int _la;
        try {
            int _alt;
            setState(694);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(681);
                    formalParameter();
                    setState(686);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,74,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(682);
                                    match(COMMA);
                                    setState(683);
                                    formalParameter();
                                }
                            }
                        }
                        setState(688);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,74,_ctx);
                    }
                    setState(691);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COMMA) {
                        {
                            setState(689);
                            match(COMMA);
                            setState(690);
                            lastFormalParameter();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(693);
                    lastFormalParameter();
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

    public static class FormalParameterContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class,0);
        }
        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }
        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class,i);
        }
        public FormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_formalParameter; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameter(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameter(this);
        }
    }

    public final FormalParameterContext formalParameter() throws RecognitionException {
        FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_formalParameter);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(699);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,77,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(696);
                                variableModifier();
                            }
                        }
                    }
                    setState(701);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,77,_ctx);
                }
                setState(702);
                typeType();
                setState(703);
                variableDeclaratorId();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LastFormalParameterContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class,0);
        }
        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }
        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class,i);
        }
        public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_lastFormalParameter; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLastFormalParameter(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLastFormalParameter(this);
        }
    }

    public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
        LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_lastFormalParameter);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(708);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,78,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(705);
                                variableModifier();
                            }
                        }
                    }
                    setState(710);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,78,_ctx);
                }
                setState(711);
                typeType();
                setState(712);
                match(ELLIPSIS);
                setState(713);
                variableDeclaratorId();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QualifiedNameContext extends ParserRuleContext {
        public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }
        public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_qualifiedName; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedName(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedName(this);
        }
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException {
        QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(715);
                match(IDENTIFIER);
                setState(720);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,79,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(716);
                                match(DOT);
                                setState(717);
                                match(IDENTIFIER);
                            }
                        }
                    }
                    setState(722);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
        public IntegerLiteralContext integerLiteral() {
            return getRuleContext(IntegerLiteralContext.class,0);
        }
        public FloatLiteralContext floatLiteral() {
            return getRuleContext(FloatLiteralContext.class,0);
        }
        public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
        public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
        public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
        public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
        public TerminalNode LITERALS() { return getToken(JavaParser.LITERALS, 0); }
        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_literal; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteral(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteral(this);
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_literal);
        try {
            setState(730);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(723);
                    integerLiteral();
                }
                break;
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(724);
                    floatLiteral();
                }
                break;
                case CHAR_LITERAL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(725);
                    match(CHAR_LITERAL);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(726);
                    match(STRING_LITERAL);
                }
                break;
                case BOOL_LITERAL:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(727);
                    match(BOOL_LITERAL);
                }
                break;
                case NULL_LITERAL:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(728);
                    match(NULL_LITERAL);
                }
                break;
                case LITERALS:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(729);
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

    public static class IntegerLiteralContext extends ParserRuleContext {
        public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
        public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
        public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
        public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
        public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_integerLiteral; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntegerLiteral(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntegerLiteral(this);
        }
    }

    public final IntegerLiteralContext integerLiteral() throws RecognitionException {
        IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_integerLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(732);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

    public static class FloatLiteralContext extends ParserRuleContext {
        public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
        public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
        public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_floatLiteral; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFloatLiteral(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFloatLiteral(this);
        }
    }

    public final FloatLiteralContext floatLiteral() throws RecognitionException {
        FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_floatLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(734);
                _la = _input.LA(1);
                if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

    public static class AnnotationContext extends ParserRuleContext {
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class,0);
        }
        public ElementValuePairsContext elementValuePairs() {
            return getRuleContext(ElementValuePairsContext.class,0);
        }
        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class,0);
        }
        public AnnotationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotation; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotation(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotation(this);
        }
    }

    public final AnnotationContext annotation() throws RecognitionException {
        AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_annotation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(736);
                match(AT);
                setState(737);
                qualifiedName();
                setState(744);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LPAREN) {
                    {
                        setState(738);
                        match(LPAREN);
                        setState(741);
                        _errHandler.sync(this);
                        switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
                            case 1:
                            {
                                setState(739);
                                elementValuePairs();
                            }
                            break;
                            case 2:
                            {
                                setState(740);
                                elementValue();
                            }
                            break;
                        }
                        setState(743);
                        match(RPAREN);
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

    public static class ElementValuePairsContext extends ParserRuleContext {
        public List<ElementValuePairContext> elementValuePair() {
            return getRuleContexts(ElementValuePairContext.class);
        }
        public ElementValuePairContext elementValuePair(int i) {
            return getRuleContext(ElementValuePairContext.class,i);
        }
        public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_elementValuePairs; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePairs(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePairs(this);
        }
    }

    public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
        ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_elementValuePairs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(746);
                elementValuePair();
                setState(751);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(747);
                            match(COMMA);
                            setState(748);
                            elementValuePair();
                        }
                    }
                    setState(753);
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

    public static class ElementValuePairContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class,0);
        }
        public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_elementValuePair; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePair(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePair(this);
        }
    }

    public final ElementValuePairContext elementValuePair() throws RecognitionException {
        ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_elementValuePair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(754);
                match(IDENTIFIER);
                setState(755);
                match(ASSIGN);
                setState(756);
                elementValue();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValueContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class,0);
        }
        public ElementValueArrayInitializerContext elementValueArrayInitializer() {
            return getRuleContext(ElementValueArrayInitializerContext.class,0);
        }
        public ElementValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_elementValue; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValue(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValue(this);
        }
    }

    public final ElementValueContext elementValue() throws RecognitionException {
        ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_elementValue);
        try {
            setState(761);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(758);
                    expression(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(759);
                    annotation();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(760);
                    elementValueArrayInitializer();
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

    public static class ElementValueArrayInitializerContext extends ParserRuleContext {
        public List<ElementValueContext> elementValue() {
            return getRuleContexts(ElementValueContext.class);
        }
        public ElementValueContext elementValue(int i) {
            return getRuleContext(ElementValueContext.class,i);
        }
        public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValueArrayInitializer(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValueArrayInitializer(this);
        }
    }

    public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
        ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_elementValueArrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(763);
                match(LBRACE);
                setState(772);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(764);
                        elementValue();
                        setState(769);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,85,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(765);
                                        match(COMMA);
                                        setState(766);
                                        elementValue();
                                    }
                                }
                            }
                            setState(771);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,85,_ctx);
                        }
                    }
                }

                setState(775);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMA) {
                    {
                        setState(774);
                        match(COMMA);
                    }
                }

                setState(777);
                match(RBRACE);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
        public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public AnnotationTypeBodyContext annotationTypeBody() {
            return getRuleContext(AnnotationTypeBodyContext.class,0);
        }
        public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeDeclaration(this);
        }
    }

    public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
        AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_annotationTypeDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(779);
                match(AT);
                setState(780);
                match(INTERFACE);
                setState(781);
                match(IDENTIFIER);
                setState(782);
                annotationTypeBody();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeBodyContext extends ParserRuleContext {
        public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
            return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
        }
        public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
            return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
        }
        public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationTypeBody; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeBody(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeBody(this);
        }
    }

    public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
        AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_annotationTypeBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(784);
                match(LBRACE);
                setState(788);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
                    {
                        {
                            setState(785);
                            annotationTypeElementDeclaration();
                        }
                    }
                    setState(790);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(791);
                match(RBRACE);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
        public AnnotationTypeElementRestContext annotationTypeElementRest() {
            return getRuleContext(AnnotationTypeElementRestContext.class,0);
        }
        public List<ModifierContext> modifier() {
            return getRuleContexts(ModifierContext.class);
        }
        public ModifierContext modifier(int i) {
            return getRuleContext(ModifierContext.class,i);
        }
        public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
        }
    }

    public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
        AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_annotationTypeElementDeclaration);
        try {
            int _alt;
            setState(801);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case CLASS:
                case DOUBLE:
                case ENUM:
                case FINAL:
                case FLOAT:
                case INT:
                case INTERFACE:
                case LONG:
                case NATIVE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case SHORT:
                case STATIC:
                case STRICTFP:
                case SYNCHRONIZED:
                case TRANSIENT:
                case VOLATILE:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(796);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,89,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(793);
                                    modifier();
                                }
                            }
                        }
                        setState(798);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,89,_ctx);
                    }
                    setState(799);
                    annotationTypeElementRest();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(800);
                    match(SEMI);
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

    public static class AnnotationTypeElementRestContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
            return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
        }
        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class,0);
        }
        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class,0);
        }
        public EnumDeclarationContext enumDeclaration() {
            return getRuleContext(EnumDeclarationContext.class,0);
        }
        public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
            return getRuleContext(AnnotationTypeDeclarationContext.class,0);
        }
        public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementRest(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementRest(this);
        }
    }

    public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
        AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_annotationTypeElementRest);
        try {
            setState(824);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(803);
                    typeType();
                    setState(804);
                    annotationMethodOrConstantRest();
                    setState(806);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
                        case 1:
                        {
                            setState(805);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(808);
                    classDeclaration();
                    setState(810);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
                        case 1:
                        {
                            setState(809);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(812);
                    interfaceDeclaration();
                    setState(814);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
                        case 1:
                        {
                            setState(813);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(816);
                    enumDeclaration();
                    setState(818);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
                        case 1:
                        {
                            setState(817);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(820);
                    annotationTypeDeclaration();
                    setState(822);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
                        case 1:
                        {
                            setState(821);
                            match(SEMI);
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

    public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
        public AnnotationMethodRestContext annotationMethodRest() {
            return getRuleContext(AnnotationMethodRestContext.class,0);
        }
        public AnnotationConstantRestContext annotationConstantRest() {
            return getRuleContext(AnnotationConstantRestContext.class,0);
        }
        public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
        }
    }

    public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
        AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_annotationMethodOrConstantRest);
        try {
            setState(828);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(826);
                    annotationMethodRest();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(827);
                    annotationConstantRest();
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

    public static class AnnotationMethodRestContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public DefaultValueContext defaultValue() {
            return getRuleContext(DefaultValueContext.class,0);
        }
        public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationMethodRest; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodRest(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodRest(this);
        }
    }

    public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
        AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_annotationMethodRest);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(830);
                match(IDENTIFIER);
                setState(831);
                match(LPAREN);
                setState(832);
                match(RPAREN);
                setState(834);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEFAULT) {
                    {
                        setState(833);
                        defaultValue();
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

    public static class AnnotationConstantRestContext extends ParserRuleContext {
        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class,0);
        }
        public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_annotationConstantRest; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationConstantRest(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationConstantRest(this);
        }
    }

    public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
        AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_annotationConstantRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(836);
                variableDeclarators();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DefaultValueContext extends ParserRuleContext {
        public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class,0);
        }
        public DefaultValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_defaultValue; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDefaultValue(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDefaultValue(this);
        }
    }

    public final DefaultValueContext defaultValue() throws RecognitionException {
        DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_defaultValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(838);
                match(DEFAULT);
                setState(839);
                elementValue();
            }
        }
        catch (RecognitionException re) {
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
        public MultipleStatementsContext multipleStatements() {
            return getRuleContext(MultipleStatementsContext.class,0);
        }
        public List<TerminalNode> NEWLINE() { return getTokens(JavaParser.NEWLINE); }
        public TerminalNode NEWLINE(int i) {
            return getToken(JavaParser.NEWLINE, i);
        }
        public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_block; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlock(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlock(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_block);
        int _la;
        try {
            setState(869);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(842);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(841);
                            match(NEWLINE);
                        }
                    }

                    setState(844);
                    match(LBRACE);
                    setState(846);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
                        case 1:
                        {
                            setState(845);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(848);
                    multipleStatements();
                    setState(850);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
                        case 1:
                        {
                            setState(849);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(853);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
                        case 1:
                        {
                            setState(852);
                            match(RBRACE);
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(856);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(855);
                            match(NEWLINE);
                        }
                    }

                    setState(858);
                    match(LBRACE);
                    setState(860);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(859);
                            match(NEWLINE);
                        }
                    }

                    setState(862);
                    match(WILDCARD);
                    setState(864);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
                        case 1:
                        {
                            setState(863);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(867);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
                        case 1:
                        {
                            setState(866);
                            match(RBRACE);
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

    public static class MultipleStatementsContext extends ParserRuleContext {
        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }
        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class,i);
        }
        public MultipleStatementsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_multipleStatements; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMultipleStatements(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMultipleStatements(this);
        }
    }

    public final MultipleStatementsContext multipleStatements() throws RecognitionException {
        MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_multipleStatements);
        try {
            int _alt;
            setState(878);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(875);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,108,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(872);
                                    blockStatement();
                                }
                            }
                        }
                        setState(877);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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

    public static class BlockStatementContext extends ParserRuleContext {
        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class,0);
        }
        public TerminalNode NEWLINE() { return getToken(JavaParser.NEWLINE, 0); }
        public StatementContext statement() {
            return getRuleContext(StatementContext.class,0);
        }
        public LocalTypeDeclarationContext localTypeDeclaration() {
            return getRuleContext(LocalTypeDeclarationContext.class,0);
        }
        public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
        public BlockStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_blockStatement; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatement(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatement(this);
        }
    }

    public final BlockStatementContext blockStatement() throws RecognitionException {
        BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_blockStatement);
        try {
            setState(899);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(880);
                    localVariableDeclaration();
                    setState(882);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
                        case 1:
                        {
                            setState(881);
                            match(SEMI);
                        }
                        break;
                    }
                    setState(885);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
                        case 1:
                        {
                            setState(884);
                            match(NEWLINE);
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(887);
                    statement();
                    setState(889);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
                        case 1:
                        {
                            setState(888);
                            match(NEWLINE);
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(891);
                    localTypeDeclaration();
                    setState(893);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
                        case 1:
                        {
                            setState(892);
                            match(NEWLINE);
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(895);
                    match(WILDCARD);
                    setState(897);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
                        case 1:
                        {
                            setState(896);
                            match(NEWLINE);
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

    public static class LocalVariableDeclarationContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public VariableDeclaratorsContext variableDeclarators() {
            return getRuleContext(VariableDeclaratorsContext.class,0);
        }
        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }
        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class,i);
        }
        public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclaration(this);
        }
    }

    public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
        LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_localVariableDeclaration);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(904);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,116,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(901);
                                variableModifier();
                            }
                        }
                    }
                    setState(906);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,116,_ctx);
                }
                setState(907);
                typeType();
                setState(908);
                variableDeclarators();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LocalTypeDeclarationContext extends ParserRuleContext {
        public ClassDeclarationContext classDeclaration() {
            return getRuleContext(ClassDeclarationContext.class,0);
        }
        public InterfaceDeclarationContext interfaceDeclaration() {
            return getRuleContext(InterfaceDeclarationContext.class,0);
        }
        public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
            return getRuleContexts(ClassOrInterfaceModifierContext.class);
        }
        public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
            return getRuleContext(ClassOrInterfaceModifierContext.class,i);
        }
        public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalTypeDeclaration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalTypeDeclaration(this);
        }
    }

    public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
        LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_localTypeDeclaration);
        int _la;
        try {
            setState(921);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ABSTRACT:
                case CLASS:
                case FINAL:
                case INTERFACE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case STRICTFP:
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(913);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
                        {
                            {
                                setState(910);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(915);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(918);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS:
                        {
                            setState(916);
                            classDeclaration();
                        }
                        break;
                        case INTERFACE:
                        {
                            setState(917);
                            interfaceDeclaration();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(920);
                    match(SEMI);
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

    public static class StatementContext extends ParserRuleContext {
        public BlockContext blockLabel;
        public ExpressionContext statementExpression;
        public Token identifierLabel;
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
        public List<TerminalNode> EXPR() { return getTokens(JavaParser.EXPR); }
        public TerminalNode EXPR(int i) {
            return getToken(JavaParser.EXPR, i);
        }
        public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }
        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class,i);
        }
        public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
        public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
        public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
        public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
        public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
            return getRuleContexts(SwitchBlockStatementGroupContext.class);
        }
        public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
            return getRuleContext(SwitchBlockStatementGroupContext.class,i);
        }
        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }
        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class,i);
        }
        public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
        public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
        public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
        public ParExpressionContext parExpression() {
            return getRuleContext(ParExpressionContext.class,0);
        }
        public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
        public ForControlContext forControl() {
            return getRuleContext(ForControlContext.class,0);
        }
        public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
        public FinallyBlockContext finallyBlock() {
            return getRuleContext(FinallyBlockContext.class,0);
        }
        public List<CatchClauseContext> catchClause() {
            return getRuleContexts(CatchClauseContext.class);
        }
        public CatchClauseContext catchClause(int i) {
            return getRuleContext(CatchClauseContext.class,i);
        }
        public ResourceSpecificationContext resourceSpecification() {
            return getRuleContext(ResourceSpecificationContext.class,0);
        }
        public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
        public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_statement; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatement(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatement(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(1112);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(923);
                    ((StatementContext)_localctx).blockLabel = block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(924);
                    match(ASSERT);
                    setState(925);
                    match(EXPR);
                    setState(928);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
                        case 1:
                        {
                            setState(926);
                            match(COLON);
                            setState(927);
                            match(EXPR);
                        }
                        break;
                    }
                    setState(931);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
                        case 1:
                        {
                            setState(930);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(933);
                    match(FOR);
                    setState(934);
                    match(LPAREN);
                    setState(935);
                    match(EXPR);
                    setState(940);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(936);
                                match(COMMA);
                                setState(937);
                                match(EXPR);
                            }
                        }
                        setState(942);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(943);
                    match(RPAREN);
                    setState(945);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
                        case 1:
                        {
                            setState(944);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(947);
                    match(FOR);
                    setState(948);
                    match(LPAREN);
                    setState(949);
                    match(WILDCARD);
                    setState(950);
                    match(RPAREN);
                    setState(952);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
                        case 1:
                        {
                            setState(951);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(954);
                    match(WHILE);
                    setState(955);
                    match(EXPR);
                    setState(957);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
                        case 1:
                        {
                            setState(956);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(959);
                    match(DO);
                    setState(960);
                    statement();
                    setState(961);
                    match(WHILE);
                    setState(962);
                    match(EXPR);
                    setState(964);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
                        case 1:
                        {
                            setState(963);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(966);
                    match(SWITCH);
                    setState(967);
                    match(EXPR);
                    setState(968);
                    match(LBRACE);
                    setState(972);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,127,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(969);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(974);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,127,_ctx);
                    }
                    setState(978);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CASE || _la==DEFAULT) {
                        {
                            {
                                setState(975);
                                switchLabel();
                            }
                        }
                        setState(980);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(981);
                    match(RBRACE);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(982);
                    match(SYNCHRONIZED);
                    setState(983);
                    match(EXPR);
                    setState(984);
                    block();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(985);
                    match(RETURN);
                    setState(986);
                    match(EXPR);
                    setState(988);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
                        case 1:
                        {
                            setState(987);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(990);
                    match(THROW);
                    setState(991);
                    match(EXPR);
                    setState(993);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
                        case 1:
                        {
                            setState(992);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(995);
                    match(ASSERT);
                    setState(996);
                    expression(0);
                    setState(999);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
                        case 1:
                        {
                            setState(997);
                            match(COLON);
                            setState(998);
                            expression(0);
                        }
                        break;
                    }
                    setState(1002);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
                        case 1:
                        {
                            setState(1001);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(1004);
                    match(IF);
                    setState(1005);
                    parExpression();
                    setState(1007);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
                        case 1:
                        {
                            setState(1006);
                            statement();
                        }
                        break;
                    }
                    setState(1011);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
                        case 1:
                        {
                            setState(1009);
                            match(ELSE);
                            setState(1010);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(1013);
                    match(FOR);
                    setState(1014);
                    match(LPAREN);
                    setState(1015);
                    forControl();
                    setState(1016);
                    match(RPAREN);
                    setState(1018);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
                        case 1:
                        {
                            setState(1017);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(1020);
                    match(WHILE);
                    setState(1021);
                    parExpression();
                    setState(1023);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
                        case 1:
                        {
                            setState(1022);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(1025);
                    match(DO);
                    setState(1026);
                    statement();
                    setState(1027);
                    match(WHILE);
                    setState(1028);
                    parExpression();
                    setState(1030);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
                        case 1:
                        {
                            setState(1029);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(1032);
                    match(TRY);
                    setState(1033);
                    block();
                    setState(1043);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CATCH:
                        {
                            setState(1035);
                            _errHandler.sync(this);
                            _alt = 1;
                            do {
                                switch (_alt) {
                                    case 1:
                                    {
                                        {
                                            setState(1034);
                                            catchClause();
                                        }
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                                setState(1037);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input,138,_ctx);
                            } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
                            setState(1040);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
                                case 1:
                                {
                                    setState(1039);
                                    finallyBlock();
                                }
                                break;
                            }
                        }
                        break;
                        case FINALLY:
                        {
                            setState(1042);
                            finallyBlock();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(1045);
                    match(TRY);
                    setState(1046);
                    resourceSpecification();
                    setState(1047);
                    block();
                    setState(1051);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,141,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1048);
                                    catchClause();
                                }
                            }
                        }
                        setState(1053);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,141,_ctx);
                    }
                    setState(1055);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
                        case 1:
                        {
                            setState(1054);
                            finallyBlock();
                        }
                        break;
                    }
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(1057);
                    match(SWITCH);
                    setState(1058);
                    parExpression();
                    setState(1059);
                    match(LBRACE);
                    setState(1063);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,143,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1060);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(1065);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,143,_ctx);
                    }
                    setState(1069);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CASE || _la==DEFAULT) {
                        {
                            {
                                setState(1066);
                                switchLabel();
                            }
                        }
                        setState(1071);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1072);
                    match(RBRACE);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(1074);
                    match(SYNCHRONIZED);
                    setState(1075);
                    parExpression();
                    setState(1076);
                    block();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(1078);
                    match(RETURN);
                    setState(1080);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
                        case 1:
                        {
                            setState(1079);
                            expression(0);
                        }
                        break;
                    }
                    setState(1083);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
                        case 1:
                        {
                            setState(1082);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(1085);
                    match(THROW);
                    setState(1086);
                    expression(0);
                    setState(1088);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
                        case 1:
                        {
                            setState(1087);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(1090);
                    match(BREAK);
                    setState(1092);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
                        case 1:
                        {
                            setState(1091);
                            match(IDENTIFIER);
                        }
                        break;
                    }
                    setState(1095);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
                        case 1:
                        {
                            setState(1094);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(1097);
                    match(CONTINUE);
                    setState(1099);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
                        case 1:
                        {
                            setState(1098);
                            match(IDENTIFIER);
                        }
                        break;
                    }
                    setState(1102);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
                        case 1:
                        {
                            setState(1101);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(1104);
                    match(SEMI);
                }
                break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                {
                    setState(1105);
                    ((StatementContext)_localctx).statementExpression = expression(0);
                    setState(1107);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
                        case 1:
                        {
                            setState(1106);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 26:
                    enterOuterAlt(_localctx, 26);
                {
                    setState(1109);
                    ((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
                    setState(1110);
                    match(COLON);
                    setState(1111);
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

    public static class CatchClauseContext extends ParserRuleContext {
        public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
        public CatchTypeContext catchType() {
            return getRuleContext(CatchTypeContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }
        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class,i);
        }
        public CatchClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_catchClause; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClause(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClause(this);
        }
    }

    public final CatchClauseContext catchClause() throws RecognitionException {
        CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_catchClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1114);
                match(CATCH);
                setState(1115);
                match(LPAREN);
                setState(1119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==FINAL || _la==AT) {
                    {
                        {
                            setState(1116);
                            variableModifier();
                        }
                    }
                    setState(1121);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1122);
                catchType();
                setState(1123);
                match(IDENTIFIER);
                setState(1124);
                match(RPAREN);
                setState(1125);
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

    public static class CatchTypeContext extends ParserRuleContext {
        public List<QualifiedNameContext> qualifiedName() {
            return getRuleContexts(QualifiedNameContext.class);
        }
        public QualifiedNameContext qualifiedName(int i) {
            return getRuleContext(QualifiedNameContext.class,i);
        }
        public CatchTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_catchType; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchType(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchType(this);
        }
    }

    public final CatchTypeContext catchType() throws RecognitionException {
        CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_catchType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1127);
                qualifiedName();
                setState(1132);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==BITOR) {
                    {
                        {
                            setState(1128);
                            match(BITOR);
                            setState(1129);
                            qualifiedName();
                        }
                    }
                    setState(1134);
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

    public static class FinallyBlockContext extends ParserRuleContext {
        public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_finallyBlock; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFinallyBlock(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFinallyBlock(this);
        }
    }

    public final FinallyBlockContext finallyBlock() throws RecognitionException {
        FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_finallyBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1135);
                match(FINALLY);
                setState(1136);
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

    public static class ResourceSpecificationContext extends ParserRuleContext {
        public ResourcesContext resources() {
            return getRuleContext(ResourcesContext.class,0);
        }
        public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_resourceSpecification; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResourceSpecification(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResourceSpecification(this);
        }
    }

    public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
        ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_resourceSpecification);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1138);
                match(LPAREN);
                setState(1139);
                resources();
                setState(1141);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SEMI) {
                    {
                        setState(1140);
                        match(SEMI);
                    }
                }

                setState(1143);
                match(RPAREN);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ResourcesContext extends ParserRuleContext {
        public List<ResourceContext> resource() {
            return getRuleContexts(ResourceContext.class);
        }
        public ResourceContext resource(int i) {
            return getRuleContext(ResourceContext.class,i);
        }
        public ResourcesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_resources; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResources(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResources(this);
        }
    }

    public final ResourcesContext resources() throws RecognitionException {
        ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_resources);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1145);
                resource();
                setState(1152);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,158,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1147);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==SEMI) {
                                    {
                                        setState(1146);
                                        match(SEMI);
                                    }
                                }

                                setState(1149);
                                resource();
                            }
                        }
                    }
                    setState(1154);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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

    public static class ResourceContext extends ParserRuleContext {
        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class,0);
        }
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class,0);
        }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }
        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class,i);
        }
        public ResourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_resource; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResource(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResource(this);
        }
    }

    public final ResourceContext resource() throws RecognitionException {
        ResourceContext _localctx = new ResourceContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_resource);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1158);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==FINAL || _la==AT) {
                    {
                        {
                            setState(1155);
                            variableModifier();
                        }
                    }
                    setState(1160);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1161);
                classOrInterfaceType();
                setState(1162);
                variableDeclaratorId();
                setState(1163);
                match(ASSIGN);
                setState(1164);
                expression(0);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
        public List<SwitchLabelContext> switchLabel() {
            return getRuleContexts(SwitchLabelContext.class);
        }
        public SwitchLabelContext switchLabel(int i) {
            return getRuleContext(SwitchLabelContext.class,i);
        }
        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }
        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class,i);
        }
        public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroup(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroup(this);
        }
    }

    public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
        SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_switchBlockStatementGroup);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1167);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1166);
                            switchLabel();
                        }
                    }
                    setState(1169);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==CASE || _la==DEFAULT );
                setState(1172);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1171);
                            blockStatement();
                        }
                    }
                    setState(1174);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << EXPR) | (1L << WILDCARD) | (1L << NEWLINE) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SwitchLabelContext extends ParserRuleContext {
        public ExpressionContext constantExpression;
        public Token enumConstantName;
        public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
        public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_switchLabel; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabel(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabel(this);
        }
    }

    public final SwitchLabelContext switchLabel() throws RecognitionException {
        SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_switchLabel);
        try {
            setState(1184);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CASE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1176);
                    match(CASE);
                    setState(1179);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
                        case 1:
                        {
                            setState(1177);
                            ((SwitchLabelContext)_localctx).constantExpression = expression(0);
                        }
                        break;
                        case 2:
                        {
                            setState(1178);
                            ((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
                        }
                        break;
                    }
                    setState(1181);
                    match(COLON);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1182);
                    match(DEFAULT);
                    setState(1183);
                    match(COLON);
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

    public static class ForControlContext extends ParserRuleContext {
        public ExpressionListContext forUpdate;
        public EnhancedForControlContext enhancedForControl() {
            return getRuleContext(EnhancedForControlContext.class,0);
        }
        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class,0);
        }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class,0);
        }
        public ForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_forControl; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForControl(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForControl(this);
        }
    }

    public final ForControlContext forControl() throws RecognitionException {
        ForControlContext _localctx = new ForControlContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_forControl);
        int _la;
        try {
            setState(1202);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1186);
                    enhancedForControl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1188);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
                        case 1:
                        {
                            setState(1187);
                            forInit();
                        }
                        break;
                    }
                    setState(1191);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
                        case 1:
                        {
                            setState(1190);
                            match(SEMI);
                        }
                        break;
                    }
                    setState(1194);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
                        case 1:
                        {
                            setState(1193);
                            expression(0);
                        }
                        break;
                    }
                    setState(1197);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==SEMI) {
                        {
                            setState(1196);
                            match(SEMI);
                        }
                    }

                    setState(1200);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1199);
                            ((ForControlContext)_localctx).forUpdate = expressionList();
                        }
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

    public static class ForInitContext extends ParserRuleContext {
        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class,0);
        }
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class,0);
        }
        public ForInitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_forInit; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForInit(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForInit(this);
        }
    }

    public final ForInitContext forInit() throws RecognitionException {
        ForInitContext _localctx = new ForInitContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_forInit);
        try {
            setState(1206);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1204);
                    localVariableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1205);
                    expressionList();
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

    public static class EnhancedForControlContext extends ParserRuleContext {
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public VariableDeclaratorIdContext variableDeclaratorId() {
            return getRuleContext(VariableDeclaratorIdContext.class,0);
        }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public List<VariableModifierContext> variableModifier() {
            return getRuleContexts(VariableModifierContext.class);
        }
        public VariableModifierContext variableModifier(int i) {
            return getRuleContext(VariableModifierContext.class,i);
        }
        public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_enhancedForControl; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnhancedForControl(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnhancedForControl(this);
        }
    }

    public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
        EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_enhancedForControl);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1211);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,171,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1208);
                                variableModifier();
                            }
                        }
                    }
                    setState(1213);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,171,_ctx);
                }
                setState(1214);
                typeType();
                setState(1215);
                variableDeclaratorId();
                setState(1216);
                match(COLON);
                setState(1217);
                expression(0);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParExpressionContext extends ParserRuleContext {
        public TerminalNode EXPR() { return getToken(JavaParser.EXPR, 0); }
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public ParExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_parExpression; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParExpression(this);
        }
    }

    public final ParExpressionContext parExpression() throws RecognitionException {
        ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_parExpression);
        try {
            setState(1226);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1219);
                    match(LPAREN);
                    setState(1220);
                    match(EXPR);
                    setState(1221);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1222);
                    match(LPAREN);
                    setState(1223);
                    expression(0);
                    setState(1224);
                    match(RPAREN);
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

    public static class ExpressionListContext extends ParserRuleContext {
        public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
        public List<TerminalNode> EXPR() { return getTokens(JavaParser.EXPR); }
        public TerminalNode EXPR(int i) {
            return getToken(JavaParser.EXPR, i);
        }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public ExpressionListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_expressionList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpressionList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpressionList(this);
        }
    }

    public final ExpressionListContext expressionList() throws RecognitionException {
        ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_expressionList);
        int _la;
        try {
            setState(1245);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1228);
                    match(WILDCARD);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1229);
                    match(EXPR);
                    setState(1234);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1230);
                                match(COMMA);
                                setState(1231);
                                match(EXPR);
                            }
                        }
                        setState(1236);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1237);
                    expression(0);
                    setState(1242);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1238);
                                match(COMMA);
                                setState(1239);
                                expression(0);
                            }
                        }
                        setState(1244);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
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

    public static class MethodCallContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class,0);
        }
        public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
        public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
        public MethodCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_methodCall; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodCall(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodCall(this);
        }
    }

    public final MethodCallContext methodCall() throws RecognitionException {
        MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_methodCall);
        int _la;
        try {
            setState(1265);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1247);
                    match(IDENTIFIER);
                    setState(1248);
                    match(LPAREN);
                    setState(1250);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1249);
                            expressionList();
                        }
                    }

                    setState(1252);
                    match(RPAREN);
                }
                break;
                case THIS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1253);
                    match(THIS);
                    setState(1254);
                    match(LPAREN);
                    setState(1256);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1255);
                            expressionList();
                        }
                    }

                    setState(1258);
                    match(RPAREN);
                }
                break;
                case SUPER:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1259);
                    match(SUPER);
                    setState(1260);
                    match(LPAREN);
                    setState(1262);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1261);
                            expressionList();
                        }
                    }

                    setState(1264);
                    match(RPAREN);
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

    public static class Binary_operatorsContext extends ParserRuleContext {
        public TerminalNode BINOP() { return getToken(JavaParser.BINOP, 0); }
        public Binary_operatorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_binary_operators; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBinary_operators(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBinary_operators(this);
        }
    }

    public final Binary_operatorsContext binary_operators() throws RecognitionException {
        Binary_operatorsContext _localctx = new Binary_operatorsContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_binary_operators);
        try {
            setState(1291);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1267);
                    match(MUL);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1268);
                    match(DIV);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1269);
                    match(MOD);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1270);
                    match(ADD);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1271);
                    match(SUB);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1272);
                    match(LT);
                    setState(1273);
                    match(LT);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1274);
                    match(GT);
                    setState(1275);
                    match(GT);
                    setState(1276);
                    match(GT);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(1277);
                    match(GT);
                    setState(1278);
                    match(GT);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(1279);
                    match(LE);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(1280);
                    match(GE);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(1281);
                    match(GT);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(1282);
                    match(LT);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(1283);
                    match(EQUAL);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(1284);
                    match(NOTEQUAL);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(1285);
                    match(BITAND);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(1286);
                    match(CARET);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(1287);
                    match(BITOR);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(1288);
                    match(AND);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(1289);
                    match(OR);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(1290);
                    match(BINOP);
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

    public static class Assign_operatorsContext extends ParserRuleContext {
        public TerminalNode OP() { return getToken(JavaParser.OP, 0); }
        public Assign_operatorsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_assign_operators; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssign_operators(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssign_operators(this);
        }
    }

    public final Assign_operatorsContext assign_operators() throws RecognitionException {
        Assign_operatorsContext _localctx = new Assign_operatorsContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_assign_operators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1293);
                _la = _input.LA(1);
                if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ASSIGN - 75)) | (1L << (OP - 75)) | (1L << (ADD_ASSIGN - 75)) | (1L << (SUB_ASSIGN - 75)) | (1L << (MUL_ASSIGN - 75)) | (1L << (DIV_ASSIGN - 75)) | (1L << (AND_ASSIGN - 75)) | (1L << (OR_ASSIGN - 75)) | (1L << (XOR_ASSIGN - 75)) | (1L << (MOD_ASSIGN - 75)) | (1L << (LSHIFT_ASSIGN - 75)) | (1L << (RSHIFT_ASSIGN - 75)) | (1L << (URSHIFT_ASSIGN - 75)))) != 0)) ) {
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

    public static class ExpressionContext extends ParserRuleContext {
        public Token prefix;
        public Token bop;
        public Token postfix;
        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class,0);
        }
        public MethodCallContext methodCall() {
            return getRuleContext(MethodCallContext.class,0);
        }
        public TerminalNode EXPR() { return getToken(JavaParser.EXPR, 0); }
        public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
        public CreatorContext creator() {
            return getRuleContext(CreatorContext.class,0);
        }
        public TypeTypeContext typeType() {
            return getRuleContext(TypeTypeContext.class,0);
        }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public LambdaExpressionContext lambdaExpression() {
            return getRuleContext(LambdaExpressionContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class,0);
        }
        public ClassTypeContext classType() {
            return getRuleContext(ClassTypeContext.class,0);
        }
        public Binary_operatorsContext binary_operators() {
            return getRuleContext(Binary_operatorsContext.class,0);
        }
        public Assign_operatorsContext assign_operators() {
            return getRuleContext(Assign_operatorsContext.class,0);
        }
        public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
        public InnerCreatorContext innerCreator() {
            return getRuleContext(InnerCreatorContext.class,0);
        }
        public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
        public SuperSuffixContext superSuffix() {
            return getRuleContext(SuperSuffixContext.class,0);
        }
        public ExplicitGenericInvocationContext explicitGenericInvocation() {
            return getRuleContext(ExplicitGenericInvocationContext.class,0);
        }
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
        }
        public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_expression; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpression(this);
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
        int _startState = 174;
        enterRecursionRule(_localctx, 174, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1327);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
                    case 1:
                    {
                        setState(1296);
                        primary();
                    }
                    break;
                    case 2:
                    {
                        setState(1297);
                        methodCall();
                    }
                    break;
                    case 3:
                    {
                        setState(1298);
                        match(EXPR);
                    }
                    break;
                    case 4:
                    {
                        setState(1299);
                        match(NEW);
                        setState(1300);
                        creator();
                    }
                    break;
                    case 5:
                    {
                        setState(1301);
                        match(LPAREN);
                        setState(1302);
                        typeType();
                        setState(1303);
                        match(RPAREN);
                        setState(1304);
                        expression(12);
                    }
                    break;
                    case 6:
                    {
                        setState(1306);
                        ((ExpressionContext)_localctx).prefix = _input.LT(1);
                        _la = _input.LA(1);
                        if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (INC - 88)) | (1L << (DEC - 88)) | (1L << (ADD - 88)) | (1L << (SUB - 88)))) != 0)) ) {
                            ((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
                        }
                        else {
                            if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1307);
                        expression(10);
                    }
                    break;
                    case 7:
                    {
                        setState(1308);
                        ((ExpressionContext)_localctx).prefix = _input.LT(1);
                        _la = _input.LA(1);
                        if ( !(_la==BANG || _la==TILDE) ) {
                            ((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
                        }
                        else {
                            if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1309);
                        expression(9);
                    }
                    break;
                    case 8:
                    {
                        setState(1310);
                        lambdaExpression();
                    }
                    break;
                    case 9:
                    {
                        setState(1311);
                        typeType();
                        setState(1312);
                        match(COLONCOLON);
                        setState(1318);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LT:
                            case IDENTIFIER:
                            {
                                setState(1314);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==LT) {
                                    {
                                        setState(1313);
                                        typeArguments();
                                    }
                                }

                                setState(1316);
                                match(IDENTIFIER);
                            }
                            break;
                            case NEW:
                            {
                                setState(1317);
                                match(NEW);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    break;
                    case 10:
                    {
                        setState(1320);
                        classType();
                        setState(1321);
                        match(COLONCOLON);
                        setState(1323);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==LT) {
                            {
                                setState(1322);
                                typeArguments();
                            }
                        }

                        setState(1325);
                        match(NEW);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1376);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,189,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1374);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1329);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(1330);
                                    binary_operators();
                                    setState(1331);
                                    expression(9);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1333);
                                    if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(1334);
                                    ((ExpressionContext)_localctx).bop = match(QUESTION);
                                    setState(1335);
                                    expression(0);
                                    setState(1336);
                                    match(COLON);
                                    setState(1337);
                                    expression(6);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1339);
                                    if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(1340);
                                    assign_operators();
                                    setState(1341);
                                    expression(5);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1343);
                                    if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(1344);
                                    ((ExpressionContext)_localctx).bop = match(DOT);
                                    setState(1356);
                                    _errHandler.sync(this);
                                    switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
                                        case 1:
                                        {
                                            setState(1345);
                                            match(IDENTIFIER);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1346);
                                            methodCall();
                                        }
                                        break;
                                        case 3:
                                        {
                                            setState(1347);
                                            match(THIS);
                                        }
                                        break;
                                        case 4:
                                        {
                                            setState(1348);
                                            match(NEW);
                                            setState(1350);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la==LT) {
                                                {
                                                    setState(1349);
                                                    nonWildcardTypeArguments();
                                                }
                                            }

                                            setState(1352);
                                            innerCreator();
                                        }
                                        break;
                                        case 5:
                                        {
                                            setState(1353);
                                            match(SUPER);
                                            setState(1354);
                                            superSuffix();
                                        }
                                        break;
                                        case 6:
                                        {
                                            setState(1355);
                                            explicitGenericInvocation();
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1358);
                                    if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(1359);
                                    match(LBRACK);
                                    setState(1360);
                                    expression(0);
                                    setState(1361);
                                    match(RBRACK);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1363);
                                    if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(1364);
                                    ((ExpressionContext)_localctx).postfix = _input.LT(1);
                                    _la = _input.LA(1);
                                    if ( !(_la==INC || _la==DEC) ) {
                                        ((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
                                    }
                                    else {
                                        if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1365);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1366);
                                    ((ExpressionContext)_localctx).bop = match(INSTANCEOF);
                                    setState(1367);
                                    typeType();
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1368);
                                    if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1369);
                                    match(COLONCOLON);
                                    setState(1371);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==LT) {
                                        {
                                            setState(1370);
                                            typeArguments();
                                        }
                                    }

                                    setState(1373);
                                    match(IDENTIFIER);
                                }
                                break;
                            }
                        }
                    }
                    setState(1378);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

    public static class LambdaExpressionContext extends ParserRuleContext {
        public LambdaParametersContext lambdaParameters() {
            return getRuleContext(LambdaParametersContext.class,0);
        }
        public LambdaBodyContext lambdaBody() {
            return getRuleContext(LambdaBodyContext.class,0);
        }
        public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_lambdaExpression; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaExpression(this);
        }
    }

    public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
        LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_lambdaExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1379);
                lambdaParameters();
                setState(1380);
                match(ARROW);
                setState(1381);
                lambdaBody();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LambdaParametersContext extends ParserRuleContext {
        public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }
        public FormalParameterListContext formalParameterList() {
            return getRuleContext(FormalParameterListContext.class,0);
        }
        public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_lambdaParameters; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaParameters(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaParameters(this);
        }
    }

    public final LambdaParametersContext lambdaParameters() throws RecognitionException {
        LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_lambdaParameters);
        int _la;
        try {
            setState(1399);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1383);
                    match(IDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1384);
                    match(LPAREN);
                    setState(1386);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
                        {
                            setState(1385);
                            formalParameterList();
                        }
                    }

                    setState(1388);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1389);
                    match(LPAREN);
                    setState(1390);
                    match(IDENTIFIER);
                    setState(1395);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1391);
                                match(COMMA);
                                setState(1392);
                                match(IDENTIFIER);
                            }
                        }
                        setState(1397);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1398);
                    match(RPAREN);
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

    public static class LambdaBodyContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_lambdaBody; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaBody(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaBody(this);
        }
    }

    public final LambdaBodyContext lambdaBody() throws RecognitionException {
        LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_lambdaBody);
        try {
            setState(1403);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
                case EXPR:
                case LITERALS:
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                case BOOL_LITERAL:
                case CHAR_LITERAL:
                case STRING_LITERAL:
                case NULL_LITERAL:
                case LPAREN:
                case LT:
                case BANG:
                case TILDE:
                case INC:
                case DEC:
                case ADD:
                case SUB:
                case AT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1401);
                    expression(0);
                }
                break;
                case NEWLINE:
                case LBRACE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1402);
                    block();
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

    public static class PrimaryContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class,0);
        }
        public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
        public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public TypeTypeOrVoidContext typeTypeOrVoid() {
            return getRuleContext(TypeTypeOrVoidContext.class,0);
        }
        public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
        }
        public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
            return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
        }
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class,0);
        }
        public PrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_primary; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimary(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimary(this);
        }
    }

    public final PrimaryContext primary() throws RecognitionException {
        PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_primary);
        try {
            setState(1423);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1405);
                    match(LPAREN);
                    setState(1406);
                    expression(0);
                    setState(1407);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1409);
                    match(THIS);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1410);
                    match(SUPER);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1411);
                    literal();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1412);
                    match(IDENTIFIER);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1413);
                    typeTypeOrVoid();
                    setState(1414);
                    match(DOT);
                    setState(1415);
                    match(CLASS);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1417);
                    nonWildcardTypeArguments();
                    setState(1421);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case SUPER:
                        case IDENTIFIER:
                        {
                            setState(1418);
                            explicitGenericInvocationSuffix();
                        }
                        break;
                        case THIS:
                        {
                            setState(1419);
                            match(THIS);
                            setState(1420);
                            arguments();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
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

    public static class ClassTypeContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class,0);
        }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class,0);
        }
        public ClassTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classType; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassType(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassType(this);
        }
    }

    public final ClassTypeContext classType() throws RecognitionException {
        ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_classType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1428);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
                    case 1:
                    {
                        setState(1425);
                        classOrInterfaceType();
                        setState(1426);
                        match(DOT);
                    }
                    break;
                }
                setState(1433);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(1430);
                            annotation();
                        }
                    }
                    setState(1435);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1436);
                match(IDENTIFIER);
                setState(1438);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(1437);
                        typeArguments();
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

    public static class CreatorContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
        }
        public CreatedNameContext createdName() {
            return getRuleContext(CreatedNameContext.class,0);
        }
        public ClassCreatorRestContext classCreatorRest() {
            return getRuleContext(ClassCreatorRestContext.class,0);
        }
        public ArrayCreatorRestContext arrayCreatorRest() {
            return getRuleContext(ArrayCreatorRestContext.class,0);
        }
        public CreatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_creator; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreator(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreator(this);
        }
    }

    public final CreatorContext creator() throws RecognitionException {
        CreatorContext _localctx = new CreatorContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_creator);
        try {
            setState(1449);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1440);
                    nonWildcardTypeArguments();
                    setState(1441);
                    createdName();
                    setState(1442);
                    classCreatorRest();
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1444);
                    createdName();
                    setState(1447);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LBRACK:
                        {
                            setState(1445);
                            arrayCreatorRest();
                        }
                        break;
                        case LPAREN:
                        {
                            setState(1446);
                            classCreatorRest();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
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

    public static class CreatedNameContext extends ParserRuleContext {
        public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
        public TerminalNode IDENTIFIER(int i) {
            return getToken(JavaParser.IDENTIFIER, i);
        }
        public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
            return getRuleContexts(TypeArgumentsOrDiamondContext.class);
        }
        public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
            return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
        }
        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class,0);
        }
        public CreatedNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_createdName; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreatedName(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreatedName(this);
        }
    }

    public final CreatedNameContext createdName() throws RecognitionException {
        CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_createdName);
        int _la;
        try {
            setState(1466);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1451);
                    match(IDENTIFIER);
                    setState(1453);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==LT) {
                        {
                            setState(1452);
                            typeArgumentsOrDiamond();
                        }
                    }

                    setState(1462);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==DOT) {
                        {
                            {
                                setState(1455);
                                match(DOT);
                                setState(1456);
                                match(IDENTIFIER);
                                setState(1458);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==LT) {
                                    {
                                        setState(1457);
                                        typeArgumentsOrDiamond();
                                    }
                                }

                            }
                        }
                        setState(1464);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1465);
                    primitiveType();
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

    public static class InnerCreatorContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public ClassCreatorRestContext classCreatorRest() {
            return getRuleContext(ClassCreatorRestContext.class,0);
        }
        public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
            return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
        }
        public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_innerCreator; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInnerCreator(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInnerCreator(this);
        }
    }

    public final InnerCreatorContext innerCreator() throws RecognitionException {
        InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_innerCreator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1468);
                match(IDENTIFIER);
                setState(1470);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(1469);
                        nonWildcardTypeArgumentsOrDiamond();
                    }
                }

                setState(1472);
                classCreatorRest();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayCreatorRestContext extends ParserRuleContext {
        public ArrayInitializerContext arrayInitializer() {
            return getRuleContext(ArrayInitializerContext.class,0);
        }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayCreatorRest(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayCreatorRest(this);
        }
    }

    public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
        ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_arrayCreatorRest);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1474);
                match(LBRACK);
                setState(1502);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RBRACK:
                    {
                        setState(1475);
                        match(RBRACK);
                        setState(1480);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la==LBRACK) {
                            {
                                {
                                    setState(1476);
                                    match(LBRACK);
                                    setState(1477);
                                    match(RBRACK);
                                }
                            }
                            setState(1482);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1483);
                        arrayInitializer();
                    }
                    break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case NEW:
                    case SHORT:
                    case SUPER:
                    case THIS:
                    case VOID:
                    case EXPR:
                    case LITERALS:
                    case DECIMAL_LITERAL:
                    case HEX_LITERAL:
                    case OCT_LITERAL:
                    case BINARY_LITERAL:
                    case FLOAT_LITERAL:
                    case HEX_FLOAT_LITERAL:
                    case BOOL_LITERAL:
                    case CHAR_LITERAL:
                    case STRING_LITERAL:
                    case NULL_LITERAL:
                    case LPAREN:
                    case LT:
                    case BANG:
                    case TILDE:
                    case INC:
                    case DEC:
                    case ADD:
                    case SUB:
                    case AT:
                    case IDENTIFIER:
                    {
                        setState(1484);
                        expression(0);
                        setState(1485);
                        match(RBRACK);
                        setState(1492);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,207,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(1486);
                                        match(LBRACK);
                                        setState(1487);
                                        expression(0);
                                        setState(1488);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1494);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,207,_ctx);
                        }
                        setState(1499);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,208,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(1495);
                                        match(LBRACK);
                                        setState(1496);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1501);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,208,_ctx);
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
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

    public static class ClassCreatorRestContext extends ParserRuleContext {
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class,0);
        }
        public ClassBodyContext classBody() {
            return getRuleContext(ClassBodyContext.class,0);
        }
        public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classCreatorRest; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassCreatorRest(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassCreatorRest(this);
        }
    }

    public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
        ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_classCreatorRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1504);
                arguments();
                setState(1506);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
                    case 1:
                    {
                        setState(1505);
                        classBody();
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

    public static class ExplicitGenericInvocationContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
        }
        public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
            return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
        }
        public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocation(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocation(this);
        }
    }

    public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
        ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_explicitGenericInvocation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1508);
                nonWildcardTypeArguments();
                setState(1509);
                explicitGenericInvocationSuffix();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
        public TypeArgumentsContext typeArguments() {
            return getRuleContext(TypeArgumentsContext.class,0);
        }
        public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgumentsOrDiamond(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgumentsOrDiamond(this);
        }
    }

    public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
        TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_typeArgumentsOrDiamond);
        try {
            setState(1514);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1511);
                    match(LT);
                    setState(1512);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1513);
                    typeArguments();
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

    public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
        public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
            return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
        }
        public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
        }
    }

    public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
        NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_nonWildcardTypeArgumentsOrDiamond);
        try {
            setState(1519);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1516);
                    match(LT);
                    setState(1517);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1518);
                    nonWildcardTypeArguments();
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

    public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
        public TypeListContext typeList() {
            return getRuleContext(TypeListContext.class,0);
        }
        public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArguments(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArguments(this);
        }
    }

    public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
        NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_nonWildcardTypeArguments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1521);
                match(LT);
                setState(1522);
                typeList();
                setState(1523);
                match(GT);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeListContext extends ParserRuleContext {
        public List<TypeTypeContext> typeType() {
            return getRuleContexts(TypeTypeContext.class);
        }
        public TypeTypeContext typeType(int i) {
            return getRuleContext(TypeTypeContext.class,i);
        }
        public TypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeList(this);
        }
    }

    public final TypeListContext typeList() throws RecognitionException {
        TypeListContext _localctx = new TypeListContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_typeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1525);
                typeType();
                setState(1530);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(1526);
                            match(COMMA);
                            setState(1527);
                            typeType();
                        }
                    }
                    setState(1532);
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

    public static class TypeTypeContext extends ParserRuleContext {
        public ClassOrInterfaceTypeContext classOrInterfaceType() {
            return getRuleContext(ClassOrInterfaceTypeContext.class,0);
        }
        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class,0);
        }
        public AnnotationContext annotation() {
            return getRuleContext(AnnotationContext.class,0);
        }
        public TypeTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeType; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeType(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeType(this);
        }
    }

    public final TypeTypeContext typeType() throws RecognitionException {
        TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_typeType);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1534);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==AT) {
                    {
                        setState(1533);
                        annotation();
                    }
                }

                setState(1538);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case IDENTIFIER:
                    {
                        setState(1536);
                        classOrInterfaceType();
                    }
                    break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                    {
                        setState(1537);
                        primitiveType();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(1544);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,216,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1540);
                                match(LBRACK);
                                setState(1541);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(1546);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,216,_ctx);
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

    public static class PrimitiveTypeContext extends ParserRuleContext {
        public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
        public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
        public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
        public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
        public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
        public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
        public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
        public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
        public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_primitiveType; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimitiveType(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimitiveType(this);
        }
    }

    public final PrimitiveTypeContext primitiveType() throws RecognitionException {
        PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_primitiveType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1547);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

    public static class TypeArgumentsContext extends ParserRuleContext {
        public List<TypeArgumentContext> typeArgument() {
            return getRuleContexts(TypeArgumentContext.class);
        }
        public TypeArgumentContext typeArgument(int i) {
            return getRuleContext(TypeArgumentContext.class,i);
        }
        public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_typeArguments; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArguments(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArguments(this);
        }
    }

    public final TypeArgumentsContext typeArguments() throws RecognitionException {
        TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
        enterRule(_localctx, 210, RULE_typeArguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1549);
                match(LT);
                setState(1550);
                typeArgument();
                setState(1555);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(1551);
                            match(COMMA);
                            setState(1552);
                            typeArgument();
                        }
                    }
                    setState(1557);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1558);
                match(GT);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SuperSuffixContext extends ParserRuleContext {
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_superSuffix; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperSuffix(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperSuffix(this);
        }
    }

    public final SuperSuffixContext superSuffix() throws RecognitionException {
        SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
        enterRule(_localctx, 212, RULE_superSuffix);
        try {
            setState(1566);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LPAREN:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1560);
                    arguments();
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1561);
                    match(DOT);
                    setState(1562);
                    match(IDENTIFIER);
                    setState(1564);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
                        case 1:
                        {
                            setState(1563);
                            arguments();
                        }
                        break;
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

    public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
        public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
        public SuperSuffixContext superSuffix() {
            return getRuleContext(SuperSuffixContext.class,0);
        }
        public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class,0);
        }
        public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
        }
    }

    public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
        ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
        enterRule(_localctx, 214, RULE_explicitGenericInvocationSuffix);
        try {
            setState(1572);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SUPER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1568);
                    match(SUPER);
                    setState(1569);
                    superSuffix();
                }
                break;
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1570);
                    match(IDENTIFIER);
                    setState(1571);
                    arguments();
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

    public static class ArgumentsContext extends ParserRuleContext {
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class,0);
        }
        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_arguments; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArguments(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArguments(this);
        }
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1574);
                match(LPAREN);
                setState(1576);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(1575);
                        expressionList();
                    }
                }

                setState(1578);
                match(RPAREN);
            }
        }
        catch (RecognitionException re) {
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
            case 87:
                return expression_sempred((ExpressionContext)_localctx, predIndex);
        }
        return true;
    }
    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 8);
            case 1:
                return precpred(_ctx, 6);
            case 2:
                return precpred(_ctx, 5);
            case 3:
                return precpred(_ctx, 17);
            case 4:
                return precpred(_ctx, 16);
            case 5:
                return precpred(_ctx, 11);
            case 6:
                return precpred(_ctx, 7);
            case 7:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u062f\4\2\t\2\4"+
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
                    "k\4l\tl\4m\tm\4n\tn\3\2\3\2\5\2\u00df\n\2\3\2\3\2\5\2\u00e3\n\2\3\2\3"+
                    "\2\5\2\u00e7\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ff\n\3\3\4\5\4\u0102\n\4\3\4"+
                    "\7\4\u0105\n\4\f\4\16\4\u0108\13\4\3\4\7\4\u010b\n\4\f\4\16\4\u010e\13"+
                    "\4\3\4\3\4\3\5\7\5\u0113\n\5\f\5\16\5\u0116\13\5\3\5\3\5\3\5\5\5\u011b"+
                    "\n\5\3\6\3\6\5\6\u011f\n\6\3\6\3\6\3\6\5\6\u0124\n\6\3\6\5\6\u0127\n\6"+
                    "\3\7\7\7\u012a\n\7\f\7\16\7\u012d\13\7\3\7\3\7\3\7\3\7\5\7\u0133\n\7\3"+
                    "\7\5\7\u0136\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u013d\n\b\3\t\3\t\3\t\3\t\3\t"+
                    "\3\t\3\t\3\t\5\t\u0147\n\t\3\n\3\n\5\n\u014b\n\n\3\13\3\13\3\13\5\13\u0150"+
                    "\n\13\3\13\3\13\5\13\u0154\n\13\3\13\3\13\5\13\u0158\n\13\3\13\3\13\3"+
                    "\f\3\f\3\f\3\f\7\f\u0160\n\f\f\f\16\f\u0163\13\f\3\f\3\f\3\r\7\r\u0168"+
                    "\n\r\f\r\16\r\u016b\13\r\3\r\3\r\3\r\5\r\u0170\n\r\3\16\3\16\3\16\7\16"+
                    "\u0175\n\16\f\16\16\16\u0178\13\16\3\17\3\17\3\17\3\17\5\17\u017e\n\17"+
                    "\3\17\3\17\5\17\u0182\n\17\3\17\5\17\u0185\n\17\3\17\5\17\u0188\n\17\3"+
                    "\17\3\17\3\20\3\20\3\20\7\20\u018f\n\20\f\20\16\20\u0192\13\20\3\21\7"+
                    "\21\u0195\n\21\f\21\16\21\u0198\13\21\3\21\3\21\5\21\u019c\n\21\3\21\5"+
                    "\21\u019f\n\21\3\22\3\22\7\22\u01a3\n\22\f\22\16\22\u01a6\13\22\3\23\3"+
                    "\23\3\23\5\23\u01ab\n\23\3\23\3\23\5\23\u01af\n\23\3\23\3\23\3\24\3\24"+
                    "\7\24\u01b5\n\24\f\24\16\24\u01b8\13\24\3\24\3\24\3\25\3\25\7\25\u01be"+
                    "\n\25\f\25\16\25\u01c1\13\25\3\25\3\25\3\26\3\26\5\26\u01c7\n\26\3\26"+
                    "\3\26\7\26\u01cb\n\26\f\26\16\26\u01ce\13\26\3\26\5\26\u01d1\n\26\3\27"+
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01dc\n\27\3\30\3\30\3\30"+
                    "\3\30\3\30\7\30\u01e3\n\30\f\30\16\30\u01e6\13\30\3\30\3\30\5\30\u01ea"+
                    "\n\30\3\30\3\30\3\31\3\31\5\31\u01f0\n\31\3\32\3\32\5\32\u01f4\n\32\3"+
                    "\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0200\n\35\3\35"+
                    "\3\35\3\36\3\36\3\36\5\36\u0207\n\36\3\37\7\37\u020a\n\37\f\37\16\37\u020d"+
                    "\13\37\3\37\3\37\5\37\u0211\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u021a\n \3!\3"+
                    "!\3!\3!\7!\u0220\n!\f!\16!\u0223\13!\3!\5!\u0226\n!\3\"\3\"\3\"\7\"\u022b"+
                    "\n\"\f\"\16\"\u022e\13\"\3\"\3\"\3\"\3#\7#\u0234\n#\f#\16#\u0237\13#\3"+
                    "#\3#\3#\7#\u023c\n#\f#\16#\u023f\13#\3#\3#\5#\u0243\n#\3#\3#\3#\3#\7#"+
                    "\u0249\n#\f#\16#\u024c\13#\3#\3#\5#\u0250\n#\3#\3#\3$\3$\3$\3$\3$\3$\5"+
                    "$\u025a\n$\3%\3%\3%\3&\3&\3&\7&\u0262\n&\f&\16&\u0265\13&\3\'\3\'\3\'"+
                    "\5\'\u026a\n\'\3(\3(\3(\7(\u026f\n(\f(\16(\u0272\13(\3)\3)\5)\u0276\n"+
                    ")\3*\3*\3*\3*\7*\u027c\n*\f*\16*\u027f\13*\3*\5*\u0282\n*\5*\u0284\n*"+
                    "\3*\3*\3+\3+\5+\u028a\n+\3+\3+\3+\5+\u028f\n+\7+\u0291\n+\f+\16+\u0294"+
                    "\13+\3,\3,\3,\3,\5,\u029a\n,\5,\u029c\n,\3-\3-\3-\7-\u02a1\n-\f-\16-\u02a4"+
                    "\13-\3.\3.\5.\u02a8\n.\3.\3.\3/\3/\3/\7/\u02af\n/\f/\16/\u02b2\13/\3/"+
                    "\3/\5/\u02b6\n/\3/\5/\u02b9\n/\3\60\7\60\u02bc\n\60\f\60\16\60\u02bf\13"+
                    "\60\3\60\3\60\3\60\3\61\7\61\u02c5\n\61\f\61\16\61\u02c8\13\61\3\61\3"+
                    "\61\3\61\3\61\3\62\3\62\3\62\7\62\u02d1\n\62\f\62\16\62\u02d4\13\62\3"+
                    "\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02dd\n\63\3\64\3\64\3\65\3\65"+
                    "\3\66\3\66\3\66\3\66\3\66\5\66\u02e8\n\66\3\66\5\66\u02eb\n\66\3\67\3"+
                    "\67\3\67\7\67\u02f0\n\67\f\67\16\67\u02f3\13\67\38\38\38\38\39\39\39\5"+
                    "9\u02fc\n9\3:\3:\3:\3:\7:\u0302\n:\f:\16:\u0305\13:\5:\u0307\n:\3:\5:"+
                    "\u030a\n:\3:\3:\3;\3;\3;\3;\3;\3<\3<\7<\u0315\n<\f<\16<\u0318\13<\3<\3"+
                    "<\3=\7=\u031d\n=\f=\16=\u0320\13=\3=\3=\5=\u0324\n=\3>\3>\3>\5>\u0329"+
                    "\n>\3>\3>\5>\u032d\n>\3>\3>\5>\u0331\n>\3>\3>\5>\u0335\n>\3>\3>\5>\u0339"+
                    "\n>\5>\u033b\n>\3?\3?\5?\u033f\n?\3@\3@\3@\3@\5@\u0345\n@\3A\3A\3B\3B"+
                    "\3B\3C\5C\u034d\nC\3C\3C\5C\u0351\nC\3C\3C\5C\u0355\nC\3C\5C\u0358\nC"+
                    "\3C\5C\u035b\nC\3C\3C\5C\u035f\nC\3C\3C\5C\u0363\nC\3C\5C\u0366\nC\5C"+
                    "\u0368\nC\3D\3D\7D\u036c\nD\fD\16D\u036f\13D\5D\u0371\nD\3E\3E\5E\u0375"+
                    "\nE\3E\5E\u0378\nE\3E\3E\5E\u037c\nE\3E\3E\5E\u0380\nE\3E\3E\5E\u0384"+
                    "\nE\5E\u0386\nE\3F\7F\u0389\nF\fF\16F\u038c\13F\3F\3F\3F\3G\7G\u0392\n"+
                    "G\fG\16G\u0395\13G\3G\3G\5G\u0399\nG\3G\5G\u039c\nG\3H\3H\3H\3H\3H\5H"+
                    "\u03a3\nH\3H\5H\u03a6\nH\3H\3H\3H\3H\3H\7H\u03ad\nH\fH\16H\u03b0\13H\3"+
                    "H\3H\5H\u03b4\nH\3H\3H\3H\3H\3H\5H\u03bb\nH\3H\3H\3H\5H\u03c0\nH\3H\3"+
                    "H\3H\3H\3H\5H\u03c7\nH\3H\3H\3H\3H\7H\u03cd\nH\fH\16H\u03d0\13H\3H\7H"+
                    "\u03d3\nH\fH\16H\u03d6\13H\3H\3H\3H\3H\3H\3H\3H\5H\u03df\nH\3H\3H\3H\5"+
                    "H\u03e4\nH\3H\3H\3H\3H\5H\u03ea\nH\3H\5H\u03ed\nH\3H\3H\3H\5H\u03f2\n"+
                    "H\3H\3H\5H\u03f6\nH\3H\3H\3H\3H\3H\5H\u03fd\nH\3H\3H\3H\5H\u0402\nH\3"+
                    "H\3H\3H\3H\3H\5H\u0409\nH\3H\3H\3H\6H\u040e\nH\rH\16H\u040f\3H\5H\u0413"+
                    "\nH\3H\5H\u0416\nH\3H\3H\3H\3H\7H\u041c\nH\fH\16H\u041f\13H\3H\5H\u0422"+
                    "\nH\3H\3H\3H\3H\7H\u0428\nH\fH\16H\u042b\13H\3H\7H\u042e\nH\fH\16H\u0431"+
                    "\13H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u043b\nH\3H\5H\u043e\nH\3H\3H\3H\5H\u0443"+
                    "\nH\3H\3H\5H\u0447\nH\3H\5H\u044a\nH\3H\3H\5H\u044e\nH\3H\5H\u0451\nH"+
                    "\3H\3H\3H\5H\u0456\nH\3H\3H\3H\5H\u045b\nH\3I\3I\3I\7I\u0460\nI\fI\16"+
                    "I\u0463\13I\3I\3I\3I\3I\3I\3J\3J\3J\7J\u046d\nJ\fJ\16J\u0470\13J\3K\3"+
                    "K\3K\3L\3L\3L\5L\u0478\nL\3L\3L\3M\3M\5M\u047e\nM\3M\7M\u0481\nM\fM\16"+
                    "M\u0484\13M\3N\7N\u0487\nN\fN\16N\u048a\13N\3N\3N\3N\3N\3N\3O\6O\u0492"+
                    "\nO\rO\16O\u0493\3O\6O\u0497\nO\rO\16O\u0498\3P\3P\3P\5P\u049e\nP\3P\3"+
                    "P\3P\5P\u04a3\nP\3Q\3Q\5Q\u04a7\nQ\3Q\5Q\u04aa\nQ\3Q\5Q\u04ad\nQ\3Q\5"+
                    "Q\u04b0\nQ\3Q\5Q\u04b3\nQ\5Q\u04b5\nQ\3R\3R\5R\u04b9\nR\3S\7S\u04bc\n"+
                    "S\fS\16S\u04bf\13S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\5T\u04cd\nT\3U"+
                    "\3U\3U\3U\7U\u04d3\nU\fU\16U\u04d6\13U\3U\3U\3U\7U\u04db\nU\fU\16U\u04de"+
                    "\13U\5U\u04e0\nU\3V\3V\3V\5V\u04e5\nV\3V\3V\3V\3V\5V\u04eb\nV\3V\3V\3"+
                    "V\3V\5V\u04f1\nV\3V\5V\u04f4\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
                    "W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u050e\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3"+
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0525\nY\3Y\3Y\5Y\u0529\n"+
                    "Y\3Y\3Y\3Y\5Y\u052e\nY\3Y\3Y\5Y\u0532\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0549\nY\3Y\3Y\3Y\3Y\5Y\u054f\n"+
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u055e\nY\3Y\7Y\u0561\nY\f"+
                    "Y\16Y\u0564\13Y\3Z\3Z\3Z\3Z\3[\3[\3[\5[\u056d\n[\3[\3[\3[\3[\3[\7[\u0574"+
                    "\n[\f[\16[\u0577\13[\3[\5[\u057a\n[\3\\\3\\\5\\\u057e\n\\\3]\3]\3]\3]"+
                    "\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0590\n]\5]\u0592\n]\3^\3^\3^"+
                    "\5^\u0597\n^\3^\7^\u059a\n^\f^\16^\u059d\13^\3^\3^\5^\u05a1\n^\3_\3_\3"+
                    "_\3_\3_\3_\3_\5_\u05aa\n_\5_\u05ac\n_\3`\3`\5`\u05b0\n`\3`\3`\3`\5`\u05b5"+
                    "\n`\7`\u05b7\n`\f`\16`\u05ba\13`\3`\5`\u05bd\n`\3a\3a\5a\u05c1\na\3a\3"+
                    "a\3b\3b\3b\3b\7b\u05c9\nb\fb\16b\u05cc\13b\3b\3b\3b\3b\3b\3b\3b\7b\u05d5"+
                    "\nb\fb\16b\u05d8\13b\3b\3b\7b\u05dc\nb\fb\16b\u05df\13b\5b\u05e1\nb\3"+
                    "c\3c\5c\u05e5\nc\3d\3d\3d\3e\3e\3e\5e\u05ed\ne\3f\3f\3f\5f\u05f2\nf\3"+
                    "g\3g\3g\3g\3h\3h\3h\7h\u05fb\nh\fh\16h\u05fe\13h\3i\5i\u0601\ni\3i\3i"+
                    "\5i\u0605\ni\3i\3i\7i\u0609\ni\fi\16i\u060c\13i\3j\3j\3k\3k\3k\3k\7k\u0614"+
                    "\nk\fk\16k\u0617\13k\3k\3k\3l\3l\3l\3l\5l\u061f\nl\5l\u0621\nl\3m\3m\3"+
                    "m\3m\5m\u0627\nm\3n\3n\5n\u062b\nn\3n\3n\3n\2\3\u00b0o\2\4\6\b\n\f\16"+
                    "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
                    "fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
                    "\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
                    "\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
                    "\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
                    "\2\n\4\2\23\23**\3\2:=\3\2>?\5\2MMddgq\3\2Z]\3\2PQ\3\2Z[\n\2\5\5\7\7\n"+
                    "\n\20\20\26\26\35\35\37\37\'\'\2\u071f\2\u00dc\3\2\2\2\4\u00fe\3\2\2\2"+
                    "\6\u0101\3\2\2\2\b\u0114\3\2\2\2\n\u011c\3\2\2\2\f\u0135\3\2\2\2\16\u013c"+
                    "\3\2\2\2\20\u0146\3\2\2\2\22\u014a\3\2\2\2\24\u014c\3\2\2\2\26\u015b\3"+
                    "\2\2\2\30\u0169\3\2\2\2\32\u0171\3\2\2\2\34\u0179\3\2\2\2\36\u018b\3\2"+
                    "\2\2 \u0196\3\2\2\2\"\u01a0\3\2\2\2$\u01a7\3\2\2\2&\u01b2\3\2\2\2(\u01bb"+
                    "\3\2\2\2*\u01d0\3\2\2\2,\u01db\3\2\2\2.\u01dd\3\2\2\2\60\u01ef\3\2\2\2"+
                    "\62\u01f3\3\2\2\2\64\u01f5\3\2\2\2\66\u01f8\3\2\2\28\u01fb\3\2\2\2:\u0203"+
                    "\3\2\2\2<\u0210\3\2\2\2>\u0219\3\2\2\2@\u021b\3\2\2\2B\u0227\3\2\2\2D"+
                    "\u0235\3\2\2\2F\u0259\3\2\2\2H\u025b\3\2\2\2J\u025e\3\2\2\2L\u0266\3\2"+
                    "\2\2N\u026b\3\2\2\2P\u0275\3\2\2\2R\u0277\3\2\2\2T\u0287\3\2\2\2V\u029b"+
                    "\3\2\2\2X\u029d\3\2\2\2Z\u02a5\3\2\2\2\\\u02b8\3\2\2\2^\u02bd\3\2\2\2"+
                    "`\u02c6\3\2\2\2b\u02cd\3\2\2\2d\u02dc\3\2\2\2f\u02de\3\2\2\2h\u02e0\3"+
                    "\2\2\2j\u02e2\3\2\2\2l\u02ec\3\2\2\2n\u02f4\3\2\2\2p\u02fb\3\2\2\2r\u02fd"+
                    "\3\2\2\2t\u030d\3\2\2\2v\u0312\3\2\2\2x\u0323\3\2\2\2z\u033a\3\2\2\2|"+
                    "\u033e\3\2\2\2~\u0340\3\2\2\2\u0080\u0346\3\2\2\2\u0082\u0348\3\2\2\2"+
                    "\u0084\u0367\3\2\2\2\u0086\u0370\3\2\2\2\u0088\u0385\3\2\2\2\u008a\u038a"+
                    "\3\2\2\2\u008c\u039b\3\2\2\2\u008e\u045a\3\2\2\2\u0090\u045c\3\2\2\2\u0092"+
                    "\u0469\3\2\2\2\u0094\u0471\3\2\2\2\u0096\u0474\3\2\2\2\u0098\u047b\3\2"+
                    "\2\2\u009a\u0488\3\2\2\2\u009c\u0491\3\2\2\2\u009e\u04a2\3\2\2\2\u00a0"+
                    "\u04b4\3\2\2\2\u00a2\u04b8\3\2\2\2\u00a4\u04bd\3\2\2\2\u00a6\u04cc\3\2"+
                    "\2\2\u00a8\u04df\3\2\2\2\u00aa\u04f3\3\2\2\2\u00ac\u050d\3\2\2\2\u00ae"+
                    "\u050f\3\2\2\2\u00b0\u0531\3\2\2\2\u00b2\u0565\3\2\2\2\u00b4\u0579\3\2"+
                    "\2\2\u00b6\u057d\3\2\2\2\u00b8\u0591\3\2\2\2\u00ba\u0596\3\2\2\2\u00bc"+
                    "\u05ab\3\2\2\2\u00be\u05bc\3\2\2\2\u00c0\u05be\3\2\2\2\u00c2\u05c4\3\2"+
                    "\2\2\u00c4\u05e2\3\2\2\2\u00c6\u05e6\3\2\2\2\u00c8\u05ec\3\2\2\2\u00ca"+
                    "\u05f1\3\2\2\2\u00cc\u05f3\3\2\2\2\u00ce\u05f7\3\2\2\2\u00d0\u0600\3\2"+
                    "\2\2\u00d2\u060d\3\2\2\2\u00d4\u060f\3\2\2\2\u00d6\u0620\3\2\2\2\u00d8"+
                    "\u0626\3\2\2\2\u00da\u0628\3\2\2\2\u00dc\u00de\5\4\3\2\u00dd\u00df\78"+
                    "\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
                    "\u00e2\7f\2\2\u00e1\u00e3\78\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2"+
                    "\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\5\4\3\2\u00e5\u00e7\78\2\2\u00e6\u00e5"+
                    "\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\3\3\2\2\2\u00e8\u00ff\5\b\5\2\u00e9"+
                    "\u00ff\5\n\6\2\u00ea\u00ff\5\34\17\2\u00eb\u00ff\5 \21\2\u00ec\u00ff\5"+
                    "$\23\2\u00ed\u00ff\5,\27\2\u00ee\u00ff\5D#\2\u00ef\u00ff\5H%\2\u00f0\u00ff"+
                    "\5L\'\2\u00f1\u00ff\5d\63\2\u00f2\u00ff\5j\66\2\u00f3\u00ff\5n8\2\u00f4"+
                    "\u00ff\5t;\2\u00f5\u00ff\5\u0086D\2\u00f6\u00ff\5\u0088E\2\u00f7\u00ff"+
                    "\5\u0084C\2\u00f8\u00ff\5\u00b0Y\2\u00f9\u00ff\5\u00a6T\2\u00fa\u00ff"+
                    "\5\u00a8U\2\u00fb\u00ff\5\u00aaV\2\u00fc\u00ff\7\67\2\2\u00fd\u00ff\7"+
                    "\66\2\2\u00fe\u00e8\3\2\2\2\u00fe\u00e9\3\2\2\2\u00fe\u00ea\3\2\2\2\u00fe"+
                    "\u00eb\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00ed\3\2\2\2\u00fe\u00ee\3\2"+
                    "\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f0\3\2\2\2\u00fe\u00f1\3\2\2\2\u00fe"+
                    "\u00f2\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f5\3\2"+
                    "\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe"+
                    "\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2"+
                    "\2\2\u00fe\u00fd\3\2\2\2\u00ff\5\3\2\2\2\u0100\u0102\5\b\5\2\u0101\u0100"+
                    "\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106\3\2\2\2\u0103\u0105\5\n\6\2\u0104"+
                    "\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
                    "\2\2\u0107\u010c\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\5\f\7\2\u010a"+
                    "\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
                    "\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\2\2\3\u0110"+
                    "\7\3\2\2\2\u0111\u0113\5j\66\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2"+
                    "\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114"+
                    "\3\2\2\2\u0117\u0118\7\"\2\2\u0118\u011a\5b\62\2\u0119\u011b\7J\2\2\u011a"+
                    "\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\t\3\2\2\2\u011c\u011e\7\33\2"+
                    "\2\u011d\u011f\7(\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120"+
                    "\3\2\2\2\u0120\u0123\5b\62\2\u0121\u0122\7L\2\2\u0122\u0124\7^\2\2\u0123"+
                    "\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\7J"+
                    "\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\13\3\2\2\2\u0128\u012a"+
                    "\5\20\t\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2"+
                    "\u012b\u012c\3\2\2\2\u012c\u0132\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0133"+
                    "\5\24\13\2\u012f\u0133\5\34\17\2\u0130\u0133\5$\23\2\u0131\u0133\5t;\2"+
                    "\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131"+
                    "\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0136\7J\2\2\u0135\u012b\3\2\2\2\u0135"+
                    "\u0134\3\2\2\2\u0136\r\3\2\2\2\u0137\u013d\5\20\t\2\u0138\u013d\7 \2\2"+
                    "\u0139\u013d\7,\2\2\u013a\u013d\7\60\2\2\u013b\u013d\7\63\2\2\u013c\u0137"+
                    "\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
                    "\u013b\3\2\2\2\u013d\17\3\2\2\2\u013e\u0147\5j\66\2\u013f\u0147\7%\2\2"+
                    "\u0140\u0147\7$\2\2\u0141\u0147\7#\2\2\u0142\u0147\7(\2\2\u0143\u0147"+
                    "\7\3\2\2\u0144\u0147\7\24\2\2\u0145\u0147\7)\2\2\u0146\u013e\3\2\2\2\u0146"+
                    "\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2"+
                    "\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
                    "\21\3\2\2\2\u0148\u014b\7\24\2\2\u0149\u014b\5j\66\2\u014a\u0148\3\2\2"+
                    "\2\u014a\u0149\3\2\2\2\u014b\23\3\2\2\2\u014c\u014d\7\13\2\2\u014d\u014f"+
                    "\7y\2\2\u014e\u0150\5\26\f\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
                    "\u0153\3\2\2\2\u0151\u0152\7\23\2\2\u0152\u0154\5\u00d0i\2\u0153\u0151"+
                    "\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\7\32\2\2"+
                    "\u0156\u0158\5\u00ceh\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
                    "\u0159\3\2\2\2\u0159\u015a\5&\24\2\u015a\25\3\2\2\2\u015b\u015c\7O\2\2"+
                    "\u015c\u0161\5\30\r\2\u015d\u015e\7K\2\2\u015e\u0160\5\30\r\2\u015f\u015d"+
                    "\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
                    "\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7N\2\2\u0165\27\3\2\2\2"+
                    "\u0166\u0168\5j\66\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167"+
                    "\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
                    "\u016f\7y\2\2\u016d\u016e\7\23\2\2\u016e\u0170\5\32\16\2\u016f\u016d\3"+
                    "\2\2\2\u016f\u0170\3\2\2\2\u0170\31\3\2\2\2\u0171\u0176\5\u00d0i\2\u0172"+
                    "\u0173\7`\2\2\u0173\u0175\5\u00d0i\2\u0174\u0172\3\2\2\2\u0175\u0178\3"+
                    "\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\33\3\2\2\2\u0178"+
                    "\u0176\3\2\2\2\u0179\u017a\7\22\2\2\u017a\u017d\7y\2\2\u017b\u017c\7\32"+
                    "\2\2\u017c\u017e\5\u00ceh\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
                    "\u017f\3\2\2\2\u017f\u0181\7F\2\2\u0180\u0182\5\36\20\2\u0181\u0180\3"+
                    "\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0185\7K\2\2\u0184"+
                    "\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0188\5\""+
                    "\22\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
                    "\u018a\7G\2\2\u018a\35\3\2\2\2\u018b\u0190\5 \21\2\u018c\u018d\7K\2\2"+
                    "\u018d\u018f\5 \21\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e"+
                    "\3\2\2\2\u0190\u0191\3\2\2\2\u0191\37\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
                    "\u0195\5j\66\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
                    "\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
                    "\u019b\7y\2\2\u019a\u019c\5\u00dan\2\u019b\u019a\3\2\2\2\u019b\u019c\3"+
                    "\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\5&\24\2\u019e\u019d\3\2\2\2\u019e"+
                    "\u019f\3\2\2\2\u019f!\3\2\2\2\u01a0\u01a4\7J\2\2\u01a1\u01a3\5*\26\2\u01a2"+
                    "\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
                    "\2\2\u01a5#\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7\36\2\2\u01a8\u01aa"+
                    "\7y\2\2\u01a9\u01ab\5\26\f\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
                    "\u01ae\3\2\2\2\u01ac\u01ad\7\23\2\2\u01ad\u01af\5\u00ceh\2\u01ae\u01ac"+
                    "\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5(\25\2\u01b1"+
                    "%\3\2\2\2\u01b2\u01b6\7F\2\2\u01b3\u01b5\5*\26\2\u01b4\u01b3\3\2\2\2\u01b5"+
                    "\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2"+
                    "\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7G\2\2\u01ba\'\3\2\2\2\u01bb\u01bf"+
                    "\7F\2\2\u01bc\u01be\5<\37\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
                    "\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2"+
                    "\2\2\u01c2\u01c3\7G\2\2\u01c3)\3\2\2\2\u01c4\u01d1\7J\2\2\u01c5\u01c7"+
                    "\7(\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
                    "\u01d1\5\u0084C\2\u01c9\u01cb\5\16\b\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce"+
                    "\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce"+
                    "\u01cc\3\2\2\2\u01cf\u01d1\5,\27\2\u01d0\u01c4\3\2\2\2\u01d0\u01c6\3\2"+
                    "\2\2\u01d0\u01cc\3\2\2\2\u01d1+\3\2\2\2\u01d2\u01dc\5.\30\2\u01d3\u01dc"+
                    "\5\64\33\2\u01d4\u01dc\5:\36\2\u01d5\u01dc\58\35\2\u01d6\u01dc\5\66\34"+
                    "\2\u01d7\u01dc\5$\23\2\u01d8\u01dc\5t;\2\u01d9\u01dc\5\24\13\2\u01da\u01dc"+
                    "\5\34\17\2\u01db\u01d2\3\2\2\2\u01db\u01d3\3\2\2\2\u01db\u01d4\3\2\2\2"+
                    "\u01db\u01d5\3\2\2\2\u01db\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01d8"+
                    "\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc-\3\2\2\2\u01dd"+
                    "\u01de\5\62\32\2\u01de\u01df\7y\2\2\u01df\u01e4\5Z.\2\u01e0\u01e1\7H\2"+
                    "\2\u01e1\u01e3\7I\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2"+
                    "\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
                    "\u01e8\7/\2\2\u01e8\u01ea\5X-\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2"+
                    "\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5\60\31\2\u01ec/\3\2\2\2\u01ed\u01f0"+
                    "\5\u0084C\2\u01ee\u01f0\7J\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2"+
                    "\u01f0\61\3\2\2\2\u01f1\u01f4\5\u00d0i\2\u01f2\u01f4\7\62\2\2\u01f3\u01f1"+
                    "\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\63\3\2\2\2\u01f5\u01f6\5\26\f\2\u01f6"+
                    "\u01f7\5.\30\2\u01f7\65\3\2\2\2\u01f8\u01f9\5\26\f\2\u01f9\u01fa\58\35"+
                    "\2\u01fa\67\3\2\2\2\u01fb\u01fc\7y\2\2\u01fc\u01ff\5Z.\2\u01fd\u01fe\7"+
                    "/\2\2\u01fe\u0200\5X-\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
                    "\u0201\3\2\2\2\u0201\u0202\5\u0084C\2\u02029\3\2\2\2\u0203\u0204\5\u00d0"+
                    "i\2\u0204\u0206\5J&\2\u0205\u0207\7J\2\2\u0206\u0205\3\2\2\2\u0206\u0207"+
                    "\3\2\2\2\u0207;\3\2\2\2\u0208\u020a\5\16\b\2\u0209\u0208\3\2\2\2\u020a"+
                    "\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2"+
                    "\2\2\u020d\u020b\3\2\2\2\u020e\u0211\5> \2\u020f\u0211\7J\2\2\u0210\u020b"+
                    "\3\2\2\2\u0210\u020f\3\2\2\2\u0211=\3\2\2\2\u0212\u021a\5@!\2\u0213\u021a"+
                    "\5D#\2\u0214\u021a\5H%\2\u0215\u021a\5$\23\2\u0216\u021a\5t;\2\u0217\u021a"+
                    "\5\24\13\2\u0218\u021a\5\34\17\2\u0219\u0212\3\2\2\2\u0219\u0213\3\2\2"+
                    "\2\u0219\u0214\3\2\2\2\u0219\u0215\3\2\2\2\u0219\u0216\3\2\2\2\u0219\u0217"+
                    "\3\2\2\2\u0219\u0218\3\2\2\2\u021a?\3\2\2\2\u021b\u021c\5\u00d0i\2\u021c"+
                    "\u0221\5B\"\2\u021d\u021e\7K\2\2\u021e\u0220\5B\"\2\u021f\u021d\3\2\2"+
                    "\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225"+
                    "\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0226\7J\2\2\u0225\u0224\3\2\2\2\u0225"+
                    "\u0226\3\2\2\2\u0226A\3\2\2\2\u0227\u022c\7y\2\2\u0228\u0229\7H\2\2\u0229"+
                    "\u022b\7I\2\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2"+
                    "\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
                    "\u0230\7M\2\2\u0230\u0231\5P)\2\u0231C\3\2\2\2\u0232\u0234\5F$\2\u0233"+
                    "\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
                    "\2\2\u0236\u0242\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0243\5\62\32\2\u0239"+
                    "\u023d\5\26\f\2\u023a\u023c\5j\66\2\u023b\u023a\3\2\2\2\u023c\u023f\3"+
                    "\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
                    "\u023d\3\2\2\2\u0240\u0241\5\62\32\2\u0241\u0243\3\2\2\2\u0242\u0238\3"+
                    "\2\2\2\u0242\u0239\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7y\2\2\u0245"+
                    "\u024a\5Z.\2\u0246\u0247\7H\2\2\u0247\u0249\7I\2\2\u0248\u0246\3\2\2\2"+
                    "\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024f"+
                    "\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e\7/\2\2\u024e\u0250\5X-\2\u024f"+
                    "\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\60"+
                    "\31\2\u0252E\3\2\2\2\u0253\u025a\5j\66\2\u0254\u025a\7%\2\2\u0255\u025a"+
                    "\7\3\2\2\u0256\u025a\7\16\2\2\u0257\u025a\7(\2\2\u0258\u025a\7)\2\2\u0259"+
                    "\u0253\3\2\2\2\u0259\u0254\3\2\2\2\u0259\u0255\3\2\2\2\u0259\u0256\3\2"+
                    "\2\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025aG\3\2\2\2\u025b\u025c"+
                    "\5\26\f\2\u025c\u025d\5D#\2\u025dI\3\2\2\2\u025e\u0263\5L\'\2\u025f\u0260"+
                    "\7K\2\2\u0260\u0262\5L\'\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263"+
                    "\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264K\3\2\2\2\u0265\u0263\3\2\2\2"+
                    "\u0266\u0269\5N(\2\u0267\u0268\7M\2\2\u0268\u026a\5P)\2\u0269\u0267\3"+
                    "\2\2\2\u0269\u026a\3\2\2\2\u026aM\3\2\2\2\u026b\u0270\7y\2\2\u026c\u026d"+
                    "\7H\2\2\u026d\u026f\7I\2\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
                    "\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271O\3\2\2\2\u0272\u0270\3\2\2\2"+
                    "\u0273\u0276\5R*\2\u0274\u0276\5\u00b0Y\2\u0275\u0273\3\2\2\2\u0275\u0274"+
                    "\3\2\2\2\u0276Q\3\2\2\2\u0277\u0283\7F\2\2\u0278\u027d\5P)\2\u0279\u027a"+
                    "\7K\2\2\u027a\u027c\5P)\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
                    "\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2"+
                    "\2\2\u0280\u0282\7K\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
                    "\u0284\3\2\2\2\u0283\u0278\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2"+
                    "\2\2\u0285\u0286\7G\2\2\u0286S\3\2\2\2\u0287\u0289\7y\2\2\u0288\u028a"+
                    "\5\u00d4k\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0292\3\2\2"+
                    "\2\u028b\u028c\7L\2\2\u028c\u028e\7y\2\2\u028d\u028f\5\u00d4k\2\u028e"+
                    "\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028b\3\2"+
                    "\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
                    "U\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u029c\5\u00d0i\2\u0296\u0299\7R\2"+
                    "\2\u0297\u0298\t\2\2\2\u0298\u029a\5\u00d0i\2\u0299\u0297\3\2\2\2\u0299"+
                    "\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0295\3\2\2\2\u029b\u0296\3\2"+
                    "\2\2\u029cW\3\2\2\2\u029d\u02a2\5b\62\2\u029e\u029f\7K\2\2\u029f\u02a1"+
                    "\5b\62\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
                    "\u02a3\3\2\2\2\u02a3Y\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a7\7D\2\2\u02a6"+
                    "\u02a8\5\\/\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2"+
                    "\2\2\u02a9\u02aa\7E\2\2\u02aa[\3\2\2\2\u02ab\u02b0\5^\60\2\u02ac\u02ad"+
                    "\7K\2\2\u02ad\u02af\5^\60\2\u02ae\u02ac\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0"+
                    "\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b5\3\2\2\2\u02b2\u02b0\3\2"+
                    "\2\2\u02b3\u02b4\7K\2\2\u02b4\u02b6\5`\61\2\u02b5\u02b3\3\2\2\2\u02b5"+
                    "\u02b6\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b9\5`\61\2\u02b8\u02ab\3\2"+
                    "\2\2\u02b8\u02b7\3\2\2\2\u02b9]\3\2\2\2\u02ba\u02bc\5\22\n\2\u02bb\u02ba"+
                    "\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
                    "\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\5\u00d0i\2\u02c1\u02c2"+
                    "\5N(\2\u02c2_\3\2\2\2\u02c3\u02c5\5\22\n\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8"+
                    "\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
                    "\u02c6\3\2\2\2\u02c9\u02ca\5\u00d0i\2\u02ca\u02cb\7u\2\2\u02cb\u02cc\5"+
                    "N(\2\u02cca\3\2\2\2\u02cd\u02d2\7y\2\2\u02ce\u02cf\7L\2\2\u02cf\u02d1"+
                    "\7y\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
                    "\u02d3\3\2\2\2\u02d3c\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02dd\5f\64\2"+
                    "\u02d6\u02dd\5h\65\2\u02d7\u02dd\7A\2\2\u02d8\u02dd\7B\2\2\u02d9\u02dd"+
                    "\7@\2\2\u02da\u02dd\7C\2\2\u02db\u02dd\79\2\2\u02dc\u02d5\3\2\2\2\u02dc"+
                    "\u02d6\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dc\u02d9\3\2"+
                    "\2\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dde\3\2\2\2\u02de\u02df"+
                    "\t\3\2\2\u02dfg\3\2\2\2\u02e0\u02e1\t\4\2\2\u02e1i\3\2\2\2\u02e2\u02e3"+
                    "\7t\2\2\u02e3\u02ea\5b\62\2\u02e4\u02e7\7D\2\2\u02e5\u02e8\5l\67\2\u02e6"+
                    "\u02e8\5p9\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2"+
                    "\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\7E\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02eb"+
                    "\3\2\2\2\u02ebk\3\2\2\2\u02ec\u02f1\5n8\2\u02ed\u02ee\7K\2\2\u02ee\u02f0"+
                    "\5n8\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
                    "\u02f2\3\2\2\2\u02f2m\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7y\2\2\u02f5"+
                    "\u02f6\7M\2\2\u02f6\u02f7\5p9\2\u02f7o\3\2\2\2\u02f8\u02fc\5\u00b0Y\2"+
                    "\u02f9\u02fc\5j\66\2\u02fa\u02fc\5r:\2\u02fb\u02f8\3\2\2\2\u02fb\u02f9"+
                    "\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fcq\3\2\2\2\u02fd\u0306\7F\2\2\u02fe\u0303"+
                    "\5p9\2\u02ff\u0300\7K\2\2\u0300\u0302\5p9\2\u0301\u02ff\3\2\2\2\u0302"+
                    "\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2"+
                    "\2\2\u0305\u0303\3\2\2\2\u0306\u02fe\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
                    "\u0309\3\2\2\2\u0308\u030a\7K\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2"+
                    "\2\2\u030a\u030b\3\2\2\2\u030b\u030c\7G\2\2\u030cs\3\2\2\2\u030d\u030e"+
                    "\7t\2\2\u030e\u030f\7\36\2\2\u030f\u0310\7y\2\2\u0310\u0311\5v<\2\u0311"+
                    "u\3\2\2\2\u0312\u0316\7F\2\2\u0313\u0315\5x=\2\u0314\u0313\3\2\2\2\u0315"+
                    "\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2"+
                    "\2\2\u0318\u0316\3\2\2\2\u0319\u031a\7G\2\2\u031aw\3\2\2\2\u031b\u031d"+
                    "\5\16\b\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2"+
                    "\u031e\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0324"+
                    "\5z>\2\u0322\u0324\7J\2\2\u0323\u031e\3\2\2\2\u0323\u0322\3\2\2\2\u0324"+
                    "y\3\2\2\2\u0325\u0326\5\u00d0i\2\u0326\u0328\5|?\2\u0327\u0329\7J\2\2"+
                    "\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u033b\3\2\2\2\u032a\u032c"+
                    "\5\24\13\2\u032b\u032d\7J\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2"+
                    "\u032d\u033b\3\2\2\2\u032e\u0330\5$\23\2\u032f\u0331\7J\2\2\u0330\u032f"+
                    "\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u033b\3\2\2\2\u0332\u0334\5\34\17\2"+
                    "\u0333\u0335\7J\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u033b"+
                    "\3\2\2\2\u0336\u0338\5t;\2\u0337\u0339\7J\2\2\u0338\u0337\3\2\2\2\u0338"+
                    "\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0325\3\2\2\2\u033a\u032a\3\2"+
                    "\2\2\u033a\u032e\3\2\2\2\u033a\u0332\3\2\2\2\u033a\u0336\3\2\2\2\u033b"+
                    "{\3\2\2\2\u033c\u033f\5~@\2\u033d\u033f\5\u0080A\2\u033e\u033c\3\2\2\2"+
                    "\u033e\u033d\3\2\2\2\u033f}\3\2\2\2\u0340\u0341\7y\2\2\u0341\u0342\7D"+
                    "\2\2\u0342\u0344\7E\2\2\u0343\u0345\5\u0082B\2\u0344\u0343\3\2\2\2\u0344"+
                    "\u0345\3\2\2\2\u0345\177\3\2\2\2\u0346\u0347\5J&\2\u0347\u0081\3\2\2\2"+
                    "\u0348\u0349\7\16\2\2\u0349\u034a\5p9\2\u034a\u0083\3\2\2\2\u034b\u034d"+
                    "\78\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
                    "\u0350\7F\2\2\u034f\u0351\78\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2"+
                    "\2\u0351\u0352\3\2\2\2\u0352\u0354\5\u0086D\2\u0353\u0355\78\2\2\u0354"+
                    "\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0358\7G"+
                    "\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0368\3\2\2\2\u0359"+
                    "\u035b\78\2\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2"+
                    "\2\2\u035c\u035e\7F\2\2\u035d\u035f\78\2\2\u035e\u035d\3\2\2\2\u035e\u035f"+
                    "\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\7\67\2\2\u0361\u0363\78\2\2\u0362"+
                    "\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366\7G"+
                    "\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367"+
                    "\u034c\3\2\2\2\u0367\u035a\3\2\2\2\u0368\u0085\3\2\2\2\u0369\u0371\3\2"+
                    "\2\2\u036a\u036c\5\u0088E\2\u036b\u036a\3\2\2\2\u036c\u036f\3\2\2\2\u036d"+
                    "\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2"+
                    "\2\2\u0370\u0369\3\2\2\2\u0370\u036d\3\2\2\2\u0371\u0087\3\2\2\2\u0372"+
                    "\u0374\5\u008aF\2\u0373\u0375\7J\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3"+
                    "\2\2\2\u0375\u0377\3\2\2\2\u0376\u0378\78\2\2\u0377\u0376\3\2\2\2\u0377"+
                    "\u0378\3\2\2\2\u0378\u0386\3\2\2\2\u0379\u037b\5\u008eH\2\u037a\u037c"+
                    "\78\2\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0386\3\2\2\2\u037d"+
                    "\u037f\5\u008cG\2\u037e\u0380\78\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3"+
                    "\2\2\2\u0380\u0386\3\2\2\2\u0381\u0383\7\67\2\2\u0382\u0384\78\2\2\u0383"+
                    "\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0372\3\2"+
                    "\2\2\u0385\u0379\3\2\2\2\u0385\u037d\3\2\2\2\u0385\u0381\3\2\2\2\u0386"+
                    "\u0089\3\2\2\2\u0387\u0389\5\22\n\2\u0388\u0387\3\2\2\2\u0389\u038c\3"+
                    "\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c"+
                    "\u038a\3\2\2\2\u038d\u038e\5\u00d0i\2\u038e\u038f\5J&\2\u038f\u008b\3"+
                    "\2\2\2\u0390\u0392\5\20\t\2\u0391\u0390\3\2\2\2\u0392\u0395\3\2\2\2\u0393"+
                    "\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0398\3\2\2\2\u0395\u0393\3\2"+
                    "\2\2\u0396\u0399\5\24\13\2\u0397\u0399\5$\23\2\u0398\u0396\3\2\2\2\u0398"+
                    "\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u039c\7J\2\2\u039b\u0393\3\2"+
                    "\2\2\u039b\u039a\3\2\2\2\u039c\u008d\3\2\2\2\u039d\u045b\5\u0084C\2\u039e"+
                    "\u039f\7\4\2\2\u039f\u03a2\7\65\2\2\u03a0\u03a1\7S\2\2\u03a1\u03a3\7\65"+
                    "\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4"+
                    "\u03a6\7J\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u045b\3\2"+
                    "\2\2\u03a7\u03a8\7\27\2\2\u03a8\u03a9\7D\2\2\u03a9\u03ae\7\65\2\2\u03aa"+
                    "\u03ab\7K\2\2\u03ab\u03ad\7\65\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2"+
                    "\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0"+
                    "\u03ae\3\2\2\2\u03b1\u03b3\7E\2\2\u03b2\u03b4\5\u008eH\2\u03b3\u03b2\3"+
                    "\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u045b\3\2\2\2\u03b5\u03b6\7\27\2\2\u03b6"+
                    "\u03b7\7D\2\2\u03b7\u03b8\7\67\2\2\u03b8\u03ba\7E\2\2\u03b9\u03bb\5\u008e"+
                    "H\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u045b\3\2\2\2\u03bc"+
                    "\u03bd\7\64\2\2\u03bd\u03bf\7\65\2\2\u03be\u03c0\5\u008eH\2\u03bf\u03be"+
                    "\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u045b\3\2\2\2\u03c1\u03c2\7\17\2\2"+
                    "\u03c2\u03c3\5\u008eH\2\u03c3\u03c4\7\64\2\2\u03c4\u03c6\7\65\2\2\u03c5"+
                    "\u03c7\7J\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u045b\3\2"+
                    "\2\2\u03c8\u03c9\7+\2\2\u03c9\u03ca\7\65\2\2\u03ca\u03ce\7F\2\2\u03cb"+
                    "\u03cd\5\u009cO\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc"+
                    "\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d4\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
                    "\u03d3\5\u009eP\2\u03d2\u03d1\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2"+
                    "\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7"+
                    "\u045b\7G\2\2\u03d8\u03d9\7,\2\2\u03d9\u03da\7\65\2\2\u03da\u045b\5\u0084"+
                    "C\2\u03db\u03dc\7&\2\2\u03dc\u03de\7\65\2\2\u03dd\u03df\7J\2\2\u03de\u03dd"+
                    "\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u045b\3\2\2\2\u03e0\u03e1\7.\2\2\u03e1"+
                    "\u03e3\7\65\2\2\u03e2\u03e4\7J\2\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2"+
                    "\2\2\u03e4\u045b\3\2\2\2\u03e5\u03e6\7\4\2\2\u03e6\u03e9\5\u00b0Y\2\u03e7"+
                    "\u03e8\7S\2\2\u03e8\u03ea\5\u00b0Y\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3"+
                    "\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\7J\2\2\u03ec\u03eb\3\2\2\2\u03ec"+
                    "\u03ed\3\2\2\2\u03ed\u045b\3\2\2\2\u03ee\u03ef\7\30\2\2\u03ef\u03f1\5"+
                    "\u00a6T\2\u03f0\u03f2\5\u008eH\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2"+
                    "\2\u03f2\u03f5\3\2\2\2\u03f3\u03f4\7\21\2\2\u03f4\u03f6\5\u008eH\2\u03f5"+
                    "\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u045b\3\2\2\2\u03f7\u03f8\7\27"+
                    "\2\2\u03f8\u03f9\7D\2\2\u03f9\u03fa\5\u00a0Q\2\u03fa\u03fc\7E\2\2\u03fb"+
                    "\u03fd\5\u008eH\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u045b"+
                    "\3\2\2\2\u03fe\u03ff\7\64\2\2\u03ff\u0401\5\u00a6T\2\u0400\u0402\5\u008e"+
                    "H\2\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u045b\3\2\2\2\u0403"+
                    "\u0404\7\17\2\2\u0404\u0405\5\u008eH\2\u0405\u0406\7\64\2\2\u0406\u0408"+
                    "\5\u00a6T\2\u0407\u0409\7J\2\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2"+
                    "\u0409\u045b\3\2\2\2\u040a\u040b\7\61\2\2\u040b\u0415\5\u0084C\2\u040c"+
                    "\u040e\5\u0090I\2\u040d\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u040d"+
                    "\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u0413\5\u0094K"+
                    "\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0416"+
                    "\5\u0094K\2\u0415\u040d\3\2\2\2\u0415\u0414\3\2\2\2\u0416\u045b\3\2\2"+
                    "\2\u0417\u0418\7\61\2\2\u0418\u0419\5\u0096L\2\u0419\u041d\5\u0084C\2"+
                    "\u041a\u041c\5\u0090I\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d"+
                    "\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2"+
                    "\2\2\u0420\u0422\5\u0094K\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
                    "\u045b\3\2\2\2\u0423\u0424\7+\2\2\u0424\u0425\5\u00a6T\2\u0425\u0429\7"+
                    "F\2\2\u0426\u0428\5\u009cO\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429"+
                    "\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042f\3\2\2\2\u042b\u0429\3\2"+
                    "\2\2\u042c\u042e\5\u009eP\2\u042d\u042c\3\2\2\2\u042e\u0431\3\2\2\2\u042f"+
                    "\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431\u042f\3\2"+
                    "\2\2\u0432\u0433\7G\2\2\u0433\u045b\3\2\2\2\u0434\u0435\7,\2\2\u0435\u0436"+
                    "\5\u00a6T\2\u0436\u0437\5\u0084C\2\u0437\u045b\3\2\2\2\u0438\u043a\7&"+
                    "\2\2\u0439\u043b\5\u00b0Y\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
                    "\u043d\3\2\2\2\u043c\u043e\7J\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2"+
                    "\2\2\u043e\u045b\3\2\2\2\u043f\u0440\7.\2\2\u0440\u0442\5\u00b0Y\2\u0441"+
                    "\u0443\7J\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u045b\3\2"+
                    "\2\2\u0444\u0446\7\6\2\2\u0445\u0447\7y\2\2\u0446\u0445\3\2\2\2\u0446"+
                    "\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u044a\7J\2\2\u0449\u0448\3\2"+
                    "\2\2\u0449\u044a\3\2\2\2\u044a\u045b\3\2\2\2\u044b\u044d\7\r\2\2\u044c"+
                    "\u044e\7y\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2"+
                    "\2\2\u044f\u0451\7J\2\2\u0450\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
                    "\u045b\3\2\2\2\u0452\u045b\7J\2\2\u0453\u0455\5\u00b0Y\2\u0454\u0456\7"+
                    "J\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u045b\3\2\2\2\u0457"+
                    "\u0458\7y\2\2\u0458\u0459\7S\2\2\u0459\u045b\5\u008eH\2\u045a\u039d\3"+
                    "\2\2\2\u045a\u039e\3\2\2\2\u045a\u03a7\3\2\2\2\u045a\u03b5\3\2\2\2\u045a"+
                    "\u03bc\3\2\2\2\u045a\u03c1\3\2\2\2\u045a\u03c8\3\2\2\2\u045a\u03d8\3\2"+
                    "\2\2\u045a\u03db\3\2\2\2\u045a\u03e0\3\2\2\2\u045a\u03e5\3\2\2\2\u045a"+
                    "\u03ee\3\2\2\2\u045a\u03f7\3\2\2\2\u045a\u03fe\3\2\2\2\u045a\u0403\3\2"+
                    "\2\2\u045a\u040a\3\2\2\2\u045a\u0417\3\2\2\2\u045a\u0423\3\2\2\2\u045a"+
                    "\u0434\3\2\2\2\u045a\u0438\3\2\2\2\u045a\u043f\3\2\2\2\u045a\u0444\3\2"+
                    "\2\2\u045a\u044b\3\2\2\2\u045a\u0452\3\2\2\2\u045a\u0453\3\2\2\2\u045a"+
                    "\u0457\3\2\2\2\u045b\u008f\3\2\2\2\u045c\u045d\7\t\2\2\u045d\u0461\7D"+
                    "\2\2\u045e\u0460\5\22\n\2\u045f\u045e\3\2\2\2\u0460\u0463\3\2\2\2\u0461"+
                    "\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2"+
                    "\2\2\u0464\u0465\5\u0092J\2\u0465\u0466\7y\2\2\u0466\u0467\7E\2\2\u0467"+
                    "\u0468\5\u0084C\2\u0468\u0091\3\2\2\2\u0469\u046e\5b\62\2\u046a\u046b"+
                    "\7a\2\2\u046b\u046d\5b\62\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2\2\u046e"+
                    "\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0093\3\2\2\2\u0470\u046e\3\2"+
                    "\2\2\u0471\u0472\7\25\2\2\u0472\u0473\5\u0084C\2\u0473\u0095\3\2\2\2\u0474"+
                    "\u0475\7D\2\2\u0475\u0477\5\u0098M\2\u0476\u0478\7J\2\2\u0477\u0476\3"+
                    "\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\7E\2\2\u047a"+
                    "\u0097\3\2\2\2\u047b\u0482\5\u009aN\2\u047c\u047e\7J\2\2\u047d\u047c\3"+
                    "\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\5\u009aN\2"+
                    "\u0480\u047d\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0482\u0483"+
                    "\3\2\2\2\u0483\u0099\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0487\5\22\n\2"+
                    "\u0486\u0485\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489"+
                    "\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048c\5T+\2\u048c"+
                    "\u048d\5N(\2\u048d\u048e\7M\2\2\u048e\u048f\5\u00b0Y\2\u048f\u009b\3\2"+
                    "\2\2\u0490\u0492\5\u009eP\2\u0491\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
                    "\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0497\5\u0088"+
                    "E\2\u0496\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498"+
                    "\u0499\3\2\2\2\u0499\u009d\3\2\2\2\u049a\u049d\7\b\2\2\u049b\u049e\5\u00b0"+
                    "Y\2\u049c\u049e\7y\2\2\u049d\u049b\3\2\2\2\u049d\u049c\3\2\2\2\u049e\u049f"+
                    "\3\2\2\2\u049f\u04a3\7S\2\2\u04a0\u04a1\7\16\2\2\u04a1\u04a3\7S\2\2\u04a2"+
                    "\u049a\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3\u009f\3\2\2\2\u04a4\u04b5\5\u00a4"+
                    "S\2\u04a5\u04a7\5\u00a2R\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7"+
                    "\u04a9\3\2\2\2\u04a8\u04aa\7J\2\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2"+
                    "\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad\5\u00b0Y\2\u04ac\u04ab\3\2\2\2\u04ac"+
                    "\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04b0\7J\2\2\u04af\u04ae\3\2"+
                    "\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04b3\5\u00a8U\2\u04b2"+
                    "\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04a4\3\2"+
                    "\2\2\u04b4\u04a6\3\2\2\2\u04b5\u00a1\3\2\2\2\u04b6\u04b9\5\u008aF\2\u04b7"+
                    "\u04b9\5\u00a8U\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u00a3"+
                    "\3\2\2\2\u04ba\u04bc\5\22\n\2\u04bb\u04ba\3\2\2\2\u04bc\u04bf\3\2\2\2"+
                    "\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04bd"+
                    "\3\2\2\2\u04c0\u04c1\5\u00d0i\2\u04c1\u04c2\5N(\2\u04c2\u04c3\7S\2\2\u04c3"+
                    "\u04c4\5\u00b0Y\2\u04c4\u00a5\3\2\2\2\u04c5\u04c6\7D\2\2\u04c6\u04c7\7"+
                    "\65\2\2\u04c7\u04cd\7E\2\2\u04c8\u04c9\7D\2\2\u04c9\u04ca\5\u00b0Y\2\u04ca"+
                    "\u04cb\7E\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04c5\3\2\2\2\u04cc\u04c8\3\2"+
                    "\2\2\u04cd\u00a7\3\2\2\2\u04ce\u04e0\7\67\2\2\u04cf\u04d4\7\65\2\2\u04d0"+
                    "\u04d1\7K\2\2\u04d1\u04d3\7\65\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d6\3\2"+
                    "\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04e0\3\2\2\2\u04d6"+
                    "\u04d4\3\2\2\2\u04d7\u04dc\5\u00b0Y\2\u04d8\u04d9\7K\2\2\u04d9\u04db\5"+
                    "\u00b0Y\2\u04da\u04d8\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2\2\2"+
                    "\u04dc\u04dd\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04df\u04ce"+
                    "\3\2\2\2\u04df\u04cf\3\2\2\2\u04df\u04d7\3\2\2\2\u04e0\u00a9\3\2\2\2\u04e1"+
                    "\u04e2\7y\2\2\u04e2\u04e4\7D\2\2\u04e3\u04e5\5\u00a8U\2\u04e4\u04e3\3"+
                    "\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04f4\7E\2\2\u04e7"+
                    "\u04e8\7-\2\2\u04e8\u04ea\7D\2\2\u04e9\u04eb\5\u00a8U\2\u04ea\u04e9\3"+
                    "\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04f4\7E\2\2\u04ed"+
                    "\u04ee\7*\2\2\u04ee\u04f0\7D\2\2\u04ef\u04f1\5\u00a8U\2\u04f0\u04ef\3"+
                    "\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\7E\2\2\u04f3"+
                    "\u04e1\3\2\2\2\u04f3\u04e7\3\2\2\2\u04f3\u04ed\3\2\2\2\u04f4\u00ab\3\2"+
                    "\2\2\u04f5\u050e\7^\2\2\u04f6\u050e\7_\2\2\u04f7\u050e\7c\2\2\u04f8\u050e"+
                    "\7\\\2\2\u04f9\u050e\7]\2\2\u04fa\u04fb\7O\2\2\u04fb\u050e\7O\2\2\u04fc"+
                    "\u04fd\7N\2\2\u04fd\u04fe\7N\2\2\u04fe\u050e\7N\2\2\u04ff\u0500\7N\2\2"+
                    "\u0500\u050e\7N\2\2\u0501\u050e\7U\2\2\u0502\u050e\7V\2\2\u0503\u050e"+
                    "\7N\2\2\u0504\u050e\7O\2\2\u0505\u050e\7T\2\2\u0506\u050e\7W\2\2\u0507"+
                    "\u050e\7`\2\2\u0508\u050e\7b\2\2\u0509\u050e\7a\2\2\u050a\u050e\7X\2\2"+
                    "\u050b\u050e\7Y\2\2\u050c\u050e\7e\2\2\u050d\u04f5\3\2\2\2\u050d\u04f6"+
                    "\3\2\2\2\u050d\u04f7\3\2\2\2\u050d\u04f8\3\2\2\2\u050d\u04f9\3\2\2\2\u050d"+
                    "\u04fa\3\2\2\2\u050d\u04fc\3\2\2\2\u050d\u04ff\3\2\2\2\u050d\u0501\3\2"+
                    "\2\2\u050d\u0502\3\2\2\2\u050d\u0503\3\2\2\2\u050d\u0504\3\2\2\2\u050d"+
                    "\u0505\3\2\2\2\u050d\u0506\3\2\2\2\u050d\u0507\3\2\2\2\u050d\u0508\3\2"+
                    "\2\2\u050d\u0509\3\2\2\2\u050d\u050a\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
                    "\u050c\3\2\2\2\u050e\u00ad\3\2\2\2\u050f\u0510\t\5\2\2\u0510\u00af\3\2"+
                    "\2\2\u0511\u0512\bY\1\2\u0512\u0532\5\u00b8]\2\u0513\u0532\5\u00aaV\2"+
                    "\u0514\u0532\7\65\2\2\u0515\u0516\7!\2\2\u0516\u0532\5\u00bc_\2\u0517"+
                    "\u0518\7D\2\2\u0518\u0519\5\u00d0i\2\u0519\u051a\7E\2\2\u051a\u051b\5"+
                    "\u00b0Y\16\u051b\u0532\3\2\2\2\u051c\u051d\t\6\2\2\u051d\u0532\5\u00b0"+
                    "Y\f\u051e\u051f\t\7\2\2\u051f\u0532\5\u00b0Y\13\u0520\u0532\5\u00b2Z\2"+
                    "\u0521\u0522\5\u00d0i\2\u0522\u0528\7s\2\2\u0523\u0525\5\u00d4k\2\u0524"+
                    "\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0529\7y"+
                    "\2\2\u0527\u0529\7!\2\2\u0528\u0524\3\2\2\2\u0528\u0527\3\2\2\2\u0529"+
                    "\u0532\3\2\2\2\u052a\u052b\5\u00ba^\2\u052b\u052d\7s\2\2\u052c\u052e\5"+
                    "\u00d4k\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2\2"+
                    "\u052f\u0530\7!\2\2\u0530\u0532\3\2\2\2\u0531\u0511\3\2\2\2\u0531\u0513"+
                    "\3\2\2\2\u0531\u0514\3\2\2\2\u0531\u0515\3\2\2\2\u0531\u0517\3\2\2\2\u0531"+
                    "\u051c\3\2\2\2\u0531\u051e\3\2\2\2\u0531\u0520\3\2\2\2\u0531\u0521\3\2"+
                    "\2\2\u0531\u052a\3\2\2\2\u0532\u0562\3\2\2\2\u0533\u0534\f\n\2\2\u0534"+
                    "\u0535\5\u00acW\2\u0535\u0536\5\u00b0Y\13\u0536\u0561\3\2\2\2\u0537\u0538"+
                    "\f\b\2\2\u0538\u0539\7R\2\2\u0539\u053a\5\u00b0Y\2\u053a\u053b\7S\2\2"+
                    "\u053b\u053c\5\u00b0Y\b\u053c\u0561\3\2\2\2\u053d\u053e\f\7\2\2\u053e"+
                    "\u053f\5\u00aeX\2\u053f\u0540\5\u00b0Y\7\u0540\u0561\3\2\2\2\u0541\u0542"+
                    "\f\23\2\2\u0542\u054e\7L\2\2\u0543\u054f\7y\2\2\u0544\u054f\5\u00aaV\2"+
                    "\u0545\u054f\7-\2\2\u0546\u0548\7!\2\2\u0547\u0549\5\u00ccg\2\u0548\u0547"+
                    "\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054f\5\u00c0a"+
                    "\2\u054b\u054c\7*\2\2\u054c\u054f\5\u00d6l\2\u054d\u054f\5\u00c6d\2\u054e"+
                    "\u0543\3\2\2\2\u054e\u0544\3\2\2\2\u054e\u0545\3\2\2\2\u054e\u0546\3\2"+
                    "\2\2\u054e\u054b\3\2\2\2\u054e\u054d\3\2\2\2\u054f\u0561\3\2\2\2\u0550"+
                    "\u0551\f\22\2\2\u0551\u0552\7H\2\2\u0552\u0553\5\u00b0Y\2\u0553\u0554"+
                    "\7I\2\2\u0554\u0561\3\2\2\2\u0555\u0556\f\r\2\2\u0556\u0561\t\b\2\2\u0557"+
                    "\u0558\f\t\2\2\u0558\u0559\7\34\2\2\u0559\u0561\5\u00d0i\2\u055a\u055b"+
                    "\f\5\2\2\u055b\u055d\7s\2\2\u055c\u055e\5\u00d4k\2\u055d\u055c\3\2\2\2"+
                    "\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\7y\2\2\u0560\u0533"+
                    "\3\2\2\2\u0560\u0537\3\2\2\2\u0560\u053d\3\2\2\2\u0560\u0541\3\2\2\2\u0560"+
                    "\u0550\3\2\2\2\u0560\u0555\3\2\2\2\u0560\u0557\3\2\2\2\u0560\u055a\3\2"+
                    "\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563"+
                    "\u00b1\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0566\5\u00b4[\2\u0566\u0567"+
                    "\7r\2\2\u0567\u0568\5\u00b6\\\2\u0568\u00b3\3\2\2\2\u0569\u057a\7y\2\2"+
                    "\u056a\u056c\7D\2\2\u056b\u056d\5\\/\2\u056c\u056b\3\2\2\2\u056c\u056d"+
                    "\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u057a\7E\2\2\u056f\u0570\7D\2\2\u0570"+
                    "\u0575\7y\2\2\u0571\u0572\7K\2\2\u0572\u0574\7y\2\2\u0573\u0571\3\2\2"+
                    "\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578"+
                    "\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u057a\7E\2\2\u0579\u0569\3\2\2\2\u0579"+
                    "\u056a\3\2\2\2\u0579\u056f\3\2\2\2\u057a\u00b5\3\2\2\2\u057b\u057e\5\u00b0"+
                    "Y\2\u057c\u057e\5\u0084C\2\u057d\u057b\3\2\2\2\u057d\u057c\3\2\2\2\u057e"+
                    "\u00b7\3\2\2\2\u057f\u0580\7D\2\2\u0580\u0581\5\u00b0Y\2\u0581\u0582\7"+
                    "E\2\2\u0582\u0592\3\2\2\2\u0583\u0592\7-\2\2\u0584\u0592\7*\2\2\u0585"+
                    "\u0592\5d\63\2\u0586\u0592\7y\2\2\u0587\u0588\5\62\32\2\u0588\u0589\7"+
                    "L\2\2\u0589\u058a\7\13\2\2\u058a\u0592\3\2\2\2\u058b\u058f\5\u00ccg\2"+
                    "\u058c\u0590\5\u00d8m\2\u058d\u058e\7-\2\2\u058e\u0590\5\u00dan\2\u058f"+
                    "\u058c\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0592\3\2\2\2\u0591\u057f\3\2"+
                    "\2\2\u0591\u0583\3\2\2\2\u0591\u0584\3\2\2\2\u0591\u0585\3\2\2\2\u0591"+
                    "\u0586\3\2\2\2\u0591\u0587\3\2\2\2\u0591\u058b\3\2\2\2\u0592\u00b9\3\2"+
                    "\2\2\u0593\u0594\5T+\2\u0594\u0595\7L\2\2\u0595\u0597\3\2\2\2\u0596\u0593"+
                    "\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059b\3\2\2\2\u0598\u059a\5j\66\2\u0599"+
                    "\u0598\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2"+
                    "\2\2\u059c\u059e\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u05a0\7y\2\2\u059f"+
                    "\u05a1\5\u00d4k\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u00bb"+
                    "\3\2\2\2\u05a2\u05a3\5\u00ccg\2\u05a3\u05a4\5\u00be`\2\u05a4\u05a5\5\u00c4"+
                    "c\2\u05a5\u05ac\3\2\2\2\u05a6\u05a9\5\u00be`\2\u05a7\u05aa\5\u00c2b\2"+
                    "\u05a8\u05aa\5\u00c4c\2\u05a9\u05a7\3\2\2\2\u05a9\u05a8\3\2\2\2\u05aa"+
                    "\u05ac\3\2\2\2\u05ab\u05a2\3\2\2\2\u05ab\u05a6\3\2\2\2\u05ac\u00bd\3\2"+
                    "\2\2\u05ad\u05af\7y\2\2\u05ae\u05b0\5\u00c8e\2\u05af\u05ae\3\2\2\2\u05af"+
                    "\u05b0\3\2\2\2\u05b0\u05b8\3\2\2\2\u05b1\u05b2\7L\2\2\u05b2\u05b4\7y\2"+
                    "\2\u05b3\u05b5\5\u00c8e\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
                    "\u05b7\3\2\2\2\u05b6\u05b1\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8\u05b6\3\2"+
                    "\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bd\3\2\2\2\u05ba\u05b8\3\2\2\2\u05bb"+
                    "\u05bd\5\u00d2j\2\u05bc\u05ad\3\2\2\2\u05bc\u05bb\3\2\2\2\u05bd\u00bf"+
                    "\3\2\2\2\u05be\u05c0\7y\2\2\u05bf\u05c1\5\u00caf\2\u05c0\u05bf\3\2\2\2"+
                    "\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\5\u00c4c\2\u05c3"+
                    "\u00c1\3\2\2\2\u05c4\u05e0\7H\2\2\u05c5\u05ca\7I\2\2\u05c6\u05c7\7H\2"+
                    "\2\u05c7\u05c9\7I\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8"+
                    "\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd"+
                    "\u05e1\5R*\2\u05ce\u05cf\5\u00b0Y\2\u05cf\u05d6\7I\2\2\u05d0\u05d1\7H"+
                    "\2\2\u05d1\u05d2\5\u00b0Y\2\u05d2\u05d3\7I\2\2\u05d3\u05d5\3\2\2\2\u05d4"+
                    "\u05d0\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2"+
                    "\2\2\u05d7\u05dd\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05da\7H\2\2\u05da"+
                    "\u05dc\7I\2\2\u05db\u05d9\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd\u05db\3\2"+
                    "\2\2\u05dd\u05de\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05e0"+
                    "\u05c5\3\2\2\2\u05e0\u05ce\3\2\2\2\u05e1\u00c3\3\2\2\2\u05e2\u05e4\5\u00da"+
                    "n\2\u05e3\u05e5\5&\24\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
                    "\u00c5\3\2\2\2\u05e6\u05e7\5\u00ccg\2\u05e7\u05e8\5\u00d8m\2\u05e8\u00c7"+
                    "\3\2\2\2\u05e9\u05ea\7O\2\2\u05ea\u05ed\7N\2\2\u05eb\u05ed\5\u00d4k\2"+
                    "\u05ec\u05e9\3\2\2\2\u05ec\u05eb\3\2\2\2\u05ed\u00c9\3\2\2\2\u05ee\u05ef"+
                    "\7O\2\2\u05ef\u05f2\7N\2\2\u05f0\u05f2\5\u00ccg\2\u05f1\u05ee\3\2\2\2"+
                    "\u05f1\u05f0\3\2\2\2\u05f2\u00cb\3\2\2\2\u05f3\u05f4\7O\2\2\u05f4\u05f5"+
                    "\5\u00ceh\2\u05f5\u05f6\7N\2\2\u05f6\u00cd\3\2\2\2\u05f7\u05fc\5\u00d0"+
                    "i\2\u05f8\u05f9\7K\2\2\u05f9\u05fb\5\u00d0i\2\u05fa\u05f8\3\2\2\2\u05fb"+
                    "\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u00cf\3\2"+
                    "\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0601\5j\66\2\u0600\u05ff\3\2\2\2\u0600"+
                    "\u0601\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0605\5T+\2\u0603\u0605\5\u00d2"+
                    "j\2\u0604\u0602\3\2\2\2\u0604\u0603\3\2\2\2\u0605\u060a\3\2\2\2\u0606"+
                    "\u0607\7H\2\2\u0607\u0609\7I\2\2\u0608\u0606\3\2\2\2\u0609\u060c\3\2\2"+
                    "\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u00d1\3\2\2\2\u060c\u060a"+
                    "\3\2\2\2\u060d\u060e\t\t\2\2\u060e\u00d3\3\2\2\2\u060f\u0610\7O\2\2\u0610"+
                    "\u0615\5V,\2\u0611\u0612\7K\2\2\u0612\u0614\5V,\2\u0613\u0611\3\2\2\2"+
                    "\u0614\u0617\3\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618"+
                    "\3\2\2\2\u0617\u0615\3\2\2\2\u0618\u0619\7N\2\2\u0619\u00d5\3\2\2\2\u061a"+
                    "\u0621\5\u00dan\2\u061b\u061c\7L\2\2\u061c\u061e\7y\2\2\u061d\u061f\5"+
                    "\u00dan\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2\2"+
                    "\u0620\u061a\3\2\2\2\u0620\u061b\3\2\2\2\u0621\u00d7\3\2\2\2\u0622\u0623"+
                    "\7*\2\2\u0623\u0627\5\u00d6l\2\u0624\u0625\7y\2\2\u0625\u0627\5\u00da"+
                    "n\2\u0626\u0622\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u00d9\3\2\2\2\u0628"+
                    "\u062a\7D\2\2\u0629\u062b\5\u00a8U\2\u062a\u0629\3\2\2\2\u062a\u062b\3"+
                    "\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\7E\2\2\u062d\u00db\3\2\2\2\u00e0"+
                    "\u00de\u00e2\u00e6\u00fe\u0101\u0106\u010c\u0114\u011a\u011e\u0123\u0126"+
                    "\u012b\u0132\u0135\u013c\u0146\u014a\u014f\u0153\u0157\u0161\u0169\u016f"+
                    "\u0176\u017d\u0181\u0184\u0187\u0190\u0196\u019b\u019e\u01a4\u01aa\u01ae"+
                    "\u01b6\u01bf\u01c6\u01cc\u01d0\u01db\u01e4\u01e9\u01ef\u01f3\u01ff\u0206"+
                    "\u020b\u0210\u0219\u0221\u0225\u022c\u0235\u023d\u0242\u024a\u024f\u0259"+
                    "\u0263\u0269\u0270\u0275\u027d\u0281\u0283\u0289\u028e\u0292\u0299\u029b"+
                    "\u02a2\u02a7\u02b0\u02b5\u02b8\u02bd\u02c6\u02d2\u02dc\u02e7\u02ea\u02f1"+
                    "\u02fb\u0303\u0306\u0309\u0316\u031e\u0323\u0328\u032c\u0330\u0334\u0338"+
                    "\u033a\u033e\u0344\u034c\u0350\u0354\u0357\u035a\u035e\u0362\u0365\u0367"+
                    "\u036d\u0370\u0374\u0377\u037b\u037f\u0383\u0385\u038a\u0393\u0398\u039b"+
                    "\u03a2\u03a5\u03ae\u03b3\u03ba\u03bf\u03c6\u03ce\u03d4\u03de\u03e3\u03e9"+
                    "\u03ec\u03f1\u03f5\u03fc\u0401\u0408\u040f\u0412\u0415\u041d\u0421\u0429"+
                    "\u042f\u043a\u043d\u0442\u0446\u0449\u044d\u0450\u0455\u045a\u0461\u046e"+
                    "\u0477\u047d\u0482\u0488\u0493\u0498\u049d\u04a2\u04a6\u04a9\u04ac\u04af"+
                    "\u04b2\u04b4\u04b8\u04bd\u04cc\u04d4\u04dc\u04df\u04e4\u04ea\u04f0\u04f3"+
                    "\u050d\u0524\u0528\u052d\u0531\u0548\u054e\u055d\u0560\u0562\u056c\u0575"+
                    "\u0579\u057d\u058f\u0591\u0596\u059b\u05a0\u05a9\u05ab\u05af\u05b4\u05b8"+
                    "\u05bc\u05c0\u05ca\u05d6\u05dd\u05e0\u05e4\u05ec\u05f1\u05fc\u0600\u0604"+
                    "\u060a\u0615\u061e\u0620\u0626\u062a";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}