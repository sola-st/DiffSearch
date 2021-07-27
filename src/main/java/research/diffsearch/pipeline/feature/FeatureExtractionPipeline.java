package research.diffsearch.pipeline.feature;

import org.antlr.v4.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.extractor.FeatureExtractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Extracts features from code changes.
 *
 * @author Paul Bredl
 */
public class FeatureExtractionPipeline <T extends Tree> implements Pipeline<T, FeatureVector> {

    private static final Logger logger = LoggerFactory.getLogger(FeatureExtractionPipeline.class);
    private final List<FeatureExtractor> extractorList = new ArrayList<>();
    private final byte countBits;
    private final int quadraticProbingMaxCount;
    private final boolean isQuery;

    public FeatureExtractionPipeline(byte countBits, int quadraticProbingMaxCount, boolean isQuery) {
        this.countBits = countBits;
        this.quadraticProbingMaxCount = quadraticProbingMaxCount;
        this.isQuery = isQuery;
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
        return extractorList.stream().mapToInt(FeatureExtractor::getFeatureVectorSectionLength).sum() * countBits;
    }

    /**
     * Extracts the features of the given code change.
     */
    public FeatureVector extractFeatures(T codeChangeTree) {
        FeatureVector featureVector = new FeatureVector(
                getTotalFeatureVectorLength() / countBits,
                countBits,
                quadraticProbingMaxCount);
        try {
            var startPosition = 0;

            for (FeatureExtractor extractor : getFeatureExtractors()) {
                var section = featureVector.getSection(extractor.getName(),
                        startPosition, extractor.getFeatureVectorSectionLength());
                extractor.extractFeatures(codeChangeTree, section, isQuery);
                startPosition += extractor.getFeatureVectorSectionLength();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return featureVector;
    }

    @Override
    public FeatureVector process(T input, int index) {
        return extractFeatures(input);
    }

    public static <T extends Tree> FeatureExtractionPipeline<T> getDefaultFeatureExtractionPipeline(boolean isQuery) {
        var pipeline = new FeatureExtractionPipeline<T>(Config.COUNT_BITS, Config.FEATURE_MAX_COUNT, isQuery);

        var extractors = Config.featureExtractors.split(";");

        for (var extractorDef : extractors) {
            pipeline.addFeatureExtractor(
                    FeatureExtractor.byDefinition(extractorDef,
                            Config.SINGLE_FEATURE_VECTOR_LENGTH, Config.PROGRAMMING_LANGUAGE, Config.DIVIDE_EXTRACTORS));
        }
        return pipeline;
    }
}
