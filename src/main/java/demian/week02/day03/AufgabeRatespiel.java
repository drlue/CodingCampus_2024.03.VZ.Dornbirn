package demian.week02.day03;

import java.util.Random;
import java.util.Scanner;

public class AufgabeRatespiel {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Aufgabe:
        // -Es soll eine beliebige Zahl zwischen 0 und 100 mittels new Random().nextInt(...) gewählt werden.
        // -Nun soll die Zahl durch Eingabe über die Konsole erraten werden.
        // -Ist die Zahl zu hoch oder zu niedrig, so soll diese Information ausgegeben werden.
        // -Wurde die Zahl getroffen, so ist das Spiel gewonnen und das Programm wird beendet.
        // -Wird keine Zahl eingegeben so darf das Programm nicht abstürzen und es soll erneut nach einer Zahl gefragt werden.

        Random random = new Random();
        //Random number between 0 and 100
        int randomNumber = random.nextInt(0, 101);
        System.out.println("PROGRAMMTEST ZUFALLSNUMMER =" + randomNumber);

        System.out.println("============================================= ");
        System.out.println("=================RATESPIEL=================== ");
        System.out.println("============================================= ");
        System.out.println();
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\n\nErrate die Zahl zwischen 0 und 100!");
        System.out.println();

        boolean resultOK = false;

        while (!resultOK) {
            System.out.print("BITTE HIER ZAHL EINGEBEN ==>");
            try {
                String userinput = sc.nextLine();
                int userinputNUM = Integer.parseInt(userinput);
                if (randomNumber == userinputNUM) {
                    System.out.println("GEWONNEN");
                    resultOK = true;
                } else {
                    if (userinputNUM > randomNumber) {
                        System.out.println("ZAHL zu HOCH");
                        System.out.println("VIEL GLUECK BEIM NAECHSTEN VERSUCH");
                    } else {
                        System.out.println("ZAHL zu NIEDERIG");
                        System.out.println("VIEL GLUECK BEIM NAECHSTEN VERSUCH");
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es wurde keine Zahl eingeben");
            }
        }
    }

}

