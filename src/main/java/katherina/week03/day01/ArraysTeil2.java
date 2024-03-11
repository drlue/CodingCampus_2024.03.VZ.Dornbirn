package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil2 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumber = random.nextInt(101);
        int randomPosition = random.nextInt(101);


        int[] zufallswerte = new int[101];
        //Ich habe meine Schublade mit "Zufallswerte" benannt, sind ja mehrere. Und ich bestimme, dass sie 100 Werte enthält.
        int index = randomPosition;
        zufallswerte[randomNumber] = index;
        //Dieser Code-Teil sagt: An einer zufälligen Position steht eine zufällige Zahl. (Was ich möchte: An jeder einzelnen Position steht eine zufällige Zahl)
        System.out.println("Mit Fori-Schleife");
        for (index = 0; index < zufallswerte.length; index++) {
            int wert = zufallswerte[index];
            System.out.println("Wert: " + wert);
        }
        System.out.println("Mit Foreach-Schleife");
        for (int wert : zufallswerte) {
            System.out.println("Wert: " + wert);
        }
    System.out.println(Arrays.toString(zufallswerte));


/*        int[] test = {6, 7, 3, -1, 9, 5};

        for (int i = 0; i < test.length; i++) {
            int value = test[i];

            System.out.println("VALUE: " + value);
        }


        for (int value: test){
            System.out.println("VALUE: " + value);


    }*/
    }
}
