package research.diffsearch.tree;

import com.google.gson.Gson;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.util.ProgrammingLanguage;

/**
 * @author Paul Bredl
 */
public class TreeFactory {

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
            var parseTree = getAbstractTree(change.getFullChangeString(), language).getParseTree();
            var sTree = SerializableTreeNode.fromTree(parseTree, language);
            change.setJSONParseTree(gson.toJson(sTree));

            result = sTree;
        } else {

            result = gson.fromJson(change.getJSONParseTree(), SerializableTreeNode.class);
        }

        change.setJSONParseTree(null);
        change.setCodeChangeNew(null);
        change.setCodeChangeOld(null);
        change.setFileNameOld(null);
        change.setFileNameNew(null);
        change.setProjectName(null);
        change.setCommit(null);
        return result;
    }
}
