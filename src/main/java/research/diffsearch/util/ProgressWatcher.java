package research.diffsearch.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;

public class ProgressWatcher<T> implements Pipeline<T, T> {

    private final int size;
    private final String progressName;
    private final double[] steps;
    private int currentStepIndex = 0;
    private long startTime = 0;
    private final Logger logger = LoggerFactory.getLogger(ProgressWatcher.class);

    public ProgressWatcher(int size, String progressName, double... steps) {
        this.size = size;
        this.progressName = progressName;
        this.steps = steps;
    }

    public ProgressWatcher(int size, String progressName) {
        this(size, progressName, 0.25, 0.50, 0.75);
    }

    @Override
    public void process(T input, int index, IndexedConsumer<T> outputConsumer) {
        if (startTime == 0) {
            startTime = System.currentTimeMillis();
            logger.info("{} started", progressName);
        }
        if (currentStepIndex < steps.length) {
            if (index / (double) size >= steps[currentStepIndex]) {
                logger.info("{}: {}% ({}/{})", progressName, Math.round(steps[currentStepIndex] * 100), index, size);
                currentStepIndex++;
            }
        }
        outputConsumer.accept(input, index);
    }

    @Override
    public void after() {
        long endTime = System.currentTimeMillis();
        logger.info("{} done in {}", progressName,
                Util.formatDuration(startTime, endTime));
    }

}
