package gyula.week03;

import gyula.week02.ArrayExample;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = PrintArray.createRandomArray(20);
        System.out.println(Arrays.toString(arr));
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortBubble(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
