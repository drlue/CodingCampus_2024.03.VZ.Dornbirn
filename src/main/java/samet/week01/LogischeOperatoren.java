package samet.week01;

public class LogischeOperatoren {
    public static void main(String[] args) {


        System.out.println((isEvenOrBigger10(20)));
        System.out.println(isSmallerThen5OrBiggerThen100(101));
        System.out.println(isPositivAndOdd(9));
        System.out.println(isSmallerThenZeroButNotNegativ(-2));
        System.out.println(isBiggerThenFiveAndeSmallerThenHundred(20));
        System.out.println(aufgabe6(48));
        System.out.println(schaltjahr(2024));
        System.out.println(lowerLimitUpperLimitValue(100, 200, 150));
        System.out.println(betwenLowerAndUpperLimit(100, 200, 150));


    }

    //Aufgabe 1
    public static boolean isEvenOrBigger10(int value) {

        if (value > 10 && value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 2
    public static boolean isSmallerThen5OrBiggerThen100(int value) {
        if (value < 5 || value > 100) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 3
    public static boolean isPositivAndOdd(int value) {
        if (value % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 4
    public static boolean isSmallerThenZeroButNotNegativ(int value) {
        if (value < 0 && value != -1) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 5
    public static boolean isBiggerThenFiveAndeSmallerThenHundred(int value) {
        if (value >= 5 && value <= 100) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 6
    public static boolean aufgabe6(int value) {
        if ((value % 3 == 0 || value % 16 == 0) && value % 32 != 0) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 7
    public static boolean schaltjahr(int value) {
        if (value % 4 == 0 && (value % 100 != 0 || value % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 8
    public static boolean lowerLimitUpperLimitValue(int lowerlimit, int upperlimit, int value) {
        if (value >= lowerlimit && value <= upperlimit) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 9
    public static boolean betwenLowerAndUpperLimit(int lowerlimit, int upperlimit, int value) {
        if (value == (upperlimit + lowerlimit) / 2) {
            return true;
        } else {
            return false;
        }

    }


}