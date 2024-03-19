package irem.week04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BubblesortMitStrings {
    static Random random = new Random();

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        printWithForI(names);
        System.out.println("Die Namen sind ungeordnet ");
        System.out.println();

        sortLenghtAsc(names);
        System.out.println("Sorted by Length ASC");
        printWithForI(names);
        System.out.println();

        sortLengthDesc(names);
        System.out.println("Sorted by Length DESC");
        printWithForI(names);
        System.out.println();

        sortAlphaAsc(names);
        System.out.println(" A-Z,...");
        printWithForI(names);

        sortAlphaDesc(names);
        System.out.println(" Z-A,...");
        printWithForI(names);

    }

    public static void printWithForI(String[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }

    public static void sortAlphaDesc(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortLengthDesc(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortAlphaAsc(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortLenghtAsc(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
