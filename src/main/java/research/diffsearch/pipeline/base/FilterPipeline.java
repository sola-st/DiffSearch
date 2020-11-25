package research.diffsearch.pipeline.base;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public interface FilterPipeline<T> extends Pipeline<List<T>, List<T>> {

    boolean filter(T input);

    @Override
    default void process(List<T> input, int index, BiConsumer<List<T>, Integer> outputConsumer) {
        outputConsumer.accept(
                input.stream()
                        .filter(this::filter)
                        .collect(Collectors.toList()),
                index);
    };
}
