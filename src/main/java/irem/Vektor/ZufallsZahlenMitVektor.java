package irem.Vektor;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class ZufallsZahlenMitVektor {

    public static void main(String[] args) {
        Random rand = new Random();
        Vector<Integer> zufallsZahlen = new Vector<Integer>();
        for (int i = 0; i < 20; i++) {
            zufallsZahlen.add(rand.nextInt(100));
        }
        System.out.println("Zufallszahlen:");
        System.out.println(zufallsZahlen);
        int countEven = geradeZahlen(zufallsZahlen);
        System.out.println("Es giebt " + countEven + " gerade Zahlen hier ");
        System.out.println();
        int countUneven = ungeradeZahlen(zufallsZahlen);
        System.out.println("Es gibt " + countUneven + " ungerade Zahlen hier.");
        System.out.print("Dies ist die kleinste Zahl: ");
        System.out.println(kleinsteZahl(zufallsZahlen));
        System.out.println();
        int countMax = grossteZahl(zufallsZahlen);
        System.out.println("Es giebt " + countMax + " grosste Zahl wird ausgegeben");
        System.out.println();
        absteigendZahl(zufallsZahlen);
        //System.out.println("Es giebt " + countAbsteigend + " absteigende Zahl wird ausgegeben");
        System.out.println(zufallsZahlen);
        System.out.println();
        int countLosen = loscheUngeradeZahlen(zufallsZahlen);
        System.out.println("Es giebt " + countLosen + " losche alle ungeraden Zahlen");
    }

    // geht mit fori schleife oder mit for schleife
    public static Integer geradeZahlen(Vector<Integer> vector) {
        int count = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static Integer ungeradeZahlen(Vector<Integer> vector) {
        int count = 0;
        for (Integer value : vector) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static Integer kleinsteZahl(Vector<Integer> vector) {
        Integer minNumber = Integer.MAX_VALUE;
        for (Integer value : vector) {
            if (value < minNumber) {
                // TODO ???
            }
        }
        return minNumber;
    }

    public static Integer grossteZahl(Vector<Integer> vector) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) > maxNumber) {
                maxNumber = vector.get(i);
            }
        }
        return maxNumber;
    }

    public static Vector<Integer> absteigendZahl(Vector<Integer> vector) {
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int index = 1; index < vector.size(); index++) {
                if (vector.get(index) > vector.get(index - 1)) {
                    Integer temp = vector.set(index - 1, vector.get(index));
                    vector.set(index, temp);
                    sorted = true;
                }
            }
        }
        return vector;
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
