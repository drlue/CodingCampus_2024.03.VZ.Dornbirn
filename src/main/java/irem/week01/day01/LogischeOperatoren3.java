package irem.week01.day01;

public class LogischeOperatoren3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " -- " + i % 2);
        }

        boolean trueorfalse = positivundungerade(0);
        System.out.println(trueorfalse);
    }

    public static boolean positivundungerade(int value) {
        if (value > 0 && value % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

}