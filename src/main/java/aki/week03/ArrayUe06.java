package aki.week03;

import gyula.week03.PrintArray;

import java.util.Arrays;
import java.util.Random;

public class ArrayUe06 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] testValues = PrintArray.createRandomArray(20);
        int[] veryRandom = createRandomArray(10);

        int[] arrayToSort = copyOf(veryRandom);
        System.out.println(Arrays.toString(arrayToSort));
        sortBubbleAsc(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        arrayToSort = copyOf(veryRandom);
        System.out.println(Arrays.toString(arrayToSort));
        sortBubbleDesc(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));


        System.out.println("Original:");
        System.out.println(Arrays.toString(veryRandom));
    }

    public static int[] createRandomArray(int values) {
        int[] array = new int[values];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        return array;
    }

    public static void sortBubbleAsc(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public static int[] copyOf(int[] original) {
        int[] result = new int[original.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = original[i];
        }
        return result;
    }
    public static void sortBubbleDesc(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] < values[j +1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
}
