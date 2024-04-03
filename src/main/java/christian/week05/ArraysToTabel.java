package christian.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class ArraysToTabel {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] kopfzeile = {"firstname", "lastname", "age", "place", "distance"};

        printArraysToFile(kopfzeile, firstName, lastName, ageToStringArray(age), place, distanceToStringArray(distanceFromCapital));
    }

    public static String[] ageToStringArray(int[] age) {
        String[] arr = new String[age.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(age[i]);
        }
        return arr;
    }

    public static String[] distanceToStringArray(float[] distance) {
        String[] arr = new String[distance.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.format("%.2f", distance[i]); //Float.toString(distance[i]);
        }
        return arr;
    }

    public static void printArraysToFile(String[] kopf, String[] first, String[] last, String[] age, String[] place, String[] distance) {
        File file = new File("C:\\Users\\schmi\\IdeaProjects\\CodingCampus_2024.03.VZ.Dornbirn\\src\\main\\java\\christian\\week05\\test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);

                ps.printf("%-15s | %-15s | %3s | %-15s | %10s",kopf[0],kopf[1],kopf[2],kopf[3],kopf[4]);
                ps.println();
                ps.println("_".repeat(70));

            for (int i = 0; i < first.length; i++) {

                ps.printf("%-15s | %-15s | %3s | %-15s | %10s", first[i], last[i], age[i], place[i], distance[i]);
                ps.println();
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden oder Zugriffsrechte fehlen!");
        }
    }
}
