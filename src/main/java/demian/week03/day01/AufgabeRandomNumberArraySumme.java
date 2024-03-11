package demian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class AufgabeRandomNumberArraySumme {

    public static void main(String[] args) {

        //AUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
        //Erstelle eine Funktion, die die Summe der Werte zurückgibt.

        Random random = new Random();

        int[] randomNumberArray = new int[5];

        for (int element = 0; element < randomNumberArray.length; element++) {
            randomNumberArray[element] = random.nextInt(0, 101);
        }
        System.out.println("\nAUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.");
        System.out.println("\nRandom Number Array: " + Arrays.toString(randomNumberArray));
    }
}
