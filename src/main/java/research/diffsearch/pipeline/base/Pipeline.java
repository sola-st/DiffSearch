package research.diffsearch.pipeline.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface Pipeline<I, O> {

    void process(I input, int index, IndexedConsumer<O> outputConsumer);

    default void execute(Iterable<I> inputs) {
        Object sync = new Object();
        var executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            int index = 0;
            var inputsList = StreamSupport.stream(inputs.spliterator(), false).collect(Collectors.toList());
            int size = inputsList.size();
            AtomicInteger processed = new AtomicInteger(0);

            for (I input : inputsList) {
                process(input, index, (result, index1) -> {
                    processed.getAndIncrement();
                    if (processed.get() == size) {
                        synchronized (sync) {
                            sync.notifyAll();
                        }
                    }
                }

                );
                index++;
            }
        });

        synchronized (sync) {
            try {
                sync.wait(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        after();
        executor.shutdown();
    }

    default void execute(I input) {
        execute(List.of(input));
    }

    default Optional<O> collect(I input) {
        try {
            return collect(List.of(input)).stream().findFirst();
        }
        catch(Exception e){
            return Optional.empty();
        }

    }

    default List<O> collect(Iterable<I> inputs) {
        Object sync = new Object();

        var collectedResults = new ArrayList<O>();
        var executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            int index = 0;

            var inputsList = StreamSupport.stream(inputs.spliterator(), false).collect(Collectors.toList());
            int size = inputsList.size();
            AtomicInteger processed = new AtomicInteger(0);

            for (I input : inputsList) {
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
                sync.wait(20000);
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

    default <N> Pipeline<I, N> connect(BiFunction<O, Integer, N> function) {
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

    default void after() {

    }

    static <T> Pipeline<T, T> getFilter(Predicate<T> predicate) {
        return (input, index, outputConsumer) -> {
            if (predicate.test(input)) {
                outputConsumer.accept(input, index);
            } else {
                outputConsumer.skip(index);
            }
        };
    }

    static <T> Pipeline<T, T> getFilter(BiPredicate<T, Integer> predicate) {
        return (input, index, outputConsumer) -> {
            if (input != null && predicate.test(input, index)) {
                outputConsumer.accept(input, index);
            } else {
                outputConsumer.skip(index);
            }
        };
    }

    static <T, R> Pipeline<T, R> from(Function<T, R> function) {
        return (input, index, outputConsumer) -> {
            if (input != null) {
                outputConsumer.accept(function.apply(input), index);
            } else {
                outputConsumer.skip(index);
            }
        };
    }

    static <T, R> Pipeline<T, R> from(BiFunction<T, Integer, R> function) {
        return (input, index, outputConsumer) -> {
            if (input != null) {
                outputConsumer.accept(function.apply(input, index), index);
            } else {
                outputConsumer.skip(index);
            }
        };
    }
}
