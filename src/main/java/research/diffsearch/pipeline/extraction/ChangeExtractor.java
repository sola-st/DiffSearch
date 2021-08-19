package research.diffsearch.pipeline.extraction;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import research.diffsearch.pipeline.MatchingPipeline;
import research.diffsearch.pipeline.base.CodeChange;
import research.diffsearch.pipeline.base.Pipeline;
import research.diffsearch.tree.AbstractTree;
import research.diffsearch.tree.SerializableTreeNode;
import research.diffsearch.tree.TreeFactory;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.ProgrammingLanguageDependent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;
import static research.diffsearch.util.FilePathUtils.getWriter;

public class ChangeExtractor implements Pipeline<File, File>, ProgrammingLanguageDependent {

    private static final Logger logger = LoggerFactory.getLogger(ChangeExtractor.class);
    private final File pathOutput;
    private final ProgrammingLanguage language;

    // parsing properties
    private String commit;
    private String position;
    private int lineOld = 0;
    private int lineNew = 0;
    private String fileNameOld;
    private String fileNameNew;
    private List<String> workListOld;
    private List<String> workListNew;
    private String projectName;
    private long numberOfChanges;
    private char previousPrefix;
    private String line;
    private String previousLine;
    private String lineBeforeCodeChange;
    private String jsonTree;

    private BufferedWriter writer;
    private BufferedWriter jsonWriter;

    public ChangeExtractor(File pathOutput, ProgrammingLanguage language) {
        this.pathOutput = pathOutput;
        this.language = language;
    }

    @Override
    public File process(File input, int index) {
        extractCodeChangesToFile(input);
        return input;
    }

    public File extractCodeChangesToFile(File f) {
        // List<File> files = listPatchFilesOfDirectory(pathInput);
//        logger.info("Extracting code changes from {} files.", files.size());
        try {
            // logger.info("Extracting code changes from {}", f.toString());
            workListOld = new ArrayList<>();
            workListNew = new ArrayList<>();
            previousPrefix = ' ';
            projectName = f.getName().replace(".patch", "");
            writer = getWriter(pathOutput.getAbsolutePath() + "/" + f.getName() + ".cc");
            jsonWriter = getWriter(pathOutput.getAbsolutePath() + "/" + f.getName() + ".cctree");

            try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
                reader.lines()
                        .forEach(input -> {
                            previousLine = line;
                            line = input;
                            line = line.length() < 2 ? line + "  " : line;
                            parseLine();
                        });
            }

            if (previousPrefix != ' ') {
                makeNewCodeChange();
            }

            writer.close();
            jsonWriter.close();
            logger.info("Found {} code changes in {}", numberOfChanges, f.getName());
            logger.warn("Could not parse {} code changes ({}%)", errors,
                    (int) (((double) errors) / (double) numberOfChanges * 100));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return f;
    }

    private void parseLine() {
        String trimmedLine = line.substring(1).trim();

        if (isCommitLine(line)) {
            commit = getCommit(line);

        } else if (isOldFileNameLine(line)) {
            fileNameOld = getOldFileName(line);

        } else if (isNewFileLine(line)) {
            fileNameNew = getNewFileName(line);

        } else if (isPositionLine(line)) {
            position = getPosition(line);
            parseLineNumbers();

        } else if (isLineWithPrefix(line, '-')) {
            if (previousPrefix == '+') {
                makeNewCodeChange();
                lineOld++;
                lineNew++;
            }
            if (previousPrefix == ' ') {
                lineBeforeCodeChange = previousLine.substring(1).trim();
            }

            previousPrefix = '-';
            workListOld.add(trimmedLine);

        } else if (isLineWithPrefix(line, '+')) {
            if (previousPrefix == ' ') {
                lineBeforeCodeChange = previousLine.substring(1).trim();
            }
            previousPrefix = '+';
            workListNew.add(trimmedLine);

        } else if (startsWithSpace(line)) {
            if (previousPrefix == '+' || previousPrefix == '-') {
                makeNewCodeChange();
            }
            lineOld++;
            lineNew++;
            previousPrefix = ' ';
        }
    }

    private void parseLineNumbers() {
        var positionsParts = position.split(" ");
        var positionsOld = positionsParts[0].split(",");
        var positionsNew = positionsParts[1].split(",");
        lineOld = Integer.parseInt(positionsOld[0].replaceAll("-", "").trim());
        lineNew = Integer.parseInt(positionsNew[0].replaceAll("\\+", "").trim());
    }

    private static boolean startsWithSpace(String line) {
        return line.charAt(0) == ' ';
    }

    private static boolean isLineWithPrefix(String line, char c) {
        return (line.charAt(0) == c) && (line.charAt(1) != c);
    }

    private static String getPosition(String line) {
        return line.split("@@", 3)[1].trim();
    }

    private static boolean isPositionLine(String line) {
        return line.startsWith("@@");
    }

    private static boolean isNewFileLine(String line) {
        return line.startsWith("+++ b/");
    }

    private static String getNewFileName(String line) {
        return line.replace("+++ b/", "").trim();
    }

    private static String getOldFileName(String line) {
        return line.replace("--- a/", "").trim();
    }

    private static boolean isOldFileNameLine(String line) {
        return line.startsWith("--- a/");
    }

    private static String getCommit(String line) {
        return line
                .replace("commit ", "")
                .replaceAll("\\s\\(from .*\\)", "")
                .trim();
    }

    private static boolean isCommitLine(String line) {
        return line.length() > 7 && line.startsWith("commit ");
    }

    private int errors = 0;

    private void makeNewCodeChange() {

        CodeChange codeChange = new CodeChange();
        codeChange.setProjectName(projectName);
        codeChange.setCommitLines(position);
        codeChange.setCommit(commit);
        if (!fileNameNew.equals(fileNameOld)) {
            codeChange.setFileNameNew(fileNameNew);
        }
        codeChange.setFileNameOld(fileNameOld);
        codeChange.setLineOld(lineOld);
        codeChange.setLineNew(lineNew);

        var old = workListOld.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.joining("\n")).trim();
        var newS = workListNew.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.joining("\n")).trim();
        if (old.isEmpty()) {
            old = "_";
        }
        if (newS.isEmpty()) {
            newS = "_";
        }

        if (isValidCodeChange(old, newS)) {
            codeChange.setCodeChangeOld(old);
            codeChange.setCodeChangeNew(newS);

            if (!checkCodeChange(codeChange.getFullChangeString())
                && !tryErrorCorrectionWithCommentsRemoved(codeChange)) {
                if (isValidCodeChange(codeChange.getCodeChangeOld(), codeChange.getCodeChangeNew())) {
                    if (!tryErrorCorrectionWithPreviousAndNextLine(codeChange)
                        && !tryErrorCorrectionWithRemovedComma(codeChange)) {
                        errors++;
                    } else {
                        saveCodeChange(codeChange);
                    }
                }
            } else {
                saveCodeChange(codeChange);
            }
        }

        lineNew += workListNew.size();
        lineOld += workListOld.size();
        workListOld.clear();
        workListNew.clear();
    }

    private boolean isValidCodeChange(String old, String newS) {
        return !old.equals(newS)
               && !(old + newS).matches("(\\W|_)*");
    }

    private final Gson gson = new Gson();

    public void saveCodeChange(CodeChange codeChange) {
        if (!MatchingPipeline.isNotEqualCodeChange(codeChange)) {
            return;
        }
        codeChange.setJSONParseTree(jsonTree);

        try {
            writer.write(gson.toJson(codeChange));
            writer.newLine();
            jsonWriter.write(codeChange.getJSONParseTree());
            jsonWriter.newLine();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        numberOfChanges++;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage() {
        return language;
    }

    private boolean tryErrorCorrectionWithPreviousAndNextLine(CodeChange change) {
        String old = change.getCodeChangeOld();
        String newS = change.getCodeChangeNew();

        String oldWithLineBefore = lineBeforeCodeChange + "\n" + old;
        String newWithLineBefore = lineBeforeCodeChange + "\n" + newS;

        if (checkCodeChange(oldWithLineBefore + " --> " + newWithLineBefore)) {
            change.setCodeChangeOld(oldWithLineBefore);
            change.setCodeChangeNew(newWithLineBefore);
            return true;
        }

        String currentLine = line.substring(1).trim();
        String oldWithLineAfter = old + "\n" + currentLine;
        String newWithLineAfter = newS + "\n" + currentLine;

        if (checkCodeChange(oldWithLineAfter + " --> " + newWithLineAfter)) {
            change.setCodeChangeOld(oldWithLineAfter);
            change.setCodeChangeNew(newWithLineAfter);
            return true;
        }

        String oldWithLineBeforeAndAfter = oldWithLineBefore + "\n" + currentLine;
        String newWithLineBeforeAndAfter = newWithLineBefore + "\n" + currentLine;

        if (checkCodeChange(oldWithLineBeforeAndAfter + " --> " + newWithLineBeforeAndAfter)) {
            change.setCodeChangeOld(oldWithLineBeforeAndAfter);
            change.setCodeChangeNew(newWithLineBeforeAndAfter);
            return true;
        }

        return false;
    }

    private boolean tryErrorCorrectionWithRemovedComma(CodeChange change) {
        String old = change.getCodeChangeOld();
        String newS = change.getCodeChangeNew();

        if (old.endsWith(",") && old.length() >= 2) {
            old = old.substring(0, old.length() - 2);
        }
        if (newS.endsWith(",") && newS.length() >= 2) {
            newS = newS.substring(0, newS.length() - 2);
        }
        if (checkCodeChange(old + "-->" + newS)) {
            change.setCodeChangeOld(old);
            change.setCodeChangeNew(newS);
            return true;
        }
        return false;
    }

    private boolean tryErrorCorrectionWithCommentsRemoved(CodeChange change) {
        final String[] old = {change.getCodeChangeOld()};
        final String[] newS = {change.getCodeChangeNew()};

        var commentRegexes = List.of("(?s)/\\*.*?\\*/", "//.*\n?", "\\*\\*?\\s.*\n?");
        commentRegexes.forEach(
                regex -> {
                    old[0] = old[0].replaceAll(regex, " ").trim();
                    newS[0] = newS[0].replaceAll(regex, " ").trim();
                }
        );

        if (old[0].isBlank()) {
            old[0] = "_";
        }
        if (newS[0].isBlank()) {
            newS[0] = "_";
        }
        change.setCodeChangeOld(old[0]);
        change.setCodeChangeNew(newS[0]);

        return checkCodeChange(old[0] + " --> " + newS[0]);
    }


    private boolean checkCodeChange(String changeString) {

        AbstractTree tree = TreeFactory.getAbstractTree(changeString.replaceAll("\n", " "), language);
        SerializableTreeNode treeNode = SerializableTreeNode.fromTree(tree.getParseTree(), language);
        var result = tree.getParser().getNumberOfSyntaxErrors() <= 0
               || (treeNode.getChildCount() == 3
                   && treeNode.getChild(0).getChildCount() > 0
                   && treeNode.getChild(1).getNodeLabel().trim().equals("-->")
                   && treeNode.getChild(2).getChildCount() > 0);
        if (result) {
            jsonTree = gson.toJson(treeNode);
        }
        return result;
    }
}
