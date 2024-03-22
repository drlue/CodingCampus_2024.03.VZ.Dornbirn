package irem.week04;

import java.util.Random;

public class BubblesortMitStringsExtended {


    public static void main(String[] args) {

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};

        boolean alpha = true;
        boolean  isAsc = false;

        bubbleSortExtended(names, alpha, isAsc);
        System.out.println("Sort by" + (alpha ? "Alpabetical" : "lenght") + " " + (isAsc ? "ascanding" : "descanding"));

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
        }else{
            BubblesortMitStrings.sortLengthDesc(names);
        }

    }
}

