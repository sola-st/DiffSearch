package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureExtractionPipeline;
import research.diffsearch.util.CodeChangeWeb;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;
import research.diffsearch.util.QueryUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

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

    public static boolean sendMessageToPythonServer(Socket socket) {
        try {
            Objects.requireNonNull(socket);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();

            // double timePython = Double.parseDouble(stdIn.readLine().substring(0, 5));

            String in = stdIn.readLine();

            if (!in.equals("JAVA"))
                return false;

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            return false;
        }
        return true;
    }

    public List<CodeChangeWeb> runDiffSearch(String input) {
        try {
            logger.info("Processing query " + input);
            // write feature vector to file
            var featureVector = Pipeline.from(QueryUtil::formatQuery)
                    .filter((Predicate<String>) QueryUtil::checkIfQueryIsValid)
                    .connect(FeatureExtractionPipeline.getDefaultFeatureExtractionPipeline())
                    .connect(getVectorFileWriterPipeline(QUERY_FEATURE_VECTORS_CSV))
                    .collect(input);
            // query was invalid:
            if (featureVector.isEmpty()) {
                return List.of(CodeChangeWeb.INVALID_QUERY_CODE_CHANGE);
            }

            // matching in this pipeline
            if (sendMessageToPythonServer(pythonSocket)) {
                return new MatchingPipeline(getProgrammingLanguage())
                                .parallelUntilHere(16)
                                .collect(getCodeChanges(CANDIDATE_CHANGES, CANDIDATE_CHANGES_INFO, input))
                                .orElse(Collections.emptyList());
            } else {
                logger.error("Connection with python failed.");
            }

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return List.of(CodeChangeWeb.ERROR_CODE_CHANGE);
    }

    @Override
    public void process(String input, int index, IndexedConsumer<List<CodeChangeWeb>> resultConsumer) {
        resultConsumer.accept(runDiffSearch(input), index);
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }
}
