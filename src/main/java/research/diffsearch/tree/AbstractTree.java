package research.diffsearch.tree;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Abstract super class for all tree classes.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public abstract class AbstractTree {
    protected String changeString;
    protected boolean error = false;
    protected CommonTokenStream tokens;
    protected ParseTree parsetree;
    protected static final Logger logger = LoggerFactory.getLogger(AbstractTree.class);

    /**
     * Creates a new abstract tree, with most fields not initialized.
     * Use the {@link #initializeSafe(Supplier)}-methods to catch exceptions and log them.
     * Use {@link #initializeErrorListeners()}-methods to initialize error listeners for parser and lexer.
     *
     * @param change the code change.
     */
    protected AbstractTree(String change) {
        changeString = change;
    }

    public abstract Parser getParser();

    public abstract Lexer getLexer();

    public abstract String[] getRuleNames();

    /**
     * @return the code change as string, structured as <i>oldCode</i> --> <i>newCode</i>.
     */
    public String getChangeString() {
        return changeString;
    }

    /**
     * @return a string representation of the parse tree.
     */
    public String getTreeString() {
        return Trees.toStringTree(getParseTree(), getParser());
    }

    protected CommonTokenStream getTokens() {
        return tokens;
    }

    public ParseTree getParseTree() {
        return parsetree;
    }

    /**
     * @return true, if an exception occurred during the parsing or initialization of the tree.
     */
    public boolean isError() {
        return error;
    }

    public void print(RuleContext ctx, boolean ignoringWrappers) {
        explore(ctx, 0, ignoringWrappers);
    }

    private void explore(RuleContext ctx, int indentation, boolean ignoringWrappers) {
        boolean toBeIgnored = ignoringWrappers
                && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = getRuleNames()[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName);
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext) element, indentation + (toBeIgnored ? 0 : 1), ignoringWrappers);
            }
        }
    }

    protected <T> T initializeLexer(Function<CodePointCharStream, T> initializer) {
        return initializeSafe(() -> initializer.apply(CharStreams.fromString(getChangeString())));
    }

    protected <T> T initializeTokens(Function<Lexer, T> initializer) {
        if (getLexer() == null) {
            return null;
        }
        return initializeSafe(() -> initializer.apply(getLexer()));
    }

    protected <T> T initializeParser(Function<CommonTokenStream, T> initializer) {
        if (getTokens() == null) {
            return null;
        }
        return initializeSafe(() -> initializer.apply(getTokens()));
    }

    protected <T> T initializeSafe(Supplier<T> initializer) {
        try {
            return initializer.get();
        } catch (RecognitionException e) {
            error = true;
            logger.error("LEXER ERROR " + getChangeString(), e);
        }
        return null;
    }

    protected void initializeErrorListeners() {
        var lexer = getLexer();
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                error = true;
            }
        });

        var parser = getParser();
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                error = true;
            }
        });

        if (parser.getNumberOfSyntaxErrors() > 0) {
            error = true;
        }

    }
}
