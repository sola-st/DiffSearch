package research.diffsearch;

import org.antlr.v4.runtime.tree.Tree;
import research.diffsearch.tree.Java_Tree;
import research.diffsearch.tree.Javascript_Tree;
import research.diffsearch.tree.TreeUtils;
import research.diffsearch.util.FilePathUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressWarnings("ALL")
public class PipelineOld {

    static AtomicInteger number_matching = new AtomicInteger(0);

    static class Final_Matching implements Runnable {

        private volatile String candidate;
        private volatile String info;
        private volatile Javascript_Tree tree_query;
        private volatile String[] array_query_old_nodes;
        private volatile String[] array_query_new_nodes;
        private volatile BufferedWriter buff_writer_features;

        public Final_Matching(String candidate, String info, Javascript_Tree tree_query, String[] array_query_old_nodes, String[] array_query_new_nodes, BufferedWriter buff_writer_features) {
            this.candidate = candidate;
            this.info = info;
            this.tree_query = tree_query;
            this.array_query_old_nodes = array_query_old_nodes;
            this.array_query_new_nodes = array_query_new_nodes;
            this.buff_writer_features = buff_writer_features;

        }

        public void run() {
            //String info = scanner2.nextLine();

            Javascript_Tree change = new Javascript_Tree(candidate.replace("$$", "\n"));
            //  Python3_Tree change = new Python3_Tree(candidate.replace("$$", "\n"));

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
            boolean equal = false;
            try {
                //equal2 = TreeUtils.deep_tree_comparison_partial(query_old, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(0), Arrays.asList(change.get_parser().getRuleNames()), writer, false);
                //equal3 = TreeUtils.deep_tree_comparison_partial(query_new, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(2), Arrays.asList(change.get_parser().getRuleNames()), writer, false);

                //  equal = TreeUtils.deep_tree_comparison_python(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
                equal = TreeUtils.deep_tree_comparison_javascript2(tree_query.get_parsetree(),
                        Arrays.asList(tree_query.get_parser().getRuleNames()),
                        change.get_parsetree(),
                        Arrays.asList(change.get_parser().getRuleNames()),
                        writer);
            } catch (Exception e) {

                return;
            }
            assert writer != null;
            writer.close();

            if (equal || (equal2 && equal3)) {
                List<String> list_change_old_leaves = new ArrayList<>();
                List<String> list_change_new_leaves = new ArrayList<>();


                TreeUtils.query_leaves_extraction(change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), list_change_old_leaves);


                boolean new_code = false;

                for (String str : list_change_old_leaves) {
                    if (str.equals("->") || str.equals("<EOF>")) {
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
                // boolean final_matching = Matching_Methods.leaves_final_matching(array_query_old_nodes, array_query_new_nodes, array_change_old_nodes, array_change_new_nodes, input);

                if (final_matching) {
                    number_matching.getAndIncrement();

                    List<String> list = Arrays.asList(candidate.replace("$$", "\n").split("->"));
                    String ss = list.get(1).substring(1, list.get(1).length() - 1).replace("if (", "if(");
                    String ss22 = list.get(0).replace("if (", "if(");
                    if (!ss.equals(ss22)) {
                        ///////////////////////////////number_matching++;
                        if (Config.NORMAL) {
                            System.out.println("- " + list.get(0) + "\n+ " + list.get(1) + "\n" + info);
                            List<String> items = Arrays.asList(info.split("\\s*@@\\s*"));
                            String s1 = items.get(2).substring(items.get(2).indexOf("/") + 1).trim();

                        /*
                        try {
                            //    buff_writer_features.write("\" " + list.get(0) + " \" , " + "\" " + list.get(1) + " \" , " + " \" " + s1 + " \" , " + " \" " + items.get(0).replaceAll("commit ", "") + "\" , " + "\"" + items.get(1) + "\"\n");
                            buff_writer_features.write(Pipeline.escapeSpecialCharacters(list.get(0)) + ","  + Pipeline.escapeSpecialCharacters(list.get(1)) + "," + Pipeline.escapeSpecialCharacters(s1) + ","
                                    + Pipeline.escapeSpecialCharacters(items.get(0).replaceAll("commit ", "")) + ","  + Pipeline.escapeSpecialCharacters(items.get(1)) + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }*/
                            /*try {
                                buff_writer_results.write("- " + list.get(0) + "\n+ " + list.get(1) + "\n\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }*/
                        }
                    }
                }
            }

        }

    }


    /**
     * Method that compute the cosine distance between query feature vector and change feature vectors.
     *
     * @param tree_query: query Tree
     * @return number of matching changes found
     */
    public static long final_matching(Java_Tree tree_query) {
        Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.CANDIDATE_CHANGES);

        int length = tree_query.features.length;
        double threshold = 0.2;
        long number_matching = 0;

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/candidate_changes_filtered.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {
            Java_Tree change = new Java_Tree(candidate.replace("$$", "\n"));
            //  Python3_Tree change = new Python3_Tree(candidate.replace("$$", "\n"));
            //Computing hash sum of changes
            List<Integer> list_change_hash_sum = new ArrayList<Integer>();
            List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
            TreeUtils.tree_hash_sumAST_java(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

            //Computing list change parent child
            List<Integer> list_change_parent_child = new ArrayList<Integer>();
            TreeUtils.pairs_parent_childAST_java(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);

            double score = Matching_Methods.cosineSimilarity(tree_query.features, change.features, length);

            if (score >= threshold) {
                number_matching++;
                assert writer != null;
                writer.println(candidate.replace("\n", "$$") + "\n");
                System.out.println(candidate.replace("$$", "\n") + " score: " + score);
            }
        }

        assert writer != null;
        writer.close();

        return number_matching;
    }

    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param tree_query          : query Tree
     * @param buff_writer_results
     * @return number of matching changes found
     */
    public static long final_comparison(Java_Tree tree_query, long change_number, Tree query_old, Tree query_new, BufferedWriter buff_writer_results, String query_string) {
        BufferedWriter buff_writer_features = null;
        BufferedWriter buff_writer_features_candidate = null;
        try {
            Writer writer =
                    new OutputStreamWriter(
                            new FileOutputStream("./src/main/resources/Features_Vectors/deepbugs.csv"), StandardCharsets.UTF_8);
            //buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/deepbugs.csv"), "UTF-8");
            buff_writer_features = new BufferedWriter(writer);

            buff_writer_features_candidate = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/changes_feature_vectors_candidates.csv"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.CANDIDATE_CHANGES);

        long number_matching = 0;

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

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(new File("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {

            String info = scanner2.nextLine();

            Java_Tree change = new Java_Tree(candidate.replace("$$", "\n"));
            //  Python3_Tree change = new Python3_Tree(candidate.replace("$$", "\n"));

            //CANDIDATE CSV!!!
            int xx = Integer.MAX_VALUE / 2097152;
            //Computing hash sum of changes
            List<Integer> list_change_hash_sum = new ArrayList<Integer>();
            List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
            TreeUtils.tree_hash_sumAST_java(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);
            //   TreeUtils.tree_hash_sumAST_python(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

            //Computing list change parent child
            List<Integer> list_change_parent_child = new ArrayList<Integer>();
            TreeUtils.pairs_parent_childAST_java(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);
            // TreeUtils.pairs_parent_childAST_python(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);

            // Writing the feature vector in a csv file
            StringBuilder str_builder = new StringBuilder();

            for (int element : change.features) {
                str_builder.append(element);
                str_builder.append(",");
            }
            str_builder.append("\n");

            try {
                buff_writer_features_candidate.write(str_builder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

            /////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////


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
            boolean equal = false;
            try {
                if (query_old != null && query_new != null) {
                    equal2 = TreeUtils.deep_tree_comparison_partial(query_old, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(0), Arrays.asList(change.get_parser().getRuleNames()), writer, false, candidate.replace("$$", "\n"));
                    equal3 = TreeUtils.deep_tree_comparison_partial(query_new, Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree().getChild(2), Arrays.asList(change.get_parser().getRuleNames()), writer, false, candidate.replace("$$", "\n"));
                }
                //  equal = TreeUtils.deep_tree_comparison_python(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
                //equal = TreeUtils.deep_tree_comparison_javascript2(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
                equal = TreeUtils.deep_tree_comparison_java(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);

            } catch (Exception e) {

                continue;
            }
            assert writer != null;
            writer.close();

            if (equal || (equal2 && equal3)) {
                List<String> list_change_old_leaves = new ArrayList<>();
                List<String> list_change_new_leaves = new ArrayList<>();


                TreeUtils.query_leaves_extraction(change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), list_change_old_leaves);


                new_code = false;

                for (String str : list_change_old_leaves) {
                    if (str.equals("->") || str.equals("<EOF>")) {
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

                boolean final_matching = Matching_Methods.leaves_final_matching(array_query_old_nodes, array_query_new_nodes, array_change_old_nodes, array_change_new_nodes, query_string, candidate.replace("$$", "\n"));

                if (final_matching) {


                    List<String> list = Arrays.asList(candidate.replace("$$", "\n").split("->"));
                    String ss = list.get(1).substring(1, list.get(1).length() - 1).replace("if (", "if(");
                    String ss22 = list.get(0).replace("if (", "if(");
                    if (!ss.equals(ss22)) {
                        number_matching++;
                        if (Config.NORMAL) {
                            System.out.println("- " + list.get(0) + "\n+ " + list.get(1) + "\n" + info);
                            List<String> items = Arrays.asList(info.split("\\s*@@\\s*"));
                            String s1 = items.get(2).substring(items.get(2).indexOf("/") + 1).trim();

                            try {
                                //    buff_writer_features.write("\" " + list.get(0) + " \" , " + "\" " + list.get(1) + " \" , " + " \" " + s1 + " \" , " + " \" " + items.get(0).replaceAll("commit ", "") + "\" , " + "\"" + items.get(1) + "\"\n");
                                buff_writer_features.write(escapeSpecialCharacters(list.get(0)) + "," + escapeSpecialCharacters(list.get(1)) + "," + escapeSpecialCharacters(s1) + ","
                                                           + escapeSpecialCharacters(items.get(0).replaceAll("commit ", "")) + "," + escapeSpecialCharacters(items.get(1)) + "\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                                /*try {
                                    buff_writer_results.write("- " + list.get(0) + "\n+ " + list.get(1) + "\n\n");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }*/
                        }
                    }
                }
            }
        }

        try {
            buff_writer_features.close();
            buff_writer_features_candidate.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  }
        // System.out.println("Total changes in Final Matching: " + allLines.size() + "\n");
        return number_matching;
    }

    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param tree_query          : query Tree
     * @param buff_writer_results
     * @return number of matching changes found
     */
    public static long final_comparison_multithreading(Javascript_Tree tree_query, long change_number, Tree query_old, Tree query_new, BufferedWriter buff_writer_results) {
        try {
            BufferedWriter buff_writer_features = null;
            try {
                Writer writer =
                        new OutputStreamWriter(
                                new FileOutputStream("./src/main/resources/Features_Vectors/deepbugs.csv"), StandardCharsets.UTF_8);
                //buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/deepbugs.csv"), "UTF-8");
                buff_writer_features = new BufferedWriter(writer);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Iterable<String> allLines = FilePathUtils.getAllLines(FilePathUtils.CANDIDATE_CHANGES);

            //long number_matching = 0;
            //AtomicInteger number_matching = new AtomicInteger(0);

            //number_matching.getAndIncrement();

            List<String> list_query_nodes = new ArrayList<>();
            TreeUtils.query_extraction_nodes(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), list_query_nodes);

            List<String> list_query_old_leaves = new ArrayList<>();
            List<String> list_query_new_leaves = new ArrayList<>();

            TreeUtils.query_leaves_extraction(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), list_query_old_leaves);

            boolean new_code = false;

            for (String str : list_query_old_leaves) {
                if (str.equals("->") || str.equals("<EOF>")) {
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

            Scanner scanner2 = null;
            scanner2 = new Scanner(new File("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));

            ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            //ExecutorService executor= Executors.newCachedThreadPool();

            for (String candidate : allLines) {
                executor.execute(new Final_Matching(candidate, scanner2.nextLine(),
                        tree_query, array_query_old_nodes, array_query_new_nodes, buff_writer_features));

            }

            executor.shutdown(); // once you are done with ExecutorService
            executor.awaitTermination(1, TimeUnit.MINUTES);
            buff_writer_features.close();

            //  }
            // System.out.println("Total changes in Final Matching: " + allLines.size() + "\n");
            return number_matching.get();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }

        while (true) {
            if (escapedData.endsWith(" ")) {
                escapedData = escapedData.substring(0, escapedData.length() - 1);
            } else {
                break;
            }
        }

        while (true) {
            if (escapedData.startsWith(" ")) {
                escapedData = escapedData.substring(1);
            } else {
                break;
            }
        }

        return escapedData;
    }

}
