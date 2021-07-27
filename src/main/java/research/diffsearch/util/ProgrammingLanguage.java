package research.diffsearch.util;

import ProgrammingLanguage.Java.JavaLexer;
import ProgrammingLanguage.Java.JavaParser;
import ProgrammingLanguage.JavaScript.ECMAScriptLexer;
import ProgrammingLanguage.JavaScript.ECMAScriptParser;
import ProgrammingLanguage.Python.Python3Lexer;
import ProgrammingLanguage.Python.Python3Parser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;

import java.util.Arrays;
import java.util.List;

/**
 * @author Paul Bredl
 */
public enum ProgrammingLanguage {

    JAVA(Arrays.asList(JavaParser.ruleNames)) {
        @Override
        public Parser getParser(String codeChange) {
            return new JavaParser(new CommonTokenStream(new JavaLexer(CharStreams.fromString(codeChange))));
        }
    },
    PYTHON(Arrays.asList(Python3Parser.ruleNames)) {
        @Override
        public Parser getParser(String codeChange) {
            return new Python3Parser(new CommonTokenStream(new Python3Lexer(CharStreams.fromString(codeChange))));
        }
    },
    JAVASCRIPT(Arrays.asList(ECMAScriptParser.ruleNames)) {
        @Override
        public Parser getParser(String codeChange) {
            return new ECMAScriptParser(new CommonTokenStream(new ECMAScriptLexer(CharStreams.fromString(codeChange))));
        }
    };

    private final List<String> ruleNames;

    ProgrammingLanguage(List<String> ruleNames) {
        this.ruleNames = ruleNames;
    }

    public List<String> getRuleNames() {
        return ruleNames;
    }

    public abstract Parser getParser(String codeChange);

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
