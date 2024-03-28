package demian.week05.day02;

import data.Texts;

import java.util.Arrays;

public class SucheHesse {
    public static void main(String[] args) {

        //AUFGABE: Verwende für folgende Aufgabe den Text in data.Texts.HESSE.
        //
        //Wie oft kommt das Wort "Hesse" in folgendem Text vor? An welchen Stellen?
        //
        //Knobelaufgabe: Gibt es eine einfache Lösung die die Anzahl der Vorkommnisse in einer Zeile ermittelt?

        String Hesse = Texts.HESSE;
        System.out.println("Wie oft kommt das Wort \"Hesse\" in folgendem Text vor? An welchen Stellen?");
        String[] Hessestring = Hesse.split(" ");
        int count = 0;
        for (int idx = 0; idx < Hessestring.length; idx++) {
            if (Hessestring[idx].equals("Hesse")) {
                count++;
                System.out.println("Vorkommnis an Stelle: " + idx);
            }
        }
        System.out.println("Anzahl der Vorkommnisse: " + count);

        System.out.println("\n\nVorkommnisse pro Zeile: ");
        String[] allrows = Hesse.split("\n");
        int newcounter = 0;
        for (int currentROW = 0; currentROW < allrows.length; currentROW++) {
            String[] currentrowSplitBYspaces = allrows[currentROW].split(" ");
            System.out.print("Zeile " + currentROW + " Vorkommnisse: ");
            for (int idx = 0; idx < currentrowSplitBYspaces.length; idx++) {
                if (currentrowSplitBYspaces[idx].equals("Hesse")){
                    newcounter++;
                }
            }
            System.out.println(newcounter);
            newcounter = 0;
        }
    }
}
