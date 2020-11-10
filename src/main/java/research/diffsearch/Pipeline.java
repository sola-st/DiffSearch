package research.diffsearch;

import ProgrammingLanguage.Java.JavaParserBaseListener;
import ProgrammingLanguage.JavaScript.ECMAScriptBaseListener;
import ProgrammingLanguage.Python.Python3BaseListener;
import matching.Matching;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Pipeline {

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
                equal = TreeUtils.deep_tree_comparison_javascript2(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), change.get_parsetree(), Arrays.asList(change.get_parser().getRuleNames()), writer);
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
                        if (Config.EFFECTIVENESS || Config.NORMAL) {
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
     * Extraction of the features from changes in the form: old -> new. The features vectors are written in the file
     * changes_feature_vectors.csv and the change in the string format in the file changes_strings.txt to have
     * an index of features vectors and changes.105000010500001050000
     *
     * @param change_number : number of the changes found
     */
    public static long feature_extraction(long change_number) {
        long real_changes = 0;

        try {
            //Creation of a buffered writer for the features and the change in a string form (for print)
            BufferedWriter buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/changes_feature_vectors_python.csv"));
            // Writing the string change in a file (ONLY FOR TESTING)
            FileWriter writer = new FileWriter("./src/main/resources/Features_Vectors/changes_strings_python.txt");
            FileWriter writer2 = new FileWriter("./src/main/resources/Features_Vectors/changes_strings_prop_python.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            BufferedWriter bw2 = new BufferedWriter(writer2);

            Scanner scanner = new Scanner(new File("./src/main/resources/Features_Vectors/corpus_diff.txt"));
            Scanner scanner2 = new Scanner(new File("./src/main/resources/Features_Vectors/corpus_diff_prop.txt"));

            for (int i = 0; i < change_number; i++) {
                //  if(i==10000 || i==30000 || i == 500000 || i == 1000000 || i == 1200000 || i == 2200000
                //         || i == 3200000 || i == 4200000 || i == 5200000 || i == 6200000)
                System.out.println(i + " with " + real_changes);

                if (i == 1676)
                    i++;

                if (!scanner.hasNext())
                    break;

                String info = scanner2.nextLine();
                StringBuilder stringBuilder = new StringBuilder();

                String str = "test";

                while (!str.equals("$$$")) {
                    str = scanner.next();
                    stringBuilder.append(str + ' ');
                }

                String change_string = stringBuilder.toString().replace("$$$", "");

                if (change_string.length() > 500)
                    continue;


                //Python3_Tree change = null;
                //Javascript_Tree change = null;
                Java_Tree change = null;
                try {
                    //change = new Javascript_Tree(change_string);}
                    //change = new Python3_Tree(change_string);
                    change = new Java_Tree(change_string);
                } catch (Exception e) {
                    continue;
                }

                //try to fix errors
                if (change.error) {
                    //System.out.println(change.get_change_string() + "\n");

                    if (!change_string.contains("-->"))
                        change_string = change_string.replaceAll("->", "-->");


                    try {
                        //change = new Javascript_Tree(change_string);}
                        //change = new Python3_Tree(change_string);
                        change = new Java_Tree(change_string.replace("}", ""));
                    } catch (Exception e) {
                        continue;
                    }

                    if (change.error) {
                        continue;
                    }
                    //  int eee=0;
                    //          if(change_string.contains("transformer.Transformer("))
                    //             eee++;
/*
                    if(true) {

                        if (change_string.equals("_-> "))
                            change = new Python3_Tree("_ -> x = x + 1");
                        else
                            change = new Python3_Tree(change_string.replaceAll("}", "").replaceAll("\\{", "{ int x =0;}").replaceAll("_ ", ""));


                        if (change.error) {
                            change = new Python3_Tree(change_string.replaceAll("-->", ")-->"));
                            if (change.error) {
                                change = new Python3_Tree(change_string + ")");
                                if (change.error) {
                                    change = new Python3_Tree(change_string + " pass");
                                    if (change.error) {
                                        change = new Python3_Tree("f(" + change_string);
                                        if (change.error) {
                                            change = new Python3_Tree(change_string + "x)");
                                            if (change.error) {
                                                change = new Python3_Tree(change_string.replaceAll("-->", "x)-->") + "x)");
                                                if (change.error) {
                                         //           System.out.println(change.get_change_string() + "\n");
                                                    continue;
                                                }
                                            }
                                        }
                                }
                            }
                        }
                    }else
                        continue;
                }*/
                }

                //FEAUTE COMPUTATION

                //Computing hash sum of changes (1 FEATURE)
                List<Integer> list_change_hash_sum = new ArrayList<Integer>();
                List<String> ruleNamesList2 = Arrays.asList(change.get_parser().getRuleNames());
                // TreeUtils.tree_hash_sumAST_javascript(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);
                //TreeUtils.tree_hash_sumAST_python(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);
                TreeUtils.tree_hash_sumAST_java(change.get_parsetree(), ruleNamesList2, list_change_hash_sum, change.features);

                //Computing list change parent child (2 FEATURE)
                List<Integer> list_change_parent_child = new ArrayList<Integer>();
                //  TreeUtils.pairs_parent_childAST_javascript(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);
                //TreeUtils.pairs_parent_childAST_python(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);
                TreeUtils.pairs_parent_childAST_java(change.get_parsetree(), ruleNamesList2, list_change_parent_child, change.features);

                // Writing the feature vector in a csv file
                StringBuilder str_builder = new StringBuilder();

                for (int element : change.features) {
                    str_builder.append(element);
                    str_builder.append(",");
                }
                str_builder.append("\n");

                buff_writer_features.write(str_builder.toString());

                // Writing the string change in a file
                bw.write(change.get_change_string().replace("\n", "$$") + "\n");
                bw2.write(info + "\n");
                real_changes++;
            }
            buff_writer_features.close();
            bw.close();
            bw2.close();

        } catch (IOException e) {
            e.printStackTrace();
            return real_changes;
        }

        return real_changes;
    }

    /**
     * Method that creates a new process that launches Python script containing the FAISS Framework that indexes all changes.
     */
    public static void indexing_candidate_changes(int n) {
        Process python_indexing;

        try {
            long startTime_gitdiff = System.currentTimeMillis();
            python_indexing = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS_indexing.py " + Integer.toString(n));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_indexing.getErrorStream()));

            java.io.InputStream is = python_indexing.getInputStream();
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");

            if (s.hasNext()) {
                String ret = s.next();
            }

            int exitCode = python_indexing.waitFor();
            String st = null;
            if (exitCode != 0) {
                // Read any errors from the attempted command
                System.out.println("Here is the standard error of the command:\n");
                while ((st = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("FAISS_indexing.py exited with error " + exitCode + ".\n");
            }
            python_indexing.destroy();
            long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);
            System.out.println("Indexing time: " + gitdiff_extraction / 1000 + " seconds.\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //  System.out.println("FAISS INDEXING STAGE DONE.\n");

    }

    /**
     * Method that creates a new process that launches Python script containing the FAISS Framework that indexes all changes.
     */
    public static void indexing_candidate_changes_effectiveness(int n, int skip) {
        Process python_indexing;

        try {
            long startTime_gitdiff = System.currentTimeMillis();
            python_indexing = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS_indexing_effectiveness.py " + Integer.toString(n) + " " + Integer.toString(skip));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_indexing.getErrorStream()));

            java.io.InputStream is = python_indexing.getInputStream();
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");

            if (s.hasNext()) {
                String ret = s.next();
            }

            int exitCode = python_indexing.waitFor();
            String st = null;
            if (exitCode != 0) {
                // Read any errors from the attempted command
                System.out.println("Here is the standard error of the command:\n");
                while ((st = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("FAISS_indexing.py exited with error " + exitCode + ".\n");
            }
            python_indexing.destroy();
            long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);
            System.out.println("Indexing time: " + gitdiff_extraction / 1000 + " seconds.\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //  System.out.println("FAISS INDEXING STAGE DONE.\n");

    }

    /**
     * Method that creates a new process that launches Python script containing the FAISS Framework that indexes all changes.
     */
    public static void indexing_candidate_changes_new(int n, String reader, String writer) {
        Process python_indexing;

        try {
            long startTime_gitdiff = System.currentTimeMillis();
            python_indexing = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS_indexing_python.py " + Integer.toString(n) + " " + reader + " " + writer);

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_indexing.getErrorStream()));

            java.io.InputStream is = python_indexing.getInputStream();
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");

            if (s.hasNext()) {
                String ret = s.next();
            }

            int exitCode = python_indexing.waitFor();
            String st = null;
            if (exitCode != 0) {
                // Read any errors from the attempted command
                System.out.println("Here is the standard error of the command:\n");
                while ((st = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("FAISS_indexing.py exited with error " + exitCode + ".\n");
            }
            python_indexing.destroy();
            long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);
            System.out.println("Indexing time: " + gitdiff_extraction / 1000 + " seconds.\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //  System.out.println("FAISS INDEXING STAGE DONE.\n");

    }

    /**
     * Method that creates a new process that launches Python script containing the FAISS Framework that indexes all changes.
     */
    public static void indexing_searching_python() {
        Process python;

        //I use the file lock.txt to lock the python process until the query is not acquired.
        File fnew = new File("./src/main/resources/Python/lock.txt");
        try {
            FileWriter f2 = new FileWriter(fnew, false);
            f2.write("JAVA");
            f2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            python = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS.py");

            int exitCode = python.waitFor();
            if (exitCode != 0) {
                throw new IOException("FAISS.py exited with error " + exitCode + ".\n");
            }
            python.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("FAISS STAGE DONE.\n");

    }

    /**
     * Creation of the query tree and extraction of its features.
     *
     * @param query_input: String of the query
     * @return AST of the query
     */
    public static Java_Tree query_feature_extraction(String query_input) {
        Java_Tree tree_query = null;
        //Python3_Tree tree_query = null;

        //Creating the tree for the query string
        try {
            tree_query = new Java_Tree(query_input);
            // tree_query = new Javascript_Tree(query_input);
            //  tree_query = new Python3_Tree(query_input);
            if (TreeUtils.node_count(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), 0) <= 5 ||
                    tree_query.isError() || tree_query.error)
                return null;

            //Declaring query variables
            List<Integer> list_parent_child = new ArrayList<Integer>();
            List<Integer> list_hash_sum = new ArrayList<Integer>();
            // ECMAScriptBaseListener listener = new ECMAScriptBaseListener();
            //Python3BaseListener listener = new Python3BaseListener();
            JavaParserBaseListener listener = new JavaParserBaseListener();


            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree_query.get_parsetree());
            List<String> ruleNamesList = Arrays.asList(tree_query.get_parser().getRuleNames());

            //Computing hash sum and pairs parent child
            // TreeUtils.tree_hash_sumAST_javascript(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            // TreeUtils.pairs_parent_childAST_javascript(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);

            //TreeUtils.tree_hash_sumAST_python(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            //TreeUtils.pairs_parent_childAST_python(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);

            TreeUtils.tree_hash_sumAST_java(tree_query.get_parsetree(), ruleNamesList, list_hash_sum, tree_query.features);
            TreeUtils.pairs_parent_childAST_java(tree_query.get_parsetree(), ruleNamesList, list_parent_child, tree_query.features);
            list_hash_sum.addAll(list_parent_child);

            //Creation of a buffered writer
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/query_feature_vectors.csv"));

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
    public static Javascript_Tree query_feature_extraction_js(String query_input) {
        Javascript_Tree tree_query = null;
        //Python3_Tree tree_query = null;

        //Creating the tree for the query string
        try {
            //tree_query = new Java_Tree(query_input);
            tree_query = new Javascript_Tree(query_input);
            //  tree_query = new Python3_Tree(query_input);
            if (TreeUtils.node_count(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), 0) <= 5 ||
                    tree_query.isError() || tree_query.error)
                return null;

            //Declaring query variables
            List<Integer> list_parent_child = new ArrayList<Integer>();
            List<Integer> list_hash_sum = new ArrayList<Integer>();
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
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/query_feature_vectors.csv"));

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
            if (TreeUtils.node_count(tree_query.get_parsetree(), Arrays.asList(tree_query.get_parser().getRuleNames()), 0) <= 5 ||
                    tree_query.isError() || tree_query.error)
                return null;

            //Declaring query variables
            List<Integer> list_parent_child = new ArrayList<Integer>();
            List<Integer> list_hash_sum = new ArrayList<Integer>();
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
            BufferedWriter buff_writer = new BufferedWriter(new FileWriter("./src/main/resources/Features_Vectors/query_feature_vectors.csv"));

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
     * Method that creates a new process that launches Python script containing the FAISS Framework, that clusters changes with query.
     */
    public static double search_candidate_changes() {
        Process python_Nearest_Neighbor_Search;
        String line = null;
        double ret = -1;
        long startTime_gitdiff = System.currentTimeMillis();

        try {

            python_Nearest_Neighbor_Search = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS_Nearest_Neighbor_Search.py");

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_Nearest_Neighbor_Search.getErrorStream()));

            int exitCode = python_Nearest_Neighbor_Search.waitFor();
            if (exitCode != 0) {

                System.out.println("Here is the standard error of the command:\n");
                String s;
                while ((s = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("FAISS_Nearest_Neighbor_Search.py exited with error " + exitCode + ".\n");
            }

            python_Nearest_Neighbor_Search.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);
        System.out.println("INDEX LOADED in " + gitdiff_extraction / 1000 + " seconds.\n");

        return ret;
    }

    public static void port_close(int port) {
        Process python_Nearest_Neighbor_Search;
        String line = null;
        double ret = -1;
        long startTime_gitdiff = System.currentTimeMillis();

        try {

            python_Nearest_Neighbor_Search = Runtime.getRuntime().exec("fuser -k " + Integer.toString(port) + "/tcp");

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_Nearest_Neighbor_Search.getErrorStream()));

            int exitCode = python_Nearest_Neighbor_Search.waitFor();
            if (exitCode != 0) {

                System.out.println("Here is the standard error of the command:\n");
                String s;
                while ((s = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("port_close exited with error " + exitCode + ".\n");
            }

            python_Nearest_Neighbor_Search.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);
        System.out.println("INDEX LOADED in " + gitdiff_extraction / 1000 + " seconds.\n");


    }

    /**
     * Method that creates a new process that launches Python script containing the FAISS Framework, that clusters changes with query.
     */
    public static double search_candidate_changes_scalability() {
        Process python_Nearest_Neighbor_Search;
        String line = null;
        double ret = -1;
        long startTime_gitdiff = System.currentTimeMillis();

        try {

            python_Nearest_Neighbor_Search = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS_Nearest_Neighbor_Search_python.py " + "scalability/Java/faiss_java.index");

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_Nearest_Neighbor_Search.getErrorStream()));

            int exitCode = python_Nearest_Neighbor_Search.waitFor();
            if (exitCode != 0) {

                System.out.println("Here is the standard error of the command:\n");
                String s;
                while ((s = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("FAISS_Nearest_Neighbor_Search.py exited with error " + exitCode + ".\n");
            }

            python_Nearest_Neighbor_Search.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long gitdiff_extraction = (System.currentTimeMillis() - startTime_gitdiff);
        System.out.println("INDEX LOADED in " + gitdiff_extraction / 1000 + " seconds.\n");

        return ret;
    }

    /**
     * Method that creates a new process that launches Python script containing the FAISS Framework, that clusters changes with query.
     */
    public static double search_candidate_changes_new() {
        Process python_Nearest_Neighbor_Search;
        String line = null;
        double ret = -1;

        try {
            python_Nearest_Neighbor_Search = Runtime.getRuntime().exec(Config.PYTHON_CMD + " ./src/main/resources/Python/FAISS_Nearest_Neighbor_Search.py");

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(python_Nearest_Neighbor_Search.getErrorStream()));

            int exitCode = python_Nearest_Neighbor_Search.waitFor();
            if (exitCode != 0) {

                System.out.println("Here is the standard error of the command:\n");
                String s;
                while ((s = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("FAISS_Nearest_Neighbor_Search.py exited with error " + exitCode + ".\n");
            }

            python_Nearest_Neighbor_Search.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return ret;
    }

    /**
     * Method that compute the cosine distance between query feature vector and change feature vectors.
     *
     * @param tree_query: query Tree
     * @return number of matching changes found
     */
    public static long final_matching(Java_Tree tree_query) {
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int length = tree_query.features.length;
        double threshold = 0.2;
        long number_matching = 0;

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/candidate_changes_filtered.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        assert allLines != null;
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
        List<String> allLines = null;
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

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

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

        assert allLines != null;
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
                        if (Config.EFFECTIVENESS || Config.NORMAL) {
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
        List<String> allLines = null;
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

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        try {
            scanner2 = new Scanner(new File("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert allLines != null;

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        //ExecutorService executor= Executors.newCachedThreadPool();

        try {
            for (String candidate : allLines) {
                assert scanner2 != null;
                executor.execute(new Final_Matching(candidate, scanner2.nextLine(), tree_query, array_query_old_nodes, array_query_new_nodes, buff_writer_features));

            }
        } catch (Exception err) {
            err.printStackTrace();
        }

        executor.shutdown(); // once you are done with ExecutorService
        try {
            boolean finished = executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            buff_writer_features.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  }
        // System.out.println("Total changes in Final Matching: " + allLines.size() + "\n");
        return number_matching.get();
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


    static void scalability_java() {
        int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};

        //int[] changes = { 10000, 50000, 100000};

        BufferedWriter buff_writer_features = null;
        double time_python2 = 0;

        int delay = 5;

        try {
            buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/scalability/Java/scalability_java.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i : changes) {
            System.out.println("\n" + i + "");
            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/

            try {
                Pipeline.indexing_candidate_changes_new(i, "scalability/Java/changes_feature_vectors_java.csv", "scalability/Java/faiss_java.index");
                //Pipeline.indexing_candidate_changes(i);
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* **************************************************************************************************************
             * SEARCH PYTHON STAGE (FAISS)
             ****************************************************************************************************************/

            //Skip FAISS stage if the dataset is small
            try {
                new Thread(Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(delay++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Socket socket = null;
            try {
                socket = new Socket(Config.host, Config.port);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

                System.out.println("\nCONNECTION WITH SERVER FAILED.\n");
                return;
            }

            // Javascript_Tree tree_query = null;
            Java_Tree tree_query = null;
            List<String> allLines = null;

            try {
                allLines = Files.readAllLines(Paths.get("./src/main/resources/scalability/Java/input.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {
                assert buff_writer_features != null;
                buff_writer_features.write(i + ",");
            } catch (IOException e) {
                e.printStackTrace();
            }


            assert allLines != null;
            for (String query_input : allLines) {
                try {
                    tree_query = Pipeline.query_feature_extraction(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n" + query_input);
                    return;
                }

                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.print("PYTHON" + "\r\n");
                    out.flush();
                    //System.out.println("WAITING MESSAGE..");

                    time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                    String in = stdIn.readLine();
                    //System.out.println("MESSAGE RECEIVED");

                    if (!in.equals("JAVA"))
                        continue;

                } catch (IOException e) {
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
                 * */

                long startTime_matching = System.currentTimeMillis();


                try {
                    List<String> output = diffsearch_offline(tree_query, socket);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                long duration_matching = (System.currentTimeMillis() - startTime_matching);
                System.out.println("final matching time: " + duration_matching / 1000.0);

                try {
                    buff_writer_features.write(time_python2 + "," + duration_matching / 1000.0 + ",");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try {
                buff_writer_features.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            PrintWriter out = null;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.print("END" + "\r\n");
            out.flush();
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            buff_writer_features.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static void scalability_javaScript() {
        int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};

        //int[] changes = { 10000, 50000, 100000};

        BufferedWriter buff_writer_features = null;
        double time_python2 = 0;

        int delay = 5;

        try {
            buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/scalability/JavaScript/scalability_javaScript.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i : changes) {
            System.out.println("\n" + i + "");
            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/

            try {
                // Pipeline.indexing_candidate_changes_new(i, "scalability/JavaScript/changes_feature_vectors_javaScript.csv", "scalability/Java/faiss_javaScript.index");
                Pipeline.indexing_candidate_changes(i);
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* **************************************************************************************************************
             * SEARCH PYTHON STAGE (FAISS)
             ****************************************************************************************************************/

            //Skip FAISS stage if the dataset is small
            try {
                new Thread(Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(delay++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Socket socket = null;
            try {
                socket = new Socket(Config.host, Config.port);
            } catch (IOException e1) {
                e1.printStackTrace();

                System.out.println("\nCONNECTION WITH SERVER FAILED.\n");
                return;
            }

            Javascript_Tree tree_query = null;
            //Java_Tree tree_query = null;
            List<String> allLines = null;

            try {
                allLines = Files.readAllLines(Paths.get("./src/main/resources/scalability/JavaScript/input.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {
                assert buff_writer_features != null;
                buff_writer_features.write(i + ",");
            } catch (IOException e) {
                e.printStackTrace();
            }


            assert allLines != null;
            for (String query_input : allLines) {
                try {
                    tree_query = Pipeline.query_feature_extraction_js(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n" + query_input);
                    return;
                }

                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.print("PYTHON" + "\r\n");
                    out.flush();
                    //System.out.println("WAITING MESSAGE..");

                    time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                    String in = stdIn.readLine();
                    //System.out.println("MESSAGE RECEIVED");

                    if (!in.equals("JAVA"))
                        continue;

                } catch (IOException e) {
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
                 * */

                long startTime_matching = System.currentTimeMillis();


                try {
                    List<String> output = diffsearch_offline_js(tree_query, socket);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                long duration_matching = (System.currentTimeMillis() - startTime_matching);
                System.out.println("final matching time: " + duration_matching / 1000.0);

                try {
                    buff_writer_features.write(time_python2 + "," + duration_matching / 1000.0 + ",");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try {
                buff_writer_features.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            PrintWriter out = null;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.print("END" + "\r\n");
            out.flush();
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            buff_writer_features.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static void scalability_python() {
        int[] changes = {10000, 50000, 100000, 250000, 400000, 500000, 600000, 700000, 850000, 1000000};

        //int[] changes = { 10000, 50000, 100000};

        BufferedWriter buff_writer_features = null;
        double time_python2 = 0;

        int delay = 5;

        try {
            buff_writer_features = new BufferedWriter(new FileWriter("./src/main/resources/scalability/Python/scalability_python.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i : changes) {
            System.out.println("\n" + i + "");
            /* **************************************************************************************************************
             * INDEXING PYTHON STAGE (FAISS)*/

            try {
                // Pipeline.indexing_candidate_changes_new(i, "scalability/JavaScript/changes_feature_vectors_javaScript.csv", "scalability/Java/faiss_javaScript.index");
                Pipeline.indexing_candidate_changes(i);
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* **************************************************************************************************************
             * SEARCH PYTHON STAGE (FAISS)
             ****************************************************************************************************************/

            //Skip FAISS stage if the dataset is small
            try {
                new Thread(Pipeline::search_candidate_changes).start();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                TimeUnit.SECONDS.sleep(delay++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Socket socket = null;
            try {
                socket = new Socket(Config.host, Config.port);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();

                System.out.println("\nCONNECTION WITH SERVER FAILED.\n");
                return;
            }

            Python3_Tree tree_query = null;
            //Java_Tree tree_query = null;
            List<String> allLines = null;

            try {
                allLines = Files.readAllLines(Paths.get("./src/main/resources/scalability/Python/input.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {
                assert buff_writer_features != null;
                buff_writer_features.write(i + ",");
            } catch (IOException e) {
                e.printStackTrace();
            }


            assert allLines != null;
            for (String query_input : allLines) {
                try {
                    tree_query = Pipeline.query_feature_extraction_python(query_input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (tree_query == null) {
                    System.out.print("The query is not correct, please try again.\n" + query_input);
                    return;
                }

                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.print("PYTHON" + "\r\n");
                    out.flush();
                    //System.out.println("WAITING MESSAGE..");

                    time_python2 = Double.parseDouble(stdIn.readLine().substring(0, 5));

                    String in = stdIn.readLine();
                    //System.out.println("MESSAGE RECEIVED");

                    if (!in.equals("JAVA"))
                        continue;

                } catch (IOException e) {
                    e.printStackTrace();
                }

                /* **************************************************************************************************************
                 * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
                 * */

                long startTime_matching = System.currentTimeMillis();


                try {
                    List<String> output = diffsearch_offline_python(tree_query, socket);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                long duration_matching = (System.currentTimeMillis() - startTime_matching);
                System.out.println("final matching time: " + duration_matching / 1000.0);

                try {
                    buff_writer_features.write(time_python2 + "," + duration_matching / 1000.0 + ",");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try {
                buff_writer_features.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            PrintWriter out = null;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.print("END" + "\r\n");
            out.flush();
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            buff_writer_features.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void small_test(Java_Tree tree_query, Tree query_old, Tree query_new, BufferedWriter buff_writer_results, String query_string) {
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
    }

    void old_manual_input() {
        /*
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
         }*/
        return;
    }

    public static List<CodeChangeWeb> run_test(String query, Socket socket_python) {

        Java_Tree tree_query = null;

        tree_query = query_feature_extraction(query);

        if (tree_query == null) {

            List<CodeChangeWeb> output_list = new ArrayList<CodeChangeWeb>();
            CodeChangeWeb temp = new CodeChangeWeb("The query is not correct, please try again.", " ", " ", " ");
            output_list.add(temp);
            return output_list;
        }


        //return small_test_new(tree_query, query_old, query_new, query, candidate);
        return diffsearch_online(tree_query, query, socket_python);
    }


    public static List<String> run_test_noGUI(String query, Socket socket_python) {

        Java_Tree tree_query = null;

        tree_query = query_feature_extraction(query);

        if (tree_query == null) {

            List<String> output_list = new ArrayList<String>();
            output_list.add("The query is not correct, please try again.");
            return output_list;
        }


        //return small_test_new(tree_query, query_old, query_new, query, candidate);
        return diffsearch_online_noGUI(tree_query, query, socket_python);
    }


    public static List<String> small_test_new(Java_Tree tree_query, Tree query_old, Tree query_new, String query_string, String candidate) {
        List<String> output_list = new ArrayList<String>();

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


    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param tree_query : query Tree
     * @return number of matching changes found
     */
    public static List<CodeChangeWeb> diffsearch_online(Java_Tree tree_query, String query_string, Socket socket) {


        List<CodeChangeWeb> output_list = new ArrayList<CodeChangeWeb>();

        try {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();
            //System.out.println("WAITING MESSAGE..");

            Double.parseDouble(stdIn.readLine().substring(0, 5));

            String in = stdIn.readLine();
            //System.out.println("MESSAGE RECEIVED");

            if (!in.equals("JAVA"))
                return output_list;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* **************************************************************************************************************
         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
         * */

        List<String> allLines = null;

        int matching_counter = 0;

        Java_Tree queryJavaTree = new Java_Tree(query_string);
        ParseTree queryTree = queryJavaTree.get_parsetree();

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return output_list;
        }

        BufferedReader info_reader = null;
        try {
            info_reader = new BufferedReader(new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {
            String candidate_url = null;
            try {
                assert info_reader != null;
                candidate_url = info_reader.readLine();
            } catch (IOException e) {
                candidate_url = "";
                e.printStackTrace();
            }

            Java_Tree changeJavaTree = new Java_Tree(candidate);
            ParseTree changeTree = changeJavaTree.get_parsetree();

            Matching matching = new Matching(queryTree, tree_query.get_parser());

            if (matching.isMatch(changeTree, changeJavaTree.get_parser())) {
                List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                if (!list.get(1).equals(list.get(0))) {
                    List<String> url_line = Arrays.asList(compute_candidate_url(candidate_url).split("-->"));
                    CodeChangeWeb temp = new CodeChangeWeb(url_line.get(0), url_line.get(1), list.get(0), list.get(1));
                    output_list.add(temp);
                    matching_counter++;

                    //System.out.println(compute_candidate_url(candidate_url));

                    if (matching_counter == 10)
                        return output_list;
                }
            }

        }

        return output_list;

    }


    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param tree_query : query Tree
     * @return number of matching changes found
     */
    public static List<String> diffsearch_online_noGUI(Java_Tree tree_query, String query_string, Socket socket) {


        List<String> output_list = new ArrayList<>();

        try {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();
            //System.out.println("WAITING MESSAGE..");

            Double.parseDouble(stdIn.readLine().substring(0, 5));

            String in = stdIn.readLine();
            //System.out.println("MESSAGE RECEIVED");

            if (!in.equals("JAVA"))
                return output_list;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* **************************************************************************************************************
         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
         * */

        List<String> allLines = null;

        int matching_counter = 0;

        Java_Tree queryJavaTree = new Java_Tree(query_string);
        ParseTree queryTree = queryJavaTree.get_parsetree();

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return output_list;
        }

        BufferedReader info_reader = null;
        try {
            info_reader = new BufferedReader(new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {
            String candidate_url = null;
            try {
                assert info_reader != null;
                candidate_url = info_reader.readLine();
            } catch (IOException e) {
                candidate_url = "";
                e.printStackTrace();
            }

            Java_Tree changeJavaTree = new Java_Tree(candidate);
            ParseTree changeTree = changeJavaTree.get_parsetree();

            Matching matching = new Matching(queryTree, tree_query.get_parser());

            if (matching.isMatch(changeTree, changeJavaTree.get_parser())) {
                List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                if (!list.get(1).equals(list.get(0))) {
                    output_list.add(candidate + "-->" + compute_candidate_url(candidate_url));
                    matching_counter++;

                    //System.out.println(compute_candidate_url(candidate_url));

                    //if (matching_counter == 10)
                      //  return output_list;
                }
            }

        }

        return output_list;

    }

    /**
     * Method that implements a deep recursive comparison between query tree and change trees to find
     * matching changes.
     *
     * @param queryJavaTree : query Tree
     * @return number of matching changes found
     */
    public static List<String> diffsearch_offline(Java_Tree queryJavaTree, Socket socket) {


        List<String> output_list = new ArrayList<String>();

        try {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();
            //System.out.println("WAITING MESSAGE..");

            Double.parseDouble(stdIn.readLine().substring(0, 5));

            String in = stdIn.readLine();
            //System.out.println("MESSAGE RECEIVED");

            if (!in.equals("JAVA"))
                return output_list;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* **************************************************************************************************************
         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
         * */

        List<String> allLines = null;

        ParseTree queryTree = queryJavaTree.get_parsetree();

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return output_list;
        }

        BufferedReader info_reader = null;
        try {
            info_reader = new BufferedReader(new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {
            String candidate_url = null;
            try {
                assert info_reader != null;
                candidate_url = info_reader.readLine();
            } catch (IOException e) {
                candidate_url = "";
                e.printStackTrace();
            }

            Java_Tree changeJavaTree = new Java_Tree(candidate);
            ParseTree changeTree = changeJavaTree.get_parsetree();

            Matching matching = new Matching(queryTree, queryJavaTree.get_parser());

            if (matching.isMatch(changeTree, changeJavaTree.get_parser())) {
                List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                if (!list.get(1).equals(list.get(0))) {
                    output_list.add(candidate + " [url] " + compute_candidate_url(candidate_url));

                    //System.out.println(compute_candidate_url(candidate_url));

                }
            }

        }

        return output_list;

    }

    public static List<String> diffsearch_offline_js(Javascript_Tree queryJavaScriptTree, Socket socket) {


        List<String> output_list = new ArrayList<String>();

        try {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();
            //System.out.println("WAITING MESSAGE..");

            Double.parseDouble(stdIn.readLine().substring(0, 5));

            String in = stdIn.readLine();
            //System.out.println("MESSAGE RECEIVED");

            if (!in.equals("JAVA"))
                return output_list;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* **************************************************************************************************************
         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
         * */

        List<String> allLines = null;

        ParseTree queryTree = queryJavaScriptTree.get_parsetree();

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return output_list;
        }

        BufferedReader info_reader = null;
        try {
            info_reader = new BufferedReader(new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {
            String candidate_url = null;
            try {
                assert info_reader != null;
                candidate_url = info_reader.readLine();
            } catch (IOException e) {
                candidate_url = "";
                e.printStackTrace();
            }

            Javascript_Tree changeJavaScriptTree = new Javascript_Tree(candidate);
            ParseTree changeTree = changeJavaScriptTree.get_parsetree();

            Matching matching = new Matching(queryTree, queryJavaScriptTree.get_parser());

            try {

                if (matching.isMatch(changeTree, changeJavaScriptTree.get_parser())) {
                    List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                    if (!list.get(1).equals(list.get(0))) {
                        output_list.add(candidate + " [url] " + compute_candidate_url(candidate_url));

                        //System.out.println(compute_candidate_url(candidate_url));

                    }
                }

            } catch (Exception e) {
                continue;
            }
        }

        return output_list;

    }


    public static List<String> diffsearch_offline_python(Python3_Tree queryPython3Tree, Socket socket) {


        List<String> output_list = new ArrayList<String>();

        try {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("PYTHON" + "\r\n");
            out.flush();
            //System.out.println("WAITING MESSAGE..");

            Double.parseDouble(stdIn.readLine().substring(0, 5));

            String in = stdIn.readLine();
            //System.out.println("MESSAGE RECEIVED");

            if (!in.equals("JAVA"))
                return output_list;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* **************************************************************************************************************
         * FINAL MATCHING STAGE:  Deep tree comparison as final matching.
         * */

        List<String> allLines = null;

        ParseTree queryTree = queryPython3Tree.get_parsetree();

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/Features_Vectors/candidate_changes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return output_list;
        }

        BufferedReader info_reader = null;
        try {
            info_reader = new BufferedReader(new FileReader("./src/main/resources/Features_Vectors/candidate_changes_info.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String candidate : allLines) {
            String candidate_url = null;

            try {
                assert info_reader != null;
                candidate_url = info_reader.readLine();
            } catch (IOException e) {
                candidate_url = "";
                e.printStackTrace();
            }

            Python3_Tree changePython3Tree = new Python3_Tree(candidate);
            ParseTree changeTree = changePython3Tree.get_parsetree();

            Matching matching = new Matching(queryTree, queryPython3Tree.get_parser());

            try {

                if (matching.isMatch(changeTree, changePython3Tree.get_parser())) {
                    List<String> list = Arrays.asList(candidate.replace(" ", "").split("-->"));

                    if (!list.get(1).equals(list.get(0))) {
                        //CodeChange temp = new CodeChange(compute_candidate_url(candidate_url), " ", list.get(0),list.get(1) );
                        output_list.add(candidate + " [url] " + compute_candidate_url(candidate_url));
                        // output_list.add(temp);

                        //System.out.println(compute_candidate_url(candidate_url));

                    }
                }

            } catch (Exception e) {
                continue;
            }
        }

        return output_list;

    }


    public static String compute_candidate_url(String candidate) {
        String candidate_url = "https://github.com/";
        String repository = "";
        String commit = "";

        List<String> items = Arrays.asList(candidate.split("\\s*@@\\s*"));
        if (items.size() > 2) {

            commit = items.get(0).replaceAll("commit", "").replaceAll(" ", "");
            // String repository = items.get(1).replaceAll("\\/[a-zA-Z]+-[a-zA-Z]+\\.patch", "");


            repository = StringUtils.substringBetween(items.get(2), "patch/", ".patch").replaceAll("-", "/");
        } else {

            return "";
        }


        return candidate_url + repository + "/commit/" + commit + "-->" + items.get(1);
    }

}





