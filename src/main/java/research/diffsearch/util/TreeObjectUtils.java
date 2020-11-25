package research.diffsearch.util;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import research.diffsearch.Java_Tree;
import research.diffsearch.Javascript_Tree;
import research.diffsearch.Python3_Tree;

public class TreeObjectUtils {

    public static Object getChangeTree(String candidate, ProgrammingLanguage language) {
        Object changeTree;
        switch (language) {
            case JAVA:
                changeTree = new Java_Tree(candidate);
                break;
            case JAVASCRIPT:
                changeTree = new Javascript_Tree(candidate);
                break;
            default:
                changeTree = new Python3_Tree(candidate);
        }
        return changeTree;
    }

    public static Parser getParser(Object changeTree, ProgrammingLanguage language) {
        Parser parser;
        switch (language) {
            case JAVA:
                parser = ((Java_Tree) changeTree).get_parser();
                break;
            case JAVASCRIPT:
                parser = ((Javascript_Tree) changeTree).get_parser();
                break;
            default:
                parser = ((Python3_Tree) changeTree).get_parser();
        }
        return parser;
    }

    public static ParseTree getParseTree(Object queryTree, ProgrammingLanguage language) {
        ParseTree parseTree;
        switch (language) {
            case JAVA:
                parseTree = ((Java_Tree) queryTree).get_parsetree();
                break;
            case JAVASCRIPT:
                parseTree = ((Javascript_Tree) queryTree).get_parsetree();
                break;
            default:
                parseTree = ((Python3_Tree) queryTree).get_parsetree();
        }
        return parseTree;
    }

    public static boolean isError(Object tree, ProgrammingLanguage language) {
        boolean error;
        switch (language) {
            case JAVA:
                error = ((Java_Tree) tree).isError();
                break;
            case JAVASCRIPT:
                error = ((Javascript_Tree) tree).isError();
                break;
            default:
                error = ((Python3_Tree) tree).isError();
        }
        return error;
    }
}
