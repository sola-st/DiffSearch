package research.diffsearch.util;

import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;

import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;
import static research.diffsearch.util.Util.program_languages_info;

/**
 * Parses command line arguments and adjusts the config accordingly.
 *
 * @author Paul Bredl
 */
public class CommandLineUtil {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineUtil.class);

    public static Options buildCLIOptions() {
        return new Options()
                .addOption("pyc", "py-command", true, "command to run python")
                .addOption("lang", "language", true, "the programming language (python, javascript or java")
                .addOption("l", "log", false, "save log to file")
                .addOption("n", "normal", false, "launch DiffSearch in normal mode")
                .addOption("g", "web-gui", false, "launch in web GUI mode")
                .addOption("w", "web", false, "launch DiffSearch with web interface")
                .addOption("oj", "only-java", false, "does not start the python server")
                .addOption("p", "port", true, "set the port for the web interface")
                .addOption("q", "query", true, "process a query")
                .addOption("r", "recall", false, "measure recall of queries (slow!)")
                .addOption("s", "silent", false, "omit large console outputs")
                .addOption("py_port", true, "set the port for the python server")
                .addOption("k", true, "set value for k, which is the number of candidate changes")
                .addOption("fe", "extract features from the corpus")
                .addOption("t", "thread-count", true, "number of threads to use")
                .addOption("vl", "single-feature-vector-length", true, "size a each partition of the feature vectors")
                .addOption("cb", "count-bits", true, "number of count bits per feature. Must be at least 1")
                .addOption("extractors", true, "which feature extractors to use. Syntax: <name>(:<bits>)?, separated with commas")
                .addOption("help", "show help")
                .addOption("rs", "range-search", true, "if faiss should use range search. Optional: How many additional features a code changes may have in comparison to the query.")
                .addOption("mt", "timeout", true, "matching timeout, after this time matching gets cancelled")
                .addOption("eqp", "extract-query-placeholders", false, "extract query placeholders like EXPR, default is false")
                .addOption("tfidf", false, "if tfidf weights should be used in the feature vectors.")
                .addOption("noquerymultiplication", false, "query vectors do not get multiplied.")
                .addOption("nondividedextraction", false, "feature extraction is not divided in the old and new part.")
                .addOption("gurl", "web-gui-url", true, "set the web GUI URL")
                .addOption(Option.builder("a")
                        .longOpt("analysis")
                        .numberOfArgs(1)
                        .optionalArg(true)
                        .desc("prints a detailed analysis of the query or a given code change containing the parse tree and a list of all extracted features.")
                        .build())
                .addOption(Option.builder("test").numberOfArgs(2).desc("tests if a code change matches a query.").build())
                .addOption(Option.builder("b")
                        .longOpt("batch")
                        .numberOfArgs(2)
                        .optionalArg(true)
                        .desc("executes a batch of queries. First argument is the input query file, second argument the output text file.")
                        .build())
                .addOption("pa", "parse-mode", false, "Parses code changes to parse trees")
                .addOption("lr", "lower-ram", false, "Uses less RAM at the cost of longer search time");
    }

    public static void parseArgs(String[] args) {
        CommandLineParser parser = new DefaultParser();
        try {
            Options options = buildCLIOptions();
            CommandLine commandLine = parser.parse(options, args);

            if (commandLine.hasOption("help")) {
                new HelpFormatter().printHelp("dfs", options);
            }

            Config.ONLY_JAVA = commandLine.hasOption("oj");
            Config.NORMAL = commandLine.hasOption("n");
            Config.WEB_GUI = commandLine.hasOption("g");
            Config.WEB = commandLine.hasOption("w");
            Config.LOG_FILE = commandLine.hasOption("l");
            Config.QUERY_MODE = commandLine.hasOption("q");
            Config.MEASURE_RECALL = commandLine.hasOption("r");
            Config.CORPUS_FEATURE_EXTRACTION = commandLine.hasOption("fe");
            Config.SILENT = commandLine.hasOption("silent");
            Config.BATCH = commandLine.hasOption("b");
            Config.ANALYSIS_MODE = commandLine.hasOption("a");
            Config.PARSE_MODE = commandLine.hasOption("pa");
            Config.LOW_RAM = commandLine.hasOption("lr");

            if (commandLine.hasOption("a")) {
                Config.query = commandLine.getOptionValue("a");
            }
            if (commandLine.hasOption("p")) {
                Config.port_web = parseInt(commandLine.getOptionValue("p"));
            }
            if (commandLine.hasOption("q")) {
                Config.query = commandLine.getOptionValue("q");
            }
            if (commandLine.hasOption("py_port")) {
                Config.port = parseInt(commandLine.getOptionValue("py_port"));
            }
            if (commandLine.hasOption("lang")) {
                Config.PROGRAMMING_LANGUAGE = ProgrammingLanguage.valueOf(
                        commandLine.getOptionValue("lang").toUpperCase());

                // Update info based on PL
                program_languages_info();
            }
            if (commandLine.hasOption("k")) {
                Config.k = parseInt(commandLine.getOptionValue("k"));
            }
            if (commandLine.hasOption("b")) {
                var params = commandLine.getOptionValues("b");
                if (params != null && params.length > 0) {
                    Config.batchFilePath = params[0];
                    if (params.length > 1) {
                        Config.batchOutput = params[1];
                    }
                }
            }
            if (commandLine.hasOption("cb")) {
                Config.COUNT_BITS = parseByte(commandLine.getOptionValue("cb"));
            }
            if (commandLine.hasOption("pyc")) {
                Config.PYTHON_CMD = commandLine.getOptionValue("pyc");
            }
            if (commandLine.hasOption("t")) {
                Config.threadCount = parseInt(commandLine.getOptionValue("t"));
            }
            if (commandLine.hasOption("vl")) {
                Config.SINGLE_FEATURE_VECTOR_LENGTH = parseInt(commandLine.getOptionValue("vl"));
            }
            if (commandLine.hasOption("extractors")) {
                Config.featureExtractors = commandLine.getOptionValue("extractors");
            }
            if (commandLine.hasOption("rs")) {
                Config.RANGE_SEARCH = true;
                var maxCount = commandLine.getOptionValue("rs");
                if (!maxCount.isBlank()) {
                    Config.k_max = parseInt(maxCount);
                }
            }
            if (commandLine.hasOption("mt")) {
                Config.matchingTimeoutSeconds = parseInt(commandLine.getOptionValue("mt"));
            }
            if (commandLine.hasOption("extract-query-placeholders")) {
                Config.EXTRACT_QUERY_KEYWORDS = true;
            }
            if (commandLine.hasOption("tfidf")) {
                Config.TFIDF = true;
            }
            if (commandLine.hasOption("nondividedextraction")) {
                Config.DIVIDE_EXTRACTORS = false;
            }
            if (commandLine.hasOption("noquerymultiplication")) {
                Config.QUERY_MULTIPLICATION = false;
            }
            if (commandLine.hasOption("gurl")) {
                Config.web_url = commandLine.getOptionValue("gurl");
            }
        } catch (ParseException | NumberFormatException exception) {
            logger.error(exception.getMessage());
        }
    }
}
