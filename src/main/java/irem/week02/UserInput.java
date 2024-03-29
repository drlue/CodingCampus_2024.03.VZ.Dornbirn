package irem.week02;


import java.util.Scanner;

public class UserInput {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getTextFromConsole("Geben Sie Ihre Name ein ==> ");
        int age = getIntFromConsole("Geben Sie Ihre Alter ein ==> ", 0, 100);
        int shoe = getIntFromConsole("Geben Sie Ihre Schuhgröße ein ==> ", 18, 50);

        System.out.printf("Hello %s (%d) with %d shoe size!\n", text, age, shoe);
    }

    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }

    public static int getIntFromConsoleV1(String message) {
        System.out.print(message);

        int result = 0;
        if (sc.hasNextInt()) {
            result = sc.nextInt();
        }
        return result;
    }

    public static int getIntFromConsoleV2(String message) {
        System.out.print(message);

        int result = 0;
        if (sc.hasNextInt()) {
            result = sc.nextInt();
        } else {
            System.out.println("Hello, es ist keine Zahl...");
        }
        return result;
    }

    public static int getIntFromConsoleV3(String message) {
        System.out.print(message);

        int result = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Hello, es ist keine Zahl...");
            sc.nextLine();
            System.out.print(message);
        }
        result = sc.nextInt();
        sc.nextLine();
        return result;
    }

    public static int getIntFromConsole(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        boolean isResultValid = false;
        while (!isResultValid) {
            while (!sc.hasNextInt()) {
                System.out.println("Hello, es ist keine Zahl...");
                sc.nextLine();
                System.out.print(message);
            }

            result = sc.nextInt();
            sc.nextLine();
            if (result < minValue || result > maxValue) {
                System.out.printf("Bitte geben Sie einen Wert zwischen %d und %d!\n", minValue, maxValue);
                System.out.print(message);
            } else {
                isResultValid = true;
            }
        }
        return result;
    }

}



