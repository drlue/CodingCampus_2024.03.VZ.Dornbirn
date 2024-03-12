package christian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArrayAufgaben {
    public static Random random = new Random();

    public static void main(String[] args) {

        int[] arr = {};
        //int[] arr = rndArrayMinusFiftyToFifty();

        for (int value : arr) {
            System.out.println("Arraypositionen: " + value);
        }
        String ausgabe = Arrays.toString(arr);
        System.out.println(ausgabe);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Values greater than 30: " + readArrayCountGreaterthan30(arr));
        System.out.println(Arrays.toString(sortIntArray(arr)));
        System.out.println("Min: " +minValueFromIntArray(arr));
        System.out.println("Max: " +maxValueFromIntArray(arr));

    }

    public static int[] rndArrayZeroToHundred() {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        return array;
    }

    public static int[] rndArrayMinusFiftyToFifty() {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }
        return array;
    }

    public static int readArrayCountGreaterthan30(int[] arr) {
        int greaterThan30Counter = 0;
        for (int value : arr) {
            if (value >= 30) {
                greaterThan30Counter++;
            }
        }
        return greaterThan30Counter;
    }

    public static int sumOfAllValuesInArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] sortIntArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int minValueFromIntArray(int[] arr) {
        int minvalue;
        Arrays.sort(arr);
        minvalue = arr[0];
        return minvalue;

    }
    public static int maxValueFromIntArray(int[]arr){
        int maxvalue;
        Arrays.sort(arr);
        maxvalue = arr[arr.length-1];
        return maxvalue;

    }
    public static int averageValueInIntArray(int[]arr){
        int average =0;
        for (int i= 0; i < arr.length; i++){
            average += arr[i];
        }
        average/=arr.length;
        return average;
    }
}
