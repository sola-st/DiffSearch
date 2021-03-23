package research.diffsearch.util;

import ProgrammingLanguage.Java.JavaParser;
import ProgrammingLanguage.JavaScript.ECMAScriptParser;
import ProgrammingLanguage.Python.Python3Parser;

import java.util.Arrays;
import java.util.List;

public enum ProgrammingLanguage {

    JAVA(Arrays.asList(JavaParser.ruleNames)),
    PYTHON(Arrays.asList(Python3Parser.ruleNames)),
    JAVASCRIPT(Arrays.asList(ECMAScriptParser.ruleNames));

    private final List<String> ruleNames;

    ProgrammingLanguage(List<String> ruleNames) {
        this.ruleNames = ruleNames;
    }

    public List<String> getRuleNames() {
        return ruleNames;
    }

    @Override
    public String toString() {
        switch (this) {
            case JAVA: return "Java";
            case JAVASCRIPT: return "JS";
            case PYTHON: return "Python";
        }
        throw new IllegalStateException();
    }
}
