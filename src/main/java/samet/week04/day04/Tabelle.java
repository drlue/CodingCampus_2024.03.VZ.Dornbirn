package samet.week04.day04;

import java.util.Arrays;

public class Tabelle {

    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorf", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] strAge;
        strAge = intToStringArray(age);
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf",
                "Sankt Poelten", "Sankt Poelten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] strDistanceFromCapital;
        strDistanceFromCapital = floatToStringArray(distanceFromCapital);
        String[] header = {"First name", "Last Name", "Age", "Place", "Distance From City"};
        String[][] dataTable = {firstName, lastName, strAge, place, strDistanceFromCapital};
        printTable(dataTable);

    }

    public static String[] floatToStringArray(float[] flArray) {

        String[] array = new String[flArray.length];
        for (int i = 0; i < flArray.length; i++) {
            array[i] = Float.toString(flArray[i]);
        }
        return array;
    }

    public static String[] intToStringArray(int[] intArray) {
        String[] array = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            array[i] = Integer.toString(intArray[i]);
        }
        return array;
    }

    public static void printTable(String[][] array) {

        int maxColumns = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            maxColumns = Math.max(array[i].length, maxColumns);
        }

        int[] length = new int[maxColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                length[j] = Math.max(array[i][j].length(), length[j]);
            }
        }

        String[] format = new String[length.length];
        for (int i = 0; i < length.length; i++) {
            format[i] = "%1$" + length[i] + "S" +
                    (i + 1 == length.length ? "\n" : " || ".repeat(1));

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.printf(format[j], array[i][j]);
            }
        }
    }
}
