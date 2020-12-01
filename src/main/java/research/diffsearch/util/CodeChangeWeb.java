package research.diffsearch.util;

import java.util.Objects;

public class CodeChangeWeb {
    public String url = "";
    public String hunkLines = "";
    public String codeChangeOld;
    public String codeChangeNew;
    public String query = "";
    public String fullChangeString = null;

    public CodeChangeWeb(String codeChangeOld, String codeChangeNew) {
        this.codeChangeOld = codeChangeOld;
        this.codeChangeNew = codeChangeNew;
    }

    public CodeChangeWeb(String url, String hunkLines, String codeChangeOld, String codeChangeNew, String query) {
        this.url = url;
        this.hunkLines = hunkLines;
        this.codeChangeOld = codeChangeOld;
        this.codeChangeNew = codeChangeNew;
        this.query = query;
    }

    public CodeChangeWeb(String url,
                         String hunkLines,
                         String codeChangeOld,
                         String codeChangeNew,
                         String query,
                         String fullChangeString) {
        this.url = url;
        this.hunkLines = hunkLines;
        this.codeChangeOld = codeChangeOld;
        this.codeChangeNew = codeChangeNew;
        this.query = query;
        this.fullChangeString = fullChangeString;
    }

    public CodeChangeWeb(String urlCandidate,
                         String lineCandidate,
                         String codeChangeOldCandidate,
                         String codeChangeNewCandidate) {
        url = urlCandidate;
        hunkLines = lineCandidate;
        codeChangeOld = codeChangeOldCandidate;
        codeChangeNew = codeChangeNewCandidate;
        fullChangeString = codeChangeOldCandidate + " --> " + codeChangeNewCandidate;
    }

    @Override
    public String toString() {
        return Objects.requireNonNullElseGet(fullChangeString, () -> codeChangeOld + " --> " + codeChangeNew);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeChangeWeb that = (CodeChangeWeb) o;
        return Objects.equals(url, that.url) &&
               Objects.equals(hunkLines, that.hunkLines) &&
               Objects.equals(codeChangeOld, that.codeChangeOld) &&
               Objects.equals(codeChangeNew, that.codeChangeNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, hunkLines, codeChangeOld, codeChangeNew);
    }

    public String getUrl() {
        return url;
    }

    public CodeChangeWeb setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHunkLines() {
        return hunkLines;
    }

    public CodeChangeWeb setHunkLines(String hunkLines) {
        this.hunkLines = hunkLines;
        return this;
    }

    public String getCodeChangeOld() {
        return codeChangeOld;
    }

    public CodeChangeWeb setCodeChangeOld(String codeChangeOld) {
        this.codeChangeOld = codeChangeOld;
        return this;
    }

    public String getCodeChangeNew() {
        return codeChangeNew;
    }

    public CodeChangeWeb setCodeChangeNew(String codeChangeNew) {
        this.codeChangeNew = codeChangeNew;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CodeChangeWeb setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getFullChangeString() {
        return fullChangeString;
    }

    public CodeChangeWeb setFullChangeString(String fullChangeString) {
        this.fullChangeString = fullChangeString;
        return this;
    }

    /**
     * This object gets returned when an error occurs.
     */
    public static final CodeChangeWeb ERROR_CODE_CHANGE
            = new CodeChangeWeb("error", "error");

    public static final CodeChangeWeb INVALID_QUERY_CODE_CHANGE
            = new CodeChangeWeb("invalid query", "invalid query");
}
