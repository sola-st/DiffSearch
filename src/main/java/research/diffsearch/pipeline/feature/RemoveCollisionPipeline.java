package research.diffsearch.pipeline.feature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.IndexedConsumer;
import research.diffsearch.pipeline.base.Pipeline;

/**
 * Removes and measures collisions in the feature vectors. In other words,
 * converts count vectors to binary vectors.
 */
public class RemoveCollisionPipeline implements Pipeline<FeatureVector, FeatureVector> {

    private final Logger logger = LoggerFactory.getLogger(RemoveCollisionPipeline.class);
    private int sum = 0;
    private int maxIndex = 0;
    private int collisions = 0;
    private int greaterZeroOccurrences = 0;
    private int maxCount = 0;

    @Override
    public void process(FeatureVector input, int index, IndexedConsumer<FeatureVector> outputConsumer) {
        if (input != null) {
            try {
                for (int i = 0; i < input.getVector().length; i++) {
                    if (input.getVector()[i] >= 1) {
                        if (maxCount < input.getVector()[i]) {
                            maxCount = input.getVector()[i];
                        }

                        sum += 1;
                        collisions += input.getVector()[i] - 1;
                        input.getVector()[i] = 1;
                        greaterZeroOccurrences++;
                    }
                }
                if (index > maxIndex) {
                    maxIndex = index;
                }
                outputConsumer.accept(input, index);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        } else {
            outputConsumer.skip(index);
        }
    }

    @Override
    public void after() {
        logger.debug("Average non zero columns per vector: {}", sum / (double) (maxIndex + 1));
        logger.debug("Average collisions per vector: {}", collisions / (double) (maxIndex + 1));
        logger.debug("Max count: {}", maxCount);
        logger.debug("Average count per non zero entry: {}",
                (collisions + greaterZeroOccurrences) / (double) (greaterZeroOccurrences));
    }
}
