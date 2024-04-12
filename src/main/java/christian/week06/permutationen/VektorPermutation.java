package christian.week06.permutationen;

import java.util.Arrays;
import java.util.Vector;

public class VektorPermutation {
    public static void main(String[] args) {
        Vector<String> vektor1 = new Vector<String>(Arrays.asList("A", "B", "C", "D"));
        permutate(vektor1, 0, 0, "");
    }

    public static void permutate(Vector<String> vector, int index, int endcounter, String permutations) {

//swap 1 Element
        vector.set(index + 1, vector.set(index, vector.get(index + 1)));

        permutations += "\n, " + vector.toString();
        index++;
        endcounter++;
        if (index == vector.size() - 1) {
            index = 0;

        }
        if (endcounter<christian.week01.day04.UebungenFaktoriell.faktoriell1(vector.size())){
            permutate(vector, index, endcounter, permutations);
        }
        if (endcounter == christian.week01.day04.UebungenFaktoriell.faktoriell1(vector.size())){
            System.out.println(permutations);
        }

    }
}
