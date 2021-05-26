package research.diffsearch.pipeline;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.Config;
import research.diffsearch.Matching_Methods;
import research.diffsearch.tree.Java_Tree;
import research.diffsearch.tree.TreeUtils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class TestPipeline {
    /*public static void small_test(Java_Tree tree_query, Tree query_old, Tree query_new, BufferedWriter buff_writer_results, String query_string) {
        String candidate = "if(x>0){<...>} --> if(x<0){<...>} ";


        List<String> list_query_nodes = new ArrayList<>();
        TreeUtils.query_extraction_nodes(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), list_query_nodes);

        List<String> list_query_old_leaves = new ArrayList<>();
        List<String> list_query_new_leaves = new ArrayList<>();

        TreeUtils.query_leaves_extraction(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), list_query_old_leaves);

        boolean new_code = false;

        for (String str : list_query_old_leaves) {
            if (str.equals("-->") || str.equals("<EOF>")) {
                new_code = true;
            } else {
                if (new_code) {
                    list_query_new_leaves.add(str);
                }
            }
        }

        String[] array_query_old_nodes = new String[list_query_old_leaves.size()];
        array_query_old_nodes = list_query_old_leaves.toArray(array_query_old_nodes);

        String[] array_query_new_nodes = new String[list_query_new_leaves.size()];
        array_query_new_nodes = list_query_new_leaves.toArray(array_query_new_nodes);

        // Python3_Tree change = new Python3_Tree(candidate.replace("$$", "\n"));
        //  Javascript_Tree change = new Javascript_Tree(candidate.replace("$$", "\n"));
        Java_Tree change = new Java_Tree(candidate.replace("$$", "\n"));

        List<String> list_change_nodes = new ArrayList<>();
        TreeUtils.query_extraction_nodes(change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), list_change_nodes);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/log_file.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        boolean equal2 = false;
        boolean equal3 = false;

        if (query_old != null && query_new != null) {
            equal2 = TreeUtils.deep_tree_comparison_partial(query_old, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(0), Arrays.asList(change.get_parser().getRuleNames()), writer, false, candidate);
            equal3 = TreeUtils.deep_tree_comparison_partial(query_new, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(2), Arrays.asList(change.get_parser().getRuleNames()), writer, false, candidate);
        }

        boolean equal = TreeUtils.deep_tree_comparison_java(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
        // boolean equal = TreeUtils.deep_tree_comparison_javascript2(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
        // boolean equal = TreeUtils.deep_tree_comparison_python(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);

        assert writer != null;
        writer.close();

        if (equal || (equal2 && equal3)) {
            List<String> list_change_old_leaves = new ArrayList<>();
            List<String> list_change_new_leaves = new ArrayList<>();

            TreeUtils.query_leaves_extraction(change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), list_change_old_leaves);

            new_code = false;

            for (String str : list_change_old_leaves) {
                if (str.equals("-->") || str.equals("<EOF>")) {
                    new_code = true;
                } else {
                    if (new_code) {
                        list_change_new_leaves.add(str);
                    }
                }
            }

            String[] array_change_old_nodes = new String[list_change_old_leaves.size()];
            array_change_old_nodes = list_change_old_leaves.toArray(array_change_old_nodes);

            String[] array_change_new_nodes = new String[list_change_new_leaves.size()];
            array_change_new_nodes = list_change_new_leaves.toArray(array_change_new_nodes);

            boolean final_matching = false;

            // If for managing the partial tree matching
            if (equal)
                final_matching = Matching_Methods.leaves_final_matching(array_query_old_nodes, array_query_new_nodes, array_change_old_nodes, array_change_new_nodes, query_string, candidate);

            else {
                List<String> list_change_old_leaves2 = new ArrayList<>();
                List<String> list_change_new_leaves2 = new ArrayList<>();
                Tree partial_old = null;
                Tree partial_new = null;

                partial_old = TreeUtils.deep_tree_comparison_partial2(query_old, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(0), Arrays.asList(change.get_parser().getRuleNames()), writer, false);
                partial_new = TreeUtils.deep_tree_comparison_partial2(query_new, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(2), Arrays.asList(change.get_parser().getRuleNames()), writer, false);

                TreeUtils.query_leaves_extraction(partial_old, Arrays.asList(change.get_parser().getRuleNames()), list_change_old_leaves2);
                TreeUtils.query_leaves_extraction(partial_new, Arrays.asList(change.get_parser().getRuleNames()), list_change_new_leaves2);

                String[] array_change_old_nodes2 = new String[list_change_old_leaves2.size()];
                array_change_old_nodes2 = list_change_old_leaves2.toArray(array_change_old_nodes2);

                String[] array_change_new_nodes2 = new String[list_change_new_leaves2.size()];
                array_change_new_nodes2 = list_change_new_leaves2.toArray(array_change_new_nodes2);

                final_matching = Matching_Methods.leaves_final_matching(array_query_old_nodes, array_query_new_nodes, array_change_old_nodes2, array_change_new_nodes2, query_string, candidate);
            }

            if (final_matching) {

                List<String> list = Arrays.asList(candidate.replace("$$", "\n").split("-->"));

                if (Config.EFFECTIVENESS || Config.NORMAL) {
                    System.out.println("- " + list.get(0) + "\n+ " + list.get(1));
                }
            }
        }
    }*/

    /*static void old_manual_input() {
        *//*
         try {
             System.out.print("Enter ONLY the old code (blank line for the next step or END to end the program):\n");
             Scanner input = new Scanner(System.in);
             List<String> old_code = new ArrayList<String>();
             String lineNew;
             while (input.hasNextLine()) {
                 lineNew = input.nextLine();
                 if (lineNew.equals("END")) {
                     System.out.println("\n================================\nProgram finished successfully.");
                     return;
                 }
                 if (lineNew.isEmpty()) {
                     break;
                 }
                 old_code.add(lineNew);
             }
             System.out.print("Enter ONLY the new code (blank line for next step or END to end the program):\n");
             Scanner input2 = new Scanner(System.in);
             List<String> new_code = new ArrayList<String>();
             String lineNew2;
             while (input2.hasNextLine()) {
                 lineNew2 = input2.nextLine();
                 if (lineNew2.equals("END")) {
                     //removing useless files
                     if(Config.CLEANUP)
                         Pipeline.files_cleanup();
                     System.out.println("\n================================\nProgram finished successfully.");
                     return;
                 }
                 if (lineNew2.isEmpty()) {
                     break;
                 }
                 new_code.add(lineNew2);
             }
             query_input = String.join(System.lineSeparator(), old_code) + "-->" + String.join(System.lineSeparator(), new_code);

             query_input = "ID binOP<0> LT; --> ID binOP<1> LT;";
             tree_query = Pipeline.query_feature_extraction(query_input);
         } catch (Exception e) {
             e.printStackTrace();
         }
         if (tree_query == null) {
             System.out.print("The query is not correct, please try again.\n");
             continue;
         }*//*
        return;
    }*/

    public static List<String> small_test_new(Java_Tree tree_query, Tree query_old, Tree query_new, String query_string, String candidate) {
        List<String> output_list = new ArrayList<>();

        List<String> list_query_nodes = new ArrayList<>();
        TreeUtils.query_extraction_nodes(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), list_query_nodes);

        List<String> list_query_old_leaves = new ArrayList<>();
        List<String> list_query_new_leaves = new ArrayList<>();

        TreeUtils.query_leaves_extraction(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), list_query_old_leaves);

        boolean new_code = false;

        for (String str : list_query_old_leaves) {
            if (str.equals("-->") || str.equals("<EOF>")) {
                new_code = true;
            } else {
                if (new_code) {
                    list_query_new_leaves.add(str);
                }
            }
        }

        String[] array_query_old_nodes = new String[list_query_old_leaves.size()];
        array_query_old_nodes = list_query_old_leaves.toArray(array_query_old_nodes);

        String[] array_query_new_nodes = new String[list_query_new_leaves.size()];
        array_query_new_nodes = list_query_new_leaves.toArray(array_query_new_nodes);

        // Python3_Tree change = new Python3_Tree(candidate.replace("$$", "\n"));
        //  Javascript_Tree change = new Javascript_Tree(candidate.replace("$$", "\n"));
        Java_Tree change = new Java_Tree(candidate.replace("$$", "\n"));

        List<String> list_change_nodes = new ArrayList<>();
        TreeUtils.query_extraction_nodes(change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), list_change_nodes);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/log_file.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        boolean equal2 = false;
        boolean equal3 = false;

        if (query_old != null && query_new != null) {
            equal2 = TreeUtils.deep_tree_comparison_partial(query_old, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(0), Arrays.asList(change.get_parser().getRuleNames()), writer, false, candidate);
            equal3 = TreeUtils.deep_tree_comparison_partial(query_new, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(2), Arrays.asList(change.get_parser().getRuleNames()), writer, false, candidate);
        }

        boolean equal = TreeUtils.deep_tree_comparison_java(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
        // boolean equal = TreeUtils.deep_tree_comparison_javascript2(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
        // boolean equal = TreeUtils.deep_tree_comparison_python(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);

        assert writer != null;
        writer.close();

        if (equal || (equal2 && equal3)) {
            List<String> list_change_old_leaves = new ArrayList<>();
            List<String> list_change_new_leaves = new ArrayList<>();

            TreeUtils.query_leaves_extraction(change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), list_change_old_leaves);

            new_code = false;

            for (String str : list_change_old_leaves) {
                if (str.equals("-->") || str.equals("<EOF>")) {
                    new_code = true;
                } else {
                    if (new_code) {
                        list_change_new_leaves.add(str);
                    }
                }
            }

            String[] array_change_old_nodes = new String[list_change_old_leaves.size()];
            array_change_old_nodes = list_change_old_leaves.toArray(array_change_old_nodes);

            String[] array_change_new_nodes = new String[list_change_new_leaves.size()];
            array_change_new_nodes = list_change_new_leaves.toArray(array_change_new_nodes);

            boolean final_matching = false;

            // If for managing the partial tree matching
            if (equal)
                final_matching = Matching_Methods.leaves_final_matching(array_query_old_nodes, array_query_new_nodes, array_change_old_nodes, array_change_new_nodes, query_string, candidate);

            else {
                List<String> list_change_old_leaves2 = new ArrayList<>();
                List<String> list_change_new_leaves2 = new ArrayList<>();
                Tree partial_old = null;
                Tree partial_new = null;

                partial_old = TreeUtils.deep_tree_comparison_partial2(query_old, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(0), Arrays.asList(change.get_parser().getRuleNames()), writer, false);
                partial_new = TreeUtils.deep_tree_comparison_partial2(query_new, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(2), Arrays.asList(change.get_parser().getRuleNames()), writer, false);

                TreeUtils.query_leaves_extraction(partial_old, Arrays.asList(change.get_parser().getRuleNames()), list_change_old_leaves2);
                TreeUtils.query_leaves_extraction(partial_new, Arrays.asList(change.get_parser().getRuleNames()), list_change_new_leaves2);

                String[] array_change_old_nodes2 = new String[list_change_old_leaves2.size()];
                array_change_old_nodes2 = list_change_old_leaves2.toArray(array_change_old_nodes2);

                String[] array_change_new_nodes2 = new String[list_change_new_leaves2.size()];
                array_change_new_nodes2 = list_change_new_leaves2.toArray(array_change_new_nodes2);

                final_matching = Matching_Methods.leaves_final_matching(array_query_old_nodes, array_query_new_nodes, array_change_old_nodes2, array_change_new_nodes2, query_string, candidate);
            }

            if (final_matching) {

                List<String> list = Arrays.asList(candidate.replace("$$", "\n").split("-->"));

                if (Config.EFFECTIVENESS || Config.NORMAL) {
                    System.out.println("- " + list.get(0) + "\n+ " + list.get(1));
                    output_list.add(candidate);
                }
            }
        }

        return output_list;
    }
}
