package christian.week06.permutationen;

import java.util.Arrays;
import java.util.Vector;

public class VektorPermutation {
//    public static void main(String[] args) {
//        Vector<String> leererVektor = new Vector<String>();
//        Vector<String> inputVektor = new Vector<String>(Arrays.asList("A", "B", "C", "D"));
////        permutate(inputVektor);
//        permutate2(inputVektor, 0, inputVektor.size(), inputVektor.size());
//    }
//
//    public static void permutate(Vector<String> remainingLetters) {
//        Vector<String> permVektor = new Vector<>();
//
//        for (int i = 0; i < remainingLetters.size(); i++) {
//
//            permVektor.add(remainingLetters.get(i));
//
//            permutate(permVektor, remainingLetters);
//            remainingLetters.remove(i);
//
//            permVektor.remove(i);
//
//        }
//
//        System.out.println(permVektor.toString());
//    }
//
//    public static void permutate(Vector<String> permVektor, Vector<String> remainingLetters) {
//
//        for (int i = 0; i < remainingLetters.size(); i++) {
//            permVektor.add(remainingLetters.remove(i));
//
//            permutate(permVektor, remainingLetters);
//
//        }
//
//        System.out.println(permVektor.toString());
//    }
//
//    public static void permutate2(Vector<String> vector, int fixedIndex, int size, int orginalSize) {
//        for (int i = fixedIndex; i < vector.size(); i++) {
//            if (fixedIndex == orginalSize) {
//                System.out.println(vector.toString());
//            } else if (fixedIndex > size && fixedIndex < orginalSize - 1) {
//                String temp = vector.set(fixedIndex + 1, vector.get(size - 1));
//                vector.set(size - 1, temp);
//            } else {
//
//                size--;
//                permutate2(vector, ++fixedIndex, size, orginalSize);
//                System.out.println(vector.toString());
//            }
//        }
//    }
}


