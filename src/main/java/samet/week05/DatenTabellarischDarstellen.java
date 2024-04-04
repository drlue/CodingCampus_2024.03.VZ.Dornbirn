package samet.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DatenTabellarischDarstellen {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\samet\\assets\\tmp\\output1.txt");
            PrintStream ps = new PrintStream(fos);

            String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
            String[] lastName = {"Klein", "Kinderdorf", "Al Elmenar", "Schmidt", "Simma"};
            int[] age = {40, 78, 5, 18, 81};
            String[] strAge;
            strAge = intToStringArray(age);
            String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
            float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
            String[] strDistanceFromCapital;
            strDistanceFromCapital = floatToStringArray(distanceFromCapital);
            String[] header = {"First name", "Last Name", "Age", "Place", "Distance From City"};
            String[][] dataTable = {firstName, lastName, strAge, place, strDistanceFromCapital};
            printTable(ps, dataTable);
            ps.close();
            System.out.println("Die Tabelle wurde erfolgreich exportiert...");

        } catch (FileNotFoundException fnfe) {
            System.out.println("The file is not writable...");
        }
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

    public static void printTable(PrintStream ps, String[][] array) {

        int maxCol = Integer.MIN_VALUE;
        for (String[] strings : array) {
            maxCol = Math.max(strings.length, maxCol);
        }

        int[] lengthCol = new int[maxCol];
        for (String[] strings : array) {
            for (int j = 0; j < strings.length; j++) {
                lengthCol[j] = Math.max(strings[j].length(), lengthCol[j]);
            }
        }

        String[] format = new String[lengthCol.length];
        for (int i = 0; i < lengthCol.length; i++) {
            format[i] = "%1$" + lengthCol[i] + "S" +
                    (i + 1 == lengthCol.length ? "\n" : " || ".repeat(1));

        }

        for (String[] strings : array) {
            for (int j = 0; j < strings.length; j++) {

                ps.printf(format[j], strings[j]);
            }
        }
    }
}