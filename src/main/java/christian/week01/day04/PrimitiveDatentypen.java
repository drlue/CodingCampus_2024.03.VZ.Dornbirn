package christian.week01.day04;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

    }


    public static void oneToTwenty() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            System.out.println(i / 5);
            System.out.println(i / 5.0);
        }
    }

    //calculate Pi with Gregory-Leibniz series
    public static double calculatePiWithLeibnizSeries() {
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
    // Zaehlervariable weg, iterator als Nenner wählen
    //präzision berechnen siehe Week2

    // calculate Pi with Nilakantha series
    public static double calculatePiWithNilakantha(int length) {
        double pi = 3;
        double nenner1 = 2;
        for (int i = 0; i < length; i++) {
            pi += 4 / (nenner1 * (nenner1 + 1) * (nenner1 + 2));
            nenner1 += 2;
            pi -= 4 / (nenner1 * (nenner1 + 1) * (nenner1 + 2));
            nenner1 += 2;
        }
        return pi;
    }

    //Bonusaufgabe Geheime Reihe
    // neu in Week2
    public static void geheimeReihe(int limit) {
        boolean first = true;
        int counter = 1;
        double solution = 1.0;
        double solutionMinusOne = 0;
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
