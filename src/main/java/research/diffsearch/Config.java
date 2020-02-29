package research.diffsearch;

public class Config {

    public static String PYTHON_CMD= "/home/luca/anaconda3/bin/python3.7";
    //public static String pythonCmd = "python3";
    public static String GITDIFF_FILE = "htmldiff.txt";

    //Programming language supported: PYTHON3, JAVA
    public static String PROGRAMMING_LANGUAGE = "JAVA";

    //Constants that enable/disable part of the tool
    public static boolean INDEXING  = false;
    public static boolean SEARCHING = true;
    public static boolean CLEANUP   = false;
    public static boolean LOG_FILE  = false;

    //Socket
    public static String host = "localhost";
    public static int port = 5002;

}
