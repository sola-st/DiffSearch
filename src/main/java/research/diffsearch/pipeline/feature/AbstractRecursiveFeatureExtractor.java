package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.TreeFactory;
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

    public int getFeatureVectorIndex(int startIndex, int hashValue, long vectorLength) {
        return (int) (startIndex + Math.abs(hashValue % vectorLength));
    }

    public abstract void extractFeaturesRecursive(Tree t, FeatureVector completeFeatureVector,
                                                  int startPosition, List<String> ruleNames, int depth);

    @Override
    public FeatureVector extractFeatures(String codeChange, FeatureVector completeFeatureVector, int startPosition) {
        AbstractTree queryTree = TreeFactory.getChangeTree(codeChange, getProgrammingLanguage());
        String[] ruleNames = queryTree.getParser().getRuleNames();

        extractFeaturesRecursive(queryTree.getParseTree(), completeFeatureVector, startPosition,
                Arrays.asList(ruleNames), 0);
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
        var keywords = List.of("ID", "EXPR", "binOP", "upOP", "OP", "LT", "<...>");
        return keywords
                .stream()
                .anyMatch(nodeText::startsWith);
    }
}
