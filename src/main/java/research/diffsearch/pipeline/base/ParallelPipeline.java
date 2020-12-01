package research.diffsearch.pipeline.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Pipeline that processes inputs in other threads, but synchronizes the outputs so
 * they get returned in the right order.
 */
public class ParallelPipeline<I, O> implements Pipeline<I, O> {

    // pipeline to parallelize
    private final Pipeline<I, O> basePipeline;
    // queued results to synchronize
    private final Map<Integer, Optional<O>> queue = new ConcurrentSkipListMap<>();
    // current index of processing
    private final AtomicInteger currentIndex = new AtomicInteger();

    private final ExecutorService executorService;
    private final ExecutorService syncExecutorService = Executors.newSingleThreadExecutor();

    private final Logger logger = LoggerFactory.getLogger(ParallelPipeline.class);

    /**
     * Creates a new parallel pipeline wrapping the given pipeline.
     *
     * @param basePipeline pipeline which should be executed in parallel.
     * @param threadCount  number of threads in which the pipeline gets executed.
     */
    public ParallelPipeline(Pipeline<I, O> basePipeline, int threadCount) {
        this.basePipeline = basePipeline;
        executorService = Executors.newFixedThreadPool(threadCount);
    }

    private void passOnResult(O o, int innerIndex, IndexedConsumer<O> outputConsumer) {
        if (innerIndex == currentIndex.get()) {
            currentIndex.getAndIncrement();

            outputConsumer.accept(o, innerIndex);
        } else {
            // process later
            queue.put(innerIndex, Optional.ofNullable(o));
        }
    }

    private void manageQueue(O o, int innerIndex, IndexedConsumer<O> outputConsumer) {
        // synchronize in synchronizer thread
        syncExecutorService.submit(() -> {
            try {
                passOnResult(o, innerIndex, outputConsumer);
                // check queued vales
                for (var entry : queue.entrySet()) {
                    if (entry.getKey() == currentIndex.get()) {
                        queue.remove(entry.getKey());
                        passOnResult(entry.getValue().orElse(null), entry.getKey(), outputConsumer);
                    }
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        });
    }

    @Override
    public void process(I input, int index, IndexedConsumer<O> outputConsumer) {
        executorService.submit(() -> basePipeline.process(input, index,
                (o, innerIndex) -> ParallelPipeline.this.manageQueue(o, innerIndex, outputConsumer)));
    }

    @Override
    public void after() {
        executorService.shutdown();
        syncExecutorService.shutdown();
        basePipeline.after();
    }
}
