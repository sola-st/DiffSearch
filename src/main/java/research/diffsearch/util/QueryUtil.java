package research.diffsearch.util;

import research.diffsearch.Config;
import research.diffsearch.tree.TreeObjectUtils;
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
        var queryTree = TreeObjectUtils.getChangeTree(query, language);
        var parseTree = TreeObjectUtils.getParseTree(queryTree, language);
        var parser = TreeObjectUtils.getParser(queryTree, language);
        var error = TreeObjectUtils.isError(queryTree, language);

        return !(TreeUtils.nodeCount(parseTree, Arrays.asList(parser.getRuleNames()), 0) <= 5 || error);
    }
}
