package lukas.week02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = getStringFromConsole("Vorname ==> ");
        String lastName = getStringFromConsole("Nachname ==> ");
        int age = getIntFromConsole("Alter ==> ", 0, 120);
        int size = getIntFromConsole("Groeße [cm] ==> ", 100, 240);

        System.out.printf("Hallo %s %s! Du bist %d Jahre alt und %dcm gross!", firstName, lastName, age, size);

    }

    public static String getStringFromConsole(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int getIntFromConsole(String message, int minValue, int maxValue) {
        int result = minValue - 1;
        System.out.print(message);
        boolean valueOk = false;
        while (!valueOk) {
            while (!sc.hasNextInt()) {
                System.out.println("Bitte eine Zahl eingeben");
                sc.nextLine();
                System.out.print(message);
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < minValue || result > maxValue) {
                System.out.printf("Bitte eine Zahl zwischen %d und %d eingeben \n", minValue, maxValue);
                System.out.print(message);
            } else {
                valueOk = true;
            }

        }
        return result;
    }


    public static int getIntFromConsoleV1(String message, int minValue, int maxValue) {
        System.out.print(message);
        int result = Integer.MIN_VALUE;
        boolean inputOk = false;
        while (inputOk == false) {
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                sc.nextLine();
                if (result < minValue || result > maxValue) {
                    System.out.printf("Wert zw. %d und %d eingeben", minValue, maxValue);
                    System.out.print(message);
                } else {
                    inputOk = true;
                }
            } else {
                System.out.println("Keine Zahl!");
                System.out.print(message);
            }
        }
        return result;
    }

}

