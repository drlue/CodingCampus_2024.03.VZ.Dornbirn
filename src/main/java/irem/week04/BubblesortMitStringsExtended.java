package irem.week04;

import java.util.Random;

public class BubblesortMitStringsExtended {

    static Random random = new Random();

    public static void main(String[] args) {

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};

        boolean alpha = false;
        boolean asc = true;

        bubbleSortExtended(names, alpha, asc);
        System.out.println("Sort by" + (alpha ? "Alpabetical" : "lenght") + " " + (asc ? "ascanding" : "descanding"));

        BubblesortMitStrings.printWithForI(names);
        System.out.println();
    }

    public static void bubbleSortExtended(String[] names, boolean alpha, boolean ascanding) {
        if (alpha && ascanding) {
            BubblesortMitStrings.sortAlphaAsc(names);
        } else if (alpha && !ascanding) {
            BubblesortMitStrings.sortAlphaDesc(names);
        } else if (!alpha && ascanding) {
            BubblesortMitStrings.sortLenghtAsc(names);
        }
        BubblesortMitStrings.sortLengthDesc(names);
    }
}

