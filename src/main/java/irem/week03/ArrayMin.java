package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMin {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayMin(10);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createRandomArrayMin(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        return arr;
    }
}
