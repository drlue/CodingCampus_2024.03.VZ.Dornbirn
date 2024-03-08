package irem.week02;

import java.util.Scanner;

public class Taschenrechner {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double zahl1;
        double zahl2;
        String operation;
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Gieb eine zahl ein");
            zahl1 = scanner.nextDouble();
            System.out.println("Gieb die Operation ein (+, -, *, /,");
            operation = scanner.next();
            System.out.println("Gieb die zweite zahl ein");
            zahl2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println("Ergebniss: \n, (" + zahl1 + " + " + zahl2 + ") ");
                    System.out.println(zahl1 + zahl2);
                    break;
                case "-":
                    System.out.println("Ergebniss: \n, (zahl1 - zahl2)");
                    System.out.println(zahl1 - zahl2);
                    break;
                case "*":
                    System.out.println("Ergebniss: \n, (zahl1 * zahl2)");
                    System.out.println(zahl1 * zahl2);
                    break;
                case "/":
                    System.out.println("Ergebniss: \n, (zahl1 / zahl2) ");
                    System.out.println(zahl1 / zahl2);
                default:
                    System.out.println("Operator nicht gültig");
            }

            String wahl = UserInput.getTextFromConsole("Möchtesn sie noch etwas Rechnen \n Ja || Nein");
            if (wahl.equals("Ja")) {
                System.out.println("Weiterrechnen");
            } else {
                isRunning = false;

            }

        }
    }
}


