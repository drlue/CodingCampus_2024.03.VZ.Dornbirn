package samet.week03.day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int col = scanner.nextInt();
        int row = scanner.nextInt();
        int [][] ints = new int[row][col];

        for (int i = 0; i < ints.length; i++) {

            for (int j = 0; j < ints[0].length; j++) {

                ints[i][j] =scanner.nextInt();
            }
        }
        for (int i = 0; i < ints.length; i++) {

            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();





    }

//    public static int[][] createRandomInt(int row, int col) {

        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(100);

            }
        }
//        return arr;

    }

}
