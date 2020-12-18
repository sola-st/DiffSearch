package research.diffsearch.pipeline;

import org.eclipse.jgit.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;

import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

import static research.diffsearch.util.FilePathUtils.*;

/**
 * This pipeline is used to measure the recall of queries.
 * This process is very slow as it matches all the code changes of the corpus.
 */
public class RecallPipeline implements
        Pipeline<List<CodeChangeWeb>, List<CodeChangeWeb>>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(RecallPipeline.class);
    private static final String EXPECTED_VALUES_FILE = "./src/main/resources/Recall/ExpectedValues.csv";
    private static final String ACTUAL_VALUES_FILE = "./src/main/resources/Recall/ActualValues.csv";
    private static final String RECALL_VALUES_FILE = "./src/main/resources/Recall/RecallResults.csv";
    private static final String PRECISION_VALUES_FILE = "./src/main/resources/Recall/PrecisionResults.csv";
    private static final String RECIPROCAL_RANK_VALUES_FILE = "./src/main/resources/Recall/ReciprocalRankResults.csv";

    private final ProgrammingLanguage language;
    private final List<String> queries;
    private final Map<String, Integer> expectedValues = new HashMap<>();
    private final Map<String, Integer> actualValues = new HashMap<>();
    private final Map<String, Double> recallValues = new HashMap<>();
    private final Map<String, Double> candidatePrecisionValues = new HashMap<>();
    private final Map<String, Double> reciprocalRankValues = new HashMap<>();

    public RecallPipeline(ProgrammingLanguage language, String query) {
        this(language, List.of(query));
    }

    public RecallPipeline(ProgrammingLanguage language, List<String> queries) {
        this.language = language;
        this.queries = queries;
        readExpectedValuesFromFile();
    }

    public RecallPipeline(ProgrammingLanguage language) {
        this(language, new ArrayList<>());
    }

    int getTotalNumberOfExpectedResults(String query, ProgrammingLanguage language) {
        if (!expectedValues.containsKey(query)) {
            logger.debug("Need to calculate expected value");

            // load all code changes from file
            var codeChanges = getCodeChanges(
                    getChangesFilePath(language), getChangesInfoFilePath(language), query);

            var expectedValue = new MatchingPipeline(language)
                    .collect(codeChanges)
                    .map(List::size)
                    .orElse(0);

            expectedValues.put(query, expectedValue);
        }
        return expectedValues.get(query);
    }

    @Override
    public void process(List<CodeChangeWeb> input, int index, IndexedConsumer<List<CodeChangeWeb>> resultConsumer) {
        try {
            logger.warn("Recall measurement is active. This may have a heavy impact on performance!");

            String query = input.isEmpty() ? this.queries.get(index) : input.get(0).query;
            int numOfCandidates = input.isEmpty() ? 1 : input.get(0).numberOfCandidateChanges;
            double expected = 1; // by default recall will result in 0%
            if (query != null) {
                expected = getTotalNumberOfExpectedResults(query, getProgrammingLanguage());
            }

            computeAndSaveRecall(input, query, expected);
            computeAndSaveCandidatePrecision(input, query, expected, numOfCandidates);
            computeAndSaveReciprocalRank(input, query);

            resultConsumer.accept(input, index);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    private void computeAndSaveCandidatePrecision(List<CodeChangeWeb> input, String query, double expected, int k) {
        var precision = input.size() / (Math.min(expected, k));
        logger.info("Candidate changes precision: {}", precision);
        candidatePrecisionValues.put(query, precision);
    }

    private void computeAndSaveReciprocalRank(List<CodeChangeWeb> input, String query) {
        var rRank = input.stream()
                .mapToInt(CodeChangeWeb::getRank)
                .min()
                .stream()
                .mapToDouble(rank -> 1.0 / rank)
                .findAny()
                .orElse(0.0);
        logger.info("Reciprocal rank: {}", rRank);
        reciprocalRankValues.put(query, rRank);
    }

    private void computeAndSaveRecall(List<CodeChangeWeb> input, String query, double expected) {
        int actualResults = input.size();
        logger.debug("Expected {} results.", expected);
        actualValues.put(query, actualResults);

        double recall = actualResults / expected;
        if (expected == 0) {
            recall = actualResults > 0.0 ? actualResults * 1.0 : 1.0;
        }

        logger.info("Recall: {}", recall);
        recallValues.put(query, recall);
    }

    private void readExpectedValuesFromFile() {
        readCSV(EXPECTED_VALUES_FILE, "\\$")
                .stream()
                .filter(array -> array.length > 1)
                .forEach(columns -> expectedValues.put(columns[0], Integer.parseInt(columns[1])));
    }

    @SafeVarargs
    private static void writeValuesToFile(String path,
                                          Map<String, ?> map, Map<String, ?>... additionalMaps)
            throws IOException {
        writeValuesToFile(null, path, map, additionalMaps);
    }

    @SafeVarargs
    private static void writeValuesToFile(@Nullable List<String> orderedKeys, String path,
                                          Map<String, ?> map, Map<String, ?>... additionalMaps)
            throws IOException {
        try (var writer = getWriter(path)) {
            var keys = orderedKeys == null ? map.keySet() : orderedKeys;
            keys.forEach(query -> {
                try {
                    writer.write(query);
                    Stream.concat(Stream.of(map), Stream.of(additionalMaps))
                            .forEach(valueMap -> {
                                var expected = valueMap.getOrDefault(query, null);
                                try {
                                    writer.write("$");
                                    writer.write(Objects.toString(expected).replace('.', ','));
                                } catch (IOException exception) {
                                    throw new RuntimeException(exception);
                                }
                            });
                    writer.newLine();
                } catch (Exception exception) {
                    logger.error(exception.getMessage(), exception);
                }
            });
        }
    }

    @Override
    public void after() {
        try {
            writeValuesToFile(EXPECTED_VALUES_FILE, expectedValues);
            writeValuesToFile(queries, RECALL_VALUES_FILE, actualValues, recallValues,
                    candidatePrecisionValues, reciprocalRankValues);
            logger.debug("Recall results saved.");
        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }
}
