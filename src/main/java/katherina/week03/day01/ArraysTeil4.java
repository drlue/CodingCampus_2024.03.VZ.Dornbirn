package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil4 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumbers = random.nextInt(0, 101);


        int[] zufallswerte = new int[101];
        int index;
        int abzaehlBool = 0;
        for (index = 0; index < 100; index++) {
            zufallswerte[index] = random.nextInt(0, 100);

            //Umarbeiten mit if, else!
            System.out.println("Ist der Wert höher als dreißig? " + (zufallswerte[index] > 30) + ", nämlich " + zufallswerte[index]);
        }
        if (zufallswerte[index] > 30) ;
        {
            abzaehlBool++;
            System.out.println("So oft war der Wert höher als dreißig: " + abzaehlBool);
        }
    }
}