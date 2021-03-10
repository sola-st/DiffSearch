package research.diffsearch.main;

import research.diffsearch.util.FilePathUtils;

import java.util.ArrayList;

public class FeatureCountAnalysis {

    public static void main(String[] args) throws Exception {
        var countList = new ArrayList<Integer>();
        for (var line : FilePathUtils.getAllLines(
                "src/main/resources/Features_Vectors/changes_feature_vectors_java.csv")) {
            var count = 0;
            for (var vec : line.split(",")) {
                if (vec.equals("1")) {
                    count++;
                }
            }
            countList.add(count);
        }

        var statistics = countList.stream().mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(statistics);
    }
}
