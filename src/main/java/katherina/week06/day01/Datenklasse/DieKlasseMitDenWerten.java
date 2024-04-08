package katherina.week06.day01.Datenklasse;

import java.util.Random;

public class DieKlasseMitDenWerten {
    //Eine Hilfsklasse benötigt keine Main-Methode.
    static Random random = new Random();
    private int[] zufallswerte = createRandomArray(10);
    private static int[] array = new int[10];

    public DieKlasseMitDenWerten(int[] array) {
        if (zufallswerte.length > 0) {
            this.array = zufallswerte;
        } else {
            throw new RuntimeException("Ungültige Array-Länge. Bitte überprüfen!");
        }
    }

    public int[] getArray(DieKlasseMitDenWerten intArray) {
        return array;
    }

    public static void printWithForI(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print(arr[arr.length - 1] + " ");
            System.out.println();
        }
        System.out.println("Das ist das Array! Und nun, zu den Statistiken:");
    }


    public static int maximum() {
        int maxi = Integer.MIN_VALUE;
        for (int jane = 0; jane < array.length; jane++) {
            if (array[jane] > maxi) {
                maxi = array[jane];
            }
        }
        return maxi;
    }

    public static int minimum() {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (mini > array[i]) {
                mini = array[i];
            }
        }
        return mini;
    }

    public static double average() {
        int avg = 0;
        for (int index = 0; index != array.length; index++) {
            avg += array[index];
        }
        return ((double) avg / array.length);
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(-100, 100);
        }
        return result;
    }

    @Override
    public String toString() {
        printWithForI(array);
        return "\n" +
                "Array-Statistik: \n" +
                "Größter Wert: " + maximum() + "\n" +
                "Kleinster Wert: " + minimum() + "\n" +
                "Durchschnitt: " + average();
    }

}
