package research.diffsearch;

import research.diffsearch.util.ProgrammingLanguage;

public class Config {

    public static String PYTHON_CMD = "python3";
    public static String GITDIFF_FILE = "";


    //Programming language supported: PYTHON3, JAVA, JAVASCRIPT
    public static ProgrammingLanguage PROGRAMMING_LANGUAGE = ProgrammingLanguage.PYTHON;
    public static String changes_string_path = "";
    public static String changes_string_prop_path = "";
    public static String index_path = "";
    public static String changes_feature_vectors = "";

    public static long code_changes_num = 0;

    //Constants that enable/disable part of the tool
    public static boolean LOG_FILE  = false;
    public static boolean SCALABILITY  = false;
    public static boolean EFFECTIVENESS  = false;
    public static boolean NORMAL  = false;
    public static boolean WEB  = false;
    public static boolean WEB_GUI  = true;
    public static boolean ONLY_JAVA = false;
    public static boolean QUERY_MODE = false;
    public static boolean MEASURE_RECALL = false;
    public static String query = "";
    public static boolean SILENT = false;
    public static boolean CORPUS_FEATURE_EXTRACTION = false;
    public static boolean DATASET_CREATION = false;

    public static int k = 1000;
    public static int SINGLE_FEATURE_VECTOR_LENGTH = 512;
    public static boolean BATCH = false;
    public static String batchFilePath = "./src/main/resources/queriesForRecall.txt";
    public static String batchOutput = "./src/main/resources/batchOutput.txt";
    public static String githubJava = "./src/main/resources/GitHub_Java";

    // socket
    public static int port_web = 8843;

    // for python
    public static String host = "localhost";
    public static int port = 5002;
    
    // Web application
    public static String web_url = "http://localhost:4200"; // angular development server

    //Files
    public static String server_log_file = "./src/main/resources/Features_Vectors/server_log.log";



}
