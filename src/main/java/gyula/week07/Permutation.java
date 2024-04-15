package gyula.week07;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Permutation {
    public static Vector<String> allPermutations = new Vector<>();
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>(List.of(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"}));
        long startTime = System.currentTimeMillis();
        //ArrayList<ArrayList<String>> perm = permutation(new ArrayList<>(), values);
        permutationString("", "ABCDE");
        long endTime = System.currentTimeMillis();
        System.out.println("Count permutations: " + allPermutations.size());
        System.out.println(Duration.ofMillis(endTime - startTime).toString()
                .substring(2)
                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
                .toLowerCase());
    }

    public static ArrayList<ArrayList<String>> permutation(ArrayList<String> result, ArrayList<String> rest){
        ArrayList<ArrayList<String>> ret = new ArrayList<>();
        if (rest.isEmpty()){
            ret.add(result);
            return ret;
        }
        for (String s: rest){
            ArrayList<String> newResult = new ArrayList<>(result);
            newResult.add(s);

            ArrayList<String> newRest = new ArrayList<>(rest);
            newRest.remove(s);

            ret.addAll(permutation(newResult, newRest));
        }
        return ret;
    }

    public static void permutationString(String result, String rest){
        if (rest.isEmpty()){
            allPermutations.add(result);
        }
        if (rest.length() == 10) {
            System.out.println(result);
        }
        for (int i = 0; i < rest.length(); i++) {
            String newResult = result.concat(rest.substring(i, i + 1));
            String newRest = rest.substring(0, i) + (rest.substring(i + 1, rest.length()));
            permutationString(newResult, newRest);
        }
    }


}
