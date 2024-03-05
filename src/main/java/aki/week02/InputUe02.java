package aki.week02;

import java.util.Scanner;

public class InputUe02 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getUserName("Write down your name: ");
        int age = getUserAge("Write down your age: ", 0, 100);
        int salary = getUserAge("Write down your Salary: ", 0, 1000000);
        System.out.println(name + " you are " + age + " Years old and your current Salary is €" + salary + ".. broke boy");

    }

    public static String getUserName(String message) {
        System.out.println(message);

        String name = scan.nextLine();
        return name;
    }

    public static int getUserAge(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        boolean resultReady = false;
        while (!resultReady) {
            while (!scan.hasNextInt()) {
                System.out.println("a NUMBER nothing else just NUMBER");
                scan.nextLine();
                System.out.print(message);
            }
            result = scan.nextInt();
            scan.nextLine();
            if (result < minValue || result > maxValue) {
                System.out.printf("Please... for the love of God be normal. ");
                System.out.print(message);
            } else {
                resultReady = true;
            }
        }
        return result;
    }
}
