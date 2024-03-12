package franco.week02.day05;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] crazyNum = generateRandomNumArray(10, -50, 50);
        System.out.println(Arrays.toString(crazyNum));
        int[] arr = {1, 2, 34, -24, 35, 2, 5, 32, 5, 6, 432, 7, 9};
        printEveryOtherElement(arr);
        returnSum(arr);
        findMax(arr);
        findMin(arr);
        findMinIndex(arr);
        findMaxIndex(arr);
        averageValue(arr);


//        System.out.println("number greater than 30: " + countNumGreaterThan30(crazyNum));
//        System.out.println("divide by two: " + divideByTwo(crazyNum));

        //for loop
        for (int i = 0; i < crazyNum.length; i++) {
            System.out.println("For loop crazy num " + crazyNum[i]);
        }
//        //For each loop
        for (int number : crazyNum) {
            System.out.println("For each printed number " + number + " ");
        }
    }

    public static int[] generateRandomNumArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(min, max + 1);

        }
        return array;
    }

    public static int countNumGreaterThan30(int[] array) {
        int greaterThan30 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 30) {
                greaterThan30++;
            }
        }
        return greaterThan30;
    }

    //Count element which is divisible by 2
    public static int divideByTwo(int[] array) {
        int divided = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                divided++;
            }
        }
        return divided;
    }

    public static void printEveryOtherElement(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    public static void returnSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum of array = " + sum);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The max value is " + max);
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The min value is " + min);
        return min;
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("min index is " + minIndex);
        return minIndex;
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Max index is " + maxIndex);
        return maxIndex;
    }
     public static int averageValue(int []array){
        int average= 0;
         for (int i = 0; i <array.length ; i++) {
             average=average+array[i];
         }
         average=average/array.length;
         System.out.println("Average value of array is "+average);
         return average;

     }

    public static void printWithForI(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void printWithForEach(int[] arr){
        System.out.print("[");
        boolean first = true;
        for (int value : arr){
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(value);
            first = false;
        }
        System.out.println("]");
    }


}


