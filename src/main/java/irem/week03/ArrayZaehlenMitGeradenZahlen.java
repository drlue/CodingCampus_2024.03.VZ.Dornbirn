package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayZaehlenMitGeradenZahlen {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayZaehlen(10);
        System.out.println(Arrays.toString(arr));
        int count = countEven( arr);
        System.out.println("Count even: " + count);
    }

    public static int countEven(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0){
                ++result;
            }
        }
        return result;
    }
    public static int[] createRandomArrayZaehlen(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        return arr;
    }
}