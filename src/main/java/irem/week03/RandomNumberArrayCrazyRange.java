package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayCrazyRange {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayCrazyRange(10);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createRandomArrayCrazyRange(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-50, 50);
        }
        return arr;
    }

}
