package research.diffsearch.pipeline.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * Extracts features from code changes.
 */
public class BaseFeatureExtractionPipeline implements FeatureExtractionPipeline {

    private List<FeatureExtractor> extractorList = new ArrayList<>();
    private int singleFeatureVectorLength = 0;

    @Override
    public void addFeatureExtractor(FeatureExtractor extractor) {
        if (extractor.getFeatureVectorLength() != singleFeatureVectorLength) {
            throw new IllegalArgumentException("Length of extractor vector does not match pipeline vector length." +
                                               " Pipeline length: " + singleFeatureVectorLength + ";" +
                                               " Extractor vector length: " + extractor.getFeatureVectorLength());
        }
        extractorList.add(extractor);
    }

    public List<FeatureExtractor> getFeatureExtractors() {
        return this.extractorList;
    }

    public void setSingleFeatureVectorLength(int length) {
        this.singleFeatureVectorLength = length;
    }

    @Override
    public int getSingleFeatureVectorLength() {
        return this.singleFeatureVectorLength;
    }

    @Override
    public void extractFeatures(String codeChange, int index, BiConsumer<int[], Integer> featureVectorConsumer) {
            var extractors = getFeatureExtractors();
            var completeVectorLength = extractors.size() * getSingleFeatureVectorLength();

            var featureVector = new int[completeVectorLength];

            for (int i = 0; i < extractors.size(); i++) {
                FeatureExtractor extractor = extractors.get(i);
                extractor.extractFeatures(codeChange, featureVector, i * getSingleFeatureVectorLength());
            }

            featureVectorConsumer.accept(featureVector, index);
    }
}
