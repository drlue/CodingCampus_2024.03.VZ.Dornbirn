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

        String[] Hessestring = Hesse.split(" ");
        int count = 0;
        for (int idx = 0; idx < Hessestring.length; idx++) {
            if (Hessestring[idx].equals("Hesse")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
