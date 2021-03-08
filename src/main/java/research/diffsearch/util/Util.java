package research.diffsearch.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.feature.FeatureVector;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void printOutputList(DiffsearchResult result) {
        printOutputList(result, System.out, true);
    }

    public static void printOutputList(DiffsearchResult result, PrintStream out, boolean colored) {
        if (!Config.SILENT) {
            String query = result.getQuery();
            var output = result.getResults();

            final String ANSI_RED = "\u001B[31m";
            final String ANSI_GREEN = "\u001B[32m";

            if (!output.isEmpty()) {
                out.println("*** " + output.size()
                            + " RESULTS  for " + query + "***");
                out.println("*");
                for (var change : output) {
                    for (var oldLine : change.codeChangeOld.split("\n")) {
                        printCodeChangePart(out, colored, ANSI_RED, oldLine, "*  - ");
                    }
                    for (var newLine : change.codeChangeNew.split("\n")) {
                        printCodeChangePart(out, colored, ANSI_GREEN, newLine, "*  + ");
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
            out.flush();
        }
    }

    private static void printCodeChangePart(PrintStream out, boolean colored, String ansiColor,
                                            String newLine, String prefix) {
        final String ANSI_RESET = "\u001B[0m";
        out.print(prefix);
        if (colored) {
            out.print(ansiColor);
        }
        out.print(newLine);
        if (colored) {
            out.print(ANSI_RESET);
        }
        out.println();
    }

    public static String featureVectorToString(FeatureVector vector) {
        return Arrays.stream(vector.getVector())
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));
    }

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void printFeatureVectorAnalysis(FeatureVector vector) {
        System.out.println("Feature vector analysis");
        vector.getCategories()
                .stream()
                .sorted()
                .forEach(category -> {
                    System.out.println(category + ": ");
                    vector.getFeatureList(category)
                            .stream()
                            .sorted(Comparator.comparing(feature -> feature.index))
                            .map(feature -> "\t" + feature.index + ": " + feature.featureString)
                            .forEach(System.out::println);
                });
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
