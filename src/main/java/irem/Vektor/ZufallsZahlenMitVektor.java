package irem.Vektor;

import java.util.Random;
import java.util.Vector;

public class ZufallsZahlenMitVektor {

    public static void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> zufallsZahlen = new Vector<Integer>();

        for (int i = 0; i < 20; i++) {
            zufallsZahlen.add(rand.nextInt(0, 100));
        }
        System.out.println("Zufallszahlen:");
        System.out.println(zufallsZahlen);
        int countEven = geradeZahlen(zufallsZahlen);
        System.out.println("Es giebt" + countEven + "gerade Zahlen hier ");
        System.out.println();
        int countUnEven = ungeradeZahlen(zufallsZahlen);
        System.out.println("Es giebt" + countUnEven + "gerade Zahlen hier ");
    }
// gaht mit fori schleife oder mit for schleife
    public static int geradeZahlen(Vector<Integer> zufallsZahlen) {
        int count = 0;
        for (int i = 0; i < zufallsZahlen.size(); i++) {
            if (zufallsZahlen.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int ungeradeZahlen(Vector<Integer> zufallsZahlen) {
        int count = 0;
        for (int i = 0; i < zufallsZahlen.size(); i++) {
            if (zufallsZahlen.get(i) % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static int kleinsteZahl(Vector <Integer> zufallsZahlen) {
        int minNumber = 0;
        for (int i = 0; i < zufallsZahlen.size(); i++) {
        }
        return minNumber;
    }
}
