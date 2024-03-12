package samet.week03.day02;

import java.util.Arrays;
import java.util.Random;


public class RandomNumberArraySum {

    static Random random = new Random();

    public static void main(String[] args) {
        createRandomArraySum(10);
    }

    public static void createRandomArraySum(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,101);
        }
        System.out.println(Arrays.stream(arr).sum());
    }
}
