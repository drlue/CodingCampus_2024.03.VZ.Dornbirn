package christian.week06.permutationen;

import java.util.Arrays;
import java.util.Vector;

public class VektorPermutation {
    public static void main(String[] args) {
        Vector<String> vektor1 = new Vector<String>();
        Vector<String> vektor2 = new Vector<String>(Arrays.asList("A", "B", "C", "D"));
        permutate(vektor1, vektor2);
    }

    public static void permutate(Vector<String> vector, Vector<String> leftOver) {
        String permutation = "";
        for (int i = 0; i < leftOver.size(); i++) {
            Vector<String> permVector = new Vector<String>();
            permVector.add(leftOver.remove(i));
            if (!leftOver.isEmpty()) {
                permutate(permVector, leftOver);
            } else {
                permutation = permVector.toString();
            }
            System.out.print(permutation);
        }

    }
}


