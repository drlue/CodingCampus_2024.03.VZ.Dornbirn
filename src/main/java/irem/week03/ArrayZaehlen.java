package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayZaehlen {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayZaehlen(5);
        System.out.println(Arrays.toString(arr));
        int count = createNummberBigThan30(arr);

    }
    public static int createNummberBigThan30(int[] arr) {
        int bigThan30 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) ;
            bigThan30++;

        }
        System.out.println("number greater than 30: " + bigThan30);
        return bigThan30;
    }

    public static int[] createRandomArrayZaehlen(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        return arr;
    }
}