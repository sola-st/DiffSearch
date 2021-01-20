package research.diffsearch.tree;

import ProgrammingLanguage.JavaScript.ECMAScriptLexer;
import ProgrammingLanguage.JavaScript.ECMAScriptParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;

/* Antlr4 command to create java classes using the terminal with Linux:
java -Xmx500M -cp /usr/local/lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -Dlanguage=Java ECMAScript.g4
*/

public class JavascriptTree extends AbstractTree {
    private final ECMAScriptLexer lexer;
    private final ECMAScriptParser parser;

    public JavascriptTree(String change) {
        super(change);

        lexer = initializeLexer(ECMAScriptLexer::new);
        tokens = initializeTokens(CommonTokenStream::new);
        parser = initializeParser(ECMAScriptParser::new);

        initializeErrorListeners();

        parsetree = initializeSafe(parser::program);
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
