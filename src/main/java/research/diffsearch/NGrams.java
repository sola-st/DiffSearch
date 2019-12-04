package research.diffsearch;

import com.google.common.primitives.Ints;

import java.util.ArrayList;

public class NGrams {

    ArrayList<String> nGrams = new ArrayList<String>();
    ArrayList<Integer> nGrams_hash = new ArrayList<Integer>();

     //Generating n-grams from a string
     void generateNGrams(String str, int n) {

        if (str.length() == n) {
            int counter = 0;
            while (counter < n) {
                nGrams.add(str.substring(counter));
                counter++;
            }
            return;
        }

        int counter = 0;
        String gram = "";
        while (counter < n) {
            gram += str.charAt(counter);
            counter++;
        }
        nGrams.add(gram);
        generateNGrams(str.substring(1), n);
    }

    //Generating n-grams from a string with hash code instead of string
    int [] generateHashNGrams(String str, int n) {

        if (str.length() == n) {
            int counter = 0;
            while (counter < n) {
                nGrams_hash.add(str.substring(counter).hashCode());
                counter++;
            }
            return Ints.toArray(nGrams_hash);
        }

        int counter = 0;
        String gram = "";
        while (counter < n) {
            gram += str.charAt(counter);
            counter++;
        }
        nGrams_hash.add(gram.hashCode());
        generateHashNGrams(str.substring(1), n);

        return Ints.toArray(nGrams_hash);
    }

    public void printNGrams() {
        for (String str : nGrams) {
            System.out.println(str);
        }
    }
}