package lukas.week01;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Ue03LogischeOperatoren {
    public static void main(String[] args) {

        Random random = new Random();
        //Random number between 100 and 100
        int randomNumber = random.nextInt(-100, 101);

        System.out.println("0. Value " + randomNumber + " > 3 und gerade oder 11");
        System.out.println(isBiggerThanThreeAndEvenOrEleven1(randomNumber));
        System.out.println(isBiggerThanThreeAndEvenOrEleven2(randomNumber));
        System.out.println(isBiggerThanThreeAndEvenOrEleven3(randomNumber));

        System.out.println("1. Value " + randomNumber + " ist gerade und größer als 10");
        System.out.println(isBiggerThanTenAndEven1(randomNumber));
        System.out.println(isBiggerThanTenAndEven2(randomNumber));

        System.out.println("2. Value " + randomNumber + " ist kleiner als 5 oder größer als 100");
        System.out.println(isSmallerThan5OrBiggerThan100a(randomNumber));
        System.out.println(isSmallerThan5OrBiggerThan100b(randomNumber));

        System.out.println("3. Value " + randomNumber + " ist Positiv und ungerade");
        System.out.println(isPositiveAndOdd1(randomNumber));
        System.out.println(isPositiveAndOdd2(randomNumber));

        System.out.println("4. Value " + randomNumber + " ist Kleiner als 0 aber nicht -1");
        System.out.println(isSmallerThanZeroAndNotMinusOne1(randomNumber));
        System.out.println(isSmallerThanZeroAndNotMinusOne2(randomNumber));

        System.out.println("5. Value " + randomNumber + " ist größer gleich 5 und kleiner gleich 100");
        System.out.println(isBiggerThan5AndSmallerThan100a(randomNumber));
        System.out.println(isBiggerThan5AndSmallerThan100b(randomNumber));

        System.out.println("6. Value " + randomNumber + " ist Ohne Rest durch 3 oder 16 Teilbar, aber nicht durch 32");
        System.out.println(isDivisibleBy3Or16ButNot32a(randomNumber));
        System.out.println(isDivisibleBy3Or16ButNot32b(randomNumber));

        int year = 2000 + randomNumber;
        System.out.println("7. Jahr " + year + " ist ein Schaltjahr");
        System.out.println(isLeapYear1(year));
        System.out.println(isLeapYear2(year));

        int a = 10;
        int b = 100;
        System.out.println("8. Value " + randomNumber + " ist größer gleich " + a + " und kleiner gleich " + b);
        System.out.println(isBetweenLowerAndUpperLimit1(a, b, randomNumber));
        System.out.println(isBetweenLowerAndUpperLimit2(a, b, randomNumber));

        int c = 55;
        System.out.println("9. Value " + c + " Liegt genau in der Mitte zwischen " + a + " und " + b);
        System.out.println(isBetweenLowerAndUpperLimit1(a, b, c));
        System.out.println(isBetweenLowerAndUpperLimit2(a, b, c));


    }

    //Aufgabe 0:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isBiggerThanThreeAndEvenOrEleven1(int value) {
        return value > 3 && value % 2 == 0 || value == 11;
    }

    //Solution 2
    public static boolean isBiggerThanThreeAndEvenOrEleven2(int value) {
        if (value == 11) {
            return true;
        } else if (value > 3) {
            if (value % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Solution 3
    public static boolean isBiggerThanThreeAndEvenOrEleven3(int value) {
        if (value == 11) {
            return true;
        } else if (value <= 3) {
            return false;
        } else {
            return value % 2 == 0;
        }

    }

    //Aufgabe 1:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isBiggerThanTenAndEven1(int value) {
        return value > 10 && value % 2 == 0;
    }

    //Solution 1
    public static boolean isBiggerThanTenAndEven2(int value) {
        if (value > 10) {
            if (value % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    //Aufgabe 2:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isSmallerThan5OrBiggerThan100a(int value) {
        return value < 5 || value > 100;
    }

    //Solution 2
    public static boolean isSmallerThan5OrBiggerThan100b(int value) {
        if (value < 5) {
            return true;
        } else if (value > 100) {
            return true;
        } else {
            return false;
        }
    }

    //Aufgabe 3:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isPositiveAndOdd1(int value) {
        return value > 0 && value % 2 != 0;
    }

    //Solution 2
    public static boolean isPositiveAndOdd2(int value) {
        if (value > 0) {
            if (value % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    //Aufgabe 4:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isSmallerThanZeroAndNotMinusOne1(int value) {
        return value < 0 && value != -1;
    }

    public static boolean isSmallerThanZeroAndNotMinusOne2(int value) {
        boolean b = false;
        if (value < 0) {
            if (value != -1) {
                b = true;
            }
        }
        return b;
    }

    //Aufgabe 5:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isBiggerThan5AndSmallerThan100a(int value) {
        return value > 5 && value < 100;
    }

    //Solution 2
    public static boolean isBiggerThan5AndSmallerThan100b(int value) {
        boolean b = false;
        if (value > 5) {
            if (value < 100) {
                b = true;
            }
        }
        return b;
    }

    //Aufgabe 6:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isDivisibleBy3Or16ButNot32a(int value) {
        return value % 3 == 0 || value % 16 == 0 && value % 32 != 0;
    }

    //Solution 2
    public static boolean isDivisibleBy3Or16ButNot32b(int value) {
        boolean b = false;
        if (value % 3 == 0) {
            b = true;
        } else if (value % 16 == 0) {
            if (value % 32 != 0) {
                b = true;
            }
        }
        return b;
    }

    //Aufgabe 7:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isLeapYear1(int value) {
        return value >= -45 && (value % 4 == 0 && value % 100 != 0 || value % 400 == 0);
    }

    //Solution 2
    public static boolean isLeapYear2(int value) {
        boolean b = false;
        if (value >= -45) {
            if (value % 4 == 0) {
                if (value % 400 == 0) {
                    b = true;
                } else if (value % 100 == 0) {
                    b = false;
                } else {
                    b = true;
                }

            }
        } else {
            System.out.println("Schaltjahr erst 45v.Chr eingeführt");
        }
        return b;
    }

    //Aufgabe 8:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isBetweenLowerAndUpperLimit1(int lowerLimit, int upperLimit, int value) {
        return value >= lowerLimit && value <= upperLimit;
    }

    //Solution 2
    public static boolean isBetweenLowerAndUpperLimit2(int lowerLimit, int upperLimit, int value) {
        boolean b = false;
        if (value >= lowerLimit) {
            if (value <= upperLimit) {
                b = true;
            }
        }
        return b;
    }

    //Aufgabe 9:
    //----------------------------------------------------------------
    //Solution 1
    public static boolean isAverageOfLowerAndUpperLimit1(int lowerLimit, int upperLimit, int value) {
        return value == (lowerLimit + upperLimit) / 2;
    }

    //Solution 2
    public static boolean isAverageOfLowerAndUpperLimit2(int lowerLimit, int upperLimit, int value) {
        if (value == (lowerLimit + upperLimit) / 2) {
            return true;
        } else {
            return false;
        }
    }
}
