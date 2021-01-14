package research.diffsearch.pipeline.feature;

import java.util.*;

public class FeatureVector {

    private final int[] vector;
    private final String codeChange;
    private final Map<String, List<Feature>> typeToFeaturesMap = new HashMap<>();

    public FeatureVector(String codeChange, int size) {
        this.codeChange = codeChange;
        this.vector = new int[size];
    }

    public void addFeature(String category, String feature, int index) {
        vector[index]++;
        var list = typeToFeaturesMap.getOrDefault(category, new ArrayList<>());
        list.add(new Feature(feature, index));
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
