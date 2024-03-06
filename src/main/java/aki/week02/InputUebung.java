package aki.week02;

import java.util.Scanner;

public class InputUebung {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String name = userName("Please write down your name: ");
        int age = userNumbers("Please write down your age: ", 0, 100);
        int kills = userNumbers("How many Kills do you have in all games combined?: ", 0, 100000000);
        System.out.println("Your Name is " + name + " and you are " + age + " Years old\n and you have around " + kills + " Kills in all games combined");
    }

    public static String userName(String message) {
        System.out.print(message);

        String name = scan.nextLine();
        return name;
    }

    public static int userNumbers(String message, int minValue, int maxValue) {
        System.out.print(message);

        int number = Integer.MIN_VALUE;
        boolean numberResult = false;
        while (!numberResult) {
            while (!scan.hasNextInt()) {
                System.out.println("Please Write down a Number");
                System.out.println(message);
                scan.nextLine();
            }
            number = scan.nextInt();
            scan.nextLine();
            if (number < minValue || number > maxValue) {
                System.out.println("Please Write down a trustworthy Number betweem " + minValue+ " and " + maxValue + "! ");
                System.out.println(message);
            } else {
                return number;
            }
        }
        return number;
    }
}
