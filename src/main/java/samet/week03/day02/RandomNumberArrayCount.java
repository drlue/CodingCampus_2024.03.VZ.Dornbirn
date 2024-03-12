package samet.week03.day02;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayCount {

    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomNumberCount(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("number greater than 30: " + numberGreaterThan30(arr));

    }

    public static int[] createRandomNumberCount(int size) {

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        return arr;
    }

    public static int numberGreaterThan30(int[] array) {
        int greaterThan30 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 30) {
                greaterThan30++;

            }

        }
       return greaterThan30;
    }
}




