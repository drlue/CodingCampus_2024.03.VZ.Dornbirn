package irem;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        ///Variable declaration
        int number;
        ///initialization
        number = 3;
        System.out.println(number);

        ///Declaration and initialization
        int number2 = 6;
        System.out.println(number2);
        long number5 = 10;

        ///Floating point number double precision
        double number3 = 10.123;
        ///floating point nuber single precision
        float number4 = 10.1234f;

        boolean trueOrFalse = true;

        boolean number4IsBiggerThanNumber3 = number4 > number3;

        String name = "irem";
        int zahl1 = 8;
        int zahl2 = 5;
        int sum = zahl1 + zahl2;
        System.out.println("Ergebnis von 8 + 5 = " + sum);

        int sum2 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 / 5 = " + sum2);

        float sum3 = zahl1 / (float) zahl2;
        System.out.println("Ergebniss von 8 / 5.0 =" + sum3);

        float sum4 = zahl1 / (float) zahl2;
        System.out.println("Ergebniss von 8 / 5.0 =" + sum4);

        int index = 0;
        //increment index by 1
        index++;
        index += 1;
        index = index + 1;
        ++index;

        System.out.println("Index:" + index);
        System.out.println("Index++:" + index++);
        System.out.println("Index after ++:" + index);
        System.out.println("Index:" + ++index);

        index += 2;
        index *= 2;
        index /= 2;
        index = index / 2;

        index = 0;
        while (index <= 10)
            System.out.println("Current Index: " + index);
        index++;

        for (int index2 = 0; index2 <= 10; index2++) ;
        System.out.println("Current Index2: +index2");


        index = 0;
        do {
            System.out.println("Do While Current Index: " + index);
            index++;
        } while (index < -10);

        String username = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Pleas tell me your name:");
            username = scanner.nextLine();
        } while (username.equals(""));
        System.out.println("Your name is:" + username);

        add(10, 20);
        int sum5 = add(10, 20);
        System.out.println("Die Summe von 10 und 20 ist:" + sum5);

    }


    /**
     * This method adds to given numbers
     *
     * @param a the first number
     * @param b the second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

