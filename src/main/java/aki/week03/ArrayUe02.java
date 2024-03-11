package aki.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayUe02 {
    public static Random rando = new Random();

    public static void main(String[] args) {
        int random = rando.nextInt(0, 100);
        int[] numberArr = new int[10];
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = rando.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(numberArr));
    }
}
