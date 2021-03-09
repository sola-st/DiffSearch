package ProgrammingLanguage.Java;// Generated from JavaParser.g4 by ANTLR 4.9.1

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
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
		MOD=97, OP=98, BINOP=99, UNOP=100, QUERY_ARROW=101, ADD_ASSIGN=102, SUB_ASSIGN=103, 
		MUL_ASSIGN=104, DIV_ASSIGN=105, AND_ASSIGN=106, OR_ASSIGN=107, XOR_ASSIGN=108, 
		MOD_ASSIGN=109, LSHIFT_ASSIGN=110, RSHIFT_ASSIGN=111, URSHIFT_ASSIGN=112, 
		ARROW=113, COLONCOLON=114, AT=115, ELLIPSIS=116, WS=117, COMMENT=118, 
		LINE_COMMENT=119, IDENTIFIER=120;
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
		RULE_identifier = 71, RULE_catchClause = 72, RULE_catchType = 73, RULE_finallyBlock = 74, 
		RULE_resourceSpecification = 75, RULE_resources = 76, RULE_resource = 77, 
		RULE_switchBlockStatementGroup = 78, RULE_switchLabel = 79, RULE_forControl = 80, 
		RULE_forInit = 81, RULE_enhancedForControl = 82, RULE_parExpression = 83, 
		RULE_expressionList = 84, RULE_methodCall = 85, RULE_binary_operators = 86, 
		RULE_assign_operators = 87, RULE_expression = 88, RULE_unary_postfix_operators = 89, 
		RULE_unary_prefix_operators = 90, RULE_lambdaExpression = 91, RULE_lambdaParameters = 92, 
		RULE_lambdaBody = 93, RULE_primary = 94, RULE_classType = 95, RULE_creator = 96, 
		RULE_createdName = 97, RULE_innerCreator = 98, RULE_arrayCreatorRest = 99, 
		RULE_classCreatorRest = 100, RULE_explicitGenericInvocation = 101, RULE_typeArgumentsOrDiamond = 102, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 103, RULE_nonWildcardTypeArguments = 104, 
		RULE_typeList = 105, RULE_typeType = 106, RULE_primitiveType = 107, RULE_typeArguments = 108, 
		RULE_superSuffix = 109, RULE_explicitGenericInvocationSuffix = 110, RULE_arguments = 111;
	private static String[] makeRuleNames() {
		return new String[] {
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
			"integerLiteral", "floatLiteral", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "multipleStatements", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "identifier", "catchClause", "catchType", 
			"finallyBlock", "resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "binary_operators", "assign_operators", 
			"expression", "unary_postfix_operators", "unary_prefix_operators", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "primary", "classType", "creator", 
			"createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
			"explicitGenericInvocation", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
			"nonWildcardTypeArguments", "typeList", "typeType", "primitiveType", 
			"typeArguments", "superSuffix", "explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
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
			"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'^'", "'%'", null, null, null, "'-->'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "EXPR", "EMPTY", 
			"WILDCARD", "NEWLINE", "LITERALS", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "OP", "BINOP", "UNOP", "QUERY_ARROW", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
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
			setState(224);
			querySnippet();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(225);
				match(NEWLINE);
				}
			}

			setState(228);
			match(QUERY_ARROW);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(229);
				match(NEWLINE);
				}
				break;
			}
			setState(232);
			querySnippet();
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
		}
		catch (RecognitionException re) {
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				packageDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				importDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				enumConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				memberDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				interfaceMethodDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				variableDeclarator();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				literal();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(246);
				annotation();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(247);
				elementValuePair();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				annotationTypeDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(249);
				multipleStatements();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(250);
				blockStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(251);
				block();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(252);
				expression(0);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(253);
				parExpression();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(254);
				expressionList();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(255);
				methodCall();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(256);
				match(WILDCARD);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(257);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(260);
				packageDeclaration();
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(263);
				importDeclaration();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(269);
				typeDeclaration();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(277);
				annotation();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(PACKAGE);
			setState(284);
			qualifiedName();
			setState(285);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
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
			setState(287);
			match(IMPORT);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(288);
				match(STATIC);
				}
			}

			setState(291);
			qualifiedName();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(292);
				match(DOT);
				setState(293);
				match(MUL);
				}
			}

			setState(296);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(311);
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
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(308);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(304);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(305);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(306);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(307);
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
				setState(310);
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
			setState(318);
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
				setState(313);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
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
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(327);
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
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(334);
			match(CLASS);
			setState(335);
			identifier();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(336);
				typeParameters();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(339);
				match(EXTENDS);
				setState(340);
				typeType();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(343);
				match(IMPLEMENTS);
				setState(344);
				typeList();
				}
			}

			setState(347);
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
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(349);
			match(LT);
			setState(350);
			typeParameter();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(351);
				match(COMMA);
				setState(352);
				typeParameter();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(360);
				annotation();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			identifier();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(367);
				match(EXTENDS);
				setState(368);
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
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
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
			setState(371);
			typeType();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(372);
				match(BITAND);
				setState(373);
				typeType();
				}
				}
				setState(378);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
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
			setState(379);
			match(ENUM);
			setState(380);
			identifier();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(381);
				match(IMPLEMENTS);
				setState(382);
				typeList();
				}
			}

			setState(385);
			match(LBRACE);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(386);
				enumConstants();
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(389);
				match(COMMA);
				}
			}

			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(392);
				enumBodyDeclarations();
				}
			}

			setState(395);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(397);
			enumConstant();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(COMMA);
					setState(399);
					enumConstant();
					}
					} 
				}
				setState(404);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(405);
				annotation();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			identifier();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(412);
				arguments();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(415);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(418);
			match(SEMI);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(419);
				classBodyDeclaration();
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(425);
			match(INTERFACE);
			setState(426);
			identifier();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(427);
				typeParameters();
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(430);
				match(EXTENDS);
				setState(431);
				typeList();
				}
			}

			setState(434);
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(436);
			match(LBRACE);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << NEWLINE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LBRACE - 68)) | (1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(437);
				classBodyDeclaration();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(445);
			match(LBRACE);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << WILDCARD))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (LT - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				{
				setState(446);
				interfaceBodyDeclaration();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(455);
					match(STATIC);
					}
				}

				setState(458);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(459);
						modifier();
						}
						} 
					}
					setState(464);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(465);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(472);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(474);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(475);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(476);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
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
			setState(479);
			typeTypeOrVoid();
			setState(480);
			identifier();
			setState(481);
			formalParameters();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(482);
				match(LBRACK);
				setState(483);
				match(RBRACK);
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(489);
				match(THROWS);
				setState(490);
				qualifiedNameList();
				}
			}

			setState(493);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
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
			setState(501);
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
				setState(499);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
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
			setState(503);
			typeParameters();
			setState(504);
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
			setState(506);
			typeParameters();
			setState(507);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(509);
			identifier();
			setState(510);
			formalParameters();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(511);
				match(THROWS);
				setState(512);
				qualifiedNameList();
				}
			}

			setState(515);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(517);
			typeType();
			setState(518);
			variableDeclarators();
			setState(519);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(529);
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
			case WILDCARD:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(521);
						modifier();
						}
						} 
					}
					setState(526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(527);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
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
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(537);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(540);
			typeType();
			setState(541);
			constantDeclarator();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(542);
				match(COMMA);
				setState(543);
				constantDeclarator();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
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
			setState(551);
			identifier();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(552);
				match(LBRACK);
				setState(553);
				match(RBRACK);
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			match(ASSIGN);
			setState(560);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
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
		public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
		public TerminalNode NEWLINE() { return getToken(JavaParser.NEWLINE, 0); }
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
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DEFAULT:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case VOID:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(562);
						interfaceMethodModifier();
						}
						} 
					}
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(578);
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
					setState(568);
					typeTypeOrVoid();
					}
					break;
				case LT:
					{
					setState(569);
					typeParameters();
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(570);
							annotation();
							}
							} 
						}
						setState(575);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					}
					setState(576);
					typeTypeOrVoid();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(580);
				identifier();
				setState(581);
				formalParameters();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(582);
					match(LBRACK);
					setState(583);
					match(RBRACK);
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(589);
					match(THROWS);
					setState(590);
					qualifiedNameList();
					}
				}

				setState(593);
				methodBody();
				}
				break;
			case WILDCARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(WILDCARD);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(596);
					match(NEWLINE);
					}
				}

				setState(599);
				identifier();
				setState(600);
				formalParameters();
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(601);
					match(LBRACK);
					setState(602);
					match(RBRACK);
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(608);
					match(THROWS);
					setState(609);
					qualifiedNameList();
					}
				}

				setState(612);
				methodBody();
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
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(620);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(621);
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
			setState(624);
			typeParameters();
			setState(625);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(627);
			variableDeclarator();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(628);
				match(COMMA);
				setState(629);
				variableDeclarator();
				}
				}
				setState(634);
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
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			variableDeclaratorId();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(636);
				match(ASSIGN);
				setState(637);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			identifier();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(641);
				match(LBRACK);
				setState(642);
				match(RBRACK);
				}
				}
				setState(647);
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
		enterRule(_localctx, 78, RULE_variableInitializer);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
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
			case UNOP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(652);
			match(LBRACE);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(653);
				variableInitializer();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(654);
						match(COMMA);
						setState(655);
						variableInitializer();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(661);
					match(COMMA);
					}
				}

				}
			}

			setState(666);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
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
			setState(668);
			identifier();
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(669);
				typeArguments();
				}
				break;
			}
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					match(DOT);
					setState(673);
					identifier();
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(674);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(681);
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
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
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
			setState(688);
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
				setState(682);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(QUESTION);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(684);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(690);
			qualifiedName();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691);
				match(COMMA);
				setState(692);
				qualifiedName();
				}
				}
				setState(697);
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
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
			setState(698);
			match(LPAREN);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << WILDCARD))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(699);
				formalParameterList();
				}
			}

			setState(702);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
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
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				formalParameter();
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(705);
						match(COMMA);
						setState(706);
						formalParameter();
						}
						} 
					}
					setState(711);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(712);
					match(COMMA);
					setState(713);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
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
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(720);
					variableModifier();
					}
					} 
				}
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(726);
			typeType();
			setState(727);
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
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
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
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(729);
					variableModifier();
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(735);
			typeType();
			setState(736);
			match(ELLIPSIS);
			setState(737);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
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
			setState(739);
			identifier();
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					match(DOT);
					setState(741);
					identifier();
					}
					} 
				}
				setState(746);
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
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(751);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(752);
				match(NULL_LITERAL);
				}
				break;
			case LITERALS:
				enterOuterAlt(_localctx, 7);
				{
				setState(753);
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
			setState(756);
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
			setState(758);
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
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
			setState(760);
			match(AT);
			setState(761);
			qualifiedName();
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(762);
				match(LPAREN);
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(763);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(764);
					elementValue();
					}
					break;
				}
				setState(767);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(770);
			elementValuePair();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(771);
				match(COMMA);
				setState(772);
				elementValuePair();
				}
				}
				setState(777);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
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
			setState(778);
			identifier();
			setState(779);
			match(ASSIGN);
			setState(780);
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
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
			setState(787);
			match(LBRACE);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(788);
				elementValue();
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(789);
						match(COMMA);
						setState(790);
						elementValue();
						}
						} 
					}
					setState(795);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(798);
				match(COMMA);
				}
			}

			setState(801);
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
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(803);
			match(AT);
			setState(804);
			match(INTERFACE);
			setState(805);
			identifier();
			setState(806);
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(808);
			match(LBRACE);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (SEMI - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				{
				setState(809);
				annotationTypeElementDeclaration();
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(815);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(825);
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
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(817);
						modifier();
						}
						} 
					}
					setState(822);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(823);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				typeType();
				setState(828);
				annotationMethodOrConstantRest();
				setState(829);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				classDeclaration();
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(832);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				interfaceDeclaration();
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(836);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				enumDeclaration();
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(840);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				annotationTypeDeclaration();
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(844);
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
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
			setState(853);
			identifier();
			setState(854);
			match(LPAREN);
			setState(855);
			match(RPAREN);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(856);
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
			setState(859);
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
			setState(861);
			match(DEFAULT);
			setState(862);
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JavaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JavaParser.NEWLINE, i);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(864);
					match(NEWLINE);
					}
				}

				setState(867);
				match(LBRACE);
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(868);
					match(NEWLINE);
					}
					break;
				}
				setState(871);
				multipleStatements();
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(872);
					match(NEWLINE);
					}
					break;
				}
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(875);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(878);
					match(NEWLINE);
					}
				}

				setState(881);
				match(LBRACE);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(882);
					match(NEWLINE);
					}
				}

				setState(885);
				match(WILDCARD);
				setState(887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(886);
					match(NEWLINE);
					}
					break;
				}
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(889);
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
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(895);
						blockStatement();
						}
						} 
					}
					setState(900);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				localVariableDeclaration();
				setState(904);
				match(SEMI);
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(905);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				statement();
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(909);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(912);
				localTypeDeclaration();
				setState(914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(913);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(916);
				match(WILDCARD);
				setState(918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(917);
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
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					variableModifier();
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(928);
			typeType();
			setState(929);
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
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
			setState(942);
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
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(931);
					classOrInterfaceModifier();
					}
					}
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(939);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(937);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(938);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public IdentifierContext identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
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
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
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
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(FOR);
				setState(946);
				match(LPAREN);
				setState(947);
				match(WILDCARD);
				setState(948);
				match(RPAREN);
				setState(950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(949);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				match(ASSERT);
				setState(953);
				expression(0);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(954);
					match(COLON);
					setState(955);
					expression(0);
					}
				}

				setState(958);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
				match(IF);
				setState(961);
				parExpression();
				setState(963);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(962);
					statement();
					}
					break;
				}
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(965);
					match(ELSE);
					setState(966);
					statement();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(969);
				match(FOR);
				setState(970);
				match(LPAREN);
				setState(971);
				forControl();
				setState(972);
				match(RPAREN);
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(973);
					statement();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(976);
				match(WHILE);
				setState(977);
				parExpression();
				setState(979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(978);
					statement();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(981);
				match(DO);
				setState(982);
				statement();
				setState(983);
				match(WHILE);
				setState(984);
				parExpression();
				setState(985);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(987);
				match(TRY);
				setState(988);
				block();
				setState(998);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(990); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(989);
							catchClause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(992); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					} while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER );
					setState(995);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(994);
						finallyBlock();
						}
						break;
					}
					}
					break;
				case FINALLY:
					{
					setState(997);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1000);
				match(TRY);
				setState(1001);
				resourceSpecification();
				setState(1002);
				block();
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1003);
						catchClause();
						}
						} 
					}
					setState(1008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(1010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1009);
					finallyBlock();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1012);
				match(SWITCH);
				setState(1013);
				parExpression();
				setState(1014);
				match(LBRACE);
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1015);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1020);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1021);
					switchLabel();
					}
					}
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1027);
				match(RBRACE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1029);
				match(SYNCHRONIZED);
				setState(1030);
				parExpression();
				setState(1031);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1033);
				match(RETURN);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1034);
					expression(0);
					}
				}

				setState(1037);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1038);
				match(THROW);
				setState(1039);
				expression(0);
				setState(1040);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1042);
				match(BREAK);
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1043);
					identifier();
					}
				}

				setState(1046);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1047);
				match(CONTINUE);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1048);
					identifier();
					}
				}

				setState(1051);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1052);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1053);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1054);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1056);
				((StatementContext)_localctx).identifierLabel = identifier();
				setState(1057);
				match(COLON);
				setState(1058);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
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
		enterRule(_localctx, 144, RULE_catchClause);
		int _la;
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(CATCH);
				setState(1065);
				match(LPAREN);
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1066);
					variableModifier();
					}
					}
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1072);
				catchType();
				setState(1073);
				identifier();
				setState(1074);
				match(RPAREN);
				setState(1075);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(CATCH);
				setState(1078);
				match(LPAREN);
				setState(1079);
				match(WILDCARD);
				setState(1080);
				match(RPAREN);
				setState(1081);
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
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
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			qualifiedName();
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1085);
				match(BITOR);
				setState(1086);
				qualifiedName();
				}
				}
				setState(1091);
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
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(FINALLY);
			setState(1093);
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
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(LPAREN);
			setState(1096);
			resources();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1097);
				match(SEMI);
				}
			}

			setState(1100);
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
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
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
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			resource();
			setState(1107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103);
					match(SEMI);
					setState(1104);
					resource();
					}
					} 
				}
				setState(1109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
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
		enterRule(_localctx, 154, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1110);
				variableModifier();
				}
				}
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1116);
			classOrInterfaceType();
			setState(1117);
			variableDeclaratorId();
			setState(1118);
			match(ASSIGN);
			setState(1119);
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
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1121);
				switchLabel();
				}
				}
				setState(1124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1126);
				blockStatement();
				}
				}
				setState(1129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << EXPR) | (1L << WILDCARD) | (1L << NEWLINE) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public IdentifierContext enumConstantName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				match(CASE);
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1132);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1133);
					((SwitchLabelContext)_localctx).enumConstantName = identifier();
					}
					break;
				}
				setState(1136);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				match(DEFAULT);
				setState(1139);
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
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
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
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1143);
					forInit();
					}
				}

				setState(1146);
				match(SEMI);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1147);
					expression(0);
					}
				}

				setState(1150);
				match(SEMI);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1151);
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
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
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
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
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
		enterRule(_localctx, 164, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1160);
					variableModifier();
					}
					} 
				}
				setState(1165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(1166);
			typeType();
			setState(1167);
			variableDeclaratorId();
			setState(1168);
			match(COLON);
			setState(1169);
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
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode EXPR() { return getToken(JavaParser.EXPR, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
		enterRule(_localctx, 166, RULE_parExpression);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(LPAREN);
				setState(1172);
				match(EXPR);
				setState(1173);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(LPAREN);
				setState(1175);
				expression(0);
				setState(1176);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				match(EXPR);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public List<TerminalNode> EXPR() { return getTokens(JavaParser.EXPR); }
		public TerminalNode EXPR(int i) {
			return getToken(JavaParser.EXPR, i);
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
		enterRule(_localctx, 168, RULE_expressionList);
		int _la;
		try {
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				match(WILDCARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				expression(0);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1183);
					match(COMMA);
					setState(1184);
					expression(0);
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
				match(EXPR);
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1191);
					match(COMMA);
					setState(1192);
					match(EXPR);
					}
					}
					setState(1197);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode EXPR() { return getToken(JavaParser.EXPR, 0); }
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
		enterRule(_localctx, 170, RULE_methodCall);
		int _la;
		try {
			setState(1225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				identifier();
				setState(1201);
				match(LPAREN);
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1202);
					expressionList();
					}
				}

				setState(1205);
				match(RPAREN);
				}
				break;
			case EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(EXPR);
				setState(1208);
				match(LPAREN);
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1209);
					expressionList();
					}
				}

				setState(1212);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1213);
				match(THIS);
				setState(1214);
				match(LPAREN);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1215);
					expressionList();
					}
				}

				setState(1218);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219);
				match(SUPER);
				setState(1220);
				match(LPAREN);
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1221);
					expressionList();
					}
				}

				setState(1224);
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
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(JavaParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
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
		enterRule(_localctx, 172, RULE_binary_operators);
		try {
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				match(DIV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229);
				match(MOD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1230);
				match(ADD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1231);
				match(SUB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1232);
				match(LT);
				setState(1233);
				match(LT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1234);
				match(GT);
				setState(1235);
				match(GT);
				setState(1236);
				match(GT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1237);
				match(GT);
				setState(1238);
				match(GT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1239);
				match(LE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1240);
				match(GE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1241);
				match(GT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1242);
				match(LT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1243);
				match(EQUAL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1244);
				match(NOTEQUAL);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1245);
				match(BITAND);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1246);
				match(CARET);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1247);
				match(BITOR);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1248);
				match(AND);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1249);
				match(OR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1250);
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
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
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
		enterRule(_localctx, 174, RULE_assign_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
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
		public Unary_prefix_operatorsContext prefix;
		public Token bop;
		public Unary_postfix_operatorsContext postfix;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode EXPR() { return getToken(JavaParser.EXPR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
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
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public Unary_prefix_operatorsContext unary_prefix_operators() {
			return getRuleContext(Unary_prefix_operatorsContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaParser.COLONCOLON, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public Binary_operatorsContext binary_operators() {
			return getRuleContext(Binary_operatorsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public Assign_operatorsContext assign_operators() {
			return getRuleContext(Assign_operatorsContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public Unary_postfix_operatorsContext unary_postfix_operators() {
			return getRuleContext(Unary_postfix_operatorsContext.class,0);
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
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1256);
				methodCall();
				}
				break;
			case 2:
				{
				setState(1257);
				match(EXPR);
				}
				break;
			case 3:
				{
				setState(1258);
				match(LPAREN);
				setState(1259);
				expression(0);
				setState(1260);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(1262);
				match(THIS);
				}
				break;
			case 5:
				{
				setState(1263);
				match(SUPER);
				}
				break;
			case 6:
				{
				setState(1264);
				literal();
				}
				break;
			case 7:
				{
				setState(1265);
				identifier();
				}
				break;
			case 8:
				{
				setState(1266);
				typeTypeOrVoid();
				setState(1267);
				match(DOT);
				setState(1268);
				match(CLASS);
				}
				break;
			case 9:
				{
				setState(1270);
				nonWildcardTypeArguments();
				setState(1274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1271);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1272);
					match(THIS);
					setState(1273);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				setState(1276);
				match(NEW);
				setState(1277);
				creator();
				}
				break;
			case 11:
				{
				setState(1278);
				match(LPAREN);
				setState(1279);
				typeType();
				setState(1280);
				match(RPAREN);
				setState(1281);
				expression(11);
				}
				break;
			case 12:
				{
				setState(1283);
				((ExpressionContext)_localctx).prefix = unary_prefix_operators();
				setState(1284);
				expression(9);
				}
				break;
			case 13:
				{
				setState(1286);
				lambdaExpression();
				}
				break;
			case 14:
				{
				setState(1287);
				typeType();
				setState(1288);
				match(COLONCOLON);
				setState(1294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1289);
						typeArguments();
						}
					}

					setState(1292);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1293);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				{
				setState(1296);
				classType();
				setState(1297);
				match(COLONCOLON);
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1298);
					typeArguments();
					}
				}

				setState(1301);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1305);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1306);
						binary_operators();
						setState(1307);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1310);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1311);
						expression(0);
						setState(1312);
						match(COLON);
						setState(1313);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1316);
						assign_operators();
						setState(1317);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1319);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1320);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1332);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1321);
							identifier();
							}
							break;
						case 2:
							{
							setState(1322);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1323);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1324);
							match(NEW);
							setState(1326);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1325);
								nonWildcardTypeArguments();
								}
							}

							setState(1328);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1329);
							match(SUPER);
							setState(1330);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1331);
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
						setState(1334);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1335);
						match(LBRACK);
						setState(1336);
						expression(0);
						setState(1337);
						match(RBRACK);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1339);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1340);
						((ExpressionContext)_localctx).postfix = unary_postfix_operators();
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1341);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1342);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1343);
						typeType();
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1344);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1345);
						match(COLONCOLON);
						setState(1347);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1346);
							typeArguments();
							}
						}

						setState(1349);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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

	public static class Unary_postfix_operatorsContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode UNOP() { return getToken(JavaParser.UNOP, 0); }
		public Unary_postfix_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_postfix_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterUnary_postfix_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitUnary_postfix_operators(this);
		}
	}

	public final Unary_postfix_operatorsContext unary_postfix_operators() throws RecognitionException {
		Unary_postfix_operatorsContext _localctx = new Unary_postfix_operatorsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_unary_postfix_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (INC - 88)) | (1L << (DEC - 88)) | (1L << (UNOP - 88)))) != 0)) ) {
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

	public static class Unary_prefix_operatorsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public TerminalNode UNOP() { return getToken(JavaParser.UNOP, 0); }
		public Unary_prefix_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_prefix_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterUnary_prefix_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitUnary_prefix_operators(this);
		}
	}

	public final Unary_prefix_operatorsContext unary_prefix_operators() throws RecognitionException {
		Unary_prefix_operatorsContext _localctx = new Unary_prefix_operatorsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_unary_prefix_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (BANG - 78)) | (1L << (TILDE - 78)) | (1L << (INC - 78)) | (1L << (DEC - 78)) | (1L << (ADD - 78)) | (1L << (SUB - 78)) | (1L << (UNOP - 78)))) != 0)) ) {
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
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
		enterRule(_localctx, 182, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			lambdaParameters();
			setState(1360);
			match(ARROW);
			setState(1361);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
		enterRule(_localctx, 184, RULE_lambdaParameters);
		int _la;
		try {
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				match(LPAREN);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << WILDCARD))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1365);
					formalParameterList();
					}
				}

				setState(1368);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				match(LPAREN);
				setState(1370);
				identifier();
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1371);
					match(COMMA);
					setState(1372);
					identifier();
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1378);
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
		enterRule(_localctx, 186, RULE_lambdaBody);
		try {
			setState(1384);
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
			case UNOP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				expression(0);
				}
				break;
			case NEWLINE:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
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
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
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
		enterRule(_localctx, 188, RULE_primary);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				match(LPAREN);
				setState(1387);
				expression(0);
				setState(1388);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1392);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1393);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1394);
				typeTypeOrVoid();
				setState(1395);
				match(DOT);
				setState(1396);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1398);
				nonWildcardTypeArguments();
				setState(1402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1399);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1400);
					match(THIS);
					setState(1401);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
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
		enterRule(_localctx, 190, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1406);
				classOrInterfaceType();
				setState(1407);
				match(DOT);
				}
				break;
			}
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1411);
				annotation();
				}
				}
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1417);
			identifier();
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1418);
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
		enterRule(_localctx, 192, RULE_creator);
		try {
			setState(1430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				nonWildcardTypeArguments();
				setState(1422);
				createdName();
				setState(1423);
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
				setState(1425);
				createdName();
				setState(1428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1426);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1427);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
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
		enterRule(_localctx, 194, RULE_createdName);
		int _la;
		try {
			setState(1447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				identifier();
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1433);
					typeArgumentsOrDiamond();
					}
				}

				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1436);
					match(DOT);
					setState(1437);
					identifier();
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1438);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1445);
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
				setState(1446);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 196, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			identifier();
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1450);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1453);
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
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
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
		enterRule(_localctx, 198, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(LBRACK);
			setState(1483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1456);
				match(RBRACK);
				setState(1461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1457);
					match(LBRACK);
					setState(1458);
					match(RBRACK);
					}
					}
					setState(1463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1464);
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
			case UNOP:
			case AT:
			case IDENTIFIER:
				{
				setState(1465);
				expression(0);
				setState(1466);
				match(RBRACK);
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1467);
						match(LBRACK);
						setState(1468);
						expression(0);
						setState(1469);
						match(RBRACK);
						}
						} 
					}
					setState(1475);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1476);
						match(LBRACK);
						setState(1477);
						match(RBRACK);
						}
						} 
					}
					setState(1482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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
		enterRule(_localctx, 200, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			arguments();
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1486);
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
		enterRule(_localctx, 202, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			nonWildcardTypeArguments();
			setState(1490);
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
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
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
		enterRule(_localctx, 204, RULE_typeArgumentsOrDiamond);
		try {
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492);
				match(LT);
				setState(1493);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
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
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
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
		enterRule(_localctx, 206, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				match(LT);
				setState(1498);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
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
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
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
		enterRule(_localctx, 208, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(LT);
			setState(1503);
			typeList();
			setState(1504);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
		enterRule(_localctx, 210, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			typeType();
			setState(1511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1507);
				match(COMMA);
				setState(1508);
				typeType();
				}
				}
				setState(1513);
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
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
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
		enterRule(_localctx, 212, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1514);
				annotation();
				}
			}

			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1517);
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
				setState(1518);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt != ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1521);
					match(LBRACK);
					setState(1522);
					match(RBRACK);
					}
					} 
				}
				setState(1527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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
		enterRule(_localctx, 214, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
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
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
		enterRule(_localctx, 216, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(LT);
			setState(1531);
			typeArgument();
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1532);
				match(COMMA);
				setState(1533);
				typeArgument();
				}
				}
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1539);
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
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 218, RULE_superSuffix);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				match(DOT);
				setState(1543);
				identifier();
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1544);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 220, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549);
				match(SUPER);
				setState(1550);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1551);
				identifier();
				setState(1552);
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
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
		enterRule(_localctx, 222, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(LPAREN);
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1557);
				expressionList();
				}
			}

			setState(1560);
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
		case 88:
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
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\u061d\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\3\2\3\2\5\2\u00e5\n\2\3\2\3\2\5"+
		"\2\u00e9\n\2\3\2\3\2\5\2\u00ed\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0105\n\3\3\4"+
		"\5\4\u0108\n\4\3\4\7\4\u010b\n\4\f\4\16\4\u010e\13\4\3\4\7\4\u0111\n\4"+
		"\f\4\16\4\u0114\13\4\3\4\3\4\3\5\7\5\u0119\n\5\f\5\16\5\u011c\13\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\5\6\u0124\n\6\3\6\3\6\3\6\5\6\u0129\n\6\3\6\3\6\3"+
		"\7\7\7\u012e\n\7\f\7\16\7\u0131\13\7\3\7\3\7\3\7\3\7\5\7\u0137\n\7\3\7"+
		"\5\7\u013a\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0141\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u014b\n\t\3\n\3\n\5\n\u014f\n\n\3\13\3\13\3\13\5\13\u0154"+
		"\n\13\3\13\3\13\5\13\u0158\n\13\3\13\3\13\5\13\u015c\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\7\f\u0164\n\f\f\f\16\f\u0167\13\f\3\f\3\f\3\r\7\r\u016c"+
		"\n\r\f\r\16\r\u016f\13\r\3\r\3\r\3\r\5\r\u0174\n\r\3\16\3\16\3\16\7\16"+
		"\u0179\n\16\f\16\16\16\u017c\13\16\3\17\3\17\3\17\3\17\5\17\u0182\n\17"+
		"\3\17\3\17\5\17\u0186\n\17\3\17\5\17\u0189\n\17\3\17\5\17\u018c\n\17\3"+
		"\17\3\17\3\20\3\20\3\20\7\20\u0193\n\20\f\20\16\20\u0196\13\20\3\21\7"+
		"\21\u0199\n\21\f\21\16\21\u019c\13\21\3\21\3\21\5\21\u01a0\n\21\3\21\5"+
		"\21\u01a3\n\21\3\22\3\22\7\22\u01a7\n\22\f\22\16\22\u01aa\13\22\3\23\3"+
		"\23\3\23\5\23\u01af\n\23\3\23\3\23\5\23\u01b3\n\23\3\23\3\23\3\24\3\24"+
		"\7\24\u01b9\n\24\f\24\16\24\u01bc\13\24\3\24\3\24\3\25\3\25\7\25\u01c2"+
		"\n\25\f\25\16\25\u01c5\13\25\3\25\3\25\3\26\3\26\5\26\u01cb\n\26\3\26"+
		"\3\26\7\26\u01cf\n\26\f\26\16\26\u01d2\13\26\3\26\5\26\u01d5\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01e0\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u01e7\n\30\f\30\16\30\u01ea\13\30\3\30\3\30\5\30\u01ee"+
		"\n\30\3\30\3\30\3\31\3\31\5\31\u01f4\n\31\3\32\3\32\5\32\u01f8\n\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0204\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\7\37\u020d\n\37\f\37\16\37\u0210\13\37"+
		"\3\37\3\37\5\37\u0214\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u021d\n \3!\3!\3!\3"+
		"!\7!\u0223\n!\f!\16!\u0226\13!\3!\3!\3\"\3\"\3\"\7\"\u022d\n\"\f\"\16"+
		"\"\u0230\13\"\3\"\3\"\3\"\3#\7#\u0236\n#\f#\16#\u0239\13#\3#\3#\3#\7#"+
		"\u023e\n#\f#\16#\u0241\13#\3#\3#\5#\u0245\n#\3#\3#\3#\3#\7#\u024b\n#\f"+
		"#\16#\u024e\13#\3#\3#\5#\u0252\n#\3#\3#\3#\3#\5#\u0258\n#\3#\3#\3#\3#"+
		"\7#\u025e\n#\f#\16#\u0261\13#\3#\3#\5#\u0265\n#\3#\3#\5#\u0269\n#\3$\3"+
		"$\3$\3$\3$\3$\5$\u0271\n$\3%\3%\3%\3&\3&\3&\7&\u0279\n&\f&\16&\u027c\13"+
		"&\3\'\3\'\3\'\5\'\u0281\n\'\3(\3(\3(\7(\u0286\n(\f(\16(\u0289\13(\3)\3"+
		")\5)\u028d\n)\3*\3*\3*\3*\7*\u0293\n*\f*\16*\u0296\13*\3*\5*\u0299\n*"+
		"\5*\u029b\n*\3*\3*\3+\3+\5+\u02a1\n+\3+\3+\3+\5+\u02a6\n+\7+\u02a8\n+"+
		"\f+\16+\u02ab\13+\3,\3,\3,\3,\5,\u02b1\n,\5,\u02b3\n,\3-\3-\3-\7-\u02b8"+
		"\n-\f-\16-\u02bb\13-\3.\3.\5.\u02bf\n.\3.\3.\3/\3/\3/\7/\u02c6\n/\f/\16"+
		"/\u02c9\13/\3/\3/\5/\u02cd\n/\3/\3/\5/\u02d1\n/\3\60\7\60\u02d4\n\60\f"+
		"\60\16\60\u02d7\13\60\3\60\3\60\3\60\3\61\7\61\u02dd\n\61\f\61\16\61\u02e0"+
		"\13\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u02e9\n\62\f\62\16\62\u02ec"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02f5\n\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u0300\n\66\3\66\5\66\u0303\n\66"+
		"\3\67\3\67\3\67\7\67\u0308\n\67\f\67\16\67\u030b\13\67\38\38\38\38\39"+
		"\39\39\59\u0314\n9\3:\3:\3:\3:\7:\u031a\n:\f:\16:\u031d\13:\5:\u031f\n"+
		":\3:\5:\u0322\n:\3:\3:\3;\3;\3;\3;\3;\3<\3<\7<\u032d\n<\f<\16<\u0330\13"+
		"<\3<\3<\3=\7=\u0335\n=\f=\16=\u0338\13=\3=\3=\5=\u033c\n=\3>\3>\3>\3>"+
		"\3>\3>\5>\u0344\n>\3>\3>\5>\u0348\n>\3>\3>\5>\u034c\n>\3>\3>\5>\u0350"+
		"\n>\5>\u0352\n>\3?\3?\5?\u0356\n?\3@\3@\3@\3@\5@\u035c\n@\3A\3A\3B\3B"+
		"\3B\3C\5C\u0364\nC\3C\3C\5C\u0368\nC\3C\3C\5C\u036c\nC\3C\5C\u036f\nC"+
		"\3C\5C\u0372\nC\3C\3C\5C\u0376\nC\3C\3C\5C\u037a\nC\3C\5C\u037d\nC\5C"+
		"\u037f\nC\3D\3D\7D\u0383\nD\fD\16D\u0386\13D\5D\u0388\nD\3E\3E\3E\5E\u038d"+
		"\nE\3E\3E\5E\u0391\nE\3E\3E\5E\u0395\nE\3E\3E\5E\u0399\nE\5E\u039b\nE"+
		"\3F\7F\u039e\nF\fF\16F\u03a1\13F\3F\3F\3F\3G\7G\u03a7\nG\fG\16G\u03aa"+
		"\13G\3G\3G\5G\u03ae\nG\3G\5G\u03b1\nG\3H\3H\3H\3H\3H\3H\5H\u03b9\nH\3"+
		"H\3H\3H\3H\5H\u03bf\nH\3H\3H\3H\3H\3H\5H\u03c6\nH\3H\3H\5H\u03ca\nH\3"+
		"H\3H\3H\3H\3H\5H\u03d1\nH\3H\3H\3H\5H\u03d6\nH\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\6H\u03e1\nH\rH\16H\u03e2\3H\5H\u03e6\nH\3H\5H\u03e9\nH\3H\3H\3H\3"+
		"H\7H\u03ef\nH\fH\16H\u03f2\13H\3H\5H\u03f5\nH\3H\3H\3H\3H\7H\u03fb\nH"+
		"\fH\16H\u03fe\13H\3H\7H\u0401\nH\fH\16H\u0404\13H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\5H\u040e\nH\3H\3H\3H\3H\3H\3H\3H\5H\u0417\nH\3H\3H\3H\5H\u041c\n"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0427\nH\3I\3I\3J\3J\3J\7J\u042e\nJ\f"+
		"J\16J\u0431\13J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u043d\nJ\3K\3K\3K\7K"+
		"\u0442\nK\fK\16K\u0445\13K\3L\3L\3L\3M\3M\3M\5M\u044d\nM\3M\3M\3N\3N\3"+
		"N\7N\u0454\nN\fN\16N\u0457\13N\3O\7O\u045a\nO\fO\16O\u045d\13O\3O\3O\3"+
		"O\3O\3O\3P\6P\u0465\nP\rP\16P\u0466\3P\6P\u046a\nP\rP\16P\u046b\3Q\3Q"+
		"\3Q\5Q\u0471\nQ\3Q\3Q\3Q\3Q\5Q\u0477\nQ\3R\3R\5R\u047b\nR\3R\3R\5R\u047f"+
		"\nR\3R\3R\5R\u0483\nR\5R\u0485\nR\3S\3S\5S\u0489\nS\3T\7T\u048c\nT\fT"+
		"\16T\u048f\13T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\5U\u049e\nU\3V\3"+
		"V\3V\3V\7V\u04a4\nV\fV\16V\u04a7\13V\3V\3V\3V\7V\u04ac\nV\fV\16V\u04af"+
		"\13V\5V\u04b1\nV\3W\3W\3W\5W\u04b6\nW\3W\3W\3W\3W\3W\5W\u04bd\nW\3W\3"+
		"W\3W\3W\5W\u04c3\nW\3W\3W\3W\3W\5W\u04c9\nW\3W\5W\u04cc\nW\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u04e6"+
		"\nX\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u04fd\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u050d\nZ\3Z\3Z"+
		"\5Z\u0511\nZ\3Z\3Z\3Z\5Z\u0516\nZ\3Z\3Z\5Z\u051a\nZ\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0531\nZ\3Z\3Z\3Z\3Z"+
		"\5Z\u0537\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0546\nZ\3Z\7Z"+
		"\u0549\nZ\fZ\16Z\u054c\13Z\3[\3[\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\5^\u0559"+
		"\n^\3^\3^\3^\3^\3^\7^\u0560\n^\f^\16^\u0563\13^\3^\3^\5^\u0567\n^\3_\3"+
		"_\5_\u056b\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u057d"+
		"\n`\5`\u057f\n`\3a\3a\3a\5a\u0584\na\3a\7a\u0587\na\fa\16a\u058a\13a\3"+
		"a\3a\5a\u058e\na\3b\3b\3b\3b\3b\3b\3b\5b\u0597\nb\5b\u0599\nb\3c\3c\5"+
		"c\u059d\nc\3c\3c\3c\5c\u05a2\nc\7c\u05a4\nc\fc\16c\u05a7\13c\3c\5c\u05aa"+
		"\nc\3d\3d\5d\u05ae\nd\3d\3d\3e\3e\3e\3e\7e\u05b6\ne\fe\16e\u05b9\13e\3"+
		"e\3e\3e\3e\3e\3e\3e\7e\u05c2\ne\fe\16e\u05c5\13e\3e\3e\7e\u05c9\ne\fe"+
		"\16e\u05cc\13e\5e\u05ce\ne\3f\3f\5f\u05d2\nf\3g\3g\3g\3h\3h\3h\5h\u05da"+
		"\nh\3i\3i\3i\5i\u05df\ni\3j\3j\3j\3j\3k\3k\3k\7k\u05e8\nk\fk\16k\u05eb"+
		"\13k\3l\5l\u05ee\nl\3l\3l\5l\u05f2\nl\3l\3l\7l\u05f6\nl\fl\16l\u05f9\13"+
		"l\3m\3m\3n\3n\3n\3n\7n\u0601\nn\fn\16n\u0604\13n\3n\3n\3o\3o\3o\3o\5o"+
		"\u060c\no\5o\u060e\no\3p\3p\3p\3p\3p\5p\u0615\np\3q\3q\5q\u0619\nq\3q"+
		"\3q\3q\2\3\u00b2r\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\2\t\4\2\23\23**\3\2:"+
		"=\3\2>?\5\2MMddhr\4\2Z[ff\5\2PQZ]ff\n\2\5\5\7\7\n\n\20\20\26\26\35\35"+
		"\37\37\'\'\2\u06f7\2\u00e2\3\2\2\2\4\u0104\3\2\2\2\6\u0107\3\2\2\2\b\u011a"+
		"\3\2\2\2\n\u0121\3\2\2\2\f\u0139\3\2\2\2\16\u0140\3\2\2\2\20\u014a\3\2"+
		"\2\2\22\u014e\3\2\2\2\24\u0150\3\2\2\2\26\u015f\3\2\2\2\30\u016d\3\2\2"+
		"\2\32\u0175\3\2\2\2\34\u017d\3\2\2\2\36\u018f\3\2\2\2 \u019a\3\2\2\2\""+
		"\u01a4\3\2\2\2$\u01ab\3\2\2\2&\u01b6\3\2\2\2(\u01bf\3\2\2\2*\u01d4\3\2"+
		"\2\2,\u01df\3\2\2\2.\u01e1\3\2\2\2\60\u01f3\3\2\2\2\62\u01f7\3\2\2\2\64"+
		"\u01f9\3\2\2\2\66\u01fc\3\2\2\28\u01ff\3\2\2\2:\u0207\3\2\2\2<\u0213\3"+
		"\2\2\2>\u021c\3\2\2\2@\u021e\3\2\2\2B\u0229\3\2\2\2D\u0268\3\2\2\2F\u0270"+
		"\3\2\2\2H\u0272\3\2\2\2J\u0275\3\2\2\2L\u027d\3\2\2\2N\u0282\3\2\2\2P"+
		"\u028c\3\2\2\2R\u028e\3\2\2\2T\u029e\3\2\2\2V\u02b2\3\2\2\2X\u02b4\3\2"+
		"\2\2Z\u02bc\3\2\2\2\\\u02d0\3\2\2\2^\u02d5\3\2\2\2`\u02de\3\2\2\2b\u02e5"+
		"\3\2\2\2d\u02f4\3\2\2\2f\u02f6\3\2\2\2h\u02f8\3\2\2\2j\u02fa\3\2\2\2l"+
		"\u0304\3\2\2\2n\u030c\3\2\2\2p\u0313\3\2\2\2r\u0315\3\2\2\2t\u0325\3\2"+
		"\2\2v\u032a\3\2\2\2x\u033b\3\2\2\2z\u0351\3\2\2\2|\u0355\3\2\2\2~\u0357"+
		"\3\2\2\2\u0080\u035d\3\2\2\2\u0082\u035f\3\2\2\2\u0084\u037e\3\2\2\2\u0086"+
		"\u0387\3\2\2\2\u0088\u039a\3\2\2\2\u008a\u039f\3\2\2\2\u008c\u03b0\3\2"+
		"\2\2\u008e\u0426\3\2\2\2\u0090\u0428\3\2\2\2\u0092\u043c\3\2\2\2\u0094"+
		"\u043e\3\2\2\2\u0096\u0446\3\2\2\2\u0098\u0449\3\2\2\2\u009a\u0450\3\2"+
		"\2\2\u009c\u045b\3\2\2\2\u009e\u0464\3\2\2\2\u00a0\u0476\3\2\2\2\u00a2"+
		"\u0484\3\2\2\2\u00a4\u0488\3\2\2\2\u00a6\u048d\3\2\2\2\u00a8\u049d\3\2"+
		"\2\2\u00aa\u04b0\3\2\2\2\u00ac\u04cb\3\2\2\2\u00ae\u04e5\3\2\2\2\u00b0"+
		"\u04e7\3\2\2\2\u00b2\u0519\3\2\2\2\u00b4\u054d\3\2\2\2\u00b6\u054f\3\2"+
		"\2\2\u00b8\u0551\3\2\2\2\u00ba\u0566\3\2\2\2\u00bc\u056a\3\2\2\2\u00be"+
		"\u057e\3\2\2\2\u00c0\u0583\3\2\2\2\u00c2\u0598\3\2\2\2\u00c4\u05a9\3\2"+
		"\2\2\u00c6\u05ab\3\2\2\2\u00c8\u05b1\3\2\2\2\u00ca\u05cf\3\2\2\2\u00cc"+
		"\u05d3\3\2\2\2\u00ce\u05d9\3\2\2\2\u00d0\u05de\3\2\2\2\u00d2\u05e0\3\2"+
		"\2\2\u00d4\u05e4\3\2\2\2\u00d6\u05ed\3\2\2\2\u00d8\u05fa\3\2\2\2\u00da"+
		"\u05fc\3\2\2\2\u00dc\u060d\3\2\2\2\u00de\u0614\3\2\2\2\u00e0\u0616\3\2"+
		"\2\2\u00e2\u00e4\5\4\3\2\u00e3\u00e5\78\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\7g\2\2\u00e7\u00e9\78\2"+
		"\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec"+
		"\5\4\3\2\u00eb\u00ed\78\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\3\3\2\2\2\u00ee\u0105\5\b\5\2\u00ef\u0105\5\n\6\2\u00f0\u0105\5\34\17"+
		"\2\u00f1\u0105\5 \21\2\u00f2\u0105\5$\23\2\u00f3\u0105\5,\27\2\u00f4\u0105"+
		"\5D#\2\u00f5\u0105\5H%\2\u00f6\u0105\5L\'\2\u00f7\u0105\5d\63\2\u00f8"+
		"\u0105\5j\66\2\u00f9\u0105\5n8\2\u00fa\u0105\5t;\2\u00fb\u0105\5\u0086"+
		"D\2\u00fc\u0105\5\u0088E\2\u00fd\u0105\5\u0084C\2\u00fe\u0105\5\u00b2"+
		"Z\2\u00ff\u0105\5\u00a8U\2\u0100\u0105\5\u00aaV\2\u0101\u0105\5\u00ac"+
		"W\2\u0102\u0105\7\67\2\2\u0103\u0105\7\66\2\2\u0104\u00ee\3\2\2\2\u0104"+
		"\u00ef\3\2\2\2\u0104\u00f0\3\2\2\2\u0104\u00f1\3\2\2\2\u0104\u00f2\3\2"+
		"\2\2\u0104\u00f3\3\2\2\2\u0104\u00f4\3\2\2\2\u0104\u00f5\3\2\2\2\u0104"+
		"\u00f6\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00f9\3\2"+
		"\2\2\u0104\u00fa\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u00fd\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2"+
		"\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\5\3\2\2\2\u0106\u0108\5\b\5\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u010c\3\2\2\2\u0109\u010b\5\n\6\2\u010a\u0109\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0112\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0111\5\f\7\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7\2\2\3\u0116\7\3\2\2\2\u0117\u0119\5j\66\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\"\2\2\u011e"+
		"\u011f\5b\62\2\u011f\u0120\7J\2\2\u0120\t\3\2\2\2\u0121\u0123\7\33\2\2"+
		"\u0122\u0124\7(\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0128\5b\62\2\u0126\u0127\7L\2\2\u0127\u0129\7^\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7J"+
		"\2\2\u012b\13\3\2\2\2\u012c\u012e\5\20\t\2\u012d\u012c\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0136\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0137\5\24\13\2\u0133\u0137\5\34\17\2\u0134\u0137"+
		"\5$\23\2\u0135\u0137\5t;\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u013a\7J"+
		"\2\2\u0139\u012f\3\2\2\2\u0139\u0138\3\2\2\2\u013a\r\3\2\2\2\u013b\u0141"+
		"\5\20\t\2\u013c\u0141\7 \2\2\u013d\u0141\7,\2\2\u013e\u0141\7\60\2\2\u013f"+
		"\u0141\7\63\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013d\3"+
		"\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\17\3\2\2\2\u0142"+
		"\u014b\5j\66\2\u0143\u014b\7%\2\2\u0144\u014b\7$\2\2\u0145\u014b\7#\2"+
		"\2\u0146\u014b\7(\2\2\u0147\u014b\7\3\2\2\u0148\u014b\7\24\2\2\u0149\u014b"+
		"\7)\2\2\u014a\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u0149\3\2\2\2\u014b\21\3\2\2\2\u014c\u014f\7\24\2\2\u014d\u014f"+
		"\5j\66\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\23\3\2\2\2\u0150"+
		"\u0151\7\13\2\2\u0151\u0153\5\u0090I\2\u0152\u0154\5\26\f\2\u0153\u0152"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\7\23\2\2"+
		"\u0156\u0158\5\u00d6l\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u015a\7\32\2\2\u015a\u015c\5\u00d4k\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5&\24\2\u015e"+
		"\25\3\2\2\2\u015f\u0160\7O\2\2\u0160\u0165\5\30\r\2\u0161\u0162\7K\2\2"+
		"\u0162\u0164\5\30\r\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0169\7N\2\2\u0169\27\3\2\2\2\u016a\u016c\5j\66\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\5\u0090I\2\u0171\u0172\7\23\2"+
		"\2\u0172\u0174\5\32\16\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\31\3\2\2\2\u0175\u017a\5\u00d6l\2\u0176\u0177\7`\2\2\u0177\u0179\5\u00d6"+
		"l\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\33\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\22\2"+
		"\2\u017e\u0181\5\u0090I\2\u017f\u0180\7\32\2\2\u0180\u0182\5\u00d4k\2"+
		"\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185"+
		"\7F\2\2\u0184\u0186\5\36\20\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2"+
		"\u0186\u0188\3\2\2\2\u0187\u0189\7K\2\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\5\"\22\2\u018b\u018a\3\2\2\2"+
		"\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7G\2\2\u018e\35\3"+
		"\2\2\2\u018f\u0194\5 \21\2\u0190\u0191\7K\2\2\u0191\u0193\5 \21\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\37\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5j\66\2\u0198\u0197"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\5\u0090I\2\u019e\u01a0"+
		"\5\u00e0q\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2"+
		"\2\u01a1\u01a3\5&\24\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3!"+
		"\3\2\2\2\u01a4\u01a8\7J\2\2\u01a5\u01a7\5*\26\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9#\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\36\2\2\u01ac\u01ae\5\u0090I\2\u01ad"+
		"\u01af\5\26\f\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3"+
		"\2\2\2\u01b0\u01b1\7\23\2\2\u01b1\u01b3\5\u00d4k\2\u01b2\u01b0\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5(\25\2\u01b5%\3"+
		"\2\2\2\u01b6\u01ba\7F\2\2\u01b7\u01b9\5*\26\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7G\2\2\u01be\'\3\2\2\2\u01bf\u01c3"+
		"\7F\2\2\u01c0\u01c2\5<\37\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c7\7G\2\2\u01c7)\3\2\2\2\u01c8\u01d5\7J\2\2\u01c9\u01cb"+
		"\7(\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01d5\5\u0084C\2\u01cd\u01cf\5\16\b\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d5\5,\27\2\u01d4\u01c8\3\2\2\2\u01d4\u01ca\3\2"+
		"\2\2\u01d4\u01d0\3\2\2\2\u01d5+\3\2\2\2\u01d6\u01e0\5.\30\2\u01d7\u01e0"+
		"\5\64\33\2\u01d8\u01e0\5:\36\2\u01d9\u01e0\58\35\2\u01da\u01e0\5\66\34"+
		"\2\u01db\u01e0\5$\23\2\u01dc\u01e0\5t;\2\u01dd\u01e0\5\24\13\2\u01de\u01e0"+
		"\5\34\17\2\u01df\u01d6\3\2\2\2\u01df\u01d7\3\2\2\2\u01df\u01d8\3\2\2\2"+
		"\u01df\u01d9\3\2\2\2\u01df\u01da\3\2\2\2\u01df\u01db\3\2\2\2\u01df\u01dc"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0-\3\2\2\2\u01e1"+
		"\u01e2\5\62\32\2\u01e2\u01e3\5\u0090I\2\u01e3\u01e8\5Z.\2\u01e4\u01e5"+
		"\7H\2\2\u01e5\u01e7\7I\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01ec\7/\2\2\u01ec\u01ee\5X-\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\5\60\31\2\u01f0/\3\2\2\2\u01f1"+
		"\u01f4\5\u0084C\2\u01f2\u01f4\7J\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3"+
		"\2\2\2\u01f4\61\3\2\2\2\u01f5\u01f8\5\u00d6l\2\u01f6\u01f8\7\62\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\63\3\2\2\2\u01f9\u01fa\5\26\f"+
		"\2\u01fa\u01fb\5.\30\2\u01fb\65\3\2\2\2\u01fc\u01fd\5\26\f\2\u01fd\u01fe"+
		"\58\35\2\u01fe\67\3\2\2\2\u01ff\u0200\5\u0090I\2\u0200\u0203\5Z.\2\u0201"+
		"\u0202\7/\2\2\u0202\u0204\5X-\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2"+
		"\2\u0204\u0205\3\2\2\2\u0205\u0206\5\u0084C\2\u02069\3\2\2\2\u0207\u0208"+
		"\5\u00d6l\2\u0208\u0209\5J&\2\u0209\u020a\7J\2\2\u020a;\3\2\2\2\u020b"+
		"\u020d\5\16\b\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3"+
		"\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\5> \2\u0212\u0214\7J\2\2\u0213\u020e\3\2\2\2\u0213\u0212\3\2\2"+
		"\2\u0214=\3\2\2\2\u0215\u021d\5@!\2\u0216\u021d\5D#\2\u0217\u021d\5H%"+
		"\2\u0218\u021d\5$\23\2\u0219\u021d\5t;\2\u021a\u021d\5\24\13\2\u021b\u021d"+
		"\5\34\17\2\u021c\u0215\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0217\3\2\2\2"+
		"\u021c\u0218\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b"+
		"\3\2\2\2\u021d?\3\2\2\2\u021e\u021f\5\u00d6l\2\u021f\u0224\5B\"\2\u0220"+
		"\u0221\7K\2\2\u0221\u0223\5B\"\2\u0222\u0220\3\2\2\2\u0223\u0226\3\2\2"+
		"\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u0228\7J\2\2\u0228A\3\2\2\2\u0229\u022e\5\u0090I\2\u022a"+
		"\u022b\7H\2\2\u022b\u022d\7I\2\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2"+
		"\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e"+
		"\3\2\2\2\u0231\u0232\7M\2\2\u0232\u0233\5P)\2\u0233C\3\2\2\2\u0234\u0236"+
		"\5F$\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0244\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u0245\5\62"+
		"\32\2\u023b\u023f\5\26\f\2\u023c\u023e\5j\66\2\u023d\u023c\3\2\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0243\5\62\32\2\u0243\u0245\3\2\2\2\u0244"+
		"\u023a\3\2\2\2\u0244\u023b\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\5\u0090"+
		"I\2\u0247\u024c\5Z.\2\u0248\u0249\7H\2\2\u0249\u024b\7I\2\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0251\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7/\2\2\u0250\u0252\5X-"+
		"\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254"+
		"\5\60\31\2\u0254\u0269\3\2\2\2\u0255\u0257\7\67\2\2\u0256\u0258\78\2\2"+
		"\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a"+
		"\5\u0090I\2\u025a\u025f\5Z.\2\u025b\u025c\7H\2\2\u025c\u025e\7I\2\2\u025d"+
		"\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0264\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7/\2\2\u0263"+
		"\u0265\5X-\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2"+
		"\2\u0266\u0267\5\60\31\2\u0267\u0269\3\2\2\2\u0268\u0237\3\2\2\2\u0268"+
		"\u0255\3\2\2\2\u0269E\3\2\2\2\u026a\u0271\5j\66\2\u026b\u0271\7%\2\2\u026c"+
		"\u0271\7\3\2\2\u026d\u0271\7\16\2\2\u026e\u0271\7(\2\2\u026f\u0271\7)"+
		"\2\2\u0270\u026a\3\2\2\2\u0270\u026b\3\2\2\2\u0270\u026c\3\2\2\2\u0270"+
		"\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271G\3\2\2\2"+
		"\u0272\u0273\5\26\f\2\u0273\u0274\5D#\2\u0274I\3\2\2\2\u0275\u027a\5L"+
		"\'\2\u0276\u0277\7K\2\2\u0277\u0279\5L\'\2\u0278\u0276\3\2\2\2\u0279\u027c"+
		"\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027bK\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u0280\5N(\2\u027e\u027f\7M\2\2\u027f\u0281\5P)\2"+
		"\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281M\3\2\2\2\u0282\u0287\5"+
		"\u0090I\2\u0283\u0284\7H\2\2\u0284\u0286\7I\2\2\u0285\u0283\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288O\3\2\2\2"+
		"\u0289\u0287\3\2\2\2\u028a\u028d\5R*\2\u028b\u028d\5\u00b2Z\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028b\3\2\2\2\u028dQ\3\2\2\2\u028e\u029a\7F\2\2\u028f\u0294"+
		"\5P)\2\u0290\u0291\7K\2\2\u0291\u0293\5P)\2\u0292\u0290\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0297\u0299\7K\2\2\u0298\u0297\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u028f\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7G\2\2\u029dS\3\2\2\2\u029e\u02a0"+
		"\5\u0090I\2\u029f\u02a1\5\u00dan\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u02a9\3\2\2\2\u02a2\u02a3\7L\2\2\u02a3\u02a5\5\u0090I\2\u02a4"+
		"\u02a6\5\u00dan\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8"+
		"\3\2\2\2\u02a7\u02a2\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aaU\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02b3\5\u00d6"+
		"l\2\u02ad\u02b0\7R\2\2\u02ae\u02af\t\2\2\2\u02af\u02b1\5\u00d6l\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02ac\3\2"+
		"\2\2\u02b2\u02ad\3\2\2\2\u02b3W\3\2\2\2\u02b4\u02b9\5b\62\2\u02b5\u02b6"+
		"\7K\2\2\u02b6\u02b8\5b\62\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02baY\3\2\2\2\u02bb\u02b9\3\2\2\2"+
		"\u02bc\u02be\7D\2\2\u02bd\u02bf\5\\/\2\u02be\u02bd\3\2\2\2\u02be\u02bf"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\7E\2\2\u02c1[\3\2\2\2\u02c2\u02c7"+
		"\5^\60\2\u02c3\u02c4\7K\2\2\u02c4\u02c6\5^\60\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cc\3\2"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7K\2\2\u02cb\u02cd\5`\61\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d1\3\2\2\2\u02ce\u02d1\5`"+
		"\61\2\u02cf\u02d1\7\67\2\2\u02d0\u02c2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d1]\3\2\2\2\u02d2\u02d4\5\22\n\2\u02d3\u02d2\3\2\2\2"+
		"\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8"+
		"\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\5\u00d6l\2\u02d9\u02da\5N(\2"+
		"\u02da_\3\2\2\2\u02db\u02dd\5\22\n\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3"+
		"\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e1\u02e2\5\u00d6l\2\u02e2\u02e3\7v\2\2\u02e3\u02e4\5"+
		"N(\2\u02e4a\3\2\2\2\u02e5\u02ea\5\u0090I\2\u02e6\u02e7\7L\2\2\u02e7\u02e9"+
		"\5\u0090I\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2"+
		"\2\u02ea\u02eb\3\2\2\2\u02ebc\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02f5"+
		"\5f\64\2\u02ee\u02f5\5h\65\2\u02ef\u02f5\7A\2\2\u02f0\u02f5\7B\2\2\u02f1"+
		"\u02f5\7@\2\2\u02f2\u02f5\7C\2\2\u02f3\u02f5\79\2\2\u02f4\u02ed\3\2\2"+
		"\2\u02f4\u02ee\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f1"+
		"\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5e\3\2\2\2\u02f6"+
		"\u02f7\t\3\2\2\u02f7g\3\2\2\2\u02f8\u02f9\t\4\2\2\u02f9i\3\2\2\2\u02fa"+
		"\u02fb\7u\2\2\u02fb\u0302\5b\62\2\u02fc\u02ff\7D\2\2\u02fd\u0300\5l\67"+
		"\2\u02fe\u0300\5p9\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\7E\2\2\u0302\u02fc\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303k\3\2\2\2\u0304\u0309\5n8\2\u0305\u0306\7K\2\2\u0306"+
		"\u0308\5n8\2\u0307\u0305\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030am\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d"+
		"\5\u0090I\2\u030d\u030e\7M\2\2\u030e\u030f\5p9\2\u030fo\3\2\2\2\u0310"+
		"\u0314\5\u00b2Z\2\u0311\u0314\5j\66\2\u0312\u0314\5r:\2\u0313\u0310\3"+
		"\2\2\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314q\3\2\2\2\u0315\u031e"+
		"\7F\2\2\u0316\u031b\5p9\2\u0317\u0318\7K\2\2\u0318\u031a\5p9\2\u0319\u0317"+
		"\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u0316\3\2\2\2\u031e\u031f\3\2"+
		"\2\2\u031f\u0321\3\2\2\2\u0320\u0322\7K\2\2\u0321\u0320\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7G\2\2\u0324s\3\2\2\2\u0325"+
		"\u0326\7u\2\2\u0326\u0327\7\36\2\2\u0327\u0328\5\u0090I\2\u0328\u0329"+
		"\5v<\2\u0329u\3\2\2\2\u032a\u032e\7F\2\2\u032b\u032d\5x=\2\u032c\u032b"+
		"\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7G\2\2\u0332w\3\2\2\2\u0333"+
		"\u0335\5\16\b\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3"+
		"\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339"+
		"\u033c\5z>\2\u033a\u033c\7J\2\2\u033b\u0336\3\2\2\2\u033b\u033a\3\2\2"+
		"\2\u033cy\3\2\2\2\u033d\u033e\5\u00d6l\2\u033e\u033f\5|?\2\u033f\u0340"+
		"\7J\2\2\u0340\u0352\3\2\2\2\u0341\u0343\5\24\13\2\u0342\u0344\7J\2\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0352\3\2\2\2\u0345\u0347\5$"+
		"\23\2\u0346\u0348\7J\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u0352\3\2\2\2\u0349\u034b\5\34\17\2\u034a\u034c\7J\2\2\u034b\u034a\3"+
		"\2\2\2\u034b\u034c\3\2\2\2\u034c\u0352\3\2\2\2\u034d\u034f\5t;\2\u034e"+
		"\u0350\7J\2\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2"+
		"\2\2\u0351\u033d\3\2\2\2\u0351\u0341\3\2\2\2\u0351\u0345\3\2\2\2\u0351"+
		"\u0349\3\2\2\2\u0351\u034d\3\2\2\2\u0352{\3\2\2\2\u0353\u0356\5~@\2\u0354"+
		"\u0356\5\u0080A\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356}\3\2\2"+
		"\2\u0357\u0358\5\u0090I\2\u0358\u0359\7D\2\2\u0359\u035b\7E\2\2\u035a"+
		"\u035c\5\u0082B\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\177\3"+
		"\2\2\2\u035d\u035e\5J&\2\u035e\u0081\3\2\2\2\u035f\u0360\7\16\2\2\u0360"+
		"\u0361\5p9\2\u0361\u0083\3\2\2\2\u0362\u0364\78\2\2\u0363\u0362\3\2\2"+
		"\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\7F\2\2\u0366\u0368"+
		"\78\2\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036b\5\u0086D\2\u036a\u036c\78\2\2\u036b\u036a\3\2\2\2\u036b\u036c\3"+
		"\2\2\2\u036c\u036e\3\2\2\2\u036d\u036f\7G\2\2\u036e\u036d\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u037f\3\2\2\2\u0370\u0372\78\2\2\u0371\u0370\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\7F\2\2\u0374"+
		"\u0376\78\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0379\7\67\2\2\u0378\u037a\78\2\2\u0379\u0378\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u037d\7G\2\2\u037c\u037b\3\2"+
		"\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u0363\3\2\2\2\u037e"+
		"\u0371\3\2\2\2\u037f\u0085\3\2\2\2\u0380\u0388\3\2\2\2\u0381\u0383\5\u0088"+
		"E\2\u0382\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0380\3\2"+
		"\2\2\u0387\u0384\3\2\2\2\u0388\u0087\3\2\2\2\u0389\u038a\5\u008aF\2\u038a"+
		"\u038c\7J\2\2\u038b\u038d\78\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2"+
		"\2\u038d\u039b\3\2\2\2\u038e\u0390\5\u008eH\2\u038f\u0391\78\2\2\u0390"+
		"\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u039b\3\2\2\2\u0392\u0394\5\u008c"+
		"G\2\u0393\u0395\78\2\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u039b"+
		"\3\2\2\2\u0396\u0398\7\67\2\2\u0397\u0399\78\2\2\u0398\u0397\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0389\3\2\2\2\u039a\u038e\3\2"+
		"\2\2\u039a\u0392\3\2\2\2\u039a\u0396\3\2\2\2\u039b\u0089\3\2\2\2\u039c"+
		"\u039e\5\22\n\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3"+
		"\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2"+
		"\u03a3\5\u00d6l\2\u03a3\u03a4\5J&\2\u03a4\u008b\3\2\2\2\u03a5\u03a7\5"+
		"\20\t\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03ad\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03ae\5\24"+
		"\13\2\u03ac\u03ae\5$\23\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae"+
		"\u03b1\3\2\2\2\u03af\u03b1\7J\2\2\u03b0\u03a8\3\2\2\2\u03b0\u03af\3\2"+
		"\2\2\u03b1\u008d\3\2\2\2\u03b2\u0427\5\u0084C\2\u03b3\u03b4\7\27\2\2\u03b4"+
		"\u03b5\7D\2\2\u03b5\u03b6\7\67\2\2\u03b6\u03b8\7E\2\2\u03b7\u03b9\5\u008e"+
		"H\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u0427\3\2\2\2\u03ba"+
		"\u03bb\7\4\2\2\u03bb\u03be\5\u00b2Z\2\u03bc\u03bd\7S\2\2\u03bd\u03bf\5"+
		"\u00b2Z\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2"+
		"\u03c0\u03c1\7J\2\2\u03c1\u0427\3\2\2\2\u03c2\u03c3\7\30\2\2\u03c3\u03c5"+
		"\5\u00a8U\2\u03c4\u03c6\5\u008eH\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2"+
		"\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c8\7\21\2\2\u03c8\u03ca\5\u008eH\2\u03c9"+
		"\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u0427\3\2\2\2\u03cb\u03cc\7\27"+
		"\2\2\u03cc\u03cd\7D\2\2\u03cd\u03ce\5\u00a2R\2\u03ce\u03d0\7E\2\2\u03cf"+
		"\u03d1\5\u008eH\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u0427"+
		"\3\2\2\2\u03d2\u03d3\7\64\2\2\u03d3\u03d5\5\u00a8U\2\u03d4\u03d6\5\u008e"+
		"H\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u0427\3\2\2\2\u03d7"+
		"\u03d8\7\17\2\2\u03d8\u03d9\5\u008eH\2\u03d9\u03da\7\64\2\2\u03da\u03db"+
		"\5\u00a8U\2\u03db\u03dc\7J\2\2\u03dc\u0427\3\2\2\2\u03dd\u03de\7\61\2"+
		"\2\u03de\u03e8\5\u0084C\2\u03df\u03e1\5\u0092J\2\u03e0\u03df\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2"+
		"\2\2\u03e4\u03e6\5\u0096L\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u03e9\3\2\2\2\u03e7\u03e9\5\u0096L\2\u03e8\u03e0\3\2\2\2\u03e8\u03e7"+
		"\3\2\2\2\u03e9\u0427\3\2\2\2\u03ea\u03eb\7\61\2\2\u03eb\u03ec\5\u0098"+
		"M\2\u03ec\u03f0\5\u0084C\2\u03ed\u03ef\5\u0092J\2\u03ee\u03ed\3\2\2\2"+
		"\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f4"+
		"\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f5\5\u0096L\2\u03f4\u03f3\3\2\2"+
		"\2\u03f4\u03f5\3\2\2\2\u03f5\u0427\3\2\2\2\u03f6\u03f7\7+\2\2\u03f7\u03f8"+
		"\5\u00a8U\2\u03f8\u03fc\7F\2\2\u03f9\u03fb\5\u009eP\2\u03fa\u03f9\3\2"+
		"\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u0402\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0401\5\u00a0Q\2\u0400\u03ff"+
		"\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0405\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0406\7G\2\2\u0406\u0427\3\2"+
		"\2\2\u0407\u0408\7,\2\2\u0408\u0409\5\u00a8U\2\u0409\u040a\5\u0084C\2"+
		"\u040a\u0427\3\2\2\2\u040b\u040d\7&\2\2\u040c\u040e\5\u00b2Z\2\u040d\u040c"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0427\7J\2\2\u0410"+
		"\u0411\7.\2\2\u0411\u0412\5\u00b2Z\2\u0412\u0413\7J\2\2\u0413\u0427\3"+
		"\2\2\2\u0414\u0416\7\6\2\2\u0415\u0417\5\u0090I\2\u0416\u0415\3\2\2\2"+
		"\u0416\u0417\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0427\7J\2\2\u0419\u041b"+
		"\7\r\2\2\u041a\u041c\5\u0090I\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2"+
		"\2\u041c\u041d\3\2\2\2\u041d\u0427\7J\2\2\u041e\u0427\7J\2\2\u041f\u0420"+
		"\5\u00b2Z\2\u0420\u0421\7J\2\2\u0421\u0427\3\2\2\2\u0422\u0423\5\u0090"+
		"I\2\u0423\u0424\7S\2\2\u0424\u0425\5\u008eH\2\u0425\u0427\3\2\2\2\u0426"+
		"\u03b2\3\2\2\2\u0426\u03b3\3\2\2\2\u0426\u03ba\3\2\2\2\u0426\u03c2\3\2"+
		"\2\2\u0426\u03cb\3\2\2\2\u0426\u03d2\3\2\2\2\u0426\u03d7\3\2\2\2\u0426"+
		"\u03dd\3\2\2\2\u0426\u03ea\3\2\2\2\u0426\u03f6\3\2\2\2\u0426\u0407\3\2"+
		"\2\2\u0426\u040b\3\2\2\2\u0426\u0410\3\2\2\2\u0426\u0414\3\2\2\2\u0426"+
		"\u0419\3\2\2\2\u0426\u041e\3\2\2\2\u0426\u041f\3\2\2\2\u0426\u0422\3\2"+
		"\2\2\u0427\u008f\3\2\2\2\u0428\u0429\7z\2\2\u0429\u0091\3\2\2\2\u042a"+
		"\u042b\7\t\2\2\u042b\u042f\7D\2\2\u042c\u042e\5\22\n\2\u042d\u042c\3\2"+
		"\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0432\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0433\5\u0094K\2\u0433\u0434"+
		"\5\u0090I\2\u0434\u0435\7E\2\2\u0435\u0436\5\u0084C\2\u0436\u043d\3\2"+
		"\2\2\u0437\u0438\7\t\2\2\u0438\u0439\7D\2\2\u0439\u043a\7\67\2\2\u043a"+
		"\u043b\7E\2\2\u043b\u043d\5\u0084C\2\u043c\u042a\3\2\2\2\u043c\u0437\3"+
		"\2\2\2\u043d\u0093\3\2\2\2\u043e\u0443\5b\62\2\u043f\u0440\7a\2\2\u0440"+
		"\u0442\5b\62\2\u0441\u043f\3\2\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2"+
		"\2\2\u0443\u0444\3\2\2\2\u0444\u0095\3\2\2\2\u0445\u0443\3\2\2\2\u0446"+
		"\u0447\7\25\2\2\u0447\u0448\5\u0084C\2\u0448\u0097\3\2\2\2\u0449\u044a"+
		"\7D\2\2\u044a\u044c\5\u009aN\2\u044b\u044d\7J\2\2\u044c\u044b\3\2\2\2"+
		"\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\7E\2\2\u044f\u0099"+
		"\3\2\2\2\u0450\u0455\5\u009cO\2\u0451\u0452\7J\2\2\u0452\u0454\5\u009c"+
		"O\2\u0453\u0451\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u009b\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u045a\5\22"+
		"\n\2\u0459\u0458\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\5T"+
		"+\2\u045f\u0460\5N(\2\u0460\u0461\7M\2\2\u0461\u0462\5\u00b2Z\2\u0462"+
		"\u009d\3\2\2\2\u0463\u0465\5\u00a0Q\2\u0464\u0463\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468"+
		"\u046a\5\u0088E\2\u0469\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u0469"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u009f\3\2\2\2\u046d\u0470\7\b\2\2\u046e"+
		"\u0471\5\u00b2Z\2\u046f\u0471\5\u0090I\2\u0470\u046e\3\2\2\2\u0470\u046f"+
		"\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\7S\2\2\u0473\u0477\3\2\2\2\u0474"+
		"\u0475\7\16\2\2\u0475\u0477\7S\2\2\u0476\u046d\3\2\2\2\u0476\u0474\3\2"+
		"\2\2\u0477\u00a1\3\2\2\2\u0478\u0485\5\u00a6T\2\u0479\u047b\5\u00a4S\2"+
		"\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e"+
		"\7J\2\2\u047d\u047f\5\u00b2Z\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2"+
		"\u047f\u0480\3\2\2\2\u0480\u0482\7J\2\2\u0481\u0483\5\u00aaV\2\u0482\u0481"+
		"\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0478\3\2\2\2\u0484"+
		"\u047a\3\2\2\2\u0485\u00a3\3\2\2\2\u0486\u0489\5\u008aF\2\u0487\u0489"+
		"\5\u00aaV\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0489\u00a5\3\2\2"+
		"\2\u048a\u048c\5\22\n\2\u048b\u048a\3\2\2\2\u048c\u048f\3\2\2\2\u048d"+
		"\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u048d\3\2"+
		"\2\2\u0490\u0491\5\u00d6l\2\u0491\u0492\5N(\2\u0492\u0493\7S\2\2\u0493"+
		"\u0494\5\u00b2Z\2\u0494\u00a7\3\2\2\2\u0495\u0496\7D\2\2\u0496\u0497\7"+
		"\65\2\2\u0497\u049e\7E\2\2\u0498\u0499\7D\2\2\u0499\u049a\5\u00b2Z\2\u049a"+
		"\u049b\7E\2\2\u049b\u049e\3\2\2\2\u049c\u049e\7\65\2\2\u049d\u0495\3\2"+
		"\2\2\u049d\u0498\3\2\2\2\u049d\u049c\3\2\2\2\u049e\u00a9\3\2\2\2\u049f"+
		"\u04b1\7\67\2\2\u04a0\u04a5\5\u00b2Z\2\u04a1\u04a2\7K\2\2\u04a2\u04a4"+
		"\5\u00b2Z\2\u04a3\u04a1\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2"+
		"\2\u04a5\u04a6\3\2\2\2\u04a6\u04b1\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04ad"+
		"\7\65\2\2\u04a9\u04aa\7K\2\2\u04aa\u04ac\7\65\2\2\u04ab\u04a9\3\2\2\2"+
		"\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b1"+
		"\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u049f\3\2\2\2\u04b0\u04a0\3\2\2\2\u04b0"+
		"\u04a8\3\2\2\2\u04b1\u00ab\3\2\2\2\u04b2\u04b3\5\u0090I\2\u04b3\u04b5"+
		"\7D\2\2\u04b4\u04b6\5\u00aaV\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2"+
		"\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7E\2\2\u04b8\u04cc\3\2\2\2\u04b9\u04ba"+
		"\7\65\2\2\u04ba\u04bc\7D\2\2\u04bb\u04bd\5\u00aaV\2\u04bc\u04bb\3\2\2"+
		"\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04cc\7E\2\2\u04bf\u04c0"+
		"\7-\2\2\u04c0\u04c2\7D\2\2\u04c1\u04c3\5\u00aaV\2\u04c2\u04c1\3\2\2\2"+
		"\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04cc\7E\2\2\u04c5\u04c6"+
		"\7*\2\2\u04c6\u04c8\7D\2\2\u04c7\u04c9\5\u00aaV\2\u04c8\u04c7\3\2\2\2"+
		"\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\7E\2\2\u04cb\u04b2"+
		"\3\2\2\2\u04cb\u04b9\3\2\2\2\u04cb\u04bf\3\2\2\2\u04cb\u04c5\3\2\2\2\u04cc"+
		"\u00ad\3\2\2\2\u04cd\u04e6\7^\2\2\u04ce\u04e6\7_\2\2\u04cf\u04e6\7c\2"+
		"\2\u04d0\u04e6\7\\\2\2\u04d1\u04e6\7]\2\2\u04d2\u04d3\7O\2\2\u04d3\u04e6"+
		"\7O\2\2\u04d4\u04d5\7N\2\2\u04d5\u04d6\7N\2\2\u04d6\u04e6\7N\2\2\u04d7"+
		"\u04d8\7N\2\2\u04d8\u04e6\7N\2\2\u04d9\u04e6\7U\2\2\u04da\u04e6\7V\2\2"+
		"\u04db\u04e6\7N\2\2\u04dc\u04e6\7O\2\2\u04dd\u04e6\7T\2\2\u04de\u04e6"+
		"\7W\2\2\u04df\u04e6\7`\2\2\u04e0\u04e6\7b\2\2\u04e1\u04e6\7a\2\2\u04e2"+
		"\u04e6\7X\2\2\u04e3\u04e6\7Y\2\2\u04e4\u04e6\7e\2\2\u04e5\u04cd\3\2\2"+
		"\2\u04e5\u04ce\3\2\2\2\u04e5\u04cf\3\2\2\2\u04e5\u04d0\3\2\2\2\u04e5\u04d1"+
		"\3\2\2\2\u04e5\u04d2\3\2\2\2\u04e5\u04d4\3\2\2\2\u04e5\u04d7\3\2\2\2\u04e5"+
		"\u04d9\3\2\2\2\u04e5\u04da\3\2\2\2\u04e5\u04db\3\2\2\2\u04e5\u04dc\3\2"+
		"\2\2\u04e5\u04dd\3\2\2\2\u04e5\u04de\3\2\2\2\u04e5\u04df\3\2\2\2\u04e5"+
		"\u04e0\3\2\2\2\u04e5\u04e1\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e5\u04e3\3\2"+
		"\2\2\u04e5\u04e4\3\2\2\2\u04e6\u00af\3\2\2\2\u04e7\u04e8\t\5\2\2\u04e8"+
		"\u00b1\3\2\2\2\u04e9\u04ea\bZ\1\2\u04ea\u051a\5\u00acW\2\u04eb\u051a\7"+
		"\65\2\2\u04ec\u04ed\7D\2\2\u04ed\u04ee\5\u00b2Z\2\u04ee\u04ef\7E\2\2\u04ef"+
		"\u051a\3\2\2\2\u04f0\u051a\7-\2\2\u04f1\u051a\7*\2\2\u04f2\u051a\5d\63"+
		"\2\u04f3\u051a\5\u0090I\2\u04f4\u04f5\5\62\32\2\u04f5\u04f6\7L\2\2\u04f6"+
		"\u04f7\7\13\2\2\u04f7\u051a\3\2\2\2\u04f8\u04fc\5\u00d2j\2\u04f9\u04fd"+
		"\5\u00dep\2\u04fa\u04fb\7-\2\2\u04fb\u04fd\5\u00e0q\2\u04fc\u04f9\3\2"+
		"\2\2\u04fc\u04fa\3\2\2\2\u04fd\u051a\3\2\2\2\u04fe\u04ff\7!\2\2\u04ff"+
		"\u051a\5\u00c2b\2\u0500\u0501\7D\2\2\u0501\u0502\5\u00d6l\2\u0502\u0503"+
		"\7E\2\2\u0503\u0504\5\u00b2Z\r\u0504\u051a\3\2\2\2\u0505\u0506\5\u00b6"+
		"\\\2\u0506\u0507\5\u00b2Z\13\u0507\u051a\3\2\2\2\u0508\u051a\5\u00b8]"+
		"\2\u0509\u050a\5\u00d6l\2\u050a\u0510\7t\2\2\u050b\u050d\5\u00dan\2\u050c"+
		"\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0511\5\u0090"+
		"I\2\u050f\u0511\7!\2\2\u0510\u050c\3\2\2\2\u0510\u050f\3\2\2\2\u0511\u051a"+
		"\3\2\2\2\u0512\u0513\5\u00c0a\2\u0513\u0515\7t\2\2\u0514\u0516\5\u00da"+
		"n\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u0518\7!\2\2\u0518\u051a\3\2\2\2\u0519\u04e9\3\2\2\2\u0519\u04eb\3\2"+
		"\2\2\u0519\u04ec\3\2\2\2\u0519\u04f0\3\2\2\2\u0519\u04f1\3\2\2\2\u0519"+
		"\u04f2\3\2\2\2\u0519\u04f3\3\2\2\2\u0519\u04f4\3\2\2\2\u0519\u04f8\3\2"+
		"\2\2\u0519\u04fe\3\2\2\2\u0519\u0500\3\2\2\2\u0519\u0505\3\2\2\2\u0519"+
		"\u0508\3\2\2\2\u0519\u0509\3\2\2\2\u0519\u0512\3\2\2\2\u051a\u054a\3\2"+
		"\2\2\u051b\u051c\f\n\2\2\u051c\u051d\5\u00aeX\2\u051d\u051e\5\u00b2Z\13"+
		"\u051e\u0549\3\2\2\2\u051f\u0520\f\b\2\2\u0520\u0521\7R\2\2\u0521\u0522"+
		"\5\u00b2Z\2\u0522\u0523\7S\2\2\u0523\u0524\5\u00b2Z\b\u0524\u0549\3\2"+
		"\2\2\u0525\u0526\f\7\2\2\u0526\u0527\5\u00b0Y\2\u0527\u0528\5\u00b2Z\7"+
		"\u0528\u0549\3\2\2\2\u0529\u052a\f\31\2\2\u052a\u0536\7L\2\2\u052b\u0537"+
		"\5\u0090I\2\u052c\u0537\5\u00acW\2\u052d\u0537\7-\2\2\u052e\u0530\7!\2"+
		"\2\u052f\u0531\5\u00d2j\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531"+
		"\u0532\3\2\2\2\u0532\u0537\5\u00c6d\2\u0533\u0534\7*\2\2\u0534\u0537\5"+
		"\u00dco\2\u0535\u0537\5\u00ccg\2\u0536\u052b\3\2\2\2\u0536\u052c\3\2\2"+
		"\2\u0536\u052d\3\2\2\2\u0536\u052e\3\2\2\2\u0536\u0533\3\2\2\2\u0536\u0535"+
		"\3\2\2\2\u0537\u0549\3\2\2\2\u0538\u0539\f\30\2\2\u0539\u053a\7H\2\2\u053a"+
		"\u053b\5\u00b2Z\2\u053b\u053c\7I\2\2\u053c\u0549\3\2\2\2\u053d\u053e\f"+
		"\f\2\2\u053e\u0549\5\u00b4[\2\u053f\u0540\f\t\2\2\u0540\u0541\7\34\2\2"+
		"\u0541\u0549\5\u00d6l\2\u0542\u0543\f\5\2\2\u0543\u0545\7t\2\2\u0544\u0546"+
		"\5\u00dan\2\u0545\u0544\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2"+
		"\2\u0547\u0549\5\u0090I\2\u0548\u051b\3\2\2\2\u0548\u051f\3\2\2\2\u0548"+
		"\u0525\3\2\2\2\u0548\u0529\3\2\2\2\u0548\u0538\3\2\2\2\u0548\u053d\3\2"+
		"\2\2\u0548\u053f\3\2\2\2\u0548\u0542\3\2\2\2\u0549\u054c\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u00b3\3\2\2\2\u054c\u054a\3\2"+
		"\2\2\u054d\u054e\t\6\2\2\u054e\u00b5\3\2\2\2\u054f\u0550\t\7\2\2\u0550"+
		"\u00b7\3\2\2\2\u0551\u0552\5\u00ba^\2\u0552\u0553\7s\2\2\u0553\u0554\5"+
		"\u00bc_\2\u0554\u00b9\3\2\2\2\u0555\u0567\5\u0090I\2\u0556\u0558\7D\2"+
		"\2\u0557\u0559\5\\/\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a"+
		"\3\2\2\2\u055a\u0567\7E\2\2\u055b\u055c\7D\2\2\u055c\u0561\5\u0090I\2"+
		"\u055d\u055e\7K\2\2\u055e\u0560\5\u0090I\2\u055f\u055d\3\2\2\2\u0560\u0563"+
		"\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0564\u0565\7E\2\2\u0565\u0567\3\2\2\2\u0566\u0555\3\2"+
		"\2\2\u0566\u0556\3\2\2\2\u0566\u055b\3\2\2\2\u0567\u00bb\3\2\2\2\u0568"+
		"\u056b\5\u00b2Z\2\u0569\u056b\5\u0084C\2\u056a\u0568\3\2\2\2\u056a\u0569"+
		"\3\2\2\2\u056b\u00bd\3\2\2\2\u056c\u056d\7D\2\2\u056d\u056e\5\u00b2Z\2"+
		"\u056e\u056f\7E\2\2\u056f\u057f\3\2\2\2\u0570\u057f\7-\2\2\u0571\u057f"+
		"\7*\2\2\u0572\u057f\5d\63\2\u0573\u057f\5\u0090I\2\u0574\u0575\5\62\32"+
		"\2\u0575\u0576\7L\2\2\u0576\u0577\7\13\2\2\u0577\u057f\3\2\2\2\u0578\u057c"+
		"\5\u00d2j\2\u0579\u057d\5\u00dep\2\u057a\u057b\7-\2\2\u057b\u057d\5\u00e0"+
		"q\2\u057c\u0579\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057f\3\2\2\2\u057e"+
		"\u056c\3\2\2\2\u057e\u0570\3\2\2\2\u057e\u0571\3\2\2\2\u057e\u0572\3\2"+
		"\2\2\u057e\u0573\3\2\2\2\u057e\u0574\3\2\2\2\u057e\u0578\3\2\2\2\u057f"+
		"\u00bf\3\2\2\2\u0580\u0581\5T+\2\u0581\u0582\7L\2\2\u0582\u0584\3\2\2"+
		"\2\u0583\u0580\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0588\3\2\2\2\u0585\u0587"+
		"\5j\66\2\u0586\u0585\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588"+
		"\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u058d\5\u0090"+
		"I\2\u058c\u058e\5\u00dan\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
		"\u00c1\3\2\2\2\u058f\u0590\5\u00d2j\2\u0590\u0591\5\u00c4c\2\u0591\u0592"+
		"\5\u00caf\2\u0592\u0599\3\2\2\2\u0593\u0596\5\u00c4c\2\u0594\u0597\5\u00c8"+
		"e\2\u0595\u0597\5\u00caf\2\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597"+
		"\u0599\3\2\2\2\u0598\u058f\3\2\2\2\u0598\u0593\3\2\2\2\u0599\u00c3\3\2"+
		"\2\2\u059a\u059c\5\u0090I\2\u059b\u059d\5\u00ceh\2\u059c\u059b\3\2\2\2"+
		"\u059c\u059d\3\2\2\2\u059d\u05a5\3\2\2\2\u059e\u059f\7L\2\2\u059f\u05a1"+
		"\5\u0090I\2\u05a0\u05a2\5\u00ceh\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2"+
		"\2\2\u05a2\u05a4\3\2\2\2\u05a3\u059e\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"+
		"\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05aa\3\2\2\2\u05a7\u05a5\3\2"+
		"\2\2\u05a8\u05aa\5\u00d8m\2\u05a9\u059a\3\2\2\2\u05a9\u05a8\3\2\2\2\u05aa"+
		"\u00c5\3\2\2\2\u05ab\u05ad\5\u0090I\2\u05ac\u05ae\5\u00d0i\2\u05ad\u05ac"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\5\u00caf"+
		"\2\u05b0\u00c7\3\2\2\2\u05b1\u05cd\7H\2\2\u05b2\u05b7\7I\2\2\u05b3\u05b4"+
		"\7H\2\2\u05b4\u05b6\7I\2\2\u05b5\u05b3\3\2\2\2\u05b6\u05b9\3\2\2\2\u05b7"+
		"\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05b7\3\2"+
		"\2\2\u05ba\u05ce\5R*\2\u05bb\u05bc\5\u00b2Z\2\u05bc\u05c3\7I\2\2\u05bd"+
		"\u05be\7H\2\2\u05be\u05bf\5\u00b2Z\2\u05bf\u05c0\7I\2\2\u05c0\u05c2\3"+
		"\2\2\2\u05c1\u05bd\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3"+
		"\u05c4\3\2\2\2\u05c4\u05ca\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05c7\7H"+
		"\2\2\u05c7\u05c9\7I\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca"+
		"\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2"+
		"\2\2\u05cd\u05b2\3\2\2\2\u05cd\u05bb\3\2\2\2\u05ce\u00c9\3\2\2\2\u05cf"+
		"\u05d1\5\u00e0q\2\u05d0\u05d2\5&\24\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u00cb\3\2\2\2\u05d3\u05d4\5\u00d2j\2\u05d4\u05d5\5\u00de"+
		"p\2\u05d5\u00cd\3\2\2\2\u05d6\u05d7\7O\2\2\u05d7\u05da\7N\2\2\u05d8\u05da"+
		"\5\u00dan\2\u05d9\u05d6\3\2\2\2\u05d9\u05d8\3\2\2\2\u05da\u00cf\3\2\2"+
		"\2\u05db\u05dc\7O\2\2\u05dc\u05df\7N\2\2\u05dd\u05df\5\u00d2j\2\u05de"+
		"\u05db\3\2\2\2\u05de\u05dd\3\2\2\2\u05df\u00d1\3\2\2\2\u05e0\u05e1\7O"+
		"\2\2\u05e1\u05e2\5\u00d4k\2\u05e2\u05e3\7N\2\2\u05e3\u00d3\3\2\2\2\u05e4"+
		"\u05e9\5\u00d6l\2\u05e5\u05e6\7K\2\2\u05e6\u05e8\5\u00d6l\2\u05e7\u05e5"+
		"\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea"+
		"\u00d5\3\2\2\2\u05eb\u05e9\3\2\2\2\u05ec\u05ee\5j\66\2\u05ed\u05ec\3\2"+
		"\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05f2\5T+\2\u05f0\u05f2"+
		"\5\u00d8m\2\u05f1\u05ef\3\2\2\2\u05f1\u05f0\3\2\2\2\u05f2\u05f7\3\2\2"+
		"\2\u05f3\u05f4\7H\2\2\u05f4\u05f6\7I\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f9"+
		"\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u00d7\3\2\2\2\u05f9"+
		"\u05f7\3\2\2\2\u05fa\u05fb\t\b\2\2\u05fb\u00d9\3\2\2\2\u05fc\u05fd\7O"+
		"\2\2\u05fd\u0602\5V,\2\u05fe\u05ff\7K\2\2\u05ff\u0601\5V,\2\u0600\u05fe"+
		"\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0605\3\2\2\2\u0604\u0602\3\2\2\2\u0605\u0606\7N\2\2\u0606\u00db\3\2"+
		"\2\2\u0607\u060e\5\u00e0q\2\u0608\u0609\7L\2\2\u0609\u060b\5\u0090I\2"+
		"\u060a\u060c\5\u00e0q\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c"+
		"\u060e\3\2\2\2\u060d\u0607\3\2\2\2\u060d\u0608\3\2\2\2\u060e\u00dd\3\2"+
		"\2\2\u060f\u0610\7*\2\2\u0610\u0615\5\u00dco\2\u0611\u0612\5\u0090I\2"+
		"\u0612\u0613\5\u00e0q\2\u0613\u0615\3\2\2\2\u0614\u060f\3\2\2\2\u0614"+
		"\u0611\3\2\2\2\u0615\u00df\3\2\2\2\u0616\u0618\7D\2\2\u0617\u0619\5\u00aa"+
		"V\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"\u061b\7E\2\2\u061b\u00e1\3\2\2\2\u00cd\u00e4\u00e8\u00ec\u0104\u0107"+
		"\u010c\u0112\u011a\u0123\u0128\u012f\u0136\u0139\u0140\u014a\u014e\u0153"+
		"\u0157\u015b\u0165\u016d\u0173\u017a\u0181\u0185\u0188\u018b\u0194\u019a"+
		"\u019f\u01a2\u01a8\u01ae\u01b2\u01ba\u01c3\u01ca\u01d0\u01d4\u01df\u01e8"+
		"\u01ed\u01f3\u01f7\u0203\u020e\u0213\u021c\u0224\u022e\u0237\u023f\u0244"+
		"\u024c\u0251\u0257\u025f\u0264\u0268\u0270\u027a\u0280\u0287\u028c\u0294"+
		"\u0298\u029a\u02a0\u02a5\u02a9\u02b0\u02b2\u02b9\u02be\u02c7\u02cc\u02d0"+
		"\u02d5\u02de\u02ea\u02f4\u02ff\u0302\u0309\u0313\u031b\u031e\u0321\u032e"+
		"\u0336\u033b\u0343\u0347\u034b\u034f\u0351\u0355\u035b\u0363\u0367\u036b"+
		"\u036e\u0371\u0375\u0379\u037c\u037e\u0384\u0387\u038c\u0390\u0394\u0398"+
		"\u039a\u039f\u03a8\u03ad\u03b0\u03b8\u03be\u03c5\u03c9\u03d0\u03d5\u03e2"+
		"\u03e5\u03e8\u03f0\u03f4\u03fc\u0402\u040d\u0416\u041b\u0426\u042f\u043c"+
		"\u0443\u044c\u0455\u045b\u0466\u046b\u0470\u0476\u047a\u047e\u0482\u0484"+
		"\u0488\u048d\u049d\u04a5\u04ad\u04b0\u04b5\u04bc\u04c2\u04c8\u04cb\u04e5"+
		"\u04fc\u050c\u0510\u0515\u0519\u0530\u0536\u0545\u0548\u054a\u0558\u0561"+
		"\u0566\u056a\u057c\u057e\u0583\u0588\u058d\u0596\u0598\u059c\u05a1\u05a5"+
		"\u05a9\u05ad\u05b7\u05c3\u05ca\u05cd\u05d1\u05d9\u05de\u05e9\u05ed\u05f1"+
		"\u05f7\u0602\u060b\u060d\u0614\u0618";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}