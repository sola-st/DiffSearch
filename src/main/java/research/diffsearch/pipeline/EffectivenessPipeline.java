package research.diffsearch.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Config;
import research.diffsearch.main.App;
import research.diffsearch.main.NormalMode;
import research.diffsearch.pipeline.OnlinePipeline;
import research.diffsearch.pipeline.RecallPipeline;
import research.diffsearch.util.Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class EffectivenessPipeline extends App {

    private static final Logger logger = LoggerFactory.getLogger(NormalMode.class);

    private final Scanner scanner = new Scanner(System.in);

    private String readLine() {
        //System.out.println("Enter a query or --exit to quit.");
        return "ID.ID<0>(); --> ID.ID<0>();";
    }

    @Override
    public void run() {
        try {
            startPythonServer();

            Socket socketFaiss = getFaissSocket();
            String nextQuery;

            Config.simpleBugPattern = 0;

            while(Config.simpleBugPattern < 12) {

                Config.simpleBugPattern++;

                FileInputStream fstream = new FileInputStream("./src/main/resources/Effectiveness/" + Config.simpleBugPattern + "/queries.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                while ((nextQuery = br.readLine()) != null) {
                    new OnlinePipeline(socketFaiss, Config.PROGRAMMING_LANGUAGE)
                            // add recall pipeline if necessary
                            .connectIf(Config.MEASURE_RECALL, new RecallPipeline(Config.PROGRAMMING_LANGUAGE, nextQuery))
                            .peek(result -> logger.info("Found {} results", result.getResults().size()))
                            .peek(Util::printOutputList)
                            .execute(nextQuery);
                    System.out.println("ok");

                }
            }
        } catch (IOException exception) {
            logger.error(exception.getMessage(), exception);
        }



    }
}
