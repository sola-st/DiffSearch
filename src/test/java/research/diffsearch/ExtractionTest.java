package research.diffsearch;

import com.google.gson.Gson;
import junit.framework.TestCase;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.tree.SerializableTreeNode;

import static research.diffsearch.tree.TreeFactory.getAbstractTree;
import static research.diffsearch.util.FilePathUtils.*;
import static research.diffsearch.util.ProgrammingLanguage.JAVA;

public class ExtractionTest extends TestCase {

    public void testExtraction() {
        var ccIterator = getAllLines(getChangesJsonFilePath(JAVA)).iterator();
        var treesIterator = getAllLines(getTreesFilePath(JAVA)).iterator();

        var gson = new Gson();
        var index = 0;
        while (ccIterator.hasNext() && treesIterator.hasNext()) {
            var codeChange = gson.fromJson(ccIterator.next(), CodeChange.class);
            var changeTree = gson.fromJson(treesIterator.next(), SerializableTreeNode.class);

            var javaTree = getAbstractTree(codeChange.getFullChangeString().replaceAll("\n", " "), JAVA);
            var parsedTree = SerializableTreeNode.fromTree(javaTree.getParseTree(),
                    JAVA.getRuleNames());

            assertEquals("Parse tree and tree do not match at " + index,
                    changeTree.toTreeString().replaceAll("\\s+", " "),
                    parsedTree.toTreeString().replaceAll("\\s+", " "));

            index++;
        }
    }
}
