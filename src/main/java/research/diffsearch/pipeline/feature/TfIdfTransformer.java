package research.diffsearch.pipeline.feature;

import research.diffsearch.pipeline.base.Pipeline;

import java.util.Arrays;

public class TfIdfTransformer implements Pipeline<double[], double[]> {

    private final DocumentFrequencyCounter counter;
    private final int numberOfDocuments;

    public TfIdfTransformer(DocumentFrequencyCounter counter, int numberOfDocuments) {
        this.counter = counter;
        this.numberOfDocuments = numberOfDocuments;
    }

    @Override
    public double[] process(double[] input, int index) {
        var maxTermFrequency = Arrays.stream(input)
                .max()
                .orElse(1);

        for (int i = 0; i < input.length; i++) {
            double tf = input[i] / maxTermFrequency;
            var documentFrequency = counter.getDocumentFrequency(i);

            double idf = Math.log(numberOfDocuments / (double) documentFrequency);
            if (documentFrequency == 0) {
                idf = 0;
            }
            input[i] = tf * idf;
            if (Double.isNaN(tf * idf)) {
                input[i] = 0;
            }
        }

        return input;
    }
}
