package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;

/**
 * This feature extractor uses another {@link AbstractRecursiveFeatureExtractor} and extracts features
 * using this extractor but divided in the old and new part of the code change.
 *
 * @author Paul Bredl
 */
public class DividedFeatureExtractor implements FeatureExtractor {

    private final AbstractRecursiveFeatureExtractor baseExtractor;

    public DividedFeatureExtractor(AbstractRecursiveFeatureExtractor baseExtractor) {
        this.baseExtractor = baseExtractor;
    }

    @Override
    public void extractFeatures(Tree tree, FeatureVector.Section section, boolean isQuery) {

        if (tree.getChildCount() == 3) {
            baseExtractor.extractFeaturesRecursive(tree.getChild(0),
                    section.getSubsection(baseExtractor.getName() + " [old]",
                            0, baseExtractor.getFeatureVectorSectionLength()),
                    isQuery);

            baseExtractor.extractFeaturesRecursive(tree.getChild(2),
                    section.getSubsection(baseExtractor.getName() + "[new]",
                            baseExtractor.getFeatureVectorSectionLength(),
                            baseExtractor.getFeatureVectorSectionLength()),
                    isQuery);
        } else {
            baseExtractor.extractFeaturesRecursive(tree, section, isQuery);
        }
    }

    @Override
    public int getFeatureVectorSectionLength() {
        return baseExtractor.getFeatureVectorSectionLength() * 2;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return baseExtractor.getProgrammingLanguage();
    }

    @Override
    public String getName() {
        return baseExtractor.getName();
    }
}
