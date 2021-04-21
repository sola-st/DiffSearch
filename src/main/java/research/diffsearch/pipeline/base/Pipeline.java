package research.diffsearch.pipeline.base;

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
        if (input != null) {
            outputConsumer.accept(process(input, index), index);
        } else {
            outputConsumer.skip(index);
        }
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

    default List<O> execute(Collection<I> inputs) {
        return execute(inputs, inputs.size());
    }

    default List<O> execute(Iterable<I> inputs, int size) {
        if (!inputs.iterator().hasNext()) {
            return Collections.emptyList();
        }
        Object sync = new Object();

        var collectedResults = new ArrayList<O>();
        var executor = Executors.newSingleThreadExecutor();

        before(size);

        executor.submit(() -> {
            int index = 0;
            AtomicInteger processed = new AtomicInteger(0);

            for (I input : inputs) {
                process(input, index, (result, index1) -> {
                    synchronized (collectedResults) {
                        processed.getAndIncrement();
                        if (result != null) {
                            collectedResults.add(result);
                        }
                        if (processed.get() == size) {
                            synchronized (sync) {
                                sync.notifyAll();
                            }
                        }
                    }
                });
                index++;
            }
        });

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
        return parallelUntilHere(4);
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
        // empty by default
    }

    /**
     * This method is called after the processing of a batch.
     */
    default void after() {
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
