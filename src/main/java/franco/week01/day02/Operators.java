package franco.week01.day02;

import java.util.Random;


public class Operators {
    public static void main(String[] args) {

        Random random = new Random();
        //Random Number between -100 and 100
        //Print random number
        int randomNumber = random.nextInt(-100, 101);
        System.out.println(randomNumber);


        Random randomLow = new Random();
        int randomLower = randomLow.nextInt(-101, 0);

        Random randomUpper = new Random();
        int randomUpperLimit = randomUpper.nextInt(0, 101);

        //Generate a year


        //Boolean and Operators methods-True or False
        System.out.println(isEvenAndGreaterThanTen(randomNumber));

        System.out.println(isLessThanFiveOrGreaterTHanHundred(121));

        System.out.println(positiveAndOdd(randomNumber));

        System.out.println(lessThanZeroButNotMinusOne(10));

        System.out.println(isGreaterThanOrEqualFiveLessThanOrEqualHundred(randomNumber));

        System.out.println(divisibleByThreeOrSixteenButNotByThirtyTwo(16));

        int year=1970 +randomNumber;
        System.out.println(aLeapYear(year));

        System.out.println(greaterThanOrEqualToAndLessThanOrEqualToUpperLimit(randomLower,randomUpperLimit,300));

        System.out.println(middleBetweenTwoPoint(randomLower, randomUpperLimit, randomNumber));

    }


    public static boolean isEvenAndGreaterThanTen(int value) {
        //IF/else loop
        if (value % 2 == 0 && value > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLessThanFiveOrGreaterTHanHundred(int value) {
        return value < 5 || value > 100;

    }

    public static boolean positiveAndOdd(int value) {
        if (value > 0 && value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lessThanZeroButNotMinusOne(int value) {
        if (value < 0 && value != -1) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isGreaterThanOrEqualFiveLessThanOrEqualHundred(int value) {
        if (value > 5 && value < 100) {
            return true;
        } else return false;
    }

    public static boolean divisibleByThreeOrSixteenButNotByThirtyTwo(int value) {
        if ((value % 3 == 0 || value % 16 == 0) && value % 32 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean aLeapYear(int year) {

        if
        (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;
    }

    public static boolean greaterThanOrEqualToAndLessThanOrEqualToUpperLimit
            (int lowerLimit, int upperLimit, int value) {
        if (value >= lowerLimit && value == upperLimit) {
            return true;
        } else return false;

    }

    public static boolean middleBetweenTwoPoint(int lower, int upper, int value) {

        if (value==(lower + upper) / 2) {
            return true;

        } else {
            return false;
        }


    }
}

