package research.diffsearch.main;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.tree.SerializableTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgressWatcher;
import research.diffsearch.util.Util;

import java.io.IOException;

import static research.diffsearch.util.FilePathUtils.*;

public class ParseMode extends App {
    private static final Logger logger = LoggerFactory.getLogger(ParseMode.class);

    @Override
    public void run() {
        var lang = Config.PROGRAMMING_LANGUAGE;
        var numberOfLines = getNumberOfLines(getChangesFilePath(lang));

        try {
            // first parse code changes
            Pipeline
                    // check for correct formatting and illegal characters
                    .from(Util::formatCodeChange)
                    // parse with ANTLR
                    .connect(ParseMode::parseCodeChange)
                    .connect(ParseMode::toSerializableTree)
                    .parallelUntilHere(Config.threadCount)
                    // show progress in console:
                    .connect(new ProgressWatcher<>("Parsing code changes"))
                    // store parse trees in file
                    .connect(getJSONFileWriterPipeline(getTreesFilePath(lang)))
                    .executeIgnoreResults(getAllLines(getChangesFilePath(lang), numberOfLines));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    private static ParseTree parseCodeChange(String cc) {
        return TreeFactory.getAbstractTree(cc, Config.PROGRAMMING_LANGUAGE).getParseTree();
    }

    private static Tree toSerializableTree(ParseTree absTree) {
        return SerializableTreeNode.fromTree(absTree, Config.PROGRAMMING_LANGUAGE.getRuleNames());
    }
}
