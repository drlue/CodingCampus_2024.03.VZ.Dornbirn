package gyula.week02;

public class Leibnitz {
    public static void main(String[] args) {
        System.out.println(calculatePiWithGregorySeriesFromChristian());
        System.out.println(calculatePi(0.00001));
    }

    public static double calculatePi(double precision){
        int nenner = 1;
        double piMin = 0;
        double piMax = 4;
        while (piMax - piMin > precision){
            piMax = piMin + 4.0 / nenner;
            nenner += 2;
            piMin = piMax - 4.0 / nenner;
            nenner += 2;
        }
        return piMin;
    }

    //calculate Pi with Gregory-Leibniz series
    public static double calculatePiWithGregorySeriesFromChristian() {
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

}
