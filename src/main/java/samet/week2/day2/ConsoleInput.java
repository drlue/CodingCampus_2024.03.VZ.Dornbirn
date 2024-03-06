package samet.week2.day2;

import java.util.Scanner;
import java.util.Random;

public class ConsoleInput {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {    //Aufgabe1 String einlesen
        String text = getTextFromConsole("Wie ist dein Name?");
        System.out.println("Hallo " + text + " freut mich dich kennen zu lernen!!");
        System.out.println("Das ist eine Zahl " + zahlEinlesen("Gib eine Zahl ein"));

    }

    //Aufgabe 1 String einlesen
    public static String getTextFromConsole(String message) {
        System.out.println(message);

        String text = scanner.nextLine();
        return text;
    }

    public static int zahlEinlesen(String message) {
        System.out.println(message);
        int i = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("Das war keine Zahl!");
            System.out.println(message);
            scanner.next();
        }

        i = scanner.nextInt();

        return i;

    }









}











