package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.Objects;

/**
 * Represents any parse-tree based feature extractor that can be run recursive on
 * the parse tree.
 *
 * @author Paul Bredl
 */
public abstract class AbstractRecursiveFeatureExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;

    public AbstractRecursiveFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        programmingLanguage = language;
        this.featureVectorLength = featureVectorLength;
    }

    public static int getFeatureVectorIndex(int startIndex, int hashValue, long vectorLength) {
        return (int) (startIndex + Math.abs(hashValue % vectorLength));
    }

    public abstract void extractFeaturesRecursive(Tree t, FeatureVector.Section section,
                                                  boolean isQuery);

    @Override
    public void extractFeatures(Tree changeTree, FeatureVector.Section section, boolean isQuery) {
        extractFeaturesRecursive(changeTree, section, isQuery);
    }

    @Override
    public int getFeatureVectorSectionLength() {
        return featureVectorLength;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    protected static boolean isNotBlacklisted(String nodeText) {
        return !Objects.equals("querySnippet", nodeText);
    }
}
