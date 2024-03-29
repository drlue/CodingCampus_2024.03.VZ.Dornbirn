package demian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayCrazyRange {
    public static void main(String[] args) {

        //AUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.

        Random random = new Random();

        int[] zufallszahlenARRAY = new int[10];
        for (int idx = 0; idx < zufallszahlenARRAY.length; idx++) {
            zufallszahlenARRAY[idx] = random.nextInt(-51, 51);
        }

        System.out.println("\nAUFGABE: Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus:\n");
        System.out.print("Zufallszahlen ARRAY: ");
        System.out.println(Arrays.toString(zufallszahlenARRAY));
        System.out.print("\nAusgabe mittels foreach Schleife: ");
        for (int zahl : zufallszahlenARRAY) {
            System.out.print(zahl);
            System.out.print(", ");
        }
        System.out.println("\n");

    }
}
