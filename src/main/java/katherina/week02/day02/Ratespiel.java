package katherina.week02.day02;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
    public static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int goal = random.nextInt(0, 100);
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\n Errate die Zahl zwischen 0 und 100!");
        int zahl = ratezahl("Gib die Zahl nun ein:", 0, 100);
        if (goal == zahl) {
            System.out.printf("Du hast gewonnen!");
        } else {
            System.out.printf("Nicht gewonnen. HA-HA-HA-HA !!!!");
        }
    }

    public static int ratezahl(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int result = Integer.MIN_VALUE;
        while (result < mindestwert || result > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Hi, dies ist keine gültige Eingabe. Hier sind nur ganze Zahlen erlaubt.");
                sc.nextLine();
                System.out.print(message);
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < mindestwert || result > maximalwert) {
                System.out.printf("Bitte gib einen gültigen Wert zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return result;
    }
}
