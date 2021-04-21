package research.diffsearch.pipeline.base;

/**
 * Helper interface for pipelines.
 */
public interface IndexedConsumer<O> {

    void accept(O result, int index);

    default void skip(int index) {
        accept(null, index);
    };
}
