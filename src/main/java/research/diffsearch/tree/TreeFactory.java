package research.diffsearch.tree;

import research.diffsearch.util.ProgrammingLanguage;

/**
 * @author Paul Bredl
 */
public class TreeFactory {

    public static AbstractTree getAbstractTree(String candidate, ProgrammingLanguage language) {
        AbstractTree changeTree;
        switch (language) {
            case JAVA:
                changeTree = new JavaTree(candidate);
                break;
            case JAVASCRIPT:
                changeTree = new JavascriptTree(candidate);
                break;
            default:
                changeTree = new Python3Tree(candidate);
        }
        return changeTree;
    }

}
