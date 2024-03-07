package katherina.week02.day03;

import irem.week02.UserInput;
import katherina.week01.day02AndDay03.AufgabeMethodenUndSchleifen;
import katherina.week01.day03.AufgabeMethodenUndSchleifenTeil2;

import java.util.Objects;
import java.util.Scanner;

public class AufgabeMenue {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean antwort = false;
        System.out.println("Willkommen bei meinen Aufgaben!\n Was möchten Sie zeichnen?\n" +
                "1) Quader,\n" +
                "2) Mittiges Dreieck,\n" +
                "3) Dreieck mit Spitze rechts oben");
        do {
            int wahl = wahlEinlesen("Bitte wählen Sie nun:", 1, 3);
            if (wahl == 1) {
                System.out.println("Der Quader! Gute Wahl");
                String text = UserInput.getTextFromConsole("Gib mindestens zwei Zeichen ein: ");
                int size = UserInput.getIntFromConsole("Wie groß soll der Quader werden?", 3, 50);
                AufgabeMethodenUndSchleifenTeil2.printemptySquare(text, size);
            } else if (wahl == 2) {
                System.out.println("Das mittige Dreieck! Ausgezeichnete Wahl");
                String text = UserInput.getTextFromConsole("Gib mindestens zwei Zeichen ein: ");
                int size = UserInput.getIntFromConsole("Wie groß soll das Dreieck werden?", 3, 50);
                AufgabeMethodenUndSchleifenTeil2.printTriangle(text, size);
            } else {
                System.out.println("Das Dreieck mit der Spitze rechts oben! Superbe Wahl");
                String text = UserInput.getTextFromConsole("Gib mindestens zwei Zeichen ein: ");
                int size = UserInput.getIntFromConsole("Wie groß soll das Dreieck werden?", 3, 50);
                AufgabeMethodenUndSchleifen.printTriangleTopRight(text, size);
            }
            System.out.println("Möchten Sie noch etwas zeichnen? (j/n) ");
            String reaktion = UserInput.getTextFromConsole("Antworten Sie jetzt! ");
            if (reaktion.equals("j")) {
                antwort = true;
            } else if (reaktion.equals("n")) {
                antwort = false;
            } else {
                System.out.println("Dies ist keine gültige Eingabe. Bitte tippe j oder n ein!");
            }
        } while (antwort == true);
        System.out.printf("Auf Wiedersehen!");
    }

    public static int wahlEinlesen(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int wahl = Integer.MIN_VALUE;
        while (wahl < mindestwert || wahl > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Ungültiger Menüpunkt! Wähle eine der Optionen!");
                sc.nextLine();
                System.out.print(message);
            }
            //Wird eine Ganzzahl eingegeben, ist alles tutti. Ansonsten wird die Fehlermeldung gedruckt.
            wahl = sc.nextInt();
            sc.nextLine();
            if (wahl < mindestwert || wahl > maximalwert) {
                System.out.printf("Ich kann nur drei Dinge zeichnen! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return wahl;
    }

}


