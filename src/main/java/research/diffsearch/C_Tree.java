package research.diffsearch;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class C_Tree {
    public String change_string;
    private  CLexer lexer;
    private  CommonTokenStream tokens;
    private  CParser parser;
    private  ParseTree parsetree;
    private ParserRuleContext ctx;
    public int leaves_number;

    C_Tree(String change){
        change_string = change;
        lexer = new CLexer(CharStreams.fromString(change));
        tokens = new CommonTokenStream(lexer);
        parser = new CParser(tokens);
        parsetree = parser.primaryExpression();
        //ctx = parser.primaryExpression();
    }

    String get_change_string() {
        return change_string;
    }

    String get_tree_string() {
        return parsetree.toStringTree(parser);
    }

    CLexer get_lexer() {
        return lexer;
    }

    CommonTokenStream get_tokens() {
        return tokens;
    }

    CParser get_parser() {
        return parser;
    }

    ParseTree get_parsetree() {
        return parsetree;
    }



}

