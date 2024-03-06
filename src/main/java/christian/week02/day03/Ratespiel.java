package christian.week02.day03;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        rateSpiel();
    }

    public static int intReaderV1(String message, int min, int max) {
        int result = -1;
        System.out.print(message);
        boolean resultReady = false;
        while (resultReady == false) {

            if (sc.hasNextInt() == true) {
                result = sc.nextInt();
                if (result >= min && result <= max) {
                    resultReady = true;
                } else {
                    System.out.printf("Bitte gib eine positive Ganzzahl zwischen %d und %d ein!", min, max);
                }
            } else {
                System.out.printf("Bitte gib eine positive Ganzzahl zwischen %d und %d ein!", min, max);
            }
//            //Gyulas fix für Zeilen voll mit Leerzeichen
//            while (sc.hasNextLine()) {

            sc.nextLine();

        }
        return result;
    }


    public static void rateSpiel() {
        System.out.println("Willkommen zum super coolen Zahlen Ratespiel");
        System.out.println("Errate die Zahl zwischen 0 und 100");
        int randomNumber = rnd.nextInt(0, 101);
        System.out.println(randomNumber);
        int eingabe = intReaderV1("Bitte gib eine positive Ganzzahl ein", 0, 100);
        while (randomNumber != eingabe) {
            if (eingabe > randomNumber) {
                System.out.println("Die Zahl ist zu hoch!");
                eingabe = intReaderV1("Bitte gib eine positive Ganzzahl ein", 0, 100);
            } else if (eingabe < randomNumber) {
                System.out.println("Die Zahl ist zu niedrig!");
                eingabe = intReaderV1("Bitte gib eine positive Ganzzahl ein", 0, 100);
            } else {
                System.out.println("Etwas ist schief gelaufen");
            }
        }
        System.out.println("Du hast gewonnen! Das Spiel wird beendet!");
    }
}
