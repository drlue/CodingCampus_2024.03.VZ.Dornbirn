package christian.week01.day04;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

        zeroToHundredInZeroPointOneSteps();
        zeroToHundredSecondVariant();
        System.out.println(roundxdecimalpoints(0.19999699999999998, 2));
        zeroToHundredFormated();
        oneToTwenty();
        System.out.println(calculatePiWithGregorySeries());
        System.out.println(calculatePiWithNilakantha(2));
        geheimeReihe(20);
    }

    // Aufgabe Faktoriell1
    public static long faktoriell1(long x) {
        long solution = 1;
        for (long i = x; i > 1; i--) {
            solution *= i;
        }
        return solution;
    }

    // Aufgabe Faktoriell2
    public static void faktoriell2() {
        for (long i = 1; i <= 20; i++) {
            System.out.println(faktoriell1(i));

        }
    }

    // Aufgabe Faktoriell3
    public static void faktoriell3() {
        for (long i = 1; i <= 20; i++) {
            System.out.printf("%19d%n", faktoriell1(i));

        }
    }

    //Aufgabe von 0 bis 100 Zählen in 0.1Schritten
    public static void zeroToHundredInZeroPointOneSteps() {
        for (double i = 0; i <= 100; i += 0.1) {
            System.out.println(roundxdecimalpoints(i, 2));
        }
    }

    //Aufgabe von 0 bis 100 Zählen in 0.1 Schritten
    public static void zeroToHundredSecondVariant() {
        double counter = 0;
        while (counter <= 100) {
            System.out.println(roundxdecimalpoints(counter, 2));
            counter += 0.1;
        }
    }

    //eigene Methode zum Runden, funktioniert mit Stellenwertverschiebung und dem normalen Math.round()
    public static double roundxdecimalpoints(double x, int decimalpoints) {
        double d = Math.pow(10, decimalpoints);
        return (Math.round(x * d)) / d;

    }

    // Aufgabe von 0 bis 100 in 0.1 Schritten erweitert (formatiert mit printf)
    public static void zeroToHundredFormated() {
        for (double i = 0; i <= 100; i += 0.1) {
            System.out.printf("%5.1f", i);
            System.out.println();
        }
    }

    public static void oneToTwenty() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            System.out.println(i / 5);
            System.out.println(i / 5.0);
        }
    }

    //calculate Pi with Gregory-Leibniz series
    public static double calculatePiWithGregorySeries() {
        double zaehler = 4;
        double nenner = 1;
        double pi = 0;
        for (int i = 0; i < 20000; i++) {
            pi += (zaehler / nenner);
            nenner += 2;
            pi -= (zaehler / nenner);
            nenner += 2;
        }
        return pi;
    }

    // calculate Pi with Nilakantha series
    public static double calculatePiWithNilakantha(int length) {
        double pi = 3;
        double nenner1 = 2;
        double nenner2 = 3;
        double nenner3 = 4;
        for (int i = 0; i < length; i++) {
            pi += (4 / (nenner1 * nenner2 * nenner3));
            nenner1 += 2;
            nenner2 += 2;
            nenner3 += 2;
            pi -= (4 / (nenner1 * nenner2 * nenner3));

        }
        return pi;
    }

    //Bonusaufgabe Geheime Reihe
    public static void geheimeReihe(int limit) {
        boolean first = true;
        int counter = 1;
        double solution = 1.0;
        double solutionMinusOne=0;
        while (counter <= limit)
            if (first) {
                solutionMinusOne = solution;
                first = false;
                counter++;
            } else {
                System.out.println(solutionMinusOne);
                solution = solutionMinusOne / 2 + 1 / solutionMinusOne;
                solutionMinusOne = solution;
                System.out.println(solution);
                counter++;
            }
    }

}
