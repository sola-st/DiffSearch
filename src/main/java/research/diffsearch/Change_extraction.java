package research.diffsearch;

import com.google.gson.Gson;
import difflib.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import research.diffsearch.util.CodeChange;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Change_extraction {
    /**
     * Cloning and git diff computation of a git repository (not complete)
     *
     */
    static void git_diff(){
        Process git_diff_python;
        try {
            git_diff_python = Runtime.getRuntime().exec("python ./src/main/resources/Python/git_functions.py");
            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(git_diff_python.getErrorStream()));

            int exitCode = git_diff_python.waitFor();
            if (exitCode != 0) {

                System.out.println("Here is the standard error of the command:\n");
                String s;
                while ((s = stdError.readLine()) != null) {
                    System.out.println(s);
                }
                throw new IOException("git_functions.py exited with error " + exitCode + ".\n");
            }

            git_diff_python.waitFor();
            git_diff_python.destroy();
        } catch (Exception e) { e.printStackTrace();}

        System.out.println("PYTHON GIT DIFF STAGE DONE\n");
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long analyze_diff_file_scalability() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        List<String> allLines = null;

        //Git diff for all repositories
        git_diff();

        try {
            allLines = Files.readAllLines(Paths.get("./src/main/resources/GitHub/repository_list.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/merge_diff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        assert allLines != null;
        for(String fp: allLines) {

            boolean flag = false;

            Scanner scanner = null;
            try {
                scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/main/resources/GitHub/" + fp + ".patch"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine() + "  ";

                    //manage -old change
                    if ((line.charAt(0) == '-') && (line.charAt(1) != '-')) {

                        //Manage sequential change without interruption: -old +new -old +new
                        if (flag && !temporary_list_old.isEmpty()) {
                            ArrayList<String> change = new ArrayList<String>();

                            if (temporary_list_new.isEmpty()) {
                                change.add(temporary_list_old.toString());
                                change.add("_\n");
                            } else {
                                if (temporary_list_old.isEmpty()) {
                                    change.add("_\n");
                                    change.add(temporary_list_new.toString());
                                } else {
                                    change.add(temporary_list_old.toString());
                                    change.add(temporary_list_new.toString());
                                }
                            }

                            writeChange(writer, change);
                            change_number++;

                            temporary_list_old.clear();
                            temporary_list_new.clear();
                            flag = false;
                        }

                        //Add -old in a  temporary list, managing the case: all whitespace
                        if (line.substring(1, line.length() - 1).trim().length() > 0)
                            temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");
                        else
                            temporary_list_old.add("_\n");

                    } else
                        //manage +new change, managing the case: all whitespace
                        if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                            if (line.substring(1, line.length() - 1).trim().length() > 0)
                                temporary_list_new.add(line.substring(1, line.length() - 1) + "\n");
                            else
                                temporary_list_new.add("_\n");

                            flag = true;//-old +new is complete
                        } else {
                            // merge old and new code in the same list
                            if (flag || temporary_list_old.size() > 0) {
                                ArrayList<String> change = new ArrayList<String>();

                                //manage -old only
                                if (temporary_list_new.size() == 0) {
                                    change.add(temporary_list_old.toString());
                                    change.add("_\n");
                                } else {
                                    //manage +new only
                                    if (temporary_list_old.size() == 0) {
                                        change.add("_\n");
                                        change.add(temporary_list_new.toString());
                                    } else {
                                        change.add(temporary_list_old.toString());
                                        change.add(temporary_list_new.toString());
                                    }
                                }

                                //changes_list.add(change);
                                writeChange(writer, change);

                                change_number++;

                                temporary_list_old.clear();
                                temporary_list_new.clear();
                                flag = false;
                            }
                        }
                }

                //Last change
                if (flag) {
                    ArrayList<String> change = new ArrayList<>();
                    change.add(temporary_list_old.toString());
                    change.add(temporary_list_new.toString());

                    if (change.get(0).equals("_\n")) {
                        assert writer != null;
                        writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->"));
                    } else if (change.get(1).equals("_\n")) {
                        assert writer != null;
                        writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                    } else {
                        assert writer != null;
                        writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                    }

                    change_number++;

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(fp + " done.");
        }
        assert writer != null;
        writer.close();

        return change_number;
    }

    private static void writeChange(PrintWriter writer, ArrayList<String> change) {
        if (change.get(0).equals("_\n")) {
            assert writer != null;
            writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
        } else if (change.get(1).equals("_\n")) {
            assert writer != null;
            writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
        } else {
            assert writer != null;
            writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
        }
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long analyze_diff_file() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        List<String> allLines = null;

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/corpus_diff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        boolean flag = false;

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/" + Config.GITDIFF_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while (scanner.hasNext()) {
                String line = scanner.nextLine() + "  ";

                //manage -old change
                if ((line.substring(0, 1).equals("-")) && (!line.substring(1, 2).equals("-"))) {

                    //Manage sequential change without interruption: -old +new -old +new
                    if (flag && temporary_list_old.size() > 0) {
                        ArrayList<String> change = new ArrayList<String>();

                        if (temporary_list_new.size() == 0) {
                            change.add(temporary_list_old.toString());
                            change.add("_\n");
                        } else {
                            if (temporary_list_old.size() == 0) {
                                change.add("_\n");
                                change.add(temporary_list_new.toString());
                            } else {
                                change.add(temporary_list_old.toString());
                                change.add(temporary_list_new.toString());
                            }
                        }

                        writeChange(writer, change);
                        change_number++;

                        temporary_list_old.clear();
                        temporary_list_new.clear();
                        flag = false;
                    }

                    //Add -old in a  temporary list, managing the case: all whitespace
                    if (line.substring(1, line.length() - 1).trim().length() > 0)
                        temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");
                    else
                        temporary_list_old.add("_\n");

                } else
                    //manage +new change, managing the case: all whitespace
                    if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                        if (line.substring(1, line.length() - 1).trim().length() > 0)
                            temporary_list_new.add(line.substring(1, line.length() - 1) + "\n");
                        else
                            temporary_list_new.add("_\n");

                        flag = true;//-old +new is complete
                    } else {
                        // merge old and new code in the same list
                        if (flag || temporary_list_old.size() > 0) {
                            ArrayList<String> change = new ArrayList<String>();

                            //manage -old only
                            if (temporary_list_new.size() == 0) {
                                change.add(temporary_list_old.toString());
                                change.add("_\n");
                            } else {
                                //manage +new only
                                if (temporary_list_old.size() == 0) {
                                    change.add("_\n");
                                    change.add(temporary_list_new.toString());
                                } else {
                                    change.add(temporary_list_old.toString());
                                    change.add(temporary_list_new.toString());
                                }
                            }

                            //changes_list.add(change);
                            writeChange(writer, change);

                            change_number++;

                            temporary_list_old.clear();
                            temporary_list_new.clear();
                            flag = false;
                        }
                    }
            }

            //Last change
            if (flag) {
                ArrayList<String> change = new ArrayList<String>();
                change.add(temporary_list_old.toString());
                change.add(temporary_list_new.toString());

                if (change.get(0).equals("_\n")) {
                    assert writer != null;
                    writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->"));
                } else if (change.get(1).equals("_\n")) {
                    assert writer != null;
                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                } else {
                    assert writer != null;
                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                }

                change_number++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        assert writer != null;
        writer.close();

        return change_number;
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long analyze_diff_file_new() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        List<String> allLines = null;

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/corpus_diff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        List<File> list_files = listf2(System.getProperty("user.dir") + "/src/main/resources/patch");

        int www = 0;

        for (File f : list_files) {
            System.out.println(++www + " " + f.toString());

            boolean flag = false;

            Scanner scanner = null;
            try {
                scanner = new Scanner(f);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine() + "  ";

                    //manage -old change
                    if ((line.substring(0, 1).equals("-")) && (!line.substring(1, 2).equals("-"))) {

                        //Manage sequential change without interruption: -old +new -old +new
                        if (flag && temporary_list_old.size() > 0) {
                            ArrayList<String> change = new ArrayList<String>();

                            if (temporary_list_new.size() == 0) {
                                change.add(temporary_list_old.toString());
                                change.add("_\n");
                            } else {
                                if (temporary_list_old.size() == 0) {
                                    change.add("_\n");
                                    change.add(temporary_list_new.toString());
                                } else {
                                    change.add(temporary_list_old.toString());
                                    change.add(temporary_list_new.toString());
                                }
                            }

                            writeChange(writer, change);
                            change_number++;

                            temporary_list_old.clear();
                            temporary_list_new.clear();
                            flag = false;
                        }

                        //Add -old in a  temporary list, managing the case: all whitespace
                        if (line.substring(1, line.length() - 1).trim().length() > 0)
                            temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");
                        else
                            temporary_list_old.add("_\n");

                    } else
                        //manage +new change, managing the case: all whitespace
                        if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                            if (line.substring(1, line.length() - 1).trim().length() > 0)
                                temporary_list_new.add(line.substring(1, line.length() - 1) + "\n");
                            else
                                temporary_list_new.add("_\n");

                            flag = true;//-old +new is complete
                        } else {
                            // merge old and new code in the same list
                            if (flag || temporary_list_old.size() > 0) {
                                ArrayList<String> change = new ArrayList<String>();

                                //manage -old only
                                if (temporary_list_new.size() == 0) {
                                    change.add(temporary_list_old.toString());
                                    change.add("_\n");
                                } else {
                                    //manage +new only
                                    if (temporary_list_old.size() == 0) {
                                        change.add("_\n");
                                        change.add(temporary_list_new.toString());
                                    } else {
                                        change.add(temporary_list_old.toString());
                                        change.add(temporary_list_new.toString());
                                    }
                                }

                                //changes_list.add(change);
                                writeChange(writer, change);

                                change_number++;

                                temporary_list_old.clear();
                                temporary_list_new.clear();
                                flag = false;
                            }
                        }
                }

                //Last change
                if (flag) {
                    ArrayList<String> change = new ArrayList<String>();
                    change.add(temporary_list_old.toString());
                    change.add(temporary_list_new.toString());

                    if (change.get(0).equals("_\n")) {
                        assert writer != null;
                        writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->"));
                    } else if (change.get(1).equals("_\n")) {
                        assert writer != null;
                        writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                    } else {
                        assert writer != null;
                        writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                    }

                    change_number++;

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        assert writer != null;
        writer.close();

        return change_number;
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long analyze_diff_file_new_propagation() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        List<String> allLines = null;
        Gson gson = new Gson();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/corpus_diff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        PrintWriter writer_prop = null;
        try {
            writer_prop = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/corpus_diff_prop.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer_prop.println("[");

        List<File> list_files = listf2(System.getProperty("user.dir") + "/src/main/resources/python_patch");

        int www = 0;

        for (File f : list_files) {
            System.out.println(++www + " " + f.toString());

            if(www == 57 || www == 58)
                continue;

            boolean flag = false;

            Scanner scanner = null;
            try {
                scanner = new Scanner(f);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                String commit = null;
                String position = null;
                CodeChange cc = new CodeChange();
                cc.url = f.toString();

                while (scanner.hasNext()) {
                    String line = scanner.nextLine() + "  ";
                    int ggg = 0;
                    if(line.contains("footerEl.remove();"))
                        ggg++;

                    if(line.length() > 7 && line.substring(0, 7).equals("commit ")){
                        commit = line;
                        cc.commit = line.replace("commit ", "");
                    }
                    else
                        if(line.length() > 4 && line.substring(0, 4).equals("@@ -")){
                            position = line;
                            cc.line = line;
                        }
                        else
                    //manage -old change
                    if ((line.substring(0, 1).equals("-")) && (!line.substring(1, 2).equals("-"))) {

                        //Manage sequential change without interruption: -old +new -old +new
                        if (flag && temporary_list_old.size() > 0) {
                            ArrayList<String> change = new ArrayList<String>();

                            if (temporary_list_new.size() == 0) {
                                change.add(temporary_list_old.toString());
                                change.add("_\n");
                            } else {
                                if (temporary_list_old.size() == 0) {
                                    change.add("_\n");
                                    change.add(temporary_list_new.toString());
                                } else {
                                    change.add(temporary_list_old.toString());
                                    change.add(temporary_list_new.toString());
                                }
                            }

                            writeChange(writer, change);
                            change_number++;

                            temporary_list_old.clear();
                            temporary_list_new.clear();
                            flag = false;
                        }

                        //Add -old in a  temporary list, managing the case: all whitespace
                        if (line.substring(1, line.length() - 1).trim().length() > 0)
                            temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");
                        else
                            temporary_list_old.add("_\n");

                    } else
                        //manage +new change, managing the case: all whitespace
                        if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                            if (line.substring(1, line.length() - 1).trim().length() > 0)
                                temporary_list_new.add(line.substring(1, line.length() - 1) + "\n");
                            else
                                temporary_list_new.add("_\n");

                            flag = true;//-old +new is complete
                        } else {
                            // merge old and new code in the same list
                            if (flag || temporary_list_old.size() > 0) {
                                ArrayList<String> change = new ArrayList<String>();

                                //manage -old only
                                if (temporary_list_new.size() == 0) {
                                    change.add(temporary_list_old.toString());
                                    change.add("_\n");
                                } else {
                                    //manage +new only
                                    if (temporary_list_old.size() == 0) {
                                        change.add("_\n");
                                        change.add(temporary_list_new.toString());
                                    } else {
                                        change.add(temporary_list_old.toString());
                                        change.add(temporary_list_new.toString());
                                    }
                                }

                                //changes_list.add(change);
                                if (change.get(0).equals("_\n")) {
                                    assert writer != null;
                                    writer.println((change.get(0).replace("\n,", "\n") + "-->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                                    cc.codeChange = (change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$";
                                    assert writer_prop != null;
                                    writer_prop.println(commit + " " + position + " " + f.toString());//(change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");

                                } else if (change.get(1).equals("_\n")) {
                                    assert writer != null;
                                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                                    cc.codeChange = (change.get(0).replace("\n,", "\n") + "-->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$";
                                    assert writer_prop != null;
                                    writer_prop.println(commit + " " + position + " " + f.toString());//(change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");

                                } else {
                                    assert writer != null;
                                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "-->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                                    cc.codeChange = (change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$";
                                    assert writer_prop != null;
                                    writer_prop.println(commit + " " + position + " " + f.toString());// (change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");

                                }

    //                            writer_prop.close();
                                change_number++;

                                temporary_list_old.clear();
                                temporary_list_new.clear();
                                flag = false;
                            }
                        }
                }

                //Last change
                if (flag) {
                    ArrayList<String> change = new ArrayList<String>();
                    change.add(temporary_list_old.toString());
                    change.add(temporary_list_new.toString());

                    if (change.get(0).equals("_\n")) {
                        assert writer != null;
                        writer.println((change.get(0).replace("\n,", "\n") + "-->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->"));
                        cc.codeChange = (change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->");
                        assert writer_prop != null;
                        writer_prop.println(commit + " " + position + " " + f.toString());//(change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->"));

                    } else if (change.get(1).equals("_\n")) {
                        assert writer != null;
                        writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "-->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                        cc.codeChange = (change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$";
                        assert writer_prop != null;
                        writer_prop.println(commit + " " + position + " " + f.toString());//(change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");

                    } else {
                        assert writer != null;
                        writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "-->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");
                        cc.codeChange = (change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$";
                        writer_prop.println(commit + " " + position + " " + f.toString());//(change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->", "->") + "$$$");

                    }

                 //   gson.toJson(cc, writer_prop);
                    change_number++;


                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        assert writer != null;
        writer.close();
      //  writer_prop.println("]");
        writer_prop.close();

        return change_number;
    }


    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long read_HTML_dataset() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        long number = 0;


        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/GitHub/htmldiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for(int w = 0; w < 1; w++) {
            List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "sampleChange.html");

            for (File f : list_files) {
                boolean flag = false;

                //List<String> allLines = null;
                Scanner scanner = null;
                try {
                    scanner = new Scanner(f);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String old = null, neo = null;

                while (scanner.hasNext()) {
                    String line = scanner.nextLine() + "  ";

                    if (line.contains("id=\"change\"") && !flag) {
                        old = line.replace("<a id=\"change\">", "").replace("</a>", "").replace("\t", "").replace("  ", " ") + "$$$";
                        flag = true;
                    } else {
                        if (line.contains("id=\"change\"") && flag) {
                            neo = line.replace("<a id=\"change\">", "").replace("</a>", "").replace("\t", "").replace("  ", " ") + "$$$";

                            flag = false;
                        }
                    }
                }

                assert writer != null;
                writer.println(old + "->" + neo);

            }number += list_files.size();
        }
        writer.close();

        return number;//list_files.size();
    }

    public static List<File> listf(String directoryName, String filename) {
        List<File> allFiles = new ArrayList<File>();
        Queue<File> dirs = new LinkedList<File>();
        dirs.add(new File(directoryName));
        while (!dirs.isEmpty()) {
            for (File f : dirs.poll().listFiles()) {
                if (f.isDirectory()) {
                    dirs.add(f);
                } else if (f.isFile() && f.toString().contains(filename)) {
                    allFiles.add(f);
                }
            }
        }
        //System.out.println(fList);
        return allFiles;
    }

    public static List<File> listf2(String directoryName) {
        List<File> allFiles = new ArrayList<File>();
        Queue<File> dirs = new LinkedList<File>();
        dirs.add(new File(directoryName));
        while (!dirs.isEmpty()) {
            for (File f : dirs.poll().listFiles()) {
                if (f.isDirectory()) {
                    dirs.add(f);
                } else if (f.isFile()) {
                    allFiles.add(f);
                }
            }
        }
        //System.out.println(fList);
        return allFiles;
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long read_HTML_dataset2() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        long number = 0;


        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/GitHub/htmldiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for(int w = 0; w < 1; w++) {
            List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "sampleChange.html");

            for (File f : list_files) {
                boolean flag = false;

                //List<String> allLines = null;
                Scanner scanner = null;
                String html = null;
                Document doc = null;
                try {
                    scanner = new Scanner(f);
                    if (scanner.hasNext())
                        html = scanner.useDelimiter("\\A").next();
                    else
                        continue;
                    scanner.close();
                    if(html != null)
                        doc = Jsoup.parse(html);
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }

                String old = null, neo = null;

                Element before = doc.select("code").first();
                List<String> beforeList = new ArrayList<String>(Arrays.asList(before.text().split("\n")));
                Element after = doc.select("code").last();
                List<String> afterList = new ArrayList<String>(Arrays.asList(after.text().split("\n")));


                Patch patch = DiffUtils.diff(beforeList, afterList);

                List<String> pp;

                pp = DiffUtils.generateUnifiedDiff("Before", "After", beforeList, patch, 0);

                assert writer != null;
                for(String str: pp)
                    writer.println(str);

            }

            number += list_files.size();
        }
        writer.close();

        return number;//list_files.size();
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long read_HTML_dataset3() {
        long change_number = 0;
        long number = 0;


        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/htmldiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        int zz = 0;

        for(int w = 0; w < 1; w++) {
            List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "details.html");
            int n_files = list_files.size();

            for (File f : list_files) {
                zz++;

                System.out.println(f.toString() + "n= " + zz +"/"+ n_files);

                Scanner scanner = null;
                String html = null;
                Document doc = null;
                try {
                    scanner = new Scanner(f);
                    if (scanner.hasNext())
                        html = scanner.useDelimiter("\\A").next();
                    else
                        continue;
                    scanner.close();
                    if(html != null)
                        doc = Jsoup.parse(html);
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }

                assert doc != null;

                Elements links = doc.select("a");

                for(Element el : links){
                    String url = el.attr("href");

                    List<String> repository = new ArrayList<String>(Arrays.asList(url.split("/commit/")));

                    if(!url.equals("sampleChange.html")) {

                        List<String> line_number = new ArrayList<String>(Arrays.asList(repository.get(1).split("L")));
                        URL url_download;
                        InputStream is = null;
                        BufferedReader br;
                        String s = null;
                        List<String> str, range;
                        List<String> patch = new ArrayList<String>(Arrays.asList(url.split("#diff-")));

                        try {
                            url_download = new URL(patch.get(0) + ".patch");
                            is = url_download.openStream();  // throws an IOException
                            br = new BufferedReader(new InputStreamReader(is));

                            mainLoop:
                            while ((s = br.readLine()) != null) {
                                if(s.length() >= 4 && s.substring(0,4).equals("@@ -")) {
                                    str = new ArrayList<String>(Arrays.asList(s.split("\\+")));
                                    range = new ArrayList<String>(Arrays.asList(str.get(0).split(",")));

                                    if(range.size()<2)
                                        continue ;

                                    int line = Integer.parseInt(range.get(0).replaceAll("[^0-9]", ""));
                                    int q = Integer.parseInt(range.get(1).replaceAll("[^0-9]", ""));

                                    int i = Integer.parseInt(line_number.get(line_number.size()-1)) - line;
                                    if(Integer.parseInt(line_number.get(line_number.size()-1)) > line && Integer.parseInt(line_number.get(line_number.size()-1))< line + q) {
                                        while ((s = br.readLine()) != null) {
                                            if (i-- > 0)
                                                continue;

                                            if (s.length() >= 4 && s.substring(0, 4).equals("@@ -")) {
                                                break mainLoop;
                                            } else {
                                                assert writer != null;
                                                writer.println(s);
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (IOException mue) {
                            mue.printStackTrace();
                        } finally {
                            try {
                                if (is != null) is.close();
                            } catch (IOException ioe) {
                                writer.close();
                                ioe.printStackTrace();
                            }
                        }
                    }

                }
            }
            assert writer != null;
            writer.close();
            System.out.println("File close finished!!" + number);
        }


        return number;
    }

    static long read_HTML_dataset4() {
        long change_number = 0;
        long number = 0;



        int zz = 0;
        for(int w = 0; w < 1; w++) {
            List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "details.html");
            int n_files = list_files.size();

            for (File f : list_files) {
                zz++;

                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/p/"+f.toString().replaceAll("/","-"), "UTF-8");
                } catch (FileNotFoundException | UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                boolean flag = false;
                //   System.out.println(f.toString() + "n= " + zz +"/"+ n_files);
                //List<String> allLines = null;
                Scanner scanner = null;
                String html = null;
                Document doc = null;
                try {
                    scanner = new Scanner(f);
                    if (scanner.hasNext())
                        html = scanner.useDelimiter("\\A").next();
                    else
                        continue;
                    scanner.close();
                    if(html != null)
                        doc = Jsoup.parse(html);
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }

                assert doc != null;

                Elements links = doc.select("a");
                String previuos_repo = "";

                for(Element el : links){
                    String url = el.attr("href");

                    //  System.out.println(url);
                    int kkk = 0;
                    if(url.equals("https://github.com/apache/ofbiz/commit/f6c31f10fabea49984923b091a091cca2466368c#diff-05e53b1de07b7a73dcd8553f38036ee6L100"))
                        kkk++;

                    List<String> repository = new ArrayList<String>(Arrays.asList(url.split("/commit/")));

                    if(!url.equals("sampleChange.html")) {


                        List<String> line_number = new ArrayList<String>(Arrays.asList(repository.get(1).split("L")));
                        URL url_download;
                        InputStream is = null;
                        BufferedReader br;
                        String s = null;
                        List<String> str, range;
                        List<String> patch = new ArrayList<String>(Arrays.asList(url.split("#diff-")));

                        try {
                            url_download = new URL(patch.get(0) + ".patch");
                            is = url_download.openStream();  // throws an IOException
                            br = new BufferedReader(new InputStreamReader(is));

                            mainLoop:
                            while ((s = br.readLine()) != null) {
                                //             System.out.println(s);
                                if(s.length() >= 4 && s.substring(0,4).equals("@@ -")) {
                                    //System.out.println("Correct line found");
                                    str = new ArrayList<String>(Arrays.asList(s.split("\\+")));
                                    range = new ArrayList<String>(Arrays.asList(str.get(0).split(",")));

                                    if(range.size()<2)
                                        continue ;

                                    int line = Integer.parseInt(range.get(0).replaceAll("[^0-9]", ""));
                                    int q = Integer.parseInt(range.get(1).replaceAll("[^0-9]", ""));

                                    int i = Integer.parseInt(line_number.get(line_number.size()-1)) - line;
                                    if(Integer.parseInt(line_number.get(line_number.size()-1)) > line && Integer.parseInt(line_number.get(line_number.size()-1))< line + q) {
                                        while ((s = br.readLine()) != null) {
                                            if (i-- > 0)
                                                continue;

                                            if (s.length() >= 4 && s.substring(0, 4).equals("@@ -")) {
                                                break mainLoop;
                                            } else {
                                                //    System.out.println(s);
                                                assert writer != null;
                                                writer.println(s);
                                            }
                                        }//System.out.println("Writing change done");
                                    }
                                }
                            }
                        } catch (IOException mue) {
                            mue.printStackTrace();
                        } finally {
                            try {
                                if (is != null) is.close();
                            } catch (IOException ioe) {
                                writer.close();
                                ioe.printStackTrace();
                            }
                        }


                    }



                }

                writer.close();
            }

            System.out.println("File close finished!!" + number);
            System.out.println("File close finished!!" + number);
            System.out.println("File close finished!!" + number);
            System.out.println("File close finished!!" + number);
        }


        return number;//list_files.size();
    }
}

