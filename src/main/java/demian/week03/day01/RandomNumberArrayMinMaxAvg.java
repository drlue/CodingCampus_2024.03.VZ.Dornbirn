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

        for (int element = 0; element < randomNumberArray.length; element++) {
            randomNumberArray[element] = random.nextInt(0, 101);
        }
        System.out.println("\nAUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.");
        System.out.println("\nRandom Number Array: " + Arrays.toString(randomNumberArray));
        // AUFGABE: MIN METHODE
        System.out.print("Minimum Wert im Array: ");
        System.out.println(min(randomNumberArray));
        // AUFGABE: MAX METHODE
        System.out.print("Maximum Wert im Array: ");
        System.out.println(max(randomNumberArray));
        // AUFGABE: AVERAGE
        System.out.print("Durschnittswert aus Array-Werten-Summe: ");
        System.out.println(avgARRAY(randomNumberArray));


    }

    //Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben).

    //METHODE: MINIMUM DES ARRAYS ZURUECKGEBEN

    public static int max(int[] array) {
        int bestMax = Integer.MIN_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > bestMax) {
                bestMax = array[idx];
            }
        }
        return bestMax;
    }

    public static int min(int[] array) {
        int bestMin = Integer.MAX_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < bestMin) {
                bestMin = array[idx];
            }
        }
        return bestMin;
    }

    public static int avgARRAY(int[] array) {
        int sum = 0;
        int result = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];
        }
        result = sum / array.length;
        return result;
    }

}





