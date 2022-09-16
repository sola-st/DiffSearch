// Generated from JavaParser.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
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

			setState(236);
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

	public static class QuerySnippetContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public EnumConstantContext enumConstant() {
			return getRuleContext(EnumConstantContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
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
		int _la;
		try {
			int _alt;
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				packageDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(239);
					importDeclaration();
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IMPORT );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				enumConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				typeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						modifier();
						}
						} 
					}
					setState(251);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(252);
				memberDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				variableDeclarator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				annotation();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				elementValuePair();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				annotationTypeDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(258);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(259);
				expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(260);
				parExpression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(261);
				expressionList();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(262);
				multipleStatements();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(263);
				blockStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(264);
					match(DOT);
					}
				}

				setState(267);
				methodCall();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(268);
				formalParameterList();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(269);
				match(RBRACE);
				{
				setState(270);
				match(ELSE);
				setState(271);
				statement();
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(272);
				match(RBRACE);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(273);
						catchClause();
						}
						}
						setState(276); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(278);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(281);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(284);
				match(RBRACE);
				setState(285);
				match(WHILE);
				setState(286);
				parExpression();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(287);
					match(SEMI);
					}
				}

				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(290);
				match(WILDCARD);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(291);
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
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(294);
				packageDeclaration();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(297);
				importDeclaration();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << WILDCARD))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(303);
				typeDeclaration();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(311);
				annotation();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(PACKAGE);
			setState(318);
			qualifiedName();
			setState(319);
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
			setState(321);
			match(IMPORT);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(322);
				match(STATIC);
				}
			}

			setState(325);
			qualifiedName();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(326);
				match(DOT);
				setState(327);
				match(MUL);
				}
			}

			setState(330);
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
			setState(345);
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
			case WILDCARD:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(342);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(338);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(339);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(340);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(341);
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
				setState(344);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case WILDCARD:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
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
		public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
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
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(361);
				match(STRICTFP);
				}
				break;
			case WILDCARD:
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				match(WILDCARD);
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
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
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
			setState(369);
			match(CLASS);
			setState(370);
			identifier();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(371);
				typeParameters();
				}
			}

			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(374);
				match(EXTENDS);
				setState(375);
				typeType();
				}
			}

			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(378);
				match(IMPLEMENTS);
				setState(379);
				typeList();
				}
			}

			setState(382);
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
			setState(384);
			match(LT);
			setState(385);
			typeParameter();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386);
				match(COMMA);
				setState(387);
				typeParameter();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
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
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(395);
				annotation();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			identifier();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(402);
				match(EXTENDS);
				setState(403);
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
			setState(406);
			typeType();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(407);
				match(BITAND);
				setState(408);
				typeType();
				}
				}
				setState(413);
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
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(414);
			match(ENUM);
			setState(415);
			identifier();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(416);
				match(IMPLEMENTS);
				setState(417);
				typeList();
				}
			}

			setState(420);
			match(LBRACE);
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(421);
				enumConstants();
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(424);
				match(COMMA);
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(427);
				enumBodyDeclarations();
				}
				break;
			}
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(430);
				match(RBRACE);
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
			setState(433);
			enumConstant();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					match(COMMA);
					setState(435);
					enumConstant();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(441);
				annotation();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			identifier();
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(448);
				arguments();
				}
				break;
			}
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(451);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(SEMI);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					classBodyDeclaration();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(461);
			match(INTERFACE);
			setState(462);
			identifier();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(463);
				typeParameters();
				}
			}

			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(466);
				match(EXTENDS);
				setState(467);
				typeList();
				}
			}

			setState(470);
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
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(LBRACE);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					classBodyDeclaration();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(479);
				match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(LBRACE);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					interfaceBodyDeclaration();
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(489);
				match(RBRACE);
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
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(493);
					match(STATIC);
					}
				}

				setState(496);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(497);
						modifier();
						}
						} 
					}
					setState(502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(503);
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
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(511);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(512);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(513);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(514);
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
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			typeTypeOrVoid();
			setState(518);
			identifier();
			setState(519);
			formalParameters();
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					match(LBRACK);
					setState(521);
					match(RBRACK);
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(527);
				match(THROWS);
				setState(528);
				qualifiedNameList();
				}
				break;
			}
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(531);
				methodBody();
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
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
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
			setState(540);
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
				setState(538);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
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
			setState(542);
			typeParameters();
			setState(543);
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
			setState(545);
			typeParameters();
			setState(546);
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
			setState(548);
			identifier();
			setState(549);
			formalParameters();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(550);
				match(THROWS);
				setState(551);
				qualifiedNameList();
				}
			}

			setState(554);
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
			setState(556);
			typeType();
			setState(557);
			variableDeclarators();
			setState(558);
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
			setState(568);
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
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(560);
						modifier();
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(566);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
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
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(576);
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
			setState(579);
			typeType();
			setState(580);
			constantDeclarator();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(581);
				match(COMMA);
				setState(582);
				constantDeclarator();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
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
			setState(590);
			identifier();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(591);
				match(LBRACK);
				setState(592);
				match(RBRACK);
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(ASSIGN);
			setState(599);
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
			setState(653);
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
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(601);
						interfaceMethodModifier();
						}
						} 
					}
					setState(606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(617);
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
					setState(607);
					typeTypeOrVoid();
					}
					break;
				case LT:
					{
					setState(608);
					typeParameters();
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(609);
							annotation();
							}
							} 
						}
						setState(614);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
					}
					setState(615);
					typeTypeOrVoid();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(619);
				identifier();
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
				break;
			case WILDCARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(WILDCARD);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(635);
					match(NEWLINE);
					}
				}

				setState(638);
				identifier();
				setState(639);
				formalParameters();
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(640);
					match(LBRACK);
					setState(641);
					match(RBRACK);
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(647);
					match(THROWS);
					setState(648);
					qualifiedNameList();
					}
				}

				setState(651);
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
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(660);
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
			setState(663);
			typeParameters();
			setState(664);
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
			setState(666);
			variableDeclarator();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(667);
				match(COMMA);
				setState(668);
				variableDeclarator();
				}
				}
				setState(673);
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
			setState(674);
			variableDeclaratorId();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(675);
				match(ASSIGN);
				setState(676);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			identifier();
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					match(LBRACK);
					setState(681);
					match(RBRACK);
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
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
			case WILDCARD:
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
				setState(688);
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
			setState(691);
			match(LBRACE);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(692);
				variableInitializer();
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(693);
						match(COMMA);
						setState(694);
						variableInitializer();
						}
						} 
					}
					setState(699);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(700);
					match(COMMA);
					}
				}

				}
			}

			setState(705);
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
			setState(707);
			identifier();
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(708);
				typeArguments();
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(711);
					match(DOT);
					setState(712);
					identifier();
					setState(714);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(713);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
			setState(727);
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
				setState(721);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				match(QUESTION);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(723);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			qualifiedName();
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					match(COMMA);
					setState(731);
					qualifiedName();
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(LPAREN);
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(738);
				formalParameterList();
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(741);
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
		try {
			int _alt;
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				formalParameter();
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(745);
						match(COMMA);
						setState(747);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
						case 1:
							{
							setState(746);
							formalParameter();
							}
							break;
						}
						}
						} 
					}
					setState(753);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(754);
					match(COMMA);
					setState(755);
					lastFormalParameter();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
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
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(762);
					variableModifier();
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(768);
			typeType();
			setState(769);
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
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771);
					variableModifier();
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(777);
			typeType();
			setState(778);
			match(ELLIPSIS);
			setState(779);
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
			setState(781);
			identifier();
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(782);
					match(DOT);
					setState(783);
					identifier();
					}
					} 
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(792);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(793);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(794);
				match(NULL_LITERAL);
				}
				break;
			case LITERALS:
				enterOuterAlt(_localctx, 7);
				{
				setState(795);
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
			setState(798);
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
			setState(800);
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
			setState(802);
			match(AT);
			setState(803);
			qualifiedName();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(804);
				match(LPAREN);
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(805);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(806);
					elementValue();
					}
					break;
				}
				setState(809);
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
			setState(812);
			elementValuePair();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(813);
				match(COMMA);
				setState(814);
				elementValuePair();
				}
				}
				setState(819);
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
			setState(820);
			identifier();
			setState(821);
			match(ASSIGN);
			setState(822);
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
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
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
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(829);
			match(LBRACE);
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(830);
				elementValue();
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(831);
						match(COMMA);
						setState(832);
						elementValue();
						}
						} 
					}
					setState(837);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
			}

			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(840);
				match(COMMA);
				}
				break;
			}
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(843);
				match(RBRACE);
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
			setState(846);
			match(AT);
			setState(847);
			match(INTERFACE);
			setState(848);
			identifier();
			setState(849);
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
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(LBRACE);
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(852);
					annotationTypeElementDeclaration();
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(858);
				match(RBRACE);
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
			setState(869);
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
			case WILDCARD:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(861);
						modifier();
						}
						} 
					}
					setState(866);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(867);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
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
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				typeType();
				setState(872);
				annotationMethodOrConstantRest();
				setState(873);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				classDeclaration();
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(876);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				interfaceDeclaration();
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(880);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				enumDeclaration();
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(884);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(887);
				annotationTypeDeclaration();
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(888);
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
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
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
			setState(897);
			identifier();
			setState(898);
			match(LPAREN);
			setState(899);
			match(RPAREN);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(900);
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
			setState(903);
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
			setState(905);
			match(DEFAULT);
			setState(906);
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
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(908);
					match(NEWLINE);
					}
				}

				setState(911);
				match(LBRACE);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(912);
					match(NEWLINE);
					}
					break;
				}
				setState(915);
				multipleStatements();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(916);
					match(NEWLINE);
					}
				}

				setState(919);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(921);
					match(NEWLINE);
					}
				}

				setState(924);
				match(LBRACE);
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(925);
					match(NEWLINE);
					}
				}

				setState(928);
				match(WILDCARD);
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(929);
					match(NEWLINE);
					}
					break;
				}
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(932);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(935);
					match(NEWLINE);
					}
				}

				setState(938);
				match(LBRACE);
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
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(942);
						blockStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(945); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				localVariableDeclaration();
				setState(950);
				match(SEMI);
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(951);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				statement();
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(955);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				localTypeDeclaration();
				setState(960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(959);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				match(WILDCARD);
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(963);
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
			setState(971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(968);
					variableModifier();
					}
					} 
				}
				setState(973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(974);
			typeType();
			setState(975);
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
			setState(988);
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
			case WILDCARD:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << WILDCARD))) != 0) || _la==AT) {
					{
					{
					setState(977);
					classOrInterfaceModifier();
					}
					}
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(985);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(983);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(984);
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
				setState(987);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
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
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(FOR);
				setState(992);
				match(LPAREN);
				setState(993);
				match(WILDCARD);
				setState(994);
				match(RPAREN);
				setState(996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(995);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
				match(ASSERT);
				setState(999);
				expression(0);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1000);
					match(COLON);
					setState(1001);
					expression(0);
					}
				}

				setState(1004);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1006);
				match(IF);
				setState(1007);
				parExpression();
				setState(1010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1008);
					statement();
					}
					break;
				case 2:
					{
					setState(1009);
					block();
					}
					break;
				}
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1012);
					match(ELSE);
					setState(1015);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						setState(1013);
						statement();
						}
						break;
					case 2:
						{
						setState(1014);
						block();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1019);
				match(FOR);
				setState(1020);
				match(LPAREN);
				setState(1021);
				forControl();
				setState(1022);
				match(RPAREN);
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1023);
					statement();
					}
					break;
				case 2:
					{
					setState(1024);
					block();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1027);
				match(WHILE);
				setState(1028);
				parExpression();
				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1029);
					statement();
					}
					break;
				case 2:
					{
					setState(1030);
					block();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				match(DO);
				setState(1034);
				statement();
				setState(1035);
				match(WHILE);
				setState(1036);
				parExpression();
				setState(1037);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1039);
				match(TRY);
				setState(1040);
				block();
				setState(1050);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1041);
						catchClause();
						}
						}
						setState(1044); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1046);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1049);
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
				setState(1052);
				match(TRY);
				setState(1053);
				resourceSpecification();
				setState(1054);
				block();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1055);
					catchClause();
					}
					}
					setState(1060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1061);
					finallyBlock();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1064);
				match(SWITCH);
				setState(1065);
				parExpression();
				setState(1066);
				match(LBRACE);
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1067);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1072);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1073);
						switchLabel();
						}
						} 
					}
					setState(1078);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				setState(1080);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1079);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1082);
				match(SYNCHRONIZED);
				setState(1083);
				parExpression();
				setState(1084);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1086);
				match(RETURN);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1087);
					expression(0);
					}
				}

				setState(1090);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1091);
				match(THROW);
				setState(1092);
				expression(0);
				setState(1093);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1095);
				match(BREAK);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1096);
					identifier();
					}
				}

				setState(1099);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1100);
				match(CONTINUE);
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1101);
					identifier();
					}
				}

				setState(1104);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1105);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1106);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1107);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1109);
				((StatementContext)_localctx).identifierLabel = identifier();
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
			setState(1115);
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
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				match(CATCH);
				setState(1118);
				match(LPAREN);
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1119);
					variableModifier();
					}
					}
					setState(1124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1125);
				catchType();
				setState(1126);
				identifier();
				setState(1127);
				match(RPAREN);
				setState(1128);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(CATCH);
				setState(1131);
				match(LPAREN);
				setState(1132);
				match(WILDCARD);
				setState(1133);
				match(RPAREN);
				setState(1134);
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
			setState(1137);
			qualifiedName();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1138);
				match(BITOR);
				setState(1139);
				qualifiedName();
				}
				}
				setState(1144);
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
			setState(1145);
			match(FINALLY);
			setState(1146);
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
			setState(1148);
			match(LPAREN);
			setState(1149);
			resources();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1150);
				match(SEMI);
				}
			}

			setState(1153);
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
			setState(1155);
			resource();
			setState(1160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1156);
					match(SEMI);
					setState(1157);
					resource();
					}
					} 
				}
				setState(1162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1163);
				variableModifier();
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169);
			classOrInterfaceType();
			setState(1170);
			variableDeclaratorId();
			setState(1171);
			match(ASSIGN);
			setState(1172);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1174);
				switchLabel();
				}
				}
				setState(1177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1179);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				match(CASE);
				setState(1187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1185);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1186);
					((SwitchLabelContext)_localctx).enumConstantName = identifier();
					}
					break;
				}
				setState(1189);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				match(DEFAULT);
				setState(1192);
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
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1196);
					forInit();
					}
				}

				setState(1199);
				match(SEMI);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1200);
					expression(0);
					}
				}

				setState(1203);
				match(SEMI);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1204);
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
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
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
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					variableModifier();
					}
					} 
				}
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1219);
			typeType();
			setState(1220);
			variableDeclaratorId();
			setState(1221);
			match(COLON);
			setState(1222);
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
		int _la;
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				match(LPAREN);
				setState(1225);
				match(EXPR);
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(1226);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				match(LPAREN);
				setState(1230);
				expression(0);
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAREN) {
					{
					setState(1231);
					match(RPAREN);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1234);
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
		public List<TerminalNode> EXPR() { return getTokens(JavaParser.EXPR); }
		public TerminalNode EXPR(int i) {
			return getToken(JavaParser.EXPR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
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
		enterRule(_localctx, 168, RULE_expressionList);
		try {
			int _alt;
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				match(WILDCARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				match(EXPR);
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1239);
						match(COMMA);
						setState(1240);
						match(EXPR);
						}
						} 
					}
					setState(1245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1246);
				expression(0);
				setState(1251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1247);
						match(COMMA);
						setState(1248);
						expression(0);
						}
						} 
					}
					setState(1253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
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
		try {
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				identifier();
				setState(1257);
				match(LPAREN);
				setState(1259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1258);
					expressionList();
					}
					break;
				}
				setState(1262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1261);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				match(EXPR);
				setState(1265);
				match(LPAREN);
				setState(1267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1266);
					expressionList();
					}
					break;
				}
				setState(1270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1269);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1272);
				match(THIS);
				setState(1273);
				match(LPAREN);
				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1274);
					expressionList();
					}
					break;
				}
				setState(1278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1277);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1280);
				match(SUPER);
				setState(1281);
				match(LPAREN);
				setState(1283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1282);
					expressionList();
					}
					break;
				}
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1285);
					match(RPAREN);
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
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(MUL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(DIV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				match(MOD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1293);
				match(ADD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1294);
				match(SUB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1295);
				match(LT);
				setState(1296);
				match(LT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1297);
				match(GT);
				setState(1298);
				match(GT);
				setState(1299);
				match(GT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1300);
				match(GT);
				setState(1301);
				match(GT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1302);
				match(LE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1303);
				match(GE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1304);
				match(GT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1305);
				match(LT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1306);
				match(EQUAL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1307);
				match(NOTEQUAL);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1308);
				match(BITAND);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1309);
				match(CARET);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1310);
				match(BITOR);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1311);
				match(AND);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1312);
				match(OR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1313);
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
			setState(1316);
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
		public TerminalNode WILDCARD() { return getToken(JavaParser.WILDCARD, 0); }
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
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1319);
				methodCall();
				}
				break;
			case 2:
				{
				setState(1320);
				match(EXPR);
				}
				break;
			case 3:
				{
				setState(1321);
				match(LPAREN);
				setState(1322);
				expression(0);
				setState(1323);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(1325);
				match(THIS);
				}
				break;
			case 5:
				{
				setState(1326);
				match(SUPER);
				}
				break;
			case 6:
				{
				setState(1327);
				literal();
				}
				break;
			case 7:
				{
				setState(1328);
				identifier();
				}
				break;
			case 8:
				{
				setState(1329);
				typeTypeOrVoid();
				setState(1330);
				match(DOT);
				setState(1331);
				match(CLASS);
				}
				break;
			case 9:
				{
				setState(1333);
				nonWildcardTypeArguments();
				setState(1337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1334);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1335);
					match(THIS);
					setState(1336);
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
				setState(1339);
				match(NEW);
				setState(1340);
				creator();
				}
				break;
			case 11:
				{
				setState(1341);
				match(LPAREN);
				setState(1342);
				typeType();
				setState(1343);
				match(RPAREN);
				setState(1344);
				expression(12);
				}
				break;
			case 12:
				{
				setState(1346);
				((ExpressionContext)_localctx).prefix = unary_prefix_operators();
				setState(1347);
				expression(10);
				}
				break;
			case 13:
				{
				setState(1349);
				lambdaExpression();
				}
				break;
			case 14:
				{
				setState(1350);
				typeType();
				setState(1351);
				match(COLONCOLON);
				setState(1357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1352);
						typeArguments();
						}
					}

					setState(1355);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1356);
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
				setState(1359);
				classType();
				setState(1360);
				match(COLONCOLON);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1361);
					typeArguments();
					}
				}

				setState(1364);
				match(NEW);
				}
				break;
			case 16:
				{
				setState(1366);
				match(WILDCARD);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1369);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1370);
						binary_operators();
						setState(1371);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1373);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1374);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1375);
						expression(0);
						setState(1376);
						match(COLON);
						setState(1377);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1379);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1380);
						assign_operators();
						setState(1381);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1383);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1384);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1396);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1385);
							identifier();
							}
							break;
						case 2:
							{
							setState(1386);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1387);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1388);
							match(NEW);
							setState(1390);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1389);
								nonWildcardTypeArguments();
								}
							}

							setState(1392);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1393);
							match(SUPER);
							setState(1394);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1395);
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
						setState(1398);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1399);
						match(LBRACK);
						setState(1400);
						expression(0);
						setState(1401);
						match(RBRACK);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1403);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1404);
						((ExpressionContext)_localctx).postfix = unary_postfix_operators();
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1405);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1406);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1407);
						typeType();
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1408);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1409);
						match(COLONCOLON);
						setState(1411);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1410);
							typeArguments();
							}
						}

						setState(1413);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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
			setState(1419);
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
			setState(1421);
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
			setState(1423);
			lambdaParameters();
			setState(1424);
			match(ARROW);
			setState(1425);
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
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				match(LPAREN);
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << WILDCARD))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1429);
					formalParameterList();
					}
				}

				setState(1432);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1433);
				match(LPAREN);
				setState(1434);
				identifier();
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1435);
					match(COMMA);
					setState(1436);
					identifier();
					}
					}
					setState(1441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1442);
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
			setState(1448);
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
			case WILDCARD:
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
				setState(1446);
				expression(0);
				}
				break;
			case NEWLINE:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
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
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				match(LPAREN);
				setState(1451);
				expression(0);
				setState(1452);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1455);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1456);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1457);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1458);
				typeTypeOrVoid();
				setState(1459);
				match(DOT);
				setState(1460);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1462);
				nonWildcardTypeArguments();
				setState(1466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1463);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1464);
					match(THIS);
					setState(1465);
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
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1470);
				classOrInterfaceType();
				setState(1471);
				match(DOT);
				}
				break;
			}
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1475);
				annotation();
				}
				}
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1481);
			identifier();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1482);
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
			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				nonWildcardTypeArguments();
				setState(1486);
				createdName();
				setState(1487);
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
				setState(1489);
				createdName();
				setState(1492);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1490);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1491);
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
			setState(1511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				identifier();
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1497);
					typeArgumentsOrDiamond();
					}
				}

				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1500);
					match(DOT);
					setState(1501);
					identifier();
					setState(1503);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1502);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1509);
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
				setState(1510);
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
			setState(1513);
			identifier();
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1514);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1517);
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
			setState(1519);
			match(LBRACK);
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1520);
				match(RBRACK);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1521);
					match(LBRACK);
					setState(1522);
					match(RBRACK);
					}
					}
					setState(1527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1528);
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
			case WILDCARD:
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
				setState(1529);
				expression(0);
				setState(1530);
				match(RBRACK);
				setState(1537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1531);
						match(LBRACK);
						setState(1532);
						expression(0);
						setState(1533);
						match(RBRACK);
						}
						} 
					}
					setState(1539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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
			setState(1549);
			arguments();
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1550);
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
			setState(1553);
			nonWildcardTypeArguments();
			setState(1554);
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
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				match(LT);
				setState(1557);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1558);
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
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				match(LT);
				setState(1562);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
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
			setState(1566);
			match(LT);
			setState(1567);
			typeList();
			setState(1568);
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
			setState(1570);
			typeType();
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1571);
				match(COMMA);
				setState(1572);
				typeType();
				}
				}
				setState(1577);
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
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1578);
				annotation();
				}
			}

			setState(1583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1581);
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
				setState(1582);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1585);
					match(LBRACK);
					setState(1586);
					match(RBRACK);
					}
					} 
				}
				setState(1591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
			setState(1592);
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
			setState(1594);
			match(LT);
			setState(1595);
			typeArgument();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1596);
				match(COMMA);
				setState(1597);
				typeArgument();
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1603);
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
			setState(1611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				match(DOT);
				setState(1607);
				identifier();
				setState(1609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1608);
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
			setState(1618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613);
				match(SUPER);
				setState(1614);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				identifier();
				setState(1616);
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
			setState(1620);
			match(LPAREN);
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << EXPR) | (1L << WILDCARD) | (1L << LITERALS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (UNOP - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1621);
				expressionList();
				}
			}

			setState(1624);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 24);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001x\u065b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0001\u0000\u0001\u0000\u0003\u0000\u00e3\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u00e7\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u00eb\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u00f1\b\u0001\u000b\u0001\f\u0001\u00f2\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u00f8\b\u0001\n\u0001\f\u0001\u00fb\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u010a\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0113\b\u0001"+
		"\u000b\u0001\f\u0001\u0114\u0001\u0001\u0003\u0001\u0118\b\u0001\u0001"+
		"\u0001\u0003\u0001\u011b\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0121\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0125"+
		"\b\u0001\u0001\u0002\u0003\u0002\u0128\b\u0002\u0001\u0002\u0005\u0002"+
		"\u012b\b\u0002\n\u0002\f\u0002\u012e\t\u0002\u0001\u0002\u0005\u0002\u0131"+
		"\b\u0002\n\u0002\f\u0002\u0134\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003\u0139\b\u0003\n\u0003\f\u0003\u013c\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0144"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0149\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u014e\b\u0005\n\u0005"+
		"\f\u0005\u0151\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0157\b\u0005\u0001\u0005\u0003\u0005\u015a\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0161"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u016c\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u0170\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0175\b\t"+
		"\u0001\t\u0001\t\u0003\t\u0179\b\t\u0001\t\u0001\t\u0003\t\u017d\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0185\b\n\n\n\f\n\u0188"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b\u018d\b\u000b\n\u000b\f\u000b"+
		"\u0190\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0195\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u019a\b\f\n\f\f\f\u019d\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u01a3\b\r\u0001\r\u0001\r\u0003\r\u01a7"+
		"\b\r\u0001\r\u0003\r\u01aa\b\r\u0001\r\u0003\r\u01ad\b\r\u0001\r\u0003"+
		"\r\u01b0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01b5\b\u000e"+
		"\n\u000e\f\u000e\u01b8\t\u000e\u0001\u000f\u0005\u000f\u01bb\b\u000f\n"+
		"\u000f\f\u000f\u01be\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01c2"+
		"\b\u000f\u0001\u000f\u0003\u000f\u01c5\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u01c9\b\u0010\n\u0010\f\u0010\u01cc\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u01d1\b\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u01d5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u01db\b\u0012\n\u0012\f\u0012\u01de\t\u0012\u0001\u0012\u0003\u0012"+
		"\u01e1\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01e5\b\u0013\n\u0013"+
		"\f\u0013\u01e8\t\u0013\u0001\u0013\u0003\u0013\u01eb\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01ef\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01f3\b\u0014\n\u0014\f\u0014\u01f6\t\u0014\u0001\u0014\u0003\u0014\u01f9"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0204\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u020b"+
		"\b\u0016\n\u0016\f\u0016\u020e\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0212\b\u0016\u0001\u0016\u0003\u0016\u0215\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0219\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u021d"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0229"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0005\u001d\u0232\b\u001d\n\u001d\f\u001d\u0235\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0239\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0242\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0248\b\u001f\n\u001f\f\u001f\u024b\t\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u0252\b \n \f \u0255\t \u0001 \u0001 \u0001 \u0001"+
		"!\u0005!\u025b\b!\n!\f!\u025e\t!\u0001!\u0001!\u0001!\u0005!\u0263\b!"+
		"\n!\f!\u0266\t!\u0001!\u0001!\u0003!\u026a\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0005!\u0270\b!\n!\f!\u0273\t!\u0001!\u0001!\u0003!\u0277\b!\u0001!"+
		"\u0001!\u0001!\u0001!\u0003!\u027d\b!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0283\b!\n!\f!\u0286\t!\u0001!\u0001!\u0003!\u028a\b!\u0001!\u0001!"+
		"\u0003!\u028e\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0296\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u029e\b"+
		"$\n$\f$\u02a1\t$\u0001%\u0001%\u0001%\u0003%\u02a6\b%\u0001&\u0001&\u0001"+
		"&\u0005&\u02ab\b&\n&\f&\u02ae\t&\u0001\'\u0001\'\u0003\'\u02b2\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u02b8\b(\n(\f(\u02bb\t(\u0001(\u0003(\u02be"+
		"\b(\u0003(\u02c0\b(\u0001(\u0001(\u0001)\u0001)\u0003)\u02c6\b)\u0001"+
		")\u0001)\u0001)\u0003)\u02cb\b)\u0005)\u02cd\b)\n)\f)\u02d0\t)\u0001*"+
		"\u0001*\u0001*\u0001*\u0003*\u02d6\b*\u0003*\u02d8\b*\u0001+\u0001+\u0001"+
		"+\u0005+\u02dd\b+\n+\f+\u02e0\t+\u0001,\u0001,\u0003,\u02e4\b,\u0001,"+
		"\u0003,\u02e7\b,\u0001-\u0001-\u0001-\u0003-\u02ec\b-\u0005-\u02ee\b-"+
		"\n-\f-\u02f1\t-\u0001-\u0001-\u0003-\u02f5\b-\u0001-\u0001-\u0003-\u02f9"+
		"\b-\u0001.\u0005.\u02fc\b.\n.\f.\u02ff\t.\u0001.\u0001.\u0001.\u0001/"+
		"\u0005/\u0305\b/\n/\f/\u0308\t/\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00050\u0311\b0\n0\f0\u0314\t0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u031d\b1\u00012\u00012\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00034\u0328\b4\u00014\u00034\u032b\b4\u00015\u0001"+
		"5\u00015\u00055\u0330\b5\n5\f5\u0333\t5\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00037\u033c\b7\u00018\u00018\u00018\u00018\u00058\u0342"+
		"\b8\n8\f8\u0345\t8\u00038\u0347\b8\u00018\u00038\u034a\b8\u00018\u0003"+
		"8\u034d\b8\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0005:\u0356"+
		"\b:\n:\f:\u0359\t:\u0001:\u0003:\u035c\b:\u0001;\u0005;\u035f\b;\n;\f"+
		";\u0362\t;\u0001;\u0001;\u0003;\u0366\b;\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u036e\b<\u0001<\u0001<\u0003<\u0372\b<\u0001<\u0001<\u0003"+
		"<\u0376\b<\u0001<\u0001<\u0003<\u037a\b<\u0003<\u037c\b<\u0001=\u0001"+
		"=\u0003=\u0380\b=\u0001>\u0001>\u0001>\u0001>\u0003>\u0386\b>\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001A\u0003A\u038e\bA\u0001A\u0001A\u0003A\u0392"+
		"\bA\u0001A\u0001A\u0003A\u0396\bA\u0001A\u0001A\u0001A\u0003A\u039b\b"+
		"A\u0001A\u0001A\u0003A\u039f\bA\u0001A\u0001A\u0003A\u03a3\bA\u0001A\u0003"+
		"A\u03a6\bA\u0001A\u0003A\u03a9\bA\u0001A\u0003A\u03ac\bA\u0001B\u0001"+
		"B\u0004B\u03b0\bB\u000bB\fB\u03b1\u0003B\u03b4\bB\u0001C\u0001C\u0001"+
		"C\u0003C\u03b9\bC\u0001C\u0001C\u0003C\u03bd\bC\u0001C\u0001C\u0003C\u03c1"+
		"\bC\u0001C\u0001C\u0003C\u03c5\bC\u0003C\u03c7\bC\u0001D\u0005D\u03ca"+
		"\bD\nD\fD\u03cd\tD\u0001D\u0001D\u0001D\u0001E\u0005E\u03d3\bE\nE\fE\u03d6"+
		"\tE\u0001E\u0001E\u0003E\u03da\bE\u0001E\u0003E\u03dd\bE\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0003F\u03e5\bF\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u03eb\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u03f3"+
		"\bF\u0001F\u0001F\u0001F\u0003F\u03f8\bF\u0003F\u03fa\bF\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0003F\u0402\bF\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u0408\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0004F\u0413\bF\u000bF\fF\u0414\u0001F\u0003F\u0418\bF\u0001"+
		"F\u0003F\u041b\bF\u0001F\u0001F\u0001F\u0001F\u0005F\u0421\bF\nF\fF\u0424"+
		"\tF\u0001F\u0003F\u0427\bF\u0001F\u0001F\u0001F\u0001F\u0005F\u042d\b"+
		"F\nF\fF\u0430\tF\u0001F\u0005F\u0433\bF\nF\fF\u0436\tF\u0001F\u0003F\u0439"+
		"\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0441\bF\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u044a\bF\u0001F\u0001F\u0001"+
		"F\u0003F\u044f\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u045a\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0005H\u0461"+
		"\bH\nH\fH\u0464\tH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u0470\bH\u0001I\u0001I\u0001I\u0005I\u0475\bI\n"+
		"I\fI\u0478\tI\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0003K\u0480\b"+
		"K\u0001K\u0001K\u0001L\u0001L\u0001L\u0005L\u0487\bL\nL\fL\u048a\tL\u0001"+
		"M\u0005M\u048d\bM\nM\fM\u0490\tM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"N\u0004N\u0498\bN\u000bN\fN\u0499\u0001N\u0004N\u049d\bN\u000bN\fN\u049e"+
		"\u0001O\u0001O\u0001O\u0003O\u04a4\bO\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u04aa\bO\u0001P\u0001P\u0003P\u04ae\bP\u0001P\u0001P\u0003P\u04b2\b"+
		"P\u0001P\u0001P\u0003P\u04b6\bP\u0003P\u04b8\bP\u0001Q\u0001Q\u0003Q\u04bc"+
		"\bQ\u0001R\u0005R\u04bf\bR\nR\fR\u04c2\tR\u0001R\u0001R\u0001R\u0001R"+
		"\u0001R\u0001S\u0001S\u0001S\u0003S\u04cc\bS\u0001S\u0001S\u0001S\u0003"+
		"S\u04d1\bS\u0001S\u0003S\u04d4\bS\u0001T\u0001T\u0001T\u0001T\u0005T\u04da"+
		"\bT\nT\fT\u04dd\tT\u0001T\u0001T\u0001T\u0005T\u04e2\bT\nT\fT\u04e5\t"+
		"T\u0003T\u04e7\bT\u0001U\u0001U\u0001U\u0003U\u04ec\bU\u0001U\u0003U\u04ef"+
		"\bU\u0001U\u0001U\u0001U\u0003U\u04f4\bU\u0001U\u0003U\u04f7\bU\u0001"+
		"U\u0001U\u0001U\u0003U\u04fc\bU\u0001U\u0003U\u04ff\bU\u0001U\u0001U\u0001"+
		"U\u0003U\u0504\bU\u0001U\u0003U\u0507\bU\u0003U\u0509\bU\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0003V\u0523\bV\u0001W\u0001W\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0003X\u053a\bX\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0003X\u054a\bX\u0001X\u0001X\u0003X\u054e\bX\u0001X\u0001X\u0001"+
		"X\u0003X\u0553\bX\u0001X\u0001X\u0001X\u0003X\u0558\bX\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0003X\u056f"+
		"\bX\u0001X\u0001X\u0001X\u0001X\u0003X\u0575\bX\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0003"+
		"X\u0584\bX\u0001X\u0005X\u0587\bX\nX\fX\u058a\tX\u0001Y\u0001Y\u0001Z"+
		"\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0003\\\u0597"+
		"\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u059e\b\\\n\\\f\\"+
		"\u05a1\t\\\u0001\\\u0001\\\u0003\\\u05a5\b\\\u0001]\u0001]\u0003]\u05a9"+
		"\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u05bb\b^\u0003^\u05bd"+
		"\b^\u0001_\u0001_\u0001_\u0003_\u05c2\b_\u0001_\u0005_\u05c5\b_\n_\f_"+
		"\u05c8\t_\u0001_\u0001_\u0003_\u05cc\b_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0003`\u05d5\b`\u0003`\u05d7\b`\u0001a\u0001a\u0003a\u05db"+
		"\ba\u0001a\u0001a\u0001a\u0003a\u05e0\ba\u0005a\u05e2\ba\na\fa\u05e5\t"+
		"a\u0001a\u0003a\u05e8\ba\u0001b\u0001b\u0003b\u05ec\bb\u0001b\u0001b\u0001"+
		"c\u0001c\u0001c\u0001c\u0005c\u05f4\bc\nc\fc\u05f7\tc\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0005c\u0600\bc\nc\fc\u0603\tc\u0001c\u0001"+
		"c\u0005c\u0607\bc\nc\fc\u060a\tc\u0003c\u060c\bc\u0001d\u0001d\u0003d"+
		"\u0610\bd\u0001e\u0001e\u0001e\u0001f\u0001f\u0001f\u0003f\u0618\bf\u0001"+
		"g\u0001g\u0001g\u0003g\u061d\bg\u0001h\u0001h\u0001h\u0001h\u0001i\u0001"+
		"i\u0001i\u0005i\u0626\bi\ni\fi\u0629\ti\u0001j\u0003j\u062c\bj\u0001j"+
		"\u0001j\u0003j\u0630\bj\u0001j\u0001j\u0005j\u0634\bj\nj\fj\u0637\tj\u0001"+
		"k\u0001k\u0001l\u0001l\u0001l\u0001l\u0005l\u063f\bl\nl\fl\u0642\tl\u0001"+
		"l\u0001l\u0001m\u0001m\u0001m\u0001m\u0003m\u064a\bm\u0003m\u064c\bm\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0003n\u0653\bn\u0001o\u0001o\u0003o\u0657"+
		"\bo\u0001o\u0001o\u0001o\u0000\u0001\u00b0p\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u0000\u0007\u0002\u0000\u0011"+
		"\u0011((\u0001\u00008;\u0001\u0000<=\u0003\u0000KKbbfp\u0002\u0000XYd"+
		"d\u0003\u0000NOX[dd\b\u0000\u0003\u0003\u0005\u0005\b\b\u000e\u000e\u0014"+
		"\u0014\u001b\u001b\u001d\u001d%%\u0752\u0000\u00e0\u0001\u0000\u0000\u0000"+
		"\u0002\u0124\u0001\u0000\u0000\u0000\u0004\u0127\u0001\u0000\u0000\u0000"+
		"\u0006\u013a\u0001\u0000\u0000\u0000\b\u0141\u0001\u0000\u0000\u0000\n"+
		"\u0159\u0001\u0000\u0000\u0000\f\u0160\u0001\u0000\u0000\u0000\u000e\u016b"+
		"\u0001\u0000\u0000\u0000\u0010\u016f\u0001\u0000\u0000\u0000\u0012\u0171"+
		"\u0001\u0000\u0000\u0000\u0014\u0180\u0001\u0000\u0000\u0000\u0016\u018e"+
		"\u0001\u0000\u0000\u0000\u0018\u0196\u0001\u0000\u0000\u0000\u001a\u019e"+
		"\u0001\u0000\u0000\u0000\u001c\u01b1\u0001\u0000\u0000\u0000\u001e\u01bc"+
		"\u0001\u0000\u0000\u0000 \u01c6\u0001\u0000\u0000\u0000\"\u01cd\u0001"+
		"\u0000\u0000\u0000$\u01d8\u0001\u0000\u0000\u0000&\u01e2\u0001\u0000\u0000"+
		"\u0000(\u01f8\u0001\u0000\u0000\u0000*\u0203\u0001\u0000\u0000\u0000,"+
		"\u0205\u0001\u0000\u0000\u0000.\u0218\u0001\u0000\u0000\u00000\u021c\u0001"+
		"\u0000\u0000\u00002\u021e\u0001\u0000\u0000\u00004\u0221\u0001\u0000\u0000"+
		"\u00006\u0224\u0001\u0000\u0000\u00008\u022c\u0001\u0000\u0000\u0000:"+
		"\u0238\u0001\u0000\u0000\u0000<\u0241\u0001\u0000\u0000\u0000>\u0243\u0001"+
		"\u0000\u0000\u0000@\u024e\u0001\u0000\u0000\u0000B\u028d\u0001\u0000\u0000"+
		"\u0000D\u0295\u0001\u0000\u0000\u0000F\u0297\u0001\u0000\u0000\u0000H"+
		"\u029a\u0001\u0000\u0000\u0000J\u02a2\u0001\u0000\u0000\u0000L\u02a7\u0001"+
		"\u0000\u0000\u0000N\u02b1\u0001\u0000\u0000\u0000P\u02b3\u0001\u0000\u0000"+
		"\u0000R\u02c3\u0001\u0000\u0000\u0000T\u02d7\u0001\u0000\u0000\u0000V"+
		"\u02d9\u0001\u0000\u0000\u0000X\u02e1\u0001\u0000\u0000\u0000Z\u02f8\u0001"+
		"\u0000\u0000\u0000\\\u02fd\u0001\u0000\u0000\u0000^\u0306\u0001\u0000"+
		"\u0000\u0000`\u030d\u0001\u0000\u0000\u0000b\u031c\u0001\u0000\u0000\u0000"+
		"d\u031e\u0001\u0000\u0000\u0000f\u0320\u0001\u0000\u0000\u0000h\u0322"+
		"\u0001\u0000\u0000\u0000j\u032c\u0001\u0000\u0000\u0000l\u0334\u0001\u0000"+
		"\u0000\u0000n\u033b\u0001\u0000\u0000\u0000p\u033d\u0001\u0000\u0000\u0000"+
		"r\u034e\u0001\u0000\u0000\u0000t\u0353\u0001\u0000\u0000\u0000v\u0365"+
		"\u0001\u0000\u0000\u0000x\u037b\u0001\u0000\u0000\u0000z\u037f\u0001\u0000"+
		"\u0000\u0000|\u0381\u0001\u0000\u0000\u0000~\u0387\u0001\u0000\u0000\u0000"+
		"\u0080\u0389\u0001\u0000\u0000\u0000\u0082\u03ab\u0001\u0000\u0000\u0000"+
		"\u0084\u03b3\u0001\u0000\u0000\u0000\u0086\u03c6\u0001\u0000\u0000\u0000"+
		"\u0088\u03cb\u0001\u0000\u0000\u0000\u008a\u03dc\u0001\u0000\u0000\u0000"+
		"\u008c\u0459\u0001\u0000\u0000\u0000\u008e\u045b\u0001\u0000\u0000\u0000"+
		"\u0090\u046f\u0001\u0000\u0000\u0000\u0092\u0471\u0001\u0000\u0000\u0000"+
		"\u0094\u0479\u0001\u0000\u0000\u0000\u0096\u047c\u0001\u0000\u0000\u0000"+
		"\u0098\u0483\u0001\u0000\u0000\u0000\u009a\u048e\u0001\u0000\u0000\u0000"+
		"\u009c\u0497\u0001\u0000\u0000\u0000\u009e\u04a9\u0001\u0000\u0000\u0000"+
		"\u00a0\u04b7\u0001\u0000\u0000\u0000\u00a2\u04bb\u0001\u0000\u0000\u0000"+
		"\u00a4\u04c0\u0001\u0000\u0000\u0000\u00a6\u04d3\u0001\u0000\u0000\u0000"+
		"\u00a8\u04e6\u0001\u0000\u0000\u0000\u00aa\u0508\u0001\u0000\u0000\u0000"+
		"\u00ac\u0522\u0001\u0000\u0000\u0000\u00ae\u0524\u0001\u0000\u0000\u0000"+
		"\u00b0\u0557\u0001\u0000\u0000\u0000\u00b2\u058b\u0001\u0000\u0000\u0000"+
		"\u00b4\u058d\u0001\u0000\u0000\u0000\u00b6\u058f\u0001\u0000\u0000\u0000"+
		"\u00b8\u05a4\u0001\u0000\u0000\u0000\u00ba\u05a8\u0001\u0000\u0000\u0000"+
		"\u00bc\u05bc\u0001\u0000\u0000\u0000\u00be\u05c1\u0001\u0000\u0000\u0000"+
		"\u00c0\u05d6\u0001\u0000\u0000\u0000\u00c2\u05e7\u0001\u0000\u0000\u0000"+
		"\u00c4\u05e9\u0001\u0000\u0000\u0000\u00c6\u05ef\u0001\u0000\u0000\u0000"+
		"\u00c8\u060d\u0001\u0000\u0000\u0000\u00ca\u0611\u0001\u0000\u0000\u0000"+
		"\u00cc\u0617\u0001\u0000\u0000\u0000\u00ce\u061c\u0001\u0000\u0000\u0000"+
		"\u00d0\u061e\u0001\u0000\u0000\u0000\u00d2\u0622\u0001\u0000\u0000\u0000"+
		"\u00d4\u062b\u0001\u0000\u0000\u0000\u00d6\u0638\u0001\u0000\u0000\u0000"+
		"\u00d8\u063a\u0001\u0000\u0000\u0000\u00da\u064b\u0001\u0000\u0000\u0000"+
		"\u00dc\u0652\u0001\u0000\u0000\u0000\u00de\u0654\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0003\u0002\u0001\u0000\u00e1\u00e3\u00056\u0000\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005e\u0000\u0000\u00e5\u00e7"+
		"\u00056\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003"+
		"\u0002\u0001\u0000\u00e9\u00eb\u00056\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0005\u0000\u0000\u0001\u00ed\u0001\u0001\u0000"+
		"\u0000\u0000\u00ee\u0125\u0003\u0006\u0003\u0000\u00ef\u00f1\u0003\b\u0004"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u0125\u0001\u0000\u0000\u0000\u00f4\u0125\u0003\u001e\u000f"+
		"\u0000\u00f5\u0125\u0003\n\u0005\u0000\u00f6\u00f8\u0003\f\u0006\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u0125\u0003*\u0015\u0000\u00fd\u0125\u0003J%\u0000\u00fe\u0125"+
		"\u0003b1\u0000\u00ff\u0125\u0003h4\u0000\u0100\u0125\u0003l6\u0000\u0101"+
		"\u0125\u0003r9\u0000\u0102\u0125\u0003\u0082A\u0000\u0103\u0125\u0003"+
		"\u00b0X\u0000\u0104\u0125\u0003\u00a6S\u0000\u0105\u0125\u0003\u00a8T"+
		"\u0000\u0106\u0125\u0003\u0084B\u0000\u0107\u0125\u0003\u0086C\u0000\u0108"+
		"\u010a\u0005J\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0125"+
		"\u0003\u00aaU\u0000\u010c\u0125\u0003Z-\u0000\u010d\u010e\u0005E\u0000"+
		"\u0000\u010e\u010f\u0005\u000f\u0000\u0000\u010f\u0125\u0003\u008cF\u0000"+
		"\u0110\u011a\u0005E\u0000\u0000\u0111\u0113\u0003\u0090H\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0003\u0094J\u0000\u0117\u0116\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011b\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0003\u0094J\u0000\u011a\u0112\u0001\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u0125\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005E\u0000\u0000\u011d\u011e\u00052\u0000\u0000"+
		"\u011e\u0120\u0003\u00a6S\u0000\u011f\u0121\u0005H\u0000\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0125"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u00055\u0000\u0000\u0123\u0125\u0005"+
		"4\u0000\u0000\u0124\u00ee\u0001\u0000\u0000\u0000\u0124\u00f0\u0001\u0000"+
		"\u0000\u0000\u0124\u00f4\u0001\u0000\u0000\u0000\u0124\u00f5\u0001\u0000"+
		"\u0000\u0000\u0124\u00f9\u0001\u0000\u0000\u0000\u0124\u00fd\u0001\u0000"+
		"\u0000\u0000\u0124\u00fe\u0001\u0000\u0000\u0000\u0124\u00ff\u0001\u0000"+
		"\u0000\u0000\u0124\u0100\u0001\u0000\u0000\u0000\u0124\u0101\u0001\u0000"+
		"\u0000\u0000\u0124\u0102\u0001\u0000\u0000\u0000\u0124\u0103\u0001\u0000"+
		"\u0000\u0000\u0124\u0104\u0001\u0000\u0000\u0000\u0124\u0105\u0001\u0000"+
		"\u0000\u0000\u0124\u0106\u0001\u0000\u0000\u0000\u0124\u0107\u0001\u0000"+
		"\u0000\u0000\u0124\u0109\u0001\u0000\u0000\u0000\u0124\u010c\u0001\u0000"+
		"\u0000\u0000\u0124\u010d\u0001\u0000\u0000\u0000\u0124\u0110\u0001\u0000"+
		"\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0003\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u0003\u0006\u0003\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012c\u0001\u0000"+
		"\u0000\u0000\u0129\u012b\u0003\b\u0004\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0132\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0131\u0003\n\u0005\u0000"+
		"\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005\u0000\u0000\u0001\u0136\u0005\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0003h4\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0005 \u0000\u0000\u013e\u013f\u0003"+
		"`0\u0000\u013f\u0140\u0005H\u0000\u0000\u0140\u0007\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0005\u0019\u0000\u0000\u0142\u0144\u0005&\u0000\u0000"+
		"\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148\u0003`0\u0000\u0146\u0147"+
		"\u0005J\u0000\u0000\u0147\u0149\u0005\\\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0005H\u0000\u0000\u014b\t\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0003\u000e\u0007\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0156\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0157\u0003\u0012"+
		"\t\u0000\u0153\u0157\u0003\u001a\r\u0000\u0154\u0157\u0003\"\u0011\u0000"+
		"\u0155\u0157\u0003r9\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\u0005H\u0000\u0000\u0159\u014f\u0001\u0000\u0000\u0000\u0159\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u000b\u0001\u0000\u0000\u0000\u015b\u0161\u0003"+
		"\u000e\u0007\u0000\u015c\u0161\u0005\u001e\u0000\u0000\u015d\u0161\u0005"+
		"*\u0000\u0000\u015e\u0161\u0005.\u0000\u0000\u015f\u0161\u00051\u0000"+
		"\u0000\u0160\u015b\u0001\u0000\u0000\u0000\u0160\u015c\u0001\u0000\u0000"+
		"\u0000\u0160\u015d\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\r\u0001\u0000\u0000\u0000"+
		"\u0162\u016c\u0003h4\u0000\u0163\u016c\u0005#\u0000\u0000\u0164\u016c"+
		"\u0005\"\u0000\u0000\u0165\u016c\u0005!\u0000\u0000\u0166\u016c\u0005"+
		"&\u0000\u0000\u0167\u016c\u0005\u0001\u0000\u0000\u0168\u016c\u0005\u0012"+
		"\u0000\u0000\u0169\u016c\u0005\'\u0000\u0000\u016a\u016c\u00055\u0000"+
		"\u0000\u016b\u0162\u0001\u0000\u0000\u0000\u016b\u0163\u0001\u0000\u0000"+
		"\u0000\u016b\u0164\u0001\u0000\u0000\u0000\u016b\u0165\u0001\u0000\u0000"+
		"\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000\u0000"+
		"\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u000f\u0001\u0000\u0000"+
		"\u0000\u016d\u0170\u0005\u0012\u0000\u0000\u016e\u0170\u0003h4\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0011\u0001\u0000\u0000\u0000\u0171\u0172\u0005\t\u0000\u0000\u0172\u0174"+
		"\u0003\u008eG\u0000\u0173\u0175\u0003\u0014\n\u0000\u0174\u0173\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0178\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u0011\u0000\u0000\u0177\u0179\u0003"+
		"\u00d4j\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0018"+
		"\u0000\u0000\u017b\u017d\u0003\u00d2i\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0003$\u0012\u0000\u017f\u0013\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005M\u0000\u0000\u0181\u0186\u0003\u0016\u000b\u0000\u0182"+
		"\u0183\u0005I\u0000\u0000\u0183\u0185\u0003\u0016\u000b\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0189"+
		"\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0005L\u0000\u0000\u018a\u0015\u0001\u0000\u0000\u0000\u018b\u018d\u0003"+
		"h4\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0194\u0003\u008eG\u0000\u0192\u0193\u0005\u0011\u0000\u0000"+
		"\u0193\u0195\u0003\u0018\f\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195\u0017\u0001\u0000\u0000\u0000\u0196"+
		"\u019b\u0003\u00d4j\u0000\u0197\u0198\u0005^\u0000\u0000\u0198\u019a\u0003"+
		"\u00d4j\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u0019\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005\u0010\u0000\u0000\u019f\u01a2\u0003\u008e"+
		"G\u0000\u01a0\u01a1\u0005\u0018\u0000\u0000\u01a1\u01a3\u0003\u00d2i\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0005D\u0000\u0000\u01a5"+
		"\u01a7\u0003\u001c\u000e\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8"+
		"\u01aa\u0005I\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01ad"+
		"\u0003 \u0010\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005"+
		"E\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u001b\u0001\u0000\u0000\u0000\u01b1\u01b6\u0003\u001e"+
		"\u000f\u0000\u01b2\u01b3\u0005I\u0000\u0000\u01b3\u01b5\u0003\u001e\u000f"+
		"\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u001d\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bb\u0003h4\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb"+
		"\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003\u008eG\u0000\u01c0\u01c2"+
		"\u0003\u00deo\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c5\u0003"+
		"$\u0012\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u001f\u0001\u0000\u0000\u0000\u01c6\u01ca\u0005H\u0000"+
		"\u0000\u01c7\u01c9\u0003(\u0014\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb!\u0001\u0000\u0000\u0000\u01cc"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u001c\u0000\u0000\u01ce"+
		"\u01d0\u0003\u008eG\u0000\u01cf\u01d1\u0003\u0014\n\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u0011\u0000\u0000\u01d3\u01d5"+
		"\u0003\u00d2i\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003"+
		"&\u0013\u0000\u01d7#\u0001\u0000\u0000\u0000\u01d8\u01dc\u0005D\u0000"+
		"\u0000\u01d9\u01db\u0003(\u0014\u0000\u01da\u01d9\u0001\u0000\u0000\u0000"+
		"\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0005E\u0000\u0000\u01e0"+
		"\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1"+
		"%\u0001\u0000\u0000\u0000\u01e2\u01e6\u0005D\u0000\u0000\u01e3\u01e5\u0003"+
		":\u001d\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e9\u01eb\u0005E\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\'\u0001\u0000\u0000\u0000"+
		"\u01ec\u01f9\u0005H\u0000\u0000\u01ed\u01ef\u0005&\u0000\u0000\u01ee\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f9\u0003\u0082A\u0000\u01f1\u01f3\u0003"+
		"\f\u0006\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f9\u0003*\u0015\u0000\u01f8\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f8\u01ee\u0001\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f9)\u0001\u0000\u0000\u0000\u01fa\u0204\u0003,\u0016\u0000\u01fb"+
		"\u0204\u00032\u0019\u0000\u01fc\u0204\u00038\u001c\u0000\u01fd\u0204\u0003"+
		"6\u001b\u0000\u01fe\u0204\u00034\u001a\u0000\u01ff\u0204\u0003\"\u0011"+
		"\u0000\u0200\u0204\u0003r9\u0000\u0201\u0204\u0003\u0012\t\u0000\u0202"+
		"\u0204\u0003\u001a\r\u0000\u0203\u01fa\u0001\u0000\u0000\u0000\u0203\u01fb"+
		"\u0001\u0000\u0000\u0000\u0203\u01fc\u0001\u0000\u0000\u0000\u0203\u01fd"+
		"\u0001\u0000\u0000\u0000\u0203\u01fe\u0001\u0000\u0000\u0000\u0203\u01ff"+
		"\u0001\u0000\u0000\u0000\u0203\u0200\u0001\u0000\u0000\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204+\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u00030\u0018\u0000\u0206\u0207\u0003\u008e"+
		"G\u0000\u0207\u020c\u0003X,\u0000\u0208\u0209\u0005F\u0000\u0000\u0209"+
		"\u020b\u0005G\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020e"+
		"\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0001\u0000\u0000\u0000\u020d\u0211\u0001\u0000\u0000\u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020f\u0210\u0005-\u0000\u0000\u0210\u0212\u0003"+
		"V+\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000"+
		"\u0000\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u0215\u0003.\u0017\u0000"+
		"\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000"+
		"\u0215-\u0001\u0000\u0000\u0000\u0216\u0219\u0003\u0082A\u0000\u0217\u0219"+
		"\u0005H\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0217\u0001"+
		"\u0000\u0000\u0000\u0219/\u0001\u0000\u0000\u0000\u021a\u021d\u0003\u00d4"+
		"j\u0000\u021b\u021d\u00050\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000"+
		"\u021c\u021b\u0001\u0000\u0000\u0000\u021d1\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0003\u0014\n\u0000\u021f\u0220\u0003,\u0016\u0000\u02203\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0003\u0014\n\u0000\u0222\u0223\u00036"+
		"\u001b\u0000\u02235\u0001\u0000\u0000\u0000\u0224\u0225\u0003\u008eG\u0000"+
		"\u0225\u0228\u0003X,\u0000\u0226\u0227\u0005-\u0000\u0000\u0227\u0229"+
		"\u0003V+\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0003\u0082"+
		"A\u0000\u022b7\u0001\u0000\u0000\u0000\u022c\u022d\u0003\u00d4j\u0000"+
		"\u022d\u022e\u0003H$\u0000\u022e\u022f\u0005H\u0000\u0000\u022f9\u0001"+
		"\u0000\u0000\u0000\u0230\u0232\u0003\f\u0006\u0000\u0231\u0230\u0001\u0000"+
		"\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0001\u0000"+
		"\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0003<\u001e"+
		"\u0000\u0237\u0239\u0005H\u0000\u0000\u0238\u0233\u0001\u0000\u0000\u0000"+
		"\u0238\u0237\u0001\u0000\u0000\u0000\u0239;\u0001\u0000\u0000\u0000\u023a"+
		"\u0242\u0003>\u001f\u0000\u023b\u0242\u0003B!\u0000\u023c\u0242\u0003"+
		"F#\u0000\u023d\u0242\u0003\"\u0011\u0000\u023e\u0242\u0003r9\u0000\u023f"+
		"\u0242\u0003\u0012\t\u0000\u0240\u0242\u0003\u001a\r\u0000\u0241\u023a"+
		"\u0001\u0000\u0000\u0000\u0241\u023b\u0001\u0000\u0000\u0000\u0241\u023c"+
		"\u0001\u0000\u0000\u0000\u0241\u023d\u0001\u0000\u0000\u0000\u0241\u023e"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240"+
		"\u0001\u0000\u0000\u0000\u0242=\u0001\u0000\u0000\u0000\u0243\u0244\u0003"+
		"\u00d4j\u0000\u0244\u0249\u0003@ \u0000\u0245\u0246\u0005I\u0000\u0000"+
		"\u0246\u0248\u0003@ \u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u024b"+
		"\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000\u0000\u024b\u0249"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0005H\u0000\u0000\u024d?\u0001\u0000"+
		"\u0000\u0000\u024e\u0253\u0003\u008eG\u0000\u024f\u0250\u0005F\u0000\u0000"+
		"\u0250\u0252\u0005G\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252"+
		"\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0256\u0257\u0005K\u0000\u0000\u0257\u0258"+
		"\u0003N\'\u0000\u0258A\u0001\u0000\u0000\u0000\u0259\u025b\u0003D\"\u0000"+
		"\u025a\u0259\u0001\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u0269\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000"+
		"\u025f\u026a\u00030\u0018\u0000\u0260\u0264\u0003\u0014\n\u0000\u0261"+
		"\u0263\u0003h4\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0263\u0266\u0001"+
		"\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001"+
		"\u0000\u0000\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0264\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u00030\u0018\u0000\u0268\u026a\u0001\u0000"+
		"\u0000\u0000\u0269\u025f\u0001\u0000\u0000\u0000\u0269\u0260\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0003\u008e"+
		"G\u0000\u026c\u0271\u0003X,\u0000\u026d\u026e\u0005F\u0000\u0000\u026e"+
		"\u0270\u0005G\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0273"+
		"\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0001\u0000\u0000\u0000\u0272\u0276\u0001\u0000\u0000\u0000\u0273\u0271"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u0005-\u0000\u0000\u0275\u0277\u0003"+
		"V+\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0003.\u0017\u0000"+
		"\u0279\u028e\u0001\u0000\u0000\u0000\u027a\u027c\u00055\u0000\u0000\u027b"+
		"\u027d\u00056\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0003\u008eG\u0000\u027f\u0284\u0003X,\u0000\u0280\u0281\u0005F\u0000"+
		"\u0000\u0281\u0283\u0005G\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0283\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0289\u0001\u0000\u0000\u0000"+
		"\u0286\u0284\u0001\u0000\u0000\u0000\u0287\u0288\u0005-\u0000\u0000\u0288"+
		"\u028a\u0003V+\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0003"+
		".\u0017\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u025c\u0001\u0000"+
		"\u0000\u0000\u028d\u027a\u0001\u0000\u0000\u0000\u028eC\u0001\u0000\u0000"+
		"\u0000\u028f\u0296\u0003h4\u0000\u0290\u0296\u0005#\u0000\u0000\u0291"+
		"\u0296\u0005\u0001\u0000\u0000\u0292\u0296\u0005\f\u0000\u0000\u0293\u0296"+
		"\u0005&\u0000\u0000\u0294\u0296\u0005\'\u0000\u0000\u0295\u028f\u0001"+
		"\u0000\u0000\u0000\u0295\u0290\u0001\u0000\u0000\u0000\u0295\u0291\u0001"+
		"\u0000\u0000\u0000\u0295\u0292\u0001\u0000\u0000\u0000\u0295\u0293\u0001"+
		"\u0000\u0000\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296E\u0001\u0000"+
		"\u0000\u0000\u0297\u0298\u0003\u0014\n\u0000\u0298\u0299\u0003B!\u0000"+
		"\u0299G\u0001\u0000\u0000\u0000\u029a\u029f\u0003J%\u0000\u029b\u029c"+
		"\u0005I\u0000\u0000\u029c\u029e\u0003J%\u0000\u029d\u029b\u0001\u0000"+
		"\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0I\u0001\u0000\u0000"+
		"\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a5\u0003L&\u0000\u02a3"+
		"\u02a4\u0005K\u0000\u0000\u02a4\u02a6\u0003N\'\u0000\u02a5\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6K\u0001\u0000"+
		"\u0000\u0000\u02a7\u02ac\u0003\u008eG\u0000\u02a8\u02a9\u0005F\u0000\u0000"+
		"\u02a9\u02ab\u0005G\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ad\u0001\u0000\u0000\u0000\u02adM\u0001\u0000\u0000\u0000\u02ae\u02ac"+
		"\u0001\u0000\u0000\u0000\u02af\u02b2\u0003P(\u0000\u02b0\u02b2\u0003\u00b0"+
		"X\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2O\u0001\u0000\u0000\u0000\u02b3\u02bf\u0005D\u0000\u0000\u02b4"+
		"\u02b9\u0003N\'\u0000\u02b5\u02b6\u0005I\u0000\u0000\u02b6\u02b8\u0003"+
		"N\'\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000"+
		"\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bc\u02be\u0005I\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c0\u0001\u0000\u0000"+
		"\u0000\u02bf\u02b4\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005E\u0000\u0000"+
		"\u02c2Q\u0001\u0000\u0000\u0000\u02c3\u02c5\u0003\u008eG\u0000\u02c4\u02c6"+
		"\u0003\u00d8l\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c6\u02ce\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005"+
		"J\u0000\u0000\u02c8\u02ca\u0003\u008eG\u0000\u02c9\u02cb\u0003\u00d8l"+
		"\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02c7\u0001\u0000\u0000"+
		"\u0000\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cfS\u0001\u0000\u0000\u0000"+
		"\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d8\u0003\u00d4j\u0000\u02d2"+
		"\u02d5\u0005P\u0000\u0000\u02d3\u02d4\u0007\u0000\u0000\u0000\u02d4\u02d6"+
		"\u0003\u00d4j\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d2\u0001\u0000\u0000\u0000\u02d8U\u0001\u0000"+
		"\u0000\u0000\u02d9\u02de\u0003`0\u0000\u02da\u02db\u0005I\u0000\u0000"+
		"\u02db\u02dd\u0003`0\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd\u02e0"+
		"\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df"+
		"\u0001\u0000\u0000\u0000\u02dfW\u0001\u0000\u0000\u0000\u02e0\u02de\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e3\u0005B\u0000\u0000\u02e2\u02e4\u0003Z-"+
		"\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e7\u0005C\u0000\u0000"+
		"\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e7Y\u0001\u0000\u0000\u0000\u02e8\u02ef\u0003\\.\u0000\u02e9\u02eb"+
		"\u0005I\u0000\u0000\u02ea\u02ec\u0003\\.\u0000\u02eb\u02ea\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ed\u02e9\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f4\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f3\u0005I\u0000\u0000\u02f3\u02f5\u0003^/\u0000"+
		"\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f9\u0001\u0000\u0000\u0000\u02f6\u02f9\u0003^/\u0000\u02f7\u02f9"+
		"\u00055\u0000\u0000\u02f8\u02e8\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f9[\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fc\u0003\u0010\b\u0000\u02fb\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u0300\u0001\u0000\u0000"+
		"\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300\u0301\u0003\u00d4j\u0000"+
		"\u0301\u0302\u0003L&\u0000\u0302]\u0001\u0000\u0000\u0000\u0303\u0305"+
		"\u0003\u0010\b\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305\u0308\u0001"+
		"\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001"+
		"\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u0306\u0001"+
		"\u0000\u0000\u0000\u0309\u030a\u0003\u00d4j\u0000\u030a\u030b\u0005t\u0000"+
		"\u0000\u030b\u030c\u0003L&\u0000\u030c_\u0001\u0000\u0000\u0000\u030d"+
		"\u0312\u0003\u008eG\u0000\u030e\u030f\u0005J\u0000\u0000\u030f\u0311\u0003"+
		"\u008eG\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000"+
		"\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000"+
		"\u0000\u0000\u0313a\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000"+
		"\u0000\u0315\u031d\u0003d2\u0000\u0316\u031d\u0003f3\u0000\u0317\u031d"+
		"\u0005?\u0000\u0000\u0318\u031d\u0005@\u0000\u0000\u0319\u031d\u0005>"+
		"\u0000\u0000\u031a\u031d\u0005A\u0000\u0000\u031b\u031d\u00057\u0000\u0000"+
		"\u031c\u0315\u0001\u0000\u0000\u0000\u031c\u0316\u0001\u0000\u0000\u0000"+
		"\u031c\u0317\u0001\u0000\u0000\u0000\u031c\u0318\u0001\u0000\u0000\u0000"+
		"\u031c\u0319\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000"+
		"\u031c\u031b\u0001\u0000\u0000\u0000\u031dc\u0001\u0000\u0000\u0000\u031e"+
		"\u031f\u0007\u0001\u0000\u0000\u031fe\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0007\u0002\u0000\u0000\u0321g\u0001\u0000\u0000\u0000\u0322\u0323\u0005"+
		"s\u0000\u0000\u0323\u032a\u0003`0\u0000\u0324\u0327\u0005B\u0000\u0000"+
		"\u0325\u0328\u0003j5\u0000\u0326\u0328\u0003n7\u0000\u0327\u0325\u0001"+
		"\u0000\u0000\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0327\u0328\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0005"+
		"C\u0000\u0000\u032a\u0324\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000"+
		"\u0000\u0000\u032bi\u0001\u0000\u0000\u0000\u032c\u0331\u0003l6\u0000"+
		"\u032d\u032e\u0005I\u0000\u0000\u032e\u0330\u0003l6\u0000\u032f\u032d"+
		"\u0001\u0000\u0000\u0000\u0330\u0333\u0001\u0000\u0000\u0000\u0331\u032f"+
		"\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332k\u0001"+
		"\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0334\u0335\u0003"+
		"\u008eG\u0000\u0335\u0336\u0005K\u0000\u0000\u0336\u0337\u0003n7\u0000"+
		"\u0337m\u0001\u0000\u0000\u0000\u0338\u033c\u0003\u00b0X\u0000\u0339\u033c"+
		"\u0003h4\u0000\u033a\u033c\u0003p8\u0000\u033b\u0338\u0001\u0000\u0000"+
		"\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033a\u0001\u0000\u0000"+
		"\u0000\u033co\u0001\u0000\u0000\u0000\u033d\u0346\u0005D\u0000\u0000\u033e"+
		"\u0343\u0003n7\u0000\u033f\u0340\u0005I\u0000\u0000\u0340\u0342\u0003"+
		"n7\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000"+
		"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000"+
		"\u0000\u0346\u033e\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000"+
		"\u0000\u0347\u0349\u0001\u0000\u0000\u0000\u0348\u034a\u0005I\u0000\u0000"+
		"\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000"+
		"\u034a\u034c\u0001\u0000\u0000\u0000\u034b\u034d\u0005E\u0000\u0000\u034c"+
		"\u034b\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"q\u0001\u0000\u0000\u0000\u034e\u034f\u0005s\u0000\u0000\u034f\u0350\u0005"+
		"\u001c\u0000\u0000\u0350\u0351\u0003\u008eG\u0000\u0351\u0352\u0003t:"+
		"\u0000\u0352s\u0001\u0000\u0000\u0000\u0353\u0357\u0005D\u0000\u0000\u0354"+
		"\u0356\u0003v;\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0356\u0359\u0001"+
		"\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358\u035b\u0001\u0000\u0000\u0000\u0359\u0357\u0001"+
		"\u0000\u0000\u0000\u035a\u035c\u0005E\u0000\u0000\u035b\u035a\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035cu\u0001\u0000\u0000"+
		"\u0000\u035d\u035f\u0003\f\u0006\u0000\u035e\u035d\u0001\u0000\u0000\u0000"+
		"\u035f\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000"+
		"\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0363\u0001\u0000\u0000\u0000"+
		"\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0366\u0003x<\u0000\u0364\u0366"+
		"\u0005H\u0000\u0000\u0365\u0360\u0001\u0000\u0000\u0000\u0365\u0364\u0001"+
		"\u0000\u0000\u0000\u0366w\u0001\u0000\u0000\u0000\u0367\u0368\u0003\u00d4"+
		"j\u0000\u0368\u0369\u0003z=\u0000\u0369\u036a\u0005H\u0000\u0000\u036a"+
		"\u037c\u0001\u0000\u0000\u0000\u036b\u036d\u0003\u0012\t\u0000\u036c\u036e"+
		"\u0005H\u0000\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036d\u036e\u0001"+
		"\u0000\u0000\u0000\u036e\u037c\u0001\u0000\u0000\u0000\u036f\u0371\u0003"+
		"\"\u0011\u0000\u0370\u0372\u0005H\u0000\u0000\u0371\u0370\u0001\u0000"+
		"\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u037c\u0001\u0000"+
		"\u0000\u0000\u0373\u0375\u0003\u001a\r\u0000\u0374\u0376\u0005H\u0000"+
		"\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000"+
		"\u0000\u0376\u037c\u0001\u0000\u0000\u0000\u0377\u0379\u0003r9\u0000\u0378"+
		"\u037a\u0005H\u0000\u0000\u0379\u0378\u0001\u0000\u0000\u0000\u0379\u037a"+
		"\u0001\u0000\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0367"+
		"\u0001\u0000\u0000\u0000\u037b\u036b\u0001\u0000\u0000\u0000\u037b\u036f"+
		"\u0001\u0000\u0000\u0000\u037b\u0373\u0001\u0000\u0000\u0000\u037b\u0377"+
		"\u0001\u0000\u0000\u0000\u037cy\u0001\u0000\u0000\u0000\u037d\u0380\u0003"+
		"|>\u0000\u037e\u0380\u0003~?\u0000\u037f\u037d\u0001\u0000\u0000\u0000"+
		"\u037f\u037e\u0001\u0000\u0000\u0000\u0380{\u0001\u0000\u0000\u0000\u0381"+
		"\u0382\u0003\u008eG\u0000\u0382\u0383\u0005B\u0000\u0000\u0383\u0385\u0005"+
		"C\u0000\u0000\u0384\u0386\u0003\u0080@\u0000\u0385\u0384\u0001\u0000\u0000"+
		"\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386}\u0001\u0000\u0000\u0000"+
		"\u0387\u0388\u0003H$\u0000\u0388\u007f\u0001\u0000\u0000\u0000\u0389\u038a"+
		"\u0005\f\u0000\u0000\u038a\u038b\u0003n7\u0000\u038b\u0081\u0001\u0000"+
		"\u0000\u0000\u038c\u038e\u00056\u0000\u0000\u038d\u038c\u0001\u0000\u0000"+
		"\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u0391\u0005D\u0000\u0000\u0390\u0392\u00056\u0000\u0000\u0391"+
		"\u0390\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0393\u0001\u0000\u0000\u0000\u0393\u0395\u0003\u0084B\u0000\u0394\u0396"+
		"\u00056\u0000\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001"+
		"\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0005"+
		"E\u0000\u0000\u0398\u03ac\u0001\u0000\u0000\u0000\u0399\u039b\u00056\u0000"+
		"\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039e\u0005D\u0000\u0000"+
		"\u039d\u039f\u00056\u0000\u0000\u039e\u039d\u0001\u0000\u0000\u0000\u039e"+
		"\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a2\u00055\u0000\u0000\u03a1\u03a3\u00056\u0000\u0000\u03a2\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a5\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a6\u0005E\u0000\u0000\u03a5\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03ac\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a9\u00056\u0000\u0000\u03a8\u03a7\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000"+
		"\u0000\u03aa\u03ac\u0005D\u0000\u0000\u03ab\u038d\u0001\u0000\u0000\u0000"+
		"\u03ab\u039a\u0001\u0000\u0000\u0000\u03ab\u03a8\u0001\u0000\u0000\u0000"+
		"\u03ac\u0083\u0001\u0000\u0000\u0000\u03ad\u03b4\u0001\u0000\u0000\u0000"+
		"\u03ae\u03b0\u0003\u0086C\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b1"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3"+
		"\u03ad\u0001\u0000\u0000\u0000\u03b3\u03af\u0001\u0000\u0000\u0000\u03b4"+
		"\u0085\u0001\u0000\u0000\u0000\u03b5\u03b6\u0003\u0088D\u0000\u03b6\u03b8"+
		"\u0005H\u0000\u0000\u03b7\u03b9\u00056\u0000\u0000\u03b8\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03c7\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bc\u0003\u008cF\u0000\u03bb\u03bd\u00056\u0000\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bd\u03c7\u0001\u0000\u0000\u0000\u03be\u03c0\u0003\u008aE\u0000\u03bf"+
		"\u03c1\u00056\u0000\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c7\u0001\u0000\u0000\u0000\u03c2\u03c4"+
		"\u00055\u0000\u0000\u03c3\u03c5\u00056\u0000\u0000\u03c4\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c6\u03b5\u0001\u0000\u0000\u0000\u03c6\u03ba\u0001\u0000"+
		"\u0000\u0000\u03c6\u03be\u0001\u0000\u0000\u0000\u03c6\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c7\u0087\u0001\u0000\u0000\u0000\u03c8\u03ca\u0003\u0010"+
		"\b\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cd\u0001\u0000\u0000"+
		"\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000"+
		"\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000"+
		"\u0000\u03ce\u03cf\u0003\u00d4j\u0000\u03cf\u03d0\u0003H$\u0000\u03d0"+
		"\u0089\u0001\u0000\u0000\u0000\u03d1\u03d3\u0003\u000e\u0007\u0000\u03d2"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d9\u0001\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d7"+
		"\u03da\u0003\u0012\t\u0000\u03d8\u03da\u0003\"\u0011\u0000\u03d9\u03d7"+
		"\u0001\u0000\u0000\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03da\u03dd"+
		"\u0001\u0000\u0000\u0000\u03db\u03dd\u0005H\u0000\u0000\u03dc\u03d4\u0001"+
		"\u0000\u0000\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dd\u008b\u0001"+
		"\u0000\u0000\u0000\u03de\u045a\u0003\u0082A\u0000\u03df\u03e0\u0005\u0015"+
		"\u0000\u0000\u03e0\u03e1\u0005B\u0000\u0000\u03e1\u03e2\u00055\u0000\u0000"+
		"\u03e2\u03e4\u0005C\u0000\u0000\u03e3\u03e5\u0003\u008cF\u0000\u03e4\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u045a"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e7\u0005\u0002\u0000\u0000\u03e7\u03ea"+
		"\u0003\u00b0X\u0000\u03e8\u03e9\u0005Q\u0000\u0000\u03e9\u03eb\u0003\u00b0"+
		"X\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed\u0005H\u0000\u0000"+
		"\u03ed\u045a\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005\u0016\u0000\u0000"+
		"\u03ef\u03f2\u0003\u00a6S\u0000\u03f0\u03f3\u0003\u008cF\u0000\u03f1\u03f3"+
		"\u0003\u0082A\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f9\u0001\u0000\u0000\u0000\u03f4\u03f7\u0005"+
		"\u000f\u0000\u0000\u03f5\u03f8\u0003\u008cF\u0000\u03f6\u03f8\u0003\u0082"+
		"A\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f8\u03fa\u0001\u0000\u0000\u0000\u03f9\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u045a\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fc\u0005\u0015\u0000\u0000\u03fc\u03fd\u0005B\u0000\u0000"+
		"\u03fd\u03fe\u0003\u00a0P\u0000\u03fe\u0401\u0005C\u0000\u0000\u03ff\u0402"+
		"\u0003\u008cF\u0000\u0400\u0402\u0003\u0082A\u0000\u0401\u03ff\u0001\u0000"+
		"\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000"+
		"\u0000\u0000\u0402\u045a\u0001\u0000\u0000\u0000\u0403\u0404\u00052\u0000"+
		"\u0000\u0404\u0407\u0003\u00a6S\u0000\u0405\u0408\u0003\u008cF\u0000\u0406"+
		"\u0408\u0003\u0082A\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0406"+
		"\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u045a"+
		"\u0001\u0000\u0000\u0000\u0409\u040a\u0005\r\u0000\u0000\u040a\u040b\u0003"+
		"\u008cF\u0000\u040b\u040c\u00052\u0000\u0000\u040c\u040d\u0003\u00a6S"+
		"\u0000\u040d\u040e\u0005H\u0000\u0000\u040e\u045a\u0001\u0000\u0000\u0000"+
		"\u040f\u0410\u0005/\u0000\u0000\u0410\u041a\u0003\u0082A\u0000\u0411\u0413"+
		"\u0003\u0090H\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0413\u0414\u0001"+
		"\u0000\u0000\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001"+
		"\u0000\u0000\u0000\u0415\u0417\u0001\u0000\u0000\u0000\u0416\u0418\u0003"+
		"\u0094J\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000"+
		"\u0000\u0000\u0418\u041b\u0001\u0000\u0000\u0000\u0419\u041b\u0003\u0094"+
		"J\u0000\u041a\u0412\u0001\u0000\u0000\u0000\u041a\u0419\u0001\u0000\u0000"+
		"\u0000\u041b\u045a\u0001\u0000\u0000\u0000\u041c\u041d\u0005/\u0000\u0000"+
		"\u041d\u041e\u0003\u0096K\u0000\u041e\u0422\u0003\u0082A\u0000\u041f\u0421"+
		"\u0003\u0090H\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421\u0424\u0001"+
		"\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0423\u0001"+
		"\u0000\u0000\u0000\u0423\u0426\u0001\u0000\u0000\u0000\u0424\u0422\u0001"+
		"\u0000\u0000\u0000\u0425\u0427\u0003\u0094J\u0000\u0426\u0425\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u045a\u0001\u0000"+
		"\u0000\u0000\u0428\u0429\u0005)\u0000\u0000\u0429\u042a\u0003\u00a6S\u0000"+
		"\u042a\u042e\u0005D\u0000\u0000\u042b\u042d\u0003\u009cN\u0000\u042c\u042b"+
		"\u0001\u0000\u0000\u0000\u042d\u0430\u0001\u0000\u0000\u0000\u042e\u042c"+
		"\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0434"+
		"\u0001\u0000\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0431\u0433"+
		"\u0003\u009eO\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0433\u0436\u0001"+
		"\u0000\u0000\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0434\u0435\u0001"+
		"\u0000\u0000\u0000\u0435\u0438\u0001\u0000\u0000\u0000\u0436\u0434\u0001"+
		"\u0000\u0000\u0000\u0437\u0439\u0005E\u0000\u0000\u0438\u0437\u0001\u0000"+
		"\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u045a\u0001\u0000"+
		"\u0000\u0000\u043a\u043b\u0005*\u0000\u0000\u043b\u043c\u0003\u00a6S\u0000"+
		"\u043c\u043d\u0003\u0082A\u0000\u043d\u045a\u0001\u0000\u0000\u0000\u043e"+
		"\u0440\u0005$\u0000\u0000\u043f\u0441\u0003\u00b0X\u0000\u0440\u043f\u0001"+
		"\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0442\u0001"+
		"\u0000\u0000\u0000\u0442\u045a\u0005H\u0000\u0000\u0443\u0444\u0005,\u0000"+
		"\u0000\u0444\u0445\u0003\u00b0X\u0000\u0445\u0446\u0005H\u0000\u0000\u0446"+
		"\u045a\u0001\u0000\u0000\u0000\u0447\u0449\u0005\u0004\u0000\u0000\u0448"+
		"\u044a\u0003\u008eG\u0000\u0449\u0448\u0001\u0000\u0000\u0000\u0449\u044a"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u045a"+
		"\u0005H\u0000\u0000\u044c\u044e\u0005\u000b\u0000\u0000\u044d\u044f\u0003"+
		"\u008eG\u0000\u044e\u044d\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000"+
		"\u0000\u0000\u044f\u0450\u0001\u0000\u0000\u0000\u0450\u045a\u0005H\u0000"+
		"\u0000\u0451\u045a\u0005H\u0000\u0000\u0452\u0453\u0003\u00b0X\u0000\u0453"+
		"\u0454\u0005H\u0000\u0000\u0454\u045a\u0001\u0000\u0000\u0000\u0455\u0456"+
		"\u0003\u008eG\u0000\u0456\u0457\u0005Q\u0000\u0000\u0457\u0458\u0003\u008c"+
		"F\u0000\u0458\u045a\u0001\u0000\u0000\u0000\u0459\u03de\u0001\u0000\u0000"+
		"\u0000\u0459\u03df\u0001\u0000\u0000\u0000\u0459\u03e6\u0001\u0000\u0000"+
		"\u0000\u0459\u03ee\u0001\u0000\u0000\u0000\u0459\u03fb\u0001\u0000\u0000"+
		"\u0000\u0459\u0403\u0001\u0000\u0000\u0000\u0459\u0409\u0001\u0000\u0000"+
		"\u0000\u0459\u040f\u0001\u0000\u0000\u0000\u0459\u041c\u0001\u0000\u0000"+
		"\u0000\u0459\u0428\u0001\u0000\u0000\u0000\u0459\u043a\u0001\u0000\u0000"+
		"\u0000\u0459\u043e\u0001\u0000\u0000\u0000\u0459\u0443\u0001\u0000\u0000"+
		"\u0000\u0459\u0447\u0001\u0000\u0000\u0000\u0459\u044c\u0001\u0000\u0000"+
		"\u0000\u0459\u0451\u0001\u0000\u0000\u0000\u0459\u0452\u0001\u0000\u0000"+
		"\u0000\u0459\u0455\u0001\u0000\u0000\u0000\u045a\u008d\u0001\u0000\u0000"+
		"\u0000\u045b\u045c\u0005x\u0000\u0000\u045c\u008f\u0001\u0000\u0000\u0000"+
		"\u045d\u045e\u0005\u0007\u0000\u0000\u045e\u0462\u0005B\u0000\u0000\u045f"+
		"\u0461\u0003\u0010\b\u0000\u0460\u045f\u0001\u0000\u0000\u0000\u0461\u0464"+
		"\u0001\u0000\u0000\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0462\u0463"+
		"\u0001\u0000\u0000\u0000\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u0462"+
		"\u0001\u0000\u0000\u0000\u0465\u0466\u0003\u0092I\u0000\u0466\u0467\u0003"+
		"\u008eG\u0000\u0467\u0468\u0005C\u0000\u0000\u0468\u0469\u0003\u0082A"+
		"\u0000\u0469\u0470\u0001\u0000\u0000\u0000\u046a\u046b\u0005\u0007\u0000"+
		"\u0000\u046b\u046c\u0005B\u0000\u0000\u046c\u046d\u00055\u0000\u0000\u046d"+
		"\u046e\u0005C\u0000\u0000\u046e\u0470\u0003\u0082A\u0000\u046f\u045d\u0001"+
		"\u0000\u0000\u0000\u046f\u046a\u0001\u0000\u0000\u0000\u0470\u0091\u0001"+
		"\u0000\u0000\u0000\u0471\u0476\u0003`0\u0000\u0472\u0473\u0005_\u0000"+
		"\u0000\u0473\u0475\u0003`0\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475"+
		"\u0478\u0001\u0000\u0000\u0000\u0476\u0474\u0001\u0000\u0000\u0000\u0476"+
		"\u0477\u0001\u0000\u0000\u0000\u0477\u0093\u0001\u0000\u0000\u0000\u0478"+
		"\u0476\u0001\u0000\u0000\u0000\u0479\u047a\u0005\u0013\u0000\u0000\u047a"+
		"\u047b\u0003\u0082A\u0000\u047b\u0095\u0001\u0000\u0000\u0000\u047c\u047d"+
		"\u0005B\u0000\u0000\u047d\u047f\u0003\u0098L\u0000\u047e\u0480\u0005H"+
		"\u0000\u0000\u047f\u047e\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000"+
		"\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0482\u0005C\u0000"+
		"\u0000\u0482\u0097\u0001\u0000\u0000\u0000\u0483\u0488\u0003\u009aM\u0000"+
		"\u0484\u0485\u0005H\u0000\u0000\u0485\u0487\u0003\u009aM\u0000\u0486\u0484"+
		"\u0001\u0000\u0000\u0000\u0487\u048a\u0001\u0000\u0000\u0000\u0488\u0486"+
		"\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u0099"+
		"\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048b\u048d"+
		"\u0003\u0010\b\u0000\u048c\u048b\u0001\u0000\u0000\u0000\u048d\u0490\u0001"+
		"\u0000\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048e\u048f\u0001"+
		"\u0000\u0000\u0000\u048f\u0491\u0001\u0000\u0000\u0000\u0490\u048e\u0001"+
		"\u0000\u0000\u0000\u0491\u0492\u0003R)\u0000\u0492\u0493\u0003L&\u0000"+
		"\u0493\u0494\u0005K\u0000\u0000\u0494\u0495\u0003\u00b0X\u0000\u0495\u009b"+
		"\u0001\u0000\u0000\u0000\u0496\u0498\u0003\u009eO\u0000\u0497\u0496\u0001"+
		"\u0000\u0000\u0000\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u0497\u0001"+
		"\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u049c\u0001"+
		"\u0000\u0000\u0000\u049b\u049d\u0003\u0086C\u0000\u049c\u049b\u0001\u0000"+
		"\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049e\u049c\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u009d\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a3\u0005\u0006\u0000\u0000\u04a1\u04a4\u0003\u00b0"+
		"X\u0000\u04a2\u04a4\u0003\u008eG\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000"+
		"\u04a3\u04a2\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000"+
		"\u04a5\u04a6\u0005Q\u0000\u0000\u04a6\u04aa\u0001\u0000\u0000\u0000\u04a7"+
		"\u04a8\u0005\f\u0000\u0000\u04a8\u04aa\u0005Q\u0000\u0000\u04a9\u04a0"+
		"\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa\u009f"+
		"\u0001\u0000\u0000\u0000\u04ab\u04b8\u0003\u00a4R\u0000\u04ac\u04ae\u0003"+
		"\u00a2Q\u0000\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000"+
		"\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b1\u0005H\u0000"+
		"\u0000\u04b0\u04b2\u0003\u00b0X\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000"+
		"\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000"+
		"\u04b3\u04b5\u0005H\u0000\u0000\u04b4\u04b6\u0003\u00a8T\u0000\u04b5\u04b4"+
		"\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b8"+
		"\u0001\u0000\u0000\u0000\u04b7\u04ab\u0001\u0000\u0000\u0000\u04b7\u04ad"+
		"\u0001\u0000\u0000\u0000\u04b8\u00a1\u0001\u0000\u0000\u0000\u04b9\u04bc"+
		"\u0003\u0088D\u0000\u04ba\u04bc\u0003\u00a8T\u0000\u04bb\u04b9\u0001\u0000"+
		"\u0000\u0000\u04bb\u04ba\u0001\u0000\u0000\u0000\u04bc\u00a3\u0001\u0000"+
		"\u0000\u0000\u04bd\u04bf\u0003\u0010\b\u0000\u04be\u04bd\u0001\u0000\u0000"+
		"\u0000\u04bf\u04c2\u0001\u0000\u0000\u0000\u04c0\u04be\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c3\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c3\u04c4\u0003\u00d4j\u0000"+
		"\u04c4\u04c5\u0003L&\u0000\u04c5\u04c6\u0005Q\u0000\u0000\u04c6\u04c7"+
		"\u0003\u00b0X\u0000\u04c7\u00a5\u0001\u0000\u0000\u0000\u04c8\u04c9\u0005"+
		"B\u0000\u0000\u04c9\u04cb\u00053\u0000\u0000\u04ca\u04cc\u0005C\u0000"+
		"\u0000\u04cb\u04ca\u0001\u0000\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000"+
		"\u0000\u04cc\u04d4\u0001\u0000\u0000\u0000\u04cd\u04ce\u0005B\u0000\u0000"+
		"\u04ce\u04d0\u0003\u00b0X\u0000\u04cf\u04d1\u0005C\u0000\u0000\u04d0\u04cf"+
		"\u0001\u0000\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d2\u04d4\u00053\u0000\u0000\u04d3\u04c8\u0001"+
		"\u0000\u0000\u0000\u04d3\u04cd\u0001\u0000\u0000\u0000\u04d3\u04d2\u0001"+
		"\u0000\u0000\u0000\u04d4\u00a7\u0001\u0000\u0000\u0000\u04d5\u04e7\u0005"+
		"5\u0000\u0000\u04d6\u04db\u00053\u0000\u0000\u04d7\u04d8\u0005I\u0000"+
		"\u0000\u04d8\u04da\u00053\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000"+
		"\u04da\u04dd\u0001\u0000\u0000\u0000\u04db\u04d9\u0001\u0000\u0000\u0000"+
		"\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u04e7\u0001\u0000\u0000\u0000"+
		"\u04dd\u04db\u0001\u0000\u0000\u0000\u04de\u04e3\u0003\u00b0X\u0000\u04df"+
		"\u04e0\u0005I\u0000\u0000\u04e0\u04e2\u0003\u00b0X\u0000\u04e1\u04df\u0001"+
		"\u0000\u0000\u0000\u04e2\u04e5\u0001\u0000\u0000\u0000\u04e3\u04e1\u0001"+
		"\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000\u0000\u04e4\u04e7\u0001"+
		"\u0000\u0000\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e6\u04d5\u0001"+
		"\u0000\u0000\u0000\u04e6\u04d6\u0001\u0000\u0000\u0000\u04e6\u04de\u0001"+
		"\u0000\u0000\u0000\u04e7\u00a9\u0001\u0000\u0000\u0000\u04e8\u04e9\u0003"+
		"\u008eG\u0000\u04e9\u04eb\u0005B\u0000\u0000\u04ea\u04ec\u0003\u00a8T"+
		"\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ee\u0001\u0000\u0000\u0000\u04ed\u04ef\u0005C\u0000\u0000"+
		"\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000"+
		"\u04ef\u0509\u0001\u0000\u0000\u0000\u04f0\u04f1\u00053\u0000\u0000\u04f1"+
		"\u04f3\u0005B\u0000\u0000\u04f2\u04f4\u0003\u00a8T\u0000\u04f3\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f6\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f7\u0005C\u0000\u0000\u04f6\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u0509\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f9\u0005+\u0000\u0000\u04f9\u04fb\u0005B\u0000\u0000"+
		"\u04fa\u04fc\u0003\u00a8T\u0000\u04fb\u04fa\u0001\u0000\u0000\u0000\u04fb"+
		"\u04fc\u0001\u0000\u0000\u0000\u04fc\u04fe\u0001\u0000\u0000\u0000\u04fd"+
		"\u04ff\u0005C\u0000\u0000\u04fe\u04fd\u0001\u0000\u0000\u0000\u04fe\u04ff"+
		"\u0001\u0000\u0000\u0000\u04ff\u0509\u0001\u0000\u0000\u0000\u0500\u0501"+
		"\u0005(\u0000\u0000\u0501\u0503\u0005B\u0000\u0000\u0502\u0504\u0003\u00a8"+
		"T\u0000\u0503\u0502\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000"+
		"\u0000\u0504\u0506\u0001\u0000\u0000\u0000\u0505\u0507\u0005C\u0000\u0000"+
		"\u0506\u0505\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000\u0000\u0000"+
		"\u0507\u0509\u0001\u0000\u0000\u0000\u0508\u04e8\u0001\u0000\u0000\u0000"+
		"\u0508\u04f0\u0001\u0000\u0000\u0000\u0508\u04f8\u0001\u0000\u0000\u0000"+
		"\u0508\u0500\u0001\u0000\u0000\u0000\u0509\u00ab\u0001\u0000\u0000\u0000"+
		"\u050a\u0523\u0005\\\u0000\u0000\u050b\u0523\u0005]\u0000\u0000\u050c"+
		"\u0523\u0005a\u0000\u0000\u050d\u0523\u0005Z\u0000\u0000\u050e\u0523\u0005"+
		"[\u0000\u0000\u050f\u0510\u0005M\u0000\u0000\u0510\u0523\u0005M\u0000"+
		"\u0000\u0511\u0512\u0005L\u0000\u0000\u0512\u0513\u0005L\u0000\u0000\u0513"+
		"\u0523\u0005L\u0000\u0000\u0514\u0515\u0005L\u0000\u0000\u0515\u0523\u0005"+
		"L\u0000\u0000\u0516\u0523\u0005S\u0000\u0000\u0517\u0523\u0005T\u0000"+
		"\u0000\u0518\u0523\u0005L\u0000\u0000\u0519\u0523\u0005M\u0000\u0000\u051a"+
		"\u0523\u0005R\u0000\u0000\u051b\u0523\u0005U\u0000\u0000\u051c\u0523\u0005"+
		"^\u0000\u0000\u051d\u0523\u0005`\u0000\u0000\u051e\u0523\u0005_\u0000"+
		"\u0000\u051f\u0523\u0005V\u0000\u0000\u0520\u0523\u0005W\u0000\u0000\u0521"+
		"\u0523\u0005c\u0000\u0000\u0522\u050a\u0001\u0000\u0000\u0000\u0522\u050b"+
		"\u0001\u0000\u0000\u0000\u0522\u050c\u0001\u0000\u0000\u0000\u0522\u050d"+
		"\u0001\u0000\u0000\u0000\u0522\u050e\u0001\u0000\u0000\u0000\u0522\u050f"+
		"\u0001\u0000\u0000\u0000\u0522\u0511\u0001\u0000\u0000\u0000\u0522\u0514"+
		"\u0001\u0000\u0000\u0000\u0522\u0516\u0001\u0000\u0000\u0000\u0522\u0517"+
		"\u0001\u0000\u0000\u0000\u0522\u0518\u0001\u0000\u0000\u0000\u0522\u0519"+
		"\u0001\u0000\u0000\u0000\u0522\u051a\u0001\u0000\u0000\u0000\u0522\u051b"+
		"\u0001\u0000\u0000\u0000\u0522\u051c\u0001\u0000\u0000\u0000\u0522\u051d"+
		"\u0001\u0000\u0000\u0000\u0522\u051e\u0001\u0000\u0000\u0000\u0522\u051f"+
		"\u0001\u0000\u0000\u0000\u0522\u0520\u0001\u0000\u0000\u0000\u0522\u0521"+
		"\u0001\u0000\u0000\u0000\u0523\u00ad\u0001\u0000\u0000\u0000\u0524\u0525"+
		"\u0007\u0003\u0000\u0000\u0525\u00af\u0001\u0000\u0000\u0000\u0526\u0527"+
		"\u0006X\uffff\uffff\u0000\u0527\u0558\u0003\u00aaU\u0000\u0528\u0558\u0005"+
		"3\u0000\u0000\u0529\u052a\u0005B\u0000\u0000\u052a\u052b\u0003\u00b0X"+
		"\u0000\u052b\u052c\u0005C\u0000\u0000\u052c\u0558\u0001\u0000\u0000\u0000"+
		"\u052d\u0558\u0005+\u0000\u0000\u052e\u0558\u0005(\u0000\u0000\u052f\u0558"+
		"\u0003b1\u0000\u0530\u0558\u0003\u008eG\u0000\u0531\u0532\u00030\u0018"+
		"\u0000\u0532\u0533\u0005J\u0000\u0000\u0533\u0534\u0005\t\u0000\u0000"+
		"\u0534\u0558\u0001\u0000\u0000\u0000\u0535\u0539\u0003\u00d0h\u0000\u0536"+
		"\u053a\u0003\u00dcn\u0000\u0537\u0538\u0005+\u0000\u0000\u0538\u053a\u0003"+
		"\u00deo\u0000\u0539\u0536\u0001\u0000\u0000\u0000\u0539\u0537\u0001\u0000"+
		"\u0000\u0000\u053a\u0558\u0001\u0000\u0000\u0000\u053b\u053c\u0005\u001f"+
		"\u0000\u0000\u053c\u0558\u0003\u00c0`\u0000\u053d\u053e\u0005B\u0000\u0000"+
		"\u053e\u053f\u0003\u00d4j\u0000\u053f\u0540\u0005C\u0000\u0000\u0540\u0541"+
		"\u0003\u00b0X\f\u0541\u0558\u0001\u0000\u0000\u0000\u0542\u0543\u0003"+
		"\u00b4Z\u0000\u0543\u0544\u0003\u00b0X\n\u0544\u0558\u0001\u0000\u0000"+
		"\u0000\u0545\u0558\u0003\u00b6[\u0000\u0546\u0547\u0003\u00d4j\u0000\u0547"+
		"\u054d\u0005r\u0000\u0000\u0548\u054a\u0003\u00d8l\u0000\u0549\u0548\u0001"+
		"\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054b\u0001"+
		"\u0000\u0000\u0000\u054b\u054e\u0003\u008eG\u0000\u054c\u054e\u0005\u001f"+
		"\u0000\u0000\u054d\u0549\u0001\u0000\u0000\u0000\u054d\u054c\u0001\u0000"+
		"\u0000\u0000\u054e\u0558\u0001\u0000\u0000\u0000\u054f\u0550\u0003\u00be"+
		"_\u0000\u0550\u0552\u0005r\u0000\u0000\u0551\u0553\u0003\u00d8l\u0000"+
		"\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000\u0000"+
		"\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0555\u0005\u001f\u0000\u0000"+
		"\u0555\u0558\u0001\u0000\u0000\u0000\u0556\u0558\u00055\u0000\u0000\u0557"+
		"\u0526\u0001\u0000\u0000\u0000\u0557\u0528\u0001\u0000\u0000\u0000\u0557"+
		"\u0529\u0001\u0000\u0000\u0000\u0557\u052d\u0001\u0000\u0000\u0000\u0557"+
		"\u052e\u0001\u0000\u0000\u0000\u0557\u052f\u0001\u0000\u0000\u0000\u0557"+
		"\u0530\u0001\u0000\u0000\u0000\u0557\u0531\u0001\u0000\u0000\u0000\u0557"+
		"\u0535\u0001\u0000\u0000\u0000\u0557\u053b\u0001\u0000\u0000\u0000\u0557"+
		"\u053d\u0001\u0000\u0000\u0000\u0557\u0542\u0001\u0000\u0000\u0000\u0557"+
		"\u0545\u0001\u0000\u0000\u0000\u0557\u0546\u0001\u0000\u0000\u0000\u0557"+
		"\u054f\u0001\u0000\u0000\u0000\u0557\u0556\u0001\u0000\u0000\u0000\u0558"+
		"\u0588\u0001\u0000\u0000\u0000\u0559\u055a\n\t\u0000\u0000\u055a\u055b"+
		"\u0003\u00acV\u0000\u055b\u055c\u0003\u00b0X\n\u055c\u0587\u0001\u0000"+
		"\u0000\u0000\u055d\u055e\n\u0007\u0000\u0000\u055e\u055f\u0005P\u0000"+
		"\u0000\u055f\u0560\u0003\u00b0X\u0000\u0560\u0561\u0005Q\u0000\u0000\u0561"+
		"\u0562\u0003\u00b0X\u0007\u0562\u0587\u0001\u0000\u0000\u0000\u0563\u0564"+
		"\n\u0006\u0000\u0000\u0564\u0565\u0003\u00aeW\u0000\u0565\u0566\u0003"+
		"\u00b0X\u0006\u0566\u0587\u0001\u0000\u0000\u0000\u0567\u0568\n\u0018"+
		"\u0000\u0000\u0568\u0574\u0005J\u0000\u0000\u0569\u0575\u0003\u008eG\u0000"+
		"\u056a\u0575\u0003\u00aaU\u0000\u056b\u0575\u0005+\u0000\u0000\u056c\u056e"+
		"\u0005\u001f\u0000\u0000\u056d\u056f\u0003\u00d0h\u0000\u056e\u056d\u0001"+
		"\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056f\u0570\u0001"+
		"\u0000\u0000\u0000\u0570\u0575\u0003\u00c4b\u0000\u0571\u0572\u0005(\u0000"+
		"\u0000\u0572\u0575\u0003\u00dam\u0000\u0573\u0575\u0003\u00cae\u0000\u0574"+
		"\u0569\u0001\u0000\u0000\u0000\u0574\u056a\u0001\u0000\u0000\u0000\u0574"+
		"\u056b\u0001\u0000\u0000\u0000\u0574\u056c\u0001\u0000\u0000\u0000\u0574"+
		"\u0571\u0001\u0000\u0000\u0000\u0574\u0573\u0001\u0000\u0000\u0000\u0575"+
		"\u0587\u0001\u0000\u0000\u0000\u0576\u0577\n\u0017\u0000\u0000\u0577\u0578"+
		"\u0005F\u0000\u0000\u0578\u0579\u0003\u00b0X\u0000\u0579\u057a\u0005G"+
		"\u0000\u0000\u057a\u0587\u0001\u0000\u0000\u0000\u057b\u057c\n\u000b\u0000"+
		"\u0000\u057c\u0587\u0003\u00b2Y\u0000\u057d\u057e\n\b\u0000\u0000\u057e"+
		"\u057f\u0005\u001a\u0000\u0000\u057f\u0587\u0003\u00d4j\u0000\u0580\u0581"+
		"\n\u0004\u0000\u0000\u0581\u0583\u0005r\u0000\u0000\u0582\u0584\u0003"+
		"\u00d8l\u0000\u0583\u0582\u0001\u0000\u0000\u0000\u0583\u0584\u0001\u0000"+
		"\u0000\u0000\u0584\u0585\u0001\u0000\u0000\u0000\u0585\u0587\u0003\u008e"+
		"G\u0000\u0586\u0559\u0001\u0000\u0000\u0000\u0586\u055d\u0001\u0000\u0000"+
		"\u0000\u0586\u0563\u0001\u0000\u0000\u0000\u0586\u0567\u0001\u0000\u0000"+
		"\u0000\u0586\u0576\u0001\u0000\u0000\u0000\u0586\u057b\u0001\u0000\u0000"+
		"\u0000\u0586\u057d\u0001\u0000\u0000\u0000\u0586\u0580\u0001\u0000\u0000"+
		"\u0000\u0587\u058a\u0001\u0000\u0000\u0000\u0588\u0586\u0001\u0000\u0000"+
		"\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u00b1\u0001\u0000\u0000"+
		"\u0000\u058a\u0588\u0001\u0000\u0000\u0000\u058b\u058c\u0007\u0004\u0000"+
		"\u0000\u058c\u00b3\u0001\u0000\u0000\u0000\u058d\u058e\u0007\u0005\u0000"+
		"\u0000\u058e\u00b5\u0001\u0000\u0000\u0000\u058f\u0590\u0003\u00b8\\\u0000"+
		"\u0590\u0591\u0005q\u0000\u0000\u0591\u0592\u0003\u00ba]\u0000\u0592\u00b7"+
		"\u0001\u0000\u0000\u0000\u0593\u05a5\u0003\u008eG\u0000\u0594\u0596\u0005"+
		"B\u0000\u0000\u0595\u0597\u0003Z-\u0000\u0596\u0595\u0001\u0000\u0000"+
		"\u0000\u0596\u0597\u0001\u0000\u0000\u0000\u0597\u0598\u0001\u0000\u0000"+
		"\u0000\u0598\u05a5\u0005C\u0000\u0000\u0599\u059a\u0005B\u0000\u0000\u059a"+
		"\u059f\u0003\u008eG\u0000\u059b\u059c\u0005I\u0000\u0000\u059c\u059e\u0003"+
		"\u008eG\u0000\u059d\u059b\u0001\u0000\u0000\u0000\u059e\u05a1\u0001\u0000"+
		"\u0000\u0000\u059f\u059d\u0001\u0000\u0000\u0000\u059f\u05a0\u0001\u0000"+
		"\u0000\u0000\u05a0\u05a2\u0001\u0000\u0000\u0000\u05a1\u059f\u0001\u0000"+
		"\u0000\u0000\u05a2\u05a3\u0005C\u0000\u0000\u05a3\u05a5\u0001\u0000\u0000"+
		"\u0000\u05a4\u0593\u0001\u0000\u0000\u0000\u05a4\u0594\u0001\u0000\u0000"+
		"\u0000\u05a4\u0599\u0001\u0000\u0000\u0000\u05a5\u00b9\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a9\u0003\u00b0X\u0000\u05a7\u05a9\u0003\u0082A\u0000\u05a8"+
		"\u05a6\u0001\u0000\u0000\u0000\u05a8\u05a7\u0001\u0000\u0000\u0000\u05a9"+
		"\u00bb\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005B\u0000\u0000\u05ab\u05ac"+
		"\u0003\u00b0X\u0000\u05ac\u05ad\u0005C\u0000\u0000\u05ad\u05bd\u0001\u0000"+
		"\u0000\u0000\u05ae\u05bd\u0005+\u0000\u0000\u05af\u05bd\u0005(\u0000\u0000"+
		"\u05b0\u05bd\u0003b1\u0000\u05b1\u05bd\u0003\u008eG\u0000\u05b2\u05b3"+
		"\u00030\u0018\u0000\u05b3\u05b4\u0005J\u0000\u0000\u05b4\u05b5\u0005\t"+
		"\u0000\u0000\u05b5\u05bd\u0001\u0000\u0000\u0000\u05b6\u05ba\u0003\u00d0"+
		"h\u0000\u05b7\u05bb\u0003\u00dcn\u0000\u05b8\u05b9\u0005+\u0000\u0000"+
		"\u05b9\u05bb\u0003\u00deo\u0000\u05ba\u05b7\u0001\u0000\u0000\u0000\u05ba"+
		"\u05b8\u0001\u0000\u0000\u0000\u05bb\u05bd\u0001\u0000\u0000\u0000\u05bc"+
		"\u05aa\u0001\u0000\u0000\u0000\u05bc\u05ae\u0001\u0000\u0000\u0000\u05bc"+
		"\u05af\u0001\u0000\u0000\u0000\u05bc\u05b0\u0001\u0000\u0000\u0000\u05bc"+
		"\u05b1\u0001\u0000\u0000\u0000\u05bc\u05b2\u0001\u0000\u0000\u0000\u05bc"+
		"\u05b6\u0001\u0000\u0000\u0000\u05bd\u00bd\u0001\u0000\u0000\u0000\u05be"+
		"\u05bf\u0003R)\u0000\u05bf\u05c0\u0005J\u0000\u0000\u05c0\u05c2\u0001"+
		"\u0000\u0000\u0000\u05c1\u05be\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001"+
		"\u0000\u0000\u0000\u05c2\u05c6\u0001\u0000\u0000\u0000\u05c3\u05c5\u0003"+
		"h4\u0000\u05c4\u05c3\u0001\u0000\u0000\u0000\u05c5\u05c8\u0001\u0000\u0000"+
		"\u0000\u05c6\u05c4\u0001\u0000\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000"+
		"\u0000\u05c7\u05c9\u0001\u0000\u0000\u0000\u05c8\u05c6\u0001\u0000\u0000"+
		"\u0000\u05c9\u05cb\u0003\u008eG\u0000\u05ca\u05cc\u0003\u00d8l\u0000\u05cb"+
		"\u05ca\u0001\u0000\u0000\u0000\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc"+
		"\u00bf\u0001\u0000\u0000\u0000\u05cd\u05ce\u0003\u00d0h\u0000\u05ce\u05cf"+
		"\u0003\u00c2a\u0000\u05cf\u05d0\u0003\u00c8d\u0000\u05d0\u05d7\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d4\u0003\u00c2a\u0000\u05d2\u05d5\u0003\u00c6c\u0000"+
		"\u05d3\u05d5\u0003\u00c8d\u0000\u05d4\u05d2\u0001\u0000\u0000\u0000\u05d4"+
		"\u05d3\u0001\u0000\u0000\u0000\u05d5\u05d7\u0001\u0000\u0000\u0000\u05d6"+
		"\u05cd\u0001\u0000\u0000\u0000\u05d6\u05d1\u0001\u0000\u0000\u0000\u05d7"+
		"\u00c1\u0001\u0000\u0000\u0000\u05d8\u05da\u0003\u008eG\u0000\u05d9\u05db"+
		"\u0003\u00ccf\u0000\u05da\u05d9\u0001\u0000\u0000\u0000\u05da\u05db\u0001"+
		"\u0000\u0000\u0000\u05db\u05e3\u0001\u0000\u0000\u0000\u05dc\u05dd\u0005"+
		"J\u0000\u0000\u05dd\u05df\u0003\u008eG\u0000\u05de\u05e0\u0003\u00ccf"+
		"\u0000\u05df\u05de\u0001\u0000\u0000\u0000\u05df\u05e0\u0001\u0000\u0000"+
		"\u0000\u05e0\u05e2\u0001\u0000\u0000\u0000\u05e1\u05dc\u0001\u0000\u0000"+
		"\u0000\u05e2\u05e5\u0001\u0000\u0000\u0000\u05e3\u05e1\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4\u05e8\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e3\u0001\u0000\u0000\u0000\u05e6\u05e8\u0003\u00d6k\u0000"+
		"\u05e7\u05d8\u0001\u0000\u0000\u0000\u05e7\u05e6\u0001\u0000\u0000\u0000"+
		"\u05e8\u00c3\u0001\u0000\u0000\u0000\u05e9\u05eb\u0003\u008eG\u0000\u05ea"+
		"\u05ec\u0003\u00ceg\u0000\u05eb\u05ea\u0001\u0000\u0000\u0000\u05eb\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ec\u05ed\u0001\u0000\u0000\u0000\u05ed\u05ee"+
		"\u0003\u00c8d\u0000\u05ee\u00c5\u0001\u0000\u0000\u0000\u05ef\u060b\u0005"+
		"F\u0000\u0000\u05f0\u05f5\u0005G\u0000\u0000\u05f1\u05f2\u0005F\u0000"+
		"\u0000\u05f2\u05f4\u0005G\u0000\u0000\u05f3\u05f1\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f7\u0001\u0000\u0000\u0000\u05f5\u05f3\u0001\u0000\u0000\u0000"+
		"\u05f5\u05f6\u0001\u0000\u0000\u0000\u05f6\u05f8\u0001\u0000\u0000\u0000"+
		"\u05f7\u05f5\u0001\u0000\u0000\u0000\u05f8\u060c\u0003P(\u0000\u05f9\u05fa"+
		"\u0003\u00b0X\u0000\u05fa\u0601\u0005G\u0000\u0000\u05fb\u05fc\u0005F"+
		"\u0000\u0000\u05fc\u05fd\u0003\u00b0X\u0000\u05fd\u05fe\u0005G\u0000\u0000"+
		"\u05fe\u0600\u0001\u0000\u0000\u0000\u05ff\u05fb\u0001\u0000\u0000\u0000"+
		"\u0600\u0603\u0001\u0000\u0000\u0000\u0601\u05ff\u0001\u0000\u0000\u0000"+
		"\u0601\u0602\u0001\u0000\u0000\u0000\u0602\u0608\u0001\u0000\u0000\u0000"+
		"\u0603\u0601\u0001\u0000\u0000\u0000\u0604\u0605\u0005F\u0000\u0000\u0605"+
		"\u0607\u0005G\u0000\u0000\u0606\u0604\u0001\u0000\u0000\u0000\u0607\u060a"+
		"\u0001\u0000\u0000\u0000\u0608\u0606\u0001\u0000\u0000\u0000\u0608\u0609"+
		"\u0001\u0000\u0000\u0000\u0609\u060c\u0001\u0000\u0000\u0000\u060a\u0608"+
		"\u0001\u0000\u0000\u0000\u060b\u05f0\u0001\u0000\u0000\u0000\u060b\u05f9"+
		"\u0001\u0000\u0000\u0000\u060c\u00c7\u0001\u0000\u0000\u0000\u060d\u060f"+
		"\u0003\u00deo\u0000\u060e\u0610\u0003$\u0012\u0000\u060f\u060e\u0001\u0000"+
		"\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000\u0610\u00c9\u0001\u0000"+
		"\u0000\u0000\u0611\u0612\u0003\u00d0h\u0000\u0612\u0613\u0003\u00dcn\u0000"+
		"\u0613\u00cb\u0001\u0000\u0000\u0000\u0614\u0615\u0005M\u0000\u0000\u0615"+
		"\u0618\u0005L\u0000\u0000\u0616\u0618\u0003\u00d8l\u0000\u0617\u0614\u0001"+
		"\u0000\u0000\u0000\u0617\u0616\u0001\u0000\u0000\u0000\u0618\u00cd\u0001"+
		"\u0000\u0000\u0000\u0619\u061a\u0005M\u0000\u0000\u061a\u061d\u0005L\u0000"+
		"\u0000\u061b\u061d\u0003\u00d0h\u0000\u061c\u0619\u0001\u0000\u0000\u0000"+
		"\u061c\u061b\u0001\u0000\u0000\u0000\u061d\u00cf\u0001\u0000\u0000\u0000"+
		"\u061e\u061f\u0005M\u0000\u0000\u061f\u0620\u0003\u00d2i\u0000\u0620\u0621"+
		"\u0005L\u0000\u0000\u0621\u00d1\u0001\u0000\u0000\u0000\u0622\u0627\u0003"+
		"\u00d4j\u0000\u0623\u0624\u0005I\u0000\u0000\u0624\u0626\u0003\u00d4j"+
		"\u0000\u0625\u0623\u0001\u0000\u0000\u0000\u0626\u0629\u0001\u0000\u0000"+
		"\u0000\u0627\u0625\u0001\u0000\u0000\u0000\u0627\u0628\u0001\u0000\u0000"+
		"\u0000\u0628\u00d3\u0001\u0000\u0000\u0000\u0629\u0627\u0001\u0000\u0000"+
		"\u0000\u062a\u062c\u0003h4\u0000\u062b\u062a\u0001\u0000\u0000\u0000\u062b"+
		"\u062c\u0001\u0000\u0000\u0000\u062c\u062f\u0001\u0000\u0000\u0000\u062d"+
		"\u0630\u0003R)\u0000\u062e\u0630\u0003\u00d6k\u0000\u062f\u062d\u0001"+
		"\u0000\u0000\u0000\u062f\u062e\u0001\u0000\u0000\u0000\u0630\u0635\u0001"+
		"\u0000\u0000\u0000\u0631\u0632\u0005F\u0000\u0000\u0632\u0634\u0005G\u0000"+
		"\u0000\u0633\u0631\u0001\u0000\u0000\u0000\u0634\u0637\u0001\u0000\u0000"+
		"\u0000\u0635\u0633\u0001\u0000\u0000\u0000\u0635\u0636\u0001\u0000\u0000"+
		"\u0000\u0636\u00d5\u0001\u0000\u0000\u0000\u0637\u0635\u0001\u0000\u0000"+
		"\u0000\u0638\u0639\u0007\u0006\u0000\u0000\u0639\u00d7\u0001\u0000\u0000"+
		"\u0000\u063a\u063b\u0005M\u0000\u0000\u063b\u0640\u0003T*\u0000\u063c"+
		"\u063d\u0005I\u0000\u0000\u063d\u063f\u0003T*\u0000\u063e\u063c\u0001"+
		"\u0000\u0000\u0000\u063f\u0642\u0001\u0000\u0000\u0000\u0640\u063e\u0001"+
		"\u0000\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000\u0641\u0643\u0001"+
		"\u0000\u0000\u0000\u0642\u0640\u0001\u0000\u0000\u0000\u0643\u0644\u0005"+
		"L\u0000\u0000\u0644\u00d9\u0001\u0000\u0000\u0000\u0645\u064c\u0003\u00de"+
		"o\u0000\u0646\u0647\u0005J\u0000\u0000\u0647\u0649\u0003\u008eG\u0000"+
		"\u0648\u064a\u0003\u00deo\u0000\u0649\u0648\u0001\u0000\u0000\u0000\u0649"+
		"\u064a\u0001\u0000\u0000\u0000\u064a\u064c\u0001\u0000\u0000\u0000\u064b"+
		"\u0645\u0001\u0000\u0000\u0000\u064b\u0646\u0001\u0000\u0000\u0000\u064c"+
		"\u00db\u0001\u0000\u0000\u0000\u064d\u064e\u0005(\u0000\u0000\u064e\u0653"+
		"\u0003\u00dam\u0000\u064f\u0650\u0003\u008eG\u0000\u0650\u0651\u0003\u00de"+
		"o\u0000\u0651\u0653\u0001\u0000\u0000\u0000\u0652\u064d\u0001\u0000\u0000"+
		"\u0000\u0652\u064f\u0001\u0000\u0000\u0000\u0653\u00dd\u0001\u0000\u0000"+
		"\u0000\u0654\u0656\u0005B\u0000\u0000\u0655\u0657\u0003\u00a8T\u0000\u0656"+
		"\u0655\u0001\u0000\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657"+
		"\u0658\u0001\u0000\u0000\u0000\u0658\u0659\u0005C\u0000\u0000\u0659\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e2\u00e6\u00ea\u00f2\u00f9\u0109\u0114"+
		"\u0117\u011a\u0120\u0124\u0127\u012c\u0132\u013a\u0143\u0148\u014f\u0156"+
		"\u0159\u0160\u016b\u016f\u0174\u0178\u017c\u0186\u018e\u0194\u019b\u01a2"+
		"\u01a6\u01a9\u01ac\u01af\u01b6\u01bc\u01c1\u01c4\u01ca\u01d0\u01d4\u01dc"+
		"\u01e0\u01e6\u01ea\u01ee\u01f4\u01f8\u0203\u020c\u0211\u0214\u0218\u021c"+
		"\u0228\u0233\u0238\u0241\u0249\u0253\u025c\u0264\u0269\u0271\u0276\u027c"+
		"\u0284\u0289\u028d\u0295\u029f\u02a5\u02ac\u02b1\u02b9\u02bd\u02bf\u02c5"+
		"\u02ca\u02ce\u02d5\u02d7\u02de\u02e3\u02e6\u02eb\u02ef\u02f4\u02f8\u02fd"+
		"\u0306\u0312\u031c\u0327\u032a\u0331\u033b\u0343\u0346\u0349\u034c\u0357"+
		"\u035b\u0360\u0365\u036d\u0371\u0375\u0379\u037b\u037f\u0385\u038d\u0391"+
		"\u0395\u039a\u039e\u03a2\u03a5\u03a8\u03ab\u03b1\u03b3\u03b8\u03bc\u03c0"+
		"\u03c4\u03c6\u03cb\u03d4\u03d9\u03dc\u03e4\u03ea\u03f2\u03f7\u03f9\u0401"+
		"\u0407\u0414\u0417\u041a\u0422\u0426\u042e\u0434\u0438\u0440\u0449\u044e"+
		"\u0459\u0462\u046f\u0476\u047f\u0488\u048e\u0499\u049e\u04a3\u04a9\u04ad"+
		"\u04b1\u04b5\u04b7\u04bb\u04c0\u04cb\u04d0\u04d3\u04db\u04e3\u04e6\u04eb"+
		"\u04ee\u04f3\u04f6\u04fb\u04fe\u0503\u0506\u0508\u0522\u0539\u0549\u054d"+
		"\u0552\u0557\u056e\u0574\u0583\u0586\u0588\u0596\u059f\u05a4\u05a8\u05ba"+
		"\u05bc\u05c1\u05c6\u05cb\u05d4\u05d6\u05da\u05df\u05e3\u05e7\u05eb\u05f5"+
		"\u0601\u0608\u060b\u060f\u0617\u061c\u0627\u062b\u062f\u0635\u0640\u0649"+
		"\u064b\u0652\u0656";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
