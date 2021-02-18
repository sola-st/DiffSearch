package research.diffsearch.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import research.diffsearch.Config;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void printOutputList(List<CodeChangeWeb> output, long startTimeStamp) {
        printOutputList(output, startTimeStamp, System.out);
    }

    public static void printOutputList(List<CodeChangeWeb> output, long startTimeStamp, PrintStream out) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        if (!Config.SILENT) {
            if (!output.isEmpty()) {
                out.println("*** " + output.size()
                            + " RESULTS  for " + output.get(0) .query + "***");
                out.println("*");
                for (var change : output) {
                    if(change.codeChangeOld.equals("invalid query") && change.codeChangeNew.equals("invalid query")){
                        out.println("*** Query not valid. ***");
                        break;
                    }
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

    }

    public static String featureVectorToString(int[] vector) {
        return Arrays.stream(vector)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));
    }

    public static String formatDuration(long startTime, long endTime) {
        return DurationFormatUtils.formatDuration(endTime - startTime, "mm'm':ss's':SSS'ms'");
    }

    public static String computeCandidateUrl(String candidate) {
        String candidateUrl = "https://github.com/";
        String repository = "";
        String commit = "";

        List<String> items = Arrays.asList(candidate.split("\\s*@@\\s*"));
        if (items.size() > 2) {
            commit = items.get(0).replaceAll("commit", "").replaceAll(" ", "");
            // String repository = items.get(1).replaceAll("\\/[a-zA-Z]+-[a-zA-Z]+\\.patch", "");
            repository = StringUtils.substringBetween(items.get(2), "patch/", ".patch").replaceAll("\\.", "/");
        } else {
            return "";
        }
        return candidateUrl + repository + "/commit/" + commit + "-->" + items.get(1);
    }

    public static String computeCandidateUrl_effectiveness(String candidate) {
        String candidateUrl = "https://github.com/";
        String repository = "";
        String commit = "";

        List<String> items = Arrays.asList(candidate.split("\\s*@@\\s*"));
        if (items.size() > 2) {
            commit = items.get(0).replaceAll("commit", "").replaceAll(" ", "");
            // String repository = items.get(1).replaceAll("\\/[a-zA-Z]+-[a-zA-Z]+\\.patch", "");
            repository = StringUtils.substringBetween(items.get(2), "java/", ".patch");
        } else {
            //return "errorUrl --> errorUrl";
            return "";
        }
        return candidateUrl + repository.replace(".","/") + "/commit/" + commit + "-->" + items.get(1);
    }
}
