package christian.week04.day01;

import java.util.Random;
import java.util.Scanner;

public class StringVeraendern {
    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        System.out.println("Gib ein Wort ein!");
        String input = readInput();
        System.out.println("\"" + input + "\" heißt rückwärts: ");
        String reverseInput = reverse(input);
        System.out.println(reverseInput);
        System.out.println("randomized: " + randomize(input));

    }

    public static String readInput() {

        String input = sc.next();
        sc.nextLine();

        return input;
    }

    public static String reverse(String input) {

        char[] inputArray = input.toCharArray();
        char[] tempArray = new char[inputArray.length];

        for (int index = 0; index < inputArray.length; index++) {
            tempArray[index] = inputArray[inputArray.length - 1 - index];
        }

        return new String(tempArray);
    }

    public static String randomize(String input) {
        char[] inputArray = input.toCharArray();

        for (int index = 0; index < inputArray.length; index++) {

            int randomIndex = rnd.nextInt(index, inputArray.length);

            char temp = inputArray[index];
            inputArray[index] = inputArray[randomIndex];
            inputArray[randomIndex] = temp;

        }
        return new String(inputArray);
    }
}
