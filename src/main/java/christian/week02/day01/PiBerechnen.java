package christian.week02.day01;

public class PiBerechnen {
    public static void main(String[] args) {
        System.out.println(calculatePiWithLeibnizAndPrecision(0.0001));
    }
    public static double calculatePiWithLeibnizAndPrecision(double precision) {
        double piMax = 4;
        double piMin = 0;
        int nenner = 1;
        int i = 1;
        while (piMax - piMin >= precision) {
            piMax = piMin+4.0/nenner;
            nenner+=2;
            piMin = piMax-4.0/nenner;
            nenner+=2;
        }
        return piMax;
    }
}
