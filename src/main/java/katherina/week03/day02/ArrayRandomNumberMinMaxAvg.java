package katherina.week03.day02;

import java.util.Random;

public class ArrayRandomNumberMinMaxAvg {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        printWithForI(zufallswerte);
        System.out.println("Maximalwert:  " + maximum(zufallswerte));
        System.out.println("Dieser Wert steht an Stelle:  " + (maxidex(zufallswerte) + 1));
        System.out.println("Minimalwert:  " + minimum(zufallswerte));
        System.out.println("Dieser Wert steht an Stelle:  " + (minidex(zufallswerte) + 1));
        System.out.println("Durchschnitt: " + average(zufallswerte));

    }

    public static void printWithForI(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print(arr[arr.length - 1] + " ");
            System.out.println();
        }
        System.out.println("Fertig! Und nun, zu den Statistiken (siehe unten).");
    }

    public static int maximum(int[] arrg) {
        int maxi = Integer.MIN_VALUE;
        for (int index = 0; index < arrg.length; index++) {
            if (arrg[index] > maxi) {
                maxi = arrg[index];
            }
        }
        return maxi;
    }

    public static int minimum(int[] arrg) {
        int mini = Integer.MAX_VALUE;
        for (int index = 0; index < arrg.length; index++) {
            if (mini > arrg[index]) {
                mini = arrg[index];
            }
        }
        return mini;
    }

    public static double average(int[] arrg) {
        int avg = 0;
        for (int index = 0; index != arrg.length; index++) {
            avg += arrg[index];
        }
        return ((double) avg / arrg.length);
    }

    public static int maxidex(int[] array) {
        int result = -1;
        for (int index = 0; array.length > index; index++) {
            if (result < 0 || array[result] < array[index]) {
                result = index;
            }
        }
        return result;
    }

    public static int minidex(int[] array) {
        int result = -1;
        for (int index = 0; index < array.length; index++) {
            if (result < 0 || array[index] < array[result]) {
                result = index;
            }
        }
        return result;
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }


}
