package demian.week04.day01;

import java.util.Scanner;

public class BonuseStringVergleich {

    public static void main(String[] args) {

        // AUFGABE 1: Code testen und folgende Fragen beantworten:
        // WArum ist == false
        // Warum ist equals() true

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();

        // == wird als false ausgegeben weil word und word2 unterschiedliche Strings sind
        // und nur verglichen wird ob die selbe Speicheradresse vorliegt,
        // also ob es sich um den selben String handelt
        System.out.println("== "+(word == word2));
        // equals() wird als true ausgegeben weil die Inhalte der zwei unterschiedlichen Strings verglichen werden
        // da der Inhalt bei beiden "test" ist das Ergebnis des Vergleichs true
        System.out.println("equals "+(word.equals(word2)));
    }
}
