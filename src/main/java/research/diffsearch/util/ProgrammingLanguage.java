package research.diffsearch.util;

public enum ProgrammingLanguage {

    JAVA,
    PYTHON,
    JAVASCRIPT;

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
