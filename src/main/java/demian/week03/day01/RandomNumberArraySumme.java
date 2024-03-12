package demian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArraySumme {

    public static void main(String[] args) {

        //AUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
        //Erstelle eine Funktion, die die Summe der Werte zurückgibt.

        Random random = new Random();

        int[] randomNumberArray = new int[3];

        for (int element = 0; element < randomNumberArray.length; element++) {
            randomNumberArray[element] = random.nextInt(0, 101);
        }
        System.out.println("\nAUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.");
        System.out.println("\nRandom Number Array: " + Arrays.toString(randomNumberArray));
        printSUMofArrayElements(randomNumberArray);


    }

    public static void printSUMofArrayElements (int[] integerARRAY){
        int sum = 0;
        for (int idx = 0; idx < integerARRAY.length; idx++) {
            sum += integerARRAY[idx];
        }
        System.out.println("\nSumme aller Elemente des Arrays: " + sum);
    }

}
