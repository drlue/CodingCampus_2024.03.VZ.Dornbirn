package irem.week02;

import java.util.Scanner;

public class ZahlEinlesen {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getTextFromConsole1("Welcher Anime ist der beste ");
        System.out.printf("%s ist der beste Anime!\n", text);
        int folge= getIntFromConsole2(" Welche Folge ist die beste Folge ");
    }


    public static String getTextFromConsole1(String message){
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }


    public static int getIntFromConsole2(String message) {
        System.out.print(message);

        int result = 0;
        if (sc.hasNextInt()) {
            result = sc.nextInt();
        }
        return result;
    }
}