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
            allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/example_python1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : allLines) {
            NGrams ngram_change = new NGrams();

            //Computing LSH vector for change string
            int[] change_lsh = lsh.hashSignature(ngram_change.generateHashNGrams(line,4));

            if(Matching_Methods.elementWiseCompare(query_lsh,change_lsh )) {
                changes_tree_list.add(new Python3_Tree(line));
            }

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

    List<List<String>> scanner( List<List<String>> changes_list){
        List<List<String>> changes_list_abstract = new ArrayList<>();

        String str = "two";


        switch(str)
        {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }


        return changes_list_abstract;
    }

    List<String> java_tokenizer(String code){
        List <String> tokens = new ArrayList<>();

        try {
            Reader reader = new StringReader(code);
            StreamTokenizer st = new StreamTokenizer(reader);

            // Prepare the tokenizer for Java-style tokenizing rules
            st.parseNumbers();
            st.wordChars('_', '_');
            st.eolIsSignificant(true);

            // If whitespace is not to be discarded, make this call
            st.ordinaryChars(0, ' ');

            // These calls caused comments to be discarded
            st.slashSlashComments(true);
            st.slashStarComments(true);

            // Parse the file
            int token = st.nextToken();
            while (token != StreamTokenizer.TT_EOF) {
                token = st.nextToken();
                switch (token) {
                    case StreamTokenizer.TT_NUMBER:
                        // A number was found; the value is in nval
                        tokens.add(st.nval + "");
                        double num = st.nval;
                        break;
                    case StreamTokenizer.TT_WORD:
                        // A word was found; the value is in sval
                        tokens.add(st.sval);
                        String word = st.sval;
                        break;
                    case '"':
                        // A double-quoted string was found; sval contains the contents
                        tokens.add(st.sval);
                        String dquoteVal = st.sval;
                        break;
                    case '\'':
                        // A single-quoted string was found; sval contains the contents
                        tokens.add(st.sval);
                        String squoteVal = st.sval;
                        break;
                    case StreamTokenizer.TT_EOL:
                        // End of line character found
                        break;
                    case StreamTokenizer.TT_EOF:
                        // End of file has been reached
                        break;
                    default:
                        // A regular character was found; the value is the token itself
                        char ch = (char)st.ttype;
                        break;
                }
            }
        } catch (IOException e) {
        }

        return tokens;
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
