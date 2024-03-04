package aki.week01.day02;

import java.util.Random;

public class LogischeOperatoren {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(-100, 101);

        boolean value2 = numberIsBiggerThanTen(randomNumber);
        System.out.println("Aufgabe 1 : " + randomNumber + value2);
        boolean value3 = numberSmallerThanFiveButBiggerThanTen(randomNumber);
        System.out.println("Aufgabe 2 : " + randomNumber + value3);
        boolean value4 = positiveUngerade(randomNumber);
        System.out.println("Aufgabe 3 : " + randomNumber + value4);
        boolean value5 = smallerThanZeroButNotMinusOne(randomNumber);
        System.out.println("Aufgabe 4 " + value5);
        boolean value6 = aufgabefuenf(randomNumber);
        System.out.println("Aufgabe 5: " + value6);
    }

    public static boolean numberIsBiggerThanTen(int value) {
        if (value > 10 && value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberSmallerThanFiveButBiggerThanTen(int value) {
        if (value < 5 || value > 100) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean positiveUngerade(int value) {
        if (value > 1 || value % 1 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean smallerThanZeroButNotMinusOne(int value) {
        if (value <= 0 && value > -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean aufgabefuenf(int value) {
        if (value >= 5 && value <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean aufgabesix(int value) {
        if (value % 3 == 0 && value % 16 == 0) {
            return true;
        } else if (value % 32 == 0) {
            return false;
        }else {
            return false;
        }
    }
}
