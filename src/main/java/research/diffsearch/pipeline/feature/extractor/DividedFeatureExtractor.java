package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.tree.AbstractTree;
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
    public void extractFeatures(AbstractTree queryTree, FeatureVector.Section section, boolean isQuery) {

        String[] ruleNames = queryTree.getParser().getRuleNames();
        Tree parseTree = queryTree.getParseTree();

        if (parseTree.getChildCount() == 3) {
            baseExtractor.extractFeaturesRecursive(parseTree.getChild(0),
                    section.getSubsection(baseExtractor.getName() + " [old]",
                            0, baseExtractor.getFeatureVectorSectionLength()),
                    isQuery);

            baseExtractor.extractFeaturesRecursive(parseTree.getChild(2),
                    section.getSubsection(baseExtractor.getName() + "[new]",
                            baseExtractor.getFeatureVectorSectionLength(),
                            baseExtractor.getFeatureVectorSectionLength()),
                    isQuery);
        } else {
            baseExtractor.extractFeaturesRecursive(parseTree, section, isQuery);
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
