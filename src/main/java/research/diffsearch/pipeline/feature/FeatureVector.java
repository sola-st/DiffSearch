package research.diffsearch.pipeline.feature;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class FeatureVector {

    private final int[] vector;
    private final String codeChange;
    private final Map<Section, List<Feature>> typeToFeaturesMap = new HashMap<>();
    private final int countBits;
    private final int quadraticProbingMaxCount;

    public FeatureVector(String codeChange, int size, int countBits, int quadraticProbingMaxCount) {
        this.codeChange = codeChange;
        this.vector = new int[size * countBits];
        this.countBits = countBits;
        this.quadraticProbingMaxCount = quadraticProbingMaxCount;
    }

    public void addFeature(Section section, String feature, int index) {
        int actualIndex = index;

        // quadratic probing
        outer:
        for (var probingFactor = 0; probingFactor < quadraticProbingMaxCount; probingFactor++) {
            int probingOffset = probingFactor * probingFactor;
            actualIndex = (actualIndex + probingOffset) % vector.length;

            // use count bits
            for (var offset = 0; offset < countBits; offset++) {
                actualIndex = (countBits * actualIndex + offset) % vector.length;
                if (vector[actualIndex] == 0) {

                    vector[actualIndex] = 1;
                    break outer;
                }
            }
        }

        var list = typeToFeaturesMap.getOrDefault(section, new ArrayList<>());
        list.add(new Feature(feature, actualIndex));
        typeToFeaturesMap.put(section, list);
    }

    public Section getSection(String name, int startPosition, int length) {
        return new Section(startPosition, length, name);
    }

    public int[] getVector() {
        return vector;
    }

    public Set<String> getCategories() {
        return typeToFeaturesMap.keySet()
                .stream()
                .map(Section::getName)
                .collect(Collectors.toSet());
    }

    public List<Feature> getFeatureList(String category) {
        return typeToFeaturesMap.entrySet()
                .stream()
                .filter(sectionListEntry -> sectionListEntry.getKey().getName().equals(category))
                .map(Map.Entry::getValue)
                .findAny()
                .orElse(Collections.emptyList());
    }

    public String getCodeChange() {
        return codeChange;
    }

    public class Section {
        private final int startPosition;
        private final int length;
        private final String name;

        public Section(int startPosition, int length, String name) {
            this.startPosition = startPosition;
            this.length = length;
            this.name = name;
        }

        public void addFeature(String featureString) {
            FeatureVector.this.addFeature(this,
                    featureString, startPosition + Math.abs(featureString.hashCode() % length));
        }

        public void addFeature(String featureString, int index) {
            FeatureVector.this.addFeature(this, featureString, index);
        }

        public Section getSubsection(String name, int startPosition, int length) {
            return FeatureVector.this.getSection(name, this.startPosition + startPosition, length);
        }

        public int getStartPosition() {
            return startPosition;
        }

        public int getLength() {
            return length;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Section section = (Section) o;

            return new EqualsBuilder()
                    .append(startPosition, section.startPosition)
                    .append(length, section.length)
                    .append(name, section.name)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37)
                    .append(startPosition)
                    .append(length)
                    .append(name)
                    .toHashCode();
        }
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
