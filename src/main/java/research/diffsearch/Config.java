package research.diffsearch;

import research.diffsearch.util.ProgrammingLanguage;

public class Config {

    //public static String PYTHON_CMD= "/home/luca/anaconda3/bin/python3.7";
    /**
     * The command to run a python file.
     */
    public static String PYTHON_CMD = "wsl python3";

    public static String GITDIFF_FILE = "";

    /**
     * The programming language of the code changes.
     */
    public static ProgrammingLanguage PROGRAMMING_LANGUAGE = ProgrammingLanguage.JAVA;

    //Constants that enable/disable part of the tool
    public static boolean LOG_FILE  = false;

    /**
     * Run DiffSearch as a command line app.
     */
    public static boolean NORMAL  = false;

    public static boolean WEB  = true;

    /**
     * Run DiffSearch as a web gui app.
     */
    public static boolean WEB_GUI  = false;

    /**
     * If true, DiffSearch won't start any python files but assumes that they are already started.
     * Useful to distribute python parts and java parts of DiffSearch.
     */
    public static boolean ONLY_JAVA = false;

    /**
     * If true, DiffSearch starts in query mode. This will execute a single query.
     * @see Config#query
     */
    public static boolean QUERY_MODE = false;

    /**
     * If true, DiffSearch will measure the recall of the queries and save the results.
     * This process may take very long, but the expected values for queries are saved and
     * reused.
     */
    public static boolean MEASURE_RECALL = false;

    /**
     * The query that gets executed if DiffSearch is in {@link Config#QUERY_MODE}.
     */
    public static String query = "";

    /**
     * WIP. Removes some console outputs.
     */
    public static boolean SILENT = false;

    /**
     * If true, DiffSearch will run in Batch mode. This will process all queries of a text file and
     * save the results to an output file. This will not store results if {@link Config#SILENT} is true.
     */
    public static boolean BATCH = false;

    /**
     * The path of the batch file that will processed in the {@link Config#BATCH}-mode.
     */
    public static String batchFilePath = "./src/main/resources/queriesForRecall.txt";

    /**
     * The path to the file were the results
     */
    public static String batchOutput = "./src/main/resources/batchOutput.txt";

    /**
     * If true, DiffSearch will not run to execute queries but to extract the features of the corpus
     * and build an index.
     */
    public static boolean CORPUS_FEATURE_EXTRACTION = false;

    /**
     * The number of candidate changes that are used to find results. DiffSearch will consider
     * this number of code changes while processing a query.
     */
    public static int k = 1000;

    /**
     * The length of the feature vectors.
     */
    public static int SINGLE_FEATURE_VECTOR_LENGTH = 512;

    /**
     * The number of bits per feature that are used for unary counting
     */
    public static byte COUNT_BITS = 1;

    /**
     * Maximum number of times a feature can be counted using quadratic probing.
     */
    public static int FEATURE_MAX_COUNT = 32;

    /**
     * Port of the web server.
     */
    public static int port_web = 8843;

    /**
     * Python host name.
     */
    public static String host = "localhost";

    /**
     * Port for python server (FAISS).
     */
    public static int port = 5002;

    /**
     * Path to the server log.
     */
    public static String server_log_file = "./src/main/resources/Features_Vectors/server_log.log";

    /**
     * Split parent child and triangle feature extraction in two old and new part.
     * Change required reindexing.
     */
    public static boolean SPLIT_EXTRACTORS = true;

    /**
     * If true, count feature vectors will be used for the query instead of binary vectors.
     */
    public static boolean USE_COUNT_VECTORS_QUERY = false;

    /**
     * If true, count feature vectors will be used for the corpus instead of binary vectors.
     * Change required reindexing.
     */
    public static boolean USE_COUNT_VECTORS_CORPUS = false;

    /**
     * If true, keywords like "ID", "EXPR" will also be extracted in the query feature extraction.
     */
    public static boolean EXTRACT_QUERY_KEYWORDS = false;

    /**
     * Query vectors get multiplied by this factor.
     */
    public static int QUERY_FEATURE_VECTOR_MULTIPLIER = 513;

    /**
     * FAISS parameter, number of clusters of the index.
     */
    public static int nlist = 1;

    /**
     * FAISS parameter, number of clusters considers while performing nearest neighbor search.
     */
    public static int nprobe = 240;
}
