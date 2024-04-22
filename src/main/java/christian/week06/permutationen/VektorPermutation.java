package christian.week06.permutationen;

import java.util.Arrays;
import java.util.Vector;

public class VektorPermutation {
    public static void main(String[] args) {
        Vector<String> leererVektor = new Vector<String>();
        Vector<String> inputVektor = new Vector<String>(Arrays.asList("A", "B", "C", "D"));

        permutate2(leererVektor, inputVektor, "");
//        permutate2(inputVektor, 0, inputVektor.size(), inputVektor.size());
    }



    public static void permutate2(Vector<String> permVektor, Vector<String> remainingLetters, String prefix) {
        System.out.println(prefix + permVektor + " - " + remainingLetters);
        if(remainingLetters.isEmpty()){
            //System.out.println("PERM: " + permVektor);
        }
        for (int i = 0; i < remainingLetters.size(); i++) {
            Vector<String> newPermVector = new Vector<>(permVektor);
            Vector<String> newRemainingLetters = new Vector<>(remainingLetters);
            newPermVector.add(newRemainingLetters.remove(i));

            permutate2(newPermVector, newRemainingLetters, prefix + "    ");
        }

    }



    public static Vector<Vector<String>> permutate(Vector<String> permVektor, Vector<String> remainingLetters) {
        Vector<Vector<String>> all = new Vector<>();
        if(remainingLetters.isEmpty()){
            all.add(permVektor);
            return all;
        }
        for (int i = 0; i < remainingLetters.size(); i++) {
            Vector<String> newPermVector = new Vector<>(permVektor);
            Vector<String> newRemainingLetters = new Vector<>(remainingLetters);
            newPermVector.add(newRemainingLetters.remove(i));

            all.addAll(permutate(newPermVector, newRemainingLetters));

        }

        return all;
    }

    public static void permutate2(Vector<String> vector, int fixedIndex, int size, int orginalSize) {
        for (int i = fixedIndex; i < vector.size(); i++) {
            if (fixedIndex == orginalSize) {
                System.out.println(vector.toString());
            } else if (fixedIndex > size && fixedIndex < orginalSize - 1) {
                String temp = vector.set(fixedIndex + 1, vector.get(size - 1));
                vector.set(size - 1, temp);
            } else {

                size--;
                permutate2(vector, ++fixedIndex, size, orginalSize);
                System.out.println(vector.toString());
            }
        }
    }
}


