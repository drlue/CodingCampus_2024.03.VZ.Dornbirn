package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArraySum {

    static Random random = new Random();

    public static void main(String[] args) {
        createRandomArrayZaehlen(10);
    }

    public static void createRandomArrayZaehlen(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }

        System.out.println(Arrays.stream(arr).sum());
    }
}

