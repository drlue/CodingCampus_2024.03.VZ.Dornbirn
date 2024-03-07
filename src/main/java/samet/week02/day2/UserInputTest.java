package samet.week02.day2;

import java.util.Scanner;
import java.util.regex.Pattern;

// Example
public class UserInputTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getTextOnlyFromConsole("Wie heißt du? ");
        int age = getIntFromConsole("Wie alt bist du?", 0, 100);
        String textb = getTextOnlyFromConsole("Wie heißen deine Haustiere?");

        System.out.println("Hallo" + " " +text+" " +age+ " " +textb);
    }

    public static String getTextFromConsole(String message) {
        System.out.println(message);

        String text = scanner.nextLine();
        return text;
    }

    public static int getIntFromConsole(String message, int minValue, int maxValue) {
        System.out.println(message);

        int result = Integer.MIN_VALUE;
        while (result < minValue || result > maxValue) {
            while (!scanner.hasNextInt()) {
                System.out.println("Hello, es ist keine Zahl...");
                scanner.nextLine();
                System.out.print(message);
            }
            result = scanner.nextInt();
            scanner.nextLine();
            if (result < minValue || result > maxValue) {
                System.out.println ("Bitte geben Sie einen Wert zwischen " + minValue + " und " + maxValue + " ein");
                System.out.print(message);
            }
        }
        return result;
    }

    public static String getTextOnlyFromConsole(String message) {
        String text = "";
        while (text.isEmpty()) {
            System.out.println(message);
            text = scanner.nextLine();
            if (!Pattern.matches("[a-zA-Z ]*", text)) {
                text = "";
            }
        }
        return text;
    }

}
