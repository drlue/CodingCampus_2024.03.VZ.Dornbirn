package christian.week01.day04;

public class logischeOperatoren {
    public static void main(String[] args) {
        System.out.println(isBiggerThanThreeAndEvenOrEleven(13));
        System.out.println(isEvenAndBiggerThanTen(12));
    }

    //Aufgabe 0
    public static boolean isBiggerThanThreeAndEvenOrEleven(int x) {
        return x > 3 && x % 2 == 0 || x == 11;
    }

    //Aufgabe 1
    public static boolean isEvenAndBiggerThanTen(int x) {
        return x > 10 && x % 2 == 0;
    }

    //Aufgabe 2
    public static boolean smallerThanFiveOrBiggerThanHundred(int x) {
        return x < 5 || x > 100;
    }

    //Aufgabe 3
    public static boolean positivAndUneven(int x) {
        return x > 0 && x % 2 != 0;
    }

    //Aufgabe 4
    public static boolean smallerThanZeroButNotMinusOne(int x) {
        return x < 0 && x != -1;
    }

    //Aufgabe 5
    public static boolean biggerThanFiveAndSmallerThanHundred(int x) {
        if (x >= 5 && x <= 100) {
            return true;
        } else
            return false;
    }

    //Aufgabe 6
    public static boolean moduloThreeAndSixteenButNotThirtytwo(int x) {
        return x % 3 == 0 || x % 16 == 0 && x % 32 != 0;
    }
    public static boolean isLeapYear (int x){
        return x%4==0;
    }
}
