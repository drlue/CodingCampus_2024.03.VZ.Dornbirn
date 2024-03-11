package christian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethoden {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] array = createRandomNumberArray(10, 0, 101);  //{1,2,3,6,7,8,2,0};
        System.out.println(Arrays.toString(array));
        printIntArray(array);
        System.out.println("MaxValue: " +getMaxValue(array));
        System.out.println("Index of Maxvalue: " +getIndexOfMax(array));
        System.out.println("MinValue: "+getMinValue(array));
        System.out.println("Index of Minvalue: "+getIndexOfMin(array));

//        int[] bubblesortArray = bubblesort(array);
//        System.out.println(Arrays.toString(bubblesortArray));

//        System.out.println(returnMinIntValueOfIntArray(array));
    }

    public static int[] createRandomNumberArray(int size, int origin, int bound) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }

    public static void printIntArray(int[] arr) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index: " + i + " Value: " + arr[i]);
            }
        } else {
            System.out.println("Das Array beinhaltet keine Werte!");
        }
    }

    public static void printIntArrayForeach(int[] arr) {
        if (arr.length > 0) {
            int indexNumber = 0;
            for (int value : arr) {
                System.out.println("Index: " + indexNumber + " Value: " + value);
                indexNumber++;
            }
        } else {
            System.out.println("Das Array beinhaltet keine Werte!");
        }
    }

    public static String createString(int[] arr) {
        String result = "";
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                str.append(arr[i] + ",");
            else {
                str.append(arr[i]);
            }
        }
        str.append("]");
        return str.toString();
    }

    public static int getValueCount(int[] arr, int value) {
        int valueCounter = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (value == arr[i]) {
                    valueCounter++;
                }
            }
        }
      return valueCounter;
    }

    public static int getValueCountGreaterThan (int[] arr, int value) {
        int valueCounter = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (value > arr[i]) {
                    valueCounter++;
                }
            }
        }
       return valueCounter;
    }

    public static int getMinValue(int[] arr) {
        int minInt = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minInt) {
                minInt = arr[i];
            }
        }
        return minInt;
    }
    public static int getMaxValue(int[]arr){
        int maxInt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt){
                maxInt = arr[i];
            }
        }
        return maxInt;
    }
    public static int getIndexOfMin(int[]arr){
        int minInt = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minInt) {
                minInt = arr[i];
                index=i;
            }
        }
        return index;
    }
    public static int getIndexOfMax (int[]arr){
        int maxInt = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt){
                maxInt = arr[i];
                index = i;
            }
        }
        return index;
    }
//    public static int[] bubblesort (int[]arr) {
//        boolean swapped = true;
//        boolean first = true;
//        int temp=Integer.MIN_VALUE;
//        while (swapped){
//            for (int i = 0; i < arr.length-1; i++) {
//                if (first){
//                    temp = arr[i];
//                    first =false;
//                }
//                else {
//                    if (temp > arr)
//                    }
//                }
//
//
//            }
//        }
//        return arr;
//    }
}
