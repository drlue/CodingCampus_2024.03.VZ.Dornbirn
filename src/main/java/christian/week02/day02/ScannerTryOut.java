package christian.week02.day02;

import java.util.Scanner;

public class ScannerTryOut {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getStringFromInput("Gib deinen Namen ein: ");
        int age = getIntFromInputV3("Gib dein Alter ein: ", 0, 120);
        System.out.printf("Hallo %s! Du bist %d Jahre alt!",text, age);
    }

    public static String getStringFromInput(String message) {
        String result;
        System.out.print(message);
        result = sc.nextLine();

        return result;
    }

    public static int getIntFromInputV1(String message) {
        int result = 0;
        System.out.print(message);
        if (sc.hasNextInt()) {
            result = sc.nextInt();

        }
        return result;
    }

    public static int getIntFromInputV2(String message, int min, int max) {
        int result = 0;
        boolean resultfin = false;
        while (resultfin == false) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                if (result >= min && result <= max) {
                    resultfin = true;
                } else {
                    System.out.printf("Bitte gib eine Zahl zwischen %d und %d ein!\n", min, max);
                }
            } else {
                System.out.println("Bitte gib eine gültige Ganzzahl ein");
            }
            sc.nextLine();
        }
        return result;
    }

    public static int getIntFromInputV3(String message, int min, int max) {
        int result = Integer.MIN_VALUE;
        System.out.println(message);
        while (result < min || result > max) {

            while (sc.hasNextInt() == false) {
                System.out.printf("Bitte gib eine positive Ganzzahl zwischen %d und %d ein: ", min, max);
                sc.nextLine();
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < min || result > max) {
                System.out.printf("Bitte gib eine positive Ganzzahl zwischen %d und %d ein: ", min, max);
            }
        }
        return result;
    }
}