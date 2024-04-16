package lukas.week06;

import java.util.List;
import java.util.Vector;

public class Example6_Permutation {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("A");
        vec.add("B");
        vec.add("C");
        vec.add("D");

        System.out.println("----VERSION1----");
        getPermutations(vec, new Vector<String>(), "");
        System.out.println("----VERSION2----");
        getPermutationsV2(vec, "");
        System.out.println("----VERSION3----");
        getPermutationsV3(vec, "");

    }


    public static void getPermutations(List<String> remaining, List<String> permutations, String prefix) {
        System.out.println(prefix+"r: " + remaining);
        System.out.println(prefix+"p: " + permutations);
        if (!remaining.isEmpty()) {
            for (int i = 0; i < remaining.size(); i++) {
                String current = remaining.get(i);
                Vector<String> newRemaining = new Vector<>(remaining);
                newRemaining.remove(i);
                Vector<String> newPermutations = new Vector<>(permutations);
                newPermutations.add(current);
                //System.out.println(prefix + "current: " + current);
                getPermutations(newRemaining, newPermutations, prefix + "->");
            }
        } else {
            //System.out.println("----------");
            System.out.println(permutations);
            //System.out.println();
        }

    }

    public static void getPermutationsV2(List<String> remaining, String permutation) {
        if (!remaining.isEmpty()) {
            for (int i = 0; i < remaining.size(); i++) {
                String current = remaining.get(i);
                Vector<String> newRemaining = new Vector<>(remaining);
                newRemaining.remove(i);
                String newTest = permutation + current;
                getPermutationsV2(newRemaining, newTest);
            }
        } else {
            System.out.println(permutation);
        }

    }

    public static void getPermutationsV3(List<String> remaining, String permutation) {
        if (!remaining.isEmpty()) {
            for (String s : remaining) {
                Vector<String> newRemaining = new Vector<>(remaining);
                newRemaining.remove(s);
                String newTest = permutation + s;
                getPermutationsV2(newRemaining, newTest);
            }
        } else {
            System.out.println(permutation);
        }

    }

}
