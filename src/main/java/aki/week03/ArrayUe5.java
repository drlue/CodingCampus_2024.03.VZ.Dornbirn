package aki.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayUe5 {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] randomNumberHelper = randomNumberGenerator(10, 0, 100);
        System.out.println("==========================================");
        System.out.print("There are " + minNumberCatcher(randomNumberHelper) + " Min Numbers, ");
        System.out.println(maxNumberCatcher(randomNumberHelper) + " Max Numbers!");
        System.out.println(avgNumberCalc(randomNumberHelper) + " is the Average Number");
    }

    public static int[] randomNumberGenerator(int values, int min, int max) {
        int[] array = new int[values];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(min, max + 1);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int minNumberCatcher(int[] size) {
        int catchMinNumber = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] > 50) {
                catchMinNumber++;
            }
        }
        return catchMinNumber;
    }

    public static int maxNumberCatcher(int[] copyPaste) {
        int catchMaxNumber = 0;
        for (int i = 0; i < copyPaste.length; i++) {
            if (copyPaste[i] < 50) {
                catchMaxNumber++;
            }
        }
        return catchMaxNumber;
    }

    public static double avgNumberCalc(int[] valuesAddedTogether) {
        int summe = 0;
        for (int i = 0; i < valuesAddedTogether.length; i++) {
            summe += valuesAddedTogether[i];
        }
        System.out.println(summe + " is the sum!");
        return (double)summe / valuesAddedTogether.length;
    }
}
