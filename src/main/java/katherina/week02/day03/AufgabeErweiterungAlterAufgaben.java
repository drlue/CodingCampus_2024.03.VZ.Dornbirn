package katherina.week02.day03;

import irem.week02.UserInput;
import katherina.week01.day04.AufgabeStrukturierteProgrammierungTag04;
import katherina.week01.day05.AufgabePrimitiveDateitypen;

import java.util.Scanner;

public class AufgabeErweiterungAlterAufgaben {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wir berechnen Fakultäten!");
        int zahl = wertEinlesen("Wovon soll die Fakultät berechnet werden?", 1, 50);
        System.out.println(AufgabePrimitiveDateitypen.faktorial1(zahl));
        System.out.println();
        System.out.println("Wir erschaffen Rhomben!");
        String text = UserInput.getTextFromConsole("Gib mindestens ein Zeichen ein: ");
        int size = UserInput.getIntFromConsole("Wie groß soll der Rhombus werden?", 3, 50);
        AufgabeStrukturierteProgrammierungTag04.printRhombus(text, size);

    }

    public static int wertEinlesen(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int result = Integer.MIN_VALUE;
        while (result < mindestwert || result > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Das kann ich nicht faktorieren. Gib mir eine Zahl!");
                sc.nextLine();
                System.out.print(message);
            }
            //Wird eine Ganzzahl eingegeben, ist alles tutti. Ansonsten wird die Fehlermeldung gedruckt.
            result = sc.nextInt();
            sc.nextLine();
            if (result < mindestwert || result > maximalwert) {
                System.out.printf("Du musst mir schon was geben - aber nicht zu viel! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return result;
    }


}
