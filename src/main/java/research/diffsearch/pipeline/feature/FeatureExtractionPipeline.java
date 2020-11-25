package research.diffsearch.pipeline.feature;

import research.diffsearch.pipeline.base.Pipeline;

import java.util.function.BiConsumer;

/**
 * Pipeline to extract feature vectors from code changes. This interface combines
 * potentially multiple {@link FeatureExtractor}s to one pipeline.
 */
public interface FeatureExtractionPipeline extends Pipeline<String, int[]> {

    /**
     * Adds a feature extractor to the pipeline.
     *
     * @throws IllegalArgumentException if the vector length of the given extractor
     *                                  and the vector length of {@code this} do not match.
     */
    void addFeatureExtractor(FeatureExtractor extractor);

    /**
     * Extracts the features of the given code change.
     *
     * @param codeChange the code change.
     * @param featureVectorConsumer async processor of the result.
     */
    void extractFeatures(String codeChange, int index, BiConsumer<int[], Integer> featureVectorConsumer);

    int getSingleFeatureVectorLength();

    @Override
    default void process(String input, int index, BiConsumer<int[], Integer> outputConsumer) {
        extractFeatures(input, index, outputConsumer);
    }
}
