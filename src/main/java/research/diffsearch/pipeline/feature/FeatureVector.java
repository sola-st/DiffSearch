package research.diffsearch.pipeline.feature;

import java.util.*;

public class FeatureVector {

    private final int[] vector;
    private final String codeChange;
    private final Map<String, List<Feature>> typeToFeaturesMap = new HashMap<>();
    private final int countBits;
    private final int quadraticProbingMaxCount;

    public FeatureVector(String codeChange, int size, int countBits, int quadraticProbingMaxCount) {
        this.codeChange = codeChange;
        this.vector = new int[size * countBits];
        this.countBits = countBits;
        this.quadraticProbingMaxCount = quadraticProbingMaxCount;
    }

    public void addFeature(String category, String feature, int index) {
        int actualIndex = index;

        // quadratic probing
        outer: for (var probingFactor = 0; probingFactor < quadraticProbingMaxCount; probingFactor++) {
            int probingOffset = probingFactor * probingFactor;
            actualIndex = (actualIndex + probingOffset) % vector.length;

            // use count bits
            for (var offset = 0; offset < countBits; offset++) {
                actualIndex = (countBits * actualIndex + offset) % vector.length;
                if (vector[actualIndex] == 0 || offset == countBits - 1) {

                    vector[actualIndex] = 1;
                    break outer;
                }
            }
        }

        var list = typeToFeaturesMap.getOrDefault(category, new ArrayList<>());
        list.add(new Feature(feature, actualIndex));
        typeToFeaturesMap.put(category, list);
    }

    public int[] getVector() {
        return vector;
    }

    public Set<String> getCategories() {
        return typeToFeaturesMap.keySet();
    }

    public List<Feature> getFeatureList(String category) {
        return typeToFeaturesMap.get(category);
    }

    public String getCodeChange() {
        return codeChange;
    }

    public static class Feature {
        public final String featureString;
        public final int index;

        public Feature(String featureString, int index) {
            this.featureString = featureString;
            this.index = index;
        }
    }
}
