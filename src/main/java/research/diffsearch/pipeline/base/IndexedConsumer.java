package research.diffsearch.pipeline.base;

/**
 * Helper interface for pipelines.
 *
 * @author Paul Bredl
 */
public interface IndexedConsumer<O> {

    void accept(O result, int index);

    default void skip(int index) {
        accept(null, index);
    };
}
