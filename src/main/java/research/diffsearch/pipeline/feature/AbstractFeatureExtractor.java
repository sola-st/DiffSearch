package research.diffsearch.pipeline.feature;

import research.diffsearch.util.ProgrammingLanguage;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractFeatureExtractor implements FeatureExtractor {

    private final ProgrammingLanguage programmingLanguage;
    private final int featureVectorLength;

    public AbstractFeatureExtractor(ProgrammingLanguage language, int featureVectorLength) {
        programmingLanguage = language;
        this.featureVectorLength = featureVectorLength;
    }

    @Override
    public int getFeatureVectorLength() {
        return featureVectorLength;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int hashFunction(String... input) {
        return Arrays.stream(input)
                .mapToInt(Object::hashCode)
                .sum() % getFeatureVectorLength();
    }

}
