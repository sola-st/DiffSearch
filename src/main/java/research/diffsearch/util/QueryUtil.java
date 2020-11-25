package research.diffsearch.util;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;

public class QueryUtil {
    public static String formatQuery(String result) {
        return result.replaceAll("\r","").replaceAll("\n","");
    }

    public static boolean checkIfQueryIsValid(Object queryTree, ProgrammingLanguage language) {
        var parseTree = TreeObjectUtils.getParseTree(queryTree, language);
        var parser = TreeObjectUtils.getParser(queryTree, language);
        var error = TreeObjectUtils.isError(queryTree, language);

        return !(TreeUtils.nodeCount(parseTree, Arrays.asList(parser.getRuleNames()), 0) <= 5 || error);
    }
}
