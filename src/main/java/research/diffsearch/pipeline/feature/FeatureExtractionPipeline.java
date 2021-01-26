package research.diffsearch.pipeline.feature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;

import java.util.ArrayList;
import java.util.List;

/**
 * Extracts features from code changes.
 */
public class FeatureExtractionPipeline implements Pipeline<String, FeatureVector> {

    private static final Logger logger = LoggerFactory.getLogger(FeatureExtractionPipeline.class);
    private final List<FeatureExtractor> extractorList = new ArrayList<>();
    private final byte countBits;

    public FeatureExtractionPipeline(byte countBits) {
        this.countBits = countBits;
    }

    /**
     * Adds a new extractor to the pipeline.
     */
    public void addFeatureExtractor(FeatureExtractor extractor) {
        extractorList.add(extractor);
    }

    public List<FeatureExtractor> getFeatureExtractors() {
        return this.extractorList;
    }

    /**
     * @return the length of the resulting feature vector.
     */
    public int getTotalFeatureVectorLength() {
        return extractorList.stream().mapToInt(FeatureExtractor::getFeatureVectorLength).sum();
    }

    /**
     * Extracts the features of the given code change.
     *
     * @param codeChange the code change.
     */
    public FeatureVector extractFeatures(String codeChange) {
        FeatureVector featureVector = new FeatureVector(codeChange, getTotalFeatureVectorLength(), countBits);
        try {
            var startPosition = 0;

            for (FeatureExtractor extractor : getFeatureExtractors()) {
                extractor.extractFeatures(codeChange, featureVector, startPosition);
                startPosition += extractor.getFeatureVectorLength();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return featureVector;
    }

    @Override
    public void process(String input, int index, IndexedConsumer<FeatureVector> outputConsumer) {
        if (input != null) {
            outputConsumer.accept(extractFeatures(input), index);
        } else {
            outputConsumer.skip(index);
        }
    }

    public static FeatureExtractionPipeline getDefaultFeatureExtractionPipeline(boolean isQuery) {
        var pipeline = new FeatureExtractionPipeline(Config.COUNT_BITS);
        if (Config.SPLIT_EXTRACTORS) {

            pipeline.addFeatureExtractor(
                    new SplitFeatureExtractor(
                            new ParentChildFeatureExtractor(
                                    Config.PROGRAMMING_LANGUAGE,
                                    Config.SINGLE_FEATURE_VECTOR_LENGTH / 2,
                                    isQuery))
            );
            pipeline.addFeatureExtractor(
                    new SplitFeatureExtractor(
                            new NodeExtractor(
                                    Config.PROGRAMMING_LANGUAGE,
                                    Config.SINGLE_FEATURE_VECTOR_LENGTH / 2,
                                    isQuery))
            );

        } else {
            pipeline.addFeatureExtractor(
                    new TriangleFeatureExtractor(
                            Config.PROGRAMMING_LANGUAGE, Config.SINGLE_FEATURE_VECTOR_LENGTH, isQuery)
            );
            pipeline.addFeatureExtractor(
                    new ParentChildFeatureExtractor(
                            Config.PROGRAMMING_LANGUAGE, Config.SINGLE_FEATURE_VECTOR_LENGTH, isQuery)
            );
        }
        return pipeline;
    }
}
