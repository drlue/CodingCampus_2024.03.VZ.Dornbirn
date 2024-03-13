package lukas.week03;

import java.util.Arrays;
import java.util.Random;

public class QuckSort {

    public static Random random = new Random();
    public static int quickSortCounter = 0;
    public static int quickSortSwapCounter = 0;

    public static void main(String[] args) {
        int[] arr = lukas.week02.UeArrays.randomArray(10);
        //int[] arr = {38, 20, 52, 38, 52, 0, 49, 77, 100};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("Quicksort wurde " + quickSortCounter + " mal aufgerufen.");
        System.out.println("Es wurden " + quickSortSwapCounter + " swaps durchgeführt.");
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        quickSortCounter++;
        int q = random.nextInt(l, r + 1); //zuf Index für Pivot-Element
        int m = partition(arr, l, r, q);
        //System.out.printf("%-3s %s  %3s\n", quickSortCounter + ":", Arrays.toString(arr), quickSortSwapCounter + " swaps");
        quickSort(arr, l, m - 1);
        quickSort(arr, m + 1, r);
    }

    public static int partition(int[] arr, int l, int r, int q) {
        int pivot = arr[q];
        arr[q] = arr[r];
        arr[r] = pivot;
        int i = l;
        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                quickSortSwapCounter++;
            }
        }
        int swap2 = arr[i];
        arr[i] = arr[r];
        arr[r] = swap2;
        return i;
    }
}
