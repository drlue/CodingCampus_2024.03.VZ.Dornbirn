package demian.week03.day01;

import gyula.week02.ArrayExample;

import java.util.Arrays;
import java.util.Random;

public class AufgabeRandomNumberArray {
    public static void main(String[] args) {

        // Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.
        // 1. Gib es mit Hilfe einer foreach-Schleife aus.
        // 2. Gib es mit Hilfe einer fori-Schleife aus. Das Ziel ist eine identische Ausgabe, wie Arrays.toString()
        // 3. Gib den zweiten, fünften und zehnten Wert des Arrays aus.
        // 4. Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.

        Random random = new Random();

        int[] zufallszahlenARRAY = new int[5];
        for (int element = 0; element < zufallszahlenARRAY.length; element++) {
            int randomnumber = random.nextInt(100);
            zufallszahlenARRAY[element] = randomnumber;
        }
        System.out.print("Zufallszahlenarray: ");
        System.out.println(Arrays.toString(zufallszahlenARRAY));

        // Unteraufgabe 1:
        System.out.println("Unteraufgabe 1: Ausgabe mittels foreach Schleife");
        for (int ausgabe : zufallszahlenARRAY) {
            System.out.println(ausgabe);
        }

        // Unteraufgabe 2:


    }
}
