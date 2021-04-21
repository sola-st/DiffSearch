package research.diffsearch.pipeline.base;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * This object represents the result of a diff search.
 * It also contains optional measures of performance, recall, etc.
 */
public class DiffsearchResult {

    private String query;
    private Collection<CodeChangeWeb> results;

    // these measures are nullable
    private Long performance;
    private Integer candidateChangeCount;
    private Integer expectedValueCount;
    private Double reciprocalRank;
    private Double candidateChangePrecision;

    private boolean internalError = false;
    private boolean invalidQuery = false;

    public DiffsearchResult(String query, Collection<CodeChangeWeb> results) {
        this.query = query;
        this.results = results;
    }

    public Optional<Long> getPerformance() {
        return Optional.ofNullable(performance);
    }

    public Optional<Integer> getCandidateChangeCount() {
        return Optional.ofNullable(candidateChangeCount);
    }

    public Optional<Integer> getExpectedValueCount() {
        return Optional.ofNullable(expectedValueCount);
    }

    public Optional<Double> getReciprocalRank() {
        return Optional.ofNullable(reciprocalRank);
    }

    public String getQuery() {
        return query;
    }

    public Collection<CodeChangeWeb> getResults() {
        return results;
    }

    public DiffsearchResult setQuery(String query) {
        this.query = query;
        return this;
    }

    public DiffsearchResult setResults(List<CodeChangeWeb> results) {
        this.results = results;
        return this;
    }

    public DiffsearchResult setPerformance(long performance) {
        this.performance = performance;
        return this;
    }

    public DiffsearchResult setCandidateChangeCount(Integer candidateChangeCount) {
        this.candidateChangeCount = candidateChangeCount;
        return this;
    }

    public DiffsearchResult setExpectedValueCount(Integer expectedValueCount) {
        this.expectedValueCount = expectedValueCount;
        return this;
    }

    public DiffsearchResult setReciprocalRank(Double rankOfFirstResult) {
        this.reciprocalRank = rankOfFirstResult;
        return this;
    }

    public Double getCandidateChangePrecision() {
        return candidateChangePrecision;
    }

    public DiffsearchResult setCandidateChangePrecision(Double candidateChangePrecision) {
        this.candidateChangePrecision = candidateChangePrecision;
        return this;
    }

    public boolean isInternalError() {
        return internalError;
    }

    public DiffsearchResult setInternalError(boolean internalError) {
        this.internalError = internalError;
        return this;
    }

    public boolean isInvalidQuery() {
        return invalidQuery;
    }

    public DiffsearchResult setInvalidQuery(boolean invalidQuery) {
        this.invalidQuery = invalidQuery;
        return this;
    }

    public static DiffsearchResult invalidQuery(String query) {
        return new DiffsearchResult(query, Collections.emptyList())
                .setInvalidQuery(true);
    }

    public static DiffsearchResult internalError(String query) {
        return new DiffsearchResult(query, Collections.emptyList())
                .setInternalError(true);
    }
}
