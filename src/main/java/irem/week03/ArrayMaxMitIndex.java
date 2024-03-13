package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMaxMitIndex {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        //int[] numbers = new int[]{};
        System.out.println("Original array");
        System.out.println(Arrays.toString(numbers));
        countValueNotOver50(numbers);
        System.out.println();

        System.out.println(Arrays.toString(numbers));
        System.out.println("Index des maximal Werstes " + maxIndex(numbers));
        System.out.println("Imaxindex: " + maxIndex(numbers));
    }

    public static int countValueNotOver50(int[] array) {
        int valueMaxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50) {
                valueMaxNumber++;
            }
        }
        return valueMaxNumber;
    }

    public static int maxIndex(int[] array) {
        int maxIndex = -1;
        for (int i = 1; i < array.length; i++) {
            if (maxIndex < 0 || array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int[] createRandomArrayMax(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        return arr;
    }

}

