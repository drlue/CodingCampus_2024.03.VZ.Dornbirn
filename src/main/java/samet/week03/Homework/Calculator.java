package samet.week03.Homework;

import samet.week02.day02.UserInputTest;

import java.util.Scanner;

public class Calculator {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        double number1;
        double number2;
        String calculation;
        Scanner sc = new Scanner(System.in);

        boolean isCalculating = true;
        while (isCalculating) {
            System.out.println("Gib bitte die erste Zahl deiner Rechnung ein!");
            number1 = scanner.nextDouble();
            System.out.println("Wähle deinen Operator? (+,-,*,/");
            calculation = scanner.next();
            System.out.println("Gib bitte die zweite Zahl deiner Rechung ein!");
            number2 = scanner.nextDouble();

            switch (calculation) {
                case "+":
                    System.out.println("Ergebniss  deiner Recnung \n (number1 + number2)");
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println("Ergebniss  deiner Recnung \n (number1 - number2)");
                    System.out.println(number1 - number2);
                    break;
                case "*":
                    System.out.println("Ergebniss  deiner Recnung \n (number1 * number2)");
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    System.out.println("Ergebniss  deiner Recnung \n (number1 / number2)");
                    System.out.println(number1 / number2);
                default:
                    System.out.println("Operator ist ungültig");


            }
            String additional = UserInputTest.getTextFromConsole("Willst du noch etwas berechnen\n Ja || Nein");
            if (additional.equals("Ja")) {
                System.out.println("Die Rechnung geht weiter!");

            } else {
                isCalculating = false;
            }


        }


    }
}
