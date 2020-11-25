package research.diffsearch.util;

import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;
import research.diffsearch.PipelineOld;
import research.diffsearch.pipeline.base.Pipeline;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class FilePathUtils {
    public static final String CANDIDATE_CHANGES = "./src/main/resources/Features_Vectors/candidate_changes.txt";
    public static final String CANDIDATE_CHANGES_INFO = "./src/main/resources/Features_Vectors/candidate_changes_info.txt";
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

    public static String getChangesInfoFilePath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON: return "./src/main/resources/Features_Vectors/candidate_changes_prop.txt";
            case JAVASCRIPT: return "./src/main/resources/Features_Vectors/candidate_changes_prop_js.txt";
            default: return "./src/main/resources/Features_Vectors/candidate_changes_prop_java.txt";
        }
    }

    public static String getFeatureCSVPath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON: return "./src/main/resources/Features_Vectors/changes_feature_vectors_py.csv";
            case JAVASCRIPT: return "./src/main/resources/Features_Vectors/changes_feature_vectors_js.csv";
            default: return "./src/main/resources/Features_Vectors/changes_feature_vectors_java.csv";
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

    public static Iterable<CodeChangeWeb> getCodeChanges(String codeChangeFilePath, String infoFilePath, String query) {
        return () -> new Iterator<>() {
            final Iterator<String> codeChangeIterator;
            final Iterator<String> infoIterator;
            {
                try {
                    codeChangeIterator = FileUtils.lineIterator(new File(codeChangeFilePath));
                    infoIterator = FileUtils.lineIterator(new File(infoFilePath));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public boolean hasNext() {
                return codeChangeIterator.hasNext() && infoIterator.hasNext();
            }

            @Override
            public CodeChangeWeb next() {
                String candidateUrl = infoIterator.next();
                String candidate = codeChangeIterator.next();
                List<String> list = Arrays.asList(candidate.split("-->"));
                String[] urlLine =
                        PipelineOld.computeCandidateUrl(candidateUrl).split("-->");
                return new CodeChangeWeb(urlLine[0], urlLine[1],
                        list.get(0).trim(), list.get(1).trim(), query);
            }
        };
    }

    public static BufferedWriter getWriter(String path) throws IOException {
        return new BufferedWriter(new FileWriter(path));
    }

    public static <T> Pipeline<T, T> getStringFileWriterPipeline(String path) throws IOException {
        return new Pipeline<>() {
            private final BufferedWriter writer = getWriter(path);

            @Override
            public void process(T input, int index, BiConsumer<T, Integer> outputConsumer) {
                try {
                    writer.write(input.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void after() {
                try {
                    LoggerFactory.getLogger(getClass()).debug("Writer closed.");
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    public static <T> Pipeline<List<T>, List<T>> getListFileWriterPipeline(String path) throws IOException {
        return new Pipeline<>() {
            private final BufferedWriter writer = getWriter(path);

            @Override
            public void process(List<T> input, int index, BiConsumer<List<T>, Integer> outputConsumer) {
                try {
                    writer.write(input.stream().map(Object::toString).collect(Collectors.joining("\n")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void after() {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
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
