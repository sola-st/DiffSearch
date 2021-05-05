package research.diffsearch.util;

/**
 * Super interface for all components that depend on the target programming language of diffsearch.
 *
 * @author Paul Bredl
 */
public interface ProgrammingLanguageDependent {

    ProgrammingLanguage getProgrammingLanguage();

}
