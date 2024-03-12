package demian.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    public static void main(String[] args) {

        // Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.
        // 1. Gib es mit Hilfe einer foreach-Schleife aus.
        // 2. Gib es mit Hilfe einer fori-Schleife aus. Das Ziel ist eine identische Ausgabe, wie Arrays.toString()
        // 3. Gib den zweiten, fünften und zehnten Wert des Arrays aus.
        // 4. Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.

        Random random = new Random();

        int[] zufallszahlenARRAY = new int[11];
        for (int idx = 0; idx < zufallszahlenARRAY.length; idx++) {
            zufallszahlenARRAY[idx] = random.nextInt(100);
        }
        System.out.print("Zufallszahlenarray: ");
        System.out.println(Arrays.toString(zufallszahlenARRAY));

        // Unteraufgabe 1:
        System.out.println("Unteraufgabe 1: Ausgabe mittels foreach Schleife");
        for (int ausgabe : zufallszahlenARRAY) {
            System.out.println(ausgabe);
        }

        // Unteraufgabe 2:
        System.out.println("Unteraufgabe 2: Ausgabe mittels fori Schleife");
        for (int idx = 0; idx < zufallszahlenARRAY.length; idx++) {
            int zahl = zufallszahlenARRAY[idx];
            System.out.println(zahl);
        }

        // Unteraufgabe 3:
        System.out.println("Unteraufgabe 3: Gib den zweiten, fünften und zehnten Wert des Arrays aus. ");
        for (int idx = 0; idx < zufallszahlenARRAY.length; idx++) {
            if (idx == 1 || idx == 4 || idx == 9) {
                int zahl = zufallszahlenARRAY[idx];
                System.out.println((idx + 1) + "er-Wert = " + zahl);
            }
        }

        // Unteraufgabe 4:
        System.out.println("Unteraufgabe 4: Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus");
        for (int idx = 0; idx < zufallszahlenARRAY.length; idx += 2) {
            System.out.print((idx) + "er-Wert:");
            System.out.println(zufallszahlenARRAY[idx]);
            
        }
    }

}

