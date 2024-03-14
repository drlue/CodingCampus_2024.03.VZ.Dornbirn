package samet.week03.day03;

import java.util.Arrays;

public class Array2DTest {
    public static void main(String[] args) {

       int [][] array = new int[3][3];

        printArray(array);
        System.out.println();
        create2DArray(10,5);

    }

    public static int [][] create2DArray (int row, int col){
        int [][] result = new int[row][col];

        for (int irow = 0; irow < result.length; irow++) {

            for (int icol = 0; icol < result[irow].length; icol++) {
                result[irow][icol] = 7;

            }
        }
        System.out.println();

        return result;
    }



    public static void printArray(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }



}
