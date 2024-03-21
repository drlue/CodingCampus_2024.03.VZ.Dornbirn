package katherina.week02.day04;

import irem.week02.UserInput;

import java.util.Scanner;

public class Taschenrechner {
    //Und außerdem "Taschenrechner extended" direkt mit.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean antwort = false;
        System.out.println("Ich bin ein Taschenrechner. Bitte verwende mich!");
        do {
            float zahl = zahlEinlesen("Bitte gib eine Zahl ein:", -999999999, 999999999);
            System.out.println("Das ist eine wunderbare Zahl. Was möchtest du nun damit tun?\n" +
                    "1) Etwas addieren (+),\n" +
                    "2) Etwas substrahieren(-),\n" +
                    "3) Etwas multiplizieren (*)\n" +
                    "4) Etwas dividieren (/)\n");
            int wahl = wahlEinlesen("Bitte wählen Sie nun: ", 1, 4);
            if (wahl == 1) {
                System.out.println("Addition! Gute Wahl.");
                int operator = UserInput.getIntFromConsole("Wie viel möchtest du addieren?", -999999999, 999999999);
                System.out.printf("Die Summe aus %n und %d beträgt: ",zahl,operator);
                System.out.println(zahl + operator);
            } else if (wahl == 2) {
                System.out.println("Substraktion! Super Wahl.");
                int operator = UserInput.getIntFromConsole("Wie viel möchtest du substrahieren?", -999999999, 999999999);
                System.out.printf("Die Differenz aus %n und %n beträgt: ",zahl,operator);
                System.out.println(zahl - operator);
            } else if (wahl == 3) {
                System.out.println("Multiplikation! Super Wahl.");
                int operator = UserInput.getIntFromConsole("Womit möchtest du multiplizieren?", -999999999, 999999999);
                System.out.printf("Das Produkt aus %n und %n beträgt: ",zahl,operator);
                System.out.println(zahl * operator);
            } else {
                System.out.println("Division! Super Wahl.");
                int operator = UserInput.getIntFromConsole("Durch was möchtest du dividieren?", -999999999, 999999999);
                System.out.printf("Der Quotient aus %n und %n beträgt: ",zahl,operator);
                System.out.println(zahl / operator);
            }
            System.out.println("Möchtest du weiterrechnen? (j/n) ");
            String reaktion = UserInput.getTextFromConsole("Antworte jetzt! ");
            if (reaktion.equals("j")) {
                antwort = true;
            } else if (reaktion.equals("n")) {
                antwort = false;
            } else {
                System.out.println("Dies ist keine gültige Eingabe. Bitte tippe j oder n ein!");
            }

        }
        while (antwort);
        System.out.print("Auf Wiedersehen!");
    }

    public static float zahlEinlesen(String message, float mindestwert, float maximalwert) {
        System.out.print(message);
        float zahl = Float.NEGATIVE_INFINITY;
        while (zahl < mindestwert || zahl > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Ungültige Eingabe!");
                sc.nextLine();
                System.out.print(message);
            }
            zahl = sc.nextInt();
            sc.nextLine();
            if (zahl < mindestwert || zahl > maximalwert) {
                System.out.printf("Du willst meine Grenzen übertreten! Gib eine Zahl zwischen %n und %n ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return zahl;
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
            wahl = sc.nextInt();
            sc.nextLine();
            if (wahl < mindestwert || wahl > maximalwert) {
                System.out.printf("Ich kann nur vier Rechenarten ausführen! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return wahl;
    }


}

