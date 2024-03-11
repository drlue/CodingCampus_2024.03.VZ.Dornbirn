package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil3 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumbers = random.nextInt(-50, 50);
        int randomPosition = random.nextInt(0,101);
        System.out.println("Random Number Array Crazy Range");

        int[] zufallswerte = new int[randomPosition];
        System.out.println("Das ist mit for-Schleife - aber wie mache ich das mit 'Foreach'?");
        for (int index = 0; index < randomPosition; index++) {
            zufallswerte[index] = random.nextInt(-50,50);
            System.out.println("Wert: " + zufallswerte[index]);
        }

     /*
     Das funktioniert nicht, da auf diese Weise ein Array mit negativer Länge/negativen Positionen erstellt zu werden versucht und das ist unmöglich!

     for (int randomPosition : zufallswerte) {
            System.out.println("Wert: " + zufallswerte);
        }*/
    }
}
