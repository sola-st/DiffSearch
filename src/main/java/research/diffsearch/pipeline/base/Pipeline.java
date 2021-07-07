package research.diffsearch.pipeline.base;

import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

/**
 * Provides an interface for pipelining functions, similar to Java streams.
 *
 * @param <I> input type of this pipeline
 * @param <O> output type of this pipeline
 * @author Paul Bredl
 */
public interface Pipeline<I, O> {

    /**
     * Processes an input.
     *
     * @param input the input. Is always non null.
     * @param index the index of the input.
     * @return the result or null, if the input should be filtered out.
     * @implNote subclasses should overwrite this if they do not need an asynchronous result
     * callback.
     */
    O process(I input, int index);

    /**
     * Processes an input.
     *
     * @param input          the input. Can be null, representing an absent value
     *                       at the given index.
     * @param index          the index of the input.
     * @param outputConsumer callback object for the result. Must be called in any case,
     *                       otherwise the pipeline will be stuck.
     * @implNote subclasses should overwrite this if they need the callback to be asynchronous.
     */
    default void process(I input, int index, IndexedConsumer<O> outputConsumer) {
        try {
            if (input != null) {
                outputConsumer.accept(process(input, index), index);
            } else {
                outputConsumer.skip(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Executes the pipeline on the given inputs.
     *
     * @param inputs the inputs to process
     * @param size   the number of inputs
     * @return the calculated outputs.
     */
    default List<O> execute(Iterable<I> inputs, int size) {
        var collectedResults = new ArrayList<O>();

        return execute(inputs, size, collectedResults);
    }

    /**
     * Executes the pipeline on the given inputs.
     *
     * @param inputs the inputs to process
     * @return the calculated outputs.
     */
    default List<O> execute(Collection<I> inputs) {
        return execute(inputs, inputs.size());
    }

    /**
     * Executes the pipeline on the given input.
     *
     * @param input the input to process
     * @return the calculated output, possibly empty.
     */
    default Optional<O> execute(I input) {
        return execute(List.of(input)).stream().findFirst();
    }

    private List<O> execute(Iterable<I> inputs, int size, ArrayList<O> collectedResults) {
        if (!inputs.iterator().hasNext()) {
            return Collections.emptyList();
        }
        Object sync = new Object();
        var executor = Executors.newSingleThreadExecutor();

        before(size);

        executor.submit(() -> processAllInputs(inputs, size, sync, collectedResults));

        synchronized (sync) {
            try {
                sync.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        after();
        executor.shutdown();
        return collectedResults;
    }

    private void processAllInputs(Iterable<I> inputs, int size, Object sync, ArrayList<O> collectedResults) {
        int index = 0;
        AtomicInteger processed = new AtomicInteger(0);

        for (I input : inputs) {
            process(input, index, (result, index1) -> {
                processed.getAndIncrement();
                if (collectedResults != null && result != null) {
                    synchronized (collectedResults) {
                        collectedResults.add(result);
                    }
                }
                if (processed.get() == size) {
                    // all inputs processed
                    synchronized (sync) {
                        sync.notifyAll();
                    }
                }
            });
            index++;
        }
    }

    /**
     * Executes the pipeline on all given inputs but does not collect the results.
     *
     * @param inputs inputs that should be processed.
     * @param size   number of inputs.
     */
    default void executeIgnoreResults(Iterable<I> inputs, int size) {
        execute(inputs, size, null);
    }

    /**
     * Executes the pipeline on all given inputs but does not collect the results.
     *
     * @param inputs inputs that should be processed.
     */
    default void executeIgnoreResults(Collection<I> inputs) {
        executeIgnoreResults(inputs, inputs.size());
    }

    /**
     * Connects another pipeline to this.
     *
     * @param <N> the output type of the other pipeline.
     * @return a pipeline object that combines this and the other pipeline.
     */
    default <N> Pipeline<I, N> connect(Pipeline<O, N> otherPipeline) {
        return new Pipeline<>() {
            @Override
            public void before(int size) {
                Pipeline.this.before(size);
                otherPipeline.before(size);
            }

            @Override
            public N process(I input, int index) {
                throw new IllegalStateException(); // unused
            }

            @Override
            public void process(I input, int index, IndexedConsumer<N> outputConsumer) {
                Pipeline.this.process(input, index, (firstOutput, index2) ->
                        otherPipeline.process(firstOutput, index2, outputConsumer));
            }

            @Override
            public void after() {
                Pipeline.this.after();
                otherPipeline.after();
            }
        };
    }

    /**
     * Connects another pipeline to this if a particular condition is true.
     *
     * @return either this pipeline if the condition is false or the combined pipeline
     * of this and the other pipeline.
     */
    default Pipeline<I, O> connectIf(boolean condition, Pipeline<O, O> otherPipeline) {
        if (condition) {
            return connect(otherPipeline);
        } else {
            return this;
        }
    }

    default <N> Pipeline<I, N> connect(Function<O, N> function) {
        return connect(Pipeline.from(function));
    }

    default Pipeline<I, O> filter(Predicate<O> predicate) {
        return connect(getFilter(predicate));
    }

    default Pipeline<I, O> filter(BiPredicate<O, Integer> predicate) {
        return connect(getFilter(predicate));
    }

    default Pipeline<I, O> peek(Consumer<O> watcher) {
        return new Pipeline<>() {
            @Override
            public void before(int size) {
                Pipeline.this.before(size);
            }

            @Override
            public O process(I input, int index) {
                // unused.
                throw new IllegalStateException();
            }

            @Override
            public void process(I input, int index, IndexedConsumer<O> outputConsumer) {
                Pipeline.this.process(input, index, (firstOutput, index2) -> {
                    if (input != null) {
                        watcher.accept(firstOutput);
                    }
                    outputConsumer.accept(firstOutput, index2);
                });
            }

            @Override
            public void after() {
                Pipeline.this.after();
            }
        };
    }

    default Pipeline<I, O> peek(BiConsumer<O, Integer> watcher) {
        return new Pipeline<>() {
            @Override
            public void before(int size) {
                Pipeline.this.before(size);
            }

            @Override
            public O process(I input, int index) {
                throw new IllegalStateException();
            }

            @Override
            public void process(I input, int index, IndexedConsumer<O> outputConsumer) {
                Pipeline.this.process(input, index, (firstOutput, index2) -> {
                    if (input != null) {
                        watcher.accept(firstOutput, index2);
                    }
                    outputConsumer.accept(firstOutput, index2);
                });
            }

            @Override
            public void after() {
                Pipeline.this.after();
            }
        };
    }

    default Pipeline<I, O> parallelUntilHere() {
        return parallelUntilHere(Runtime.getRuntime().availableProcessors() - 3);
    }

    default Pipeline<I, O> parallelUntilHere(int threadCount) {
        return new ParallelPipeline<>(this, threadCount);
    }

    default Pipeline<I, O> withTimeout(int timeout, TimeUnit timeUnit, O defaultResult) {
        return new TimeoutPipeline<>(timeout, timeUnit, this, defaultResult);
    }

    /**
     * This method is called before the first input gets processed.
     *
     * @param size the size of the batch to process.
     */
    default void before(int size) {
        LoggerFactory.getLogger(getClass()).debug("Starting pipeline: {}", getClass().getName());
        // empty by default
    }

    /**
     * This method is called after the processing of a batch.
     */
    default void after() {
        LoggerFactory.getLogger(getClass()).debug("Finish pipeline: {}", getClass().getName());
        // empty by default
    }

    static <T> Pipeline<T, T> getFilter(Predicate<T> predicate) {
        return (input, index) -> {
            if (predicate.test(input)) {
                return input;
            } else {
                return null;
            }
        };
    }

    static <T> Pipeline<T, T> getFilter(BiPredicate<T, Integer> predicate) {
        return (input, index) -> {
            if (predicate.test(input, index)) {
                return input;
            } else {
                return null;
            }
        };
    }

    static <T, R> Pipeline<T, R> from(Function<T, R> function) {
        return (input, index) -> function.apply(input);
    }

    static <T, R> Pipeline<T, R> from(BiFunction<T, Integer, R> function) {
        return function::apply;
    }
}
