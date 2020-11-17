package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Pipeline;
import research.diffsearch.ProgrammingLanguage;
import research.diffsearch.TreeObjectUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OfflinePipeline {

    private static final Logger logger = LoggerFactory.getLogger(OfflinePipeline.class);

    public static List<String> diffsearchOffline(Object queryTree, Socket socket, ProgrammingLanguage language) {
        try {
            logger.debug("Starting offline pipeline [{}]", language.name());
            List<String> outputList = new ArrayList<>();
            if (Pipeline.writeAndCheckLanguage(socket)) {
                return outputList;
            }

            /* FINAL MATCHING STAGE:  Deep tree comparison as final matching. */
            List<String> allLines = Pipeline.getAllLines("./src/main/resources/Features_Vectors/candidate_changes.txt");
            ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, language);
            BufferedReader infoReader = Pipeline.getInfoReader();

            for (String candidate : allLines) {
                String candidateUrl = infoReader.readLine();

                Object changeTree = TreeObjectUtils.getChangeTree(candidate, language);
                ParseTree changeParseTree = TreeObjectUtils.getParseTree(changeTree, language);
                Matching matching = new Matching(parseTree, TreeObjectUtils.getParser(queryTree, language));

                Pipeline.updateOutputList(outputList, candidate, candidateUrl,
                        matching.isMatch(changeParseTree, TreeObjectUtils.getParser(changeTree, language)), true);
            }

            return outputList;
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
