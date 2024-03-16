package samet.week03.day05;

import samet.week03.day03.PrintArray;
import samet.week03.day03.TwoDimensionalArray;

import java.util.Scanner;

public class PascalTriangle {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        TwoDimensionalArray.printWithForI(createPascalTriangle(10));


        //int size = TwoDimensionalArray.getIntFromConsole("Bitte geben Sie die größe des Pascal Dreiecks ein?",0,10);
        int size = 10;
        TwoDimensionalArray.printWithForI(createPascalTriangle(10));


    }


    public static int[][] createPascalTriangle(int size) {

        int[][] pascal = new int[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || col == 0) {
                    pascal[row][col] = 1;
                }else {
                    pascal[row][col] = pascal[row][col - 1] + pascal[row - 1][col];
                }

            }


        }
        return pascal;


    }


}
