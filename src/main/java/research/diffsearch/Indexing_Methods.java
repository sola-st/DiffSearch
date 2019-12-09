package research.diffsearch;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.google.common.primitives.Ints;
import info.debatty.java.lsh.LSHMinHash;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Indexing_Methods {

    //Function that creates the AST of python changes
    //In this example I don't use List<String> changes that contains the extracted changes, but
    // I read directly the changes in the file example_python3.txt because it is easy to add new changes now.
    static List<Python3_Tree> changes_tree(List<String> changes ) {
        List<Python3_Tree> changes_tree_list = new ArrayList<Python3_Tree>();

        //this part will be removed in the future
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/example_python3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //AllLines will be replaced by changes in the future
        try{
            for (String line : allLines)
                changes_tree_list.add(new Python3_Tree(line));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return changes_tree_list;
    }

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


    static List<String> query_keywords(String code, List<String> keywords){
        List<String> result = new ArrayList<>();

        for(String str: keywords) {
            if(code.contains(str)){
                result.add(str);
            }
        }

        return result;
    }

}
