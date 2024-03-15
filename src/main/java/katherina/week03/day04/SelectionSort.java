package katherina.week03.day04;

import java.util.Random;

public class SelectionSort {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(20);
        printWithForI(zufallswerte);
        System.out.println(">>Dies ist schon wieder unsortiert! Hiiiiilfe! Sortier das! Aber dieses Mal ohne Schummeln.<<");
        System.out.println();
        selectionSort(zufallswerte);
        System.out.println(">>So?<<");
        printWithForI(zufallswerte);
        System.out.println();
        copy(zufallswerte);
        System.out.println(">>Oder lieber so?<<");
        printWithForI(zufallswerte);
        System.out.println();
        System.out.println("Siehste, geht doch!");
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
    public static void selectionSort(int[] array) {
        int min = 0;
        for (int index = 1; index < array.length; index++) {
            for (int jane = 0; jane == index + 1; jane++) {
                min = jane;
                if (array[jane] < array[min]) {
                    int temp = array[jane];
                    array[min] = array[jane];
                    array[jane] = temp;
                }
                if (array[0] < array[min]) {
                    int temp = array[1];
                    array[min] = array[index];
                    array[index] = temp;
                }
            }
        }
    }

    public static int[] copy(int[] originArray) {
        int[] result = new int[originArray.length];
        for (int index = 0; index < result.length; index++) {
            result[index] = originArray[index];
            //       originArray[originArray.length-1]=10000;
            {
                for (int jane = 0; jane < originArray.length - index - 1; jane++) {
                    if (originArray[jane] < originArray[jane + 1]) {
                        int temp = originArray[jane];
                        originArray[jane] = originArray[jane + 1];
                        originArray[jane + 1] = temp;
                    }
                }
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
