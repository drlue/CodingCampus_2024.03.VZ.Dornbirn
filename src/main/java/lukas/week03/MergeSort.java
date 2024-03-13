package lukas.week03;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = lukas.week02.UeArrays.randomArray(1000000, 1000000, 1, 100000);
        // int[] arr = {5, 2, 4, 8, 1, 9, 7, 3, 6};
        //System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        int[] sortedArr = mergeSortByGyula(arr, 0, arr.length);
        long end = System.currentTimeMillis();
        System.out.println("Runtime: " + (end-start) + " ms");
        //System.out.println(Arrays.toString(sortedArr));

    }

    public static void mergeSort(int[] arrA, int lo, int hi) {
        if (hi - lo <= 1) {
            return;
        }

        //middle element
        int mid = (lo + hi) / 2;
        //sort halves
        mergeSort(arrA, lo, mid);
        mergeSort(arrA, mid, hi);

        //temporary sub array
        int[] arrB = new int[hi - lo];
        //running Index
        int i = lo;
        int j = mid;
        int k = 0;

        //sort arrB
        while (i < mid && j < hi) {
            if (arrA[i] < arrA[j]) {
                arrB[k] = arrA[i];
                i++;
            } else {
                arrB[k] = arrA[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            arrB[k] = arrA[i];
            i++;
            k++;
        }

        while (j < hi) {
            arrB[k] = arrA[j];
            j++;
            k++;
        }

        //merge arrB into arrA
        for (int l = 0; l < arrB.length; l++) {
            arrA[lo + l] = arrB[l];
        }
    }


    public static int[] mergeSortByGyula(int[] arrA, int lo, int hi) {
        if (hi - lo <= 1) {
            return new int[]{arrA[lo]};
        }
        int mid = (lo + hi) / 2;
        int[] left = mergeSortByGyula(arrA, lo, mid);
        int[] right = mergeSortByGyula(arrA, mid, hi);
        int[] result = new int[left.length + right.length];

        int leftIdx = 0;
        int rightIdx = 0;
        while (leftIdx < left.length && rightIdx < right.length){
            if (left[leftIdx] < right[rightIdx]){
                result[leftIdx + rightIdx] = left[leftIdx];
                ++leftIdx;
            } else {
                result[leftIdx + rightIdx] = right[rightIdx];
                ++rightIdx;
            }
        }
        while (leftIdx < left.length){
            result[leftIdx + rightIdx] = left[leftIdx];
            ++leftIdx;
        }
        while (rightIdx < right.length){
            result[leftIdx + rightIdx] = right[rightIdx];
            ++rightIdx;
        }

        return result;
    }

}
    

