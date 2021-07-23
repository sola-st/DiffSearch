package research.diffsearch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.Change_extraction;

public class DatasetCreationMode extends App{
    private static final Logger logger = LoggerFactory.getLogger(DatasetCreationMode.class);

    @Override
    public void run() {
        long change_number = 0;

        //if(!clone_GitHub_repositories())
          //  logger.info("ERROR DURING CLONING GITHUB REPOSITORIES.\n");

        //git_diff();

        /* CHANGES EXTRACTED FROM A GIT DIFF OUTPUT*/

        logger.info("EXTRACTION FROM REPOSITORIES STARTED.\n");

        change_number = Change_extraction.analyze_diff_file_new_propagation();

        logger.info("EXTRACTION FROM FILE DONE WITH " + change_number + " CHANGES.\n");

    }
}
