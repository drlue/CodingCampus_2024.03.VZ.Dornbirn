package demian.week05.day04;

import data.Texts;

import java.util.Scanner;

public class TextHervorheben {

    public static void main(String[] args) {

        // AUFGABE: Verwende für folgende Aufgabe den Text in data.Texts.HESSE.
        //
        //Bei der Ausgabe des Texts sollen alle Vorkommonisse von Hesse auf Uppercase (HESSE) gestellt werden. Verwende die replace() Funktion.
        //
        //Erweitere dein Programm um User Input, dass der User beliebige Worte auf Uppercase ändern kann.

        String hesse = Texts.HESSE;

        String hesseneu = hesse.replace("Hesse", "HESSE");

        System.out.println(hesseneu);

        Scanner sc = new Scanner(System.in);

        System.out.print("Welches Wort möchten Sie auf Uppercase ändern? ==>");
        String Wordtochange = sc.nextLine();
        hesseneu = hesseneu.replace(Wordtochange, Wordtochange.toUpperCase());
        System.out.println(hesseneu);

    }

}
