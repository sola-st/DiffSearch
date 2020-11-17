package research.diffsearch.main;

import research.diffsearch.Config;
import research.diffsearch.pipeline.ScalabilityPipeline;

public class ScalabilityMode extends App {
    @Override
    public void run() {
        ScalabilityPipeline.runScalabilityPipeline(Config.PROGRAMMING_LANGUAGE);
    }
}
