package katherina.week02.day04;

import irem.week02.UserInput;

import java.util.Scanner;

public class TaschenrechnerWeiterrechnen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean weiterrechnen = false;
        boolean antwort = false;
        System.out.println("Ich bin ein Taschenrechner. Bitte verwende mich!");
        do {
            do {
                float zahl = floatSchnappen("Bitte gib eine Zahl ein:");
                System.out.println("Das ist eine wunderbare Zahl. Was möchtest du nun damit tun?\n" +
                        "1) Etwas addieren (+),\n" +
                        "2) Etwas substrahieren(-),\n" +
                        "3) Etwas multiplizieren (*)\n" +
                        "4) Etwas dividieren (/)\n");
                int wahl = wahlEinlesen("Bitte wähl nun: ", 1, 4);
                if (wahl == 1) {
                    System.out.println("Addition! Gute Wahl.");
                    float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Wie viel möchtest du addieren?");
                    System.out.printf("Die Summe aus %f und %f beträgt: ", zahl, operator);
                    System.out.println(zahl + operator);
                } else if (wahl == 2) {
                    System.out.println("Substraktion! Super Wahl.");
                    float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Wie viel möchtest du substrahieren?");
                    System.out.printf("Die Differenz aus %f und %f beträgt: ", zahl, operator);
                    System.out.println(zahl - operator);
                } else if (wahl == 3) {
                    System.out.println("Multiplikation! Super Wahl.");
                    float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Womit möchtest du multiplizieren?");
                    System.out.printf("Das Produkt aus %f und %f beträgt: ", zahl, operator);
                    System.out.println(zahl * operator);
                } else {
                    System.out.println("Division! Super Wahl.");
                    float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Durch was möchtest du dividieren?");
                    System.out.printf("Der Quotient aus %f und %f beträgt: ", zahl, operator);
                    System.out.println(zahl / operator);
                }
                double zwischenErgebnis = zahl;
                System.out.println("Möchtest du mit dieser Zahl weiterrechnen? (j/n) ");
                String reaktion = UserInput.getTextFromConsole("Antworte jetzt! ");
                if (reaktion.equals("j")) {
                    System.out.println("Was möchtest du mit dem Ergebnis tun?\n" +
                            "1) Etwas addieren (+),\n" +
                            "2) Etwas substrahieren(-),\n" +
                            "3) Etwas multiplizieren (*)\n" +
                            "4) Etwas dividieren (/)\n");
                    int wahlRepeat = wahlEinlesen("Bitte wähle nun: ", 1, 4);
                    if (wahlRepeat == 1) {
                        System.out.println("Addition! Gute Wahl.");
                        float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Wie viel möchtest du addieren?");
                        System.out.printf("Die Summe aus %f und %f beträgt: ", zahl, operator);
                        System.out.println(zwischenErgebnis + operator);
                    } else if (wahlRepeat == 2) {
                        System.out.println("Substraktion! Super Wahl.");
                        float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Wie viel möchtest du substrahieren?");
                        System.out.printf("Die Differenz aus %f und %f beträgt: ", zahl, operator);
                        System.out.println(zwischenErgebnis - operator);
                    } else if (wahlRepeat == 3) {
                        System.out.println("Multiplikation! Super Wahl.");
                        float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Womit möchtest du multiplizieren?");
                        System.out.printf("Das Produkt aus %f und %f beträgt: ", zahl, operator);
                        System.out.println(zwischenErgebnis * operator);
                    } else {
                        System.out.println("Division! Super Wahl.");
                        float operator = TaschenrechnerWeiterrechnen.floatSchnappen("Durch was möchtest du dividieren?");
                        System.out.printf("Der Quotient aus %f und %f beträgt: ", zahl, operator);
                        System.out.println(zwischenErgebnis / operator);
                        weiterrechnen = true;
                    }
                } else if (reaktion.equals("n")) {
                    weiterrechnen = false;
                } else {
                    System.out.println("Dies ist keine gültige Eingabe. Bitte tippe j oder n ein!");
                }

            }
            while (weiterrechnen);


            System.out.println("Möchtest du generell noch etwas ausrechen? (j/n) ");
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
        System.out.println("Auf Wiedersehen!");
    }

    public static float floatSchnappen(String message) {
        System.out.print(message);
        while (!sc.hasNextFloat()) {
            System.out.println("Ungültige Eingabe!");
            sc.nextLine();
            System.out.print(message);
        }
        float zahl = sc.nextFloat();
        sc.nextLine();
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

