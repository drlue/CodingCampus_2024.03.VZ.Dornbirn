package samet.week04.day02;

import samet.week04.day01.BubblesortWithStrings;

import java.util.Arrays;

public class BubbleSortWithStringExtended {

    public static void main(String[] args) {

        String names[] = {"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijan", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(bubblesortStringExtended(names, true)));
        System.out.println(Arrays.toString(bubblesortStringExtended(names, false)));


    }

    public static String[] bubblesortStringExtended(String[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if ((array[j].length() > array[j + 1].length()) == ascending) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}














