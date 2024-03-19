package demian.week04.day01;

import java.util.Arrays;

public class BubblesortMitStringsUndCharacterIndex {

    public static void main(String[] args) {

        //AUFGABE:Verwende den aus der vorhergehenden Aufgabe gegebenen String[] ,
        // sortiere ihn mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
        // Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
        // Der Aufruf und die Ausgabe erfolgt in der main Methode.
        // Die Methode soll nun zusätzlich zum String[] Parameter einen weiteren int als Parameter erhalten.
        // Dieser int steht für den Index des char im String , nach dem sortiert werden soll.
        // Das bedeutet: von "apfel" wäre charAt(2) = "f" und von "Birne" "r".
        // Sortiere also nicht nach dem ersten Buchstabe wie in der Aufgabe zuvor,
        // sondern nach charAt(2), also nach dem 3. Buchstaben.

        // Einen char an einer bestimmten Stelle eines String erhälst du mit string.charAt(i),
        // oder auch mit string.toCharArray()[i], wobei das natürlich ineffizient ist,
        // wenn es öfter aufgerufen werden muss.

        //Prüfe zuerst ob die Sortierung nach dem gegebenen Index erfolgen kann.
        //Wenn der Index zu groß ist, mach eine entsprechende Ausgabe und sortiere nicht.

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println("Original: " + Arrays.toString(names));
        //Sortieren
        int buchstabenposition = 6;
        sortNamesLexDEC(names,buchstabenposition);
        System.out.println("Lexografisch sortiert nach dem " + (buchstabenposition +1) + "ten Buchstaben: " + Arrays.toString(names));

    }

    public static String[] sortNamesLexDEC(String[] liste, int posCHAR) {
        boolean swap = true;
        int rounds = 0;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < liste.length - 1; idx++) {
                if (liste[idx].charAt(posCHAR) > liste[idx+1].charAt(posCHAR)) {
                    String temp = liste[idx];
                    liste[idx] = liste[idx + 1];
                    liste[idx + 1] = temp;
                    swap = true;
                }
            }
            rounds++;
        }
        return liste;
    }
}
