package research.diffsearch.pipeline.base;

import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Pipeline that times out the processing of an input after a certain time.
 *
 * @author Paul Bredl
 */
public class TimeoutPipeline<I, O> implements Pipeline<I, O> {

    private volatile boolean[] processed;
    private final long timeoutMillis;
    private ScheduledExecutorService executorService;
    private final Pipeline<I, O> basePipeline;
    private final O defaultResult;

    public TimeoutPipeline(long timeout, TimeUnit timeUnit, Pipeline<I, O> basePipeline, O defaultResult) {
        this.timeoutMillis = timeUnit.toMillis(timeout);
        this.basePipeline = basePipeline;
        this.defaultResult = defaultResult;
    }

    @Override
    public O process(I input, int index) {
        throw new IllegalStateException(); // unused
    }

    @Override
    public void process(I input, int index, IndexedConsumer<O> outputConsumer) {
        try {
            executorService.schedule(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (!processed[index]) {
                            processed[index] = true;
                            LoggerFactory.getLogger(getClass()).warn("Timout for " + input);
                            outputConsumer.accept(defaultResult, index);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, timeoutMillis, TimeUnit.MILLISECONDS);

            basePipeline.process(input, index, (result, index1) -> {
                try {
                    if (!processed[index1]) {
                        processed[index1] = true;
                        outputConsumer.accept(result, index1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void before(int size) {
        basePipeline.before(size);
        executorService = Executors.newSingleThreadScheduledExecutor();
        processed = new boolean[size];
    }

    @Override
    public void after() {
        executorService.shutdown();
        basePipeline.after();
    }
}
