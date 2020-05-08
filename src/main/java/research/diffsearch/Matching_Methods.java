package research.diffsearch;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matching_Methods {

    /**
     * This method checks the match in a detailed way; if in the query there is e.g. ID<0> in old code and ID<1>
     * in new code, it checks if there is the same precise differenc ein the candidate change. So it is a very precise match.
     *
     * @param array_query_old_nodes : Array of old tokens in query tree
     * @param array_query_new_nodes : Array of new tokens in query tree
     * @param array_change_old_nodes : Array of old tokens in change tree
     * @param array_change_new_nodes : Array of new tokens in change tree
     * @return True if there is a match
     */
    static boolean leaves_final_matching(String[] array_query_old_nodes, String[] array_query_new_nodes, String[] array_change_old_nodes, String[] array_change_new_nodes){
        for(int i = 0; i < array_query_new_nodes.length; i++){
            switch(array_query_old_nodes[i]) {

                case "ID<0>":
                    for(int j=0;j < array_query_new_nodes.length; j++) {
                        if (array_query_new_nodes[j].equals("ID<0>")) {
                            if (!array_change_old_nodes[i].equals(array_change_new_nodes[j])) {
                                return false;
                            }
                        }
                    }

                    if(!array_query_new_nodes[i].equals("ID<0>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    break;

                case "ID<1>":
                    for(int j=0;j < array_query_new_nodes.length; j++) {
                        if (array_query_new_nodes[j].equals("ID<1>")) {
                            if (!array_change_old_nodes[i].equals(array_change_new_nodes[j])) {
                                return false;
                            }
                        }
                    }
                    if(!array_query_new_nodes[i].equals("ID<1>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    break;

                case "ID<2>":
                    for(int j=0;j < array_query_new_nodes.length; j++) {
                        if (array_query_new_nodes[j].equals("ID<2>")) {
                            if (!array_change_old_nodes[i].equals(array_change_new_nodes[j])) {
                                return false;
                            }
                        }
                    }
                    if(!array_query_new_nodes[i].equals("ID<2>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    break;

                case "OP<0>":
                    if(!array_query_new_nodes[i].equals("OP<0>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
/*
                    if((!Arrays.toString(array_query_old_nodes).contains("=") && Arrays.toString(array_change_old_nodes).contains("="))
                            || (!Arrays.toString(array_query_new_nodes).contains("=") && Arrays.toString(array_change_new_nodes).contains("=")) )
                        return false;*/
                    break;

                case "OP<1>":
                    if(!array_query_new_nodes[i].equals("OP<1>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    /*
                    if((!Arrays.toString(array_query_old_nodes).contains("=") && Arrays.toString(array_change_old_nodes).contains("="))
                            || (!Arrays.toString(array_query_new_nodes).contains("=") && Arrays.toString(array_change_new_nodes).contains("=")) )
                        return false;*/
                    break;

                case "OP<2>":
                    if(!array_query_new_nodes[i].equals("OP<2>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                /*     if((!Arrays.toString(array_query_old_nodes).contains("=") && Arrays.toString(array_change_old_nodes).contains("="))
                            || (!Arrays.toString(array_query_new_nodes).contains("=") && Arrays.toString(array_change_new_nodes).contains("=")) )
                        return false;*/
                    break;

                case "LT<0>":
                    if(!array_query_new_nodes[i].equals("LT<0>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    break;

                case "LT<1>":
                    if(!array_query_new_nodes[i].equals("LT<1>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    break;

                case "LT<2>":
                    if(!array_query_new_nodes[i].equals("LT<2>")){
                        if(array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }
                    else{
                        if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
                            return false;
                        }
                    }

                case "EXPR": case "EXPR<0>": case "EXPR<1>": case "EXPR<2>": case "<...>":
//                    if(!array_change_old_nodes[i].equals(array_change_new_nodes[i])){
  //                      return false;
    //                }


                default:
            }
        }
        return true;
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

    static boolean elementWiseCompare(int[] a, int [] b){
        for(int i = 0; i < a.length; i++){
            if (a[i] == b[i]){
                return true;
            }
        }
        return false;
    }

}
