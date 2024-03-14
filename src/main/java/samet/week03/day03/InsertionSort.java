package samet.week03.day03;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int [] arr = PrintArray.createRandArray(10);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// Der Insertionsort Algo SORTIERT durch EINFÜGEN.
// Er durchläuft Schritt für Schritt einen Array und entnimmt dabei aus der unsortierten Eingabefolge ein Element und
// setzt es dann an der entsprechend richtigen Stelle wieder ein – „Sortieren durch Einfüge
// Die restlichen Elemente des Arrays müssen dann wiederrum hinter dem neu eingefügten Wert verschoben werden.

    public static void insertionSort( int[] arr){

        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];

            int j = i -1 ;
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr [j];
                j --;
            }
            arr[j +1] = temp;

        }
    }
}
