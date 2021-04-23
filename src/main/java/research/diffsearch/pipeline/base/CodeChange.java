package research.diffsearch.pipeline.base;

import java.util.Objects;

/**
 * This POJO represents a code change. It contains the old and new part of the code change as well as information
 * where it is extracted from.
 */
public class CodeChange {
    public String url = "";
    public String hunkLines = "";
    public String codeChangeOld;
    public String codeChangeNew;
    public String fullChangeString = null;

    // rank is only given if this is a result of a search query. This is the position in the list of candidate changes
    public int rank = 0;

    public CodeChange(String codeChangeOld, String codeChangeNew) {
        this.codeChangeOld = codeChangeOld;
        this.codeChangeNew = codeChangeNew;
    }

    @Override
    public String toString() {
        return Objects.requireNonNullElseGet(fullChangeString, () -> codeChangeOld + " --> " + codeChangeNew);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeChange that = (CodeChange) o;
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

    public CodeChange setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHunkLines() {
        return hunkLines;
    }

    public CodeChange setHunkLines(String hunkLines) {
        this.hunkLines = hunkLines;
        return this;
    }

    public String getCodeChangeOld() {
        return codeChangeOld;
    }

    public CodeChange setCodeChangeOld(String codeChangeOld) {
        this.codeChangeOld = codeChangeOld;
        return this;
    }

    public String getCodeChangeNew() {
        return codeChangeNew;
    }

    public CodeChange setCodeChangeNew(String codeChangeNew) {
        this.codeChangeNew = codeChangeNew;
        return this;
    }

    public String getFullChangeString() {
        return fullChangeString;
    }

    public CodeChange setFullChangeString(String fullChangeString) {
        this.fullChangeString = fullChangeString;
        return this;
    }

    public int getRank() {
        return rank;
    }

    public CodeChange setRank(int rank) {
        this.rank = rank;
        return this;
    }
}
