package samet.week03.day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int row = getIntFromConsole("Gib bitte die Reihe an von der du die Infos haben willst?", 0, 4);
        System.out.println("Alles klar also Reihe" + " " + row);

        int col = getIntFromConsole("Bitte gib nun die Spalte an von der du die infos haben willst?", 0, 4);
        System.out.println("Alles klar also Spalte" + " " + col);

        int[][] arrayToCreate = createRandomArray(5, 5);

        printWithForI(arrayToCreate);

        int numberofInterest = findNumber(arrayToCreate, row, col);
        System.out.println(numberofInterest);

        System.out.println("Die Gewünschte Info lautet " + numberofInterest);
    }
    public static int getIntFromConsole(String message, int minValue, int maxValue) {
        System.out.println(message);

        int userInput = Integer.MIN_VALUE;
        while (userInput < minValue || userInput > maxValue) {
            while (!scanner.hasNextInt()) {
                System.out.println("Halloooo, es ist keine Zahl...");
                scanner.nextLine();
                System.out.print(message);
            }
            userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput < minValue || userInput > maxValue) {
                System.out.println("Bitte geben Sie einen Wert zwischen " + minValue + " und " + maxValue + " ein");
                System.out.print(message);
            }
        }
        return userInput;
    }
    public static int[][] createRandomArray(int row, int col) {
        int[][] arrayToCreate = new int[row][col];

        for (int i = 0; i < arrayToCreate.length; i++) {
            for (int j = 0; j < arrayToCreate[i].length; j++) {
                arrayToCreate[i][j] = random.nextInt(0, 101);
            }
        }
        return arrayToCreate;
    }
    public static void printWithForI(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("");
    }
    public static int findNumber(int[][] arr, int inputRow, int inputCol) {
        int number = 0;

        number = arr[inputRow][inputCol];

        return number;
    }
}













