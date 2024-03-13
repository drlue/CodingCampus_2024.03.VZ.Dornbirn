package katherina.week03.day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Bubblesort {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        printWithForI(zufallswerte);
        System.out.println(">>Dies ist unsortiert! Hiiiiilfe! Sortier das!<<");
        System.out.println();
        bubblesortNachHoch(zufallswerte);
        System.out.println(">>So?<<");
        printWithForI(zufallswerte);
        System.out.println();
        bubblesortNachUnten(zufallswerte);
        System.out.println(">>Oder lieber so?<<");
        printWithForI(zufallswerte);
        System.out.println();
        System.out.println("Super, passt! Danke schön!");
    }

    public static void printWithForI(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }

    //Variable 'jane' heißt so aus Accessibility-Gründen. Ich kann sonst nicht gut sehen, ob etwas i oder j ist.
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
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }

/*
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if (array[jane] < array[jane + 1]) {
                    int temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
 */
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }


}
