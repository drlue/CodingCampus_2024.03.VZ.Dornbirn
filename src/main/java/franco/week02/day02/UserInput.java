package franco.week02.day02;

import java.util.Scanner;

public class UserInput {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getTextFromUser("Welcome, please enter your name:");
        int age = getIntFromConsole("Please enter your age: ", 10, 100);
        int shoeSize = getIntFromConsole("Please enter your europe shoe size", 18, 48);

        System.out.printf("Hello %s (%d) with %d shoe size!\n", name, age, shoeSize);

        //System.out.println(name);

    }

    public static String getTextFromUser(String message) {
        System.out.print(message);

        String name = scan.nextLine();
        while (isNotString(name)|| name.isEmpty()) {
            System.out.print("Please enter a valid name: ");

            //reset String name for new input
            name = scan.nextLine();

        }
        System.out.println("Thank you " + name.toUpperCase());

        return name;
    }

    //is a boolean to check if string Name contain number or any other sign
    //  \\d alternative way to write 0-9 down is the explanation
    // https://www.w3schools.com/java/java_regex.asp

    public static boolean isNotString(String name) {
        return name.matches(".*\\d.*");
    }

    public static int getIntFromConsole(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        while (result < minValue || result > maxValue) {
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a real number...");
                scan.nextLine();
                System.out.print(message);
            }
            result = scan.nextInt();
            scan.nextLine();
            if (result < minValue || result > maxValue) {
                System.out.printf("Please enter a number %d und %d!\n", minValue, maxValue);
                System.out.print(message);
            }
        }
        return result;
    }

}
