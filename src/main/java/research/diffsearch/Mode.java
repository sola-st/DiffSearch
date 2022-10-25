package research.diffsearch;

public class Mode {
    public static boolean ABSTRACT_QUERY = false;
    public static boolean QUERYRESULT = false;
    /**
     * Run DiffSearch Evaluation as a command line app.
     */
    public static boolean SCALABILITY = false;
    /**
     * Run DiffSearch as a command line app.
     */
    public static boolean NORMAL = false;
    /**
     * Run DiffSearch as a web app.
     */
    public static boolean WEB = false;
    /**
     * Run DiffSearch as a web gui app.
     */
    public static boolean WEB_GUI = true;
    /**
     * If true, DiffSearch starts in query mode. This will execute a single query.
     *
     * @see Config#query
     */
    public static boolean QUERY_MODE = false;
    /**
     * If true, detailed feature vector analysis and parse tree will be printed.
     */
    public static boolean ANALYSIS_MODE = false;
    public static boolean PARSE_MODE = false;
    public static boolean DATASET_CREATION = false;
    /**
     * If true, DiffSearch will run in Batch mode. This will process all queries of a text file and
     * save the results to an output file. This will not store results if {@link Config#SILENT} is true.
     */
    public static boolean BATCH = false;
    /**
     * If true, DiffSearch will not run to execute queries but to extract the features of the corpus
     * and build an index.
     */
    public static boolean CORPUS_FEATURE_EXTRACTION = false;

    public static boolean GIT_CLONE = false;

    public static boolean EFFECTIVENESS = false;
}
