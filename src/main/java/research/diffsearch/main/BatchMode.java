package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.util.Util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import static com.google.common.collect.Lists.newArrayList;
import static research.diffsearch.util.FilePathUtils.getAllLines;

/**
 * This mode is used to run a batch file of queries.
 * <p>
 * Usage: diffsearch -b <i>queries_file</i> <i>output_file</i>.
 *
 * @author Paul Bredl
 * @author Luca Di Grazia
 */
public class BatchMode extends App {

    private static final Logger logger = LoggerFactory.getLogger(BatchMode.class);

    @Override
    public void run() {
        try (FileOutputStream outputStream = new FileOutputStream(Config.batchOutput)) {
            startPythonServer();
            logger.info("DiffSearch in Batch mode");

            Socket socketFaiss = getFaissSocket();

            var queries = newArrayList(getAllLines(Config.batchFilePath));
            System.out.println("Query list size" + queries.size());
            new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                    .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, queries))
                    .peek(result -> Util.printOutputList(result,
                            new PrintStream(outputStream, true), false))
                    .execute(queries);
            System.out.println("line 45");
        } catch (IOException exception) {
            System.out.println("Exception occured");
            logger.error(exception.getMessage(), exception);
        }
    }
}
