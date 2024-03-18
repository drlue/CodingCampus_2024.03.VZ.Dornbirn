package demian.week04.day01;

import java.util.Arrays;

public class BubblesortMitStringsExtended {

    public static void main(String[] args) {

        // Verwende das aus der vorhergehenden Aufgabe gegebene String[]
        // String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula" };
        // und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
        // Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
        // Der Aufruf und die Ausgabe erfolgt in der main Methode.
        // Die Methode soll nun zusätzlich zum String[] Parameter einen weiteren boolean als Parameter erhalten.
        // Dieser boolean entscheidet, ob das String[] aufsteigend, oder absteigend sortiert wird.

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println("Original Liste: " + Arrays.toString(names));
        // Sortierung und Ausdruck sortierter Liste - Auf oder Absteigend je nach eigegebenen boolean parameter
        System.out.println("Sortierte Liste: " + Arrays.toString(sortNames(names, false)));
    }

    public static String[] sortNames(String[] liste, boolean sortierRICHTUNG) {
        boolean swap = true;
        int rounds = 0;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < liste.length - 1 - rounds; idx++) {
                if (sortierRICHTUNG) {
                    if (liste[idx].compareTo(liste[idx + 1]) < 0) {
                        String temp = liste[idx];
                        liste[idx] = liste[idx + 1];
                        liste[idx + 1] = temp;
                        swap = true;
                    }
                } else {
                    if (liste[idx].compareTo(liste[idx + 1]) > 0) {
                        String temp = liste[idx];
                        liste[idx] = liste[idx + 1];
                        liste[idx + 1] = temp;
                        swap = true;
                    }
                }
            }
            rounds++;
        }
        return liste;
    }
}
