package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.tree.TreeObjectUtils;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractRecursiveFeatureExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;
    private final boolean isQuery;

    public AbstractRecursiveFeatureExtractor(ProgrammingLanguage language, int featureVectorLength, boolean isQuery) {
        programmingLanguage = language;
        this.featureVectorLength = featureVectorLength;
        this.isQuery = isQuery;
    }

    public int getFeatureVectorIndex(int startIndex, int hashValue, double vectorLength) {
        return Math.abs((int) (startIndex + (hashValue % vectorLength)));
    }

    public abstract void extractFeaturesRecursive(Tree t, int[] completeFeatureVector,
                                         int startPosition, List<String> ruleNames, int depth);

    @Override
    public int[] extractFeatures(String codeChange, int[] completeFeatureVector, int startPosition) {
        Object queryTree = TreeObjectUtils.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = TreeObjectUtils.getParser(queryTree, getProgrammingLanguage()).getRuleNames();
        ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, getProgrammingLanguage());

        extractFeaturesRecursive(parseTree, completeFeatureVector, startPosition, Arrays.asList(ruleNames), 0);
        return completeFeatureVector;
    }

    @Override
    public int getFeatureVectorLength() {
        return featureVectorLength;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public boolean isQuery() {
        return isQuery;
    }

    protected boolean isQueryKeyword(String nodeText) {
        /*var keywords = List.of("ID", "EXPR", "binOP", "upOP", "OP", "LT", "<...>");
        return keywords
                .stream()
                .anyMatch(nodeText::startsWith);*/
        return false;
    }
}
