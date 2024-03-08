package franco.week02.day03;

import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("%9s%S|| %n||%S|| %n", "||", "*Welcome to*", "*Super Advanced Calculator*");

        while (true) {
            System.out.println("Enter an operation you want to proceed: ( + - / * ) or 'q' to quit");
            String operation = scan.nextLine();
            if (operation.equalsIgnoreCase("q")) {
                System.out.println("Thank you for using SAC");
                break;
            }
            System.out.println("Please enter your first number you");
            double num1 = scan.nextDouble();

            System.out.println("Please enter your second number");
            double num2 = scan.nextDouble();
            double result = 0;

            switch (operation) {
                case "+":
                    result = Addition(num1, num2);
                    break;
                case "-":
                    result = Subtraction(num1, num2);
                    break;

                case "/":
                    result = Division(num1, num2);
                    break;
                case "*":
                    result = Multiplication(num1, num2);
                    break;
                default:
                    System.out.println();

            }
            System.out.println("Total="+result);

        }
    }

    public static double Addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double Subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double Division(double num1, double num2) {
        return num1 / num2;
    }

    public static double Multiplication(double num1, double num2) {
        return (num1 * num2);

    }

    //  public static double Power(double num1, double num2) {
    //   return ( num1*num2);
    // }
}

