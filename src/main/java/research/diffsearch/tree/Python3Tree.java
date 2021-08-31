package research.diffsearch.tree;

import ProgrammingLanguage.Python.Python3Lexer;
import ProgrammingLanguage.Python.Python3Parser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/* Antlr4 command to create java classes using the terminal with Linux:
java -Xmx500M -cp /usr/local/lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -Dlanguage=Java Python3.g4
*/

/* Python3 AST class with some useful methods.*/
public class Python3Tree extends AbstractTree {
    private final Python3Lexer lexer;
    private final Python3Parser parser;
    boolean syntax_error = false;

    public Python3Tree(String change) {
        super(change);
        lexer = initializeLexer(Python3Lexer::new);
        Python3Tree.MyErrorListener errorListener = new Python3Tree.MyErrorListener();
        lexer.addErrorListener(errorListener);
        lexer.addErrorListener(errorListener);
        if (errorListener.hasSyntaxError){
            syntax_error = true;
            parser = null;
            return;
        }

        tokens = initializeTokens(CommonTokenStream::new);
        parser = initializeParser(Python3Parser::new);

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

    @Override
    public Python3Lexer getLexer() {
        return lexer;
    }

    @Override
    public Python3Parser getParser() {
        return parser;
    }

    @Override
    public String[] getRuleNames() {
        return Python3Parser.ruleNames;
    }

}
