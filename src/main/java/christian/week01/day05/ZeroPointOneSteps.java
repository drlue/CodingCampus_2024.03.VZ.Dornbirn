package christian.week01.day05;

public class ZeroPointOneSteps {
    public static void main(String[] args) {

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

    // Methode aus dem Internet zum Runden, funktioniert mit Stellenwertverschiebung und dem normalen Math.round()
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
}
