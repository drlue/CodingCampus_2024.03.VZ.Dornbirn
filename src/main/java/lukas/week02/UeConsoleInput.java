package lukas.week02;

import java.util.Random;
import java.util.Scanner;

public class UeConsoleInput {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println(rand.nextInt(5, 10));
        int origin = 5;
        int bound = 10;
        System.out.println(origin + rand.nextInt(bound - origin));

//        System.out.println("Aufgabe 1");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        String inputTxt = readStringFromConsole("Gib einen Text ein: ");
//        System.out.printf("inputTxt: %s \n", inputTxt);

        System.out.println("Aufgabe 2");
        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
        System.out.println();
        int inputInt = readIntFromConsole("Gib einen Integer ein: ");
        System.out.printf("inputInt: %s \n", inputInt);

    }

    public static String readStringFromConsole(String message) {
        System.out.print(message);
        return sc.nextLine();
    }


    public static int readIntFromConsole(String message) {
        return readIntFromConsole(message, 0, 100);
    }

    public static int readIntFromConsole(String message, int minValue, int maxValue) {
        int result = Integer.MIN_VALUE;
        while (result == Integer.MIN_VALUE) {
            System.out.print(message);
            try {
                result = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.printf("Bitte eine Zahl zwischen %d und %d eingeben \n", Integer.MIN_VALUE + 1, Integer.MAX_VALUE);
            }
        }
        return result;
    }
}
