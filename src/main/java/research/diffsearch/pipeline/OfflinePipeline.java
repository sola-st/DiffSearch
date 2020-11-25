package research.diffsearch.pipeline;

import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.PipelineOld;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.TreeObjectUtils;

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
            if (!PipelineOld.writeAndCheckLanguage(socket)) {
                return outputList;
            }

            /* FINAL MATCHING STAGE:  Deep tree comparison as final matching. */
            Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.CANDIDATE_CHANGES);
            ParseTree parseTree = TreeObjectUtils.getParseTree(queryTree, language);
            BufferedReader infoReader = PipelineOld.getInfoReader();

            for (String candidate : allLines) {
                String candidateUrl = infoReader.readLine();

                Object changeTree = TreeObjectUtils.getChangeTree(candidate, language);
                ParseTree changeParseTree = TreeObjectUtils.getParseTree(changeTree, language);
                Matching matching = new Matching(parseTree, TreeObjectUtils.getParser(queryTree, language));

                PipelineOld.updateOutputList(outputList, candidate, candidateUrl,
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
