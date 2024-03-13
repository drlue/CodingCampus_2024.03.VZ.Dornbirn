package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortBigMitZahlen {

    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = {90, 30, 37, 80, 68, 23, 20, 56};
        System.out.println("orginal Array");
        System.out.println(Arrays.toString(arr));

        sortBubbleAscending(arr);
        System.out.println("small --> BIG");
        System.out.println(Arrays.toString(arr));


        bigBubbleDescending(arr);
        System.out.println("BIIG --> small");
        System.out.println(Arrays.toString(arr));

    }

    public static void bigBubbleDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortBubbleAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

