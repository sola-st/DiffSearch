package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.*;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.BaseFeatureExtractionPipeline;
import research.diffsearch.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import static research.diffsearch.util.FilePathUtils.*;

public class OnlinePipeline implements
        Pipeline<String, List<CodeChangeWeb>>,
        ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(OnlinePipeline.class);

    private final Socket pythonSocket;
    private final ProgrammingLanguage language;

    public OnlinePipeline(Socket pythonSocket, ProgrammingLanguage language) {
        this.pythonSocket = pythonSocket;
        this.language = language;
    }

    /**
     * Performs a diff search on the given query.
     *
     * @param query        : the search query.
     * @param socketPython : the python server socket.
     * @return a list of found code changes.
     */
    public static List<CodeChangeWeb> runDiffsearchOnline(String query,
                                                          Socket socketPython) {
        return runDiffsearchOnline(query, socketPython, Config.PROGRAMMING_LANGUAGE, Integer.MAX_VALUE);
    }

    /**
     * Performs a diff search on the given query.
     *
     * @param query         : the search query.
     * @param socketPython  : the python server socket.
     * @param language      : the programming language
     * @param matchingLimit : maximum amount of results, all other results will be capped.
     * @return a list of found code changes.
     */
    public static List<CodeChangeWeb> runDiffsearchOnline(String query,
                                                          Socket socketPython,
                                                          ProgrammingLanguage language,
                                                          int matchingLimit) {
        Object tree = FeatureExtractionPipelineOld.queryFeatureExtraction(query, language);
        if (tree == null) {
            logger.error("Illegal Query: {}", query);
            return PipelineOld.getErrorResult();
        }
        logger.info("Running diffsearch for query {}", query);
        return diffsearchOnline(tree, query, socketPython, language, matchingLimit);
    }

    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param treeQuery     : query Tree
     * @param socket        : python server socket
     * @param language      : the programming language
     * @param matchingLimit : maximum amount of results, all other results will be capped.
     * @return number of matching changes found
     */
    static List<CodeChangeWeb> diffsearchOnline(Object treeQuery, String query, Socket socket,
                                                ProgrammingLanguage language,
                                                int matchingLimit) {
        try {
            if (!PipelineOld.writeAndCheckLanguage(socket)) return Collections.emptyList();

            /* *******************************
             * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
             * */

            return processCandidates(treeQuery, query, language, matchingLimit);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static List<CodeChangeWeb> processCandidates(Object queryTree, String query,
                                                        ProgrammingLanguage language,
                                                        int matchingLimit) throws IOException {
        int matchingCounter = 0;
        ParseTree parseTreeQuery = TreeObjectUtils.getParseTree(queryTree, language);

        List<CodeChangeWeb> outputList = new ArrayList<>();
        Iterable<String> allLines = getAllLines(CANDIDATE_CHANGES);
        BufferedReader infoReader = PipelineOld.getInfoReader();

        for (String candidate : allLines) {
            String candidateUrl = infoReader.readLine();

            Object changeTree = TreeObjectUtils.getChangeTree(candidate, language);
            ParseTree changeParseTree = TreeObjectUtils.getParseTree(changeTree, language);

            Matching matching = new Matching(parseTreeQuery, TreeObjectUtils.getParser(queryTree, language));

            if (matching.isMatch(changeParseTree, TreeObjectUtils.getParser(changeTree, language))) {
                List<String> list = Arrays.asList(candidate.split("-->"));

                if (PipelineOld.isNotEqualCodeChange(candidate)) {
                    String[] urlLine =
                            PipelineOld.computeCandidateUrl(candidateUrl).split("-->");
                    CodeChangeWeb codeChangeWeb = new CodeChangeWeb(urlLine[0], urlLine[1],
                            list.get(0), list.get(1), query);
                    outputList.add(codeChangeWeb);

                    matchingCounter++;

                    if (matchingCounter == matchingLimit) {
                        return outputList;
                    }
                }
            }
        }
        return outputList;
    }

    @Override
    public void process(String input, int index, BiConsumer<List<CodeChangeWeb>, Integer> resultConsumer) {
        try {
            // write feature vector to file
            Pipeline.from(QueryUtil::formatQuery)
                    .connect(PipelineOld.getDefaultFeatureExtractionPipeline())
                    .connect(Util::featureVectorToString)
                    .connect(getStringFileWriterPipeline(QUERY_FEATURE_VECTORS_CSV))
                    .processSync(input);

            // matching/measurements in this pipeline
            if (PipelineOld.writeAndCheckLanguage(pythonSocket)) {
                resultConsumer.accept(
                        new MatchingPipeline(getProgrammingLanguage())
                                .processSync(getCodeChanges(CANDIDATE_CHANGES, CANDIDATE_CHANGES_INFO, input)),
                        index);
            } else {
                resultConsumer.accept(new ArrayList<>(0), index);
            }

        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public Socket getPythonSocket() {
        return pythonSocket;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }
}
