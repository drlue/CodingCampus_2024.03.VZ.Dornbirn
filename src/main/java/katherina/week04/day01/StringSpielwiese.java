package katherina.week04.day01;

import java.util.Scanner;

public class StringSpielwiese {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();

        System.out.println("== " + (word == word2));
        System.out.println("equals " + (word.equals(word2)));
//Aufgabenstellung fragt: Warum ist: word == word2 false, und word.equals(word2) true?
//Antwort: IntelliJ schlägt mir vor, den String-Vergleich mit == durch den Vergleich mit equals auf einen Klick zu ersetzen.
//Ich schließe daraus, dass es sich nicht um einen erlaubten/gültigen Operator für Strings handelt.



    }
}
