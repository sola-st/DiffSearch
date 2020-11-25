package research.diffsearch.util;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class FilePathUtils {
    public static final String CANDIDATE_CHANGES = "./src/main/resources/Features_Vectors/candidate_changes.txt";
    public static final String QUERY_FEATURE_VECTORS_CSV = "./src/main/resources/Features_Vectors/query_feature_vectors.csv";
    public static final String CHANGES_STRINGS_JAVA = "./src/main/resources/Features_Vectors/changes_strings_java.txt";
    public static final String CHANGES_STRINGS_JS = "./src/main/resources/Features_Vectors/changes_strings_js.txt";
    public static final String CHANGES_STRINGS_PYTHON = "./src/main/resources/Features_Vectors/changes_strings.txt";

    public static String getChangesFilePath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON: return CHANGES_STRINGS_PYTHON;
            case JAVASCRIPT: return CHANGES_STRINGS_JS;
            default: return CHANGES_STRINGS_JAVA;
        }
    }

    public static Iterable<String> getAllLines(String path) {
        return () -> {
            try {
                return FileUtils.lineIterator(new File(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    public static BufferedWriter getWriter(String path) throws IOException {
        return new BufferedWriter(new FileWriter(path));
    }

    public static String getScalabilityInputPath(ProgrammingLanguage programmingLanguage) {
        String inputPath = "";
        switch (programmingLanguage) {
            case JAVA:
                inputPath = "./src/main/resources/scalability/Java/input.txt";
                break;
            case JAVASCRIPT:
                inputPath = "./src/main/resources/scalability/JavaScript/input.txt";
                break;
            default:
                inputPath = "./src/main/resources/scalability/Python/input.txt";
        }
        return inputPath;
    }

    public static String getScalabilityCSVFilePath(ProgrammingLanguage programmingLanguage) {
        String scalabilityFilePath;
        switch (programmingLanguage) {
            case JAVASCRIPT:
                scalabilityFilePath = "./src/main/resources/scalability/JavaScript/scalability_javaScript.csv";
                break;
            case JAVA:
                scalabilityFilePath = "./src/main/resources/scalability/Java/scalability_java.csv";
                break;
            default:
                scalabilityFilePath = "./src/main/resources/scalability/Python/scalability_python.csv";
        }
        return scalabilityFilePath;
    }
}
