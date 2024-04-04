package katherina.week01.day04;

import java.util.Scanner;

public class VerbessertesSchaltjahrscriptMitAbfrage {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(schaltjahr());
}
    public static boolean schaltjahr() {
        System.out.println("Hi! Mit diesem Programm kannst du prüfen, ob ein bestimmtes Jahr nach dem gregorianischen Kalender ein Schaltjahr ist.");
        int wert = insertYearHere("Welches Jahr möchtest du prüfen?", 1582, Integer.MAX_VALUE);
        try {
            return ((wert % 4 == 0) && (wert % 100 != 0) || (wert % 400 == 0));
        } finally {
            if (((wert % 4 == 0) && (wert % 100 != 0) || (wert % 400 == 0))){
                System.out.printf("Richtig, es handelt sich bei %d um ein Schaltjahr. ", wert);
            }else {
                System.out.printf("Es handelt sich bei %d nicht um ein Schaltjahr.", wert);
            }
        }
    }

    public static int insertYearHere(String message, int minvalue, int maxvalue) {
        System.out.print(message);
        int leapyear = Integer.MIN_VALUE;
        while (leapyear < minvalue || leapyear > maxvalue) {
            while (!sc.hasNextInt()) {
                System.out.println("Ungültige Eingabe! Schreibe eine Jahreszahl hin!");
                sc.nextLine();
                System.out.print(message);
            }
            leapyear = sc.nextInt();
            sc.nextLine();
            if (leapyear < minvalue || leapyear > maxvalue) {
                System.out.printf("Ich kann nur für die Zeiträume ausgeben, ob es ein Schaltjahr ist, in denen der gregorianische Kalender gültig ist! Gib eine Zahl zwischen %d und %d ein.\n", minvalue, maxvalue);
                System.out.print(message);
            }
        }
        return leapyear;
    }
}
