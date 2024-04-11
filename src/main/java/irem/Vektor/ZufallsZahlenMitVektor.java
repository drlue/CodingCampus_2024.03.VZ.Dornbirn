package irem.Vektor;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class ZufallsZahlenMitVektor {

    public static void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> zufallsZahlen = new Vector<Integer>();
        for (int i = 0; i < 20; i++) {
            zufallsZahlen.add(rand.nextInt( 100));
        }
        System.out.println("Zufallszahlen:");
        System.out.println(zufallsZahlen);
        int countEven = geradeZahlen(zufallsZahlen);
        System.out.println("Es giebt " + countEven + " gerade Zahlen hier ");
        System.out.println();
        int countUnEven = ungeradeZahlen(zufallsZahlen);
        System.out.println("Es giebt " + countUnEven + " ungerade Zahlen hier ");
        int countMin = kleinsteZahl(zufallsZahlen);
        System.out.println("Es giebt " + countMin + " kleinste Zahl wird ausgegeben");
        System.out.println();
        int countMax = grossteZahl(zufallsZahlen);
        System.out.println("Es giebt " + countMax + " grosste Zahl wird ausgegeben");
        System.out.println();
        int countAbsteigend = absteigendZahl(zufallsZahlen);
        System.out.println("Es giebt " + countAbsteigend + " absteigende Zahl wird ausgegeben");
        System.out.println();
        int countLosen = loscheUngeradeZahlen(zufallsZahlen);
        System.out.println("Es giebt " + countLosen + " losche alle ungeraden Zahlen");
    }
    // geht mit fori schleife oder mit for schleife
    public static int geradeZahlen(Vector<Integer> zufallsZahlen) {
        int count = 0;
        for (int i = 0; i < zufallsZahlen.size(); i++) {
            if (zufallsZahlen.get(i) % 2 == 0) {
                count++;
                System.out.println();
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

    public static int kleinsteZahl(Vector<Integer> zufallsZahlen) {
        int minNumber = 0;
        for (int i = 0; i < zufallsZahlen.size(); i++) {
        }
        System.out.println();
        return minNumber;

    }

    public static int grossteZahl(Vector<Integer> zufallsZahlen) {
        int maxNumber = 0;
        for (int i = 0; i < zufallsZahlen.size(); i++) {
            if (zufallsZahlen.get(i) > maxNumber) {
                maxNumber = zufallsZahlen.get(i);
            }
        }
        return maxNumber;
    }

    public static int absteigendZahl(Vector<Integer> zufallsZahlen) {
        //mit bubblesort
        int absteigendZahl = 0;
        for (int i = 0; i < zufallsZahlen.size() - 1; i++) {
            for (int j = 0; j < zufallsZahlen.size() - i - 1; j++) {
                if (zufallsZahlen.get(j) < zufallsZahlen.get(j + 1)) {

                    // Tausche Elemente, wenn das aktuelle Element kleiner als das nächste ist
                    int temp = zufallsZahlen.get(j);
                    zufallsZahlen.set(j, zufallsZahlen.get(j + 1));
                    zufallsZahlen.set(j + 1, temp);
                }
            }
        }
        return absteigendZahl;
    }
    public static int loscheUngeradeZahlen(Vector<Integer> zufallsZahlen) {
        int loscheUngeradeZahlen = 0;
        Iterator<Integer> iterator = zufallsZahlen.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove(); // Ungerade Zahl entfernen
            }
        }
        return loscheUngeradeZahlen;
    }
}
