package irem.week02;

import java.util.Scanner;

public class StringEinlesen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getTextFromConsole("Welcher Anime ist der beste ");
        System.out.printf("%s ist der beste Anime!\n", text);
    }
    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
}

}