package research.diffsearch.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;

import java.util.stream.IntStream;

import static java.text.MessageFormat.format;

/**
 * Shows the progress of the pipeline in a progressbar in the console.
 *
 * @author Paul Bredl
 */
public class ProgressWatcher<T> implements Pipeline<T, T> {

    private int size;
    private final String progressName;
    private final double[] steps;
    private int currentStepIndex = 0;
    private long startTime = 0;
    private final Logger logger = LoggerFactory.getLogger(ProgressWatcher.class);

    public ProgressWatcher(String progressName, double... steps) {
        this.progressName = progressName;
        this.steps = steps;
    }

    public ProgressWatcher(String progressName) {
        this(progressName, IntStream.range(1, 1000).mapToDouble(i -> i / 1000.0).toArray());
    }

    @Override
    public void process(T input, int index, IndexedConsumer<T> outputConsumer) {
        if (startTime == 0) {
            startTime = System.currentTimeMillis();
            logger.info("{} started", progressName);
        }
        if (currentStepIndex < steps.length) {
            if (index / (double) size >= steps[currentStepIndex]) {
                var percent = Math.round(steps[currentStepIndex] * 100);

                System.out.print("[ ");
                System.out.print("█".repeat((int) (percent / 5)));
                System.out.print("░".repeat((int) (20 - (percent / 5))));
                System.out.print(" ] ");
                System.out.print(format("{0}: {1}% ({2}/{3})", progressName,
                        Math.floor(steps[currentStepIndex] * 100), index, size));

                System.out.print("\r");

                currentStepIndex++;
            }
        }
        outputConsumer.accept(input, index);
    }

    @Override
    public T process(T input, int index) {
        throw new IllegalStateException(); // unused
    }

    @Override
    public void before(int size) {
        this.size = size;
    }

    @Override
    public void after() {
        long endTime = System.currentTimeMillis();
        logger.info("{} done in {}", progressName,
                Util.formatDuration(startTime, endTime));
    }

}
