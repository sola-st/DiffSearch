package research.diffsearch.pipeline.feature.extractor;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

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

        if (tree.getChildCount() >= 3) {
            for (var child : getRootsOfOldPart(tree)) {
                baseExtractor.extractFeaturesRecursive(child,
                        section.getSubsection(baseExtractor.getName() + " [old]",
                                0, baseExtractor.getFeatureVectorSectionLength()),
                        isQuery);
            }

            for (var child : getRootsOfNewPart(tree)) {
                baseExtractor.extractFeaturesRecursive(child,
                        section.getSubsection(baseExtractor.getName() + " [new]",
                                baseExtractor.getFeatureVectorSectionLength(),
                                baseExtractor.getFeatureVectorSectionLength()),
                        isQuery);
            }
        } else {
            baseExtractor.extractFeaturesRecursive(tree, section, isQuery);
        }
    }

    public List<Tree> getRootsOfOldPart(Tree tree) {
        var result = new ArrayList<Tree>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            var child = tree.getChild(i);
            if (Trees.getNodeText(child, getProgrammingLanguage().getRuleNames()).trim().equals("-->")) {
                break;
            }
            result.add(child);
        }
        return result;
    }

    public List<Tree> getRootsOfNewPart(Tree tree) {
        var result = new ArrayList<Tree>();
        for (int i = tree.getChildCount() - 1; i >= 0; i--) {
            var child = tree.getChild(i);
            if (Trees.getNodeText(child, getProgrammingLanguage().getRuleNames()).trim().equals("-->")) {
                break;
            }
            result.add(child);
        }
        return result;
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
