package research.diffsearch;

import research.diffsearch.util.ProgrammingLanguage;

public class Config {

    //public static String PYTHON_CMD= "/home/luca/anaconda3/bin/python3.7";
    public static String PYTHON_CMD = "python3";
    public static String GITDIFF_FILE = "";

    //Programming language supported: PYTHON3, JAVA
    public static ProgrammingLanguage PROGRAMMING_LANGUAGE = ProgrammingLanguage.JAVA;

    //Constants that enable/disable part of the tool
    public static boolean LOG_FILE  = false;
    public static boolean SCALABILITY  = false;
    public static boolean EFFECTIVENESS  = false;
    public static boolean NORMAL  = false;
    public static boolean WEB  = true;
    public static boolean WEB_GUI  = false;
    public static boolean ONLY_JAVA = false;
    public static boolean QUERY_MODE = false;
    public static boolean MEASURE_RECALL = false;
    public static String query = "";

    // TODO use
    public static int k = 1000;
    public static int SINGLE_FEATURE_VECTOR_LENGTH = 1024;
    public static boolean SILENT = false;
    public static boolean CORPUS_FEATURE_EXTRACTION = false;
    public static boolean BATCH = false;

    // socket
    public static int port_web = 8843;

    public static String host = "localhost";
    public static int port = 5002;

    //Files
    public static String server_log_file = "./src/main/resources/Features_Vectors/server_log.log";

}
