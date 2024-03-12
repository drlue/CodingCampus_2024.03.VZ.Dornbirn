package aki.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayAufgabeVergessen {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] crazyNum = generateRandomNumArray(10, -50, 50);
        System.out.println(Arrays.toString(crazyNum));
        System.out.println("Number of Numbers greater than 30: " + catchNumGreaterThan30(crazyNum));
    }

    public static int catchNumGreaterThan30(int[] array) {
        int numGreaterThan30 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 30) {
                numGreaterThan30++;
            }
        }
        return numGreaterThan30;
    }

    public static int[] generateRandomNumArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(min, max + 1);

        }
        return array;
    }
}
