package grammar;

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
            MOD=97, OP=98, ADD_ASSIGN=99, SUB_ASSIGN=100, MUL_ASSIGN=101, DIV_ASSIGN=102,
            AND_ASSIGN=103, OR_ASSIGN=104, XOR_ASSIGN=105, MOD_ASSIGN=106, LSHIFT_ASSIGN=107,
            RSHIFT_ASSIGN=108, URSHIFT_ASSIGN=109, ARROW=110, COLONCOLON=111, AT=112,
            ELLIPSIS=113, WS=114, COMMENT=115, LINE_COMMENT=116, IDENTIFIER=117;
    public static final int
            RULE_program = 0, RULE_compilationUnit = 1, RULE_packageDeclaration = 2,
            RULE_importDeclaration = 3, RULE_typeDeclaration = 4, RULE_modifier = 5,
            RULE_classOrInterfaceModifier = 6, RULE_variableModifier = 7, RULE_classDeclaration = 8,
            RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeBound = 11,
            RULE_enumDeclaration = 12, RULE_enumConstants = 13, RULE_enumConstant = 14,
            RULE_enumBodyDeclarations = 15, RULE_interfaceDeclaration = 16, RULE_classBody = 17,
            RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20,
            RULE_methodDeclaration = 21, RULE_methodBody = 22, RULE_typeTypeOrVoid = 23,
            RULE_genericMethodDeclaration = 24, RULE_genericConstructorDeclaration = 25,
            RULE_constructorDeclaration = 26, RULE_fieldDeclaration = 27, RULE_interfaceBodyDeclaration = 28,
            RULE_interfaceMemberDeclaration = 29, RULE_constDeclaration = 30, RULE_constantDeclarator = 31,
            RULE_interfaceMethodDeclaration = 32, RULE_interfaceMethodModifier = 33,
            RULE_genericInterfaceMethodDeclaration = 34, RULE_variableDeclarators = 35,
            RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, RULE_variableInitializer = 38,
            RULE_arrayInitializer = 39, RULE_classOrInterfaceType = 40, RULE_typeArgument = 41,
            RULE_qualifiedNameList = 42, RULE_formalParameters = 43, RULE_formalParameterList = 44,
            RULE_formalParameter = 45, RULE_lastFormalParameter = 46, RULE_qualifiedName = 47,
            RULE_literal = 48, RULE_integerLiteral = 49, RULE_floatLiteral = 50, RULE_annotation = 51,
            RULE_elementValuePairs = 52, RULE_elementValuePair = 53, RULE_elementValue = 54,
            RULE_elementValueArrayInitializer = 55, RULE_annotationTypeDeclaration = 56,
            RULE_annotationTypeBody = 57, RULE_annotationTypeElementDeclaration = 58,
            RULE_annotationTypeElementRest = 59, RULE_annotationMethodOrConstantRest = 60,
            RULE_annotationMethodRest = 61, RULE_annotationConstantRest = 62, RULE_defaultValue = 63,
            RULE_block = 64, RULE_blockStatement = 65, RULE_localVariableDeclaration = 66,
            RULE_localTypeDeclaration = 67, RULE_statement = 68, RULE_catchClause = 69,
            RULE_catchType = 70, RULE_finallyBlock = 71, RULE_resourceSpecification = 72,
            RULE_resources = 73, RULE_resource = 74, RULE_switchBlockStatementGroup = 75,
            RULE_switchLabel = 76, RULE_forControl = 77, RULE_forInit = 78, RULE_enhancedForControl = 79,
            RULE_parExpression = 80, RULE_expressionList = 81, RULE_methodCall = 82,
            RULE_expression = 83, RULE_lambdaExpression = 84, RULE_lambdaParameters = 85,
            RULE_lambdaBody = 86, RULE_primary = 87, RULE_classType = 88, RULE_creator = 89,
            RULE_createdName = 90, RULE_innerCreator = 91, RULE_arrayCreatorRest = 92,
            RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94, RULE_typeArgumentsOrDiamond = 95,
            RULE_nonWildcardTypeArgumentsOrDiamond = 96, RULE_nonWildcardTypeArguments = 97,
            RULE_typeList = 98, RULE_typeType = 99, RULE_primitiveType = 100, RULE_typeArguments = 101,
            RULE_superSuffix = 102, RULE_explicitGenericInvocationSuffix = 103, RULE_arguments = 104;
    public static final String[] ruleNames = {
            "program", "compilationUnit", "packageDeclaration", "importDeclaration",
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
            "defaultValue", "block", "blockStatement", "localVariableDeclaration",
            "localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock",
            "resourceSpecification", "resources", "resource", "switchBlockStatementGroup",
            "switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression",
            "expressionList", "methodCall", "expression", "lambdaExpression", "lambdaParameters",
            "lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator",
            "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", "typeArgumentsOrDiamond",
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
            "'&'", "'|'", "'^'", "'%'", null, "'+='", "'-='", "'*='", "'/='", "'&='",
            "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'",
            "'...'"
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
            "MOD", "OP", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN",
            "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN",
            "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT",
            "LINE_COMMENT", "IDENTIFIER"
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
        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }
        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class,i);
        }
        public List<TerminalNode> NEWLINE() { return getTokens(JavaParser.NEWLINE); }
        public TerminalNode NEWLINE(int i) {
            return getToken(JavaParser.NEWLINE, i);
        }
        public TerminalNode EMPTY() { return getToken(JavaParser.EMPTY, 0); }
        public List<ImportDeclarationContext> importDeclaration() {
            return getRuleContexts(ImportDeclarationContext.class);
        }
        public ImportDeclarationContext importDeclaration(int i) {
            return getRuleContext(ImportDeclarationContext.class,i);
        }
        public List<ClassBodyDeclarationContext> classBodyDeclaration() {
            return getRuleContexts(ClassBodyDeclarationContext.class);
        }
        public ClassBodyDeclarationContext classBodyDeclaration(int i) {
            return getRuleContext(ClassBodyDeclarationContext.class,i);
        }
        public List<TypeDeclarationContext> typeDeclaration() {
            return getRuleContexts(TypeDeclarationContext.class);
        }
        public TypeDeclarationContext typeDeclaration(int i) {
            return getRuleContext(TypeDeclarationContext.class,i);
        }
        public List<AnnotationContext> annotation() {
            return getRuleContexts(AnnotationContext.class);
        }
        public AnnotationContext annotation(int i) {
            return getRuleContext(AnnotationContext.class,i);
        }
        public List<PackageDeclarationContext> packageDeclaration() {
            return getRuleContexts(PackageDeclarationContext.class);
        }
        public PackageDeclarationContext packageDeclaration(int i) {
            return getRuleContext(PackageDeclarationContext.class,i);
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
            int _alt;
            setState(397);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(210);
                    blockStatement();
                    setState(215);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,0,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(211);
                                    match(NEWLINE);
                                    setState(212);
                                    blockStatement();
                                }
                            }
                        }
                        setState(217);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,0,_ctx);
                    }
                    setState(219);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(218);
                            match(NEWLINE);
                        }
                    }

                    setState(221);
                    match(ARROW);
                    setState(223);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
                        case 1:
                        {
                            setState(222);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(225);
                    blockStatement();
                    setState(230);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(226);
                                    match(NEWLINE);
                                    setState(227);
                                    blockStatement();
                                }
                            }
                        }
                        setState(232);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
                    }
                    setState(234);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(233);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(236);
                    blockStatement();
                    setState(241);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(237);
                                    match(NEWLINE);
                                    setState(238);
                                    blockStatement();
                                }
                            }
                        }
                        setState(243);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
                    }
                    setState(245);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(244);
                            match(NEWLINE);
                        }
                    }

                    setState(247);
                    match(ARROW);
                    setState(249);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(248);
                            match(NEWLINE);
                        }
                    }

                    setState(251);
                    match(EMPTY);
                    setState(253);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(252);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(255);
                    match(EMPTY);
                    setState(257);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(256);
                            match(NEWLINE);
                        }
                    }

                    setState(259);
                    match(ARROW);
                    setState(261);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                        case 1:
                        {
                            setState(260);
                            match(NEWLINE);
                        }
                        break;
                    }
                    setState(263);
                    blockStatement();
                    setState(268);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(264);
                                    match(NEWLINE);
                                    setState(265);
                                    blockStatement();
                                }
                            }
                        }
                        setState(270);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
                    }
                    setState(272);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(271);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(274);
                    importDeclaration();
                    setState(281);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(276);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==NEWLINE) {
                                        {
                                            setState(275);
                                            match(NEWLINE);
                                        }
                                    }

                                    setState(278);
                                    importDeclaration();
                                }
                            }
                        }
                        setState(283);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
                    }
                    setState(285);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(284);
                            match(NEWLINE);
                        }
                    }

                    setState(287);
                    match(ARROW);
                    setState(288);
                    importDeclaration();
                    setState(295);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,17,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(290);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==NEWLINE) {
                                        {
                                            setState(289);
                                            match(NEWLINE);
                                        }
                                    }

                                    setState(292);
                                    importDeclaration();
                                }
                            }
                        }
                        setState(297);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,17,_ctx);
                    }
                    setState(299);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(298);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(301);
                    match(EMPTY);
                    setState(303);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(302);
                            match(NEWLINE);
                        }
                    }

                    setState(305);
                    match(ARROW);
                    setState(306);
                    importDeclaration();
                    setState(313);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(308);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==NEWLINE) {
                                        {
                                            setState(307);
                                            match(NEWLINE);
                                        }
                                    }

                                    setState(310);
                                    importDeclaration();
                                }
                            }
                        }
                        setState(315);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
                    }
                    setState(317);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(316);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(319);
                    importDeclaration();
                    setState(326);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(321);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==NEWLINE) {
                                        {
                                            setState(320);
                                            match(NEWLINE);
                                        }
                                    }

                                    setState(323);
                                    importDeclaration();
                                }
                            }
                        }
                        setState(328);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
                    }
                    setState(330);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(329);
                            match(NEWLINE);
                        }
                    }

                    setState(332);
                    match(ARROW);
                    setState(334);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(333);
                            match(NEWLINE);
                        }
                    }

                    setState(336);
                    match(EMPTY);
                    setState(338);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(337);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(340);
                    classBodyDeclaration();
                    setState(342);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(341);
                            match(NEWLINE);
                        }
                    }

                    setState(344);
                    match(ARROW);
                    setState(345);
                    classBodyDeclaration();
                    setState(347);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(346);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(349);
                    typeDeclaration();
                    setState(351);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(350);
                            match(NEWLINE);
                        }
                    }

                    setState(353);
                    match(ARROW);
                    setState(354);
                    typeDeclaration();
                    setState(356);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(355);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(358);
                    annotation();
                    setState(360);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(359);
                            match(NEWLINE);
                        }
                    }

                    setState(362);
                    match(ARROW);
                    setState(363);
                    annotation();
                    setState(365);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(364);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(367);
                    packageDeclaration();
                    setState(369);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(368);
                            match(NEWLINE);
                        }
                    }

                    setState(371);
                    match(ARROW);
                    setState(372);
                    packageDeclaration();
                    setState(374);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(373);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(376);
                    match(EMPTY);
                    setState(378);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(377);
                            match(NEWLINE);
                        }
                    }

                    setState(380);
                    match(ARROW);
                    setState(381);
                    packageDeclaration();
                    setState(383);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(382);
                            match(NEWLINE);
                        }
                    }

                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(385);
                    packageDeclaration();
                    setState(387);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(386);
                            match(NEWLINE);
                        }
                    }

                    setState(389);
                    match(ARROW);
                    setState(391);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(390);
                            match(NEWLINE);
                        }
                    }

                    setState(393);
                    match(EMPTY);
                    setState(395);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==NEWLINE) {
                        {
                            setState(394);
                            match(NEWLINE);
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
        enterRule(_localctx, 2, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(400);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
                    case 1:
                    {
                        setState(399);
                        packageDeclaration();
                    }
                    break;
                }
                setState(405);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==IMPORT) {
                    {
                        {
                            setState(402);
                            importDeclaration();
                        }
                    }
                    setState(407);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(411);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
                    {
                        {
                            setState(408);
                            typeDeclaration();
                        }
                    }
                    setState(413);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(414);
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
        enterRule(_localctx, 4, RULE_packageDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(419);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(416);
                            annotation();
                        }
                    }
                    setState(421);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(422);
                match(PACKAGE);
                setState(423);
                qualifiedName();
                setState(424);
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
        enterRule(_localctx, 6, RULE_importDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(426);
                match(IMPORT);
                setState(428);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==STATIC) {
                    {
                        setState(427);
                        match(STATIC);
                    }
                }

                setState(430);
                qualifiedName();
                setState(433);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DOT) {
                    {
                        setState(431);
                        match(DOT);
                        setState(432);
                        match(MUL);
                    }
                }

                setState(435);
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
        enterRule(_localctx, 8, RULE_typeDeclaration);
        try {
            int _alt;
            setState(450);
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
                    setState(440);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(437);
                                    classOrInterfaceModifier();
                                }
                            }
                        }
                        setState(442);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
                    }
                    setState(447);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS:
                        {
                            setState(443);
                            classDeclaration();
                        }
                        break;
                        case ENUM:
                        {
                            setState(444);
                            enumDeclaration();
                        }
                        break;
                        case INTERFACE:
                        {
                            setState(445);
                            interfaceDeclaration();
                        }
                        break;
                        case AT:
                        {
                            setState(446);
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
                    setState(449);
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
        enterRule(_localctx, 10, RULE_modifier);
        try {
            setState(457);
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
                    setState(452);
                    classOrInterfaceModifier();
                }
                break;
                case NATIVE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(453);
                    match(NATIVE);
                }
                break;
                case SYNCHRONIZED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(454);
                    match(SYNCHRONIZED);
                }
                break;
                case TRANSIENT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(455);
                    match(TRANSIENT);
                }
                break;
                case VOLATILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(456);
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
        enterRule(_localctx, 12, RULE_classOrInterfaceModifier);
        try {
            setState(467);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(459);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(460);
                    match(PUBLIC);
                }
                break;
                case PROTECTED:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(461);
                    match(PROTECTED);
                }
                break;
                case PRIVATE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(462);
                    match(PRIVATE);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(463);
                    match(STATIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(464);
                    match(ABSTRACT);
                }
                break;
                case FINAL:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(465);
                    match(FINAL);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(466);
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
        enterRule(_localctx, 14, RULE_variableModifier);
        try {
            setState(471);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FINAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(469);
                    match(FINAL);
                }
                break;
                case AT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(470);
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
        enterRule(_localctx, 16, RULE_classDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(473);
                match(CLASS);
                setState(474);
                match(IDENTIFIER);
                setState(476);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(475);
                        typeParameters();
                    }
                }

                setState(480);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(478);
                        match(EXTENDS);
                        setState(479);
                        typeType();
                    }
                }

                setState(484);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==IMPLEMENTS) {
                    {
                        setState(482);
                        match(IMPLEMENTS);
                        setState(483);
                        typeList();
                    }
                }

                setState(486);
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
        enterRule(_localctx, 18, RULE_typeParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(488);
                match(LT);
                setState(489);
                typeParameter();
                setState(494);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(490);
                            match(COMMA);
                            setState(491);
                            typeParameter();
                        }
                    }
                    setState(496);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(497);
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
        enterRule(_localctx, 20, RULE_typeParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(502);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(499);
                            annotation();
                        }
                    }
                    setState(504);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(505);
                match(IDENTIFIER);
                setState(508);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(506);
                        match(EXTENDS);
                        setState(507);
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
        enterRule(_localctx, 22, RULE_typeBound);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(510);
                typeType();
                setState(515);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==BITAND) {
                    {
                        {
                            setState(511);
                            match(BITAND);
                            setState(512);
                            typeType();
                        }
                    }
                    setState(517);
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
        enterRule(_localctx, 24, RULE_enumDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(518);
                match(ENUM);
                setState(519);
                match(IDENTIFIER);
                setState(522);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==IMPLEMENTS) {
                    {
                        setState(520);
                        match(IMPLEMENTS);
                        setState(521);
                        typeList();
                    }
                }

                setState(524);
                match(LBRACE);
                setState(526);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==AT || _la==IDENTIFIER) {
                    {
                        setState(525);
                        enumConstants();
                    }
                }

                setState(529);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMA) {
                    {
                        setState(528);
                        match(COMMA);
                    }
                }

                setState(532);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SEMI) {
                    {
                        setState(531);
                        enumBodyDeclarations();
                    }
                }

                setState(534);
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
        enterRule(_localctx, 26, RULE_enumConstants);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(536);
                enumConstant();
                setState(541);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,65,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(537);
                                match(COMMA);
                                setState(538);
                                enumConstant();
                            }
                        }
                    }
                    setState(543);
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
        enterRule(_localctx, 28, RULE_enumConstant);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(547);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(544);
                            annotation();
                        }
                    }
                    setState(549);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(550);
                match(IDENTIFIER);
                setState(552);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LPAREN) {
                    {
                        setState(551);
                        arguments();
                    }
                }

                setState(555);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LBRACE) {
                    {
                        setState(554);
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
        enterRule(_localctx, 30, RULE_enumBodyDeclarations);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(557);
                match(SEMI);
                setState(561);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
                    {
                        {
                            setState(558);
                            classBodyDeclaration();
                        }
                    }
                    setState(563);
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
        enterRule(_localctx, 32, RULE_interfaceDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(564);
                match(INTERFACE);
                setState(565);
                match(IDENTIFIER);
                setState(567);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(566);
                        typeParameters();
                    }
                }

                setState(571);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXTENDS) {
                    {
                        setState(569);
                        match(EXTENDS);
                        setState(570);
                        typeList();
                    }
                }

                setState(573);
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
        enterRule(_localctx, 34, RULE_classBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(575);
                match(LBRACE);
                setState(579);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
                    {
                        {
                            setState(576);
                            classBodyDeclaration();
                        }
                    }
                    setState(581);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(582);
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
        enterRule(_localctx, 36, RULE_interfaceBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(584);
                match(LBRACE);
                setState(588);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
                    {
                        {
                            setState(585);
                            interfaceBodyDeclaration();
                        }
                    }
                    setState(590);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(591);
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
        enterRule(_localctx, 38, RULE_classBodyDeclaration);
        int _la;
        try {
            int _alt;
            setState(605);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(593);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(595);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==STATIC) {
                        {
                            setState(594);
                            match(STATIC);
                        }
                    }

                    setState(597);
                    block();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(601);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,75,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(598);
                                    modifier();
                                }
                            }
                        }
                        setState(603);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,75,_ctx);
                    }
                    setState(604);
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
        enterRule(_localctx, 40, RULE_memberDeclaration);
        try {
            setState(616);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(607);
                    methodDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(608);
                    genericMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(609);
                    fieldDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(610);
                    constructorDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(611);
                    genericConstructorDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(612);
                    interfaceDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(613);
                    annotationTypeDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(614);
                    classDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(615);
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
        enterRule(_localctx, 42, RULE_methodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(618);
                typeTypeOrVoid();
                setState(619);
                match(IDENTIFIER);
                setState(620);
                formalParameters();
                setState(625);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(621);
                            match(LBRACK);
                            setState(622);
                            match(RBRACK);
                        }
                    }
                    setState(627);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(630);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(628);
                        match(THROWS);
                        setState(629);
                        qualifiedNameList();
                    }
                }

                setState(632);
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
        enterRule(_localctx, 44, RULE_methodBody);
        try {
            setState(636);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NEWLINE:
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(634);
                    block();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(635);
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
        enterRule(_localctx, 46, RULE_typeTypeOrVoid);
        try {
            setState(640);
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
                    setState(638);
                    typeType();
                }
                break;
                case VOID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(639);
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
        enterRule(_localctx, 48, RULE_genericMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(642);
                typeParameters();
                setState(643);
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
        enterRule(_localctx, 50, RULE_genericConstructorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(645);
                typeParameters();
                setState(646);
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
        enterRule(_localctx, 52, RULE_constructorDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(648);
                match(IDENTIFIER);
                setState(649);
                formalParameters();
                setState(652);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(650);
                        match(THROWS);
                        setState(651);
                        qualifiedNameList();
                    }
                }

                setState(654);
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
        enterRule(_localctx, 54, RULE_fieldDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(656);
                typeType();
                setState(657);
                variableDeclarators();
                setState(658);
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
        enterRule(_localctx, 56, RULE_interfaceBodyDeclaration);
        try {
            int _alt;
            setState(668);
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
                    setState(663);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,83,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(660);
                                    modifier();
                                }
                            }
                        }
                        setState(665);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,83,_ctx);
                    }
                    setState(666);
                    interfaceMemberDeclaration();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(667);
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
        enterRule(_localctx, 58, RULE_interfaceMemberDeclaration);
        try {
            setState(677);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(670);
                    constDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(671);
                    interfaceMethodDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(672);
                    genericInterfaceMethodDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(673);
                    interfaceDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(674);
                    annotationTypeDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(675);
                    classDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(676);
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
        enterRule(_localctx, 60, RULE_constDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(679);
                typeType();
                setState(680);
                constantDeclarator();
                setState(685);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(681);
                            match(COMMA);
                            setState(682);
                            constantDeclarator();
                        }
                    }
                    setState(687);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(688);
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
        enterRule(_localctx, 62, RULE_constantDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(690);
                match(IDENTIFIER);
                setState(695);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(691);
                            match(LBRACK);
                            setState(692);
                            match(RBRACK);
                        }
                    }
                    setState(697);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(698);
                match(ASSIGN);
                setState(699);
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
        enterRule(_localctx, 64, RULE_interfaceMethodDeclaration);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(704);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,88,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(701);
                                interfaceMethodModifier();
                            }
                        }
                    }
                    setState(706);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,88,_ctx);
                }
                setState(717);
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
                        setState(707);
                        typeTypeOrVoid();
                    }
                    break;
                    case LT:
                    {
                        setState(708);
                        typeParameters();
                        setState(712);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,89,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(709);
                                        annotation();
                                    }
                                }
                            }
                            setState(714);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,89,_ctx);
                        }
                        setState(715);
                        typeTypeOrVoid();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(719);
                match(IDENTIFIER);
                setState(720);
                formalParameters();
                setState(725);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(721);
                            match(LBRACK);
                            setState(722);
                            match(RBRACK);
                        }
                    }
                    setState(727);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(730);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==THROWS) {
                    {
                        setState(728);
                        match(THROWS);
                        setState(729);
                        qualifiedNameList();
                    }
                }

                setState(732);
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
        enterRule(_localctx, 66, RULE_interfaceMethodModifier);
        try {
            setState(740);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case AT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(734);
                    annotation();
                }
                break;
                case PUBLIC:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(735);
                    match(PUBLIC);
                }
                break;
                case ABSTRACT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(736);
                    match(ABSTRACT);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(737);
                    match(DEFAULT);
                }
                break;
                case STATIC:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(738);
                    match(STATIC);
                }
                break;
                case STRICTFP:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(739);
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
        enterRule(_localctx, 68, RULE_genericInterfaceMethodDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(742);
                typeParameters();
                setState(743);
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
        enterRule(_localctx, 70, RULE_variableDeclarators);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(745);
                variableDeclarator();
                setState(750);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(746);
                            match(COMMA);
                            setState(747);
                            variableDeclarator();
                        }
                    }
                    setState(752);
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
        enterRule(_localctx, 72, RULE_variableDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(753);
                variableDeclaratorId();
                setState(756);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==ASSIGN) {
                    {
                        setState(754);
                        match(ASSIGN);
                        setState(755);
                        variableInitializer();
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
        enterRule(_localctx, 74, RULE_variableDeclaratorId);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(758);
                match(IDENTIFIER);
                setState(763);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==LBRACK) {
                    {
                        {
                            setState(759);
                            match(LBRACK);
                            setState(760);
                            match(RBRACK);
                        }
                    }
                    setState(765);
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
        enterRule(_localctx, 76, RULE_variableInitializer);
        try {
            setState(768);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LBRACE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(766);
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
                    setState(767);
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
        enterRule(_localctx, 78, RULE_arrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(770);
                match(LBRACE);
                setState(782);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(771);
                        variableInitializer();
                        setState(776);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,98,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(772);
                                        match(COMMA);
                                        setState(773);
                                        variableInitializer();
                                    }
                                }
                            }
                            setState(778);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,98,_ctx);
                        }
                        setState(780);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==COMMA) {
                            {
                                setState(779);
                                match(COMMA);
                            }
                        }

                    }
                }

                setState(784);
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
        enterRule(_localctx, 80, RULE_classOrInterfaceType);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(786);
                match(IDENTIFIER);
                setState(788);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
                    case 1:
                    {
                        setState(787);
                        typeArguments();
                    }
                    break;
                }
                setState(797);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,103,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(790);
                                match(DOT);
                                setState(791);
                                match(IDENTIFIER);
                                setState(793);
                                _errHandler.sync(this);
                                switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
                                    case 1:
                                    {
                                        setState(792);
                                        typeArguments();
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    setState(799);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
        enterRule(_localctx, 82, RULE_typeArgument);
        int _la;
        try {
            setState(806);
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
                    setState(800);
                    typeType();
                }
                break;
                case QUESTION:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(801);
                    match(QUESTION);
                    setState(804);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==EXTENDS || _la==SUPER) {
                        {
                            setState(802);
                            _la = _input.LA(1);
                            if ( !(_la==EXTENDS || _la==SUPER) ) {
                                _errHandler.recoverInline(this);
                            }
                            else {
                                if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(803);
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
        enterRule(_localctx, 84, RULE_qualifiedNameList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(808);
                qualifiedName();
                setState(813);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(809);
                            match(COMMA);
                            setState(810);
                            qualifiedName();
                        }
                    }
                    setState(815);
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
        enterRule(_localctx, 86, RULE_formalParameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(816);
                match(LPAREN);
                setState(818);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
                    {
                        setState(817);
                        formalParameterList();
                    }
                }

                setState(820);
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
        enterRule(_localctx, 88, RULE_formalParameterList);
        int _la;
        try {
            int _alt;
            setState(835);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(822);
                    formalParameter();
                    setState(827);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,108,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(823);
                                    match(COMMA);
                                    setState(824);
                                    formalParameter();
                                }
                            }
                        }
                        setState(829);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,108,_ctx);
                    }
                    setState(832);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COMMA) {
                        {
                            setState(830);
                            match(COMMA);
                            setState(831);
                            lastFormalParameter();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(834);
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
        enterRule(_localctx, 90, RULE_formalParameter);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(840);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,111,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(837);
                                variableModifier();
                            }
                        }
                    }
                    setState(842);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,111,_ctx);
                }
                setState(843);
                typeType();
                setState(844);
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
        enterRule(_localctx, 92, RULE_lastFormalParameter);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(849);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,112,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(846);
                                variableModifier();
                            }
                        }
                    }
                    setState(851);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,112,_ctx);
                }
                setState(852);
                typeType();
                setState(853);
                match(ELLIPSIS);
                setState(854);
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
        enterRule(_localctx, 94, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(856);
                match(IDENTIFIER);
                setState(861);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,113,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(857);
                                match(DOT);
                                setState(858);
                                match(IDENTIFIER);
                            }
                        }
                    }
                    setState(863);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
        enterRule(_localctx, 96, RULE_literal);
        try {
            setState(871);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DECIMAL_LITERAL:
                case HEX_LITERAL:
                case OCT_LITERAL:
                case BINARY_LITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(864);
                    integerLiteral();
                }
                break;
                case FLOAT_LITERAL:
                case HEX_FLOAT_LITERAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(865);
                    floatLiteral();
                }
                break;
                case CHAR_LITERAL:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(866);
                    match(CHAR_LITERAL);
                }
                break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(867);
                    match(STRING_LITERAL);
                }
                break;
                case BOOL_LITERAL:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(868);
                    match(BOOL_LITERAL);
                }
                break;
                case NULL_LITERAL:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(869);
                    match(NULL_LITERAL);
                }
                break;
                case LITERALS:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(870);
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
        enterRule(_localctx, 98, RULE_integerLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(873);
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
        enterRule(_localctx, 100, RULE_floatLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(875);
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
        enterRule(_localctx, 102, RULE_annotation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(877);
                match(AT);
                setState(878);
                qualifiedName();
                setState(885);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LPAREN) {
                    {
                        setState(879);
                        match(LPAREN);
                        setState(882);
                        _errHandler.sync(this);
                        switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
                            case 1:
                            {
                                setState(880);
                                elementValuePairs();
                            }
                            break;
                            case 2:
                            {
                                setState(881);
                                elementValue();
                            }
                            break;
                        }
                        setState(884);
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
        enterRule(_localctx, 104, RULE_elementValuePairs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(887);
                elementValuePair();
                setState(892);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(888);
                            match(COMMA);
                            setState(889);
                            elementValuePair();
                        }
                    }
                    setState(894);
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
        enterRule(_localctx, 106, RULE_elementValuePair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(895);
                match(IDENTIFIER);
                setState(896);
                match(ASSIGN);
                setState(897);
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
        enterRule(_localctx, 108, RULE_elementValue);
        try {
            setState(902);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(899);
                    expression(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(900);
                    annotation();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(901);
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
        enterRule(_localctx, 110, RULE_elementValueArrayInitializer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(904);
                match(LBRACE);
                setState(913);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(905);
                        elementValue();
                        setState(910);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,119,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(906);
                                        match(COMMA);
                                        setState(907);
                                        elementValue();
                                    }
                                }
                            }
                            setState(912);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,119,_ctx);
                        }
                    }
                }

                setState(916);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMA) {
                    {
                        setState(915);
                        match(COMMA);
                    }
                }

                setState(918);
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
        enterRule(_localctx, 112, RULE_annotationTypeDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(920);
                match(AT);
                setState(921);
                match(INTERFACE);
                setState(922);
                match(IDENTIFIER);
                setState(923);
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
        enterRule(_localctx, 114, RULE_annotationTypeBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(925);
                match(LBRACE);
                setState(929);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
                    {
                        {
                            setState(926);
                            annotationTypeElementDeclaration();
                        }
                    }
                    setState(931);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(932);
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
        enterRule(_localctx, 116, RULE_annotationTypeElementDeclaration);
        try {
            int _alt;
            setState(942);
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
                    setState(937);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,123,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(934);
                                    modifier();
                                }
                            }
                        }
                        setState(939);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,123,_ctx);
                    }
                    setState(940);
                    annotationTypeElementRest();
                }
                break;
                case SEMI:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(941);
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
        enterRule(_localctx, 118, RULE_annotationTypeElementRest);
        try {
            setState(964);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(944);
                    typeType();
                    setState(945);
                    annotationMethodOrConstantRest();
                    setState(946);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(948);
                    classDeclaration();
                    setState(950);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
                        case 1:
                        {
                            setState(949);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(952);
                    interfaceDeclaration();
                    setState(954);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
                        case 1:
                        {
                            setState(953);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(956);
                    enumDeclaration();
                    setState(958);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
                        case 1:
                        {
                            setState(957);
                            match(SEMI);
                        }
                        break;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(960);
                    annotationTypeDeclaration();
                    setState(962);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
                        case 1:
                        {
                            setState(961);
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
        enterRule(_localctx, 120, RULE_annotationMethodOrConstantRest);
        try {
            setState(968);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(966);
                    annotationMethodRest();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(967);
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
        enterRule(_localctx, 122, RULE_annotationMethodRest);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(970);
                match(IDENTIFIER);
                setState(971);
                match(LPAREN);
                setState(972);
                match(RPAREN);
                setState(974);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEFAULT) {
                    {
                        setState(973);
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
        enterRule(_localctx, 124, RULE_annotationConstantRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(976);
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
        enterRule(_localctx, 126, RULE_defaultValue);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(978);
                match(DEFAULT);
                setState(979);
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
        public List<TerminalNode> NEWLINE() { return getTokens(JavaParser.NEWLINE); }
        public TerminalNode NEWLINE(int i) {
            return getToken(JavaParser.NEWLINE, i);
        }
        public List<BlockStatementContext> blockStatement() {
            return getRuleContexts(BlockStatementContext.class);
        }
        public BlockStatementContext blockStatement(int i) {
            return getRuleContext(BlockStatementContext.class,i);
        }
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
        enterRule(_localctx, 128, RULE_block);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(982);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NEWLINE) {
                    {
                        setState(981);
                        match(NEWLINE);
                    }
                }

                setState(984);
                match(LBRACE);
                setState(986);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
                    case 1:
                    {
                        setState(985);
                        match(NEWLINE);
                    }
                    break;
                }
                setState(991);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,134,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(988);
                                blockStatement();
                            }
                        }
                    }
                    setState(993);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,134,_ctx);
                }
                setState(995);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NEWLINE) {
                    {
                        setState(994);
                        match(NEWLINE);
                    }
                }

                setState(997);
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
        enterRule(_localctx, 130, RULE_blockStatement);
        try {
            setState(1004);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(999);
                    localVariableDeclaration();
                    setState(1000);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1002);
                    statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1003);
                    localTypeDeclaration();
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
        enterRule(_localctx, 132, RULE_localVariableDeclaration);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1009);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,137,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1006);
                                variableModifier();
                            }
                        }
                    }
                    setState(1011);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,137,_ctx);
                }
                setState(1012);
                typeType();
                setState(1013);
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
        enterRule(_localctx, 134, RULE_localTypeDeclaration);
        int _la;
        try {
            setState(1026);
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
                    setState(1018);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
                        {
                            {
                                setState(1015);
                                classOrInterfaceModifier();
                            }
                        }
                        setState(1020);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1023);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CLASS:
                        {
                            setState(1021);
                            classDeclaration();
                        }
                        break;
                        case INTERFACE:
                        {
                            setState(1022);
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
                    setState(1025);
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
        enterRule(_localctx, 136, RULE_statement);
        int _la;
        try {
            int _alt;
            setState(1190);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1028);
                    ((StatementContext)_localctx).blockLabel = block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1029);
                    match(ASSERT);
                    setState(1030);
                    match(EXPR);
                    setState(1033);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COLON) {
                        {
                            setState(1031);
                            match(COLON);
                            setState(1032);
                            match(EXPR);
                        }
                    }

                    setState(1035);
                    match(SEMI);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1036);
                    match(FOR);
                    setState(1037);
                    match(LPAREN);
                    setState(1038);
                    match(EXPR);
                    setState(1043);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1039);
                                match(COMMA);
                                setState(1040);
                                match(EXPR);
                            }
                        }
                        setState(1045);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1046);
                    match(RPAREN);
                    setState(1047);
                    statement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1048);
                    match(FOR);
                    setState(1049);
                    match(LPAREN);
                    setState(1050);
                    match(WILDCARD);
                    setState(1051);
                    match(RPAREN);
                    setState(1052);
                    statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1053);
                    match(WHILE);
                    setState(1054);
                    match(EXPR);
                    setState(1055);
                    statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1056);
                    match(DO);
                    setState(1057);
                    statement();
                    setState(1058);
                    match(WHILE);
                    setState(1059);
                    match(EXPR);
                    setState(1060);
                    match(SEMI);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1062);
                    match(SWITCH);
                    setState(1063);
                    match(EXPR);
                    setState(1064);
                    match(LBRACE);
                    setState(1068);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,143,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1065);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(1070);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,143,_ctx);
                    }
                    setState(1074);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CASE || _la==DEFAULT) {
                        {
                            {
                                setState(1071);
                                switchLabel();
                            }
                        }
                        setState(1076);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1077);
                    match(RBRACE);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(1078);
                    match(SYNCHRONIZED);
                    setState(1079);
                    match(EXPR);
                    setState(1080);
                    block();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(1081);
                    match(RETURN);
                    setState(1082);
                    match(EXPR);
                    setState(1083);
                    match(SEMI);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(1084);
                    match(THROW);
                    setState(1085);
                    match(EXPR);
                    setState(1086);
                    match(SEMI);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(1087);
                    match(ASSERT);
                    setState(1088);
                    expression(0);
                    setState(1091);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==COLON) {
                        {
                            setState(1089);
                            match(COLON);
                            setState(1090);
                            expression(0);
                        }
                    }

                    setState(1093);
                    match(SEMI);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(1095);
                    match(IF);
                    setState(1096);
                    parExpression();
                    setState(1097);
                    statement();
                    setState(1100);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
                        case 1:
                        {
                            setState(1098);
                            match(ELSE);
                            setState(1099);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(1102);
                    match(FOR);
                    setState(1103);
                    match(LPAREN);
                    setState(1104);
                    forControl();
                    setState(1105);
                    match(RPAREN);
                    setState(1106);
                    statement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(1108);
                    match(WHILE);
                    setState(1109);
                    parExpression();
                    setState(1110);
                    statement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(1112);
                    match(DO);
                    setState(1113);
                    statement();
                    setState(1114);
                    match(WHILE);
                    setState(1115);
                    parExpression();
                    setState(1116);
                    match(SEMI);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(1118);
                    match(TRY);
                    setState(1119);
                    block();
                    setState(1129);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case CATCH:
                        {
                            setState(1121);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(1120);
                                        catchClause();
                                    }
                                }
                                setState(1123);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while ( _la==CATCH );
                            setState(1126);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la==FINALLY) {
                                {
                                    setState(1125);
                                    finallyBlock();
                                }
                            }

                        }
                        break;
                        case FINALLY:
                        {
                            setState(1128);
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
                    setState(1131);
                    match(TRY);
                    setState(1132);
                    resourceSpecification();
                    setState(1133);
                    block();
                    setState(1137);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CATCH) {
                        {
                            {
                                setState(1134);
                                catchClause();
                            }
                        }
                        setState(1139);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1141);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==FINALLY) {
                        {
                            setState(1140);
                            finallyBlock();
                        }
                    }

                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(1143);
                    match(SWITCH);
                    setState(1144);
                    parExpression();
                    setState(1145);
                    match(LBRACE);
                    setState(1149);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,152,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1146);
                                    switchBlockStatementGroup();
                                }
                            }
                        }
                        setState(1151);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,152,_ctx);
                    }
                    setState(1155);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==CASE || _la==DEFAULT) {
                        {
                            {
                                setState(1152);
                                switchLabel();
                            }
                        }
                        setState(1157);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1158);
                    match(RBRACE);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(1160);
                    match(SYNCHRONIZED);
                    setState(1161);
                    parExpression();
                    setState(1162);
                    block();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(1164);
                    match(RETURN);
                    setState(1166);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1165);
                            expression(0);
                        }
                    }

                    setState(1168);
                    match(SEMI);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(1169);
                    match(THROW);
                    setState(1170);
                    expression(0);
                    setState(1171);
                    match(SEMI);
                }
                break;
                case 22:
                    enterOuterAlt(_localctx, 22);
                {
                    setState(1173);
                    match(BREAK);
                    setState(1175);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==IDENTIFIER) {
                        {
                            setState(1174);
                            match(IDENTIFIER);
                        }
                    }

                    setState(1177);
                    match(SEMI);
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(1178);
                    match(CONTINUE);
                    setState(1180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==IDENTIFIER) {
                        {
                            setState(1179);
                            match(IDENTIFIER);
                        }
                    }

                    setState(1182);
                    match(SEMI);
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(1183);
                    match(SEMI);
                }
                break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                {
                    setState(1184);
                    ((StatementContext)_localctx).statementExpression = expression(0);
                    setState(1185);
                    match(SEMI);
                }
                break;
                case 26:
                    enterOuterAlt(_localctx, 26);
                {
                    setState(1187);
                    ((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
                    setState(1188);
                    match(COLON);
                    setState(1189);
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
        enterRule(_localctx, 138, RULE_catchClause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1192);
                match(CATCH);
                setState(1193);
                match(LPAREN);
                setState(1197);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==FINAL || _la==AT) {
                    {
                        {
                            setState(1194);
                            variableModifier();
                        }
                    }
                    setState(1199);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1200);
                catchType();
                setState(1201);
                match(IDENTIFIER);
                setState(1202);
                match(RPAREN);
                setState(1203);
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
        enterRule(_localctx, 140, RULE_catchType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1205);
                qualifiedName();
                setState(1210);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==BITOR) {
                    {
                        {
                            setState(1206);
                            match(BITOR);
                            setState(1207);
                            qualifiedName();
                        }
                    }
                    setState(1212);
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
        enterRule(_localctx, 142, RULE_finallyBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1213);
                match(FINALLY);
                setState(1214);
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
        enterRule(_localctx, 144, RULE_resourceSpecification);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1216);
                match(LPAREN);
                setState(1217);
                resources();
                setState(1219);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SEMI) {
                    {
                        setState(1218);
                        match(SEMI);
                    }
                }

                setState(1221);
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
        enterRule(_localctx, 146, RULE_resources);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1223);
                resource();
                setState(1228);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,161,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1224);
                                match(SEMI);
                                setState(1225);
                                resource();
                            }
                        }
                    }
                    setState(1230);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
        enterRule(_localctx, 148, RULE_resource);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1234);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==FINAL || _la==AT) {
                    {
                        {
                            setState(1231);
                            variableModifier();
                        }
                    }
                    setState(1236);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1237);
                classOrInterfaceType();
                setState(1238);
                variableDeclaratorId();
                setState(1239);
                match(ASSIGN);
                setState(1240);
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
        enterRule(_localctx, 150, RULE_switchBlockStatementGroup);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1243);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1242);
                            switchLabel();
                        }
                    }
                    setState(1245);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==CASE || _la==DEFAULT );
                setState(1248);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1247);
                            blockStatement();
                        }
                    }
                    setState(1250);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << NEWLINE) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
            }
        }
        catch (RecognitionException re) {
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
        enterRule(_localctx, 152, RULE_switchLabel);
        try {
            setState(1260);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CASE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1252);
                    match(CASE);
                    setState(1255);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
                        case 1:
                        {
                            setState(1253);
                            ((SwitchLabelContext)_localctx).constantExpression = expression(0);
                        }
                        break;
                        case 2:
                        {
                            setState(1254);
                            ((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
                        }
                        break;
                    }
                    setState(1257);
                    match(COLON);
                }
                break;
                case DEFAULT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1258);
                    match(DEFAULT);
                    setState(1259);
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
        enterRule(_localctx, 154, RULE_forControl);
        int _la;
        try {
            setState(1274);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1262);
                    enhancedForControl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1264);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1263);
                            forInit();
                        }
                    }

                    setState(1266);
                    match(SEMI);
                    setState(1268);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1267);
                            expression(0);
                        }
                    }

                    setState(1270);
                    match(SEMI);
                    setState(1272);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1271);
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
        enterRule(_localctx, 156, RULE_forInit);
        try {
            setState(1278);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1276);
                    localVariableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1277);
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
        enterRule(_localctx, 158, RULE_enhancedForControl);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1283);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,172,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1280);
                                variableModifier();
                            }
                        }
                    }
                    setState(1285);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,172,_ctx);
                }
                setState(1286);
                typeType();
                setState(1287);
                variableDeclaratorId();
                setState(1288);
                match(COLON);
                setState(1289);
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
        enterRule(_localctx, 160, RULE_parExpression);
        try {
            setState(1298);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1291);
                    match(LPAREN);
                    setState(1292);
                    match(EXPR);
                    setState(1293);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1294);
                    match(LPAREN);
                    setState(1295);
                    expression(0);
                    setState(1296);
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
        enterRule(_localctx, 162, RULE_expressionList);
        int _la;
        try {
            setState(1317);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case WILDCARD:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1300);
                    match(WILDCARD);
                }
                break;
                case EXPR:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1301);
                    match(EXPR);
                    setState(1306);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1302);
                                match(COMMA);
                                setState(1303);
                                match(EXPR);
                            }
                        }
                        setState(1308);
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
                    setState(1309);
                    expression(0);
                    setState(1314);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1310);
                                match(COMMA);
                                setState(1311);
                                expression(0);
                            }
                        }
                        setState(1316);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
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
        enterRule(_localctx, 164, RULE_methodCall);
        int _la;
        try {
            setState(1337);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1319);
                    match(IDENTIFIER);
                    setState(1320);
                    match(LPAREN);
                    setState(1322);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1321);
                            expressionList();
                        }
                    }

                    setState(1324);
                    match(RPAREN);
                }
                break;
                case THIS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1325);
                    match(THIS);
                    setState(1326);
                    match(LPAREN);
                    setState(1328);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1327);
                            expressionList();
                        }
                    }

                    setState(1330);
                    match(RPAREN);
                }
                break;
                case SUPER:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1331);
                    match(SUPER);
                    setState(1332);
                    match(LPAREN);
                    setState(1334);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                        {
                            setState(1333);
                            expressionList();
                        }
                    }

                    setState(1336);
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
        public TerminalNode OP() { return getToken(JavaParser.OP, 0); }
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
        int _startState = 166;
        enterRecursionRule(_localctx, 166, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1370);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
                    case 1:
                    {
                        setState(1340);
                        primary();
                    }
                    break;
                    case 2:
                    {
                        setState(1341);
                        methodCall();
                    }
                    break;
                    case 3:
                    {
                        setState(1342);
                        match(NEW);
                        setState(1343);
                        creator();
                    }
                    break;
                    case 4:
                    {
                        setState(1344);
                        match(LPAREN);
                        setState(1345);
                        typeType();
                        setState(1346);
                        match(RPAREN);
                        setState(1347);
                        expression(21);
                    }
                    break;
                    case 5:
                    {
                        setState(1349);
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
                        setState(1350);
                        expression(19);
                    }
                    break;
                    case 6:
                    {
                        setState(1351);
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
                        setState(1352);
                        expression(18);
                    }
                    break;
                    case 7:
                    {
                        setState(1353);
                        lambdaExpression();
                    }
                    break;
                    case 8:
                    {
                        setState(1354);
                        typeType();
                        setState(1355);
                        match(COLONCOLON);
                        setState(1361);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LT:
                            case IDENTIFIER:
                            {
                                setState(1357);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==LT) {
                                    {
                                        setState(1356);
                                        typeArguments();
                                    }
                                }

                                setState(1359);
                                match(IDENTIFIER);
                            }
                            break;
                            case NEW:
                            {
                                setState(1360);
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
                        setState(1363);
                        classType();
                        setState(1364);
                        match(COLONCOLON);
                        setState(1366);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la==LT) {
                            {
                                setState(1365);
                                typeArguments();
                            }
                        }

                        setState(1368);
                        match(NEW);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1452);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,190,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1450);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1372);
                                    if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(1373);
                                    ((ExpressionContext)_localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (MUL - 92)) | (1L << (DIV - 92)) | (1L << (MOD - 92)))) != 0)) ) {
                                        ((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
                                    }
                                    else {
                                        if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1374);
                                    expression(18);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1375);
                                    if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(1376);
                                    ((ExpressionContext)_localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if ( !(_la==ADD || _la==SUB) ) {
                                        ((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
                                    }
                                    else {
                                        if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1377);
                                    expression(17);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1378);
                                    if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(1386);
                                    _errHandler.sync(this);
                                    switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
                                        case 1:
                                        {
                                            setState(1379);
                                            match(LT);
                                            setState(1380);
                                            match(LT);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1381);
                                            match(GT);
                                            setState(1382);
                                            match(GT);
                                            setState(1383);
                                            match(GT);
                                        }
                                        break;
                                        case 3:
                                        {
                                            setState(1384);
                                            match(GT);
                                            setState(1385);
                                            match(GT);
                                        }
                                        break;
                                    }
                                    setState(1388);
                                    expression(16);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1389);
                                    if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(1390);
                                    ((ExpressionContext)_localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (GT - 76)) | (1L << (LT - 76)) | (1L << (LE - 76)) | (1L << (GE - 76)) | (1L << (OP - 76)))) != 0)) ) {
                                        ((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
                                    }
                                    else {
                                        if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1391);
                                    expression(15);
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1392);
                                    if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(1393);
                                    ((ExpressionContext)_localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
                                        ((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
                                    }
                                    else {
                                        if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1394);
                                    expression(13);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1395);
                                    if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(1396);
                                    ((ExpressionContext)_localctx).bop = match(BITAND);
                                    setState(1397);
                                    expression(12);
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1398);
                                    if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(1399);
                                    ((ExpressionContext)_localctx).bop = match(CARET);
                                    setState(1400);
                                    expression(11);
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1401);
                                    if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(1402);
                                    ((ExpressionContext)_localctx).bop = match(BITOR);
                                    setState(1403);
                                    expression(10);
                                }
                                break;
                                case 9:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1404);
                                    if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(1405);
                                    ((ExpressionContext)_localctx).bop = match(AND);
                                    setState(1406);
                                    expression(9);
                                }
                                break;
                                case 10:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1407);
                                    if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(1408);
                                    ((ExpressionContext)_localctx).bop = match(OR);
                                    setState(1409);
                                    expression(8);
                                }
                                break;
                                case 11:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1410);
                                    if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(1411);
                                    ((ExpressionContext)_localctx).bop = match(QUESTION);
                                    setState(1412);
                                    expression(0);
                                    setState(1413);
                                    match(COLON);
                                    setState(1414);
                                    expression(6);
                                }
                                break;
                                case 12:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1416);
                                    if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(1417);
                                    ((ExpressionContext)_localctx).bop = _input.LT(1);
                                    _la = _input.LA(1);
                                    if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ASSIGN - 75)) | (1L << (ADD_ASSIGN - 75)) | (1L << (SUB_ASSIGN - 75)) | (1L << (MUL_ASSIGN - 75)) | (1L << (DIV_ASSIGN - 75)) | (1L << (AND_ASSIGN - 75)) | (1L << (OR_ASSIGN - 75)) | (1L << (XOR_ASSIGN - 75)) | (1L << (MOD_ASSIGN - 75)) | (1L << (LSHIFT_ASSIGN - 75)) | (1L << (RSHIFT_ASSIGN - 75)) | (1L << (URSHIFT_ASSIGN - 75)))) != 0)) ) {
                                        ((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
                                    }
                                    else {
                                        if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1418);
                                    expression(5);
                                }
                                break;
                                case 13:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1419);
                                    if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(1420);
                                    ((ExpressionContext)_localctx).bop = match(DOT);
                                    setState(1432);
                                    _errHandler.sync(this);
                                    switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
                                        case 1:
                                        {
                                            setState(1421);
                                            match(IDENTIFIER);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1422);
                                            methodCall();
                                        }
                                        break;
                                        case 3:
                                        {
                                            setState(1423);
                                            match(THIS);
                                        }
                                        break;
                                        case 4:
                                        {
                                            setState(1424);
                                            match(NEW);
                                            setState(1426);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            if (_la==LT) {
                                                {
                                                    setState(1425);
                                                    nonWildcardTypeArguments();
                                                }
                                            }

                                            setState(1428);
                                            innerCreator();
                                        }
                                        break;
                                        case 5:
                                        {
                                            setState(1429);
                                            match(SUPER);
                                            setState(1430);
                                            superSuffix();
                                        }
                                        break;
                                        case 6:
                                        {
                                            setState(1431);
                                            explicitGenericInvocation();
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 14:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1434);
                                    if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                                    setState(1435);
                                    match(LBRACK);
                                    setState(1436);
                                    expression(0);
                                    setState(1437);
                                    match(RBRACK);
                                }
                                break;
                                case 15:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1439);
                                    if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(1440);
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
                                case 16:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1441);
                                    if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(1442);
                                    ((ExpressionContext)_localctx).bop = match(INSTANCEOF);
                                    setState(1443);
                                    typeType();
                                }
                                break;
                                case 17:
                                {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(1444);
                                    if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1445);
                                    match(COLONCOLON);
                                    setState(1447);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la==LT) {
                                        {
                                            setState(1446);
                                            typeArguments();
                                        }
                                    }

                                    setState(1449);
                                    match(IDENTIFIER);
                                }
                                break;
                            }
                        }
                    }
                    setState(1454);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
        enterRule(_localctx, 168, RULE_lambdaExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1455);
                lambdaParameters();
                setState(1456);
                match(ARROW);
                setState(1457);
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
        enterRule(_localctx, 170, RULE_lambdaParameters);
        int _la;
        try {
            setState(1475);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1459);
                    match(IDENTIFIER);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1460);
                    match(LPAREN);
                    setState(1462);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
                        {
                            setState(1461);
                            formalParameterList();
                        }
                    }

                    setState(1464);
                    match(RPAREN);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1465);
                    match(LPAREN);
                    setState(1466);
                    match(IDENTIFIER);
                    setState(1471);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(1467);
                                match(COMMA);
                                setState(1468);
                                match(IDENTIFIER);
                            }
                        }
                        setState(1473);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(1474);
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
        enterRule(_localctx, 172, RULE_lambdaBody);
        try {
            setState(1479);
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
                    setState(1477);
                    expression(0);
                }
                break;
                case NEWLINE:
                case LBRACE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1478);
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
        enterRule(_localctx, 174, RULE_primary);
        try {
            setState(1499);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1481);
                    match(LPAREN);
                    setState(1482);
                    expression(0);
                    setState(1483);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1485);
                    match(THIS);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1486);
                    match(SUPER);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1487);
                    literal();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1488);
                    match(IDENTIFIER);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1489);
                    typeTypeOrVoid();
                    setState(1490);
                    match(DOT);
                    setState(1491);
                    match(CLASS);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(1493);
                    nonWildcardTypeArguments();
                    setState(1497);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case SUPER:
                        case IDENTIFIER:
                        {
                            setState(1494);
                            explicitGenericInvocationSuffix();
                        }
                        break;
                        case THIS:
                        {
                            setState(1495);
                            match(THIS);
                            setState(1496);
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
        enterRule(_localctx, 176, RULE_classType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1504);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
                    case 1:
                    {
                        setState(1501);
                        classOrInterfaceType();
                        setState(1502);
                        match(DOT);
                    }
                    break;
                }
                setState(1509);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==AT) {
                    {
                        {
                            setState(1506);
                            annotation();
                        }
                    }
                    setState(1511);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1512);
                match(IDENTIFIER);
                setState(1514);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(1513);
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
        enterRule(_localctx, 178, RULE_creator);
        try {
            setState(1525);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1516);
                    nonWildcardTypeArguments();
                    setState(1517);
                    createdName();
                    setState(1518);
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
                    setState(1520);
                    createdName();
                    setState(1523);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case LBRACK:
                        {
                            setState(1521);
                            arrayCreatorRest();
                        }
                        break;
                        case LPAREN:
                        {
                            setState(1522);
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
        enterRule(_localctx, 180, RULE_createdName);
        int _la;
        try {
            setState(1542);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1527);
                    match(IDENTIFIER);
                    setState(1529);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==LT) {
                        {
                            setState(1528);
                            typeArgumentsOrDiamond();
                        }
                    }

                    setState(1538);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==DOT) {
                        {
                            {
                                setState(1531);
                                match(DOT);
                                setState(1532);
                                match(IDENTIFIER);
                                setState(1534);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la==LT) {
                                    {
                                        setState(1533);
                                        typeArgumentsOrDiamond();
                                    }
                                }

                            }
                        }
                        setState(1540);
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
                    setState(1541);
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
        enterRule(_localctx, 182, RULE_innerCreator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1544);
                match(IDENTIFIER);
                setState(1546);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LT) {
                    {
                        setState(1545);
                        nonWildcardTypeArgumentsOrDiamond();
                    }
                }

                setState(1548);
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
        enterRule(_localctx, 184, RULE_arrayCreatorRest);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1550);
                match(LBRACK);
                setState(1578);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RBRACK:
                    {
                        setState(1551);
                        match(RBRACK);
                        setState(1556);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la==LBRACK) {
                            {
                                {
                                    setState(1552);
                                    match(LBRACK);
                                    setState(1553);
                                    match(RBRACK);
                                }
                            }
                            setState(1558);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1559);
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
                        setState(1560);
                        expression(0);
                        setState(1561);
                        match(RBRACK);
                        setState(1568);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,208,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(1562);
                                        match(LBRACK);
                                        setState(1563);
                                        expression(0);
                                        setState(1564);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1570);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,208,_ctx);
                        }
                        setState(1575);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,209,_ctx);
                        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                            if ( _alt==1 ) {
                                {
                                    {
                                        setState(1571);
                                        match(LBRACK);
                                        setState(1572);
                                        match(RBRACK);
                                    }
                                }
                            }
                            setState(1577);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input,209,_ctx);
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
        enterRule(_localctx, 186, RULE_classCreatorRest);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1580);
                arguments();
                setState(1582);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
                    case 1:
                    {
                        setState(1581);
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
        enterRule(_localctx, 188, RULE_explicitGenericInvocation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1584);
                nonWildcardTypeArguments();
                setState(1585);
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
        enterRule(_localctx, 190, RULE_typeArgumentsOrDiamond);
        try {
            setState(1590);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1587);
                    match(LT);
                    setState(1588);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1589);
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
        enterRule(_localctx, 192, RULE_nonWildcardTypeArgumentsOrDiamond);
        try {
            setState(1595);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1592);
                    match(LT);
                    setState(1593);
                    match(GT);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1594);
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
        enterRule(_localctx, 194, RULE_nonWildcardTypeArguments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1597);
                match(LT);
                setState(1598);
                typeList();
                setState(1599);
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
        enterRule(_localctx, 196, RULE_typeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1601);
                typeType();
                setState(1606);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(1602);
                            match(COMMA);
                            setState(1603);
                            typeType();
                        }
                    }
                    setState(1608);
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
        enterRule(_localctx, 198, RULE_typeType);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1610);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==AT) {
                    {
                        setState(1609);
                        annotation();
                    }
                }

                setState(1614);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case IDENTIFIER:
                    {
                        setState(1612);
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
                        setState(1613);
                        primitiveType();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(1620);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,217,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(1616);
                                match(LBRACK);
                                setState(1617);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(1622);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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
        enterRule(_localctx, 200, RULE_primitiveType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1623);
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
        enterRule(_localctx, 202, RULE_typeArguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1625);
                match(LT);
                setState(1626);
                typeArgument();
                setState(1631);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(1627);
                            match(COMMA);
                            setState(1628);
                            typeArgument();
                        }
                    }
                    setState(1633);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1634);
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
        enterRule(_localctx, 204, RULE_superSuffix);
        try {
            setState(1642);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LPAREN:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1636);
                    arguments();
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1637);
                    match(DOT);
                    setState(1638);
                    match(IDENTIFIER);
                    setState(1640);
                    _errHandler.sync(this);
                    switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
                        case 1:
                        {
                            setState(1639);
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
        enterRule(_localctx, 206, RULE_explicitGenericInvocationSuffix);
        try {
            setState(1648);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case SUPER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1644);
                    match(SUPER);
                    setState(1645);
                    superSuffix();
                }
                break;
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1646);
                    match(IDENTIFIER);
                    setState(1647);
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
        enterRule(_localctx, 208, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1650);
                match(LPAREN);
                setState(1652);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
                    {
                        setState(1651);
                        expressionList();
                    }
                }

                setState(1654);
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
            case 83:
                return expression_sempred((ExpressionContext)_localctx, predIndex);
        }
        return true;
    }
    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 17);
            case 1:
                return precpred(_ctx, 16);
            case 2:
                return precpred(_ctx, 15);
            case 3:
                return precpred(_ctx, 14);
            case 4:
                return precpred(_ctx, 12);
            case 5:
                return precpred(_ctx, 11);
            case 6:
                return precpred(_ctx, 10);
            case 7:
                return precpred(_ctx, 9);
            case 8:
                return precpred(_ctx, 8);
            case 9:
                return precpred(_ctx, 7);
            case 10:
                return precpred(_ctx, 6);
            case 11:
                return precpred(_ctx, 5);
            case 12:
                return precpred(_ctx, 25);
            case 13:
                return precpred(_ctx, 24);
            case 14:
                return precpred(_ctx, 20);
            case 15:
                return precpred(_ctx, 13);
            case 16:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3w\u067b\4\2\t\2\4"+
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
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
                    "\2\3\2\7\2\u00d8\n\2\f\2\16\2\u00db\13\2\3\2\5\2\u00de\n\2\3\2\3\2\5\2"+
                    "\u00e2\n\2\3\2\3\2\3\2\7\2\u00e7\n\2\f\2\16\2\u00ea\13\2\3\2\5\2\u00ed"+
                    "\n\2\3\2\3\2\3\2\7\2\u00f2\n\2\f\2\16\2\u00f5\13\2\3\2\5\2\u00f8\n\2\3"+
                    "\2\3\2\5\2\u00fc\n\2\3\2\3\2\5\2\u0100\n\2\3\2\3\2\5\2\u0104\n\2\3\2\3"+
                    "\2\5\2\u0108\n\2\3\2\3\2\3\2\7\2\u010d\n\2\f\2\16\2\u0110\13\2\3\2\5\2"+
                    "\u0113\n\2\3\2\3\2\5\2\u0117\n\2\3\2\7\2\u011a\n\2\f\2\16\2\u011d\13\2"+
                    "\3\2\5\2\u0120\n\2\3\2\3\2\3\2\5\2\u0125\n\2\3\2\7\2\u0128\n\2\f\2\16"+
                    "\2\u012b\13\2\3\2\5\2\u012e\n\2\3\2\3\2\5\2\u0132\n\2\3\2\3\2\3\2\5\2"+
                    "\u0137\n\2\3\2\7\2\u013a\n\2\f\2\16\2\u013d\13\2\3\2\5\2\u0140\n\2\3\2"+
                    "\3\2\5\2\u0144\n\2\3\2\7\2\u0147\n\2\f\2\16\2\u014a\13\2\3\2\5\2\u014d"+
                    "\n\2\3\2\3\2\5\2\u0151\n\2\3\2\3\2\5\2\u0155\n\2\3\2\3\2\5\2\u0159\n\2"+
                    "\3\2\3\2\3\2\5\2\u015e\n\2\3\2\3\2\5\2\u0162\n\2\3\2\3\2\3\2\5\2\u0167"+
                    "\n\2\3\2\3\2\5\2\u016b\n\2\3\2\3\2\3\2\5\2\u0170\n\2\3\2\3\2\5\2\u0174"+
                    "\n\2\3\2\3\2\3\2\5\2\u0179\n\2\3\2\3\2\5\2\u017d\n\2\3\2\3\2\3\2\5\2\u0182"+
                    "\n\2\3\2\3\2\5\2\u0186\n\2\3\2\3\2\5\2\u018a\n\2\3\2\3\2\5\2\u018e\n\2"+
                    "\5\2\u0190\n\2\3\3\5\3\u0193\n\3\3\3\7\3\u0196\n\3\f\3\16\3\u0199\13\3"+
                    "\3\3\7\3\u019c\n\3\f\3\16\3\u019f\13\3\3\3\3\3\3\4\7\4\u01a4\n\4\f\4\16"+
                    "\4\u01a7\13\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u01af\n\5\3\5\3\5\3\5\5\5\u01b4"+
                    "\n\5\3\5\3\5\3\6\7\6\u01b9\n\6\f\6\16\6\u01bc\13\6\3\6\3\6\3\6\3\6\5\6"+
                    "\u01c2\n\6\3\6\5\6\u01c5\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u01cc\n\7\3\b\3\b"+
                    "\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01d6\n\b\3\t\3\t\5\t\u01da\n\t\3\n\3\n\3"+
                    "\n\5\n\u01df\n\n\3\n\3\n\5\n\u01e3\n\n\3\n\3\n\5\n\u01e7\n\n\3\n\3\n\3"+
                    "\13\3\13\3\13\3\13\7\13\u01ef\n\13\f\13\16\13\u01f2\13\13\3\13\3\13\3"+
                    "\f\7\f\u01f7\n\f\f\f\16\f\u01fa\13\f\3\f\3\f\3\f\5\f\u01ff\n\f\3\r\3\r"+
                    "\3\r\7\r\u0204\n\r\f\r\16\r\u0207\13\r\3\16\3\16\3\16\3\16\5\16\u020d"+
                    "\n\16\3\16\3\16\5\16\u0211\n\16\3\16\5\16\u0214\n\16\3\16\5\16\u0217\n"+
                    "\16\3\16\3\16\3\17\3\17\3\17\7\17\u021e\n\17\f\17\16\17\u0221\13\17\3"+
                    "\20\7\20\u0224\n\20\f\20\16\20\u0227\13\20\3\20\3\20\5\20\u022b\n\20\3"+
                    "\20\5\20\u022e\n\20\3\21\3\21\7\21\u0232\n\21\f\21\16\21\u0235\13\21\3"+
                    "\22\3\22\3\22\5\22\u023a\n\22\3\22\3\22\5\22\u023e\n\22\3\22\3\22\3\23"+
                    "\3\23\7\23\u0244\n\23\f\23\16\23\u0247\13\23\3\23\3\23\3\24\3\24\7\24"+
                    "\u024d\n\24\f\24\16\24\u0250\13\24\3\24\3\24\3\25\3\25\5\25\u0256\n\25"+
                    "\3\25\3\25\7\25\u025a\n\25\f\25\16\25\u025d\13\25\3\25\5\25\u0260\n\25"+
                    "\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u026b\n\26\3\27\3\27"+
                    "\3\27\3\27\3\27\7\27\u0272\n\27\f\27\16\27\u0275\13\27\3\27\3\27\5\27"+
                    "\u0279\n\27\3\27\3\27\3\30\3\30\5\30\u027f\n\30\3\31\3\31\5\31\u0283\n"+
                    "\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u028f\n\34"+
                    "\3\34\3\34\3\35\3\35\3\35\3\35\3\36\7\36\u0298\n\36\f\36\16\36\u029b\13"+
                    "\36\3\36\3\36\5\36\u029f\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
                    "\u02a8\n\37\3 \3 \3 \3 \7 \u02ae\n \f \16 \u02b1\13 \3 \3 \3!\3!\3!\7"+
                    "!\u02b8\n!\f!\16!\u02bb\13!\3!\3!\3!\3\"\7\"\u02c1\n\"\f\"\16\"\u02c4"+
                    "\13\"\3\"\3\"\3\"\7\"\u02c9\n\"\f\"\16\"\u02cc\13\"\3\"\3\"\5\"\u02d0"+
                    "\n\"\3\"\3\"\3\"\3\"\7\"\u02d6\n\"\f\"\16\"\u02d9\13\"\3\"\3\"\5\"\u02dd"+
                    "\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u02e7\n#\3$\3$\3$\3%\3%\3%\7%\u02ef"+
                    "\n%\f%\16%\u02f2\13%\3&\3&\3&\5&\u02f7\n&\3\'\3\'\3\'\7\'\u02fc\n\'\f"+
                    "\'\16\'\u02ff\13\'\3(\3(\5(\u0303\n(\3)\3)\3)\3)\7)\u0309\n)\f)\16)\u030c"+
                    "\13)\3)\5)\u030f\n)\5)\u0311\n)\3)\3)\3*\3*\5*\u0317\n*\3*\3*\3*\5*\u031c"+
                    "\n*\7*\u031e\n*\f*\16*\u0321\13*\3+\3+\3+\3+\5+\u0327\n+\5+\u0329\n+\3"+
                    ",\3,\3,\7,\u032e\n,\f,\16,\u0331\13,\3-\3-\5-\u0335\n-\3-\3-\3.\3.\3."+
                    "\7.\u033c\n.\f.\16.\u033f\13.\3.\3.\5.\u0343\n.\3.\5.\u0346\n.\3/\7/\u0349"+
                    "\n/\f/\16/\u034c\13/\3/\3/\3/\3\60\7\60\u0352\n\60\f\60\16\60\u0355\13"+
                    "\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u035e\n\61\f\61\16\61\u0361"+
                    "\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u036a\n\62\3\63\3\63\3"+
                    "\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u0375\n\65\3\65\5\65\u0378\n\65"+
                    "\3\66\3\66\3\66\7\66\u037d\n\66\f\66\16\66\u0380\13\66\3\67\3\67\3\67"+
                    "\3\67\38\38\38\58\u0389\n8\39\39\39\39\79\u038f\n9\f9\169\u0392\139\5"+
                    "9\u0394\n9\39\59\u0397\n9\39\39\3:\3:\3:\3:\3:\3;\3;\7;\u03a2\n;\f;\16"+
                    ";\u03a5\13;\3;\3;\3<\7<\u03aa\n<\f<\16<\u03ad\13<\3<\3<\5<\u03b1\n<\3"+
                    "=\3=\3=\3=\3=\3=\5=\u03b9\n=\3=\3=\5=\u03bd\n=\3=\3=\5=\u03c1\n=\3=\3"+
                    "=\5=\u03c5\n=\5=\u03c7\n=\3>\3>\5>\u03cb\n>\3?\3?\3?\3?\5?\u03d1\n?\3"+
                    "@\3@\3A\3A\3A\3B\5B\u03d9\nB\3B\3B\5B\u03dd\nB\3B\7B\u03e0\nB\fB\16B\u03e3"+
                    "\13B\3B\5B\u03e6\nB\3B\3B\3C\3C\3C\3C\3C\5C\u03ef\nC\3D\7D\u03f2\nD\f"+
                    "D\16D\u03f5\13D\3D\3D\3D\3E\7E\u03fb\nE\fE\16E\u03fe\13E\3E\3E\5E\u0402"+
                    "\nE\3E\5E\u0405\nE\3F\3F\3F\3F\3F\5F\u040c\nF\3F\3F\3F\3F\3F\3F\7F\u0414"+
                    "\nF\fF\16F\u0417\13F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
                    "F\3F\3F\3F\7F\u042d\nF\fF\16F\u0430\13F\3F\7F\u0433\nF\fF\16F\u0436\13"+
                    "F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0446\nF\3F\3F\3F\3F\3"+
                    "F\3F\3F\5F\u044f\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
                    "F\3F\3F\6F\u0464\nF\rF\16F\u0465\3F\5F\u0469\nF\3F\5F\u046c\nF\3F\3F\3"+
                    "F\3F\7F\u0472\nF\fF\16F\u0475\13F\3F\5F\u0478\nF\3F\3F\3F\3F\7F\u047e"+
                    "\nF\fF\16F\u0481\13F\3F\7F\u0484\nF\fF\16F\u0487\13F\3F\3F\3F\3F\3F\3"+
                    "F\3F\3F\5F\u0491\nF\3F\3F\3F\3F\3F\3F\3F\5F\u049a\nF\3F\3F\3F\5F\u049f"+
                    "\nF\3F\3F\3F\3F\3F\3F\3F\3F\5F\u04a9\nF\3G\3G\3G\7G\u04ae\nG\fG\16G\u04b1"+
                    "\13G\3G\3G\3G\3G\3G\3H\3H\3H\7H\u04bb\nH\fH\16H\u04be\13H\3I\3I\3I\3J"+
                    "\3J\3J\5J\u04c6\nJ\3J\3J\3K\3K\3K\7K\u04cd\nK\fK\16K\u04d0\13K\3L\7L\u04d3"+
                    "\nL\fL\16L\u04d6\13L\3L\3L\3L\3L\3L\3M\6M\u04de\nM\rM\16M\u04df\3M\6M"+
                    "\u04e3\nM\rM\16M\u04e4\3N\3N\3N\5N\u04ea\nN\3N\3N\3N\5N\u04ef\nN\3O\3"+
                    "O\5O\u04f3\nO\3O\3O\5O\u04f7\nO\3O\3O\5O\u04fb\nO\5O\u04fd\nO\3P\3P\5"+
                    "P\u0501\nP\3Q\7Q\u0504\nQ\fQ\16Q\u0507\13Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R"+
                    "\3R\3R\3R\5R\u0515\nR\3S\3S\3S\3S\7S\u051b\nS\fS\16S\u051e\13S\3S\3S\3"+
                    "S\7S\u0523\nS\fS\16S\u0526\13S\5S\u0528\nS\3T\3T\3T\5T\u052d\nT\3T\3T"+
                    "\3T\3T\5T\u0533\nT\3T\3T\3T\3T\5T\u0539\nT\3T\5T\u053c\nT\3U\3U\3U\3U"+
                    "\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0550\nU\3U\3U\5U\u0554"+
                    "\nU\3U\3U\3U\5U\u0559\nU\3U\3U\5U\u055d\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
                    "\3U\3U\3U\3U\3U\5U\u056d\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
                    "\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
                    "\3U\5U\u0595\nU\3U\3U\3U\3U\5U\u059b\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
                    "\3U\3U\3U\5U\u05aa\nU\3U\7U\u05ad\nU\fU\16U\u05b0\13U\3V\3V\3V\3V\3W\3"+
                    "W\3W\5W\u05b9\nW\3W\3W\3W\3W\3W\7W\u05c0\nW\fW\16W\u05c3\13W\3W\5W\u05c6"+
                    "\nW\3X\3X\5X\u05ca\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
                    "\5Y\u05dc\nY\5Y\u05de\nY\3Z\3Z\3Z\5Z\u05e3\nZ\3Z\7Z\u05e6\nZ\fZ\16Z\u05e9"+
                    "\13Z\3Z\3Z\5Z\u05ed\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u05f6\n[\5[\u05f8\n[\3"+
                    "\\\3\\\5\\\u05fc\n\\\3\\\3\\\3\\\5\\\u0601\n\\\7\\\u0603\n\\\f\\\16\\"+
                    "\u0606\13\\\3\\\5\\\u0609\n\\\3]\3]\5]\u060d\n]\3]\3]\3^\3^\3^\3^\7^\u0615"+
                    "\n^\f^\16^\u0618\13^\3^\3^\3^\3^\3^\3^\3^\7^\u0621\n^\f^\16^\u0624\13"+
                    "^\3^\3^\7^\u0628\n^\f^\16^\u062b\13^\5^\u062d\n^\3_\3_\5_\u0631\n_\3`"+
                    "\3`\3`\3a\3a\3a\5a\u0639\na\3b\3b\3b\5b\u063e\nb\3c\3c\3c\3c\3d\3d\3d"+
                    "\7d\u0647\nd\fd\16d\u064a\13d\3e\5e\u064d\ne\3e\3e\5e\u0651\ne\3e\3e\7"+
                    "e\u0655\ne\fe\16e\u0658\13e\3f\3f\3g\3g\3g\3g\7g\u0660\ng\fg\16g\u0663"+
                    "\13g\3g\3g\3h\3h\3h\3h\5h\u066b\nh\5h\u066d\nh\3i\3i\3i\3i\5i\u0673\n"+
                    "i\3j\3j\5j\u0677\nj\3j\3j\3j\2\3\u00a8k\2\4\6\b\n\f\16\20\22\24\26\30"+
                    "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
                    "\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
                    "\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
                    "\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
                    "\u00ca\u00cc\u00ce\u00d0\u00d2\2\16\4\2\23\23**\3\2:=\3\2>?\3\2Z]\3\2"+
                    "PQ\4\2^_cc\3\2\\]\5\2NOUVdd\4\2TTWW\4\2MMeo\3\2Z[\n\2\5\5\7\7\n\n\20\20"+
                    "\26\26\35\35\37\37\'\'\2\u075c\2\u018f\3\2\2\2\4\u0192\3\2\2\2\6\u01a5"+
                    "\3\2\2\2\b\u01ac\3\2\2\2\n\u01c4\3\2\2\2\f\u01cb\3\2\2\2\16\u01d5\3\2"+
                    "\2\2\20\u01d9\3\2\2\2\22\u01db\3\2\2\2\24\u01ea\3\2\2\2\26\u01f8\3\2\2"+
                    "\2\30\u0200\3\2\2\2\32\u0208\3\2\2\2\34\u021a\3\2\2\2\36\u0225\3\2\2\2"+
                    " \u022f\3\2\2\2\"\u0236\3\2\2\2$\u0241\3\2\2\2&\u024a\3\2\2\2(\u025f\3"+
                    "\2\2\2*\u026a\3\2\2\2,\u026c\3\2\2\2.\u027e\3\2\2\2\60\u0282\3\2\2\2\62"+
                    "\u0284\3\2\2\2\64\u0287\3\2\2\2\66\u028a\3\2\2\28\u0292\3\2\2\2:\u029e"+
                    "\3\2\2\2<\u02a7\3\2\2\2>\u02a9\3\2\2\2@\u02b4\3\2\2\2B\u02c2\3\2\2\2D"+
                    "\u02e6\3\2\2\2F\u02e8\3\2\2\2H\u02eb\3\2\2\2J\u02f3\3\2\2\2L\u02f8\3\2"+
                    "\2\2N\u0302\3\2\2\2P\u0304\3\2\2\2R\u0314\3\2\2\2T\u0328\3\2\2\2V\u032a"+
                    "\3\2\2\2X\u0332\3\2\2\2Z\u0345\3\2\2\2\\\u034a\3\2\2\2^\u0353\3\2\2\2"+
                    "`\u035a\3\2\2\2b\u0369\3\2\2\2d\u036b\3\2\2\2f\u036d\3\2\2\2h\u036f\3"+
                    "\2\2\2j\u0379\3\2\2\2l\u0381\3\2\2\2n\u0388\3\2\2\2p\u038a\3\2\2\2r\u039a"+
                    "\3\2\2\2t\u039f\3\2\2\2v\u03b0\3\2\2\2x\u03c6\3\2\2\2z\u03ca\3\2\2\2|"+
                    "\u03cc\3\2\2\2~\u03d2\3\2\2\2\u0080\u03d4\3\2\2\2\u0082\u03d8\3\2\2\2"+
                    "\u0084\u03ee\3\2\2\2\u0086\u03f3\3\2\2\2\u0088\u0404\3\2\2\2\u008a\u04a8"+
                    "\3\2\2\2\u008c\u04aa\3\2\2\2\u008e\u04b7\3\2\2\2\u0090\u04bf\3\2\2\2\u0092"+
                    "\u04c2\3\2\2\2\u0094\u04c9\3\2\2\2\u0096\u04d4\3\2\2\2\u0098\u04dd\3\2"+
                    "\2\2\u009a\u04ee\3\2\2\2\u009c\u04fc\3\2\2\2\u009e\u0500\3\2\2\2\u00a0"+
                    "\u0505\3\2\2\2\u00a2\u0514\3\2\2\2\u00a4\u0527\3\2\2\2\u00a6\u053b\3\2"+
                    "\2\2\u00a8\u055c\3\2\2\2\u00aa\u05b1\3\2\2\2\u00ac\u05c5\3\2\2\2\u00ae"+
                    "\u05c9\3\2\2\2\u00b0\u05dd\3\2\2\2\u00b2\u05e2\3\2\2\2\u00b4\u05f7\3\2"+
                    "\2\2\u00b6\u0608\3\2\2\2\u00b8\u060a\3\2\2\2\u00ba\u0610\3\2\2\2\u00bc"+
                    "\u062e\3\2\2\2\u00be\u0632\3\2\2\2\u00c0\u0638\3\2\2\2\u00c2\u063d\3\2"+
                    "\2\2\u00c4\u063f\3\2\2\2\u00c6\u0643\3\2\2\2\u00c8\u064c\3\2\2\2\u00ca"+
                    "\u0659\3\2\2\2\u00cc\u065b\3\2\2\2\u00ce\u066c\3\2\2\2\u00d0\u0672\3\2"+
                    "\2\2\u00d2\u0674\3\2\2\2\u00d4\u00d9\5\u0084C\2\u00d5\u00d6\78\2\2\u00d6"+
                    "\u00d8\5\u0084C\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
                    "\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
                    "\u00de\78\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2"+
                    "\2\2\u00df\u00e1\7p\2\2\u00e0\u00e2\78\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2"+
                    "\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\5\u0084C\2\u00e4\u00e5\78\2\2"+
                    "\u00e5\u00e7\5\u0084C\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
                    "\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
                    "\2\2\u00eb\u00ed\78\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
                    "\u0190\3\2\2\2\u00ee\u00f3\5\u0084C\2\u00ef\u00f0\78\2\2\u00f0\u00f2\5"+
                    "\u0084C\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2"+
                    "\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8"+
                    "\78\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
                    "\u00fb\7p\2\2\u00fa\u00fc\78\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2"+
                    "\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7\66\2\2\u00fe\u0100\78\2\2\u00ff\u00fe"+
                    "\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0190\3\2\2\2\u0101\u0103\7\66\2\2"+
                    "\u0102\u0104\78\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
                    "\3\2\2\2\u0105\u0107\7p\2\2\u0106\u0108\78\2\2\u0107\u0106\3\2\2\2\u0107"+
                    "\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010e\5\u0084C\2\u010a\u010b"+
                    "\78\2\2\u010b\u010d\5\u0084C\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2"+
                    "\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
                    "\3\2\2\2\u0111\u0113\78\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
                    "\u0190\3\2\2\2\u0114\u011b\5\b\5\2\u0115\u0117\78\2\2\u0116\u0115\3\2"+
                    "\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\5\b\5\2\u0119"+
                    "\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
                    "\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\78\2\2\u011f"+
                    "\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7p"+
                    "\2\2\u0122\u0129\5\b\5\2\u0123\u0125\78\2\2\u0124\u0123\3\2\2\2\u0124"+
                    "\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\5\b\5\2\u0127\u0124\3\2"+
                    "\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
                    "\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\78\2\2\u012d\u012c\3\2"+
                    "\2\2\u012d\u012e\3\2\2\2\u012e\u0190\3\2\2\2\u012f\u0131\7\66\2\2\u0130"+
                    "\u0132\78\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
                    "\2\2\u0133\u0134\7p\2\2\u0134\u013b\5\b\5\2\u0135\u0137\78\2\2\u0136\u0135"+
                    "\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\5\b\5\2\u0139"+
                    "\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
                    "\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\78\2\2\u013f"+
                    "\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0190\3\2\2\2\u0141\u0148\5\b"+
                    "\5\2\u0142\u0144\78\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
                    "\u0145\3\2\2\2\u0145\u0147\5\b\5\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2"+
                    "\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
                    "\u0148\3\2\2\2\u014b\u014d\78\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2"+
                    "\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7p\2\2\u014f\u0151\78\2\2\u0150\u014f"+
                    "\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\7\66\2\2"+
                    "\u0153\u0155\78\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0190"+
                    "\3\2\2\2\u0156\u0158\5(\25\2\u0157\u0159\78\2\2\u0158\u0157\3\2\2\2\u0158"+
                    "\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7p\2\2\u015b\u015d\5(\25"+
                    "\2\u015c\u015e\78\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0190"+
                    "\3\2\2\2\u015f\u0161\5\n\6\2\u0160\u0162\78\2\2\u0161\u0160\3\2\2\2\u0161"+
                    "\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7p\2\2\u0164\u0166\5\n"+
                    "\6\2\u0165\u0167\78\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
                    "\u0190\3\2\2\2\u0168\u016a\5h\65\2\u0169\u016b\78\2\2\u016a\u0169\3\2"+
                    "\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7p\2\2\u016d"+
                    "\u016f\5h\65\2\u016e\u0170\78\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2"+
                    "\2\2\u0170\u0190\3\2\2\2\u0171\u0173\5\6\4\2\u0172\u0174\78\2\2\u0173"+
                    "\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7p"+
                    "\2\2\u0176\u0178\5\6\4\2\u0177\u0179\78\2\2\u0178\u0177\3\2\2\2\u0178"+
                    "\u0179\3\2\2\2\u0179\u0190\3\2\2\2\u017a\u017c\7\66\2\2\u017b\u017d\7"+
                    "8\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
                    "\u017f\7p\2\2\u017f\u0181\5\6\4\2\u0180\u0182\78\2\2\u0181\u0180\3\2\2"+
                    "\2\u0181\u0182\3\2\2\2\u0182\u0190\3\2\2\2\u0183\u0185\5\6\4\2\u0184\u0186"+
                    "\78\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
                    "\u0189\7p\2\2\u0188\u018a\78\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2"+
                    "\2\u018a\u018b\3\2\2\2\u018b\u018d\7\66\2\2\u018c\u018e\78\2\2\u018d\u018c"+
                    "\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u00d4\3\2\2\2\u018f"+
                    "\u00ee\3\2\2\2\u018f\u0101\3\2\2\2\u018f\u0114\3\2\2\2\u018f\u012f\3\2"+
                    "\2\2\u018f\u0141\3\2\2\2\u018f\u0156\3\2\2\2\u018f\u015f\3\2\2\2\u018f"+
                    "\u0168\3\2\2\2\u018f\u0171\3\2\2\2\u018f\u017a\3\2\2\2\u018f\u0183\3\2"+
                    "\2\2\u0190\3\3\2\2\2\u0191\u0193\5\6\4\2\u0192\u0191\3\2\2\2\u0192\u0193"+
                    "\3\2\2\2\u0193\u0197\3\2\2\2\u0194\u0196\5\b\5\2\u0195\u0194\3\2\2\2\u0196"+
                    "\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019d\3\2"+
                    "\2\2\u0199\u0197\3\2\2\2\u019a\u019c\5\n\6\2\u019b\u019a\3\2\2\2\u019c"+
                    "\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2"+
                    "\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\2\2\3\u01a1\5\3\2\2\2\u01a2\u01a4"+
                    "\5h\65\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
                    "\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\""+
                    "\2\2\u01a9\u01aa\5`\61\2\u01aa\u01ab\7J\2\2\u01ab\7\3\2\2\2\u01ac\u01ae"+
                    "\7\33\2\2\u01ad\u01af\7(\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
                    "\u01b0\3\2\2\2\u01b0\u01b3\5`\61\2\u01b1\u01b2\7L\2\2\u01b2\u01b4\7^\2"+
                    "\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6"+
                    "\7J\2\2\u01b6\t\3\2\2\2\u01b7\u01b9\5\16\b\2\u01b8\u01b7\3\2\2\2\u01b9"+
                    "\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c1\3\2"+
                    "\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c2\5\22\n\2\u01be\u01c2\5\32\16\2\u01bf"+
                    "\u01c2\5\"\22\2\u01c0\u01c2\5r:\2\u01c1\u01bd\3\2\2\2\u01c1\u01be\3\2"+
                    "\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
                    "\u01c5\7J\2\2\u01c4\u01ba\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\13\3\2\2\2"+
                    "\u01c6\u01cc\5\16\b\2\u01c7\u01cc\7 \2\2\u01c8\u01cc\7,\2\2\u01c9\u01cc"+
                    "\7\60\2\2\u01ca\u01cc\7\63\2\2\u01cb\u01c6\3\2\2\2\u01cb\u01c7\3\2\2\2"+
                    "\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\r\3"+
                    "\2\2\2\u01cd\u01d6\5h\65\2\u01ce\u01d6\7%\2\2\u01cf\u01d6\7$\2\2\u01d0"+
                    "\u01d6\7#\2\2\u01d1\u01d6\7(\2\2\u01d2\u01d6\7\3\2\2\u01d3\u01d6\7\24"+
                    "\2\2\u01d4\u01d6\7)\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01ce\3\2\2\2\u01d5"+
                    "\u01cf\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d2\3\2"+
                    "\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\17\3\2\2\2\u01d7\u01da"+
                    "\7\24\2\2\u01d8\u01da\5h\65\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2"+
                    "\u01da\21\3\2\2\2\u01db\u01dc\7\13\2\2\u01dc\u01de\7w\2\2\u01dd\u01df"+
                    "\5\24\13\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2"+
                    "\u01e0\u01e1\7\23\2\2\u01e1\u01e3\5\u00c8e\2\u01e2\u01e0\3\2\2\2\u01e2"+
                    "\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e5\7\32\2\2\u01e5\u01e7\5"+
                    "\u00c6d\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2"+
                    "\u01e8\u01e9\5$\23\2\u01e9\23\3\2\2\2\u01ea\u01eb\7O\2\2\u01eb\u01f0\5"+
                    "\26\f\2\u01ec\u01ed\7K\2\2\u01ed\u01ef\5\26\f\2\u01ee\u01ec\3\2\2\2\u01ef"+
                    "\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2"+
                    "\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7N\2\2\u01f4\25\3\2\2\2\u01f5\u01f7"+
                    "\5h\65\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
                    "\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\7w"+
                    "\2\2\u01fc\u01fd\7\23\2\2\u01fd\u01ff\5\30\r\2\u01fe\u01fc\3\2\2\2\u01fe"+
                    "\u01ff\3\2\2\2\u01ff\27\3\2\2\2\u0200\u0205\5\u00c8e\2\u0201\u0202\7`"+
                    "\2\2\u0202\u0204\5\u00c8e\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
                    "\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\31\3\2\2\2\u0207\u0205\3\2\2"+
                    "\2\u0208\u0209\7\22\2\2\u0209\u020c\7w\2\2\u020a\u020b\7\32\2\2\u020b"+
                    "\u020d\5\u00c6d\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"+
                    "\3\2\2\2\u020e\u0210\7F\2\2\u020f\u0211\5\34\17\2\u0210\u020f\3\2\2\2"+
                    "\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\7K\2\2\u0213\u0212"+
                    "\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\5 \21\2\u0216"+
                    "\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\7G"+
                    "\2\2\u0219\33\3\2\2\2\u021a\u021f\5\36\20\2\u021b\u021c\7K\2\2\u021c\u021e"+
                    "\5\36\20\2\u021d\u021b\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2"+
                    "\u021f\u0220\3\2\2\2\u0220\35\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224"+
                    "\5h\65\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
                    "\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022a\7w"+
                    "\2\2\u0229\u022b\5\u00d2j\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
                    "\u022d\3\2\2\2\u022c\u022e\5$\23\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2"+
                    "\2\2\u022e\37\3\2\2\2\u022f\u0233\7J\2\2\u0230\u0232\5(\25\2\u0231\u0230"+
                    "\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
                    "!\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7\36\2\2\u0237\u0239\7w\2\2"+
                    "\u0238\u023a\5\24\13\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023d"+
                    "\3\2\2\2\u023b\u023c\7\23\2\2\u023c\u023e\5\u00c6d\2\u023d\u023b\3\2\2"+
                    "\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\5&\24\2\u0240#"+
                    "\3\2\2\2\u0241\u0245\7F\2\2\u0242\u0244\5(\25\2\u0243\u0242\3\2\2\2\u0244"+
                    "\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2"+
                    "\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7G\2\2\u0249%\3\2\2\2\u024a\u024e"+
                    "\7F\2\2\u024b\u024d\5:\36\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
                    "\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2"+
                    "\2\2\u0251\u0252\7G\2\2\u0252\'\3\2\2\2\u0253\u0260\7J\2\2\u0254\u0256"+
                    "\7(\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
                    "\u0260\5\u0082B\2\u0258\u025a\5\f\7\2\u0259\u0258\3\2\2\2\u025a\u025d"+
                    "\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d"+
                    "\u025b\3\2\2\2\u025e\u0260\5*\26\2\u025f\u0253\3\2\2\2\u025f\u0255\3\2"+
                    "\2\2\u025f\u025b\3\2\2\2\u0260)\3\2\2\2\u0261\u026b\5,\27\2\u0262\u026b"+
                    "\5\62\32\2\u0263\u026b\58\35\2\u0264\u026b\5\66\34\2\u0265\u026b\5\64"+
                    "\33\2\u0266\u026b\5\"\22\2\u0267\u026b\5r:\2\u0268\u026b\5\22\n\2\u0269"+
                    "\u026b\5\32\16\2\u026a\u0261\3\2\2\2\u026a\u0262\3\2\2\2\u026a\u0263\3"+
                    "\2\2\2\u026a\u0264\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026a"+
                    "\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026b+\3\2\2\2"+
                    "\u026c\u026d\5\60\31\2\u026d\u026e\7w\2\2\u026e\u0273\5X-\2\u026f\u0270"+
                    "\7H\2\2\u0270\u0272\7I\2\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
                    "\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0278\3\2\2\2\u0275\u0273\3\2"+
                    "\2\2\u0276\u0277\7/\2\2\u0277\u0279\5V,\2\u0278\u0276\3\2\2\2\u0278\u0279"+
                    "\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\5.\30\2\u027b-\3\2\2\2\u027c"+
                    "\u027f\5\u0082B\2\u027d\u027f\7J\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3"+
                    "\2\2\2\u027f/\3\2\2\2\u0280\u0283\5\u00c8e\2\u0281\u0283\7\62\2\2\u0282"+
                    "\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\61\3\2\2\2\u0284\u0285\5\24\13"+
                    "\2\u0285\u0286\5,\27\2\u0286\63\3\2\2\2\u0287\u0288\5\24\13\2\u0288\u0289"+
                    "\5\66\34\2\u0289\65\3\2\2\2\u028a\u028b\7w\2\2\u028b\u028e\5X-\2\u028c"+
                    "\u028d\7/\2\2\u028d\u028f\5V,\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2"+
                    "\2\u028f\u0290\3\2\2\2\u0290\u0291\5\u0082B\2\u0291\67\3\2\2\2\u0292\u0293"+
                    "\5\u00c8e\2\u0293\u0294\5H%\2\u0294\u0295\7J\2\2\u02959\3\2\2\2\u0296"+
                    "\u0298\5\f\7\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2"+
                    "\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c"+
                    "\u029f\5<\37\2\u029d\u029f\7J\2\2\u029e\u0299\3\2\2\2\u029e\u029d\3\2"+
                    "\2\2\u029f;\3\2\2\2\u02a0\u02a8\5> \2\u02a1\u02a8\5B\"\2\u02a2\u02a8\5"+
                    "F$\2\u02a3\u02a8\5\"\22\2\u02a4\u02a8\5r:\2\u02a5\u02a8\5\22\n\2\u02a6"+
                    "\u02a8\5\32\16\2\u02a7\u02a0\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a2\3"+
                    "\2\2\2\u02a7\u02a3\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7"+
                    "\u02a6\3\2\2\2\u02a8=\3\2\2\2\u02a9\u02aa\5\u00c8e\2\u02aa\u02af\5@!\2"+
                    "\u02ab\u02ac\7K\2\2\u02ac\u02ae\5@!\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1"+
                    "\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1"+
                    "\u02af\3\2\2\2\u02b2\u02b3\7J\2\2\u02b3?\3\2\2\2\u02b4\u02b9\7w\2\2\u02b5"+
                    "\u02b6\7H\2\2\u02b6\u02b8\7I\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2"+
                    "\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9"+
                    "\3\2\2\2\u02bc\u02bd\7M\2\2\u02bd\u02be\5N(\2\u02beA\3\2\2\2\u02bf\u02c1"+
                    "\5D#\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
                    "\u02c3\3\2\2\2\u02c3\u02cf\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02d0\5\60"+
                    "\31\2\u02c6\u02ca\5\24\13\2\u02c7\u02c9\5h\65\2\u02c8\u02c7\3\2\2\2\u02c9"+
                    "\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2"+
                    "\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\5\60\31\2\u02ce\u02d0\3\2\2\2\u02cf"+
                    "\u02c5\3\2\2\2\u02cf\u02c6\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7w"+
                    "\2\2\u02d2\u02d7\5X-\2\u02d3\u02d4\7H\2\2\u02d4\u02d6\7I\2\2\u02d5\u02d3"+
                    "\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
                    "\u02dc\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7/\2\2\u02db\u02dd\5V,"+
                    "\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df"+
                    "\5.\30\2\u02dfC\3\2\2\2\u02e0\u02e7\5h\65\2\u02e1\u02e7\7%\2\2\u02e2\u02e7"+
                    "\7\3\2\2\u02e3\u02e7\7\16\2\2\u02e4\u02e7\7(\2\2\u02e5\u02e7\7)\2\2\u02e6"+
                    "\u02e0\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e6\u02e3\3\2"+
                    "\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7E\3\2\2\2\u02e8\u02e9"+
                    "\5\24\13\2\u02e9\u02ea\5B\"\2\u02eaG\3\2\2\2\u02eb\u02f0\5J&\2\u02ec\u02ed"+
                    "\7K\2\2\u02ed\u02ef\5J&\2\u02ee\u02ec\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0"+
                    "\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1I\3\2\2\2\u02f2\u02f0\3\2\2\2"+
                    "\u02f3\u02f6\5L\'\2\u02f4\u02f5\7M\2\2\u02f5\u02f7\5N(\2\u02f6\u02f4\3"+
                    "\2\2\2\u02f6\u02f7\3\2\2\2\u02f7K\3\2\2\2\u02f8\u02fd\7w\2\2\u02f9\u02fa"+
                    "\7H\2\2\u02fa\u02fc\7I\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
                    "\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02feM\3\2\2\2\u02ff\u02fd\3\2\2\2"+
                    "\u0300\u0303\5P)\2\u0301\u0303\5\u00a8U\2\u0302\u0300\3\2\2\2\u0302\u0301"+
                    "\3\2\2\2\u0303O\3\2\2\2\u0304\u0310\7F\2\2\u0305\u030a\5N(\2\u0306\u0307"+
                    "\7K\2\2\u0307\u0309\5N(\2\u0308\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a"+
                    "\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2"+
                    "\2\2\u030d\u030f\7K\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
                    "\u0311\3\2\2\2\u0310\u0305\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2"+
                    "\2\2\u0312\u0313\7G\2\2\u0313Q\3\2\2\2\u0314\u0316\7w\2\2\u0315\u0317"+
                    "\5\u00ccg\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u031f\3\2\2"+
                    "\2\u0318\u0319\7L\2\2\u0319\u031b\7w\2\2\u031a\u031c\5\u00ccg\2\u031b"+
                    "\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u0318\3\2"+
                    "\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
                    "S\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0329\5\u00c8e\2\u0323\u0326\7R\2"+
                    "\2\u0324\u0325\t\2\2\2\u0325\u0327\5\u00c8e\2\u0326\u0324\3\2\2\2\u0326"+
                    "\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u0322\3\2\2\2\u0328\u0323\3\2"+
                    "\2\2\u0329U\3\2\2\2\u032a\u032f\5`\61\2\u032b\u032c\7K\2\2\u032c\u032e"+
                    "\5`\61\2\u032d\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
                    "\u0330\3\2\2\2\u0330W\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0334\7D\2\2\u0333"+
                    "\u0335\5Z.\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2"+
                    "\2\u0336\u0337\7E\2\2\u0337Y\3\2\2\2\u0338\u033d\5\\/\2\u0339\u033a\7"+
                    "K\2\2\u033a\u033c\5\\/\2\u033b\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
                    "\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0342\3\2\2\2\u033f\u033d\3\2"+
                    "\2\2\u0340\u0341\7K\2\2\u0341\u0343\5^\60\2\u0342\u0340\3\2\2\2\u0342"+
                    "\u0343\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0346\5^\60\2\u0345\u0338\3\2"+
                    "\2\2\u0345\u0344\3\2\2\2\u0346[\3\2\2\2\u0347\u0349\5\20\t\2\u0348\u0347"+
                    "\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
                    "\u034d\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\5\u00c8e\2\u034e\u034f"+
                    "\5L\'\2\u034f]\3\2\2\2\u0350\u0352\5\20\t\2\u0351\u0350\3\2\2\2\u0352"+
                    "\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2"+
                    "\2\2\u0355\u0353\3\2\2\2\u0356\u0357\5\u00c8e\2\u0357\u0358\7s\2\2\u0358"+
                    "\u0359\5L\'\2\u0359_\3\2\2\2\u035a\u035f\7w\2\2\u035b\u035c\7L\2\2\u035c"+
                    "\u035e\7w\2\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2"+
                    "\2\2\u035f\u0360\3\2\2\2\u0360a\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u036a"+
                    "\5d\63\2\u0363\u036a\5f\64\2\u0364\u036a\7A\2\2\u0365\u036a\7B\2\2\u0366"+
                    "\u036a\7@\2\2\u0367\u036a\7C\2\2\u0368\u036a\79\2\2\u0369\u0362\3\2\2"+
                    "\2\u0369\u0363\3\2\2\2\u0369\u0364\3\2\2\2\u0369\u0365\3\2\2\2\u0369\u0366"+
                    "\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036ac\3\2\2\2\u036b"+
                    "\u036c\t\3\2\2\u036ce\3\2\2\2\u036d\u036e\t\4\2\2\u036eg\3\2\2\2\u036f"+
                    "\u0370\7r\2\2\u0370\u0377\5`\61\2\u0371\u0374\7D\2\2\u0372\u0375\5j\66"+
                    "\2\u0373\u0375\5n8\2\u0374\u0372\3\2\2\2\u0374\u0373\3\2\2\2\u0374\u0375"+
                    "\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\7E\2\2\u0377\u0371\3\2\2\2\u0377"+
                    "\u0378\3\2\2\2\u0378i\3\2\2\2\u0379\u037e\5l\67\2\u037a\u037b\7K\2\2\u037b"+
                    "\u037d\5l\67\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2"+
                    "\2\2\u037e\u037f\3\2\2\2\u037fk\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0382"+
                    "\7w\2\2\u0382\u0383\7M\2\2\u0383\u0384\5n8\2\u0384m\3\2\2\2\u0385\u0389"+
                    "\5\u00a8U\2\u0386\u0389\5h\65\2\u0387\u0389\5p9\2\u0388\u0385\3\2\2\2"+
                    "\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389o\3\2\2\2\u038a\u0393\7"+
                    "F\2\2\u038b\u0390\5n8\2\u038c\u038d\7K\2\2\u038d\u038f\5n8\2\u038e\u038c"+
                    "\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
                    "\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u038b\3\2\2\2\u0393\u0394\3\2"+
                    "\2\2\u0394\u0396\3\2\2\2\u0395\u0397\7K\2\2\u0396\u0395\3\2\2\2\u0396"+
                    "\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\7G\2\2\u0399q\3\2\2\2\u039a"+
                    "\u039b\7r\2\2\u039b\u039c\7\36\2\2\u039c\u039d\7w\2\2\u039d\u039e\5t;"+
                    "\2\u039es\3\2\2\2\u039f\u03a3\7F\2\2\u03a0\u03a2\5v<\2\u03a1\u03a0\3\2"+
                    "\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
                    "\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7\7G\2\2\u03a7u\3\2\2\2\u03a8"+
                    "\u03aa\5\f\7\2\u03a9\u03a8\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2"+
                    "\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae"+
                    "\u03b1\5x=\2\u03af\u03b1\7J\2\2\u03b0\u03ab\3\2\2\2\u03b0\u03af\3\2\2"+
                    "\2\u03b1w\3\2\2\2\u03b2\u03b3\5\u00c8e\2\u03b3\u03b4\5z>\2\u03b4\u03b5"+
                    "\7J\2\2\u03b5\u03c7\3\2\2\2\u03b6\u03b8\5\22\n\2\u03b7\u03b9\7J\2\2\u03b8"+
                    "\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03c7\3\2\2\2\u03ba\u03bc\5\""+
                    "\22\2\u03bb\u03bd\7J\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
                    "\u03c7\3\2\2\2\u03be\u03c0\5\32\16\2\u03bf\u03c1\7J\2\2\u03c0\u03bf\3"+
                    "\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c7\3\2\2\2\u03c2\u03c4\5r:\2\u03c3"+
                    "\u03c5\7J\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2"+
                    "\2\2\u03c6\u03b2\3\2\2\2\u03c6\u03b6\3\2\2\2\u03c6\u03ba\3\2\2\2\u03c6"+
                    "\u03be\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c7y\3\2\2\2\u03c8\u03cb\5|?\2\u03c9"+
                    "\u03cb\5~@\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cb{\3\2\2\2\u03cc"+
                    "\u03cd\7w\2\2\u03cd\u03ce\7D\2\2\u03ce\u03d0\7E\2\2\u03cf\u03d1\5\u0080"+
                    "A\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1}\3\2\2\2\u03d2\u03d3"+
                    "\5H%\2\u03d3\177\3\2\2\2\u03d4\u03d5\7\16\2\2\u03d5\u03d6\5n8\2\u03d6"+
                    "\u0081\3\2\2\2\u03d7\u03d9\78\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2"+
                    "\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\7F\2\2\u03db\u03dd\78\2\2\u03dc\u03db"+
                    "\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e1\3\2\2\2\u03de\u03e0\5\u0084C"+
                    "\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2"+
                    "\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e6\78\2\2\u03e5"+
                    "\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\7G"+
                    "\2\2\u03e8\u0083\3\2\2\2\u03e9\u03ea\5\u0086D\2\u03ea\u03eb\7J\2\2\u03eb"+
                    "\u03ef\3\2\2\2\u03ec\u03ef\5\u008aF\2\u03ed\u03ef\5\u0088E\2\u03ee\u03e9"+
                    "\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef\u0085\3\2\2\2\u03f0"+
                    "\u03f2\5\20\t\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3"+
                    "\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6"+
                    "\u03f7\5\u00c8e\2\u03f7\u03f8\5H%\2\u03f8\u0087\3\2\2\2\u03f9\u03fb\5"+
                    "\16\b\2\u03fa\u03f9\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc"+
                    "\u03fd\3\2\2\2\u03fd\u0401\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0402\5\22"+
                    "\n\2\u0400\u0402\5\"\22\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402"+
                    "\u0405\3\2\2\2\u0403\u0405\7J\2\2\u0404\u03fc\3\2\2\2\u0404\u0403\3\2"+
                    "\2\2\u0405\u0089\3\2\2\2\u0406\u04a9\5\u0082B\2\u0407\u0408\7\4\2\2\u0408"+
                    "\u040b\7\65\2\2\u0409\u040a\7S\2\2\u040a\u040c\7\65\2\2\u040b\u0409\3"+
                    "\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u04a9\7J\2\2\u040e"+
                    "\u040f\7\27\2\2\u040f\u0410\7D\2\2\u0410\u0415\7\65\2\2\u0411\u0412\7"+
                    "K\2\2\u0412\u0414\7\65\2\2\u0413\u0411\3\2\2\2\u0414\u0417\3\2\2\2\u0415"+
                    "\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0415\3\2"+
                    "\2\2\u0418\u0419\7E\2\2\u0419\u04a9\5\u008aF\2\u041a\u041b\7\27\2\2\u041b"+
                    "\u041c\7D\2\2\u041c\u041d\7\67\2\2\u041d\u041e\7E\2\2\u041e\u04a9\5\u008a"+
                    "F\2\u041f\u0420\7\64\2\2\u0420\u0421\7\65\2\2\u0421\u04a9\5\u008aF\2\u0422"+
                    "\u0423\7\17\2\2\u0423\u0424\5\u008aF\2\u0424\u0425\7\64\2\2\u0425\u0426"+
                    "\7\65\2\2\u0426\u0427\7J\2\2\u0427\u04a9\3\2\2\2\u0428\u0429\7+\2\2\u0429"+
                    "\u042a\7\65\2\2\u042a\u042e\7F\2\2\u042b\u042d\5\u0098M\2\u042c\u042b"+
                    "\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
                    "\u0434\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0433\5\u009aN\2\u0432\u0431"+
                    "\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
                    "\u0437\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u04a9\7G\2\2\u0438\u0439\7,\2"+
                    "\2\u0439\u043a\7\65\2\2\u043a\u04a9\5\u0082B\2\u043b\u043c\7&\2\2\u043c"+
                    "\u043d\7\65\2\2\u043d\u04a9\7J\2\2\u043e\u043f\7.\2\2\u043f\u0440\7\65"+
                    "\2\2\u0440\u04a9\7J\2\2\u0441\u0442\7\4\2\2\u0442\u0445\5\u00a8U\2\u0443"+
                    "\u0444\7S\2\2\u0444\u0446\5\u00a8U\2\u0445\u0443\3\2\2\2\u0445\u0446\3"+
                    "\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\7J\2\2\u0448\u04a9\3\2\2\2\u0449"+
                    "\u044a\7\30\2\2\u044a\u044b\5\u00a2R\2\u044b\u044e\5\u008aF\2\u044c\u044d"+
                    "\7\21\2\2\u044d\u044f\5\u008aF\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2"+
                    "\2\u044f\u04a9\3\2\2\2\u0450\u0451\7\27\2\2\u0451\u0452\7D\2\2\u0452\u0453"+
                    "\5\u009cO\2\u0453\u0454\7E\2\2\u0454\u0455\5\u008aF\2\u0455\u04a9\3\2"+
                    "\2\2\u0456\u0457\7\64\2\2\u0457\u0458\5\u00a2R\2\u0458\u0459\5\u008aF"+
                    "\2\u0459\u04a9\3\2\2\2\u045a\u045b\7\17\2\2\u045b\u045c\5\u008aF\2\u045c"+
                    "\u045d\7\64\2\2\u045d\u045e\5\u00a2R\2\u045e\u045f\7J\2\2\u045f\u04a9"+
                    "\3\2\2\2\u0460\u0461\7\61\2\2\u0461\u046b\5\u0082B\2\u0462\u0464\5\u008c"+
                    "G\2\u0463\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0463\3\2\2\2\u0465"+
                    "\u0466\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0469\5\u0090I\2\u0468\u0467"+
                    "\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u046c\5\u0090I"+
                    "\2\u046b\u0463\3\2\2\2\u046b\u046a\3\2\2\2\u046c\u04a9\3\2\2\2\u046d\u046e"+
                    "\7\61\2\2\u046e\u046f\5\u0092J\2\u046f\u0473\5\u0082B\2\u0470\u0472\5"+
                    "\u008cG\2\u0471\u0470\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2"+
                    "\u0473\u0474\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0478"+
                    "\5\u0090I\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u04a9\3\2\2"+
                    "\2\u0479\u047a\7+\2\2\u047a\u047b\5\u00a2R\2\u047b\u047f\7F\2\2\u047c"+
                    "\u047e\5\u0098M\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d"+
                    "\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0485\3\2\2\2\u0481\u047f\3\2\2\2\u0482"+
                    "\u0484\5\u009aN\2\u0483\u0482\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483"+
                    "\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0485\3\2\2\2\u0488"+
                    "\u0489\7G\2\2\u0489\u04a9\3\2\2\2\u048a\u048b\7,\2\2\u048b\u048c\5\u00a2"+
                    "R\2\u048c\u048d\5\u0082B\2\u048d\u04a9\3\2\2\2\u048e\u0490\7&\2\2\u048f"+
                    "\u0491\5\u00a8U\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492"+
                    "\3\2\2\2\u0492\u04a9\7J\2\2\u0493\u0494\7.\2\2\u0494\u0495\5\u00a8U\2"+
                    "\u0495\u0496\7J\2\2\u0496\u04a9\3\2\2\2\u0497\u0499\7\6\2\2\u0498\u049a"+
                    "\7w\2\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
                    "\u04a9\7J\2\2\u049c\u049e\7\r\2\2\u049d\u049f\7w\2\2\u049e\u049d\3\2\2"+
                    "\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a9\7J\2\2\u04a1\u04a9"+
                    "\7J\2\2\u04a2\u04a3\5\u00a8U\2\u04a3\u04a4\7J\2\2\u04a4\u04a9\3\2\2\2"+
                    "\u04a5\u04a6\7w\2\2\u04a6\u04a7\7S\2\2\u04a7\u04a9\5\u008aF\2\u04a8\u0406"+
                    "\3\2\2\2\u04a8\u0407\3\2\2\2\u04a8\u040e\3\2\2\2\u04a8\u041a\3\2\2\2\u04a8"+
                    "\u041f\3\2\2\2\u04a8\u0422\3\2\2\2\u04a8\u0428\3\2\2\2\u04a8\u0438\3\2"+
                    "\2\2\u04a8\u043b\3\2\2\2\u04a8\u043e\3\2\2\2\u04a8\u0441\3\2\2\2\u04a8"+
                    "\u0449\3\2\2\2\u04a8\u0450\3\2\2\2\u04a8\u0456\3\2\2\2\u04a8\u045a\3\2"+
                    "\2\2\u04a8\u0460\3\2\2\2\u04a8\u046d\3\2\2\2\u04a8\u0479\3\2\2\2\u04a8"+
                    "\u048a\3\2\2\2\u04a8\u048e\3\2\2\2\u04a8\u0493\3\2\2\2\u04a8\u0497\3\2"+
                    "\2\2\u04a8\u049c\3\2\2\2\u04a8\u04a1\3\2\2\2\u04a8\u04a2\3\2\2\2\u04a8"+
                    "\u04a5\3\2\2\2\u04a9\u008b\3\2\2\2\u04aa\u04ab\7\t\2\2\u04ab\u04af\7D"+
                    "\2\2\u04ac\u04ae\5\20\t\2\u04ad\u04ac\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af"+
                    "\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04af\3\2"+
                    "\2\2\u04b2\u04b3\5\u008eH\2\u04b3\u04b4\7w\2\2\u04b4\u04b5\7E\2\2\u04b5"+
                    "\u04b6\5\u0082B\2\u04b6\u008d\3\2\2\2\u04b7\u04bc\5`\61\2\u04b8\u04b9"+
                    "\7a\2\2\u04b9\u04bb\5`\61\2\u04ba\u04b8\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc"+
                    "\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u008f\3\2\2\2\u04be\u04bc\3\2"+
                    "\2\2\u04bf\u04c0\7\25\2\2\u04c0\u04c1\5\u0082B\2\u04c1\u0091\3\2\2\2\u04c2"+
                    "\u04c3\7D\2\2\u04c3\u04c5\5\u0094K\2\u04c4\u04c6\7J\2\2\u04c5\u04c4\3"+
                    "\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\7E\2\2\u04c8"+
                    "\u0093\3\2\2\2\u04c9\u04ce\5\u0096L\2\u04ca\u04cb\7J\2\2\u04cb\u04cd\5"+
                    "\u0096L\2\u04cc\u04ca\3\2\2\2\u04cd\u04d0\3\2\2\2\u04ce\u04cc\3\2\2\2"+
                    "\u04ce\u04cf\3\2\2\2\u04cf\u0095\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d1\u04d3"+
                    "\5\20\t\2\u04d2\u04d1\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2"+
                    "\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7\u04d8"+
                    "\5R*\2\u04d8\u04d9\5L\'\2\u04d9\u04da\7M\2\2\u04da\u04db\5\u00a8U\2\u04db"+
                    "\u0097\3\2\2\2\u04dc\u04de\5\u009aN\2\u04dd\u04dc\3\2\2\2\u04de\u04df"+
                    "\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1"+
                    "\u04e3\5\u0084C\2\u04e2\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e2"+
                    "\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u0099\3\2\2\2\u04e6\u04e9\7\b\2\2\u04e7"+
                    "\u04ea\5\u00a8U\2\u04e8\u04ea\7w\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04e8\3"+
                    "\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ef\7S\2\2\u04ec\u04ed\7\16\2\2\u04ed"+
                    "\u04ef\7S\2\2\u04ee\u04e6\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u009b\3\2"+
                    "\2\2\u04f0\u04fd\5\u00a0Q\2\u04f1\u04f3\5\u009eP\2\u04f2\u04f1\3\2\2\2"+
                    "\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\7J\2\2\u04f5\u04f7"+
                    "\5\u00a8U\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2"+
                    "\2\u04f8\u04fa\7J\2\2\u04f9\u04fb\5\u00a4S\2\u04fa\u04f9\3\2\2\2\u04fa"+
                    "\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04f0\3\2\2\2\u04fc\u04f2\3\2"+
                    "\2\2\u04fd\u009d\3\2\2\2\u04fe\u0501\5\u0086D\2\u04ff\u0501\5\u00a4S\2"+
                    "\u0500\u04fe\3\2\2\2\u0500\u04ff\3\2\2\2\u0501\u009f\3\2\2\2\u0502\u0504"+
                    "\5\20\t\2\u0503\u0502\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2"+
                    "\u0505\u0506\3\2\2\2\u0506\u0508\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u0509"+
                    "\5\u00c8e\2\u0509\u050a\5L\'\2\u050a\u050b\7S\2\2\u050b\u050c\5\u00a8"+
                    "U\2\u050c\u00a1\3\2\2\2\u050d\u050e\7D\2\2\u050e\u050f\7\65\2\2\u050f"+
                    "\u0515\7E\2\2\u0510\u0511\7D\2\2\u0511\u0512\5\u00a8U\2\u0512\u0513\7"+
                    "E\2\2\u0513\u0515\3\2\2\2\u0514\u050d\3\2\2\2\u0514\u0510\3\2\2\2\u0515"+
                    "\u00a3\3\2\2\2\u0516\u0528\7\67\2\2\u0517\u051c\7\65\2\2\u0518\u0519\7"+
                    "K\2\2\u0519\u051b\7\65\2\2\u051a\u0518\3\2\2\2\u051b\u051e\3\2\2\2\u051c"+
                    "\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0528\3\2\2\2\u051e\u051c\3\2"+
                    "\2\2\u051f\u0524\5\u00a8U\2\u0520\u0521\7K\2\2\u0521\u0523\5\u00a8U\2"+
                    "\u0522\u0520\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525"+
                    "\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2\2\2\u0527\u0516\3\2\2\2\u0527"+
                    "\u0517\3\2\2\2\u0527\u051f\3\2\2\2\u0528\u00a5\3\2\2\2\u0529\u052a\7w"+
                    "\2\2\u052a\u052c\7D\2\2\u052b\u052d\5\u00a4S\2\u052c\u052b\3\2\2\2\u052c"+
                    "\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u053c\7E\2\2\u052f\u0530\7-\2"+
                    "\2\u0530\u0532\7D\2\2\u0531\u0533\5\u00a4S\2\u0532\u0531\3\2\2\2\u0532"+
                    "\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u053c\7E\2\2\u0535\u0536\7*\2"+
                    "\2\u0536\u0538\7D\2\2\u0537\u0539\5\u00a4S\2\u0538\u0537\3\2\2\2\u0538"+
                    "\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\7E\2\2\u053b\u0529\3\2"+
                    "\2\2\u053b\u052f\3\2\2\2\u053b\u0535\3\2\2\2\u053c\u00a7\3\2\2\2\u053d"+
                    "\u053e\bU\1\2\u053e\u055d\5\u00b0Y\2\u053f\u055d\5\u00a6T\2\u0540\u0541"+
                    "\7!\2\2\u0541\u055d\5\u00b4[\2\u0542\u0543\7D\2\2\u0543\u0544\5\u00c8"+
                    "e\2\u0544\u0545\7E\2\2\u0545\u0546\5\u00a8U\27\u0546\u055d\3\2\2\2\u0547"+
                    "\u0548\t\5\2\2\u0548\u055d\5\u00a8U\25\u0549\u054a\t\6\2\2\u054a\u055d"+
                    "\5\u00a8U\24\u054b\u055d\5\u00aaV\2\u054c\u054d\5\u00c8e\2\u054d\u0553"+
                    "\7q\2\2\u054e\u0550\5\u00ccg\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2"+
                    "\u0550\u0551\3\2\2\2\u0551\u0554\7w\2\2\u0552\u0554\7!\2\2\u0553\u054f"+
                    "\3\2\2\2\u0553\u0552\3\2\2\2\u0554\u055d\3\2\2\2\u0555\u0556\5\u00b2Z"+
                    "\2\u0556\u0558\7q\2\2\u0557\u0559\5\u00ccg\2\u0558\u0557\3\2\2\2\u0558"+
                    "\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\7!\2\2\u055b\u055d\3\2"+
                    "\2\2\u055c\u053d\3\2\2\2\u055c\u053f\3\2\2\2\u055c\u0540\3\2\2\2\u055c"+
                    "\u0542\3\2\2\2\u055c\u0547\3\2\2\2\u055c\u0549\3\2\2\2\u055c\u054b\3\2"+
                    "\2\2\u055c\u054c\3\2\2\2\u055c\u0555\3\2\2\2\u055d\u05ae\3\2\2\2\u055e"+
                    "\u055f\f\23\2\2\u055f\u0560\t\7\2\2\u0560\u05ad\5\u00a8U\24\u0561\u0562"+
                    "\f\22\2\2\u0562\u0563\t\b\2\2\u0563\u05ad\5\u00a8U\23\u0564\u056c\f\21"+
                    "\2\2\u0565\u0566\7O\2\2\u0566\u056d\7O\2\2\u0567\u0568\7N\2\2\u0568\u0569"+
                    "\7N\2\2\u0569\u056d\7N\2\2\u056a\u056b\7N\2\2\u056b\u056d\7N\2\2\u056c"+
                    "\u0565\3\2\2\2\u056c\u0567\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056e\3\2"+
                    "\2\2\u056e\u05ad\5\u00a8U\22\u056f\u0570\f\20\2\2\u0570\u0571\t\t\2\2"+
                    "\u0571\u05ad\5\u00a8U\21\u0572\u0573\f\16\2\2\u0573\u0574\t\n\2\2\u0574"+
                    "\u05ad\5\u00a8U\17\u0575\u0576\f\r\2\2\u0576\u0577\7`\2\2\u0577\u05ad"+
                    "\5\u00a8U\16\u0578\u0579\f\f\2\2\u0579\u057a\7b\2\2\u057a\u05ad\5\u00a8"+
                    "U\r\u057b\u057c\f\13\2\2\u057c\u057d\7a\2\2\u057d\u05ad\5\u00a8U\f\u057e"+
                    "\u057f\f\n\2\2\u057f\u0580\7X\2\2\u0580\u05ad\5\u00a8U\13\u0581\u0582"+
                    "\f\t\2\2\u0582\u0583\7Y\2\2\u0583\u05ad\5\u00a8U\n\u0584\u0585\f\b\2\2"+
                    "\u0585\u0586\7R\2\2\u0586\u0587\5\u00a8U\2\u0587\u0588\7S\2\2\u0588\u0589"+
                    "\5\u00a8U\b\u0589\u05ad\3\2\2\2\u058a\u058b\f\7\2\2\u058b\u058c\t\13\2"+
                    "\2\u058c\u05ad\5\u00a8U\7\u058d\u058e\f\33\2\2\u058e\u059a\7L\2\2\u058f"+
                    "\u059b\7w\2\2\u0590\u059b\5\u00a6T\2\u0591\u059b\7-\2\2\u0592\u0594\7"+
                    "!\2\2\u0593\u0595\5\u00c4c\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
                    "\u0596\3\2\2\2\u0596\u059b\5\u00b8]\2\u0597\u0598\7*\2\2\u0598\u059b\5"+
                    "\u00ceh\2\u0599\u059b\5\u00be`\2\u059a\u058f\3\2\2\2\u059a\u0590\3\2\2"+
                    "\2\u059a\u0591\3\2\2\2\u059a\u0592\3\2\2\2\u059a\u0597\3\2\2\2\u059a\u0599"+
                    "\3\2\2\2\u059b\u05ad\3\2\2\2\u059c\u059d\f\32\2\2\u059d\u059e\7H\2\2\u059e"+
                    "\u059f\5\u00a8U\2\u059f\u05a0\7I\2\2\u05a0\u05ad\3\2\2\2\u05a1\u05a2\f"+
                    "\26\2\2\u05a2\u05ad\t\f\2\2\u05a3\u05a4\f\17\2\2\u05a4\u05a5\7\34\2\2"+
                    "\u05a5\u05ad\5\u00c8e\2\u05a6\u05a7\f\5\2\2\u05a7\u05a9\7q\2\2\u05a8\u05aa"+
                    "\5\u00ccg\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2"+
                    "\2\u05ab\u05ad\7w\2\2\u05ac\u055e\3\2\2\2\u05ac\u0561\3\2\2\2\u05ac\u0564"+
                    "\3\2\2\2\u05ac\u056f\3\2\2\2\u05ac\u0572\3\2\2\2\u05ac\u0575\3\2\2\2\u05ac"+
                    "\u0578\3\2\2\2\u05ac\u057b\3\2\2\2\u05ac\u057e\3\2\2\2\u05ac\u0581\3\2"+
                    "\2\2\u05ac\u0584\3\2\2\2\u05ac\u058a\3\2\2\2\u05ac\u058d\3\2\2\2\u05ac"+
                    "\u059c\3\2\2\2\u05ac\u05a1\3\2\2\2\u05ac\u05a3\3\2\2\2\u05ac\u05a6\3\2"+
                    "\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
                    "\u00a9\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b2\5\u00acW\2\u05b2\u05b3"+
                    "\7p\2\2\u05b3\u05b4\5\u00aeX\2\u05b4\u00ab\3\2\2\2\u05b5\u05c6\7w\2\2"+
                    "\u05b6\u05b8\7D\2\2\u05b7\u05b9\5Z.\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9"+
                    "\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05c6\7E\2\2\u05bb\u05bc\7D\2\2\u05bc"+
                    "\u05c1\7w\2\2\u05bd\u05be\7K\2\2\u05be\u05c0\7w\2\2\u05bf\u05bd\3\2\2"+
                    "\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4"+
                    "\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c6\7E\2\2\u05c5\u05b5\3\2\2\2\u05c5"+
                    "\u05b6\3\2\2\2\u05c5\u05bb\3\2\2\2\u05c6\u00ad\3\2\2\2\u05c7\u05ca\5\u00a8"+
                    "U\2\u05c8\u05ca\5\u0082B\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8\3\2\2\2\u05ca"+
                    "\u00af\3\2\2\2\u05cb\u05cc\7D\2\2\u05cc\u05cd\5\u00a8U\2\u05cd\u05ce\7"+
                    "E\2\2\u05ce\u05de\3\2\2\2\u05cf\u05de\7-\2\2\u05d0\u05de\7*\2\2\u05d1"+
                    "\u05de\5b\62\2\u05d2\u05de\7w\2\2\u05d3\u05d4\5\60\31\2\u05d4\u05d5\7"+
                    "L\2\2\u05d5\u05d6\7\13\2\2\u05d6\u05de\3\2\2\2\u05d7\u05db\5\u00c4c\2"+
                    "\u05d8\u05dc\5\u00d0i\2\u05d9\u05da\7-\2\2\u05da\u05dc\5\u00d2j\2\u05db"+
                    "\u05d8\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd\u05cb\3\2"+
                    "\2\2\u05dd\u05cf\3\2\2\2\u05dd\u05d0\3\2\2\2\u05dd\u05d1\3\2\2\2\u05dd"+
                    "\u05d2\3\2\2\2\u05dd\u05d3\3\2\2\2\u05dd\u05d7\3\2\2\2\u05de\u00b1\3\2"+
                    "\2\2\u05df\u05e0\5R*\2\u05e0\u05e1\7L\2\2\u05e1\u05e3\3\2\2\2\u05e2\u05df"+
                    "\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e7\3\2\2\2\u05e4\u05e6\5h\65\2\u05e5"+
                    "\u05e4\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2"+
                    "\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05ec\7w\2\2\u05eb"+
                    "\u05ed\5\u00ccg\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u00b3"+
                    "\3\2\2\2\u05ee\u05ef\5\u00c4c\2\u05ef\u05f0\5\u00b6\\\2\u05f0\u05f1\5"+
                    "\u00bc_\2\u05f1\u05f8\3\2\2\2\u05f2\u05f5\5\u00b6\\\2\u05f3\u05f6\5\u00ba"+
                    "^\2\u05f4\u05f6\5\u00bc_\2\u05f5\u05f3\3\2\2\2\u05f5\u05f4\3\2\2\2\u05f6"+
                    "\u05f8\3\2\2\2\u05f7\u05ee\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f8\u00b5\3\2"+
                    "\2\2\u05f9\u05fb\7w\2\2\u05fa\u05fc\5\u00c0a\2\u05fb\u05fa\3\2\2\2\u05fb"+
                    "\u05fc\3\2\2\2\u05fc\u0604\3\2\2\2\u05fd\u05fe\7L\2\2\u05fe\u0600\7w\2"+
                    "\2\u05ff\u0601\5\u00c0a\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
                    "\u0603\3\2\2\2\u0602\u05fd\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602\3\2"+
                    "\2\2\u0604\u0605\3\2\2\2\u0605\u0609\3\2\2\2\u0606\u0604\3\2\2\2\u0607"+
                    "\u0609\5\u00caf\2\u0608\u05f9\3\2\2\2\u0608\u0607\3\2\2\2\u0609\u00b7"+
                    "\3\2\2\2\u060a\u060c\7w\2\2\u060b\u060d\5\u00c2b\2\u060c\u060b\3\2\2\2"+
                    "\u060c\u060d\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\5\u00bc_\2\u060f"+
                    "\u00b9\3\2\2\2\u0610\u062c\7H\2\2\u0611\u0616\7I\2\2\u0612\u0613\7H\2"+
                    "\2\u0613\u0615\7I\2\2\u0614\u0612\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614"+
                    "\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0619\3\2\2\2\u0618\u0616\3\2\2\2\u0619"+
                    "\u062d\5P)\2\u061a\u061b\5\u00a8U\2\u061b\u0622\7I\2\2\u061c\u061d\7H"+
                    "\2\2\u061d\u061e\5\u00a8U\2\u061e\u061f\7I\2\2\u061f\u0621\3\2\2\2\u0620"+
                    "\u061c\3\2\2\2\u0621\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2"+
                    "\2\2\u0623\u0629\3\2\2\2\u0624\u0622\3\2\2\2\u0625\u0626\7H\2\2\u0626"+
                    "\u0628\7I\2\2\u0627\u0625\3\2\2\2\u0628\u062b\3\2\2\2\u0629\u0627\3\2"+
                    "\2\2\u0629\u062a\3\2\2\2\u062a\u062d\3\2\2\2\u062b\u0629\3\2\2\2\u062c"+
                    "\u0611\3\2\2\2\u062c\u061a\3\2\2\2\u062d\u00bb\3\2\2\2\u062e\u0630\5\u00d2"+
                    "j\2\u062f\u0631\5$\23\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
                    "\u00bd\3\2\2\2\u0632\u0633\5\u00c4c\2\u0633\u0634\5\u00d0i\2\u0634\u00bf"+
                    "\3\2\2\2\u0635\u0636\7O\2\2\u0636\u0639\7N\2\2\u0637\u0639\5\u00ccg\2"+
                    "\u0638\u0635\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u00c1\3\2\2\2\u063a\u063b"+
                    "\7O\2\2\u063b\u063e\7N\2\2\u063c\u063e\5\u00c4c\2\u063d\u063a\3\2\2\2"+
                    "\u063d\u063c\3\2\2\2\u063e\u00c3\3\2\2\2\u063f\u0640\7O\2\2\u0640\u0641"+
                    "\5\u00c6d\2\u0641\u0642\7N\2\2\u0642\u00c5\3\2\2\2\u0643\u0648\5\u00c8"+
                    "e\2\u0644\u0645\7K\2\2\u0645\u0647\5\u00c8e\2\u0646\u0644\3\2\2\2\u0647"+
                    "\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u00c7\3\2"+
                    "\2\2\u064a\u0648\3\2\2\2\u064b\u064d\5h\65\2\u064c\u064b\3\2\2\2\u064c"+
                    "\u064d\3\2\2\2\u064d\u0650\3\2\2\2\u064e\u0651\5R*\2\u064f\u0651\5\u00ca"+
                    "f\2\u0650\u064e\3\2\2\2\u0650\u064f\3\2\2\2\u0651\u0656\3\2\2\2\u0652"+
                    "\u0653\7H\2\2\u0653\u0655\7I\2\2\u0654\u0652\3\2\2\2\u0655\u0658\3\2\2"+
                    "\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u00c9\3\2\2\2\u0658\u0656"+
                    "\3\2\2\2\u0659\u065a\t\r\2\2\u065a\u00cb\3\2\2\2\u065b\u065c\7O\2\2\u065c"+
                    "\u0661\5T+\2\u065d\u065e\7K\2\2\u065e\u0660\5T+\2\u065f\u065d\3\2\2\2"+
                    "\u0660\u0663\3\2\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664"+
                    "\3\2\2\2\u0663\u0661\3\2\2\2\u0664\u0665\7N\2\2\u0665\u00cd\3\2\2\2\u0666"+
                    "\u066d\5\u00d2j\2\u0667\u0668\7L\2\2\u0668\u066a\7w\2\2\u0669\u066b\5"+
                    "\u00d2j\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d\3\2\2\2"+
                    "\u066c\u0666\3\2\2\2\u066c\u0667\3\2\2\2\u066d\u00cf\3\2\2\2\u066e\u066f"+
                    "\7*\2\2\u066f\u0673\5\u00ceh\2\u0670\u0671\7w\2\2\u0671\u0673\5\u00d2"+
                    "j\2\u0672\u066e\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u00d1\3\2\2\2\u0674"+
                    "\u0676\7D\2\2\u0675\u0677\5\u00a4S\2\u0676\u0675\3\2\2\2\u0676\u0677\3"+
                    "\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\7E\2\2\u0679\u00d3\3\2\2\2\u00e1"+
                    "\u00d9\u00dd\u00e1\u00e8\u00ec\u00f3\u00f7\u00fb\u00ff\u0103\u0107\u010e"+
                    "\u0112\u0116\u011b\u011f\u0124\u0129\u012d\u0131\u0136\u013b\u013f\u0143"+
                    "\u0148\u014c\u0150\u0154\u0158\u015d\u0161\u0166\u016a\u016f\u0173\u0178"+
                    "\u017c\u0181\u0185\u0189\u018d\u018f\u0192\u0197\u019d\u01a5\u01ae\u01b3"+
                    "\u01ba\u01c1\u01c4\u01cb\u01d5\u01d9\u01de\u01e2\u01e6\u01f0\u01f8\u01fe"+
                    "\u0205\u020c\u0210\u0213\u0216\u021f\u0225\u022a\u022d\u0233\u0239\u023d"+
                    "\u0245\u024e\u0255\u025b\u025f\u026a\u0273\u0278\u027e\u0282\u028e\u0299"+
                    "\u029e\u02a7\u02af\u02b9\u02c2\u02ca\u02cf\u02d7\u02dc\u02e6\u02f0\u02f6"+
                    "\u02fd\u0302\u030a\u030e\u0310\u0316\u031b\u031f\u0326\u0328\u032f\u0334"+
                    "\u033d\u0342\u0345\u034a\u0353\u035f\u0369\u0374\u0377\u037e\u0388\u0390"+
                    "\u0393\u0396\u03a3\u03ab\u03b0\u03b8\u03bc\u03c0\u03c4\u03c6\u03ca\u03d0"+
                    "\u03d8\u03dc\u03e1\u03e5\u03ee\u03f3\u03fc\u0401\u0404\u040b\u0415\u042e"+
                    "\u0434\u0445\u044e\u0465\u0468\u046b\u0473\u0477\u047f\u0485\u0490\u0499"+
                    "\u049e\u04a8\u04af\u04bc\u04c5\u04ce\u04d4\u04df\u04e4\u04e9\u04ee\u04f2"+
                    "\u04f6\u04fa\u04fc\u0500\u0505\u0514\u051c\u0524\u0527\u052c\u0532\u0538"+
                    "\u053b\u054f\u0553\u0558\u055c\u056c\u0594\u059a\u05a9\u05ac\u05ae\u05b8"+
                    "\u05c1\u05c5\u05c9\u05db\u05dd\u05e2\u05e7\u05ec\u05f5\u05f7\u05fb\u0600"+
                    "\u0604\u0608\u060c\u0616\u0622\u0629\u062c\u0630\u0638\u063d\u0648\u064c"+
                    "\u0650\u0656\u0661\u066a\u066c\u0672\u0676";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}