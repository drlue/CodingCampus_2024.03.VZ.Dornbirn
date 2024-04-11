package christian.week06.collections;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class VectorTryOut {

    static Random rnd = new Random();

    public static void main(String[] args) {

        int[] failureArray = {69, 64, 85, 61, 57, 13, 27, 43, 73, 51, 3, 5, 47, 46, 46, 19, 4, 49, 99, 50};
        Vector<Integer> rndVector1 = createRndNumberVector(0, 100,1);
        Vector<Integer> rndVector2 = createRndNumberVector(0, 100, 4);
        System.out.println(insertVectorInVectorAndSort1(rndVector1,rndVector2));
    }

    // ===================================create Vector Methods ====================================
    public static Vector<Integer> createRndNumberVector(int rndOrigin, int rndBound, int size) {
        Vector<Integer> intVector = new Vector<Integer>();
        for (int i = 0; i < size; i++) {
            intVector.add(rnd.nextInt(rndOrigin, rndBound));
        }
        return intVector;
    }

    public static Vector<Integer> createVectorFromArray(int[] arr) {
        Vector<Integer> intVectorfailure = new Vector<Integer>();
        for (int i = 0; i < arr.length; i++) {
            intVectorfailure.add(arr[i]);
        }
        return intVectorfailure;
    }

    // ========================================alter Vector Methods ====================================================

    public static Vector<Integer> allEvenNumbers(Vector<Integer> inputVector) {
        Vector<Integer> outputVector = new Vector<Integer>();

        for (int i = 0; i < inputVector.size(); i++) {
            if (inputVector.get(i) % 2 == 0) {
                outputVector.add(inputVector.get(i));
            }
        }


        return outputVector;
    }

    public static Integer getMinimum(Vector<Integer> inputVector) {
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < inputVector.size(); i++) {
            if (inputVector.get(i) < minimum) {
                minimum = inputVector.get(i);
            }
        }

        return minimum;
    }

    public static Integer getMaximum(Vector<Integer> inputVector) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < inputVector.size(); i++) {
            if (inputVector.get(i) > maximum) {
                maximum = inputVector.get(i);
            }
        }

        return maximum;
    }

    public static Vector<Integer> sortDescending(Vector<Integer> inputVector) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < inputVector.size(); i++) {
                if (inputVector.get(i) > inputVector.get(i - 1)) {
                    Integer temp = inputVector.set(i - 1, inputVector.get(i));
                    inputVector.set(i, temp);
                    swapped = true;
                }
            }
        }
        return inputVector;
    }

    public static Vector<Integer> deleteAllUnevenNumbers(Vector<Integer> inputVector) {
        for (int i = 0; i < inputVector.size(); i++) {
            while (i < inputVector.size() && inputVector.get(i) % 2 != 0) {
                inputVector.remove(i);
            }
        }
        return inputVector;
    }


    public static Vector<Integer> insertVectorInVectorAndSort1(Vector<Integer> inputVector1, Vector<Integer> inputVector2) {

        sortDescending(inputVector1);
        sortDescending(inputVector2);
        Vector<Integer> outputVector = new Vector<Integer>();

        while (!inputVector1.isEmpty() && !inputVector2.isEmpty()) {
            if (inputVector1.getFirst() < inputVector2.getFirst()) {
                outputVector.add(inputVector2.getFirst());
                inputVector2.removeFirst();
            } else {
                outputVector.add(inputVector1.getFirst());
                inputVector1.removeFirst();
            }
        }
        while (!inputVector1.isEmpty()) {
            outputVector.add(inputVector1.getFirst());
            inputVector1.removeFirst();

        }
        while (!inputVector2.isEmpty()) {
            outputVector.add(inputVector2.getFirst());
            inputVector2.removeFirst();

        }
        return outputVector;
    }
}
