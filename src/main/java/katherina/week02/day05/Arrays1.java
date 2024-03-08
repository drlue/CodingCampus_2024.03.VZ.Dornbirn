package katherina.week02.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int zahl = Arrays1.zahlEinlesen("Bitte gib die gewüschte Anzahl der Schubladen ein! ", 0, 1000);
        System.out.printf("Du hast nun %d Schubladen: ", zahl);
        int[] schublade = new int[zahl];
        for (int position = 0; position < schublade.length; position++) {
            schublade[position] = position + 1;
        }
        System.out.println(Arrays.toString(schublade));

        int[] gedrehteSchublade = new int[zahl];
        for (int position = 0; position < gedrehteSchublade.length; position++) {
            gedrehteSchublade[position] = gedrehteSchublade.length - position;
        }
        System.out.println(Arrays.toString(gedrehteSchublade));



    }

    public static int zahlEinlesen(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int zahl = Integer.MIN_VALUE;
        while (zahl < mindestwert || zahl > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Hier muss eine Zahl stehen!");
                sc.nextLine();
                System.out.print(message);
            }
            zahl = sc.nextInt();
            sc.nextLine();
            if (zahl < mindestwert || zahl > maximalwert) {
                System.out.printf("Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return zahl;
    }

}
