package katherina.week02.day02;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
    public static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int goal = random.nextInt(0, 100);
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\n Errate die Zahl zwischen 0 und 100!");
        int zahl = gerateneEingabe("Gib die Zahl nun ein:", 0, 100);
        while (goal < zahl || goal > zahl) {
            if (zahl < goal) {
                System.out.printf("Die Zahl ist zu klein. Versuche es erneut.\n");
                sc.nextLine();
                gerateneEingabe("Gib die Zahl nun ein:", 0, 100);
            } else if (goal < zahl) {
                System.out.printf("Die Zahl ist zu gross. Versuche es erneut!\n");
                sc.nextLine();
                gerateneEingabe("Gib die Zahl nun ein:", 0, 100);
            } /*else {
                System.out.printf("Du hast gewonnen!");
            }*/
        }
        System.out.printf("Du hast gewonnen!");
    }

    public static int gerateneEingabe(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int zahl = Integer.MIN_VALUE;
        while (zahl < mindestwert || zahl > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Hi, dies ist keine gültige Eingabe. Hier sind nur ganze Zahlen erlaubt.");
                sc.nextLine();
                System.out.print(message);
            }
            zahl = sc.nextInt();
            sc.nextLine();
            if (zahl < mindestwert || zahl > maximalwert) {
                System.out.printf("Bitte gib einen gültigen Wert zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return zahl;
    }
}
