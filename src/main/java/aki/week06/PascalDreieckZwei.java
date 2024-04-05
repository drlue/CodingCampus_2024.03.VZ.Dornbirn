package aki.week06;

import java.util.Scanner;

public class PascalDreieckZwei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write down a Number: ");
        int userInput = sc.nextInt();

        arrReader(pascalDreieck(userInput));
    }

    public static int[][] pascalDreieck(int size) {
        int[][] result = new int[size][size];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                if (row == 0 || col == 0) {
                    result[row][col] = 1;
                } else {
                    result[row][col] = result[row - 1][col] + result[row][col - 1];
                }
            }
        }
        return result;
    }

    public static void arrReader(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%6d", arr[i][j]);
            }
            System.out.println();
        }
    }
}