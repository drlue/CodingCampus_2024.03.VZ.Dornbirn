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

        getPermutations(vec, new Vector<String>(), "");

    }




    public static void getPermutations(List<String> elements, List<String> generations, String currentPermutation) {
        List<String> remainingElements = new Vector<>(elements);
        if(!elements.isEmpty()) {
            for(String s : elements) {
                String nextPermutation = currentPermutation + s;
                remainingElements.remove(s);
                getPermutations(remainingElements, generations, nextPermutation);
                System.out.printf("s: %s - currP: %4s - nextP: %4s\n", s, nextPermutation, currentPermutation);
            }
        }else {
            generations.add(currentPermutation);
            System.out.println(currentPermutation);
        }

    }

}
