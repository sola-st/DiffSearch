package research.diffsearch.pipeline.feature;

import research.diffsearch.util.ProgrammingLanguage;

public abstract class AbstractFeatureExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;

    public AbstractFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        programmingLanguage = language;
        this.featureVectorLength = featureVectorLength;
    }

    public int getFeatureVectorIndex(int startIndex, int hashValue, double vectorLength) {
        return Math.abs((int) (startIndex + (hashValue / (Integer.MAX_VALUE / vectorLength))));
    }

    @Override
    public int getFeatureVectorLength() {
        return featureVectorLength;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

}
