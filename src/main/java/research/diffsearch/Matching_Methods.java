package research.diffsearch;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import info.debatty.java.stringsimilarity.NGram;

public class Matching_Methods {
    public static double similarity(int vec1[],int vec2[])
    {

        int dop=vec1[0]*vec2[0] +  vec1[1]*vec2[1];
        double mag1 =Math.sqrt(Math.pow(vec1[0],2)+Math.pow(vec1[1],2));
        double mag2 =Math.sqrt(Math.pow(vec2[0],2)+Math.pow(vec2[1],2));
        double csim =dop / (mag1 * mag2);

        return csim;
    }


    public static double cosineSimilarity(int[] v1, int[] v2, int length) {
        double sum_v1v2 = 0;
        double sum_v1 = 0;
        double sum_v2 = 0;

        for (int i = 0; i < length; i++) {
            if(v1[i] == 1 && v2[i] == 1)
                sum_v1v2 ++;

            sum_v1 += v1[i];
            sum_v2 += v2[i];
        }

        if (sum_v1 == 0 || sum_v2 == 0) {
            return 2.0;
        }
        return round2(sum_v1v2 / (Math.sqrt(sum_v1) * Math.sqrt(sum_v2)));
    }

    static <T> double jaccard_similarity(List<T> list1, List<T> list2) {

        return round2(1.0 * intersection(list1, list2).size() / union(list1, list2).size());
    }

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>(list1);

        for (T t : list1) {
            if (!list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if (list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

    public static Double round2(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


    static double jaccardSimilarity(int[] a, int[] b) {

        Set<Integer> s1 = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            s1.add(a[i]);
        }
        Set<Integer> s2 = new HashSet<Integer>();
        for (int i = 0; i < b.length; i++) {
            s2.add(b[i]);
        }

        final int sa = s1.size();
        final int sb = s2.size();
        s1.retainAll(s2);
        final int intersection = s1.size();
        return round2(1d / (sa + sb - intersection) * intersection);
    }

    static boolean elementWiseCompare(int[] a, int [] b){

        for(int i = 0; i < a.length; i++){
            if (a[i] == b[i]){
                return true;
            }
        }
        return false;
    }
}
