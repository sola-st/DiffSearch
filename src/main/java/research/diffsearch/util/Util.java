package research.diffsearch.util;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.Mode;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.server.PythonRunner;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.ParseTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.tree.TreeUtils;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static research.diffsearch.util.FilePathUtils.getChangesJsonFilePath;
import static research.diffsearch.util.FilePathUtils.getNumberOfLines;

/**
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class Util {
	private static final Logger logger = LoggerFactory.getLogger(Util.class);

    public static void printOutputList(DiffsearchResult result) {
        Config.results = result;
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
                    if (change.getCodeChangeOld().equals("invalid query") && change.getCodeChangeNew().equals("invalid query")) {
                        out.println("*** Query not valid. ***");
                        break;
                    }
                    for (var oldLine : change.getCodeChangeOld().split("\n")) {
                        printCodeChangePart(out, colored, ANSI_RED, oldLine, "*  - ");
                    }
                    for (var newLine : change.getCodeChangeNew().split("\n")) {
                        printCodeChangePart(out, colored, ANSI_GREEN, newLine, "*  + ");
                    }
                    out.print("*       ");
                    out.println("at " + change.getCommitUrl());
                    out.println("*       " + change.getHunkLines());
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
                .mapToObj(Double::toString)
                .collect(Collectors.joining(","));
    }

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

    public static void printParseTree(AbstractTree tree) {
        ParseTreeNode rootNode = ParseTreeNode.fromTree(tree.getParseTree(), Arrays.asList(tree.getRuleNames()), 0);
        System.out.println(rootNode.toTreeString());

    }

    public static String formatDuration(long startTime, long endTime) {
        return DurationFormatUtils.formatDuration(endTime - startTime, "mm'm':ss's':SSS'ms'");
    }

    public static String computeCandidateUrl(String candidate) {
        String candidateUrl = "https://github.com/";
        String repository;
        String commit;

        try {

            List<String> items = Arrays.asList(candidate.split("\\s*@@\\s*"));
            if (items.size() > 2) {
                commit = items.get(0).replaceAll("commit", "").replaceAll(" ", "");
                // String repository = items.get(1).replaceAll("\\/[a-zA-Z]+-[a-zA-Z]+\\.patch", "");
                repository = StringUtils.substringBetween(items.get(2), "patch/", ".patch").replaceAll("\\.", "/");
            } else {
                return "";
            }
            return candidateUrl + repository + "/commit/" + commit + "-->" + items.get(1);
        } catch (Exception e) {
            return "errorUrl --> errorUrl";
        }
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
        return candidateUrl + repository.replace(".", "/") + "/commit/" + commit + "-->" + items.get(1);
    }

    public static void program_languages_info() {
        switch (Config.PROGRAMMING_LANGUAGE) {
            case PYTHON:
                Config.changes_string_path = "./src/main/resources/Features_Vectors/changes_strings_py.txt";
                Config.changes_string_prop_path = "./src/main/resources/Features_Vectors/changes_strings_prop_py.txt";
                Config.changes_feature_vectors = "./src/main/resources/Features_Vectors/changes_feature_vectors_py.csv";
                if (Mode.WEB_GUI || Mode.WEB){
                    Config.port_web = Config.port_web_python;
                    Config.port = 5003;
                }
                break;
            case JAVASCRIPT:
                Config.changes_string_path = "./src/main/resources/Features_Vectors/changes_strings_js.txt";
                Config.changes_string_prop_path = "./src/main/resources/Features_Vectors/changes_strings_prop_js.txt";
                Config.changes_feature_vectors = "./src/main/resources/Features_Vectors/changes_feature_vectors_js.csv";
                if (Mode.WEB_GUI || Mode.WEB){
                    Config.port_web = Config.port_web_javascript;
                    Config.port = 5004;
                }
                break;
            default:
                Config.changes_string_path = "./src/main/resources/Features_Vectors/changes_strings_java.txt";
                Config.changes_string_prop_path = "./src/main/resources/Features_Vectors/changes_strings_prop_java.txt";
                Config.changes_feature_vectors = "./src/main/resources/Features_Vectors/changes_feature_vectors_java.csv";
                Config.port_web = Config.port_web_java;
        }


        Config.code_changes_num = getNumberOfLines(getChangesJsonFilePath(Config.PROGRAMMING_LANGUAGE));
        set_faiss_index_size (Config.PROGRAMMING_LANGUAGE);
        
    }

    public static String formatCodeChange(String result) {
        return result.replaceAll("\r", "").replaceAll("\n", "");
    }

    public static boolean checkIfQueryIsValid(String query, ProgrammingLanguage language) {

        var queryTree = TreeFactory.getAbstractTree(query, language);
        var parseTree = queryTree.getParseTree();
        var parser = queryTree.getParser();

        return !(TreeUtils.nodeCount(parseTree, Arrays.asList(parser.getRuleNames()), 0) <= 5 || queryTree.isError());
    }

    public static boolean checkIfQueryIsValid(String query) {
        return checkIfQueryIsValid(query, Config.PROGRAMMING_LANGUAGE);
    }

    public static boolean isQueryPlaceholder(String nodeText) {
        var keywords = List.of("ID", "EXPR", "binOP", "unOP", "OP", "LT", "<...>", "querySnippet");
        return keywords
                .stream()
                .anyMatch(nodeText::contains);
    }
    
    public static void set_faiss_index_size (ProgrammingLanguage language) {

		// get the used FAISS index size
		// create a temporary file
		String sizeFilename = "./src/main/resources/Features_Vectors/" + Config.PROGRAMMING_LANGUAGE + "index_size.txt";
		File indexsizeFile = new File(sizeFilename);
		try {
			indexsizeFile.createNewFile();
			var pythonRunner = new PythonRunner("./src/main/resources/Python/get_FAISS_index_size.py",
					FilePathUtils.getIndexFilePath(Config.PROGRAMMING_LANGUAGE), sizeFilename);
			pythonRunner.runAndWaitUntil(input -> false);
			// file index_size contains the index size in first line
			if (indexsizeFile.exists()) {
				try (BufferedReader br = new BufferedReader(new FileReader(sizeFilename))) {
					Config.faiss_index_size = br.readLine();
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
					if (indexsizeFile.exists()) {
						indexsizeFile.delete();
					}
				}
			}
			// remove the temporary File
			indexsizeFile.delete();
		} catch (IOException | InterruptedException exception) {
			logger.error(exception.getMessage(), exception);
			if (indexsizeFile.exists()) {
				indexsizeFile.delete();
			}
		}
		if (indexsizeFile.exists()) {
			indexsizeFile.delete();
		}
    }
}
