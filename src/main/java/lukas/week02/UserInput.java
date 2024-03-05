package lukas.week02;

import java.util.Scanner;

public class UserInput {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String firstName = getStringFromConsole("Vorname ==> ");
        String lastName = getStringFromConsole("Nachname ==> ");
        int age = getIntFromConsole("Alter ==> ", 0,120);
        int size = getIntFromConsole("Groeße [cm] ==> ", 100, 240);

        System.out.printf("Hallo %s %s. Du bist %d Jahre alt und %dcm gross!", firstName, lastName, age, size );

    }

    public static String getStringFromConsole(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int getIntFromConsole(String message, int minValue, int maxValue) {
         int result = 0;
        System.out.print(message);
        while (!sc.hasNextInt()){
            System.out.println("Bitte eine Zahl eingeben");
            sc.nextLine();
            System.out.print(message);
        }
        result = sc.nextInt();
        //sc.nextLine();
        return result;
    }



}
