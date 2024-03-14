package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortExample {

    static Random random = new Random();
    public static void main(String[] args) {
        int[] arr = {10, 10, 0, 10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(arr));
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
    }
}
