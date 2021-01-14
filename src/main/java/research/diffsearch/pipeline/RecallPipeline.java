package research.diffsearch.pipeline;

import org.eclipse.jgit.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.CodeChangeWeb;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
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
        Pipeline<DiffsearchResult, DiffsearchResult>, ProgrammingLanguageDependent {

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

    private int getTotalNumberOfExpectedResults(String query, ProgrammingLanguage language) {
        if (!expectedValues.containsKey(query)) {
            logger.debug("Need to calculate expected value");

            // load all code changes from file
            var codeChanges = getCodeChanges(
                    getChangesFilePath(language), getChangesInfoFilePath(language),
                    getNumberOfLines(getChangesFilePath(language)));

            var dfsResult = new DiffsearchResult(query, codeChanges);

            var expectedValue = new MatchingPipeline(language)
                    .collect(dfsResult)
                    .map(DiffsearchResult::getResults)
                    .map(Collection::size)
                    .orElse(0);

            expectedValues.put(query, expectedValue);
        }
        return expectedValues.get(query);
    }

    @Override
    public void process(DiffsearchResult input, int index, IndexedConsumer<DiffsearchResult> resultConsumer) {
        try {
            logger.warn("Recall measurement is active. This may have a heavy impact on performance!");

            String query = input.getQuery();
            int numOfCandidates = input.getCandidateChangeCount().orElse(0);
            int expected = 1; // by default recall will result in 0%
            if (query != null) {
                expected = getTotalNumberOfExpectedResults(query, getProgrammingLanguage());
            }
            input.setExpectedValueCount(expected);

            computeAndSaveRecall(input.getResults().size(), query, expected);

            computeAndSaveCandidatePrecision(input, expected, input.getResults().size(), numOfCandidates);

            computeAndSaveReciprocalRank(input, query);

            resultConsumer.accept(input, index);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    private void computeAndSaveCandidatePrecision(DiffsearchResult result, double expected, int actual, int k) {
        var precision = actual / (Math.min(expected, k));
        candidatePrecisionValues.put(result.getQuery(), precision);

        logger.info("Candidate changes precision: {}", precision);

        result.setCandidateChangePrecision(precision);
    }

    private void computeAndSaveReciprocalRank(DiffsearchResult input, String query) {
        var rRank = input.getResults().stream()
                .mapToInt(CodeChangeWeb::getRank)
                .min()
                .stream()
                .mapToDouble(rank -> 1.0 / rank)
                .findAny()
                .orElse(0.0);

        logger.info("Reciprocal rank: {}", rRank);
        reciprocalRankValues.put(query, rRank);
        input.setReciprocalRank(rRank);
    }

    private void computeAndSaveRecall(int actualResults, String query, double expected) {
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
    private static void writeValuesToFile(Map<String, ?> map, Map<String, ?>... additionalMaps)
            throws IOException {
        writeValuesToFile(null, RecallPipeline.EXPECTED_VALUES_FILE, map, additionalMaps);
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
            writeValuesToFile(expectedValues);
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
