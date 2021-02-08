package research.diffsearch.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.CodeChangeWeb;
import research.diffsearch.pipeline.feature.FeatureVector;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void printOutputList(Collection<CodeChangeWeb> output, String query, long startTimeStamp) {
        printOutputList(output, query, startTimeStamp, System.out);
    }

    public static void printOutputList(Collection<CodeChangeWeb> output, String query, long startTimeStamp, PrintStream out) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        if (!Config.SILENT) {
            if (!output.isEmpty()) {
                out.println("*** " + output.size()
                            + " RESULTS  for " + query + "***");
                out.println("*");
                for (var change : output) {
                    for (var oldLine : change.codeChangeOld.split("\n")) {
                        out.print("*  - ");
                        out.println(ANSI_RED + oldLine + ANSI_RESET);
                    }
                    for (var newLine : change.codeChangeNew.split("\n")) {
                        out.print("*  + ");
                        out.println(ANSI_GREEN + newLine + ANSI_RESET);
                    }
                    out.print("*       ");
                    out.println("at " + change.url);
                    out.println("*       " + change.hunkLines);
                    out.println("*");
                }
                out.println("***");
            } else {
                out.println("*** No results found. ***");
            }
        }
        out.flush();
    }

    public static String featureVectorToString(FeatureVector vector) {
        return Arrays.stream(vector.getVector())
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));
    }

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void printFeatureVectorAnalysis(FeatureVector vector) {
        System.out.println("Feature vector analysis");
        for (String category : vector.getCategories()) {
            System.out.println(category + ": ");
            for (var feature : vector.getFeatureList(category)) {
                System.out.println("\t" + feature.index + ": " + feature.featureString);
            }
        }
    }

    public static String formatDuration(long startTime, long endTime) {
        return DurationFormatUtils.formatDuration(endTime - startTime, "mm'm':ss's':SSS'ms'");
    }

    public static String computeCandidateUrl(String candidate) {
        String candidateUrl = "https://github.com/";
        String repository;
        String commit;

        List<String> items = Arrays.asList(candidate.split("\\s*@@\\s*"));
        if (items.size() > 2) {
            commit = items.get(0).replaceAll("commit", "").replaceAll(" ", "");
            // String repository = items.get(1).replaceAll("\\/[a-zA-Z]+-[a-zA-Z]+\\.patch", "");
            repository = StringUtils.substringBetween(items.get(2), "patch/", ".patch").replaceAll("-", "/");
        } else {
            return "";
        }
        return candidateUrl + repository + "/commit/" + commit + "-->" + items.get(1);
    }
}
