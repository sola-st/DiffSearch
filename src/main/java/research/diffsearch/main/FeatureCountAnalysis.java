package research.diffsearch.main;

import research.diffsearch.util.FilePathUtils;

import java.util.Arrays;

public class FeatureCountAnalysis {

    public static void main(String[] args) throws Exception {
        var statistics = FilePathUtils.readCSV("src/main/resources/Features_Vectors/changes_feature_vectors_java.csv", ",")
                .stream()
                .mapToLong(row -> Arrays.stream(row).filter(val -> val.equals("1")).count())
                .summaryStatistics();
        System.out.println(statistics);
    }
}
