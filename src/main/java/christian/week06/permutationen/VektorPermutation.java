package christian.week06.permutationen;

import java.util.Arrays;
import java.util.Vector;

public class VektorPermutation {
    public static void main(String[] args) {
        Vector<String> leererVektor = new Vector<String>();
        Vector<String> inputVektor = new Vector<String>(Arrays.asList("A", "B", "C", "D"));
        permutate(leererVektor, inputVektor);
//        permutate2(vektor2, 0);
    }

    public static void permutate(Vector<String> permVektor, Vector<String> remainingLetters) {

            for (int i = 0; i < remainingLetters.size(); i++) {
                permVektor.add(remainingLetters.remove(i));

                permutate(permVektor, remainingLetters);

                permVektor.remove(i);

            }

        System.out.println(permVektor.toString());
    }

    public static void permutate2(Vector<String> vector, int fixedIndex) {
        for (int i = fixedIndex; i < vector.size(); i++) {
            if (fixedIndex == vector.size() - 1) {
                System.out.println(vector.toString());
            } else {
                vector.set(fixedIndex, vector.get(i));
                permutate2(vector, fixedIndex++);
            }
        }
    }
}


