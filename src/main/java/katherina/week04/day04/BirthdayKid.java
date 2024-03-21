package katherina.week04.day04;

//Aufgabe: Mein Geburtstag
//Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von SimpleDateFormat.parse() verarbeitet.
// Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
// Hierbei kann Calendar verwendet werden.

import java.util.Scanner;

public class BirthdayKid {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }



    public static int getNumberFromConsole(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int date = Integer.MIN_VALUE;
        while (date < mindestwert || date > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Hasi, dein Geburtstag ist doch wohl hoffenlich eine Ganzzahl. Also gib gefälligst auch eine ein.");
                sc.nextLine();
                System.out.print(message);
            }
            date = sc.nextInt();
            sc.nextLine();
            if (date < mindestwert || date > maximalwert) {
                System.out.printf("Ich bin weder ein Incel noch Excel, not everything is a date! Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return date;
    }
}
