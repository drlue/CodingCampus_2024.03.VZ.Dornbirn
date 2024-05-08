package at.digitalcampus.codingcampus.repetition.excercise1;

import java.util.Scanner;

public class InputMain {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Text-User-input anfragen und einlesen:
        String userTextInput = userTextInput();
        //Messag an User:
        System.out.printf("%sWie oft soll der Text ausgegeben werden?%n%s", ConsoleColors.BLUE, ConsoleColors.RESET);
        //Zahlen-User-Input einlesen:
        int userNumInput = userNumInput();
        //User Input ausdrucken:
        System.out.printf("%sAusgabe:%n%s", ConsoleColors.BG_WHITE, ConsoleColors.RESET);
        for (int i = 0; i < userNumInput; i++) {
            System.out.println(userTextInput);
        }
    }

    public static String userTextInput() {
        System.out.printf("%sBitte geben Sie einen Text ein%n==>%s", ConsoleColors.BLUE, ConsoleColors.RESET);
        String userinput = sc.nextLine();
        System.out.println("Ihr Input lautet: " + userinput);
        return userinput;
    }

    public static int userNumInput() {
        int zahl = 0;
        int counter = 0;
        //Solange eine Zahl kleiner oder gleich Null eingegeben wird soll erneut nach einer Zahl gefragt werden
        while (zahl <= 0) {
            //Farbwechsel der Nachricht an den User bei Fehleingabe:
            if (counter <= 0) {
                System.out.printf("%s(Die Zahl muss größer 0 sein. Bitte geben Sie eine positive Zahl ein%n===>%s", ConsoleColors.BLUE, ConsoleColors.RESET);
            } else {
                System.out.printf("%s(Die Zahl muss größer 0 sein. %s Bitte geben Sie eine positive Zahl ein%n===>%s", ConsoleColors.RED, ConsoleColors.BLUE, ConsoleColors.RESET);
            }
            //Immer wenn etwas anderes wie eine Zahl eingegeben wird soll der Scanner diesen Token überspringen
            while (!sc.hasNextInt()) {
                System.out.printf("%sDas ist keine gültige Zahl.%s Bitte versuchen Sie es erneut%n===>%s", ConsoleColors.RED, ConsoleColors.BLUE, ConsoleColors.RESET);
                sc.next(); // überspringt die nicht-zahl
            }
            zahl = sc.nextInt();
            counter++; //Zählt die Anzahl der Usereingaben
        }
        return zahl;
    }

}
