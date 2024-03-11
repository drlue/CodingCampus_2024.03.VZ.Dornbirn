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
        System.out.print("Minimum Wert im Array: ");
        int min = returnMINelementOFarray(randomNumberArray);
        System.out.println(min);

    }

    //Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben).

    //METHODE: MINIMUM DES ARRAYS ZURUECKGEBEN

    public static int returnMINelementOFarray(int[] array) {
        int zahl = 0;
        int returnvalue = Integer.MAX_VALUE;
        for (int element = 0; element < array.length; element++) {
            zahl = array[element];
            if (zahl < returnvalue) {
                returnvalue = zahl;
            }
        }
        return returnvalue;
    }

}





