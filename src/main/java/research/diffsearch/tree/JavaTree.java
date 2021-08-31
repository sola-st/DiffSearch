package research.diffsearch.tree;

import ProgrammingLanguage.Java.JavaLexer;
import ProgrammingLanguage.Java.JavaParser;
import org.antlr.v4.runtime.*;

import java.util.List;

/* Antlr4 command to create java classes using the terminal with Linux:
java -Xmx500M -cp /usr/local/lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -Dlanguage=Java JavaLexer.g4 JavaParser.g4
*/
public class JavaTree extends AbstractTree {
    private final JavaLexer lexer;
    private final JavaParser parser;
    private boolean syntax_error = false;

    public JavaTree(String change) {
        super(change);

        lexer = initializeLexer(JavaLexer::new);
        MyErrorListener errorListener = new MyErrorListener();
        lexer.addErrorListener(errorListener);
        lexer.addErrorListener(errorListener);
        if (errorListener.hasSyntaxError){
            syntax_error = true;
            //lexer = null;
            parser = null;
            return;
        }

        tokens = initializeTokens(CommonTokenStream::new);
        parser = initializeParser(JavaParser::new);
        parser.setProfile(true);

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
    public JavaLexer getLexer() {
        return lexer;
    }

    @Override
    public JavaParser getParser() {
        return parser;
    }

    @Override
    public String[] getRuleNames() {
        return JavaParser.ruleNames;
    }


}
