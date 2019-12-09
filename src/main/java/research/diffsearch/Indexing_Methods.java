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
    //ArrayList<ArrayList<String>> list_parent_child = new ArrayList<ArrayList<String>>();

    static List<Python3_Tree> changes_tree( String query_input ) {
        List<Python3_Tree> changes_tree_list = new ArrayList<Python3_Tree>();

        NGrams ngram_query = new NGrams();

        //Setting LSH parameters
        int [] query_ngram_hash = ngram_query.generateHashNGrams(query_input,4);
        int sizeOfVectors = query_ngram_hash.length;
        int numberOfBuckets = 15;
        int stages = 6;

        //Computing LSH vector for query string
        LSHMinHash lsh = new LSHMinHash(stages, numberOfBuckets, sizeOfVectors);
        int[] query_lsh = lsh.hashSignature(query_ngram_hash);

        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/example_python3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            for (String line : allLines)
                changes_tree_list.add(new Python3_Tree(line));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return changes_tree_list;
    }

    static List<Grammar_Tree> analyze_diff_file() {
        List<Grammar_Tree> changes_tree_list = new ArrayList<Grammar_Tree>();
        List<String> temporary_list = new ArrayList<String>();
        List<List<String>> changes_list = new ArrayList<>();

        boolean flag = false;

        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/example2.txt"));
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




            //changes_tree_list.add(new Grammar_Tree(line));
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
