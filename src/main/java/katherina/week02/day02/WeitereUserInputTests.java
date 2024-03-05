package katherina.week02.day02;

import java.util.Scanner;

public class WeitereUserInputTests {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = stringEinlesen("Füttere mich mit beliebigen Zeichen!");
        System.out.printf("Danke für den Text %s! Omnomnomnom!\nJetzt bin ich satt!\n", text);
        int zahl = zahlEinlesen("Nun füttere mich mit einer Zahl! ", 0, 100);
        System.out.printf("Danke für Zahl %d! Omnomnomnom!\nJetzt bin ich satt!\n", zahl);


    }

    public static String stringEinlesen(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }

    public static int zahlEinlesen(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int result = Integer.MIN_VALUE;
        while (result < mindestwert || result > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Das will ich nicht essen. Gib mir eine Zahl!");
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
