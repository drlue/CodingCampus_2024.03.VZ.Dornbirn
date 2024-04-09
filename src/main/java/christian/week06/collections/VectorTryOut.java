package christian.week06.collections;

import java.util.Random;
import java.util.Vector;

public class VectorTryOut {
    static Random rnd = new Random();

    public static void main(String[] args) {
        Vector<Integer> intVector = new Vector<Integer>();
        for (int i = 0; i < 20; i++) {
            intVector.add(rnd.nextInt(0, 100));
        }
        System.out.println(intVector);
        System.out.println(allEvenNumbers(intVector));
        System.out.println(sortDescending(intVector));
        System.out.println(getMaximum(intVector));
        System.out.println(getMinimum(intVector));
    }

    public static Vector allEvenNumbers(Vector inputVector) {
        Vector<Integer> outputVector = new Vector<Integer>();
        if (!inputVector.isEmpty()) {
            for (int i = 0; i < inputVector.size(); i++) {
                if ((int) inputVector.get(i) % 2 == 0) {
                    outputVector.add((int) inputVector.get(i));
                }
            }
        }

        return outputVector;
    }

    public static int getMinimum(Vector inputVector) {
        int minimum = Integer.MAX_VALUE;
        if (!inputVector.isEmpty()) {
            for (int i = 0; i < inputVector.size(); i++) {
                if ((int) inputVector.get(i) < minimum) {
                    minimum = (int) inputVector.get(i);
                }
            }
        }
        return minimum;
    }

    public static int getMaximum(Vector inputVector) {
        int maximum = Integer.MIN_VALUE;
        if (!inputVector.isEmpty()) {
            for (int i = 0; i < inputVector.size(); i++) {
                if ((int) inputVector.get(i) > maximum) {
                    maximum = (int) inputVector.get(i);
                }
            }
        }
        return maximum;
    }

    public static Vector sortDescending(Vector inputVector) {
        int temp = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < inputVector.size(); i++) {

                if ((int) inputVector.get(i) > (int) inputVector.get(i - 1)) {

                    temp = (int) inputVector.get(i - 1);

                    inputVector.set((i - 1), inputVector.get(i));
                    inputVector.set(i, temp);
                    swapped = true;
                }
            }
        }
        return inputVector;
    }
}
