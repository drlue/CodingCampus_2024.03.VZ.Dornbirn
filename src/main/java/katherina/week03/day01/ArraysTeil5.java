package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil5 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumbers = random.nextInt(0, 101);
        System.out.println("Die Summe der Ausgaben soll erstellt werden");


        int[] zufallswerte = new int[101];
        int index;
        for (index = 0; index < 100; index++) {
            zufallswerte[index] = random.nextInt(0, 100);
            System.out.println(zufallswerte[index]);


        }
    }
}