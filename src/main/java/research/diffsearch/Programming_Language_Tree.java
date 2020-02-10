package research.diffsearch;

import grammar.Python3Lexer;
import grammar.Python3Parser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

//TODO
public abstract class Programming_Language_Tree {
    boolean error;
    public int [] features;
    public String change_string;

    abstract String get_tree_string();


    abstract  CommonTokenStream get_tokens();

    abstract  ParserRuleContext get_ast();

    abstract  boolean isError();

    abstract String get_change_string();

}
