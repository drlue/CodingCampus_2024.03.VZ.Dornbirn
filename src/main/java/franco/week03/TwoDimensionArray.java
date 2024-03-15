package franco.week03;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionArray {

    public static Random random = new Random();

    public static void main(String[] args) {

        int[][] array = generateRandom2D_Array(4, 5);
        printArray(array);
        // sumOfRow(array,1)   ;
        sumOfColumn(array, 4);


    }

    public static int[][] generateRandom2D_Array(int row, int column) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(1, 5);
                //  System.out.print(array[row][column]);
            }
            // System.out.println();
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("[ ");
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println("]");
        }

    }

    public static int sumOfRow(int[][] array, int selectedRow) {
        //declare and initialize a sum integer
        int sumRow = 0;
        //for loops goes till the length of the whole length
        //which will give us the index
        for (int column = 0; column < array[selectedRow].length; column++) {

            sumRow += array[selectedRow][column];

        }
        System.out.println("selected row is: " + selectedRow);

        System.out.println("Total: " + sumRow);
        return sumRow;
    }

    public static int sumOfColumn(int[][] array, int selectedColumn) {
        int sumColumn = 0;

        while (selectedColumn > array[0].length==false) {
            System.out.println("error");
            //first for loop goes all through
            while(selectedColumn<= array[0].length) {

                for (int row = 0; row < array.length; row++) {
                    for (int j = selectedColumn; j < array[0].length; j++) {
                        if (j == selectedColumn) {
                            sumColumn += array[row][selectedColumn];
                        }
                    }
                }
            }
        }
        System.out.println("selected column: " + selectedColumn);
        System.out.println("Total: " + sumColumn);
        return sumColumn;
    }


}
