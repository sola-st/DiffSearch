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
        List<String> temporary_list = new ArrayList<String>();
        List<String> final_list = new ArrayList<String>();
        List<List<String>> changes_list = new ArrayList<>();

        boolean flag = false;

        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/example.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : allLines) {
            line = line + "  ";
            if ((line.substring(0,2).equals("- ")) || (line.substring(0,2).equals("+ "))){
                temporary_list.add(line);
                flag = true;
            }
            else{
                if(flag){

                    changes_list.add(new ArrayList<String>(temporary_list));
                    temporary_list.clear();
                    flag = false;
                }
            }
        }

        for(List<String> l : changes_list)
            if(l.size() == 2){
                final_list.add(l.get(0).substring(1,l.get(0).length() - 1).replaceAll("\\s+","") + "->" + l.get(1).substring(1,l.get(0).length() - 1).replaceAll("\\s+",""));
            }

        return changes_tree_list;
    }
}
