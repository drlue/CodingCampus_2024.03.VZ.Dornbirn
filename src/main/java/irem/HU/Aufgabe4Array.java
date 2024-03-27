package irem.HU;

import java.util.Arrays;

public class Aufgabe4Array {


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Ursprüngliches Array:");
        System.out.println(Arrays.toString(arr));

        // Anwendung von Bubble Sort
        bubbleSort(arr);

        // Ausgabe des sortierten Arrays
        System.out.println("Sortiertes Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length-1; i++)
            for (int j = 0; j < length-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // Tausche arr[j+1] und arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


}
