package aki.week02;

import java.util.Scanner;

public class Calculator {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my Calculator for Dummies!\nWhat do you wanna calculate?");
        float zahl = number("Write down your first Number", -1000000000f, 1000000000f);
        float zahl1 = number("Write down your second Number", -1000000000f, 1000000000f);
        System.out.println("Now, what do you want to do with those numbers? +, -, *, /");
        System.out.println(zahl + zahl1);
    }

    public static float number(String message, float zahl, float zahl1) {
        System.out.println(message);
        zahl = scan.nextFloat();
        return zahl;
    }

    public static float floatswitchen(String message, float minValue, float maxValue) {
        System.out.println(message);
        float zahl = Float.NEGATIVE_INFINITY;
        while (zahl < minValue || zahl > maxValue) {
            while (!scan.hasNextFloat()) {
                if (zahl < minValue || zahl > maxValue) {
                    System.out.println("Please write a Number from  " + minValue + " and " + maxValue + "!");
                }else {
                    System.out.println("Please write a Number");
                    return zahl;
                }
            }
        }
        return zahl;
    }
}
