package demian.week04.day01;

import christian.week02.day05.Array;

import java.util.Arrays;

public class BubblesortMitStrings {

    public static void main(String[] args) {

        //AUFGABE: Verwende den gegebenen String[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
        // Sortiere zuerst nach der Länge der Namen, dann nach dem Alphabet.
        // Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
        // Der Aufruf und die Ausgabe erfolgt in der main Methode.

        //Sortiere die Namen nach Länge aufsteigend (Ascending)
        //Sortiere die Namen nach Länge absteigend (Descending)
        //Sortiere die Namen lexikographisch aufsteigend (Ascending)
        //Sortiere die Namen lexikographisch absteigend (Descending)

        //Tip.: Strings können mit der Instanz Methode compareTo der String Klasse verglichen werden: "a".compareTo("b")

        //String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula" };

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println("Ungeordnete Liste: " + Arrays.toString(names));
        //Namen Aufsteigend Sortieren
        nameSortASC(names);
        // Sortierte Liste ausdrucken:
        System.out.println("Aufsteigend geordnet nach Länge: " + Arrays.toString(names));
        // Namen Absteigend Sortieren und ausdrucken:
        System.out.println("Absteigend geordnet nach Länge: " + Arrays.toString(nameSortDEC(names)));
        //Namen lexografisch aufsteigend Sortieren und ausdrucken:
        System.out.println("Lexografisch aufsteigend geordnet: " + Arrays.toString(sortNamesLexASC(names)));
        //Namen lexografisch absteigend Sortieren und ausdrucken:
        System.out.println("Lexografisch absteigend geordnet: " + Arrays.toString(sortNamesLexDEC(names)));
    }

    //SORTIERUNG NACH LAENGE
    public static void nameSortASC(String[] namensliste) {
        boolean swap = true;
        int round = 0;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < namensliste.length - 1 - round; idx++) {
                if (namensliste[idx].length() > namensliste[idx + 1].length()) {
                    String temp = namensliste[idx];
                    namensliste[idx] = namensliste[idx + 1];
                    namensliste[idx + 1] = temp;
                    swap = true;
                }
            }
            round++;
        }
    }

    //SORTIERUNG NACH LAENGE
    public static String[] nameSortDEC(String[] liste) {
        boolean swap = true;
        int round = 0;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < liste.length - 1 - round; idx++) {
                if (liste[idx].length() < liste[idx + 1].length()) {
                    String temp = liste[idx + 1];
                    liste[idx + 1] = liste[idx];
                    liste[idx] = temp;
                    swap = true;
                }

            }
            round++;
        }
        return liste;
    }

    //SORTIERUNG NACH LEXOGRAFISCHER LAENGE

    public static String[] sortNamesLexASC(String[] liste) {
        int rounds = 0;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < liste.length - 1 - rounds; idx++) {
                //lexografisch sortieren:
                if (liste[idx].compareTo(liste[idx + 1]) > 0) {
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

    public static String[] sortNamesLexDEC(String[] liste) {
        boolean swap = true;
        int rounds = 0;
        while (swap) {
            swap = false;
            for (int idx = 0; idx < liste.length - 1; idx++) {
                if (liste[idx].compareTo(liste[idx + 1]) < 0) {
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
