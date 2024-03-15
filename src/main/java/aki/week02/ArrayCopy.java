package aki.week02;

import java.util.Arrays;
import java.util.Random;


public class ArrayCopy {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] arr = randomArrayGenerator(10);
        System.out.println(Arrays.toString(arr));

        int[] copy = copyOf(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }

    public static int[] copyOf(int[] original) {
        int[] result = new int[original.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = original[i];
        }
        return result;
    }

    public static int[] randomArrayGenerator(int values) {
        int[] array = new int[values];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
