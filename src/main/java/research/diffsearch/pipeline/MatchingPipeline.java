package research.diffsearch.pipeline;

import com.google.gson.Gson;
import matching.Matching;
import org.antlr.v4.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.pipeline.base.DiffsearchResult;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.SerializableTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.ProgressWatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Pipeline to check if some candidate code change actually matches a query.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class MatchingPipeline
        implements Pipeline<DiffsearchResult, DiffsearchResult>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(MatchingPipeline.class);

    private final int matchingLimit;
    private final ProgrammingLanguage language;
    private int matchingCounter = 0;
    private AbstractTree queryTree = null;

    public MatchingPipeline(ProgrammingLanguage language) {
        this(language, Integer.MAX_VALUE);
    }

    /**
     * Creates new matching pipeline.
     *
     * @param language      programming language for the matching.
     * @param matchingLimit maximum amount of results. If this is reached, this pipeline will block all inputs.
     */
    public MatchingPipeline(ProgrammingLanguage language, int matchingLimit) {
        this.matchingLimit = matchingLimit;
        this.language = language;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }

    @Override
    public void process(DiffsearchResult input, int index, IndexedConsumer<DiffsearchResult> outputConsumer) {
        List<CodeChange> outputList = new ArrayList<>();

        if (queryTree == null) {
            queryTree = TreeFactory.getAbstractTree(input.getQuery(), language);
        }

        try {
            outputList =
                    Pipeline.getFilter(this::checkCandidate)
                            .withTimeout(Config.matchingTimeoutSeconds, TimeUnit.SECONDS, null)
                            .parallelUntilHere(Config.threadCount)
                            .connect(new ProgressWatcher<>("Matching"))
                            .execute(input.getResults());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        outputConsumer.accept(input.setResults(outputList), index);
    }

    @Override
    public DiffsearchResult process(DiffsearchResult input, int index) {
        throw new IllegalStateException();
    }

    private boolean checkCandidate(CodeChange candidateChange) {
        try {
            Tree parseTreeQuery = queryTree.getParseTree();
            Tree changeParseTree = getTree(candidateChange);

            Matching matching = new Matching(parseTreeQuery, queryTree.getParser());

            if (matchingCounter < matchingLimit &&
                matching.isMatch(changeParseTree, getProgrammingLanguage().getParser(candidateChange.getFullChangeString()))) {

                if (isNotEqualCodeChange(candidateChange)) {
                    matchingCounter++;
                    return true;
                }
            }
        } catch (Exception e) {
            logger.error("Error in " + candidateChange.toString(), e);
        }
        return false;
    }

    private Tree getTree(CodeChange candidateChange) {
        if (Config.LOW_RAM) {
            return TreeFactory.getAbstractTree(candidateChange.getFullChangeString(), getProgrammingLanguage())
                    .getParseTree();
        } else {
            SerializableTreeNode changeParseTree = new Gson().fromJson(candidateChange.getJSONParseTree(), SerializableTreeNode.class);
            changeParseTree.setConsistentParentChildRelations();
            return changeParseTree;
        }
    }

    public static boolean isNotEqualCodeChange(CodeChange codeChangeWeb) {
        return !codeChangeWeb.getCodeChangeNew().trim().equals(codeChangeWeb.getCodeChangeOld().trim());
    }

    @Override
    public void after() {
        queryTree = null;
    }
}
