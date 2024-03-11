package demian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class AufgabeRandomNumberArrayZählen {
    public static void main(String[] args) {

        //AUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
        //Erstelle eine Funktion, die die Werte größer als 30 zählt.

        Random random = new Random();

        int[] randomNumberArray = new int[5];

        for (int element = 0; element < randomNumberArray.length; element++) {
            randomNumberArray[element] = random.nextInt(0, 101);
        }

        System.out.println("\nAUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.");
        System.out.println("\nRandom Number Array: " + Arrays.toString(randomNumberArray));
        System.out.println("\nUnteraufgabe: Erstelle eine Funktion, die die Werte größer als X zählt:");
        printnumbersOVERnumberXCOUNTER(randomNumberArray,20);


    }

    public static void printnumbersOVERnumberXCOUNTER (int[] integerARRAY, int numberX){
        int count = 0;
        int num = 0;
        for (int element = 0; element < integerARRAY.length; element++) {
            num = integerARRAY[element];
            if (num > numberX) {
                count++;
            }
        }
        System.out.println("\nAnzahl Zahlen über " + numberX + ": " + count);
    }

}
