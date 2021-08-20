package research.diffsearch.tree;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.util.ProgrammingLanguage;

/**
 * @author Paul Bredl
 */
public class TreeFactory {

    private static final Logger logger = LoggerFactory.getLogger(TreeFactory.class);

    public static AbstractTree getAbstractTree(String candidate, ProgrammingLanguage language) {
        AbstractTree changeTree;
        switch (language) {
            case JAVA:
                changeTree = new JavaTree(candidate);
                break;
            case JAVASCRIPT:
                changeTree = new JavascriptTree(candidate);
                break;
            default:
                changeTree = new Python3Tree(candidate);
        }
        return changeTree;
    }

    public static SerializableTreeNode getTreeFromCodeChange(CodeChange change, ProgrammingLanguage language) {
        var gson = new Gson();

        SerializableTreeNode result;
        if (change.getJSONParseTree() == null) {
            logger.debug("Generating new parse tree...");
            var parseTree = getAbstractTree(change.getFullChangeString(), language).getParseTree();
            var sTree = SerializableTreeNode.fromTree(parseTree, language);
            change.setJSONParseTree(gson.toJson(sTree));

            result = sTree;
        } else {

            result = gson.fromJson(change.getJSONParseTree(), SerializableTreeNode.class);
        }

        return result;
    }
}
