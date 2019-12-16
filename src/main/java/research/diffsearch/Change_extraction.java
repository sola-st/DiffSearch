package research.diffsearch;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Change_extraction {

    // Now I read directly the changes in the file example_python3.txt because it is easy to add new changes now.
    //The extraction is implemented by analyze_diff_file, so in the final version it will substitute this function
    static List<String> changes_list_from_file() {

        //this part will be removed in the future
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/GitHub/example_python3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return allLines;
    }

    //Diff function reads the output of the git diff command and extract the changes in final_list in: OLD CODE -> NEW CODE
    static List<String> analyze_diff_file() {
        List<String> changes_tree_list = new ArrayList<String>();
        List<String> final_list = new ArrayList<String>();
        List<List<String>> changes_list = new ArrayList<>();
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();

        boolean flag = false;

        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/GitHub/git_changes2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            for (String line : allLines) {
                line = line + "  ";

                //manage -old change
                if ((line.substring(0, 1).equals("-")) && (!line.substring(1, 2).equals("-"))) {

                    //Manage sequential change without interruption: -old +new -old +new
                    if (flag || temporary_list_old.size() > 0) {
                        ArrayList<String> change = new ArrayList<String>();

                        if (temporary_list_new.size() == 0) {
                            change.add(temporary_list_old.toString());
                            change.add("_");
                        } else {
                            if (temporary_list_old.size() == 0) {
                                change.add("_");
                                change.add(temporary_list_new.toString());
                            } else {
                                change.add(temporary_list_old.toString());
                                change.add(temporary_list_new.toString());
                            }
                        }

                        changes_list.add(change);
                        temporary_list_old.clear();
                        temporary_list_new.clear();
                        flag = false;
                    }

                    //Add -old in a  temporary list
                    temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");

                } else
                    //manage +new change
                    if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                    temporary_list_new.add(line.substring(1, line.length() - 1) + "\n");
                    flag = true;//-old +new is complete
                } else {
                        // merge old and new code in the same list
                    if (flag || temporary_list_old.size() > 0) {
                        ArrayList<String> change = new ArrayList<String>();

                        //manage -old only
                        if (temporary_list_new.size() == 0) {
                            change.add(temporary_list_old.toString());
                            change.add("_");
                        } else {
                            //manage +new only
                            if (temporary_list_old.size() == 0) {
                                change.add("_");
                                change.add(temporary_list_new.toString());
                            } else {
                                change.add(temporary_list_old.toString());
                                change.add(temporary_list_new.toString());
                            }
                        }

                        changes_list.add(change);
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

                changes_list.add(change);
            }

            //Convert changes in string: old code -> new code
            for (List<String> l : changes_list)
                final_list.add(l.get(0).substring(1, l.get(0).length() - 1).replace("\n,", "\n") +
                        "->" +
                        l.get(1).substring(1, l.get(1).length() - 1));

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return changes_tree_list;
    }
}
