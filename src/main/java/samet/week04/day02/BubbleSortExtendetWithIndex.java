package samet.week04.day02;

import java.util.Arrays;

public class BubbleSortExtendetWithIndex {
    public static void main(String[] args) {

        String names[] = {"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijan", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        sortByIndex(names, 2);
        System.out.println(Arrays.toString(names));
    }

    public static void sortByIndex(String[] array, int index) {
        if (index < 0 || minLength(array) <= index) {
            System.out.println("Sort is not possible on index: " + index);
            return;
        }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j].charAt(index) > array[j + 1].charAt(index)) {
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
    }
    public static int minLength(String[] array) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minLen) {
                minLen = array[i].length();
            }
        }
        return minLen;
    }
}