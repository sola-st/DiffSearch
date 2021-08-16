package research.diffsearch.util;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureVector;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;

/**
 * @author Paul Bredl
 */
public class FilePathUtils {

    private static final Logger logger = LoggerFactory.getLogger(FilePathUtils.class);

    public static final String CANDIDATE_CHANGES = "./src/main/resources/Features_Vectors/candidate_changes.txt";
    public static final String CANDIDATE_CHANGES_INFO = "./src/main/resources/Features_Vectors/candidate_changes_info.txt";
    public static final String CANDIDATE_CHANGES_TREES = "./src/main/resources/Features_Vectors/candidate_changes_trees.txt";
    public static final String QUERY_FEATURE_VECTORS_CSV = "./src/main/resources/Features_Vectors/query_feature_vectors.csv";
    public static final String CHANGES_STRINGS_JAVA = "./src/main/resources/Features_Vectors/changes_strings_java.txt";
    public static final String CHANGES_STRINGS_JS = "./src/main/resources/Features_Vectors/changes_strings_js.txt";
    public static final String CHANGES_STRINGS_PYTHON = "./src/main/resources/Features_Vectors/changes_strings_py.txt";

    public static String getChangesFilePath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON:
                return CHANGES_STRINGS_PYTHON;
            case JAVASCRIPT:
                return CHANGES_STRINGS_JS;
            default:
                return CHANGES_STRINGS_JAVA;
        }
    }

    public static String getChangesInfoFilePath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON:
                return "./src/main/resources/Features_Vectors/changes_strings_prop_py.txt";
            case JAVASCRIPT:
                return "./src/main/resources/Features_Vectors/changes_strings_prop_js.txt";
            default:
                return "./src/main/resources/Features_Vectors/changes_strings_prop_java.txt";
        }
    }

    public static String getChangesJsonFilePath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON:
                return "./src/main/resources/Features_Vectors/changes_json_py.txt";
            case JAVASCRIPT:
                return "./src/main/resources/Features_Vectors/changes_json_js.txt";
            default:
                return "./src/main/resources/Features_Vectors/changes_json_java.txt";
        }
    }

    public static String getFeatureCSVPath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON:
                return "./src/main/resources/Features_Vectors/changes_feature_vectors_py.csv";
            case JAVASCRIPT:
                return "./src/main/resources/Features_Vectors/changes_feature_vectors_js.csv";
            default:
                return "./src/main/resources/Features_Vectors/changes_feature_vectors_java.csv";
        }
    }

    public static String getTreesFilePath(ProgrammingLanguage language) {
        switch (language) {
            case PYTHON:
                return "./src/main/resources/Features_Vectors/changes_trees_py.txt";
            case JAVASCRIPT:
                return "./src/main/resources/Features_Vectors/changes_trees_js.txt";
            default:
                return "./src/main/resources/Features_Vectors/changes_trees_java.txt";
        }
    }

    public static String getIndexFilePath(ProgrammingLanguage language) {
        return "./src/main/resources/Features_Vectors/faiss_" + language.toString() + ".index";
    }

    public static Collection<String> getAllLines(String path, int numberOfLines) {
        return new AbstractCollection<>() {
            @Override
            public Iterator<String> iterator() {
                try {
                    return FileUtils.lineIterator(new File(path));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public int size() {
                return numberOfLines;
            }
        };
    }

    public static Iterable<String> getAllLines(String path) {
        return () -> {
            try {
                return FileUtils.lineIterator(new File(path));
            } catch (IOException e) {
                return Collections.emptyIterator();
            }
        };
    }

    public static int getNumberOfLines(String filePath) {
        try {
            return Iterators.size(FileUtils.lineIterator(new File(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Loads all code changes from disk.
     *
     * @param codeChangeFilePath path to the json code changes
     * @param treesFilePath      path to the json tress of the code changes.
     * @param size               number of code changes of the corpus.
     * @return a collection of all code changes at the given paths.
     */
    public static Collection<CodeChange> getCodeChanges(String codeChangeFilePath,
                                                        String treesFilePath,
                                                        int size) {
        return new AbstractCollection<>() {
            @Override
            public Iterator<CodeChange> iterator() {
                return getCodeChanges(codeChangeFilePath, treesFilePath).iterator();
            }

            @Override
            public int size() {
                return size;
            }
        };
    }

    public static Collection<CodeChange> getCodeChanges(ProgrammingLanguage lang) {
        return getCodeChanges(
                getChangesJsonFilePath(lang),
                getTreesFilePath(lang),
                getNumberOfLines(getChangesJsonFilePath(lang)));
    }

    public static Iterable<CodeChange> getCodeChanges(String codeChangeFilePath,
                                                      @Nullable String parseTreesFilePath) {
        return () -> new Iterator<>() {

            final Gson gson = new Gson();
            final Iterator<String> codeChangeIterator = getAllLines(codeChangeFilePath).iterator();
            Iterator<String> treesIterator = null;
            {
                if (parseTreesFilePath != null) {
                    treesIterator = getAllLines(parseTreesFilePath).iterator();
                }
            }

            int index = 0;

            @Override
            public boolean hasNext() {
                return codeChangeIterator.hasNext()
                       && treesIterator == null
                       || treesIterator.hasNext();
            }

            @Override
            public CodeChange next() {
                String codeChangeJson = codeChangeIterator.next();
                String parseTreeJson = treesIterator == null ? null : treesIterator.next();

                index++;
                var codeChange = gson.fromJson(codeChangeJson, CodeChange.class);
                codeChange.setRank(index);
                if (parseTreeJson != null) {
                    codeChange.setJSONParseTree(parseTreeJson);
                }
                return codeChange;
            }
        };
    }

    public static BufferedWriter getWriter(String path) throws IOException {
        return new BufferedWriter(new FileWriter(path));
    }

    public static List<String[]> readCSV(String path, String delim) {
        return Lists.newArrayList(readCSVLineByLine(path, delim));
    }

    public static Iterable<String[]> readCSVLineByLine(String path, String delim) {
        return () -> {
            Iterator<String> lines = getAllLines(path).iterator();

            return new Iterator<>() {
                @Override
                public boolean hasNext() {
                    return lines.hasNext();
                }

                @Override
                public String[] next() {
                    return lines.next().split(delim);
                }
            };
        };
    }

    public static <T> void readCSVToMap(String path,
                                        String delim,
                                        Map<String, T> map,
                                        Function<String, T> converter) {
        readCSV(path, delim)
                .stream()
                .filter(array -> array.length > 1)
                .forEach(columns -> map.put(columns[0], converter.apply(columns[1])));
    }

    public static <T> Pipeline<T, T> getStringFileWriterPipeline(String path) throws IOException {
        return getStringFileWriterPipeline(path, Objects::toString);
    }

    public static <T> Pipeline<T, T> getStringFileWriterPipeline(String path, Function<T, String> mapper)
            throws IOException {

        return new Pipeline<>() {
            private final BufferedWriter writer = getWriter(path);

            @Override
            public T process(T input, int index) {
                try {
                    writer.write(mapper.apply(input) + "\n");
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                    throw new RuntimeException(e);
                }
                return input;
            }

            @Override
            public void after() {
                logger.debug("Closing writer.");
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    public static Pipeline<FeatureVector, FeatureVector> getVectorFileWriterPipeline(String path) throws IOException {
        return getStringFileWriterPipeline(path, Util::featureVectorToString)
                .connect(FeatureVector::clear);
    }

    public static <T> Pipeline<T, T> getJSONFileWriterPipeline(String path) throws IOException {
        return getStringFileWriterPipeline(path, tree -> new Gson().toJson(tree));
    }
}
