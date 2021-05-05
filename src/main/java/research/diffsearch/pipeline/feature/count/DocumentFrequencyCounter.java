package research.diffsearch.pipeline.feature.count;

import com.google.common.primitives.Ints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.pipeline.feature.FeatureVector;
import research.diffsearch.util.FilePathUtils;

import java.io.IOException;
import java.util.stream.StreamSupport;

import static research.diffsearch.util.FilePathUtils.getAllLines;

/**
 * @author Paul Bredl
 */
public class DocumentFrequencyCounter implements Pipeline<FeatureVector, FeatureVector> {

    private int[] documentFrequencies;

    private static final Logger logger = LoggerFactory.getLogger(DocumentFrequencyCounter.class);

    @Override
    public FeatureVector process(FeatureVector input, int index) {
        if (documentFrequencies == null) {
            documentFrequencies = new int[input.getVector().length];
        }

        for (int i = 0; i < input.getVector().length; i++) {
            if (input.getVector()[i] > 0) {
                documentFrequencies[i]++;
            }
        }

        return input;
    }

    public int getDocumentFrequency(int featureIndex) {
        return documentFrequencies[featureIndex];
    }

    public void saveToFile() {
        try {
            FilePathUtils
                    .<Integer>getStringFileWriterPipeline("./src/main/resources/frequency.csv")
                    .execute(Ints.asList(documentFrequencies));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    public void loadFromFile() {
        documentFrequencies = StreamSupport.stream(getAllLines(
                "./src/main/resources/frequency.csv").spliterator(), false)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    @Override
    public void after() {
        Pipeline.super.after();
        saveToFile();
    }
}
