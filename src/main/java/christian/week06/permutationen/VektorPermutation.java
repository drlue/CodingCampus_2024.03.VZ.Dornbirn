package christian.week06.permutationen;

import java.util.Arrays;
import java.util.Vector;

public class VektorPermutation {
    public static void main(String[] args) {
        Vector<String> vektor1 = new Vector<String>();
        Vector<String> vektor2 = new Vector<String>(Arrays.asList("A", "B", "C", "D"));
        permutate(vektor1, vektor2);
//        permutate2(vektor2, 0);
    }

    public static void permutate(Vector<String> vector, Vector<String> leftOver) {
        int forCounter = leftOver.size();
        Vector<String> copyOfVector = new Vector<>(vector);

        Vector<String> permVector = copyOfVector;

        for (int i = 0; i < leftOver.size(); i++) {

            permVector.add(leftOver.remove(i));
        }

        if (!leftOver.isEmpty()) {
            permutate(copyOfVector, leftOver);

        } else {
            System.out.println(permVector.toString());
        }

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


