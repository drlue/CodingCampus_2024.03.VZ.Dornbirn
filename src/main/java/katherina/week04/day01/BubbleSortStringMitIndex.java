package katherina.week04.day01;

import static java.lang.Character.valueOf;
import static java.lang.Integer.parseInt;

public class BubbleSortStringMitIndex {

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        int sort = 3;
        BubbleSortString.printWithForI(names);
        System.out.println(">> Dies ist eine Liste unsortierter Namen. <<");
        System.out.println();
        bubblesortNachAlphaHoch(names, sort);
        System.out.println(">> Nach Alphabet sortiert, aufsteigend. <<");
        BubbleSortString.printWithForI(names);
        System.out.println();
        bubblesortNachAlphaRunter(names, sort);
        System.out.println(">> Nach Alphabet sortiert, absteigend. <<");
        BubbleSortString.printWithForI(names);
        System.out.println();
        System.out.println("Danke!");


    }

    public static void bubblesortNachAlphaHoch(String[] array, int sort) {

            for (int index = 0; index < array.length; index++) {
                for (int jane = 0; jane < array.length - index - 1; jane++) {
                    if (array[jane].length() > sort //Die Länge des Strings in Position "jane" muss größer sein als der Sortiertwert.
                            && (array[jane + 1].length() <= sort //Die Länge des Strings im Positionswert nach "jane" muss kleiner oder gleich groß wie der Sortierwert sein.
                            || array[jane].charAt(sort) > array[jane + 1].charAt(sort))) {//Die Zeichenzahl des Strings an der Position "jane" in der Länge "sort" ist größer als die an der nächsten Position.
                        String temp = array[jane];
                        array[jane] = array[jane + 1];
                        array[jane + 1] = temp;
                    }
                }
            }

    }

    public static void bubblesortNachAlphaRunter(String[] array, int sort) {
        for (int index = 0; index < array.length; index++) {
            for (int jane = 0; jane < array.length - index - 1; jane++) {
                if ((array[jane + 1].length() < array[jane].length() //Wenn die Länge des Strings in Position jane+1 kleiner ist als in Position jane.
                        && array[jane + 1].length() <= sort ) ||//UND  die Länge des Strings in Position jane+1 kleiner gleich dem Sortierwert ist
                    (array[jane].length() > sort //ODER Die Länge des Strings in Position jane größer als der Sortierwert ist
                            && array[jane].charAt(sort) < array[jane + 1].charAt(sort))) { //UND die Zeichenzahl des Strings an der Position "jane" in der Länge "sort"  größer ist als die an der nächsten Position.
                    String temp = array[jane];
                    array[jane] = array[jane + 1];
                    array[jane + 1] = temp;
                }
            }
        }
    }
}