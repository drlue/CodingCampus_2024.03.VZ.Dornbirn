package samet.week03.day03;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int[] arr = PrintArray.createRandArray(10);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

// Der Selectionsort Algo SORTIERT durch AUSWAHL.
// Entweder sucht man dabei immer das kleinste (MinSort) oder das größte Element (MaxSort). Das Vorgehen dabei bleibt immer gleich.


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {     //Bestimmt ob von klein zu groß oder groß zu klein sortiert wid !!
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

}


