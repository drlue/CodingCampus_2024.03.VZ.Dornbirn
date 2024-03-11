package samet.week02.day05;

import samet.week02.day2.UserInputTest;

import java.util.Arrays;
import java.util.Random;

public class ArrayUbungen {

    public static void main(String[] args) {

        int size = UserInputTest.getIntFromConsole("Bitte geben Sie die gewünschte Größe des Arrays an?", 0, 1000);
        int[] arr1 = newArrayAscending(size);
        System.out.println("Ascending : " + Arrays.toString(arr1));
        int[] arr2 = newArrayDescending(size);
        System.out.println("Descending: " + Arrays.toString(arr2));


        int[] copy = copyOf(arr1);
        copy[0] = 99;
        System.out.println("Original : " + Arrays.toString(arr1));
        System.out.println("Copy     : " + Arrays.toString(arr1));

    }


    public static int[] copyOf(int[] original){
        return original;
    }

    public static int[] newArrayAscending(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] newArrayDescending(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        return arr;

    }

}








