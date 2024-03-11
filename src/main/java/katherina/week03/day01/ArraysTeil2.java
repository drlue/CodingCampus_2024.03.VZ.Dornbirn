package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil2 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumbers = random.nextInt(0,101);


        int[] zufallswerte = new int[101];
        //Ich habe meine Schublade mit "Zufallswerte" benannt, sind ja mehrere. Und ich bestimme, dass sie 100 Werte enthält.
        int index;
        System.out.println("Mit Fori-Schleife");
        for (index = 0; index < 101; index++) {
            zufallswerte[index] = random.nextInt(0,100);
            System.out.println("Wert: " + zufallswerte[index]);
        }
        System.out.println("Mit Foreach-Schleife");
        for (int wert : zufallswerte) {
            System.out.println("Wert: " + wert);
        }
        System.out.print("Kontrollsequenz:" );
    System.out.println(Arrays.toString(zufallswerte));

        System.out.println("Zweiter Wert:" + zufallswerte[1]);
        System.out.println("Fünfter Wert:" + zufallswerte[4]);
        System.out.println("Zehnter Wert:" + zufallswerte[9]);
    }
}
