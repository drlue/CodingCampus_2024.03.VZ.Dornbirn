package samet.week03.day02;

import java.util.Arrays;

public class RandomNumberArrayMinMaxAvg {

    public static void main(String[] args) {

        int[] values = {5, 7, 1, 9, 2, 4, 11, 3};
        printArray(values);
        System.out.println("Min:" + minValue(values));
        System.out.println("MAX:" + maxValue(values));
        double avgResult = average(values);
        System.out.println("AVG:" + avgResult);
        System.out.println("Min Index:" + findMinIndex(values));
        System.out.println("Max Index:" + findMaxIndex(values));
    }

    public static void printArray(int[] value){
        System.out.println(Arrays.toString(value));
    }
    public static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if( arr [i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ( arr [i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
        }
        return (double) sum / arr.length;
    }
    public static int findMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxIndex(int[]arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
