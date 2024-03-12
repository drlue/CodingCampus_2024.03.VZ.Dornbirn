package ardijanla.week02.day03;

import java.util.Random;
import java.util.Scanner;

public class uebungconsoleInput {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        stringEinlesen();
//        intEinlesen();
        rateSpiel();
    }


    public static void stringEinlesen() {

        System.out.print("Gebe einen String ein: ");
        String value = scanner.nextLine();
        System.out.println(value);
    }

    public static void intEinlesen() {

        System.out.println("Gebe einen Int ein: ");
        int value;

        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                System.out.println(value);
                break;
            } else {
                System.out.println("probiere es nochmal");
                scanner.next();
            }
        }
    }

    public static void rateSpiel() {
        Random rnd = new Random();
        int winNumber = rnd.nextInt(-1, 10);
        boolean won = false;
        int inputNumber;
        int trys = 5;

        System.out.println("Gib die Zahl nun ein:");
        inputNumber = scanner.nextInt();

        while (!won) {
            if (trys > 0) {
                trys--;
                if (inputNumber > winNumber) {
                    System.out.printf("Deine Zahl ist zu hoch noch %d versuche übrig \n", trys);
                    System.out.print(">>>");
                    inputNumber = scanner.nextInt();
                } else if (inputNumber < winNumber) {
                    System.out.printf("Deine Zahl ist zu niedrig noch %d versuche übrig \n", trys);
                    System.out.print(">>>");
                    inputNumber = scanner.nextInt();
                } else {
                    System.out.println("Super du hast gewonnen!");
                    won = true;
                }
            }
        }


    }
}
