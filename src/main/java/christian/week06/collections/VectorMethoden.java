package christian.week06.collections;

import java.util.Vector;

public class VectorMethoden {
    public static Vector allEvenNumbers(Vector<Integer> inputVector) {
        Vector<Integer> outputVector = new Vector<Integer>();

        for (int i = 0; i < inputVector.size(); i++) {
            if (inputVector.get(i) % 2 == 0) {
                outputVector.add(inputVector.get(i));
            }
        }


        return outputVector;
    }

    public static int getMinimum(Vector<Integer> inputVector) {
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < inputVector.size(); i++) {
            if (inputVector.get(i) < minimum) {
                minimum = inputVector.get(i);
            }
        }

        return minimum;
    }

    public static int getMaximum(Vector<Integer> inputVector) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < inputVector.size(); i++) {
            if (inputVector.get(i) > maximum) {
                maximum = inputVector.get(i);
            }
        }

        return maximum;
    }

    public static Vector sortDescending(Vector<Integer> inputVector) {
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

    public static Vector deleteAllUnevenNumbers(Vector<Integer> inputVector) {
        for (int i = 0; i < inputVector.size(); i++) {
            while ((float) inputVector.get(i) % 2 != 0.00f) {
                inputVector.remove(i);
            }
        }
        return inputVector;
    }
}
