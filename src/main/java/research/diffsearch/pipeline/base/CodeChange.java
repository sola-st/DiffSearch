package research.diffsearch.pipeline.base;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.jgit.annotations.Nullable;

import static java.text.MessageFormat.format;
import static java.util.Objects.requireNonNullElseGet;
import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;

/**
 * This POJO represents a code change. It contains the old and new part of the code change as well as information
 * where it is extracted from.
 *
 * @author Paul Bredl
 */
public class CodeChange {
    public String commit = "";
    public transient String hunkLines = "";
    public String codeChangeOld;
    public String codeChangeNew;
    public transient String fullChangeString = null;
    public String projectName = "";
    public String fileNameNew = "";
    public String fileNameOld = "";
    @Nullable
    public transient String JSONParseTree = null;
    public int lineOld;
    public int lineNew;

    // rank is only given if this is a result of a search query. This is the position in the list of candidate changes
    public transient int rank = 0;

    public CodeChange(String codeChangeOld, String codeChangeNew) {
        this.codeChangeOld = codeChangeOld;
        this.codeChangeNew = codeChangeNew;
    }

    public CodeChange() {

    }

    @Override
    public String toString() {
        return requireNonNullElseGet(fullChangeString, () -> codeChangeOld + " --> " + codeChangeNew);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CodeChange that = (CodeChange) o;

        return new EqualsBuilder()
                .append(lineOld, that.lineOld)
                .append(lineNew, that.lineNew)
                .append(commit, that.commit)
                .append(codeChangeOld, that.codeChangeOld)
                .append(codeChangeNew, that.codeChangeNew)
                .append(fullChangeString, that.fullChangeString)
                .append(projectName, that.projectName)
                .append(fileNameNew, that.fileNameNew)
                .append(fileNameOld, that.fileNameOld).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(23, 37)
                .append(commit).append(codeChangeOld)
                .append(codeChangeNew).append(fullChangeString)
                .append(projectName).append(fileNameNew)
                .append(fileNameOld).append(lineOld)
                .append(lineNew).toHashCode();
    }

    public String getCommit() {
        return commit;
    }

    public CodeChange setCommit(String commit) {
        this.commit = commit;
        return this;
    }

    public String getCommitUrl() {
        return format("https://github.com/{0}/commit/{1}#diff-{2}{3}{4}",
                projectName.replace('.', '/'),
                commit,
                sha256Hex(fileNameNew),
                codeChangeOld.equals("_") ? "R" : "L",
                codeChangeOld.equals("_") ? Integer.toString(lineNew) : Integer.toString(lineOld));
    }

    public String getHunkLines() {
        return hunkLines;
    }

    public CodeChange setCommitLines(String hunkLines) {
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
        return requireNonNullElseGet(fullChangeString, () -> format("{0} --> {1}", codeChangeOld, codeChangeNew));
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

    public String getProjectName() {
        return projectName;
    }

    public CodeChange setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getJSONParseTree() {
        return JSONParseTree;
    }

    public CodeChange setJSONParseTree(String jsonParseTree) {
        this.JSONParseTree = jsonParseTree;
        return this;
    }

    public String getFileNameNew() {
        return fileNameNew;
    }

    public CodeChange setFileNameNew(String fileNameNew) {
        this.fileNameNew = fileNameNew;
        return this;
    }

    public String getFileNameOld() {
        return fileNameOld;
    }

    public CodeChange setFileNameOld(String fileNameOld) {
        this.fileNameOld = fileNameOld;
        return this;
    }

    public int getLineOld() {
        return lineOld;
    }

    public CodeChange setLineOld(int lineOld) {
        this.lineOld = lineOld;
        return this;
    }

    public int getLineNew() {
        return lineNew;
    }

    public CodeChange setLineNew(int lineNew) {
        this.lineNew = lineNew;
        return this;
    }

    /**
     * This object gets returned when an error occurs.
     */
    public static final CodeChange ERROR_CODE_CHANGE
            = new CodeChange("error", "error");

    public static final CodeChange INVALID_QUERY_CODE_CHANGE
            = new CodeChange("invalid query", "invalid query");
}
