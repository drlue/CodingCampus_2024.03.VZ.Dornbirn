package franco.week01.day01;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        //Variable Declaration
        int number;
        //initializationb
        number = 3;
        System.out.println(number);
        long number5 = 10;

        //Declaration and intialization
        int number2 = 6;
        System.out.println(number2);

        //Floating point number double precision
        double number3 = 10.123;
        //Floating point number single precision
        float number4 = 10.12345f;


        boolean trueorFalse = true;

        boolean number4IsBiggerThanNumber3 = number4 > number3;

        String name = "Franco";

        int num = 8;
        int num2 = 5;

        int sum = num + num2;
        System.out.println("The total from 8 + 5 = " + sum);

        int sum2 = num / num2;
        System.out.println("Divide" + sum2);

        float sum3 = num / num2;
        System.out.println("divided as flaot" + sum3);

        float sum4 = num / (float) num2;
        System.out.println("divide as flaot" + sum4);

        int index = 0;
        //increment index by 1
        index++;
        index += 1;
        index = index + 1;
        ++index;

        System.out.println(" index: " + index);
        System.out.println("Index ++: " + index++);
        System.out.println("Index after ++: " + index);
        System.out.println("++Index : " + (++index));

        index += 2;
        index *= 2;
        index = index / 2;


        index = 0;

        while (index <= 10) {
            System.out.println("Current index" + index);
            index++;
        }

        //for loop
        for (int index2 = 0; index2 <= 10; index2++) {
            System.out.println("Current Index2: " + index2);
        }

        index = 0;
        do {
            System.out.println("Do while Current index");
            index++;

        } while (index < -10);


        String username = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please write down your name: ");
            username = scanner.nextLine();

        } while (username.equals(""));

        System.out.println("Your name is: " + username);

        int sum5 = add(10, 20);
        System.out.println("Die Sum von 10 und 20 ist: " + sum5);

    }

    /**
     * This method adds 2 given  numbers
     * @param a the first number
     * @param b the second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

}
