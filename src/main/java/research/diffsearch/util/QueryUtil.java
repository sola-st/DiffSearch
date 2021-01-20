package research.diffsearch.util;

import research.diffsearch.Config;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.tree.TreeUtils;

import java.util.Arrays;

public class QueryUtil {
    public static String formatQuery(String result) {
        return result.replaceAll("\r","").replaceAll("\n","");
    }

    public static boolean checkIfQueryIsValid(String query) {
        return checkIfQueryIsValid(query, Config.PROGRAMMING_LANGUAGE);
    }

    public static boolean checkIfQueryIsValid(String query, ProgrammingLanguage language) {
        var queryTree = TreeFactory.getChangeTree(query, language);
        var parseTree = queryTree.getParseTree();
        var parser = queryTree.getParser();

        return !(TreeUtils.nodeCount(parseTree, Arrays.asList(parser.getRuleNames()), 0) <= 5 || queryTree.isError());
    }
}
