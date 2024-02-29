package luki.week01.day02;

import java.util.Random;

public class ScopeOfVariables {
    public static int numberVisibleInWholeClass = 100;

    public static void printRandomNumber() {
        int randomNumber = 100;
        numberVisibleInWholeClass = 300;
        System.out.println(randomNumber);
    }

    public static void main(String[] args) {

        printRandomNumber();
        //System.out.println(randomNumber);
        numberVisibleInWholeClass = 400;
        System.out.println(numberVisibleInWholeClass);

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        //Nicht sichtbar
        //i++;

        for (int i = 0; i < 100; i++) {
            int b = 100;

            for (int j = 0; j < 100; j++) {
                System.out.println(b);
            }
        }
        //Nicht sichtbar
        //b++;


        {
            int c = 100;
        }

        {
            int c = 200;
        }

        {
            int c;

            c = 100;
            //...
            c = 200;
        }

        {
            float c = 100.0f;
        }
        {
            String c = "Hallo";
        }


        boolean isTwoEqualTwoZero = 2 == 2.0f;
        System.out.println(isTwoEqualTwoZero);

        int x = 100;
        Integer x1 = 100;

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

    }
}
