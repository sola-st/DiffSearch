package research.diffsearch.tree;

import ProgrammingLanguage.Java.JavaLexer;
import ProgrammingLanguage.Java.JavaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/* Antlr4 command to create java classes using the terminal with Linux:
java -Xmx500M -cp /usr/local/lib/antlr-4.7.1-complete.jar org.antlr.v4.Tool -Dlanguage=Java JavaLexer.g4 JavaParser.g4
*/

@SuppressWarnings("ALL")
public class Java_Tree {
    public String change_string;
    private JavaLexer lexer;
    private CommonTokenStream tokens;
    private JavaParser parser;
    private ParseTree parsetree;
    private ParserRuleContext ctx;
    public boolean error;
    public int[] features;

    public Java_Tree(String change) {
        error = false;
        change_string = change;
        try {
            lexer = new JavaLexer(CharStreams.fromString(change));
        } catch (RecognitionException e) {
            error = true;
            System.out.println("LEXER ERROR " + change);
        }
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                error = true;
            }
        });

        try {
            tokens = new CommonTokenStream(lexer);
            parser = new JavaParser(tokens);
        } catch (RecognitionException e) {
            error = true;
            System.out.println("NEW PARSER ERROR " + change);
        }

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                error = true;
            }
        });

        if (parser.getNumberOfSyntaxErrors() > 0)
            error = true;

        try {
            parsetree = parser.program();
        } catch (RecognitionException e) {
            error = true;
            System.out.println("PARSER ERROR " + change);
        }

        features = new int[Integer.MAX_VALUE / 1048576]; //4096
    }

    public String get_change_string() {
        return change_string;
    }

    String get_tree_string() {
        return parsetree.toStringTree(parser);
    }

    JavaLexer get_lexer() {
        return lexer;
    }

    CommonTokenStream get_tokens() {
        return tokens;
    }

    public JavaParser get_parser() {
        return parser;
    }

    public ParseTree get_parsetree() {
        return parsetree;
    }

    ParserRuleContext get_ast() {
        return ctx;
    }

    public boolean isError() {
        return error;
    }

    void printAST(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = JavaParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName + " -> " + ctx.getText());
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                printAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }

    private boolean ignoringWrappers = true;

    public void setIgnoringWrappers(boolean ignoringWrappers) {
        this.ignoringWrappers = ignoringWrappers;
    }

    public void print(RuleContext ctx) {
        explore(ctx, 0);
    }

    private void explore(RuleContext ctx, int indentation) {
        boolean toBeIgnored = ignoringWrappers
                              && ctx.getChildCount() == 1
                              && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = JavaParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName);
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext) element, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}
