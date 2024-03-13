package christian.week03.day02;

import java.util.Arrays;
import java.util.Random;

public class MergeSortClass {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] array = createRandomNumberArray(10, 0, 101);
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, 10);
        System.out.println(Arrays.toString(array));


    }

    public static int[] createRandomNumberArray(int size, int origin, int bound) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if (hi - lo <= 1) {
            return;
        }
        int mid = (lo + hi) / 2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid, hi);

        int[] arrB = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 0;

        while (i < mid && j < hi) {
            if (arr[i] < arr[j]) {
                arrB[k++] = arr[i++];
            } else {
                arrB[k++] = arr[j++];
            }
        }
        while (i < mid) {
            arrB[k++] = arr[i++];
        }
        while (j < hi) {
            arrB[k++] = arr[j++];
        }
        for (int l = lo; l < hi-1; l++) {
            int h = 1;
            arr[lo] = arrB[h];
            h++;
        }
    }
}