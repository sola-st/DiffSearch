package research.diffsearch;

import research.diffsearch.util.ProgrammingLanguage;

/**
 * This class contains all configurable variables of DiffSearch.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class Config {

    public static String DIFFSEARCH_VERSION = "1.2";
    /**
     * Path to the nearest neighbor search python file.
     */
    public static String NEAREST_NEIGHBOR_SEARCH_PY = "./src/main/resources/Python/FAISS_Nearest_Neighbor_Search.py";

    //public static String PYTHON_CMD= "/home/luca/anaconda3/bin/python3.7";
    /**
     * The command to run a python file.
     */
    public static String PYTHON_CMD = "python3";

    /**
     * The programming language of the code changes.
     */
    public static ProgrammingLanguage PROGRAMMING_LANGUAGE = ProgrammingLanguage.PYTHON;

    public static String changes_string_path = "";
    public static String changes_string_prop_path = "";
    public static String changes_feature_vectors = "";

    public static long code_changes_num = 0;

    // index size as String for WebServerGUI
    public static String faiss_index_size = "";

    //Constants that enable/disable part of the tool

    public static boolean LOG_FILE = false;

    /**
     * If true, DiffSearch won't start any python files but assumes that they are already started.
     * Useful to distribute python parts and java parts of DiffSearch.
     */
    public static boolean ONLY_JAVA = false;

    /**
     * If true, DiffSearch will measure the recall of the queries and save the results.
     * This process may take very long, but the expected values for queries are saved and
     * reused.
     */
    public static boolean MEASURE_RECALL = false;

    /**
     * The query that gets executed if DiffSearch is in {@link Mode#QUERY_MODE}.
     */
    public static String query = "";

    /**
     * WIP. Removes some console outputs.
     */

    public static boolean SILENT = false;

    /**
     * Number of threads to use.
     */
    public static int threadCount = Runtime.getRuntime().availableProcessors() - 4;

    /**
     * The path of the batch file that will processed in the {@link Mode#BATCH}-mode.
     */
    public static String batchFilePath = "./src/main/resources/queriesForRecall_PY.txt";

    /**
     * The path to the file were the results
     */
    public static String batchOutput = "./src/main/resources/batchOutput.txt";
    /**
     * Defines the feature extractors that are used.
     */
    public static String featureExtractors = "node;triangle";

    /**
     * The number of candidate changes that are used to find results. DiffSearch will consider
     * this number of code changes while processing a query.
     */
    public static int k = 5000;

    /**
     * Maximum number of candidate changes to consider. Only relevant for range search.
     */
    public static int k_max = 10_000;

    /**
     * The length of the feature vectors.
     */
    public static int SINGLE_FEATURE_VECTOR_LENGTH = 500;

    /**
     * The number of bits per feature that are used for unary counting
     */
    public static byte COUNT_BITS = 1;

    /**
     * Maximum number of times a feature can be counted using quadratic probing.
     */
    public static int FEATURE_MAX_COUNT = 1;

    /**
     * Port of the web server for each programming language.
     */
    public static int port_web = 8843;

    public static boolean LOW_RAM = false;

    public static final int port_web_java = 8843;
    public static final int port_web_python = 8844;
    public static final int port_web_javascript = 8845;

    /**
     * Python host name.
     */
    public static String host = "localhost";

    /**
     * Port for python server (FAISS).
     */
    public static int port = 5002;

    // Web application
    public static String web_url = "http://localhost:4200"; // angular development server

    /**
     * Path to the server log.
     */
    public static String server_log_file = "./src/main/resources/Features_Vectors/server_log.log";

    /**
     * Split parent child and triangle feature extraction in two old and new part.
     * Change required reindexing.
     */
    public static boolean DIVIDE_EXTRACTORS = true;

    /**
     * If true, count feature vectors will be used instead of binary vectors.
     */
    public static boolean USE_COUNT_VECTORS = false;

    /**
     * If true, keywords like "ID", "EXPR" will also be extracted in the query feature extraction.
     */
    public static boolean EXTRACT_QUERY_KEYWORDS = false;

    /**
     * If true, query vectors get multiplied by l / 2 + 1.
     */
    public static boolean QUERY_MULTIPLICATION = true;

    /**
     * If faiss should use range search.
     */
    public static boolean RANGE_SEARCH = false;

    /**
     * If feature vectors should use tf-idf-weights.
     */
    public static boolean TFIDF = false;

    /**
     * After this number of seconds, the matching process gets cancelled and its assumed that a
     * candidate is not a match.
     */
    public static int matchingTimeoutSeconds = 10;

    /**
     * FAISS parameter, number of clusters of the index.
     */
    public static int nlist = 1;

    /**
     * FAISS parameter, number of clusters considers while performing nearest neighbor search.
     */
    public static int nprobe = 1;

    public static String repositoryPath = "../dfs_repos/GitHub_JAVA/";
    public static String listOfRepositoriesPath = "./src/main/resources/Input/repositories_list_java.txt";

    public static String GITDIFF_FILE = "";
    public static int simpleBugPattern = 1;

    public static double FAISS_scalability_time = 0;

}
