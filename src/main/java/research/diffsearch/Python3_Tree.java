package research.diffsearch;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Python3_Tree {
    public String change_string;
    private  Python3Lexer lexer;
    private  CommonTokenStream tokens;
    private  Python3Parser parser;
    private  ParseTree parsetree;
    private  ParserRuleContext ctx;
    public int leaves_number;
    public int [] features;

    Python3_Tree(String change){
        change_string = change;
        lexer = new Python3Lexer(CharStreams.fromString(change));
        tokens = new CommonTokenStream(lexer);
        parser = new Python3Parser(tokens);
        parsetree = parser.program();
        features = new int[Integer.MAX_VALUE/1048576];
    }

    String get_change_string() {
        return change_string;
    }

    String get_tree_string() {
        return parsetree.toStringTree(parser);
    }

    Python3Lexer get_lexer() {
        return lexer;
    }

    CommonTokenStream get_tokens() {
        return tokens;
    }

    Python3Parser get_parser() {
        return parser;
    }

    ParseTree get_parsetree() {
        return parsetree;
    }

    ParserRuleContext get_ast() {return ctx;}


    void printAST(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = Python3Parser.ruleNames[ctx.getRuleIndex()];
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
            String ruleName = Python3Parser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName);
        }
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext)element, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }


}
