package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static research.diffsearch.util.FilePathUtils.*;

public class RecallPipeline implements
        Pipeline<List<CodeChangeWeb>, List<CodeChangeWeb>>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(RecallPipeline.class);

    private final ProgrammingLanguage language;
    private final List<String> queries = new ArrayList<>();

    public RecallPipeline(ProgrammingLanguage language, String query) {
        this.language = language;
        if (query != null) {
            this.queries.add(query);
        }
    }

    public RecallPipeline(ProgrammingLanguage language)  {
        this(language, null);
    }

    static int getTotalNumberOfExpectedResults(String query, ProgrammingLanguage language) throws IOException {
        var codeChanges = getCodeChanges(
                getChangesFilePath(language), getChangesInfoFilePath(language), query);
        return new MatchingPipeline(language)
                .connect(getListFileWriterPipeline("./src/main/resources/Recall/recallResult" +
                                                   query.hashCode() + ".txt"))
                .collect(codeChanges)
                .map(List::size)
                .orElse(0);
    }

    @Override
    public void process(List<CodeChangeWeb> input, int index, IndexedConsumer<List<CodeChangeWeb>> resultConsumer) {
        try {
            logger.warn("Recall measurement is active. This will have a heavy impact on performance!");
            String query = input.isEmpty() ? this.queries.get(index) : input.get(0).query;
            double expected = 1; // recall will result in 0%
            if (query != null) {
                expected = getTotalNumberOfExpectedResults(query, getProgrammingLanguage());
            }
            int actualResults = input.size();
            logger.debug("Expected {} results.", expected);

            double result = actualResults / expected;
            if (expected == 0) {
                result = actualResults > 0.0 ? actualResults * 1.0 : 1.0;
            }

            logger.info("Recall: {}", result);
            resultConsumer.accept(input, index);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }
}
