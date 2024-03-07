package christian.week02.day04;

import java.util.Scanner;

public class Taschenrechner {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        float zahlVorOperator = inputReaderFloatInFloatOut();
        String operator = inputReaderOperatoren();
        float zahlNachOperator = inputReaderFloatInFloatOut();
        System.out.println(rechenLogik(zahlVorOperator, operator, zahlNachOperator));
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
        String operator = null;
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

}

//    public class AddOperation implements Operation {
//        @Override
//        public float calculate(float a, float b) {
//            return a + b;
//        }
//    }
//
//    public interface Operation {
//        float calculate(float a, float b);
//    }
//
//    public static float calculate(float a, float b, Operation operation) {
//        return operation.calculate(a, b);
//    }
//}
