 package aki.week01;

public class factorial {
    public static void main(String[] args) {
        factorial1(20);
    }

    public static long factorial1(int number) {
        long n = 1;
        int width = number;
        String formatString = "%2d! = %" + width + "d\n";
        for (int i = 1; i <= number; i++) {
            n *= i;
            System.out.printf(formatString, i , n);
        }
        return n;
    }

    public static void future(String[] args) {

    }
}
