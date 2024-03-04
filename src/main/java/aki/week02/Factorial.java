package aki.week02;

public class Factorial {
    public static void main(String[] args) {
        factorial1(20);
        test1(20);
    }

    public static long factorial1(int number) {
        long n = 1;
        int width = number;
        String formatString = "%2d! = %" + width + "d\n";
        for (int i = 1; i <= number; i++) {
            n *= i;
            System.out.printf(formatString, i, n);
        }
        return n;
    }

    public static void test1(double number) {
        for (double d = 0; d <= number; d = d + 0.1) {
            System.out.print(d);
            System.out.printf(" %6.1f", d);
            System.out.println();
        }

        for (int i = 9000; i <= 10000; i++) {
            System.out.printf("%9.3f\n", i / 100.0);
        }
    }
}
