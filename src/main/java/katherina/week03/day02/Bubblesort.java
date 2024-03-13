package katherina.week03.day02;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class Bubblesort {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        printWithForI(zufallswerte);
        bubblesortNachHoch(zufallswerte);
        bubblesortNachUnten(zufallswerte);
        System.out.println(Arrays.toString(zufallswerte));

    }

    public static void printWithForI(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print(arr[arr.length - 1] + " ");
            System.out.println();
        }
        System.out.println(">>Dies ist unsortiert! Hiiiiilfe! Sortier das!<<");
    }

    public static void bubblesortNachHoch(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane] > array[jane + 1]) {
                    int temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortNachUnten(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane] > array[jane + 1]) {
                    int temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }
}
