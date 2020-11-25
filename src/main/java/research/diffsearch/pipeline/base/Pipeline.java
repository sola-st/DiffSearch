package research.diffsearch.pipeline.base;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Pipeline<I, O> {

    void process(I input, int index, BiConsumer<O, Integer> outputConsumer);

    default void execute(Iterable<I> inputs, BiConsumer<O, Integer> outputConsumer) {
        int index = 0;
        for (I input : inputs) {
            process(input, index, outputConsumer);
            index++;
        }
        after();
    }

    default void execute(Iterable<I> inputs) {
        execute(inputs, (o, integer) -> {
        });
    }

    default <N> Pipeline<I, N> connect(Pipeline<O, N> otherPipeline) {
        return new Pipeline<>() {
            @Override
            public void process(I input, int index, BiConsumer<N, Integer> outputConsumer) {
                Pipeline.this.process(input, index, (firstOutput, index2) ->
                        otherPipeline.process(firstOutput, index2, outputConsumer));
            }

            @Override
            public void after() {
                Pipeline.this.after();
                otherPipeline.after();
            }

            @Override
            public int getSize() {
                return Pipeline.this.getSize();
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

    default Pipeline<I, O> peek(Consumer<O> watcher) {
        return new Pipeline<>() {
            @Override
            public void process(I input, int index, BiConsumer<O, Integer> outputConsumer) {
                Pipeline.this.process(input, index, (firstOutput, index2) -> {
                    watcher.accept(firstOutput);
                    outputConsumer.accept(firstOutput, index2);
                });
            }

            @Override
            public void after() {
                Pipeline.this.after();
            }

            @Override
            public int getSize() {
                return Pipeline.this.getSize();
            }
        };
    }

    default Pipeline<I, O> peek(BiConsumer<O, Integer> watcher) {
        return new Pipeline<>() {
            @Override
            public void process(I input, int index, BiConsumer<O, Integer> outputConsumer) {
                Pipeline.this.process(input, index, (firstOutput, index2) -> {
                    watcher.accept(firstOutput, index2);
                    outputConsumer.accept(firstOutput, index2);
                });
            }

            @Override
            public void after() {
                Pipeline.this.after();
            }

            @Override
            public int getSize() {
                return Pipeline.this.getSize();
            }
        };
    }

    default Pipeline<I, O> parallel() {
        return new Pipeline<>() {
            private final ExecutorService executorService = Executors.newCachedThreadPool();
            private volatile int size = 0;

            @Override
            public synchronized void process(I input, int index, BiConsumer<O, Integer> outputConsumer) {

                if (index > size) {
                    size = index;
                }

                var future = executorService.submit(() -> {
                    Pipeline.this.process(input, index, outputConsumer);
                });

                if (index % 1000 == 0 && index != 0) {
                    try {
                        future.get();
                        TimeUnit.SECONDS.sleep(30);
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            @Override
            public void after() {
                Pipeline.this.after();
            }

            @Override
            public synchronized int getSize() {
                return size;
            }
        };
    }

    default Pipeline<I, O> synchronize() {
        return new Pipeline<>() {
            private final Map<Integer, O> queue = new ConcurrentHashMap<>();
            private volatile int currentIndex;
            private volatile boolean isFinished = false;
            private volatile boolean afterWasCalled = false;

            @Override
            public synchronized void process(I input, int index, BiConsumer<O, Integer> outputConsumer) {
                Pipeline.this.process(input, index, new BiConsumer<>() {
                    @Override
                    public synchronized void accept(O o, Integer innerIndex) {
                        if (innerIndex == currentIndex) {
                            outputConsumer.accept(o, innerIndex);
                            currentIndex++;
                            if (afterWasCalled && innerIndex == Pipeline.this.getSize()) {
                                isFinished = true;
                                after();
                            }
                        } else {
                            if (queue.size() % 1000 == 0 && !queue.isEmpty()) {
                                System.out.println("WArning, large queue with size " + queue.size());
                            }
                            queue.put(innerIndex, o);
                        }


                        for (Map.Entry<Integer, O> entry : queue.entrySet()) {
                            Integer key = entry.getKey();
                            if (key == currentIndex) {
                                accept(entry.getValue(), key);
                            }
                        }
                        queue.remove(currentIndex);
                    }
                });
            }

            @Override
            public int getSize() {
                return Pipeline.this.getSize();
            }

            @Override
            public synchronized void after() {
                afterWasCalled = true;
                if (isFinished) {
                    Pipeline.this.after();
                    // prevent multiple calls to this method
                    isFinished = false;
                }
            }
        };
    }

    default void after() {

    }

    default O processSync(I input, int index) {
        final Object[] result = new Object[]{null};
        process(input, index, (o, integer) -> result[0] = o);
        after();
        //noinspection unchecked
        return (O) result[0];
    }

    default O processSync(I input) {
        return processSync(input, 0);
    }

    default int getSize() {
        return -1;
    }

    static <T, R> Pipeline<T, R> from(Function<T, R> function) {
        return (input, index, outputConsumer) -> outputConsumer.accept(function.apply(input), index);
    }

    static <T, R> Pipeline<T, R> from(BiFunction<T, Integer, R> function) {
        return (input, index, outputConsumer) -> outputConsumer.accept(function.apply(input, index), index);
    }
}
