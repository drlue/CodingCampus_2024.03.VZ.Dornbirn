package demian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayMinMaxAvg {

    public static void main(String[] args) {

        //AUFGABE:  Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
        //          Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt.
        //                Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben).
        //                In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.
        //          Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.

        Random random = new Random();

        int[] randomNumberArray = new int[3];

        for (int idx = 0; idx < randomNumberArray.length; idx++) {
            randomNumberArray[idx] = random.nextInt(0, 101);
        }
        System.out.println("\nAUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.");
        System.out.println("\nRandom Number Array: " + Arrays.toString(randomNumberArray));
        // AUFGABE: MIN METHODE
        System.out.print("Minimum Wert im Array: ");
        System.out.println(minVALUE(randomNumberArray));
        // AUFGABE: MAX METHODE
        System.out.print("Maximum Wert im Array: ");
        System.out.println(maxVALUE(randomNumberArray));
        // AUFGABE: AVERAGE
        System.out.print("Durschnittswert aus Array-Werten-Summe: ");
        System.out.println(avg(randomNumberArray));
        // AUFGABE: MIN Index METHODE
        System.out.print("Index-Nr die den geringsten Wert hält: ");
        System.out.println(minIDX(randomNumberArray));
        // AUFGABE: MAX Index METHODE
        System.out.print("Index-Nr die den maximalen Wert hält: ");
        System.out.println(maxIDX(randomNumberArray));


    }

    //Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben).

    //METHODE: MINIMUM DES ARRAYS ZURUECKGEBEN

    public static int maxVALUE(int[] array) {
        int bestMax = Integer.MIN_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > bestMax) {
                bestMax = array[idx];
            }
        }
        return bestMax;
    }

    public static int minVALUE(int[] array) {
        int bestMin = Integer.MAX_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < bestMin) {
                bestMin = array[idx];
            }
        }
        return bestMin;
    }

    public static float avg(int[] array) {
        int sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];
        }
        return (float) sum / array.length;
    }

    public static int minIDX(int[] array) {
        int minIDXvalue = Integer.MAX_VALUE;
        int result = -1;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < minIDXvalue) {
                result = idx;
                minIDXvalue = array[idx];
            }
        }
        return result;
    }

    public static int maxIDX(int[] array) {
        int maxIDXvalue = Integer.MIN_VALUE;
        int result = -1;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > maxIDXvalue) {
                result = idx;
                maxIDXvalue = array[idx];
            }
        }
        return result;
    }

    public static int maxIDXByGyula(int[] array) {
        int idxMax = -1;
        for (int idx = 0; idx < array.length; idx++) {
            if (idxMax < 0 || array[idx] > array[idxMax]) {
                idxMax = idx;
            }
        }
        return idxMax;
    }


}





