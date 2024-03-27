package irem.HU;

import java.util.Scanner;

public class AufgabeInput1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = "";
        int anzahl = 0;

        // Eingabeaufforderung für den Text
        while (text.isEmpty()) {
            System.out.println("Bitte geben Sie einen Text ein:");
            text = scanner.nextLine().trim();
        }
        // Eingabeaufforderung für die Anzahl
        while (true) {
            System.out.println("Wie oft soll der Text ausgegeben werden:");
            if (scanner.hasNextInt()) {
                anzahl = scanner.nextInt();
                break; // Gültige Zahl erhalten, Schleife verlassen
            } else {

                System.out.println("Das ist keine gültige Zahl. Bitte versuchen Sie es erneut.");
                scanner.next(); // Ignoriere die ungültige Eingabe
            }
        }
        // Ausgabe des Textes
        for (int i = 0; i < anzahl; i++) {
            System.out.println(text);
        }

    }
}
