package christian.week02.day04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaschenrechnerExtended {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        boolean runProg = true;
        while (runProg) {
            float zahlVorOperator = inputReaderFloatInFloatOut();
            String operator = inputReaderOperatoren();
            float zahlNachOperator = inputReaderFloatInFloatOut();
            float ergebnis = rechenLogik(zahlVorOperator, operator, zahlNachOperator);
            System.out.println(ergebnis);
            runProg = weiterrechnen();
            if (runProg) {
                operator = inputReaderOperatoren();
                zahlNachOperator = inputReaderFloatInFloatOut();
                ergebnis = rechenLogik(ergebnis, operator, zahlNachOperator);
            } else {
                runProg = false;
                System.out.println("Auf Wiedersehen!");
            }
        }


//
//        Operation add = (a, b) -> 0;
//
//        System.out.println(calculate(10, 20, (a, b) -> a + b));
    }

    public static float inputReaderFloatInFloatOut() {
        System.out.println("Bitte gib hier eine Zahl ein:");
        while (!sc.hasNextFloat()) {
            System.out.println("Bitte gib eine Fließkommazahl ein! Achte darauf ein \",\" zu verwenden:");
            sc.nextLine();
        }
        return sc.nextFloat();
    }

    public static String inputReaderOperatoren() {
        System.out.println("Wähle zwischen \n\"+\"(Addition),\n\"-\"(Subtraktion),\n\"*\"(Multiplikation),\n\"/\"(Division),\n\"^\"(Potenz) ");
        String operator;
        while (true) {
            operator = sc.nextLine();
            //if(operator.matches("[+\\-*/^]")) {
            //return operator;
            //}
            if (operator.equalsIgnoreCase("+")) {
                return operator;
            } else if (operator.equalsIgnoreCase("-")) {
                return operator;
            } else if (operator.equalsIgnoreCase("*")) {
                return operator;
            } else if (operator.equalsIgnoreCase("/")) {
                return operator;
            } else if (operator.equalsIgnoreCase("^")) {
                return operator;
            } else {
                System.out.println("Bitte gib einen dieser Operatoren ein: \"+\",\"-\",\"*\",\"/\", \"^\"");
            }
        }
    }

    public static float rechenLogik(float zahlVorOperator, String operator, float zahlNachOperator) {

        if (operator.equals("/") && zahlNachOperator == 0) {
            throw new ArithmeticException("Division durch 0 ist nicht möglich");
        } else {
            switch (operator) {
                case "+":
                    return zahlVorOperator + zahlNachOperator;
                case "-":
                    return zahlVorOperator - zahlNachOperator;
                case "*":
                    return zahlVorOperator * zahlNachOperator;
                case "/":
                    return zahlVorOperator / zahlNachOperator;
                case "^":
                    return (float) Math.pow(zahlVorOperator, zahlNachOperator);
                default:
                    throw new ArithmeticException("You provided an invlid operation");
            }
        }

    }

    public static boolean weiterrechnen() {
        System.out.println("Möchtest du mit dem Ergebnis weiterrechnen? Gib \"y\" oder \"n\" ein");
        boolean isAnswerOk = false;
        String antwort = "";
        while (!isAnswerOk)
            antwort = sc.nextLine();
        if (antwort.equals("y")) {
            isAnswerOk = true;
            return true;
        } else if (antwort.equals("n")) {
            isAnswerOk = true;
            return false;
        } else {
            isAnswerOk = false;
            throw new InputMismatchException("Falsche Eingabe");
        }
    }
}

