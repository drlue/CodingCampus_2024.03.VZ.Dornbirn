package samet.week02.day04;


import samet.week01.day01.Methoden;
import samet.week02.day02.UserInputTest;

import java.util.Scanner;

public class Aufgabemenu {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Willkommen bei meinen Aufgaben!\nWasmöchten Sie zeichnen?\n1.Quader\n2.Dreieck\n3.Leere Quader\nBitte wählen Sie nun?");
        boolean antwort = false;
        do {

        int auswahl = symbolWahl("Bitte wählen Sie nun?", 1, 3);
        if (auswahl == 1) {
            System.out.println("Der Quader, Super !");
            String ausgabe = UserInputTest.getTextFromConsole("Welches Zeichen soll verwendet werden?");
           int size = UserInputTest.getIntFromConsole("Wie groß soll der Quader werden?",5,10);
            Methoden.printSquare(ausgabe,size);
        } else if (auswahl == 2) {
            System.out.println("Das Dreieck, Toll !");
            String ausgabe = UserInputTest.getTextFromConsole("Welches Zeichen soll verwendet werden?");
            UserInputTest.getIntFromConsole("Wie groß soll das Dreieck werden?", 5, 10);
            Methoden.printTriangle(ausgabe, 10);
        } else if (auswahl == 3) {
            System.out.println("Der leere Quader, Okkkk!");
            String ausgabe = UserInputTest.getTextFromConsole("Welches Zeichen soll verwendet werden?");
            UserInputTest.getIntFromConsole("Wie groß soll der leere Quader werden?", 5, 10);
            Methoden.printEmptySquare(ausgabe, 10);


        }
        System.out.println("Möchten Sie noch etwas Zeichnen? (j/n)");
        String weiter = UserInputTest.getTextFromConsole("Geben sie Ihre antwort ein!");
        if (weiter.equals("j")) {
            antwort = true;
        } else if (weiter.equals("n")) {
            antwort = false;
        } else {
            System.out.println("Bitte nur j oder n auswählen!");

        }

        } while (antwort) ;
    }

    public static int symbolWahl(String message, int minValue, int maxValue) {

        int auswahl = Integer.MIN_VALUE;
        while (auswahl < minValue || auswahl > maxValue) {
            while (!scanner.hasNextInt()) {
                System.out.println("Hello, es ist keine Zahl...");
                scanner.nextLine();
                System.out.print(message);
            }
            auswahl = scanner.nextInt();
            scanner.nextLine();
            if (auswahl < minValue || auswahl > maxValue) {
                System.out.println("Bitte geben Sie einen Wert zwischen " + minValue + " und " + maxValue + " ein");
                System.out.print(message);
            }
        }
        return auswahl;

    }


}
