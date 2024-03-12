package lukas.week02;

import lukas.Helper;

import java.util.Random;
import java.util.Scanner;

public class UeConsoleInput {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

//        System.out.println(rand.nextInt(5, 10));
//        int origin = 5;
//        int bound = 10;
//        System.out.println(origin + rand.nextInt(bound - origin));

//        System.out.println("Aufgabe 1");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        String inputTxt = readStringFromConsole("Gib einen Text ein: ");
//        System.out.printf("inputTxt: %s \n", inputTxt);


//        System.out.println("Aufgabe 2");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        int inputInt = readIntFromConsole("Gib einen Integer ein: ");
//        System.out.printf("inputInt: %s \n", inputInt);

//        System.out.println("Aufgabe 3");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        guessNumberV1(0, 100);

//        System.out.println("Aufgabe 4a");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        calculateFakt();

//        System.out.println("Aufgabe 4b");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        calculatePiNilakantha();
//
//        System.out.println("Aufgabe 4c");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        calculateSqrt();

//        System.out.println("Aufgabe 5");
//        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
//        System.out.println();
//        menu();

        System.out.println("Aufgabe 6");
        lukas.week01.Ue02MethodenSchleifen.printChars("=", 20);
        System.out.println();
        //pocketCalc();
        pocketCalcOneRow();

//        String txt = "^";
//        if (txt.equals("^")) {
//            System.out.println(txt);
//        } else {
//            System.out.printf("%s  !=   ^", txt);
//        }

    }

    public static void guessNumber(int minVal, int maxVal) {
        int randomValue = rand.nextInt(minVal, maxVal + 1);
        int inputValue = Integer.MIN_VALUE;
        //AUSGABE
        System.out.println("Willkommen beim super coolen Ratespiel!");
        System.out.printf("Errate die Zahl zwischen %d und %d \n", minVal, maxVal);
        System.out.println("Gib die Zahl nun ein:");
        //LOGIK
        while (inputValue != randomValue) {
            inputValue = Helper.readIntFromConsole(">>>", minVal, maxVal);
            if (inputValue < randomValue) {
                System.out.println("Die Zahl ist zu niedrig!");
            } else if (inputValue > randomValue) {
                System.out.println("Die Zahl ist zu hoch!");
            }
        }
        System.out.println("RICHTIG! DU HAST GEWONNEN!");
    }

    public static void guessNumberV1(int minVal, int maxVal) {
        boolean endGame = false;
        while (!endGame) {
            int randomValue = rand.nextInt(minVal, maxVal);
            int inputValue = Integer.MIN_VALUE;
            //AUSGABE
            System.out.println("Willkommen beim super coolen Ratespiel!");
            System.out.printf("Errate die Zahl zwischen %d und %d \n", minVal, maxVal);
            System.out.println("Gib die Zahl nun ein:");
            //LOGIK
            while (inputValue != randomValue) {
                inputValue = Helper.readIntFromConsole(">>>", minVal, maxVal);
                if (inputValue < randomValue) {
                    System.out.println("Die Zahl ist zu niedrig!");
                } else if (inputValue > randomValue) {
                    System.out.println("Die Zahl ist zu hoch!");
                }
            }
            System.out.println("RICHTIG! DU HAST GEWONNEN!");

            String answer = Helper.readStringFromConsole("Noch einmal spielen? [y/n]");
            if (!Helper.isYes(answer)) {
                endGame = true;
            }
        }
    }


    public static boolean isYes(String answer) {
        boolean result = false;
        boolean answerOk = false;
        while (!answerOk) {
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                answerOk = true;
                result = false;
            } else if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                answerOk = true;
                result = true;
            } else {
                answer =Helper.readStringFromConsole("y oder n eingeben!");
            }
        }
        return result;
    }

    public static void calculateFakt() {

        System.out.println("Berechne Fakultät:");
        int value = Helper.readIntFromConsole("Zahl eingeben\n>>>", 0, Integer.MAX_VALUE);
        long result = lukas.week01.Ue04PrimitiveDatentypen.fakt(value);
        System.out.printf("%d! = %d", value, result);
    }

    public static void calculatePiNilakantha() {
        System.out.println("Berechne PI mit der Nilakantha - Reihe");
        System.out.println("Genauigkeit eingeben (zwischen 0 und 1)");
        double precision = Helper.readDoubleFromConsole(">>>");
        lukas.week01.Ue04PrimitiveDatentypen.calculatePiNilakantha2(precision);
    }

    public static void calculateSqrt() {
        System.out.println("Berechne die Wurzel von");
        double value = Helper.readDoubleFromConsole(">>>");
        double result = lukas.week01.Ue04PrimitiveDatentypen.approxSqrt(value, 0.000001);
        System.out.printf("Sqrt(%f) = %f", value, result);
    }

    public static void menu() {
        System.out.println("Willkommen bei meinen Aufgaben!");
        System.out.println("Was möchten Sie zeichnen?");

        //String[] aufgaben = {"Christbaum", "Quader", "Rhombus"};
        boolean runProg = true;
        while (runProg) {
            System.out.println("1) Christbaum");
            System.out.println("2) Quader");
            System.out.println("3) Rhombus");
            System.out.println("Bitte wählen Sie die gewünschte Ziffer:");

            int selection = Helper.readIntFromConsole(">>>", 1, 3);
            String aufgabe;
            int size = 1;
            String txt;
            //Dieser if else Block sollte noch verbessert werden
            if (selection == 1) {
                aufgabe = "Christbaum";
                System.out.printf("Wie groß soll der %s sein \n?", aufgabe);
                size = Helper.readIntFromConsole(">>>", 1, 50);
                lukas.week01.Ue02MethodenSchleifenMatrix.printChristmasTree(size);
            } else if (selection == 2) {
                aufgabe = "Quader";
                System.out.printf("Wie groß soll der %s sein \n?", aufgabe);
                size = Helper.readIntFromConsole(">>>", 1, 50);
                System.out.println("Welches Zeichen soll verwendet werden?");
                txt = Helper.readStringFromConsole(">>>");
                lukas.week01.Ue02MethodenSchleifenMatrix.printEmptySquare(txt, size);
            } else if (selection == 3) {
                aufgabe = "Rhombus";
                System.out.printf("Wie groß soll der %s sein \n?", aufgabe);
                size = Helper.readIntFromConsole(">>>", 1, 50);
                System.out.println("Welches Zeichen soll verwendet werden?");
                txt = Helper.readStringFromConsole(">>>");
                lukas.week01.Ue02MethodenSchleifenMatrix.printRhombusV2(txt, size);
            } else {
                System.out.println("Aufgabe konnte nicht gefunden werden");
            }

            System.out.println("Möchten Sie noch etwas zeichen? (y/n)");
            String answerYesNo = Helper.readStringFromConsole(">>>");
            runProg = Helper.isYes(answerYesNo);
        }
    }

    public static void pocketCalc() {
        System.out.println("Taschenrechner:");
        System.out.println("Erlaubte Operatoren: +,-,*,/,^");
        boolean endProg = false;
        while (!endProg) {
            float value1 = (float) Helper.readDoubleFromConsole("Zahl 1 >>>");

            String operator = "";
            boolean operatorIsOk = false;
            while (!operatorIsOk) {
                operator = Helper.readStringFromConsole("Funktion >>>");
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^")) {
                    operatorIsOk = true;
                } else {
                    System.out.println("Gültige Operatoren: +,-,*,/,^");
                }
            }

            float value2 = (float) Helper.readDoubleFromConsole("Zahl 2 >>>");

            float result = switch (operator) {
                case "+" -> value1 + value2;
                case "-" -> value1 - value2;
                case "*" -> value1 * value2;
                case "/" -> value1 / value2;
                default ->
                    //wenn operator = "^"
                        (float) Math.pow(value1, value2);
            };

            System.out.printf("%f %s %f = %f \n", value1, operator, value2, result);
            String answer = Helper.readStringFromConsole("Nochmal rechnen? (y/n)");
            if (!Helper.isYes(answer)) {
                endProg = true;
            }
        }
    }


    public static void pocketCalculatorContinue() {

    }

    public static void pocketCalcOneRow() {
        System.out.println("Taschenrechner:");
        System.out.println("Erlaubte Operatoren: +,-,*,/,^,(,)");

        String userInput = "-5+5*((7-3.5)/2)^(-1/2)";
        System.out.println(userInput);
        userInput = userInput.replaceAll(" ", "");
        System.out.println(userInput);
//      Check ob nur Zahlen und Operatoren
        String mathRegex = "(\\(*\\-?\\d+\\.?\\d*\\)*[\\+\\-\\*\\/\\^])*\\(*(\\d+\\.?\\d*)\\)*";
        System.out.println(mathRegex);
        boolean hasValidChars = userInput.matches(mathRegex);

        int operatorCount = 0;
        int openBraketCoount = 0;
        for(char c : userInput.toCharArray()) {
            if (c == '+' || c == '-' || c =='*' || c == '/' || c == '^') {
                operatorCount++;
            }
        }
        String[] calStrings = userInput.splitWithDelimiters("[\\+\\-\\*\\/\\^\\(\\)]", operatorCount);
        for (String s : calStrings) {
            System.out.println(s);
        }
    }
}
