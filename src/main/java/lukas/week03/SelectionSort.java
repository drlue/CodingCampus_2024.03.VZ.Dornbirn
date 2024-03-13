package lukas.week03;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = lukas.week02.UeArrays.randomArray(10, 10, 1, 100);
        //int[] arr = {5, 2, 4, 8, 1, 9, 7, 3, 6};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                counter++;
            }
            int swap = arr[i];
            arr[i] = arr[min];
            arr[min] = swap;
        }
        System.out.println("Step count = " + counter);
    }
}
