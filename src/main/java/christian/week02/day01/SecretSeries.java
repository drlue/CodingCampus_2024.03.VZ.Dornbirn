package christian.week02.day01;

public class SecretSeries {
    public static void main(String[] args) {
        System.out.println(secretSeriesSecondAttempt(20));
    }

    public static double secretSeriesSecondAttempt(int length) {
        double value = 1.0;
        for (int i = 1; i <= length; i++) {
            value = value / 2 + 1 / value;
            System.out.printf("%2d %26.17f%n",i,value);
        }
        return value;
    }
}
