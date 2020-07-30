package research.diffsearch;

public class Config {

    //public static String PYTHON_CMD= "/home/luca/anaconda3/bin/python3.7";
    public static String PYTHON_CMD = "python3";
    public static String GITDIFF_FILE = "elastic.patch";

    //Programming language supported: PYTHON3, JAVA
    public static String PROGRAMMING_LANGUAGE = "JAVA_SCALABILITY";

    //Constants that enable/disable part of the tool
    public static boolean CLEANUP   = false;
    public static boolean LOG_FILE  = true;

    public static boolean SCALABILITY  = false;
    public static boolean EFFECTIVENESS  = false;
    public static boolean NORMAL  = false;
    public static boolean WEB  = true;

    //Socket
    public static String host_javascript = "localhost";
    public static int port_web = 8843;

    public static String host = "localhost";
    public static int port = 5002;

}
