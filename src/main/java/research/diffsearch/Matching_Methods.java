package research.diffsearch;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Matching_Methods {


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

    static boolean elementWiseCompare(int[] a, int [] b){

        for(int i = 0; i < a.length; i++){
            if (a[i] == b[i]){
                return true;
            }
        }
        return false;
    }
}
