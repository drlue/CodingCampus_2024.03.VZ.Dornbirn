package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class Array2DUebung {
    static Random random = new Random();
//[3][3] ist unser row und col
    //[][] steht für 2D
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        printArray(array);

        System.out.println();

        createArray2D(1,5);

    }
//result steht für das ganze 2D array
    public static int[][]createArray2D(int row, int col){
        int[][] result = new int [row][col];
        for (int irow = 0; irow < result.length ; irow++) {

            for (int icol = 0; icol < result[irow].length ; icol++) {
                result[irow][icol] = 7;
            }
        }
        return result;
    }
    public static void printArray(int[][]arr) {

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }
    }
}
