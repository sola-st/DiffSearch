package research.diffsearch.pipeline.feature.extractor;

import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.pipeline.feature.count.RuleCountExtractor;
import research.diffsearch.pipeline.feature.count.RuleMaxOccurrenceCounter;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;

/**
 * A feature extractor is used to get a feature vector of a given code change.
 */
public interface FeatureExtractor extends ProgrammingLanguageDependent {

    /**
     * @return length of the section of this feature extractor.
     */
    int getFeatureVectorSectionLength();

    /**
     * @return an identifier for this feature extractor.
     */
    default String getName() {
        return getClass().getSimpleName();
    }

    /**
     * Extracts a features out of the given code change and adds it to a feature vector.
     *
     * @param codeChange the code change
     * @param section    the section of the feature vector.
     * @param isQuery    if the code change is a query or not.
     */
    void extractFeatures(String codeChange,
                         FeatureVector.Section section,
                         boolean isQuery);

    /**
     * Finds a feature extraction by name. <br>
     * Following names are allowed:
     * <ul>
     *     <li><code>parentchild</code>: Returns a divided {@link ParentChildFeatureExtractor}</li>
     *     <li><code>triangle</code>: Returns a divided {@link TriangleFeatureExtractor}</li>
     *     <li><code>sibling</code>: Returns a divided {@link SiblingFeatureExtractor}</li>
     *     <li><code>node</code>: Returns a divided {@link NodeExtractor}</li>
     *     <li><code>editscript</code>: Returns a {@link EditScriptExtractor}</li>
     *     <li><code>rulecount</code>: Returns a {@link RuleCountExtractor}</li>
     *     <li><code>equal</code>: Returns a {@link EqualNodesExtractor}</li>
     * </ul>
     * The section length for each extractor can be defined by adding ':' and the length.
     * If this is not given, the <code>defaultSectionLength</code> is used. <br>
     * <p>
     * Example: <code>'parentChild:512'</code> will return a parent child extractor with section length 512.
     *
     * @param definition           name of the feature extractor and the length of the section.
     * @param defaultSectionLength length of the feature vector section for this feature extractor,
     *                             if no length is given by the definition.
     * @param language             programming language of DiffSearch
     * @return a feature extractor that matches the definition
     * @throws IllegalArgumentException if the description is invalid.
     */
    static FeatureExtractor byDefinition(String definition,
                                         int defaultSectionLength,
                                         ProgrammingLanguage language) {

        var parts = definition.split(":");
        var name = parts[0].trim().toLowerCase();
        int length = parts.length >= 2 ? Integer.parseInt(parts[1].trim()) : defaultSectionLength;

        switch (name) {
            case "parentchild":
                return new DividedFeatureExtractor(new ParentChildFeatureExtractor(language, length / 2));
            case "triangle":
                return new DividedFeatureExtractor(new TriangleFeatureExtractor(language, length / 2));
            case "sibling":
                return new DividedFeatureExtractor(new SiblingFeatureExtractor(language, length / 2));
            case "editscript":
                return new EditScriptExtractor(language, length);
            case "node":
                return new DividedFeatureExtractor(new NodeExtractor(language, length / 2));
            case "rulecount":
                return new DividedFeatureExtractor(new RuleCountExtractor(language,
                        new RuleMaxOccurrenceCounter(language)));
            case "descendant":
                return new DividedFeatureExtractor(
                        new DescendentFeatureExtractor(language, length / 2));
        }
        throw new IllegalArgumentException(definition);
    }
}
