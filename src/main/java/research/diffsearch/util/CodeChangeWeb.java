package research.diffsearch.util;

import java.util.Objects;

public class CodeChangeWeb {
    public String url = "";
    public String hunkLines = "";
    public String codeChangeOld;
    public String codeChangeNew;
    public String query = "";

    public CodeChangeWeb(String url, String hunkLines, String codeChangeOld, String codeChangeNew, String query) {
        this.url = url;
        this.hunkLines = hunkLines;
        this.codeChangeOld = codeChangeOld;
        this.codeChangeNew = codeChangeNew;
        this.query = query;
    }

    public CodeChangeWeb(String urlCandidate,
                         String lineCandidate,
                         String codeChangeOldCandidate,
                         String codeChangeNewCandidate) {
        url = urlCandidate;
        hunkLines = lineCandidate;
        codeChangeOld = codeChangeOldCandidate;
        codeChangeNew = codeChangeNewCandidate;
    }

    public CodeChangeWeb(String codeChangeOld, String codeChangeNew, String query) {
        this.codeChangeNew = codeChangeNew;
        this.codeChangeOld = codeChangeOld;
        this.query = query;
    }

    @Override
    public String toString() {
        return codeChangeOld + " --> " + codeChangeNew;
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
}
