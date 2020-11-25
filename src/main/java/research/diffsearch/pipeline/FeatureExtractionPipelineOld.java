package research.diffsearch.pipeline;

import ProgrammingLanguage.Java.JavaParserBaseListener;
import ProgrammingLanguage.JavaScript.ECMAScriptBaseListener;
import ProgrammingLanguage.Python.Python3BaseListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import research.diffsearch.*;
import research.diffsearch.util.FilePathUtils;
import research.diffsearch.util.ProgrammingLanguage;
import research.diffsearch.util.TreeUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FeatureExtractionPipelineOld {

    public static Object queryFeatureExtraction(String queryInput, ProgrammingLanguage programmingLanguage) {
        switch (programmingLanguage) {
            case PYTHON:
                return query_feature_extraction_python(queryInput);
            case JAVA:
                return query_feature_extraction_java(queryInput);
            default:
                return query_feature_extraction_js(queryInput);
        }
    }

    /**
     * Creation of the query tree and extraction of its features.
     *
     * @param query_input: String of the query
     * @return AST of the query
     */
    public static Java_Tree query_feature_extraction_java(String query_input) {
        Java_Tree javaTree = null;
        //Python3_Tree javaTree = null;

        //Creating the tree for the query string
        try {
            javaTree = new Java_Tree(query_input);
            // javaTree = new Javascript_Tree(query_input);
            //  javaTree = new Python3_Tree(query_input);
            if (TreeUtils.nodeCount(javaTree.get_parsetree(), Arrays.asList(javaTree.get_parser().getRuleNames()), 0) <= 5 ||
                javaTree.isError() || javaTree.error)
                return null;

            //Declaring query variables
            List<Integer> list_parent_child = new ArrayList<>();
            List<Integer> list_hash_sum = new ArrayList<>();
            // ECMAScriptBaseListener listener = new ECMAScriptBaseListener();
            //Python3BaseListener listener = new Python3BaseListener();
            JavaParserBaseListener listener = new JavaParserBaseListener();


            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, javaTree.get_parsetree());
            List<String> ruleNamesList = Arrays.asList(javaTree.get_parser().getRuleNames());

            //Computing hash sum and pairs parent child
            // TreeUtils.tree_hash_sumAST_javascript(javaTree.get_parsetree(), ruleNamesList, list_hash_sum, javaTree.features);
            // TreeUtils.pairs_parent_childAST_javascript(javaTree.get_parsetree(), ruleNamesList, list_parent_child, javaTree.features);

            //TreeUtils.tree_hash_sumAST_python(javaTree.get_parsetree(), ruleNamesList, list_hash_sum, javaTree.features);
            //TreeUtils.pairs_parent_childAST_python(javaTree.get_parsetree(), ruleNamesList, list_parent_child, javaTree.features);

            TreeUtils.tree_hash_sumAST_java(javaTree.get_parsetree(), ruleNamesList, list_hash_sum, javaTree.features);
            TreeUtils.pairs_parent_childAST_java(javaTree.get_parsetree(), ruleNamesList, list_parent_child, javaTree.features);
            list_hash_sum.addAll(list_parent_child);

            //Creation of a buffered writer
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter(FilePathUtils.QUERY_FEATURE_VECTORS_CSV));

            // Writing the feature vector in a csv file
            StringBuilder str_builder = new StringBuilder();

            for (int element : javaTree.features) {
                str_builder.append(element);
                str_builder.append(",");
            }
            str_builder.append("\n");

            buff_writer.write(str_builder.toString());
            buff_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println("QUERY TREE AND FEATURES COMPUTATION DONE");

        return javaTree;
    }

    /**
     * Creation of the query tree and extraction of its features.
     *
     * @param query_input: String of the query
     * @return AST of the query
     */
    public static Javascript_Tree query_feature_extraction_js(String query_input) {
        Javascript_Tree tree_query = null;
        //Python3_Tree tree_query = null;

        //Creating the tree for the query string
        try {
            //tree_query = new Java_Tree(query_input);
            tree_query = new Javascript_Tree(query_input);
            //  tree_query = new Python3_Tree(query_input);
            if (TreeUtils.nodeCount(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), 0) <= 5 ||
                tree_query.isError() || tree_query.error)
                return null;

            //Declaring query variables
            List<Integer> list_parent_child = new ArrayList<>();
            List<Integer> list_hash_sum = new ArrayList<>();
            ECMAScriptBaseListener listener = new ECMAScriptBaseListener();
            //Python3BaseListener listener = new Python3BaseListener();
            //JavaParserBaseListener listener = new JavaParserBaseListener();


            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree_query.get_parsetree());
            List<String> ruleNamesList = Arrays.asList(tree_query.get_parser().getRuleNames());

            //Computing hash sum and pairs parent child
            TreeUtils.tree_hash_sumAST_javascript(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            TreeUtils.pairs_parent_childAST_javascript(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);

            //TreeUtils.tree_hash_sumAST_python(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            //TreeUtils.pairs_parent_childAST_python(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);

            // TreeUtils.tree_hash_sumAST_java(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            //TreeUtils.pairs_parent_childAST_java(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);
            list_hash_sum.addAll(list_parent_child);

            //Creation of a buffered writer
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter(FilePathUtils.QUERY_FEATURE_VECTORS_CSV));

            // Writing the feature vector in a csv file
            StringBuilder str_builder = new StringBuilder();

            for (int element : tree_query.features) {
                str_builder.append(element);
                str_builder.append(",");
            }
            str_builder.append("\n");

            buff_writer.write(str_builder.toString());
            buff_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println("QUERY TREE AND FEATURES COMPUTATION DONE");

        return tree_query;
    }

    /**
     * Creation of the query tree and extraction of its features.
     *
     * @param query_input: String of the query
     * @return AST of the query
     */
    public static Python3_Tree query_feature_extraction_python(String query_input) {
        //Javascript_Tree tree_query = null;
        Python3_Tree tree_query = null;

        //Creating the tree for the query string
        try {
            //tree_query = new Java_Tree(query_input);
            // tree_query = new Javascript_Tree(query_input);
            tree_query = new Python3_Tree(query_input);
            if (TreeUtils.nodeCount(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), 0) <= 5 ||
                tree_query.isError() || tree_query.error)
                return null;

            //Declaring query variables
            List<Integer> list_parent_child = new ArrayList<>();
            List<Integer> list_hash_sum = new ArrayList<>();
            // ECMAScriptBaseListener listener = new ECMAScriptBaseListener();
            Python3BaseListener listener = new Python3BaseListener();
            //JavaParserBaseListener listener = new JavaParserBaseListener();


            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree_query.get_parsetree());
            List<String> ruleNamesList = Arrays.asList(tree_query.get_parser().getRuleNames());

            //Computing hash sum and pairs parent child
            //TreeUtils.tree_hash_sumAST_javascript(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            //TreeUtils.pairs_parent_childAST_javascript(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);

            TreeUtils.tree_hash_sumAST_python(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            TreeUtils.pairs_parent_childAST_python(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);

            // TreeUtils.tree_hash_sumAST_java(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            //TreeUtils.pairs_parent_childAST_java(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);
            list_hash_sum.addAll(list_parent_child);

            //Creation of a buffered writer
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter(FilePathUtils.QUERY_FEATURE_VECTORS_CSV));

            // Writing the feature vector in a csv file
            StringBuilder str_builder = new StringBuilder();

            for (int element : tree_query.features) {
                str_builder.append(element);
                str_builder.append(",");
            }
            str_builder.append("\n");

            buff_writer.write(str_builder.toString());
            buff_writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println("QUERY TREE AND FEATURES COMPUTATION DONE");

        return tree_query;
    }
}
