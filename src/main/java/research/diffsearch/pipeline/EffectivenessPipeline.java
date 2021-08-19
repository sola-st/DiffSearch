package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.main.App;
import research.diffsearch.main.NormalMode;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.util.Util;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EffectivenessPipeline extends App {

    private static final Logger logger = LoggerFactory.getLogger(NormalMode.class);

    private final Scanner scanner = new Scanner(System.in);

    private String readLine() {
        //System.out.println("Enter a query or --exit to quit.");
        return "ID.ID<0>(<...>); --> ID.ID<0>(<...>);";
    }

    @Override
    public void run() {
        try {
            startPythonServer();

            Socket socketFaiss = getFaissSocket();
            String nextLine;

            while (!(nextLine = readLine()).equals("--exit")) {
                new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                        // add recall pipeline if necessary
                        .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, nextLine))
                        .peek(result -> logger.info("Found {} results", result.getResults().size()))
                        .peek(Util::printOutputList)
                        .execute(nextLine);
                System.out.println("ok");
                break;
            }
        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
        }


    }
}
