package research.diffsearch.tree;

import ProgrammingLanguage.JavaScript.ECMAScriptLexer;
import ProgrammingLanguage.JavaScript.ECMAScriptParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/* Antlr4 command to create java classes using the terminal with Linux:
java -Xmx500M -cp /usr/local/lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -Dlanguage=Java ECMAScript.g4
*/

public class JavascriptTree extends AbstractTree {
    private final ECMAScriptLexer lexer;
    private final ECMAScriptParser parser;
    private boolean syntax_error = false;

    public JavascriptTree(String change) {
        super(change);

        lexer = initializeLexer(ECMAScriptLexer::new);
        JavascriptTree.MyErrorListener errorListener = new JavascriptTree.MyErrorListener();
        lexer.addErrorListener(errorListener);
        lexer.addErrorListener(errorListener);
        if (errorListener.hasSyntaxError){
            syntax_error = true;
            parser = null;
            return;
        }

        tokens = initializeTokens(CommonTokenStream::new);
        parser = initializeParser(ECMAScriptParser::new);

        initializeErrorListeners();
        parsetree = initializeSafe(parser::program);
    }

    private class MyErrorListener extends BaseErrorListener {
        boolean hasSyntaxError = false;

        @Override
        public void syntaxError(Recognizer r, Object symbol, int line, int pos, String msg, RecognitionException e) {
            hasSyntaxError = true;
        }
    }

    public JavascriptTree(String codeChange, ParseTree parseTree) {
        super(codeChange);

        lexer = initializeLexer(ECMAScriptLexer::new);
        tokens = initializeTokens(CommonTokenStream::new);
        parser = initializeParser(ECMAScriptParser::new);

        initializeErrorListeners();
        parsetree = parseTree;
    }

    @Override
    public ECMAScriptLexer getLexer() {
        return lexer;
    }

    @Override
    public Parser getParser() {
        return parser;
    }

    @Override
    public String[] getRuleNames() {
        return ECMAScriptParser.ruleNames;
    }
}
