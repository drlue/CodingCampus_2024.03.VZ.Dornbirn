package lukas.week03;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        //int[] arr = lukas.week02.UeArrays.randomArray(10, 10, 1, 100);
        int[] arr = {5, 2, 4, 8, 1, 9, 7, 3, 6};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int counter = 0;
        for (int i = 2; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int swap = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = swap;
                j--;
                counter++;
            }
        }
        System.out.println("Step count = " + counter);
    }
}
