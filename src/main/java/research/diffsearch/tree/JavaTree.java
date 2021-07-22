package research.diffsearch.tree;

import ProgrammingLanguage.Java.JavaLexer;
import ProgrammingLanguage.Java.JavaParser;
import org.antlr.v4.runtime.CommonTokenStream;

/* Antlr4 command to create java classes using the terminal with Linux:
java -Xmx500M -cp /usr/local/lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -Dlanguage=Java JavaLexer.g4 JavaParser.g4
*/
public class JavaTree extends AbstractTree {
    private final JavaLexer lexer;
    private final JavaParser parser;

    public JavaTree(String change) {
        super(change);

        lexer = initializeLexer(JavaLexer::new);
        tokens = initializeTokens(CommonTokenStream::new);
        parser = initializeParser(JavaParser::new);

        initializeErrorListeners();

        parsetree = initializeSafe(parser::program);
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
