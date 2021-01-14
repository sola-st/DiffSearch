package research.diffsearch.pipeline.feature;

import research.diffsearch.util.ProgrammingLanguageDependent;

/**
 * A feature extractor is used to get a feature vector of a given code change.
 */
public interface FeatureExtractor extends ProgrammingLanguageDependent {

    int getFeatureVectorLength();

    /**
     * Extracts a features out of the given code change and puts it a certain position of
     * the given feature vector.
     *
     * @param codeChange               the code change
     * @param completeFeatureVector    the complete feature vector
     * @param startPosition            the index in the feature vector where to start writing the
     *                                 results.
     * @return the complete feature vector.
     */
    FeatureVector extractFeatures(String codeChange, FeatureVector completeFeatureVector, int startPosition);
}
