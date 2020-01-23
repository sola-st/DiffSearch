package research.diffsearch;

//import org.antlr.v4.runtime.tree.Trees;

import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Change_extraction {

    /**
     * Cloning and git diff computation of a git repository (not complete)
     *
     */
    static void git_diff(){
        Process git_diff_python;
        try {
            git_diff_python = Runtime.getRuntime().exec("python ./src/main/resources/Python/git_functions.py");
            BufferedReader br = new BufferedReader(new InputStreamReader(git_diff_python.getInputStream()));

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
    static long analyze_diff_file() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/changes_gitdiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        boolean flag = false;

        //List<String> allLines = null;
        Scanner scanner = null;
        try {
            // allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/GitHub/git_changes2.txt"));
            scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/main/resources/GitHub/git_changes9000.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while (scanner.hasNext()) {
                String line = scanner.next() + "  ";

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

                        //changes_list.add(change);

                        if(change.get(0).equals("_\n")){
                            writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->") + "$$$");
                        }else
                        if(change.get(1).equals("_\n")){
                            writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                        }else {
                            writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->") + "$$$");
                        }
                        change_number++;

                        temporary_list_old.clear();
                        temporary_list_new.clear();
                        flag = false;
                    }

                    //Add -old in a  temporary list, managing the case: all whitespace
                    if(line.substring(1, line.length() - 1) .trim().length() > 0)
                        temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");
                    else
                        temporary_list_old.add("_\n");

                } else
                    //manage +new change, managing the case: all whitespace
                    if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                        if(line.substring(1, line.length() - 1) .trim().length() > 0)
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
                            if(change.get(0).equals("_\n")){
                                writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                            }else
                            if(change.get(1).equals("_\n")){
                                writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                            }else {
                                writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                            }

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


                if(change.get(0).equals("_\n")){
                    writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                }else
                if(change.get(1).equals("_\n")){
                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                }else {
                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                }

                change_number++;
            }

            //assert writer != null;
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return change_number;
    }

}