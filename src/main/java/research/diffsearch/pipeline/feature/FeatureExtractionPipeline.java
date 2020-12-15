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
public class FeatureExtractionPipeline implements Pipeline<String, int[]> {

    private static final Logger logger = LoggerFactory.getLogger(FeatureExtractionPipeline.class);

    private final List<FeatureExtractor> extractorList = new ArrayList<>();

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
    public int[] extractFeatures(String codeChange) {
        int[] featureVector = new int[getTotalFeatureVectorLength()];
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
    public void process(String input, int index, IndexedConsumer<int[]> outputConsumer) {
        outputConsumer.accept(extractFeatures(input), index);
    }

    public static FeatureExtractionPipeline getDefaultFeatureExtractionPipeline() {
        var pipeline = new FeatureExtractionPipeline();
        pipeline.addFeatureExtractor(
                new TriangleFeatureExtractor(Config.PROGRAMMING_LANGUAGE, Config.SINGLE_FEATURE_VECTOR_LENGTH));
        /*pipeline.addFeatureExtractor( //Uncomment after new indexing
                new ParentChildFeatureExtractor(Config.PROGRAMMING_LANGUAGE, Config.SINGLE_FEATURE_VECTOR_LENGTH));
       */ return pipeline;
    }
}
