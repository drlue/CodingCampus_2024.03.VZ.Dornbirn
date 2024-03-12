package demian.week03.day02;

import java.util.Arrays;
import java.util.Random;

public class BubblesortmitZahlen {
    public static void main(String[] args) {

        int[] array = randomNumberArray(10, 101);
        System.out.print("\nARRAY: ");
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println("\nSORTED ARRAY: " + Arrays.toString(array) );

    }

    public static int[] randomNumberArray(int arrayLength, int randomNumberBound) {
        Random random = new Random();
        int[] result = new int[arrayLength];
        for (int idx = 0; idx < arrayLength; idx++) {
            result[idx] = random.nextInt(randomNumberBound);
        }
        return result;
    }

    public static void sortArray(int[] arra) {
        int temp = 0;
        boolean swap = true;
        int round = 0;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < (arra.length - 1 - round); idx++) {
                if (arra[idx] > arra[idx + 1]) {
                    swap = true;
                    temp = arra[idx + 1];
                    arra[idx + 1] = arra[idx];
                    arra[idx] = temp;
                }
            }
            round++;
        }
    }
}
