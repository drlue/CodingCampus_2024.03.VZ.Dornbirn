package aki.week02;

public class Uebungen {
    public static void main(String[] args) {
        int terms = 100000;
        double pi = calculatePi(terms);
        System.out.println(pi);
    }

    static double calculatePi(int terms) {
        double result = 0.0;
        for (int i = 0; i < terms; i++) {
            double term = 4.0 / (2 * i + 1);
            if (i % 2 == 0) {
                result += term;
            } else {
                result -= term;
            }
        }
        return result;
    }
}

