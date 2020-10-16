package research.diffsearch;

public class CodeChangeWeb {
    public String url;
    public String hunk_lines;
    public String codeChange_old;
    public String codeChange_new;

    public CodeChangeWeb(String url_candidate, String line_candidate, String codeChange_old_candidate, String codeChange_new_candidate) {
        url = url_candidate;
        hunk_lines = line_candidate;
        codeChange_old = codeChange_old_candidate;
        codeChange_new = codeChange_new_candidate;
    }
}
