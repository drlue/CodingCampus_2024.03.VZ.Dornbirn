package franco.homework;

import java.util.Scanner;

public class TRial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput;
        int repeatCount;

        while (true) {
            System.out.print("Enter a string and an integer separated by space: ");
            userInput = scanner.nextLine();
            String[] inputParts = userInput.split(" ");

            if (inputParts.length != 2) {
                System.out.println("Please enter both a string and an integer separated by space.");
                continue;
            }

            try {
                repeatCount = Integer.parseInt(inputParts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
                continue;
            }

            if (inputParts[0].isEmpty() || repeatCount <= 0) {
                System.out.println("Please enter a non-empty string and a positive integer.");
                continue;
            }

            break;
        }

        String userString = userInput.split(" ")[0];
        int timesToRepeat = Integer.parseInt(userInput.split(" ")[1]);

        for (int i = 0; i < timesToRepeat; i++) {
            System.out.println(userString);
        }

        scanner.close();
    }

}



