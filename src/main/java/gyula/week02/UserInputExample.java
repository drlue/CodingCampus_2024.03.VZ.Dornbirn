package gyula.week02;

import java.util.Scanner;

public class UserInputExample {
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

    public static int getIntFromConsoleV4(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        while (result < minValue || result > maxValue) {
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
            }
        }
        return result;
    }

    public static int getIntFromConsoleV5(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        boolean resultReady = false;
        while (!resultReady) {
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
                resultReady = true;
            }
        }
        return result;
    }

    public static int getIntFromConsole(String message, int minValue, int maxValue) {
        int result = Integer.MIN_VALUE;
        while (result == Integer.MIN_VALUE) {
            System.out.print(message);
            String text = sc.nextLine();

            try {
                result = Integer.parseInt(text);
                if (result < minValue || result > maxValue){
                    System.out.printf("Bitte geben Sie einen Wert zwischen %d und %d!\n", minValue, maxValue);
                    result = Integer.MIN_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Hello, es ist keine Zahl...");
            }
        }
        return result;
    }

}
