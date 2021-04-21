package research.diffsearch.pipeline.feature;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class represents a feature vector. It contains different section for each feature extractor.
 */
public class FeatureVector {

    private final double[] vector;
    private final String codeChange;
    private final Map<Section, List<Feature>> typeToFeaturesMap = new HashMap<>();
    private final int countBits;
    private final int quadraticProbingMaxCount;

    /**
     * Creates a new feature vector for the given code change.
     *
     * @param codeChange               the code change that this vector represents
     * @param size                     the length of the vector
     * @param countBits                the number of count bits per feature
     * @param quadraticProbingMaxCount the maximum number of times quadratic probing is used
     *                                 on a hash collision
     */
    public FeatureVector(String codeChange, int size, int countBits, int quadraticProbingMaxCount) {
        this.codeChange = codeChange;
        this.vector = new double[size * countBits];
        this.countBits = countBits;
        this.quadraticProbingMaxCount = quadraticProbingMaxCount;
    }

    /**
     * Adds a feature to the feature vector at the given index. Uses quadratic probing and
     * count bits on hash collisions.
     *
     * @param section the section in which the feature should be added.
     * @param feature the feature as a string.
     * @param index   position in the feature vector. The feature might end up at another index
     *                if count bits or quadratic probing are used.
     */
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

                    vector[actualIndex]++;
                    break outer;
                }
            }
        }

        var list = typeToFeaturesMap.getOrDefault(section, new ArrayList<>());
        list.add(new Feature(feature, actualIndex));
        typeToFeaturesMap.put(section, list);
    }

    /**
     * Returns a section of this feature vector with the given name.
     *
     * @param name          name of the section.
     * @param startPosition index at where the sections starts.
     * @param length        length of the section.
     * @return the section of the feature vector.
     */
    public Section getSection(String name, int startPosition, int length) {
        return new Section(startPosition, length, name);
    }

    public double[] getVector() {
        return vector;
    }

    /**
     * @return the names of all sections this feature vector has.
     */
    public Set<String> getCategories() {
        return typeToFeaturesMap.keySet()
                .stream()
                .map(Section::getName)
                .collect(Collectors.toSet());
    }

    /**
     * Returns all features in a section.
     *
     * @param category name of the section.
     * @return all features of the given section.
     */
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

    /**
     * Represents a section of the feature vector. This is used to divide the vector in different
     * areas for each feature extractor.
     */
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

        public Section getSubsection(String name, int relativeStartPosition, int length) {
            return FeatureVector.this.getSection(name, this.startPosition + relativeStartPosition, length);
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
