package demian.week02.day04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AufgabeTaschenrechner {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //AUFGABE:

        // Erstelle einen Taschenrechner.
        // Lies mit Hilfe berühmten Scanners vom Benutzer zuerst einen float ein,
        // dann den Operator (+,-,*,^,/), dann wieder einen float ein.
        // Nach dem einlesen führe die gewünschte Rechenoperation aus.
        // Bei Fehleingaben egal ob bei den Zahlen oder beim Operator, soll erneut nachgefragt werden.

        System.out.println("=============================");
        System.out.println("======TASCHENRECHNER=========");
        System.out.println("=============================");
        System.out.println();
        System.out.print("Zahl eingeben===>");
        while (true) {
            try {
                float userInputFloat1 = scanner.nextFloat();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Keine Buchstaben, nur zahlen");
                scanner.nextLine();
                System.out.print("Zahl eingeben===>");

            } catch (InputMismatchException imm) {
                System.out.println("Achte darauf ein Komma(,) zu verwenden und keinen Punkt(.)");
                scanner.nextLine();
                System.out.print("Zahl eingeben===>");
            }
        }


    }
}
