package research.diffsearch;

public class CodeChangeWeb {
    public String url;
    public String hunkLines;
    public String codeChangeOld;
    public String codeChangeNew;

    public CodeChangeWeb(String urlCandidate,
                         String lineCandidate,
                         String codeChangeOldCandidate,
                         String codeChangeNewCandidate) {
        url = urlCandidate;
        hunkLines = lineCandidate;
        codeChangeOld = codeChangeOldCandidate;
        codeChangeNew = codeChangeNewCandidate;
    }
}
