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
        public BlockStatementContext blockStatement() {
            return getRuleContext(BlockStatementContext.class,0);
        }
        public BlockContext block() {
            return getRuleContext(BlockContext.class,0);
        }
        public MultipleStatementsContext multipleStatements() {
            return getRuleContext(MultipleStatementsContext.class,0);
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
                    blockStatement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(244);
                    block();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(245);
                    multipleStatements();
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
                setState(279);
                match(SEMI);
            }
        }
        catch (RecognitionException re) {
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
                setState(281);
                match(IMPORT);
                setState(283);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==STATIC) {
                    {
                        setState(282);
                        match(STATIC);
                    }
                }

                setState(285);
                qualifiedName();
                setState(288);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DOT) {
                    {
                        setState(286);
                        match(DOT);
                        setState(287);
                        match(MUL);
                    }
                }

                setState(290);
                match(SEMI);
            }
        }
        catch (RecognitionException re) {
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
            setState(305);
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
                    setState(295);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(292);
                                    classOrInterfaceModifier();
                                }
                            }
                        }
                        setState(297);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
                    }
                    setState(302);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS:
                        {
                            setState(298);
                            classDeclaration();
                        }
                        break;
                        case ENUM:
                        {
                            setState(299);
                            enumDeclaration();
                        }
                        break;
                        case INTERFACE:
                        {
                            setState(300);
                            interfaceDeclaration();
                        }
                        break;
                        case AT:
                        {
                            setState(301);
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
                    setState(304);
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
            setState(312);
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
                    setState(307);
                    classOrInterfaceModifier();
                }
                break;
                case NATIVE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(308);
                    match(NATIVE);
                }
                break;
                case SYNCHRONIZED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(309);
                    match(SYNCHRONIZED);
                }
                break;
                case TRANSIENT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(310);
                    match(TRANSIENT);
                }
                break;
                case VOLATILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(311);
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
            setState(322);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(314);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(315);
                    match(PUBLIC);
                }
                break;
                case PROTECTED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(316);
                    match(PROTECTED);
                }
                break;
                case PRIVATE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(317);
                    match(PRIVATE);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(318);
                    match(STATIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(319);
                    match(ABSTRACT);
                }
                break;
                case FINAL:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(320);
                    match(FINAL);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(321);
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
            setState(326);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FINAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(324);
                    match(FINAL);
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(325);
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
                setState(328);
                match(CLASS);
                setState(329);
                match(IDENTIFIER);
                setState(331);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(330);
                        typeParameters();
                    }
                }

                setState(335);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(333);
                        match(EXTENDS);
                        setState(334);
                        typeType();
                    }
                }

                setState(339);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==IMPLEMENTS) {
                    {
                        setState(337);
                        match(IMPLEMENTS);
                        setState(338);
                        typeList();
                    }
                }

                setState(341);
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
                setState(343);
                match(LT);
                setState(344);
                typeParameter();
                setState(349);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(345);
                            match(COMMA);
                            setState(346);
                            typeParameter();
                        }
                    }
                    setState(351);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(352);
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
                setState(357);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(354);
                            annotation();
                        }
                    }
                    setState(359);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(360);
                match(IDENTIFIER);
                setState(363);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(361);
                        match(EXTENDS);
                        setState(362);
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
                setState(365);
                typeType();
                setState(370);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==BITAND) {
                    {
                        {
                            setState(366);
                            match(BITAND);
                            setState(367);
                            typeType();
                        }
                    }
                    setState(372);
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
                setState(373);
                match(ENUM);
                setState(374);
                match(IDENTIFIER);
                setState(377);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==IMPLEMENTS) {
                    {
                        setState(375);
                        match(IMPLEMENTS);
                        setState(376);
                        typeList();
                    }
                }

                setState(379);
                match(LBRACE);
                setState(381);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==AT || _la==IDENTIFIER) {
                    {
                        setState(380);
                        enumConstants();
                    }
                }

                setState(384);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMA) {
                    {
                        setState(383);
                        match(COMMA);
                    }
                }

                setState(387);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SEMI) {
                    {
                        setState(386);
                        enumBodyDeclarations();
                    }
                }

                setState(389);
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
                setState(391);
                enumConstant();
                setState(396);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,27,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(392);
                                match(COMMA);
                                setState(393);
                                enumConstant();
                            }
                        }
                    }
                    setState(398);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
                setState(402);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(399);
                            annotation();
                        }
                    }
                    setState(404);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(405);
                match(IDENTIFIER);
                setState(407);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
                    case 1:
                    {
                        setState(406);
                        arguments();
                    }
                    break;
                }
                setState(410);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
                    case 1:
                    {
                        setState(409);
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
                setState(412);
                match(SEMI);
                setState(416);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
                    {
                        {
                            setState(413);
                            classBodyDeclaration();
                        }
                    }
                    setState(418);
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
                setState(419);
                match(INTERFACE);
                setState(420);
                match(IDENTIFIER);
                setState(422);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(421);
                        typeParameters();
                    }
                }

                setState(426);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(424);
                        match(EXTENDS);
                        setState(425);
                        typeList();
                    }
                }

                setState(428);
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
                setState(430);
                match(LBRACE);
                setState(434);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
                    {
                        {
                            setState(431);
                            classBodyDeclaration();
                        }
                    }
                    setState(436);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(437);
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
                setState(439);
                match(LBRACE);
                setState(443);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
                    {
                        {
                            setState(440);
                            interfaceBodyDeclaration();
                        }
                    }
                    setState(445);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(446);
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
            setState(460);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(448);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(450);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==STATIC) {
                        {
                            setState(449);
                            match(STATIC);
                        }
                    }

                    setState(452);
                    block();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(456);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(453);
                                    modifier();
                                }
                            }
                        }
                        setState(458);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
                    }
                    setState(459);
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
            setState(471);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(462);
                    methodDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(463);
                    genericMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(464);
                    fieldDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(465);
                    constructorDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(466);
                    genericConstructorDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(467);
                    interfaceDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(468);
                    annotationTypeDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(469);
                    classDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(470);
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
                setState(473);
                typeTypeOrVoid();
                setState(474);
                match(IDENTIFIER);
                setState(475);
                formalParameters();
                setState(480);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(476);
                            match(LBRACK);
                            setState(477);
                            match(RBRACK);
                        }
                    }
                    setState(482);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(485);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(483);
                        match(THROWS);
                        setState(484);
                        qualifiedNameList();
                    }
                }

                setState(487);
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
            setState(491);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NEWLINE:
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(489);
                    block();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(490);
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
            setState(495);
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
                    setState(493);
                    typeType();
                }
                break;
                case VOID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(494);
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
                setState(497);
                typeParameters();
                setState(498);
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
                setState(500);
                typeParameters();
                setState(501);
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
                setState(503);
                match(IDENTIFIER);
                setState(504);
                formalParameters();
                setState(507);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(505);
                        match(THROWS);
                        setState(506);
                        qualifiedNameList();
                    }
                }

                setState(509);
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
                setState(511);
                typeType();
                setState(512);
                variableDeclarators();
                setState(513);
                match(SEMI);
            }
        }
        catch (RecognitionException re) {
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
            setState(523);
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
                    setState(518);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(515);
                                    modifier();
                                }
                            }
                        }
                        setState(520);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
                    }
                    setState(521);
                    interfaceMemberDeclaration();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(522);
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
            setState(532);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(525);
                    constDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(526);
                    interfaceMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(527);
                    genericInterfaceMethodDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(528);
                    interfaceDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(529);
                    annotationTypeDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(530);
                    classDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(531);
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
                setState(534);
                typeType();
                setState(535);
                constantDeclarator();
                setState(540);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(536);
                            match(COMMA);
                            setState(537);
                            constantDeclarator();
                        }
                    }
                    setState(542);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(543);
                match(SEMI);
            }
        }
        catch (RecognitionException re) {
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
                setState(545);
                match(IDENTIFIER);
                setState(550);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(546);
                            match(LBRACK);
                            setState(547);
                            match(RBRACK);
                        }
                    }
                    setState(552);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(553);
                match(ASSIGN);
                setState(554);
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
                setState(559);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,50,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(556);
                                interfaceMethodModifier();
                            }
                        }
                    }
                    setState(561);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,50,_ctx);
                }
                setState(572);
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
                        setState(562);
                        typeTypeOrVoid();
                    }
                    break;
                    case LT:
                    {
                        setState(563);
                        typeParameters();
                        setState(567);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,51,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(564);
                                        annotation();
                                    }
                                }
                            }
                            setState(569);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,51,_ctx);
                        }
                        setState(570);
                        typeTypeOrVoid();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(574);
                match(IDENTIFIER);
                setState(575);
                formalParameters();
                setState(580);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(576);
                            match(LBRACK);
                            setState(577);
                            match(RBRACK);
                        }
                    }
                    setState(582);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(585);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(583);
                        match(THROWS);
                        setState(584);
                        qualifiedNameList();
                    }
                }

                setState(587);
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
            setState(595);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(589);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(590);
                    match(PUBLIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(591);
                    match(ABSTRACT);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(592);
                    match(DEFAULT);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(593);
                    match(STATIC);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(594);
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
                setState(597);
                typeParameters();
                setState(598);
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
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(600);
                variableDeclarator();
                setState(605);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(601);
                            match(COMMA);
                            setState(602);
                            variableDeclarator();
                        }
                    }
                    setState(607);
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
                setState(608);
                variableDeclaratorId();
                setState(611);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
                    case 1:
                    {
                        setState(609);
                        match(ASSIGN);
                        setState(610);
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
                setState(613);
                match(IDENTIFIER);
                setState(618);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,58,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(614);
                                match(LBRACK);
                                setState(615);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(620);
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
            setState(623);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(621);
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
                    setState(622);
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
                setState(625);
                match(LBRACE);
                setState(637);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(626);
                        variableInitializer();
                        setState(631);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,60,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(627);
                                        match(COMMA);
                                        setState(628);
                                        variableInitializer();
                                    }
                                }
                            }
                            setState(633);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,60,_ctx);
                        }
                        setState(635);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==COMMA) {
                            {
                                setState(634);
                                match(COMMA);
                            }
                        }

                    }
                }

                setState(639);
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
                setState(641);
                match(IDENTIFIER);
                setState(643);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
                    case 1:
                    {
                        setState(642);
                        typeArguments();
                    }
                    break;
                }
                setState(652);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,65,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(645);
                                match(DOT);
                                setState(646);
                                match(IDENTIFIER);
                                setState(648);
                                _errHandler.sync(this);
                                switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
                                    case 1:
                                    {
                                        setState(647);
                                        typeArguments();
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    setState(654);
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
            setState(661);
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
                    setState(655);
                    typeType();
                }
                break;
                case QUESTION:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(656);
                    match(QUESTION);
                    setState(659);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==EXTENDS || _la==SUPER) {
                        {
                            setState(657);
                            _la = _input.LA(1);
                            if ( !(_la==EXTENDS || _la==SUPER) ) {
                                _errHandler.recoverInline(this);
                            }
                            else {
                                if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(658);
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
                setState(663);
                qualifiedName();
                setState(668);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(664);
                            match(COMMA);
                            setState(665);
                            qualifiedName();
                        }
                    }
                    setState(670);
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
                setState(671);
                match(LPAREN);
                setState(673);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
                    {
                        setState(672);
                        formalParameterList();
                    }
                }

                setState(675);
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
            setState(690);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(677);
                    formalParameter();
                    setState(682);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,70,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(678);
                                    match(COMMA);
                                    setState(679);
                                    formalParameter();
                                }
                            }
                        }
                        setState(684);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,70,_ctx);
                    }
                    setState(687);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COMMA) {
                        {
                            setState(685);
                            match(COMMA);
                            setState(686);
                            lastFormalParameter();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(689);
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
                setState(695);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,73,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(692);
                                variableModifier();
                            }
                        }
                    }
                    setState(697);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,73,_ctx);
                }
                setState(698);
                typeType();
                setState(699);
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
                setState(704);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,74,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(701);
                                variableModifier();
                            }
                        }
                    }
                    setState(706);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,74,_ctx);
                }
                setState(707);
                typeType();
                setState(708);
                match(ELLIPSIS);
                setState(709);
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
                setState(711);
                match(IDENTIFIER);
                setState(716);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,75,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(712);
                                match(DOT);
                                setState(713);
                                match(IDENTIFIER);
                            }
                        }
                    }
                    setState(718);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
            setState(726);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(719);
                    integerLiteral();
                }
                break;
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(720);
                    floatLiteral();
                }
                break;
                case CHAR_LITERAL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(721);
                    match(CHAR_LITERAL);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(722);
                    match(STRING_LITERAL);
                }
                break;
                case BOOL_LITERAL:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(723);
                    match(BOOL_LITERAL);
                }
                break;
                case NULL_LITERAL:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(724);
                    match(NULL_LITERAL);
                }
                break;
                case LITERALS:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(725);
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
                setState(728);
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
                setState(730);
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
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(732);
                match(AT);
                setState(733);
                qualifiedName();
                setState(740);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
                    case 1:
                    {
                        setState(734);
                        match(LPAREN);
                        setState(737);
                        _errHandler.sync(this);
                        switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
                            case 1:
                            {
                                setState(735);
                                elementValuePairs();
                            }
                            break;
                            case 2:
                            {
                                setState(736);
                                elementValue();
                            }
                            break;
                        }
                        setState(739);
                        match(RPAREN);
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
                setState(742);
                elementValuePair();
                setState(747);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(743);
                            match(COMMA);
                            setState(744);
                            elementValuePair();
                        }
                    }
                    setState(749);
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
                setState(750);
                match(IDENTIFIER);
                setState(751);
                match(ASSIGN);
                setState(752);
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
            setState(757);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(754);
                    expression(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(755);
                    annotation();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(756);
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
                setState(759);
                match(LBRACE);
                setState(768);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(760);
                        elementValue();
                        setState(765);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,81,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(761);
                                        match(COMMA);
                                        setState(762);
                                        elementValue();
                                    }
                                }
                            }
                            setState(767);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,81,_ctx);
                        }
                    }
                }

                setState(771);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMA) {
                    {
                        setState(770);
                        match(COMMA);
                    }
                }

                setState(773);
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
                setState(775);
                match(AT);
                setState(776);
                match(INTERFACE);
                setState(777);
                match(IDENTIFIER);
                setState(778);
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
                setState(780);
                match(LBRACE);
                setState(784);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
                    {
                        {
                            setState(781);
                            annotationTypeElementDeclaration();
                        }
                    }
                    setState(786);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(787);
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
            setState(797);
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
                    setState(792);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,85,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(789);
                                    modifier();
                                }
                            }
                        }
                        setState(794);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,85,_ctx);
                    }
                    setState(795);
                    annotationTypeElementRest();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(796);
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
            setState(819);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(799);
                    typeType();
                    setState(800);
                    annotationMethodOrConstantRest();
                    setState(801);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(803);
                    classDeclaration();
                    setState(805);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
                        case 1:
                        {
                            setState(804);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(807);
                    interfaceDeclaration();
                    setState(809);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
                        case 1:
                        {
                            setState(808);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(811);
                    enumDeclaration();
                    setState(813);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
                        case 1:
                        {
                            setState(812);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(815);
                    annotationTypeDeclaration();
                    setState(817);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
                        case 1:
                        {
                            setState(816);
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
            setState(823);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(821);
                    annotationMethodRest();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(822);
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
                setState(825);
                match(IDENTIFIER);
                setState(826);
                match(LPAREN);
                setState(827);
                match(RPAREN);
                setState(829);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEFAULT) {
                    {
                        setState(828);
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
                setState(831);
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
                setState(833);
                match(DEFAULT);
                setState(834);
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
            setState(864);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(837);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(836);
                            match(NEWLINE);
                        }
                    }

                    setState(839);
                    match(LBRACE);
                    setState(841);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
                        case 1:
                        {
                            setState(840);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(843);
                    multipleStatements();
                    setState(845);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
                        case 1:
                        {
                            setState(844);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(848);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
                        case 1:
                        {
                            setState(847);
                            match(RBRACE);
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(851);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(850);
                            match(NEWLINE);
                        }
                    }

                    setState(853);
                    match(LBRACE);
                    setState(855);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(854);
                            match(NEWLINE);
                        }
                    }

                    setState(857);
                    match(WILDCARD);
                    setState(859);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
                        case 1:
                        {
                            setState(858);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(862);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
                        case 1:
                        {
                            setState(861);
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
        public List<PackageDeclarationContext> packageDeclaration() {
            return getRuleContexts(PackageDeclarationContext.class);
        }
        public PackageDeclarationContext packageDeclaration(int i) {
            return getRuleContext(PackageDeclarationContext.class,i);
        }
        public TerminalNode NEWLINE() { return getToken(JavaParser.NEWLINE, 0); }
        public List<ImportDeclarationContext> importDeclaration() {
            return getRuleContexts(ImportDeclarationContext.class);
        }
        public ImportDeclarationContext importDeclaration(int i) {
            return getRuleContext(ImportDeclarationContext.class,i);
        }
        public List<EnumDeclarationContext> enumDeclaration() {
            return getRuleContexts(EnumDeclarationContext.class);
        }
        public EnumDeclarationContext enumDeclaration(int i) {
            return getRuleContext(EnumDeclarationContext.class,i);
        }
        public List<EnumConstantContext> enumConstant() {
            return getRuleContexts(EnumConstantContext.class);
        }
        public EnumConstantContext enumConstant(int i) {
            return getRuleContext(EnumConstantContext.class,i);
        }
        public List<InterfaceDeclarationContext> interfaceDeclaration() {
            return getRuleContexts(InterfaceDeclarationContext.class);
        }
        public InterfaceDeclarationContext interfaceDeclaration(int i) {
            return getRuleContext(InterfaceDeclarationContext.class,i);
        }
        public List<MemberDeclarationContext> memberDeclaration() {
            return getRuleContexts(MemberDeclarationContext.class);
        }
        public MemberDeclarationContext memberDeclaration(int i) {
            return getRuleContext(MemberDeclarationContext.class,i);
        }
        public List<InterfaceMethodDeclarationContext> interfaceMethodDeclaration() {
            return getRuleContexts(InterfaceMethodDeclarationContext.class);
        }
        public InterfaceMethodDeclarationContext interfaceMethodDeclaration(int i) {
            return getRuleContext(InterfaceMethodDeclarationContext.class,i);
        }
        public List<GenericInterfaceMethodDeclarationContext> genericInterfaceMethodDeclaration() {
            return getRuleContexts(GenericInterfaceMethodDeclarationContext.class);
        }
        public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration(int i) {
            return getRuleContext(GenericInterfaceMethodDeclarationContext.class,i);
        }
        public List<VariableDeclaratorContext> variableDeclarator() {
            return getRuleContexts(VariableDeclaratorContext.class);
        }
        public VariableDeclaratorContext variableDeclarator(int i) {
            return getRuleContext(VariableDeclaratorContext.class,i);
        }
        public List<LiteralContext> literal() {
            return getRuleContexts(LiteralContext.class);
        }
        public LiteralContext literal(int i) {
            return getRuleContext(LiteralContext.class,i);
        }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public List<ElementValuePairContext> elementValuePair() {
            return getRuleContexts(ElementValuePairContext.class);
        }
        public ElementValuePairContext elementValuePair(int i) {
            return getRuleContext(ElementValuePairContext.class,i);
        }
        public List<AnnotationTypeDeclarationContext> annotationTypeDeclaration() {
            return getRuleContexts(AnnotationTypeDeclarationContext.class);
        }
        public AnnotationTypeDeclarationContext annotationTypeDeclaration(int i) {
            return getRuleContext(AnnotationTypeDeclarationContext.class,i);
        }
        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }
        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class,i);
        }
        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }
        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class,i);
        }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public List<ParExpressionContext> parExpression() {
            return getRuleContexts(ParExpressionContext.class);
        }
        public ParExpressionContext parExpression(int i) {
            return getRuleContext(ParExpressionContext.class,i);
        }
        public List<ExpressionListContext> expressionList() {
            return getRuleContexts(ExpressionListContext.class);
        }
        public ExpressionListContext expressionList(int i) {
            return getRuleContext(ExpressionListContext.class,i);
        }
        public List<MethodCallContext> methodCall() {
            return getRuleContexts(MethodCallContext.class);
        }
        public MethodCallContext methodCall(int i) {
            return getRuleContext(MethodCallContext.class,i);
        }
        public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
        public List<MultipleStatementsContext> multipleStatements() {
            return getRuleContexts(MultipleStatementsContext.class);
        }
        public MultipleStatementsContext multipleStatements(int i) {
            return getRuleContext(MultipleStatementsContext.class,i);
        }
        public TerminalNode EMPTY() { return getToken(JavaParser.EMPTY, 0); }
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
            setState(1067);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(866);
                    packageDeclaration();
                    setState(868);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
                        case 1:
                        {
                            setState(867);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(873);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,104,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(870);
                                    packageDeclaration();
                                }
                            }
                        }
                        setState(875);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,104,_ctx);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(876);
                    importDeclaration();
                    setState(878);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
                        case 1:
                        {
                            setState(877);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(883);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,106,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(880);
                                    importDeclaration();
                                }
                            }
                        }
                        setState(885);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,106,_ctx);
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(886);
                    enumDeclaration();
                    setState(888);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
                        case 1:
                        {
                            setState(887);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(893);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,108,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(890);
                                    enumDeclaration();
                                }
                            }
                        }
                        setState(895);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,108,_ctx);
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(896);
                    enumConstant();
                    setState(898);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
                        case 1:
                        {
                            setState(897);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(903);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,110,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(900);
                                    enumConstant();
                                }
                            }
                        }
                        setState(905);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,110,_ctx);
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(906);
                    interfaceDeclaration();
                    setState(908);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
                        case 1:
                        {
                            setState(907);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(913);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,112,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(910);
                                    interfaceDeclaration();
                                }
                            }
                        }
                        setState(915);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,112,_ctx);
                    }
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(916);
                    memberDeclaration();
                    setState(918);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
                        case 1:
                        {
                            setState(917);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(923);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,114,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(920);
                                    memberDeclaration();
                                }
                            }
                        }
                        setState(925);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,114,_ctx);
                    }
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(926);
                    interfaceMethodDeclaration();
                    setState(928);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
                        case 1:
                        {
                            setState(927);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(933);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,116,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(930);
                                    interfaceMethodDeclaration();
                                }
                            }
                        }
                        setState(935);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,116,_ctx);
                    }
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(936);
                    genericInterfaceMethodDeclaration();
                    setState(938);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
                        case 1:
                        {
                            setState(937);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(943);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,118,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(940);
                                    genericInterfaceMethodDeclaration();
                                }
                            }
                        }
                        setState(945);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,118,_ctx);
                    }
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(946);
                    variableDeclarator();
                    setState(948);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
                        case 1:
                        {
                            setState(947);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(953);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,120,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(950);
                                    variableDeclarator();
                                }
                            }
                        }
                        setState(955);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,120,_ctx);
                    }
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(956);
                    literal();
                    setState(958);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
                        case 1:
                        {
                            setState(957);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(963);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,122,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(960);
                                    literal();
                                }
                            }
                        }
                        setState(965);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,122,_ctx);
                    }
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(966);
                    annotation();
                    setState(968);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
                        case 1:
                        {
                            setState(967);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(973);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,124,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(970);
                                    annotation();
                                }
                            }
                        }
                        setState(975);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,124,_ctx);
                    }
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(976);
                    elementValuePair();
                    setState(978);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
                        case 1:
                        {
                            setState(977);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(983);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,126,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(980);
                                    elementValuePair();
                                }
                            }
                        }
                        setState(985);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,126,_ctx);
                    }
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(986);
                    annotationTypeDeclaration();
                    setState(988);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
                        case 1:
                        {
                            setState(987);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(993);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,128,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(990);
                                    annotationTypeDeclaration();
                                }
                            }
                        }
                        setState(995);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,128,_ctx);
                    }
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(996);
                    blockStatement();
                    setState(998);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
                        case 1:
                        {
                            setState(997);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1003);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,130,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1000);
                                    blockStatement();
                                }
                            }
                        }
                        setState(1005);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,130,_ctx);
                    }
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(1006);
                    block();
                    setState(1008);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
                        case 1:
                        {
                            setState(1007);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1013);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,132,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1010);
                                    block();
                                }
                            }
                        }
                        setState(1015);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,132,_ctx);
                    }
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(1016);
                    expression(0);
                    setState(1018);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
                        case 1:
                        {
                            setState(1017);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1023);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,134,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1020);
                                    expression(0);
                                }
                            }
                        }
                        setState(1025);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,134,_ctx);
                    }
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(1026);
                    parExpression();
                    setState(1028);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
                        case 1:
                        {
                            setState(1027);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1033);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,136,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1030);
                                    parExpression();
                                }
                            }
                        }
                        setState(1035);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,136,_ctx);
                    }
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(1036);
                    expressionList();
                    setState(1038);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
                        case 1:
                        {
                            setState(1037);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1043);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,138,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1040);
                                    expressionList();
                                }
                            }
                        }
                        setState(1045);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,138,_ctx);
                    }
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(1046);
                    methodCall();
                    setState(1048);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
                        case 1:
                        {
                            setState(1047);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1053);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,140,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1050);
                                    methodCall();
                                }
                            }
                        }
                        setState(1055);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,140,_ctx);
                    }
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(1056);
                    match(WILDCARD);
                    setState(1058);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
                        case 1:
                        {
                            setState(1057);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(1063);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,142,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1060);
                                    multipleStatements();
                                }
                            }
                        }
                        setState(1065);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,142,_ctx);
                    }
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(1066);
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

    public static class BlockStatementContext extends ParserRuleContext {
        public LocalVariableDeclarationContext localVariableDeclaration() {
            return getRuleContext(LocalVariableDeclarationContext.class,0);
        }
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
            setState(1075);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1069);
                    localVariableDeclaration();
                    setState(1070);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1072);
                    statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1073);
                    localTypeDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1074);
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
                setState(1080);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,145,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1077);
                                variableModifier();
                            }
                        }
                    }
                    setState(1082);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,145,_ctx);
                }
                setState(1083);
                typeType();
                setState(1084);
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
            setState(1097);
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
                    setState(1089);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
                        {
                            {
                                setState(1086);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(1091);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1094);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS:
                        {
                            setState(1092);
                            classDeclaration();
                        }
                        break;
                        case INTERFACE:
                        {
                            setState(1093);
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
                    setState(1096);
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
            setState(1271);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1099);
                    ((StatementContext)_localctx).blockLabel = block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1100);
                    match(ASSERT);
                    setState(1101);
                    match(EXPR);
                    setState(1104);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COLON) {
                        {
                            setState(1102);
                            match(COLON);
                            setState(1103);
                            match(EXPR);
                        }
                    }

                    setState(1106);
                    match(SEMI);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1107);
                    match(FOR);
                    setState(1108);
                    match(LPAREN);
                    setState(1109);
                    match(EXPR);
                    setState(1114);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1110);
                                match(COMMA);
                                setState(1111);
                                match(EXPR);
                            }
                        }
                        setState(1116);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1117);
                    match(RPAREN);
                    setState(1119);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
                        case 1:
                        {
                            setState(1118);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1121);
                    match(FOR);
                    setState(1122);
                    match(LPAREN);
                    setState(1123);
                    match(WILDCARD);
                    setState(1124);
                    match(RPAREN);
                    setState(1126);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
                        case 1:
                        {
                            setState(1125);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1128);
                    match(WHILE);
                    setState(1129);
                    match(EXPR);
                    setState(1131);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
                        case 1:
                        {
                            setState(1130);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1133);
                    match(DO);
                    setState(1134);
                    statement();
                    setState(1135);
                    match(WHILE);
                    setState(1136);
                    match(EXPR);
                    setState(1137);
                    match(SEMI);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1139);
                    match(SWITCH);
                    setState(1140);
                    match(EXPR);
                    setState(1141);
                    match(LBRACE);
                    setState(1145);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,154,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1142);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(1147);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,154,_ctx);
                    }
                    setState(1151);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CASE || _la==DEFAULT) {
                        {
                            {
                                setState(1148);
                                switchLabel();
                            }
                        }
                        setState(1153);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1154);
                    match(RBRACE);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(1155);
                    match(SYNCHRONIZED);
                    setState(1156);
                    match(EXPR);
                    setState(1157);
                    block();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(1158);
                    match(RETURN);
                    setState(1159);
                    match(EXPR);
                    setState(1160);
                    match(SEMI);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(1161);
                    match(THROW);
                    setState(1162);
                    match(EXPR);
                    setState(1163);
                    match(SEMI);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(1164);
                    match(ASSERT);
                    setState(1165);
                    expression(0);
                    setState(1168);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COLON) {
                        {
                            setState(1166);
                            match(COLON);
                            setState(1167);
                            expression(0);
                        }
                    }

                    setState(1170);
                    match(SEMI);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(1172);
                    match(IF);
                    setState(1173);
                    parExpression();
                    setState(1175);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
                        case 1:
                        {
                            setState(1174);
                            statement();
                        }
                        break;
                    }
                    setState(1179);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
                        case 1:
                        {
                            setState(1177);
                            match(ELSE);
                            setState(1178);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(1181);
                    match(FOR);
                    setState(1182);
                    match(LPAREN);
                    setState(1183);
                    forControl();
                    setState(1184);
                    match(RPAREN);
                    setState(1186);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
                        case 1:
                        {
                            setState(1185);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(1188);
                    match(WHILE);
                    setState(1189);
                    parExpression();
                    setState(1191);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
                        case 1:
                        {
                            setState(1190);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(1193);
                    match(DO);
                    setState(1194);
                    statement();
                    setState(1195);
                    match(WHILE);
                    setState(1196);
                    parExpression();
                    setState(1197);
                    match(SEMI);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(1199);
                    match(TRY);
                    setState(1200);
                    block();
                    setState(1210);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CATCH:
                        {
                            setState(1202);
                            _errHandler.sync(this);
                            _alt = 1;
                            do {
                                switch (_alt) {
                                    case 1:
                                    {
                                        {
                                            setState(1201);
                                            catchClause();
                                        }
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                                setState(1204);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input,161,_ctx);
                            } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
                            setState(1207);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
                                case 1:
                                {
                                    setState(1206);
                                    finallyBlock();
                                }
                                break;
                            }
                        }
                        break;
                        case FINALLY:
                        {
                            setState(1209);
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
                    setState(1212);
                    match(TRY);
                    setState(1213);
                    resourceSpecification();
                    setState(1214);
                    block();
                    setState(1218);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,164,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1215);
                                    catchClause();
                                }
                            }
                        }
                        setState(1220);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,164,_ctx);
                    }
                    setState(1222);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
                        case 1:
                        {
                            setState(1221);
                            finallyBlock();
                        }
                        break;
                    }
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(1224);
                    match(SWITCH);
                    setState(1225);
                    parExpression();
                    setState(1226);
                    match(LBRACE);
                    setState(1230);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,166,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1227);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(1232);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,166,_ctx);
                    }
                    setState(1236);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CASE || _la==DEFAULT) {
                        {
                            {
                                setState(1233);
                                switchLabel();
                            }
                        }
                        setState(1238);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1239);
                    match(RBRACE);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(1241);
                    match(SYNCHRONIZED);
                    setState(1242);
                    parExpression();
                    setState(1243);
                    block();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(1245);
                    match(RETURN);
                    setState(1247);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1246);
                            expression(0);
                        }
                    }

                    setState(1249);
                    match(SEMI);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(1250);
                    match(THROW);
                    setState(1251);
                    expression(0);
                    setState(1252);
                    match(SEMI);
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(1254);
                    match(BREAK);
                    setState(1256);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==IDENTIFIER) {
                        {
                            setState(1255);
                            match(IDENTIFIER);
                        }
                    }

                    setState(1258);
                    match(SEMI);
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(1259);
                    match(CONTINUE);
                    setState(1261);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==IDENTIFIER) {
                        {
                            setState(1260);
                            match(IDENTIFIER);
                        }
                    }

                    setState(1263);
                    match(SEMI);
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(1264);
                    match(SEMI);
                }
                break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                {
                    setState(1265);
                    ((StatementContext)_localctx).statementExpression = expression(0);
                    setState(1266);
                    match(SEMI);
                }
                break;
                case 26:
                    enterOuterAlt(_localctx, 26);
                {
                    setState(1268);
                    ((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
                    setState(1269);
                    match(COLON);
                    setState(1270);
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
                setState(1273);
                match(CATCH);
                setState(1274);
                match(LPAREN);
                setState(1278);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==FINAL || _la==AT) {
                    {
                        {
                            setState(1275);
                            variableModifier();
                        }
                    }
                    setState(1280);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1281);
                catchType();
                setState(1282);
                match(IDENTIFIER);
                setState(1283);
                match(RPAREN);
                setState(1284);
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
                setState(1286);
                qualifiedName();
                setState(1291);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==BITOR) {
                    {
                        {
                            setState(1287);
                            match(BITOR);
                            setState(1288);
                            qualifiedName();
                        }
                    }
                    setState(1293);
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
                setState(1294);
                match(FINALLY);
                setState(1295);
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
                setState(1297);
                match(LPAREN);
                setState(1298);
                resources();
                setState(1300);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SEMI) {
                    {
                        setState(1299);
                        match(SEMI);
                    }
                }

                setState(1302);
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
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1304);
                resource();
                setState(1309);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,175,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1305);
                                match(SEMI);
                                setState(1306);
                                resource();
                            }
                        }
                    }
                    setState(1311);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
                setState(1315);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==FINAL || _la==AT) {
                    {
                        {
                            setState(1312);
                            variableModifier();
                        }
                    }
                    setState(1317);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1318);
                classOrInterfaceType();
                setState(1319);
                variableDeclaratorId();
                setState(1320);
                match(ASSIGN);
                setState(1321);
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
                setState(1324);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1323);
                            switchLabel();
                        }
                    }
                    setState(1326);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==CASE || _la==DEFAULT );
                setState(1329);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1328);
                            blockStatement();
                        }
                    }
                    setState(1331);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << WILDCARD) | (1L << NEWLINE) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
            }
        }
        catch (RecognitionException re) {
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
            setState(1341);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CASE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1333);
                    match(CASE);
                    setState(1336);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
                        case 1:
                        {
                            setState(1334);
                            ((SwitchLabelContext)_localctx).constantExpression = expression(0);
                        }
                        break;
                        case 2:
                        {
                            setState(1335);
                            ((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
                        }
                        break;
                    }
                    setState(1338);
                    match(COLON);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1339);
                    match(DEFAULT);
                    setState(1340);
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
            setState(1355);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1343);
                    enhancedForControl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1345);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1344);
                            forInit();
                        }
                    }

                    setState(1347);
                    match(SEMI);
                    setState(1349);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1348);
                            expression(0);
                        }
                    }

                    setState(1351);
                    match(SEMI);
                    setState(1353);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1352);
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
            setState(1359);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1357);
                    localVariableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1358);
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
                setState(1364);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,186,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1361);
                                variableModifier();
                            }
                        }
                    }
                    setState(1366);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,186,_ctx);
                }
                setState(1367);
                typeType();
                setState(1368);
                variableDeclaratorId();
                setState(1369);
                match(COLON);
                setState(1370);
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
            setState(1379);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1372);
                    match(LPAREN);
                    setState(1373);
                    match(EXPR);
                    setState(1374);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1375);
                    match(LPAREN);
                    setState(1376);
                    expression(0);
                    setState(1377);
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
        try {
            int _alt;
            setState(1398);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case WILDCARD:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1381);
                    match(WILDCARD);
                }
                break;
                case EXPR:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1382);
                    match(EXPR);
                    setState(1387);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,188,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1383);
                                    match(COMMA);
                                    setState(1384);
                                    match(EXPR);
                                }
                            }
                        }
                        setState(1389);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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
                case NEW:
                case SHORT:
                case SUPER:
                case THIS:
                case VOID:
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
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1390);
                    expression(0);
                    setState(1395);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,189,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1391);
                                    match(COMMA);
                                    setState(1392);
                                    expression(0);
                                }
                            }
                        }
                        setState(1397);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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
            setState(1418);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1400);
                    match(IDENTIFIER);
                    setState(1401);
                    match(LPAREN);
                    setState(1403);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1402);
                            expressionList();
                        }
                    }

                    setState(1405);
                    match(RPAREN);
                }
                break;
                case THIS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1406);
                    match(THIS);
                    setState(1407);
                    match(LPAREN);
                    setState(1409);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1408);
                            expressionList();
                        }
                    }

                    setState(1411);
                    match(RPAREN);
                }
                break;
                case SUPER:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1412);
                    match(SUPER);
                    setState(1413);
                    match(LPAREN);
                    setState(1415);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1414);
                            expressionList();
                        }
                    }

                    setState(1417);
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
            setState(1444);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1420);
                    match(MUL);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1421);
                    match(DIV);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1422);
                    match(MOD);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1423);
                    match(ADD);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1424);
                    match(SUB);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1425);
                    match(LT);
                    setState(1426);
                    match(LT);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1427);
                    match(GT);
                    setState(1428);
                    match(GT);
                    setState(1429);
                    match(GT);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(1430);
                    match(GT);
                    setState(1431);
                    match(GT);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(1432);
                    match(LE);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(1433);
                    match(GE);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(1434);
                    match(GT);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(1435);
                    match(LT);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(1436);
                    match(EQUAL);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(1437);
                    match(NOTEQUAL);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(1438);
                    match(BITAND);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(1439);
                    match(CARET);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(1440);
                    match(BITOR);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(1441);
                    match(AND);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(1442);
                    match(OR);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(1443);
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
                setState(1446);
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
                setState(1479);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
                    case 1:
                    {
                        setState(1449);
                        primary();
                    }
                    break;
                    case 2:
                    {
                        setState(1450);
                        methodCall();
                    }
                    break;
                    case 3:
                    {
                        setState(1451);
                        match(NEW);
                        setState(1452);
                        creator();
                    }
                    break;
                    case 4:
                    {
                        setState(1453);
                        match(LPAREN);
                        setState(1454);
                        typeType();
                        setState(1455);
                        match(RPAREN);
                        setState(1456);
                        expression(12);
                    }
                    break;
                    case 5:
                    {
                        setState(1458);
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
                        setState(1459);
                        expression(10);
                    }
                    break;
                    case 6:
                    {
                        setState(1460);
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
                        setState(1461);
                        expression(9);
                    }
                    break;
                    case 7:
                    {
                        setState(1462);
                        lambdaExpression();
                    }
                    break;
                    case 8:
                    {
                        setState(1463);
                        typeType();
                        setState(1464);
                        match(COLONCOLON);
                        setState(1470);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LT:
                            case IDENTIFIER:
                            {
                                setState(1466);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==LT) {
                                    {
                                        setState(1465);
                                        typeArguments();
                                    }
                                }

                                setState(1468);
                                match(IDENTIFIER);
                            }
                            break;
                            case NEW:
                            {
                                setState(1469);
                                match(NEW);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    break;
                    case 9:
                    {
                        setState(1472);
                        classType();
                        setState(1473);
                        match(COLONCOLON);
                        setState(1475);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==LT) {
                            {
                                setState(1474);
                                typeArguments();
                            }
                        }

                        setState(1477);
                        match(NEW);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1528);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,204,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1526);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1481);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(1482);
                                    binary_operators();
                                    setState(1483);
                                    expression(9);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1485);
                                    if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(1486);
                                    ((ExpressionContext)_localctx).bop = match(QUESTION);
                                    setState(1487);
                                    expression(0);
                                    setState(1488);
                                    match(COLON);
                                    setState(1489);
                                    expression(6);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1491);
                                    if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(1492);
                                    assign_operators();
                                    setState(1493);
                                    expression(5);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1495);
                                    if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(1496);
                                    ((ExpressionContext)_localctx).bop = match(DOT);
                                    setState(1508);
                                    _errHandler.sync(this);
                                    switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
                                        case 1:
                                        {
                                            setState(1497);
                                            match(IDENTIFIER);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1498);
                                            methodCall();
                                        }
                                        break;
                                        case 3:
                                        {
                                            setState(1499);
                                            match(THIS);
                                        }
                                        break;
                                        case 4:
                                        {
                                            setState(1500);
                                            match(NEW);
                                            setState(1502);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la==LT) {
                                                {
                                                    setState(1501);
                                                    nonWildcardTypeArguments();
                                                }
                                            }

                                            setState(1504);
                                            innerCreator();
                                        }
                                        break;
                                        case 5:
                                        {
                                            setState(1505);
                                            match(SUPER);
                                            setState(1506);
                                            superSuffix();
                                        }
                                        break;
                                        case 6:
                                        {
                                            setState(1507);
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
                                    setState(1510);
                                    if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(1511);
                                    match(LBRACK);
                                    setState(1512);
                                    expression(0);
                                    setState(1513);
                                    match(RBRACK);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1515);
                                    if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(1516);
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
                                    setState(1517);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1518);
                                    ((ExpressionContext)_localctx).bop = match(INSTANCEOF);
                                    setState(1519);
                                    typeType();
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1520);
                                    if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1521);
                                    match(COLONCOLON);
                                    setState(1523);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==LT) {
                                        {
                                            setState(1522);
                                            typeArguments();
                                        }
                                    }

                                    setState(1525);
                                    match(IDENTIFIER);
                                }
                                break;
                            }
                        }
                    }
                    setState(1530);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
                setState(1531);
                lambdaParameters();
                setState(1532);
                match(ARROW);
                setState(1533);
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
            setState(1551);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1535);
                    match(IDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1536);
                    match(LPAREN);
                    setState(1538);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
                        {
                            setState(1537);
                            formalParameterList();
                        }
                    }

                    setState(1540);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1541);
                    match(LPAREN);
                    setState(1542);
                    match(IDENTIFIER);
                    setState(1547);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1543);
                                match(COMMA);
                                setState(1544);
                                match(IDENTIFIER);
                            }
                        }
                        setState(1549);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1550);
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
            setState(1555);
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
                    setState(1553);
                    expression(0);
                }
                break;
                case NEWLINE:
                case LBRACE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1554);
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
            setState(1575);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1557);
                    match(LPAREN);
                    setState(1558);
                    expression(0);
                    setState(1559);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1561);
                    match(THIS);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1562);
                    match(SUPER);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1563);
                    literal();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1564);
                    match(IDENTIFIER);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1565);
                    typeTypeOrVoid();
                    setState(1566);
                    match(DOT);
                    setState(1567);
                    match(CLASS);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1569);
                    nonWildcardTypeArguments();
                    setState(1573);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case SUPER:
                        case IDENTIFIER:
                        {
                            setState(1570);
                            explicitGenericInvocationSuffix();
                        }
                        break;
                        case THIS:
                        {
                            setState(1571);
                            match(THIS);
                            setState(1572);
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
                setState(1580);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
                    case 1:
                    {
                        setState(1577);
                        classOrInterfaceType();
                        setState(1578);
                        match(DOT);
                    }
                    break;
                }
                setState(1585);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(1582);
                            annotation();
                        }
                    }
                    setState(1587);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1588);
                match(IDENTIFIER);
                setState(1590);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(1589);
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
            setState(1601);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1592);
                    nonWildcardTypeArguments();
                    setState(1593);
                    createdName();
                    setState(1594);
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
                    setState(1596);
                    createdName();
                    setState(1599);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LBRACK:
                        {
                            setState(1597);
                            arrayCreatorRest();
                        }
                        break;
                        case LPAREN:
                        {
                            setState(1598);
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
            setState(1618);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1603);
                    match(IDENTIFIER);
                    setState(1605);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==LT) {
                        {
                            setState(1604);
                            typeArgumentsOrDiamond();
                        }
                    }

                    setState(1614);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==DOT) {
                        {
                            {
                                setState(1607);
                                match(DOT);
                                setState(1608);
                                match(IDENTIFIER);
                                setState(1610);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==LT) {
                                    {
                                        setState(1609);
                                        typeArgumentsOrDiamond();
                                    }
                                }

                            }
                        }
                        setState(1616);
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
                    setState(1617);
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
                setState(1620);
                match(IDENTIFIER);
                setState(1622);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(1621);
                        nonWildcardTypeArgumentsOrDiamond();
                    }
                }

                setState(1624);
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
                setState(1626);
                match(LBRACK);
                setState(1654);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RBRACK:
                    {
                        setState(1627);
                        match(RBRACK);
                        setState(1632);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la==LBRACK) {
                            {
                                {
                                    setState(1628);
                                    match(LBRACK);
                                    setState(1629);
                                    match(RBRACK);
                                }
                            }
                            setState(1634);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1635);
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
                        setState(1636);
                        expression(0);
                        setState(1637);
                        match(RBRACK);
                        setState(1644);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,222,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(1638);
                                        match(LBRACK);
                                        setState(1639);
                                        expression(0);
                                        setState(1640);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1646);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,222,_ctx);
                        }
                        setState(1651);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,223,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(1647);
                                        match(LBRACK);
                                        setState(1648);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1653);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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
                setState(1656);
                arguments();
                setState(1658);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
                    case 1:
                    {
                        setState(1657);
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
                setState(1660);
                nonWildcardTypeArguments();
                setState(1661);
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
            setState(1666);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1663);
                    match(LT);
                    setState(1664);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1665);
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
            setState(1671);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1668);
                    match(LT);
                    setState(1669);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1670);
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
                setState(1673);
                match(LT);
                setState(1674);
                typeList();
                setState(1675);
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
                setState(1677);
                typeType();
                setState(1682);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(1678);
                            match(COMMA);
                            setState(1679);
                            typeType();
                        }
                    }
                    setState(1684);
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
                setState(1686);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==AT) {
                    {
                        setState(1685);
                        annotation();
                    }
                }

                setState(1690);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case IDENTIFIER:
                    {
                        setState(1688);
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
                        setState(1689);
                        primitiveType();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(1696);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,231,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1692);
                                match(LBRACK);
                                setState(1693);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(1698);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
                setState(1699);
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
                setState(1701);
                match(LT);
                setState(1702);
                typeArgument();
                setState(1707);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(1703);
                            match(COMMA);
                            setState(1704);
                            typeArgument();
                        }
                    }
                    setState(1709);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1710);
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
            setState(1718);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LPAREN:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1712);
                    arguments();
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1713);
                    match(DOT);
                    setState(1714);
                    match(IDENTIFIER);
                    setState(1716);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
                        case 1:
                        {
                            setState(1715);
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
            setState(1724);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SUPER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1720);
                    match(SUPER);
                    setState(1721);
                    superSuffix();
                }
                break;
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1722);
                    match(IDENTIFIER);
                    setState(1723);
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
                setState(1726);
                match(LPAREN);
                setState(1728);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(1727);
                        expressionList();
                    }
                }

                setState(1730);
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
                return precpred(_ctx, 16);
            case 4:
                return precpred(_ctx, 15);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u06c7\4\2\t\2\4"+
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
                    "\4\3\4\3\4\3\5\7\5\u0113\n\5\f\5\16\5\u0116\13\5\3\5\3\5\3\5\3\5\3\6\3"+
                    "\6\5\6\u011e\n\6\3\6\3\6\3\6\5\6\u0123\n\6\3\6\3\6\3\7\7\7\u0128\n\7\f"+
                    "\7\16\7\u012b\13\7\3\7\3\7\3\7\3\7\5\7\u0131\n\7\3\7\5\7\u0134\n\7\3\b"+
                    "\3\b\3\b\3\b\3\b\5\b\u013b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0145"+
                    "\n\t\3\n\3\n\5\n\u0149\n\n\3\13\3\13\3\13\5\13\u014e\n\13\3\13\3\13\5"+
                    "\13\u0152\n\13\3\13\3\13\5\13\u0156\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f"+
                    "\u015e\n\f\f\f\16\f\u0161\13\f\3\f\3\f\3\r\7\r\u0166\n\r\f\r\16\r\u0169"+
                    "\13\r\3\r\3\r\3\r\5\r\u016e\n\r\3\16\3\16\3\16\7\16\u0173\n\16\f\16\16"+
                    "\16\u0176\13\16\3\17\3\17\3\17\3\17\5\17\u017c\n\17\3\17\3\17\5\17\u0180"+
                    "\n\17\3\17\5\17\u0183\n\17\3\17\5\17\u0186\n\17\3\17\3\17\3\20\3\20\3"+
                    "\20\7\20\u018d\n\20\f\20\16\20\u0190\13\20\3\21\7\21\u0193\n\21\f\21\16"+
                    "\21\u0196\13\21\3\21\3\21\5\21\u019a\n\21\3\21\5\21\u019d\n\21\3\22\3"+
                    "\22\7\22\u01a1\n\22\f\22\16\22\u01a4\13\22\3\23\3\23\3\23\5\23\u01a9\n"+
                    "\23\3\23\3\23\5\23\u01ad\n\23\3\23\3\23\3\24\3\24\7\24\u01b3\n\24\f\24"+
                    "\16\24\u01b6\13\24\3\24\3\24\3\25\3\25\7\25\u01bc\n\25\f\25\16\25\u01bf"+
                    "\13\25\3\25\3\25\3\26\3\26\5\26\u01c5\n\26\3\26\3\26\7\26\u01c9\n\26\f"+
                    "\26\16\26\u01cc\13\26\3\26\5\26\u01cf\n\26\3\27\3\27\3\27\3\27\3\27\3"+
                    "\27\3\27\3\27\3\27\5\27\u01da\n\27\3\30\3\30\3\30\3\30\3\30\7\30\u01e1"+
                    "\n\30\f\30\16\30\u01e4\13\30\3\30\3\30\5\30\u01e8\n\30\3\30\3\30\3\31"+
                    "\3\31\5\31\u01ee\n\31\3\32\3\32\5\32\u01f2\n\32\3\33\3\33\3\33\3\34\3"+
                    "\34\3\34\3\35\3\35\3\35\3\35\5\35\u01fe\n\35\3\35\3\35\3\36\3\36\3\36"+
                    "\3\36\3\37\7\37\u0207\n\37\f\37\16\37\u020a\13\37\3\37\3\37\5\37\u020e"+
                    "\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0217\n \3!\3!\3!\3!\7!\u021d\n!\f!\16!"+
                    "\u0220\13!\3!\3!\3\"\3\"\3\"\7\"\u0227\n\"\f\"\16\"\u022a\13\"\3\"\3\""+
                    "\3\"\3#\7#\u0230\n#\f#\16#\u0233\13#\3#\3#\3#\7#\u0238\n#\f#\16#\u023b"+
                    "\13#\3#\3#\5#\u023f\n#\3#\3#\3#\3#\7#\u0245\n#\f#\16#\u0248\13#\3#\3#"+
                    "\5#\u024c\n#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0256\n$\3%\3%\3%\3&\3&\3&\7&"+
                    "\u025e\n&\f&\16&\u0261\13&\3\'\3\'\3\'\5\'\u0266\n\'\3(\3(\3(\7(\u026b"+
                    "\n(\f(\16(\u026e\13(\3)\3)\5)\u0272\n)\3*\3*\3*\3*\7*\u0278\n*\f*\16*"+
                    "\u027b\13*\3*\5*\u027e\n*\5*\u0280\n*\3*\3*\3+\3+\5+\u0286\n+\3+\3+\3"+
                    "+\5+\u028b\n+\7+\u028d\n+\f+\16+\u0290\13+\3,\3,\3,\3,\5,\u0296\n,\5,"+
                    "\u0298\n,\3-\3-\3-\7-\u029d\n-\f-\16-\u02a0\13-\3.\3.\5.\u02a4\n.\3.\3"+
                    ".\3/\3/\3/\7/\u02ab\n/\f/\16/\u02ae\13/\3/\3/\5/\u02b2\n/\3/\5/\u02b5"+
                    "\n/\3\60\7\60\u02b8\n\60\f\60\16\60\u02bb\13\60\3\60\3\60\3\60\3\61\7"+
                    "\61\u02c1\n\61\f\61\16\61\u02c4\13\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
                    "\62\7\62\u02cd\n\62\f\62\16\62\u02d0\13\62\3\63\3\63\3\63\3\63\3\63\3"+
                    "\63\3\63\5\63\u02d9\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
                    "\5\66\u02e4\n\66\3\66\5\66\u02e7\n\66\3\67\3\67\3\67\7\67\u02ec\n\67\f"+
                    "\67\16\67\u02ef\13\67\38\38\38\38\39\39\39\59\u02f8\n9\3:\3:\3:\3:\7:"+
                    "\u02fe\n:\f:\16:\u0301\13:\5:\u0303\n:\3:\5:\u0306\n:\3:\3:\3;\3;\3;\3"+
                    ";\3;\3<\3<\7<\u0311\n<\f<\16<\u0314\13<\3<\3<\3=\7=\u0319\n=\f=\16=\u031c"+
                    "\13=\3=\3=\5=\u0320\n=\3>\3>\3>\3>\3>\3>\5>\u0328\n>\3>\3>\5>\u032c\n"+
                    ">\3>\3>\5>\u0330\n>\3>\3>\5>\u0334\n>\5>\u0336\n>\3?\3?\5?\u033a\n?\3"+
                    "@\3@\3@\3@\5@\u0340\n@\3A\3A\3B\3B\3B\3C\5C\u0348\nC\3C\3C\5C\u034c\n"+
                    "C\3C\3C\5C\u0350\nC\3C\5C\u0353\nC\3C\5C\u0356\nC\3C\3C\5C\u035a\nC\3"+
                    "C\3C\5C\u035e\nC\3C\5C\u0361\nC\5C\u0363\nC\3D\3D\5D\u0367\nD\3D\7D\u036a"+
                    "\nD\fD\16D\u036d\13D\3D\3D\5D\u0371\nD\3D\7D\u0374\nD\fD\16D\u0377\13"+
                    "D\3D\3D\5D\u037b\nD\3D\7D\u037e\nD\fD\16D\u0381\13D\3D\3D\5D\u0385\nD"+
                    "\3D\7D\u0388\nD\fD\16D\u038b\13D\3D\3D\5D\u038f\nD\3D\7D\u0392\nD\fD\16"+
                    "D\u0395\13D\3D\3D\5D\u0399\nD\3D\7D\u039c\nD\fD\16D\u039f\13D\3D\3D\5"+
                    "D\u03a3\nD\3D\7D\u03a6\nD\fD\16D\u03a9\13D\3D\3D\5D\u03ad\nD\3D\7D\u03b0"+
                    "\nD\fD\16D\u03b3\13D\3D\3D\5D\u03b7\nD\3D\7D\u03ba\nD\fD\16D\u03bd\13"+
                    "D\3D\3D\5D\u03c1\nD\3D\7D\u03c4\nD\fD\16D\u03c7\13D\3D\3D\5D\u03cb\nD"+
                    "\3D\7D\u03ce\nD\fD\16D\u03d1\13D\3D\3D\5D\u03d5\nD\3D\7D\u03d8\nD\fD\16"+
                    "D\u03db\13D\3D\3D\5D\u03df\nD\3D\7D\u03e2\nD\fD\16D\u03e5\13D\3D\3D\5"+
                    "D\u03e9\nD\3D\7D\u03ec\nD\fD\16D\u03ef\13D\3D\3D\5D\u03f3\nD\3D\7D\u03f6"+
                    "\nD\fD\16D\u03f9\13D\3D\3D\5D\u03fd\nD\3D\7D\u0400\nD\fD\16D\u0403\13"+
                    "D\3D\3D\5D\u0407\nD\3D\7D\u040a\nD\fD\16D\u040d\13D\3D\3D\5D\u0411\nD"+
                    "\3D\7D\u0414\nD\fD\16D\u0417\13D\3D\3D\5D\u041b\nD\3D\7D\u041e\nD\fD\16"+
                    "D\u0421\13D\3D\3D\5D\u0425\nD\3D\7D\u0428\nD\fD\16D\u042b\13D\3D\5D\u042e"+
                    "\nD\3E\3E\3E\3E\3E\3E\5E\u0436\nE\3F\7F\u0439\nF\fF\16F\u043c\13F\3F\3"+
                    "F\3F\3G\7G\u0442\nG\fG\16G\u0445\13G\3G\3G\5G\u0449\nG\3G\5G\u044c\nG"+
                    "\3H\3H\3H\3H\3H\5H\u0453\nH\3H\3H\3H\3H\3H\3H\7H\u045b\nH\fH\16H\u045e"+
                    "\13H\3H\3H\5H\u0462\nH\3H\3H\3H\3H\3H\5H\u0469\nH\3H\3H\3H\5H\u046e\n"+
                    "H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u047a\nH\fH\16H\u047d\13H\3H\7H\u0480"+
                    "\nH\fH\16H\u0483\13H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0493"+
                    "\nH\3H\3H\3H\3H\3H\5H\u049a\nH\3H\3H\5H\u049e\nH\3H\3H\3H\3H\3H\5H\u04a5"+
                    "\nH\3H\3H\3H\5H\u04aa\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\6H\u04b5\nH\rH\16"+
                    "H\u04b6\3H\5H\u04ba\nH\3H\5H\u04bd\nH\3H\3H\3H\3H\7H\u04c3\nH\fH\16H\u04c6"+
                    "\13H\3H\5H\u04c9\nH\3H\3H\3H\3H\7H\u04cf\nH\fH\16H\u04d2\13H\3H\7H\u04d5"+
                    "\nH\fH\16H\u04d8\13H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u04e2\nH\3H\3H\3H\3H\3"+
                    "H\3H\3H\5H\u04eb\nH\3H\3H\3H\5H\u04f0\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u04fa"+
                    "\nH\3I\3I\3I\7I\u04ff\nI\fI\16I\u0502\13I\3I\3I\3I\3I\3I\3J\3J\3J\7J\u050c"+
                    "\nJ\fJ\16J\u050f\13J\3K\3K\3K\3L\3L\3L\5L\u0517\nL\3L\3L\3M\3M\3M\7M\u051e"+
                    "\nM\fM\16M\u0521\13M\3N\7N\u0524\nN\fN\16N\u0527\13N\3N\3N\3N\3N\3N\3"+
                    "O\6O\u052f\nO\rO\16O\u0530\3O\6O\u0534\nO\rO\16O\u0535\3P\3P\3P\5P\u053b"+
                    "\nP\3P\3P\3P\5P\u0540\nP\3Q\3Q\5Q\u0544\nQ\3Q\3Q\5Q\u0548\nQ\3Q\3Q\5Q"+
                    "\u054c\nQ\5Q\u054e\nQ\3R\3R\5R\u0552\nR\3S\7S\u0555\nS\fS\16S\u0558\13"+
                    "S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\5T\u0566\nT\3U\3U\3U\3U\7U\u056c"+
                    "\nU\fU\16U\u056f\13U\3U\3U\3U\7U\u0574\nU\fU\16U\u0577\13U\5U\u0579\n"+
                    "U\3V\3V\3V\5V\u057e\nV\3V\3V\3V\3V\5V\u0584\nV\3V\3V\3V\3V\5V\u058a\n"+
                    "V\3V\5V\u058d\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
                    "W\3W\3W\3W\3W\3W\3W\5W\u05a7\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
                    "Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05bd\nY\3Y\3Y\5Y\u05c1\nY\3Y\3Y\3Y\5Y\u05c6"+
                    "\nY\3Y\3Y\5Y\u05ca\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
                    "\3Y\3Y\3Y\3Y\3Y\5Y\u05e1\nY\3Y\3Y\3Y\3Y\5Y\u05e7\nY\3Y\3Y\3Y\3Y\3Y\3Y"+
                    "\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05f6\nY\3Y\7Y\u05f9\nY\fY\16Y\u05fc\13Y\3Z\3"+
                    "Z\3Z\3Z\3[\3[\3[\5[\u0605\n[\3[\3[\3[\3[\3[\7[\u060c\n[\f[\16[\u060f\13"+
                    "[\3[\5[\u0612\n[\3\\\3\\\5\\\u0616\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
                    "]\3]\3]\3]\3]\3]\5]\u0628\n]\5]\u062a\n]\3^\3^\3^\5^\u062f\n^\3^\7^\u0632"+
                    "\n^\f^\16^\u0635\13^\3^\3^\5^\u0639\n^\3_\3_\3_\3_\3_\3_\3_\5_\u0642\n"+
                    "_\5_\u0644\n_\3`\3`\5`\u0648\n`\3`\3`\3`\5`\u064d\n`\7`\u064f\n`\f`\16"+
                    "`\u0652\13`\3`\5`\u0655\n`\3a\3a\5a\u0659\na\3a\3a\3b\3b\3b\3b\7b\u0661"+
                    "\nb\fb\16b\u0664\13b\3b\3b\3b\3b\3b\3b\3b\7b\u066d\nb\fb\16b\u0670\13"+
                    "b\3b\3b\7b\u0674\nb\fb\16b\u0677\13b\5b\u0679\nb\3c\3c\5c\u067d\nc\3d"+
                    "\3d\3d\3e\3e\3e\5e\u0685\ne\3f\3f\3f\5f\u068a\nf\3g\3g\3g\3g\3h\3h\3h"+
                    "\7h\u0693\nh\fh\16h\u0696\13h\3i\5i\u0699\ni\3i\3i\5i\u069d\ni\3i\3i\7"+
                    "i\u06a1\ni\fi\16i\u06a4\13i\3j\3j\3k\3k\3k\3k\7k\u06ac\nk\fk\16k\u06af"+
                    "\13k\3k\3k\3l\3l\3l\3l\5l\u06b7\nl\5l\u06b9\nl\3m\3m\3m\3m\5m\u06bf\n"+
                    "m\3n\3n\5n\u06c3\nn\3n\3n\3n\2\3\u00b0o\2\4\6\b\n\f\16\20\22\24\26\30"+
                    "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
                    "\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
                    "\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
                    "\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
                    "\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\2\n\4\2\23\23*"+
                    "*\3\2:=\3\2>?\5\2MMddgq\3\2Z]\3\2PQ\3\2Z[\n\2\5\5\7\7\n\n\20\20\26\26"+
                    "\35\35\37\37\'\'\2\u07d8\2\u00dc\3\2\2\2\4\u00fe\3\2\2\2\6\u0101\3\2\2"+
                    "\2\b\u0114\3\2\2\2\n\u011b\3\2\2\2\f\u0133\3\2\2\2\16\u013a\3\2\2\2\20"+
                    "\u0144\3\2\2\2\22\u0148\3\2\2\2\24\u014a\3\2\2\2\26\u0159\3\2\2\2\30\u0167"+
                    "\3\2\2\2\32\u016f\3\2\2\2\34\u0177\3\2\2\2\36\u0189\3\2\2\2 \u0194\3\2"+
                    "\2\2\"\u019e\3\2\2\2$\u01a5\3\2\2\2&\u01b0\3\2\2\2(\u01b9\3\2\2\2*\u01ce"+
                    "\3\2\2\2,\u01d9\3\2\2\2.\u01db\3\2\2\2\60\u01ed\3\2\2\2\62\u01f1\3\2\2"+
                    "\2\64\u01f3\3\2\2\2\66\u01f6\3\2\2\28\u01f9\3\2\2\2:\u0201\3\2\2\2<\u020d"+
                    "\3\2\2\2>\u0216\3\2\2\2@\u0218\3\2\2\2B\u0223\3\2\2\2D\u0231\3\2\2\2F"+
                    "\u0255\3\2\2\2H\u0257\3\2\2\2J\u025a\3\2\2\2L\u0262\3\2\2\2N\u0267\3\2"+
                    "\2\2P\u0271\3\2\2\2R\u0273\3\2\2\2T\u0283\3\2\2\2V\u0297\3\2\2\2X\u0299"+
                    "\3\2\2\2Z\u02a1\3\2\2\2\\\u02b4\3\2\2\2^\u02b9\3\2\2\2`\u02c2\3\2\2\2"+
                    "b\u02c9\3\2\2\2d\u02d8\3\2\2\2f\u02da\3\2\2\2h\u02dc\3\2\2\2j\u02de\3"+
                    "\2\2\2l\u02e8\3\2\2\2n\u02f0\3\2\2\2p\u02f7\3\2\2\2r\u02f9\3\2\2\2t\u0309"+
                    "\3\2\2\2v\u030e\3\2\2\2x\u031f\3\2\2\2z\u0335\3\2\2\2|\u0339\3\2\2\2~"+
                    "\u033b\3\2\2\2\u0080\u0341\3\2\2\2\u0082\u0343\3\2\2\2\u0084\u0362\3\2"+
                    "\2\2\u0086\u042d\3\2\2\2\u0088\u0435\3\2\2\2\u008a\u043a\3\2\2\2\u008c"+
                    "\u044b\3\2\2\2\u008e\u04f9\3\2\2\2\u0090\u04fb\3\2\2\2\u0092\u0508\3\2"+
                    "\2\2\u0094\u0510\3\2\2\2\u0096\u0513\3\2\2\2\u0098\u051a\3\2\2\2\u009a"+
                    "\u0525\3\2\2\2\u009c\u052e\3\2\2\2\u009e\u053f\3\2\2\2\u00a0\u054d\3\2"+
                    "\2\2\u00a2\u0551\3\2\2\2\u00a4\u0556\3\2\2\2\u00a6\u0565\3\2\2\2\u00a8"+
                    "\u0578\3\2\2\2\u00aa\u058c\3\2\2\2\u00ac\u05a6\3\2\2\2\u00ae\u05a8\3\2"+
                    "\2\2\u00b0\u05c9\3\2\2\2\u00b2\u05fd\3\2\2\2\u00b4\u0611\3\2\2\2\u00b6"+
                    "\u0615\3\2\2\2\u00b8\u0629\3\2\2\2\u00ba\u062e\3\2\2\2\u00bc\u0643\3\2"+
                    "\2\2\u00be\u0654\3\2\2\2\u00c0\u0656\3\2\2\2\u00c2\u065c\3\2\2\2\u00c4"+
                    "\u067a\3\2\2\2\u00c6\u067e\3\2\2\2\u00c8\u0684\3\2\2\2\u00ca\u0689\3\2"+
                    "\2\2\u00cc\u068b\3\2\2\2\u00ce\u068f\3\2\2\2\u00d0\u0698\3\2\2\2\u00d2"+
                    "\u06a5\3\2\2\2\u00d4\u06a7\3\2\2\2\u00d6\u06b8\3\2\2\2\u00d8\u06be\3\2"+
                    "\2\2\u00da\u06c0\3\2\2\2\u00dc\u00de\5\4\3\2\u00dd\u00df\78\2\2\u00de"+
                    "\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\7f"+
                    "\2\2\u00e1\u00e3\78\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
                    "\u00e4\3\2\2\2\u00e4\u00e6\5\4\3\2\u00e5\u00e7\78\2\2\u00e6\u00e5\3\2"+
                    "\2\2\u00e6\u00e7\3\2\2\2\u00e7\3\3\2\2\2\u00e8\u00ff\5\b\5\2\u00e9\u00ff"+
                    "\5\n\6\2\u00ea\u00ff\5\34\17\2\u00eb\u00ff\5 \21\2\u00ec\u00ff\5$\23\2"+
                    "\u00ed\u00ff\5,\27\2\u00ee\u00ff\5D#\2\u00ef\u00ff\5H%\2\u00f0\u00ff\5"+
                    "L\'\2\u00f1\u00ff\5d\63\2\u00f2\u00ff\5j\66\2\u00f3\u00ff\5n8\2\u00f4"+
                    "\u00ff\5t;\2\u00f5\u00ff\5\u0088E\2\u00f6\u00ff\5\u0084C\2\u00f7\u00ff"+
                    "\5\u0086D\2\u00f8\u00ff\5\u00b0Y\2\u00f9\u00ff\5\u00a6T\2\u00fa\u00ff"+
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
                    "\3\2\2\2\u0117\u0118\7\"\2\2\u0118\u0119\5b\62\2\u0119\u011a\7J\2\2\u011a"+
                    "\t\3\2\2\2\u011b\u011d\7\33\2\2\u011c\u011e\7(\2\2\u011d\u011c\3\2\2\2"+
                    "\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\5b\62\2\u0120\u0121"+
                    "\7L\2\2\u0121\u0123\7^\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
                    "\u0124\3\2\2\2\u0124\u0125\7J\2\2\u0125\13\3\2\2\2\u0126\u0128\5\20\t"+
                    "\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a"+
                    "\3\2\2\2\u012a\u0130\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0131\5\24\13\2"+
                    "\u012d\u0131\5\34\17\2\u012e\u0131\5$\23\2\u012f\u0131\5t;\2\u0130\u012c"+
                    "\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
                    "\u0134\3\2\2\2\u0132\u0134\7J\2\2\u0133\u0129\3\2\2\2\u0133\u0132\3\2"+
                    "\2\2\u0134\r\3\2\2\2\u0135\u013b\5\20\t\2\u0136\u013b\7 \2\2\u0137\u013b"+
                    "\7,\2\2\u0138\u013b\7\60\2\2\u0139\u013b\7\63\2\2\u013a\u0135\3\2\2\2"+
                    "\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139"+
                    "\3\2\2\2\u013b\17\3\2\2\2\u013c\u0145\5j\66\2\u013d\u0145\7%\2\2\u013e"+
                    "\u0145\7$\2\2\u013f\u0145\7#\2\2\u0140\u0145\7(\2\2\u0141\u0145\7\3\2"+
                    "\2\u0142\u0145\7\24\2\2\u0143\u0145\7)\2\2\u0144\u013c\3\2\2\2\u0144\u013d"+
                    "\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144"+
                    "\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\21\3\2\2"+
                    "\2\u0146\u0149\7\24\2\2\u0147\u0149\5j\66\2\u0148\u0146\3\2\2\2\u0148"+
                    "\u0147\3\2\2\2\u0149\23\3\2\2\2\u014a\u014b\7\13\2\2\u014b\u014d\7y\2"+
                    "\2\u014c\u014e\5\26\f\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
                    "\u0151\3\2\2\2\u014f\u0150\7\23\2\2\u0150\u0152\5\u00d0i\2\u0151\u014f"+
                    "\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\7\32\2\2"+
                    "\u0154\u0156\5\u00ceh\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
                    "\u0157\3\2\2\2\u0157\u0158\5&\24\2\u0158\25\3\2\2\2\u0159\u015a\7O\2\2"+
                    "\u015a\u015f\5\30\r\2\u015b\u015c\7K\2\2\u015c\u015e\5\30\r\2\u015d\u015b"+
                    "\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
                    "\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7N\2\2\u0163\27\3\2\2\2"+
                    "\u0164\u0166\5j\66\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165"+
                    "\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
                    "\u016d\7y\2\2\u016b\u016c\7\23\2\2\u016c\u016e\5\32\16\2\u016d\u016b\3"+
                    "\2\2\2\u016d\u016e\3\2\2\2\u016e\31\3\2\2\2\u016f\u0174\5\u00d0i\2\u0170"+
                    "\u0171\7`\2\2\u0171\u0173\5\u00d0i\2\u0172\u0170\3\2\2\2\u0173\u0176\3"+
                    "\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\33\3\2\2\2\u0176"+
                    "\u0174\3\2\2\2\u0177\u0178\7\22\2\2\u0178\u017b\7y\2\2\u0179\u017a\7\32"+
                    "\2\2\u017a\u017c\5\u00ceh\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
                    "\u017d\3\2\2\2\u017d\u017f\7F\2\2\u017e\u0180\5\36\20\2\u017f\u017e\3"+
                    "\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\7K\2\2\u0182"+
                    "\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\5\""+
                    "\22\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
                    "\u0188\7G\2\2\u0188\35\3\2\2\2\u0189\u018e\5 \21\2\u018a\u018b\7K\2\2"+
                    "\u018b\u018d\5 \21\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c"+
                    "\3\2\2\2\u018e\u018f\3\2\2\2\u018f\37\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
                    "\u0193\5j\66\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2"+
                    "\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
                    "\u0199\7y\2\2\u0198\u019a\5\u00dan\2\u0199\u0198\3\2\2\2\u0199\u019a\3"+
                    "\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\5&\24\2\u019c\u019b\3\2\2\2\u019c"+
                    "\u019d\3\2\2\2\u019d!\3\2\2\2\u019e\u01a2\7J\2\2\u019f\u01a1\5*\26\2\u01a0"+
                    "\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
                    "\2\2\u01a3#\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7\36\2\2\u01a6\u01a8"+
                    "\7y\2\2\u01a7\u01a9\5\26\f\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
                    "\u01ac\3\2\2\2\u01aa\u01ab\7\23\2\2\u01ab\u01ad\5\u00ceh\2\u01ac\u01aa"+
                    "\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5(\25\2\u01af"+
                    "%\3\2\2\2\u01b0\u01b4\7F\2\2\u01b1\u01b3\5*\26\2\u01b2\u01b1\3\2\2\2\u01b3"+
                    "\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
                    "\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7G\2\2\u01b8\'\3\2\2\2\u01b9\u01bd"+
                    "\7F\2\2\u01ba\u01bc\5<\37\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
                    "\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2"+
                    "\2\2\u01c0\u01c1\7G\2\2\u01c1)\3\2\2\2\u01c2\u01cf\7J\2\2\u01c3\u01c5"+
                    "\7(\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
                    "\u01cf\5\u0084C\2\u01c7\u01c9\5\16\b\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc"+
                    "\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
                    "\u01ca\3\2\2\2\u01cd\u01cf\5,\27\2\u01ce\u01c2\3\2\2\2\u01ce\u01c4\3\2"+
                    "\2\2\u01ce\u01ca\3\2\2\2\u01cf+\3\2\2\2\u01d0\u01da\5.\30\2\u01d1\u01da"+
                    "\5\64\33\2\u01d2\u01da\5:\36\2\u01d3\u01da\58\35\2\u01d4\u01da\5\66\34"+
                    "\2\u01d5\u01da\5$\23\2\u01d6\u01da\5t;\2\u01d7\u01da\5\24\13\2\u01d8\u01da"+
                    "\5\34\17\2\u01d9\u01d0\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01d2\3\2\2\2"+
                    "\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6"+
                    "\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da-\3\2\2\2\u01db"+
                    "\u01dc\5\62\32\2\u01dc\u01dd\7y\2\2\u01dd\u01e2\5Z.\2\u01de\u01df\7H\2"+
                    "\2\u01df\u01e1\7I\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
                    "\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e7\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
                    "\u01e6\7/\2\2\u01e6\u01e8\5X-\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2"+
                    "\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5\60\31\2\u01ea/\3\2\2\2\u01eb\u01ee"+
                    "\5\u0084C\2\u01ec\u01ee\7J\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2"+
                    "\u01ee\61\3\2\2\2\u01ef\u01f2\5\u00d0i\2\u01f0\u01f2\7\62\2\2\u01f1\u01ef"+
                    "\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\63\3\2\2\2\u01f3\u01f4\5\26\f\2\u01f4"+
                    "\u01f5\5.\30\2\u01f5\65\3\2\2\2\u01f6\u01f7\5\26\f\2\u01f7\u01f8\58\35"+
                    "\2\u01f8\67\3\2\2\2\u01f9\u01fa\7y\2\2\u01fa\u01fd\5Z.\2\u01fb\u01fc\7"+
                    "/\2\2\u01fc\u01fe\5X-\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
                    "\u01ff\3\2\2\2\u01ff\u0200\5\u0084C\2\u02009\3\2\2\2\u0201\u0202\5\u00d0"+
                    "i\2\u0202\u0203\5J&\2\u0203\u0204\7J\2\2\u0204;\3\2\2\2\u0205\u0207\5"+
                    "\16\b\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
                    "\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020e\5>"+
                    " \2\u020c\u020e\7J\2\2\u020d\u0208\3\2\2\2\u020d\u020c\3\2\2\2\u020e="+
                    "\3\2\2\2\u020f\u0217\5@!\2\u0210\u0217\5D#\2\u0211\u0217\5H%\2\u0212\u0217"+
                    "\5$\23\2\u0213\u0217\5t;\2\u0214\u0217\5\24\13\2\u0215\u0217\5\34\17\2"+
                    "\u0216\u020f\3\2\2\2\u0216\u0210\3\2\2\2\u0216\u0211\3\2\2\2\u0216\u0212"+
                    "\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
                    "?\3\2\2\2\u0218\u0219\5\u00d0i\2\u0219\u021e\5B\"\2\u021a\u021b\7K\2\2"+
                    "\u021b\u021d\5B\"\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c"+
                    "\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221"+
                    "\u0222\7J\2\2\u0222A\3\2\2\2\u0223\u0228\7y\2\2\u0224\u0225\7H\2\2\u0225"+
                    "\u0227\7I\2\2\u0226\u0224\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2"+
                    "\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
                    "\u022c\7M\2\2\u022c\u022d\5P)\2\u022dC\3\2\2\2\u022e\u0230\5F$\2\u022f"+
                    "\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
                    "\2\2\u0232\u023e\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u023f\5\62\32\2\u0235"+
                    "\u0239\5\26\f\2\u0236\u0238\5j\66\2\u0237\u0236\3\2\2\2\u0238\u023b\3"+
                    "\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b"+
                    "\u0239\3\2\2\2\u023c\u023d\5\62\32\2\u023d\u023f\3\2\2\2\u023e\u0234\3"+
                    "\2\2\2\u023e\u0235\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7y\2\2\u0241"+
                    "\u0246\5Z.\2\u0242\u0243\7H\2\2\u0243\u0245\7I\2\2\u0244\u0242\3\2\2\2"+
                    "\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024b"+
                    "\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7/\2\2\u024a\u024c\5X-\2\u024b"+
                    "\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5\60"+
                    "\31\2\u024eE\3\2\2\2\u024f\u0256\5j\66\2\u0250\u0256\7%\2\2\u0251\u0256"+
                    "\7\3\2\2\u0252\u0256\7\16\2\2\u0253\u0256\7(\2\2\u0254\u0256\7)\2\2\u0255"+
                    "\u024f\3\2\2\2\u0255\u0250\3\2\2\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2"+
                    "\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256G\3\2\2\2\u0257\u0258"+
                    "\5\26\f\2\u0258\u0259\5D#\2\u0259I\3\2\2\2\u025a\u025f\5L\'\2\u025b\u025c"+
                    "\7K\2\2\u025c\u025e\5L\'\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
                    "\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260K\3\2\2\2\u0261\u025f\3\2\2\2"+
                    "\u0262\u0265\5N(\2\u0263\u0264\7M\2\2\u0264\u0266\5P)\2\u0265\u0263\3"+
                    "\2\2\2\u0265\u0266\3\2\2\2\u0266M\3\2\2\2\u0267\u026c\7y\2\2\u0268\u0269"+
                    "\7H\2\2\u0269\u026b\7I\2\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c"+
                    "\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026dO\3\2\2\2\u026e\u026c\3\2\2\2"+
                    "\u026f\u0272\5R*\2\u0270\u0272\5\u00b0Y\2\u0271\u026f\3\2\2\2\u0271\u0270"+
                    "\3\2\2\2\u0272Q\3\2\2\2\u0273\u027f\7F\2\2\u0274\u0279\5P)\2\u0275\u0276"+
                    "\7K\2\2\u0276\u0278\5P)\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
                    "\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2"+
                    "\2\2\u027c\u027e\7K\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
                    "\u0280\3\2\2\2\u027f\u0274\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2"+
                    "\2\2\u0281\u0282\7G\2\2\u0282S\3\2\2\2\u0283\u0285\7y\2\2\u0284\u0286"+
                    "\5\u00d4k\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028e\3\2\2"+
                    "\2\u0287\u0288\7L\2\2\u0288\u028a\7y\2\2\u0289\u028b\5\u00d4k\2\u028a"+
                    "\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u0287\3\2"+
                    "\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
                    "U\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0298\5\u00d0i\2\u0292\u0295\7R\2"+
                    "\2\u0293\u0294\t\2\2\2\u0294\u0296\5\u00d0i\2\u0295\u0293\3\2\2\2\u0295"+
                    "\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0291\3\2\2\2\u0297\u0292\3\2"+
                    "\2\2\u0298W\3\2\2\2\u0299\u029e\5b\62\2\u029a\u029b\7K\2\2\u029b\u029d"+
                    "\5b\62\2\u029c\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
                    "\u029f\3\2\2\2\u029fY\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\7D\2\2\u02a2"+
                    "\u02a4\5\\/\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2"+
                    "\2\2\u02a5\u02a6\7E\2\2\u02a6[\3\2\2\2\u02a7\u02ac\5^\60\2\u02a8\u02a9"+
                    "\7K\2\2\u02a9\u02ab\5^\60\2\u02aa\u02a8\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac"+
                    "\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b1\3\2\2\2\u02ae\u02ac\3\2"+
                    "\2\2\u02af\u02b0\7K\2\2\u02b0\u02b2\5`\61\2\u02b1\u02af\3\2\2\2\u02b1"+
                    "\u02b2\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b5\5`\61\2\u02b4\u02a7\3\2"+
                    "\2\2\u02b4\u02b3\3\2\2\2\u02b5]\3\2\2\2\u02b6\u02b8\5\22\n\2\u02b7\u02b6"+
                    "\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
                    "\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\5\u00d0i\2\u02bd\u02be"+
                    "\5N(\2\u02be_\3\2\2\2\u02bf\u02c1\5\22\n\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4"+
                    "\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4"+
                    "\u02c2\3\2\2\2\u02c5\u02c6\5\u00d0i\2\u02c6\u02c7\7u\2\2\u02c7\u02c8\5"+
                    "N(\2\u02c8a\3\2\2\2\u02c9\u02ce\7y\2\2\u02ca\u02cb\7L\2\2\u02cb\u02cd"+
                    "\7y\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce"+
                    "\u02cf\3\2\2\2\u02cfc\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d9\5f\64\2"+
                    "\u02d2\u02d9\5h\65\2\u02d3\u02d9\7A\2\2\u02d4\u02d9\7B\2\2\u02d5\u02d9"+
                    "\7@\2\2\u02d6\u02d9\7C\2\2\u02d7\u02d9\79\2\2\u02d8\u02d1\3\2\2\2\u02d8"+
                    "\u02d2\3\2\2\2\u02d8\u02d3\3\2\2\2\u02d8\u02d4\3\2\2\2\u02d8\u02d5\3\2"+
                    "\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9e\3\2\2\2\u02da\u02db"+
                    "\t\3\2\2\u02dbg\3\2\2\2\u02dc\u02dd\t\4\2\2\u02ddi\3\2\2\2\u02de\u02df"+
                    "\7t\2\2\u02df\u02e6\5b\62\2\u02e0\u02e3\7D\2\2\u02e1\u02e4\5l\67\2\u02e2"+
                    "\u02e4\5p9\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2"+
                    "\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\7E\2\2\u02e6\u02e0\3\2\2\2\u02e6\u02e7"+
                    "\3\2\2\2\u02e7k\3\2\2\2\u02e8\u02ed\5n8\2\u02e9\u02ea\7K\2\2\u02ea\u02ec"+
                    "\5n8\2\u02eb\u02e9\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed"+
                    "\u02ee\3\2\2\2\u02eem\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7y\2\2\u02f1"+
                    "\u02f2\7M\2\2\u02f2\u02f3\5p9\2\u02f3o\3\2\2\2\u02f4\u02f8\5\u00b0Y\2"+
                    "\u02f5\u02f8\5j\66\2\u02f6\u02f8\5r:\2\u02f7\u02f4\3\2\2\2\u02f7\u02f5"+
                    "\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8q\3\2\2\2\u02f9\u0302\7F\2\2\u02fa\u02ff"+
                    "\5p9\2\u02fb\u02fc\7K\2\2\u02fc\u02fe\5p9\2\u02fd\u02fb\3\2\2\2\u02fe"+
                    "\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0303\3\2"+
                    "\2\2\u0301\u02ff\3\2\2\2\u0302\u02fa\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
                    "\u0305\3\2\2\2\u0304\u0306\7K\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2"+
                    "\2\2\u0306\u0307\3\2\2\2\u0307\u0308\7G\2\2\u0308s\3\2\2\2\u0309\u030a"+
                    "\7t\2\2\u030a\u030b\7\36\2\2\u030b\u030c\7y\2\2\u030c\u030d\5v<\2\u030d"+
                    "u\3\2\2\2\u030e\u0312\7F\2\2\u030f\u0311\5x=\2\u0310\u030f\3\2\2\2\u0311"+
                    "\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2"+
                    "\2\2\u0314\u0312\3\2\2\2\u0315\u0316\7G\2\2\u0316w\3\2\2\2\u0317\u0319"+
                    "\5\16\b\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2"+
                    "\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0320"+
                    "\5z>\2\u031e\u0320\7J\2\2\u031f\u031a\3\2\2\2\u031f\u031e\3\2\2\2\u0320"+
                    "y\3\2\2\2\u0321\u0322\5\u00d0i\2\u0322\u0323\5|?\2\u0323\u0324\7J\2\2"+
                    "\u0324\u0336\3\2\2\2\u0325\u0327\5\24\13\2\u0326\u0328\7J\2\2\u0327\u0326"+
                    "\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0336\3\2\2\2\u0329\u032b\5$\23\2\u032a"+
                    "\u032c\7J\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0336\3\2"+
                    "\2\2\u032d\u032f\5\34\17\2\u032e\u0330\7J\2\2\u032f\u032e\3\2\2\2\u032f"+
                    "\u0330\3\2\2\2\u0330\u0336\3\2\2\2\u0331\u0333\5t;\2\u0332\u0334\7J\2"+
                    "\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0321"+
                    "\3\2\2\2\u0335\u0325\3\2\2\2\u0335\u0329\3\2\2\2\u0335\u032d\3\2\2\2\u0335"+
                    "\u0331\3\2\2\2\u0336{\3\2\2\2\u0337\u033a\5~@\2\u0338\u033a\5\u0080A\2"+
                    "\u0339\u0337\3\2\2\2\u0339\u0338\3\2\2\2\u033a}\3\2\2\2\u033b\u033c\7"+
                    "y\2\2\u033c\u033d\7D\2\2\u033d\u033f\7E\2\2\u033e\u0340\5\u0082B\2\u033f"+
                    "\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\177\3\2\2\2\u0341\u0342\5J&\2"+
                    "\u0342\u0081\3\2\2\2\u0343\u0344\7\16\2\2\u0344\u0345\5p9\2\u0345\u0083"+
                    "\3\2\2\2\u0346\u0348\78\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
                    "\u0349\3\2\2\2\u0349\u034b\7F\2\2\u034a\u034c\78\2\2\u034b\u034a\3\2\2"+
                    "\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\5\u0086D\2\u034e"+
                    "\u0350\78\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2"+
                    "\2\2\u0351\u0353\7G\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
                    "\u0363\3\2\2\2\u0354\u0356\78\2\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2"+
                    "\2\2\u0356\u0357\3\2\2\2\u0357\u0359\7F\2\2\u0358\u035a\78\2\2\u0359\u0358"+
                    "\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\7\67\2\2"+
                    "\u035c\u035e\78\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360"+
                    "\3\2\2\2\u035f\u0361\7G\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
                    "\u0363\3\2\2\2\u0362\u0347\3\2\2\2\u0362\u0355\3\2\2\2\u0363\u0085\3\2"+
                    "\2\2\u0364\u0366\5\b\5\2\u0365\u0367\78\2\2\u0366\u0365\3\2\2\2\u0366"+
                    "\u0367\3\2\2\2\u0367\u036b\3\2\2\2\u0368\u036a\5\b\5\2\u0369\u0368\3\2"+
                    "\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
                    "\u042e\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0370\5\n\6\2\u036f\u0371\78"+
                    "\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0375\3\2\2\2\u0372"+
                    "\u0374\5\n\6\2\u0373\u0372\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2"+
                    "\2\2\u0375\u0376\3\2\2\2\u0376\u042e\3\2\2\2\u0377\u0375\3\2\2\2\u0378"+
                    "\u037a\5\34\17\2\u0379\u037b\78\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3"+
                    "\2\2\2\u037b\u037f\3\2\2\2\u037c\u037e\5\34\17\2\u037d\u037c\3\2\2\2\u037e"+
                    "\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u042e\3\2"+
                    "\2\2\u0381\u037f\3\2\2\2\u0382\u0384\5 \21\2\u0383\u0385\78\2\2\u0384"+
                    "\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0389\3\2\2\2\u0386\u0388\5 "+
                    "\21\2\u0387\u0386\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389"+
                    "\u038a\3\2\2\2\u038a\u042e\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038e\5$"+
                    "\23\2\u038d\u038f\78\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
                    "\u0393\3\2\2\2\u0390\u0392\5$\23\2\u0391\u0390\3\2\2\2\u0392\u0395\3\2"+
                    "\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u042e\3\2\2\2\u0395"+
                    "\u0393\3\2\2\2\u0396\u0398\5,\27\2\u0397\u0399\78\2\2\u0398\u0397\3\2"+
                    "\2\2\u0398\u0399\3\2\2\2\u0399\u039d\3\2\2\2\u039a\u039c\5,\27\2\u039b"+
                    "\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2"+
                    "\2\2\u039e\u042e\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a2\5D#\2\u03a1\u03a3"+
                    "\78\2\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a7\3\2\2\2\u03a4"+
                    "\u03a6\5D#\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2"+
                    "\2\u03a7\u03a8\3\2\2\2\u03a8\u042e\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ac"+
                    "\5H%\2\u03ab\u03ad\78\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
                    "\u03b1\3\2\2\2\u03ae\u03b0\5H%\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2"+
                    "\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u042e\3\2\2\2\u03b3\u03b1"+
                    "\3\2\2\2\u03b4\u03b6\5L\'\2\u03b5\u03b7\78\2\2\u03b6\u03b5\3\2\2\2\u03b6"+
                    "\u03b7\3\2\2\2\u03b7\u03bb\3\2\2\2\u03b8\u03ba\5L\'\2\u03b9\u03b8\3\2"+
                    "\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
                    "\u042e\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03c0\5d\63\2\u03bf\u03c1\78"+
                    "\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c5\3\2\2\2\u03c2"+
                    "\u03c4\5d\63\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2"+
                    "\2\2\u03c5\u03c6\3\2\2\2\u03c6\u042e\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8"+
                    "\u03ca\5j\66\2\u03c9\u03cb\78\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2"+
                    "\2\2\u03cb\u03cf\3\2\2\2\u03cc\u03ce\5j\66\2\u03cd\u03cc\3\2\2\2\u03ce"+
                    "\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u042e\3\2"+
                    "\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d4\5n8\2\u03d3\u03d5\78\2\2\u03d4\u03d3"+
                    "\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d9\3\2\2\2\u03d6\u03d8\5n8\2\u03d7"+
                    "\u03d6\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2"+
                    "\2\2\u03da\u042e\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03de\5t;\2\u03dd\u03df"+
                    "\78\2\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e3\3\2\2\2\u03e0"+
                    "\u03e2\5t;\2\u03e1\u03e0\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2"+
                    "\2\u03e3\u03e4\3\2\2\2\u03e4\u042e\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e8"+
                    "\5\u0088E\2\u03e7\u03e9\78\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2"+
                    "\u03e9\u03ed\3\2\2\2\u03ea\u03ec\5\u0088E\2\u03eb\u03ea\3\2\2\2\u03ec"+
                    "\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u042e\3\2"+
                    "\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f2\5\u0084C\2\u03f1\u03f3\78\2\2\u03f2"+
                    "\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f7\3\2\2\2\u03f4\u03f6\5\u0084"+
                    "C\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7"+
                    "\u03f8\3\2\2\2\u03f8\u042e\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fc\5\u00b0"+
                    "Y\2\u03fb\u03fd\78\2\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0401"+
                    "\3\2\2\2\u03fe\u0400\5\u00b0Y\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2"+
                    "\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u042e\3\2\2\2\u0403\u0401"+
                    "\3\2\2\2\u0404\u0406\5\u00a6T\2\u0405\u0407\78\2\2\u0406\u0405\3\2\2\2"+
                    "\u0406\u0407\3\2\2\2\u0407\u040b\3\2\2\2\u0408\u040a\5\u00a6T\2\u0409"+
                    "\u0408\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
                    "\2\2\u040c\u042e\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0410\5\u00a8U\2\u040f"+
                    "\u0411\78\2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0415\3\2"+
                    "\2\2\u0412\u0414\5\u00a8U\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2\2\2\u0415"+
                    "\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u042e\3\2\2\2\u0417\u0415\3\2"+
                    "\2\2\u0418\u041a\5\u00aaV\2\u0419\u041b\78\2\2\u041a\u0419\3\2\2\2\u041a"+
                    "\u041b\3\2\2\2\u041b\u041f\3\2\2\2\u041c\u041e\5\u00aaV\2\u041d\u041c"+
                    "\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
                    "\u042e\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\7\67\2\2\u0423\u0425\7"+
                    "8\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0429\3\2\2\2\u0426"+
                    "\u0428\5\u0086D\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427"+
                    "\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042e\3\2\2\2\u042b\u0429\3\2\2\2\u042c"+
                    "\u042e\7\66\2\2\u042d\u0364\3\2\2\2\u042d\u036e\3\2\2\2\u042d\u0378\3"+
                    "\2\2\2\u042d\u0382\3\2\2\2\u042d\u038c\3\2\2\2\u042d\u0396\3\2\2\2\u042d"+
                    "\u03a0\3\2\2\2\u042d\u03aa\3\2\2\2\u042d\u03b4\3\2\2\2\u042d\u03be\3\2"+
                    "\2\2\u042d\u03c8\3\2\2\2\u042d\u03d2\3\2\2\2\u042d\u03dc\3\2\2\2\u042d"+
                    "\u03e6\3\2\2\2\u042d\u03f0\3\2\2\2\u042d\u03fa\3\2\2\2\u042d\u0404\3\2"+
                    "\2\2\u042d\u040e\3\2\2\2\u042d\u0418\3\2\2\2\u042d\u0422\3\2\2\2\u042d"+
                    "\u042c\3\2\2\2\u042e\u0087\3\2\2\2\u042f\u0430\5\u008aF\2\u0430\u0431"+
                    "\7J\2\2\u0431\u0436\3\2\2\2\u0432\u0436\5\u008eH\2\u0433\u0436\5\u008c"+
                    "G\2\u0434\u0436\7\67\2\2\u0435\u042f\3\2\2\2\u0435\u0432\3\2\2\2\u0435"+
                    "\u0433\3\2\2\2\u0435\u0434\3\2\2\2\u0436\u0089\3\2\2\2\u0437\u0439\5\22"+
                    "\n\2\u0438\u0437\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a"+
                    "\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\5\u00d0"+
                    "i\2\u043e\u043f\5J&\2\u043f\u008b\3\2\2\2\u0440\u0442\5\20\t\2\u0441\u0440"+
                    "\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
                    "\u0448\3\2\2\2\u0445\u0443\3\2\2\2\u0446\u0449\5\24\13\2\u0447\u0449\5"+
                    "$\23\2\u0448\u0446\3\2\2\2\u0448\u0447\3\2\2\2\u0449\u044c\3\2\2\2\u044a"+
                    "\u044c\7J\2\2\u044b\u0443\3\2\2\2\u044b\u044a\3\2\2\2\u044c\u008d\3\2"+
                    "\2\2\u044d\u04fa\5\u0084C\2\u044e\u044f\7\4\2\2\u044f\u0452\7\65\2\2\u0450"+
                    "\u0451\7S\2\2\u0451\u0453\7\65\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2"+
                    "\2\2\u0453\u0454\3\2\2\2\u0454\u04fa\7J\2\2\u0455\u0456\7\27\2\2\u0456"+
                    "\u0457\7D\2\2\u0457\u045c\7\65\2\2\u0458\u0459\7K\2\2\u0459\u045b\7\65"+
                    "\2\2\u045a\u0458\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c"+
                    "\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u0461\7E"+
                    "\2\2\u0460\u0462\5\u008eH\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
                    "\u04fa\3\2\2\2\u0463\u0464\7\27\2\2\u0464\u0465\7D\2\2\u0465\u0466\7\67"+
                    "\2\2\u0466\u0468\7E\2\2\u0467\u0469\5\u008eH\2\u0468\u0467\3\2\2\2\u0468"+
                    "\u0469\3\2\2\2\u0469\u04fa\3\2\2\2\u046a\u046b\7\64\2\2\u046b\u046d\7"+
                    "\65\2\2\u046c\u046e\5\u008eH\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2"+
                    "\u046e\u04fa\3\2\2\2\u046f\u0470\7\17\2\2\u0470\u0471\5\u008eH\2\u0471"+
                    "\u0472\7\64\2\2\u0472\u0473\7\65\2\2\u0473\u0474\7J\2\2\u0474\u04fa\3"+
                    "\2\2\2\u0475\u0476\7+\2\2\u0476\u0477\7\65\2\2\u0477\u047b\7F\2\2\u0478"+
                    "\u047a\5\u009cO\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u0479"+
                    "\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0481\3\2\2\2\u047d\u047b\3\2\2\2\u047e"+
                    "\u0480\5\u009eP\2\u047f\u047e\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f"+
                    "\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u0481\3\2\2\2\u0484"+
                    "\u04fa\7G\2\2\u0485\u0486\7,\2\2\u0486\u0487\7\65\2\2\u0487\u04fa\5\u0084"+
                    "C\2\u0488\u0489\7&\2\2\u0489\u048a\7\65\2\2\u048a\u04fa\7J\2\2\u048b\u048c"+
                    "\7.\2\2\u048c\u048d\7\65\2\2\u048d\u04fa\7J\2\2\u048e\u048f\7\4\2\2\u048f"+
                    "\u0492\5\u00b0Y\2\u0490\u0491\7S\2\2\u0491\u0493\5\u00b0Y\2\u0492\u0490"+
                    "\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\7J\2\2\u0495"+
                    "\u04fa\3\2\2\2\u0496\u0497\7\30\2\2\u0497\u0499\5\u00a6T\2\u0498\u049a"+
                    "\5\u008eH\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049d\3\2\2"+
                    "\2\u049b\u049c\7\21\2\2\u049c\u049e\5\u008eH\2\u049d\u049b\3\2\2\2\u049d"+
                    "\u049e\3\2\2\2\u049e\u04fa\3\2\2\2\u049f\u04a0\7\27\2\2\u04a0\u04a1\7"+
                    "D\2\2\u04a1\u04a2\5\u00a0Q\2\u04a2\u04a4\7E\2\2\u04a3\u04a5\5\u008eH\2"+
                    "\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04fa\3\2\2\2\u04a6\u04a7"+
                    "\7\64\2\2\u04a7\u04a9\5\u00a6T\2\u04a8\u04aa\5\u008eH\2\u04a9\u04a8\3"+
                    "\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04fa\3\2\2\2\u04ab\u04ac\7\17\2\2\u04ac"+
                    "\u04ad\5\u008eH\2\u04ad\u04ae\7\64\2\2\u04ae\u04af\5\u00a6T\2\u04af\u04b0"+
                    "\7J\2\2\u04b0\u04fa\3\2\2\2\u04b1\u04b2\7\61\2\2\u04b2\u04bc\5\u0084C"+
                    "\2\u04b3\u04b5\5\u0090I\2\u04b4\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6"+
                    "\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\3\2\2\2\u04b8\u04ba\5\u0094"+
                    "K\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb"+
                    "\u04bd\5\u0094K\2\u04bc\u04b4\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u04fa"+
                    "\3\2\2\2\u04be\u04bf\7\61\2\2\u04bf\u04c0\5\u0096L\2\u04c0\u04c4\5\u0084"+
                    "C\2\u04c1\u04c3\5\u0090I\2\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4"+
                    "\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2"+
                    "\2\2\u04c7\u04c9\5\u0094K\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
                    "\u04fa\3\2\2\2\u04ca\u04cb\7+\2\2\u04cb\u04cc\5\u00a6T\2\u04cc\u04d0\7"+
                    "F\2\2\u04cd\u04cf\5\u009cO\2\u04ce\u04cd\3\2\2\2\u04cf\u04d2\3\2\2\2\u04d0"+
                    "\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d6\3\2\2\2\u04d2\u04d0\3\2"+
                    "\2\2\u04d3\u04d5\5\u009eP\2\u04d4\u04d3\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6"+
                    "\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04d6\3\2"+
                    "\2\2\u04d9\u04da\7G\2\2\u04da\u04fa\3\2\2\2\u04db\u04dc\7,\2\2\u04dc\u04dd"+
                    "\5\u00a6T\2\u04dd\u04de\5\u0084C\2\u04de\u04fa\3\2\2\2\u04df\u04e1\7&"+
                    "\2\2\u04e0\u04e2\5\u00b0Y\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
                    "\u04e3\3\2\2\2\u04e3\u04fa\7J\2\2\u04e4\u04e5\7.\2\2\u04e5\u04e6\5\u00b0"+
                    "Y\2\u04e6\u04e7\7J\2\2\u04e7\u04fa\3\2\2\2\u04e8\u04ea\7\6\2\2\u04e9\u04eb"+
                    "\7y\2\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
                    "\u04fa\7J\2\2\u04ed\u04ef\7\r\2\2\u04ee\u04f0\7y\2\2\u04ef\u04ee\3\2\2"+
                    "\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04fa\7J\2\2\u04f2\u04fa"+
                    "\7J\2\2\u04f3\u04f4\5\u00b0Y\2\u04f4\u04f5\7J\2\2\u04f5\u04fa\3\2\2\2"+
                    "\u04f6\u04f7\7y\2\2\u04f7\u04f8\7S\2\2\u04f8\u04fa\5\u008eH\2\u04f9\u044d"+
                    "\3\2\2\2\u04f9\u044e\3\2\2\2\u04f9\u0455\3\2\2\2\u04f9\u0463\3\2\2\2\u04f9"+
                    "\u046a\3\2\2\2\u04f9\u046f\3\2\2\2\u04f9\u0475\3\2\2\2\u04f9\u0485\3\2"+
                    "\2\2\u04f9\u0488\3\2\2\2\u04f9\u048b\3\2\2\2\u04f9\u048e\3\2\2\2\u04f9"+
                    "\u0496\3\2\2\2\u04f9\u049f\3\2\2\2\u04f9\u04a6\3\2\2\2\u04f9\u04ab\3\2"+
                    "\2\2\u04f9\u04b1\3\2\2\2\u04f9\u04be\3\2\2\2\u04f9\u04ca\3\2\2\2\u04f9"+
                    "\u04db\3\2\2\2\u04f9\u04df\3\2\2\2\u04f9\u04e4\3\2\2\2\u04f9\u04e8\3\2"+
                    "\2\2\u04f9\u04ed\3\2\2\2\u04f9\u04f2\3\2\2\2\u04f9\u04f3\3\2\2\2\u04f9"+
                    "\u04f6\3\2\2\2\u04fa\u008f\3\2\2\2\u04fb\u04fc\7\t\2\2\u04fc\u0500\7D"+
                    "\2\2\u04fd\u04ff\5\22\n\2\u04fe\u04fd\3\2\2\2\u04ff\u0502\3\2\2\2\u0500"+
                    "\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u0500\3\2"+
                    "\2\2\u0503\u0504\5\u0092J\2\u0504\u0505\7y\2\2\u0505\u0506\7E\2\2\u0506"+
                    "\u0507\5\u0084C\2\u0507\u0091\3\2\2\2\u0508\u050d\5b\62\2\u0509\u050a"+
                    "\7a\2\2\u050a\u050c\5b\62\2\u050b\u0509\3\2\2\2\u050c\u050f\3\2\2\2\u050d"+
                    "\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0093\3\2\2\2\u050f\u050d\3\2"+
                    "\2\2\u0510\u0511\7\25\2\2\u0511\u0512\5\u0084C\2\u0512\u0095\3\2\2\2\u0513"+
                    "\u0514\7D\2\2\u0514\u0516\5\u0098M\2\u0515\u0517\7J\2\2\u0516\u0515\3"+
                    "\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\7E\2\2\u0519"+
                    "\u0097\3\2\2\2\u051a\u051f\5\u009aN\2\u051b\u051c\7J\2\2\u051c\u051e\5"+
                    "\u009aN\2\u051d\u051b\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2"+
                    "\u051f\u0520\3\2\2\2\u0520\u0099\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0524"+
                    "\5\22\n\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3\2\2\2"+
                    "\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u0529"+
                    "\5T+\2\u0529\u052a\5N(\2\u052a\u052b\7M\2\2\u052b\u052c\5\u00b0Y\2\u052c"+
                    "\u009b\3\2\2\2\u052d\u052f\5\u009eP\2\u052e\u052d\3\2\2\2\u052f\u0530"+
                    "\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532"+
                    "\u0534\5\u0088E\2\u0533\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0533"+
                    "\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u009d\3\2\2\2\u0537\u053a\7\b\2\2\u0538"+
                    "\u053b\5\u00b0Y\2\u0539\u053b\7y\2\2\u053a\u0538\3\2\2\2\u053a\u0539\3"+
                    "\2\2\2\u053b\u053c\3\2\2\2\u053c\u0540\7S\2\2\u053d\u053e\7\16\2\2\u053e"+
                    "\u0540\7S\2\2\u053f\u0537\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u009f\3\2"+
                    "\2\2\u0541\u054e\5\u00a4S\2\u0542\u0544\5\u00a2R\2\u0543\u0542\3\2\2\2"+
                    "\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\7J\2\2\u0546\u0548"+
                    "\5\u00b0Y\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2"+
                    "\2\u0549\u054b\7J\2\2\u054a\u054c\5\u00a8U\2\u054b\u054a\3\2\2\2\u054b"+
                    "\u054c\3\2\2\2\u054c\u054e\3\2\2\2\u054d\u0541\3\2\2\2\u054d\u0543\3\2"+
                    "\2\2\u054e\u00a1\3\2\2\2\u054f\u0552\5\u008aF\2\u0550\u0552\5\u00a8U\2"+
                    "\u0551\u054f\3\2\2\2\u0551\u0550\3\2\2\2\u0552\u00a3\3\2\2\2\u0553\u0555"+
                    "\5\22\n\2\u0554\u0553\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2\2"+
                    "\u0556\u0557\3\2\2\2\u0557\u0559\3\2\2\2\u0558\u0556\3\2\2\2\u0559\u055a"+
                    "\5\u00d0i\2\u055a\u055b\5N(\2\u055b\u055c\7S\2\2\u055c\u055d\5\u00b0Y"+
                    "\2\u055d\u00a5\3\2\2\2\u055e\u055f\7D\2\2\u055f\u0560\7\65\2\2\u0560\u0566"+
                    "\7E\2\2\u0561\u0562\7D\2\2\u0562\u0563\5\u00b0Y\2\u0563\u0564\7E\2\2\u0564"+
                    "\u0566\3\2\2\2\u0565\u055e\3\2\2\2\u0565\u0561\3\2\2\2\u0566\u00a7\3\2"+
                    "\2\2\u0567\u0579\7\67\2\2\u0568\u056d\7\65\2\2\u0569\u056a\7K\2\2\u056a"+
                    "\u056c\7\65\2\2\u056b\u0569\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b\3"+
                    "\2\2\2\u056d\u056e\3\2\2\2\u056e\u0579\3\2\2\2\u056f\u056d\3\2\2\2\u0570"+
                    "\u0575\5\u00b0Y\2\u0571\u0572\7K\2\2\u0572\u0574\5\u00b0Y\2\u0573\u0571"+
                    "\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576"+
                    "\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u0567\3\2\2\2\u0578\u0568\3\2"+
                    "\2\2\u0578\u0570\3\2\2\2\u0579\u00a9\3\2\2\2\u057a\u057b\7y\2\2\u057b"+
                    "\u057d\7D\2\2\u057c\u057e\5\u00a8U\2\u057d\u057c\3\2\2\2\u057d\u057e\3"+
                    "\2\2\2\u057e\u057f\3\2\2\2\u057f\u058d\7E\2\2\u0580\u0581\7-\2\2\u0581"+
                    "\u0583\7D\2\2\u0582\u0584\5\u00a8U\2\u0583\u0582\3\2\2\2\u0583\u0584\3"+
                    "\2\2\2\u0584\u0585\3\2\2\2\u0585\u058d\7E\2\2\u0586\u0587\7*\2\2\u0587"+
                    "\u0589\7D\2\2\u0588\u058a\5\u00a8U\2\u0589\u0588\3\2\2\2\u0589\u058a\3"+
                    "\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\7E\2\2\u058c\u057a\3\2\2\2\u058c"+
                    "\u0580\3\2\2\2\u058c\u0586\3\2\2\2\u058d\u00ab\3\2\2\2\u058e\u05a7\7^"+
                    "\2\2\u058f\u05a7\7_\2\2\u0590\u05a7\7c\2\2\u0591\u05a7\7\\\2\2\u0592\u05a7"+
                    "\7]\2\2\u0593\u0594\7O\2\2\u0594\u05a7\7O\2\2\u0595\u0596\7N\2\2\u0596"+
                    "\u0597\7N\2\2\u0597\u05a7\7N\2\2\u0598\u0599\7N\2\2\u0599\u05a7\7N\2\2"+
                    "\u059a\u05a7\7U\2\2\u059b\u05a7\7V\2\2\u059c\u05a7\7N\2\2\u059d\u05a7"+
                    "\7O\2\2\u059e\u05a7\7T\2\2\u059f\u05a7\7W\2\2\u05a0\u05a7\7`\2\2\u05a1"+
                    "\u05a7\7b\2\2\u05a2\u05a7\7a\2\2\u05a3\u05a7\7X\2\2\u05a4\u05a7\7Y\2\2"+
                    "\u05a5\u05a7\7e\2\2\u05a6\u058e\3\2\2\2\u05a6\u058f\3\2\2\2\u05a6\u0590"+
                    "\3\2\2\2\u05a6\u0591\3\2\2\2\u05a6\u0592\3\2\2\2\u05a6\u0593\3\2\2\2\u05a6"+
                    "\u0595\3\2\2\2\u05a6\u0598\3\2\2\2\u05a6\u059a\3\2\2\2\u05a6\u059b\3\2"+
                    "\2\2\u05a6\u059c\3\2\2\2\u05a6\u059d\3\2\2\2\u05a6\u059e\3\2\2\2\u05a6"+
                    "\u059f\3\2\2\2\u05a6\u05a0\3\2\2\2\u05a6\u05a1\3\2\2\2\u05a6\u05a2\3\2"+
                    "\2\2\u05a6\u05a3\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7"+
                    "\u00ad\3\2\2\2\u05a8\u05a9\t\5\2\2\u05a9\u00af\3\2\2\2\u05aa\u05ab\bY"+
                    "\1\2\u05ab\u05ca\5\u00b8]\2\u05ac\u05ca\5\u00aaV\2\u05ad\u05ae\7!\2\2"+
                    "\u05ae\u05ca\5\u00bc_\2\u05af\u05b0\7D\2\2\u05b0\u05b1\5\u00d0i\2\u05b1"+
                    "\u05b2\7E\2\2\u05b2\u05b3\5\u00b0Y\16\u05b3\u05ca\3\2\2\2\u05b4\u05b5"+
                    "\t\6\2\2\u05b5\u05ca\5\u00b0Y\f\u05b6\u05b7\t\7\2\2\u05b7\u05ca\5\u00b0"+
                    "Y\13\u05b8\u05ca\5\u00b2Z\2\u05b9\u05ba\5\u00d0i\2\u05ba\u05c0\7s\2\2"+
                    "\u05bb\u05bd\5\u00d4k\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
                    "\u05be\3\2\2\2\u05be\u05c1\7y\2\2\u05bf\u05c1\7!\2\2\u05c0\u05bc\3\2\2"+
                    "\2\u05c0\u05bf\3\2\2\2\u05c1\u05ca\3\2\2\2\u05c2\u05c3\5\u00ba^\2\u05c3"+
                    "\u05c5\7s\2\2\u05c4\u05c6\5\u00d4k\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3"+
                    "\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\7!\2\2\u05c8\u05ca\3\2\2\2\u05c9"+
                    "\u05aa\3\2\2\2\u05c9\u05ac\3\2\2\2\u05c9\u05ad\3\2\2\2\u05c9\u05af\3\2"+
                    "\2\2\u05c9\u05b4\3\2\2\2\u05c9\u05b6\3\2\2\2\u05c9\u05b8\3\2\2\2\u05c9"+
                    "\u05b9\3\2\2\2\u05c9\u05c2\3\2\2\2\u05ca\u05fa\3\2\2\2\u05cb\u05cc\f\n"+
                    "\2\2\u05cc\u05cd\5\u00acW\2\u05cd\u05ce\5\u00b0Y\13\u05ce\u05f9\3\2\2"+
                    "\2\u05cf\u05d0\f\b\2\2\u05d0\u05d1\7R\2\2\u05d1\u05d2\5\u00b0Y\2\u05d2"+
                    "\u05d3\7S\2\2\u05d3\u05d4\5\u00b0Y\b\u05d4\u05f9\3\2\2\2\u05d5\u05d6\f"+
                    "\7\2\2\u05d6\u05d7\5\u00aeX\2\u05d7\u05d8\5\u00b0Y\7\u05d8\u05f9\3\2\2"+
                    "\2\u05d9\u05da\f\22\2\2\u05da\u05e6\7L\2\2\u05db\u05e7\7y\2\2\u05dc\u05e7"+
                    "\5\u00aaV\2\u05dd\u05e7\7-\2\2\u05de\u05e0\7!\2\2\u05df\u05e1\5\u00cc"+
                    "g\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
                    "\u05e7\5\u00c0a\2\u05e3\u05e4\7*\2\2\u05e4\u05e7\5\u00d6l\2\u05e5\u05e7"+
                    "\5\u00c6d\2\u05e6\u05db\3\2\2\2\u05e6\u05dc\3\2\2\2\u05e6\u05dd\3\2\2"+
                    "\2\u05e6\u05de\3\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e5\3\2\2\2\u05e7\u05f9"+
                    "\3\2\2\2\u05e8\u05e9\f\21\2\2\u05e9\u05ea\7H\2\2\u05ea\u05eb\5\u00b0Y"+
                    "\2\u05eb\u05ec\7I\2\2\u05ec\u05f9\3\2\2\2\u05ed\u05ee\f\r\2\2\u05ee\u05f9"+
                    "\t\b\2\2\u05ef\u05f0\f\t\2\2\u05f0\u05f1\7\34\2\2\u05f1\u05f9\5\u00d0"+
                    "i\2\u05f2\u05f3\f\5\2\2\u05f3\u05f5\7s\2\2\u05f4\u05f6\5\u00d4k\2\u05f5"+
                    "\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\7y"+
                    "\2\2\u05f8\u05cb\3\2\2\2\u05f8\u05cf\3\2\2\2\u05f8\u05d5\3\2\2\2\u05f8"+
                    "\u05d9\3\2\2\2\u05f8\u05e8\3\2\2\2\u05f8\u05ed\3\2\2\2\u05f8\u05ef\3\2"+
                    "\2\2\u05f8\u05f2\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa"+
                    "\u05fb\3\2\2\2\u05fb\u00b1\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05fe\5\u00b4"+
                    "[\2\u05fe\u05ff\7r\2\2\u05ff\u0600\5\u00b6\\\2\u0600\u00b3\3\2\2\2\u0601"+
                    "\u0612\7y\2\2\u0602\u0604\7D\2\2\u0603\u0605\5\\/\2\u0604\u0603\3\2\2"+
                    "\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0612\7E\2\2\u0607\u0608"+
                    "\7D\2\2\u0608\u060d\7y\2\2\u0609\u060a\7K\2\2\u060a\u060c\7y\2\2\u060b"+
                    "\u0609\3\2\2\2\u060c\u060f\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060e\3\2"+
                    "\2\2\u060e\u0610\3\2\2\2\u060f\u060d\3\2\2\2\u0610\u0612\7E\2\2\u0611"+
                    "\u0601\3\2\2\2\u0611\u0602\3\2\2\2\u0611\u0607\3\2\2\2\u0612\u00b5\3\2"+
                    "\2\2\u0613\u0616\5\u00b0Y\2\u0614\u0616\5\u0084C\2\u0615\u0613\3\2\2\2"+
                    "\u0615\u0614\3\2\2\2\u0616\u00b7\3\2\2\2\u0617\u0618\7D\2\2\u0618\u0619"+
                    "\5\u00b0Y\2\u0619\u061a\7E\2\2\u061a\u062a\3\2\2\2\u061b\u062a\7-\2\2"+
                    "\u061c\u062a\7*\2\2\u061d\u062a\5d\63\2\u061e\u062a\7y\2\2\u061f\u0620"+
                    "\5\62\32\2\u0620\u0621\7L\2\2\u0621\u0622\7\13\2\2\u0622\u062a\3\2\2\2"+
                    "\u0623\u0627\5\u00ccg\2\u0624\u0628\5\u00d8m\2\u0625\u0626\7-\2\2\u0626"+
                    "\u0628\5\u00dan\2\u0627\u0624\3\2\2\2\u0627\u0625\3\2\2\2\u0628\u062a"+
                    "\3\2\2\2\u0629\u0617\3\2\2\2\u0629\u061b\3\2\2\2\u0629\u061c\3\2\2\2\u0629"+
                    "\u061d\3\2\2\2\u0629\u061e\3\2\2\2\u0629\u061f\3\2\2\2\u0629\u0623\3\2"+
                    "\2\2\u062a\u00b9\3\2\2\2\u062b\u062c\5T+\2\u062c\u062d\7L\2\2\u062d\u062f"+
                    "\3\2\2\2\u062e\u062b\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0633\3\2\2\2\u0630"+
                    "\u0632\5j\66\2\u0631\u0630\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631\3\2"+
                    "\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0633\3\2\2\2\u0636"+
                    "\u0638\7y\2\2\u0637\u0639\5\u00d4k\2\u0638\u0637\3\2\2\2\u0638\u0639\3"+
                    "\2\2\2\u0639\u00bb\3\2\2\2\u063a\u063b\5\u00ccg\2\u063b\u063c\5\u00be"+
                    "`\2\u063c\u063d\5\u00c4c\2\u063d\u0644\3\2\2\2\u063e\u0641\5\u00be`\2"+
                    "\u063f\u0642\5\u00c2b\2\u0640\u0642\5\u00c4c\2\u0641\u063f\3\2\2\2\u0641"+
                    "\u0640\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u063a\3\2\2\2\u0643\u063e\3\2"+
                    "\2\2\u0644\u00bd\3\2\2\2\u0645\u0647\7y\2\2\u0646\u0648\5\u00c8e\2\u0647"+
                    "\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0650\3\2\2\2\u0649\u064a\7L"+
                    "\2\2\u064a\u064c\7y\2\2\u064b\u064d\5\u00c8e\2\u064c\u064b\3\2\2\2\u064c"+
                    "\u064d\3\2\2\2\u064d\u064f\3\2\2\2\u064e\u0649\3\2\2\2\u064f\u0652\3\2"+
                    "\2\2\u0650\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0655\3\2\2\2\u0652"+
                    "\u0650\3\2\2\2\u0653\u0655\5\u00d2j\2\u0654\u0645\3\2\2\2\u0654\u0653"+
                    "\3\2\2\2\u0655\u00bf\3\2\2\2\u0656\u0658\7y\2\2\u0657\u0659\5\u00caf\2"+
                    "\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b"+
                    "\5\u00c4c\2\u065b\u00c1\3\2\2\2\u065c\u0678\7H\2\2\u065d\u0662\7I\2\2"+
                    "\u065e\u065f\7H\2\2\u065f\u0661\7I\2\2\u0660\u065e\3\2\2\2\u0661\u0664"+
                    "\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0665\3\2\2\2\u0664"+
                    "\u0662\3\2\2\2\u0665\u0679\5R*\2\u0666\u0667\5\u00b0Y\2\u0667\u066e\7"+
                    "I\2\2\u0668\u0669\7H\2\2\u0669\u066a\5\u00b0Y\2\u066a\u066b\7I\2\2\u066b"+
                    "\u066d\3\2\2\2\u066c\u0668\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c\3\2"+
                    "\2\2\u066e\u066f\3\2\2\2\u066f\u0675\3\2\2\2\u0670\u066e\3\2\2\2\u0671"+
                    "\u0672\7H\2\2\u0672\u0674\7I\2\2\u0673\u0671\3\2\2\2\u0674\u0677\3\2\2"+
                    "\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675"+
                    "\3\2\2\2\u0678\u065d\3\2\2\2\u0678\u0666\3\2\2\2\u0679\u00c3\3\2\2\2\u067a"+
                    "\u067c\5\u00dan\2\u067b\u067d\5&\24\2\u067c\u067b\3\2\2\2\u067c\u067d"+
                    "\3\2\2\2\u067d\u00c5\3\2\2\2\u067e\u067f\5\u00ccg\2\u067f\u0680\5\u00d8"+
                    "m\2\u0680\u00c7\3\2\2\2\u0681\u0682\7O\2\2\u0682\u0685\7N\2\2\u0683\u0685"+
                    "\5\u00d4k\2\u0684\u0681\3\2\2\2\u0684\u0683\3\2\2\2\u0685\u00c9\3\2\2"+
                    "\2\u0686\u0687\7O\2\2\u0687\u068a\7N\2\2\u0688\u068a\5\u00ccg\2\u0689"+
                    "\u0686\3\2\2\2\u0689\u0688\3\2\2\2\u068a\u00cb\3\2\2\2\u068b\u068c\7O"+
                    "\2\2\u068c\u068d\5\u00ceh\2\u068d\u068e\7N\2\2\u068e\u00cd\3\2\2\2\u068f"+
                    "\u0694\5\u00d0i\2\u0690\u0691\7K\2\2\u0691\u0693\5\u00d0i\2\u0692\u0690"+
                    "\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695"+
                    "\u00cf\3\2\2\2\u0696\u0694\3\2\2\2\u0697\u0699\5j\66\2\u0698\u0697\3\2"+
                    "\2\2\u0698\u0699\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u069d\5T+\2\u069b\u069d"+
                    "\5\u00d2j\2\u069c\u069a\3\2\2\2\u069c\u069b\3\2\2\2\u069d\u06a2\3\2\2"+
                    "\2\u069e\u069f\7H\2\2\u069f\u06a1\7I\2\2\u06a0\u069e\3\2\2\2\u06a1\u06a4"+
                    "\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u00d1\3\2\2\2\u06a4"+
                    "\u06a2\3\2\2\2\u06a5\u06a6\t\t\2\2\u06a6\u00d3\3\2\2\2\u06a7\u06a8\7O"+
                    "\2\2\u06a8\u06ad\5V,\2\u06a9\u06aa\7K\2\2\u06aa\u06ac\5V,\2\u06ab\u06a9"+
                    "\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
                    "\u06b0\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b1\7N\2\2\u06b1\u00d5\3\2"+
                    "\2\2\u06b2\u06b9\5\u00dan\2\u06b3\u06b4\7L\2\2\u06b4\u06b6\7y\2\2\u06b5"+
                    "\u06b7\5\u00dan\2\u06b6\u06b5\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9"+
                    "\3\2\2\2\u06b8\u06b2\3\2\2\2\u06b8\u06b3\3\2\2\2\u06b9\u00d7\3\2\2\2\u06ba"+
                    "\u06bb\7*\2\2\u06bb\u06bf\5\u00d6l\2\u06bc\u06bd\7y\2\2\u06bd\u06bf\5"+
                    "\u00dan\2\u06be\u06ba\3\2\2\2\u06be\u06bc\3\2\2\2\u06bf\u00d9\3\2\2\2"+
                    "\u06c0\u06c2\7D\2\2\u06c1\u06c3\5\u00a8U\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3"+
                    "\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\7E\2\2\u06c5\u00db\3\2\2\2\u00ef"+
                    "\u00de\u00e2\u00e6\u00fe\u0101\u0106\u010c\u0114\u011d\u0122\u0129\u0130"+
                    "\u0133\u013a\u0144\u0148\u014d\u0151\u0155\u015f\u0167\u016d\u0174\u017b"+
                    "\u017f\u0182\u0185\u018e\u0194\u0199\u019c\u01a2\u01a8\u01ac\u01b4\u01bd"+
                    "\u01c4\u01ca\u01ce\u01d9\u01e2\u01e7\u01ed\u01f1\u01fd\u0208\u020d\u0216"+
                    "\u021e\u0228\u0231\u0239\u023e\u0246\u024b\u0255\u025f\u0265\u026c\u0271"+
                    "\u0279\u027d\u027f\u0285\u028a\u028e\u0295\u0297\u029e\u02a3\u02ac\u02b1"+
                    "\u02b4\u02b9\u02c2\u02ce\u02d8\u02e3\u02e6\u02ed\u02f7\u02ff\u0302\u0305"+
                    "\u0312\u031a\u031f\u0327\u032b\u032f\u0333\u0335\u0339\u033f\u0347\u034b"+
                    "\u034f\u0352\u0355\u0359\u035d\u0360\u0362\u0366\u036b\u0370\u0375\u037a"+
                    "\u037f\u0384\u0389\u038e\u0393\u0398\u039d\u03a2\u03a7\u03ac\u03b1\u03b6"+
                    "\u03bb\u03c0\u03c5\u03ca\u03cf\u03d4\u03d9\u03de\u03e3\u03e8\u03ed\u03f2"+
                    "\u03f7\u03fc\u0401\u0406\u040b\u0410\u0415\u041a\u041f\u0424\u0429\u042d"+
                    "\u0435\u043a\u0443\u0448\u044b\u0452\u045c\u0461\u0468\u046d\u047b\u0481"+
                    "\u0492\u0499\u049d\u04a4\u04a9\u04b6\u04b9\u04bc\u04c4\u04c8\u04d0\u04d6"+
                    "\u04e1\u04ea\u04ef\u04f9\u0500\u050d\u0516\u051f\u0525\u0530\u0535\u053a"+
                    "\u053f\u0543\u0547\u054b\u054d\u0551\u0556\u0565\u056d\u0575\u0578\u057d"+
                    "\u0583\u0589\u058c\u05a6\u05bc\u05c0\u05c5\u05c9\u05e0\u05e6\u05f5\u05f8"+
                    "\u05fa\u0604\u060d\u0611\u0615\u0627\u0629\u062e\u0633\u0638\u0641\u0643"+
                    "\u0647\u064c\u0650\u0654\u0658\u0662\u066e\u0675\u0678\u067c\u0684\u0689"+
                    "\u0694\u0698\u069c\u06a2\u06ad\u06b6\u06b8\u06be\u06c2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}