package christian.week03.day03;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionArraySumOfRowOrCol {
    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("2Dimensionales Array: ");
        int[][] arr = twoDimensionArrayRnd(10, 10);

        System.out.print("\nWovon möchtest du die Summe berechnen lassen?\n");
        System.out.printf("1) Reihe \n2) Spalte \nWähle 1 oder 2 aus!");

        int rowOrCol = intReaderOneOrTwo();

        if (rowOrCol == 1) {
            System.out.println("Welche Reihe möchtest du berechnen lassen?");
        } else {
            System.out.println("Welche Spalte möchtest du berechnen lassen?");
        }
        int numberOf = intReaderMinMax(1, 10);

        int sum = sumOfRowOrCol(arr,rowOrCol,numberOf-1,10,10);
        System.out.println();
        System.out.println("Die Summer der gewählten Reihe oder Spalte ist: "+sum);
    }

    public static int[][] twoDimensionArrayRnd(int sizeX, int sizeY) {
        int[][] arr = new int[sizeX][sizeY];

        for (int row = 0; row < sizeX; row++) {
            for (int col = 0; col < sizeY; col++) {
                arr[row][col] = random.nextInt(0, 101);
                System.out.printf("%3s", arr[row][col]);
                System.out.print(" ");

            }
            System.out.println();
        }
        return arr;
    }

    public static int sumOfRowOrCol(int[][] arr, int rowOrCol, int numberof, int xMax, int yMax) {
        int sum = 0;
        if (rowOrCol == 1) {
            for (int i = 0; i < xMax; i++) {
                sum += arr[numberof][i];

            }
        } else {
            for (int i = 0; i < yMax; i++) {
                sum += arr[i][numberof];
            }
        }
        return sum;
    }

    public static int intReaderOneOrTwo() {
        int result = 0;
        while (result < 1 || result > 2) {
            while (!sc.hasNextInt()) {
                System.out.println("Bitte gib eine Ganzzahl ein!");
                sc.nextLine();
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < 1 || result > 2) {
                System.out.println("Bitte gib entweder 1 oder 2 ein!");
            }
        }
        return result;
    }

    public static int intReaderMinMax(int min, int max) {
        int result = 0;
        while (result < min || result > max) {
            while (!sc.hasNextInt()) {
                System.out.println("Bitte gib eine Ganzzahl ein!");
                sc.nextLine();
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < min || result > max) {
                System.out.printf("Bitte gib eine Ganzzahl zwischen %d und %d ein!", min, max);
            }
        }
        return result;
    }
}
