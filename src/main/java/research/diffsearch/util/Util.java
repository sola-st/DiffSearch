package research.diffsearch.util;

import research.diffsearch.Config;

import java.util.List;

public class Util {

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public static void printOutputList(List<CodeChangeWeb> output, long startTimeStamp) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        if (!Config.SILENT) {
            if (!output.isEmpty()) {
                System.out.println("************************** " + output.size() + " RESULTS ************************");
                System.out.println("*");
                for (var change : output) {
                    for (var oldLine : change.codeChangeOld.split("\n")) {
                        System.out.print("*  - ");
                        System.out.println(ANSI_RED + oldLine + ANSI_RESET);
                    }
                    for (var newLine : change.codeChangeNew.split("\n")) {
                        System.out.print("*  + ");
                        System.out.println(ANSI_GREEN + newLine + ANSI_RESET);
                    }
                    System.out.print("*       ");
                    System.out.println("at " + change.url);
                    System.out.println("*       " + change.hunkLines);
                    System.out.println("*");
                }
                System.out.println("*********************************************************************************");
            } else {
                System.out.println("****************** No results found. **************");
            }
        }

    }

    public static String featureVectorToString(int[] vector) {
        StringBuilder builder = new StringBuilder();

        for (int element : vector) {
            builder.append(element);
            builder.append(",");
        }
        return builder.toString();
    }
}
