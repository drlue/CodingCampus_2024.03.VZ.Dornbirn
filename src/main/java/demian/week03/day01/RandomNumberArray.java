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
        System.out.println("Unteraufgabe 2: Ausgabe mittels fori Schleife");
        for (int element = 0; element < zufallszahlenARRAY.length; element++) {
            int zahl = zufallszahlenARRAY[element];
            System.out.println(zahl);
        }

        // Unteraufgabe 3:
        System.out.println("Unteraufgabe 3: Gib den zweiten, fünften und zehnten Wert des Arrays aus. ");
        for (int element = 0; element < zufallszahlenARRAY.length; element++) {
            if (element == 1 || element == 4 || element == 9) {
                int zahl = zufallszahlenARRAY[element];
                System.out.println((element+1) + "er-Wert = " + zahl);
            }
        }

        // Unteraufgabe 4:
        System.out.println("Unteraufgabe 4: Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus");
        for (int element = 0; element < zufallszahlenARRAY.length; element++) {
            if (element % 2 != 0){
                int zahl = 0;
                zahl = zufallszahlenARRAY[element];
                System.out.print((element+1) + "er-Wert:");
                System.out.println(zahl);
            }
        }
    }

}

