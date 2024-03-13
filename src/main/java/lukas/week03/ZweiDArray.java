package lukas.week03;

import java.util.Arrays;
import java.util.Random;

public class ZweiDArray {


    public static Random random = new Random();

    public static void main(String[] args) {

        int[][] arr = random2dArray(3, 10);
        //int[][] arr = {{3, 4, 5, 6, 7, 8, 9}, {0, 1, 2}, {10, 11, 12, 13}};
        System.out.println(Arrays.deepToString(arr));
        //print2dArray(arr);
        print2dArrayTxt(arr);
        while (true) {
            int userInput = lukas.Helper.readIntFromConsole("Zeilensumme (1) oder Spaltensumme (2) berechnen >>>", 1, 2);

            //PRINT ROW SUM
            if (userInput == 1) {
                int selectedRow = lukas.Helper.readIntFromConsole("Wähle Zeile (0 bis " + (arr.length - 1) + ") oder alle Zeile (-1) >>>", 0, arr.length - 1);
                if (selectedRow == -1) {
                    printRowSums(arr);
                } else {
                    System.out.printf("Sum Row %d = %d\n", selectedRow, rowSum(arr, selectedRow));
                }

                //PRINT COL SUM
            } else if (userInput == 2) {
                int selectedCol = lukas.Helper.readIntFromConsole("Wähle Spalte (0 bis " + (getMaxRowLength(arr) - 1) + ") oder alle Spalten (-1) >>>", 0, (getMaxRowLength(arr) - 1));
                if (selectedCol == -1) {
                    printColSums(arr);
                } else {
                    System.out.printf("Sum Col %d = %d\n", selectedCol, colSum(arr, selectedCol));
                }
            }

            String userInput2 = lukas.Helper.readStringFromConsole("Zum Beenden (q) eingeben >>>");
            if (userInput2.equalsIgnoreCase("q")) {
                break;
            }
        }


    }


    public static int[][] random2dArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = random.nextInt(101);
            }
        }
        return arr;
    }


    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");

            for (int j = 0; j < arr[i].length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("]");
        }
    }

    public static void print2dArrayTxt(int[][] arr, int elementWidth) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%" + elementWidth + "d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void print2dArrayTxt(int[][] arr) {
        print2dArrayTxt(arr, 5);
    }

    public static int getMaxRowLength(int[][] arr) {
        int maxRowLength = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > maxRowLength) {
                maxRowLength = arr[i].length;
            }
        }
        return maxRowLength;
    }

    public static int rowSum(int[][] arr, int selectedRow) {
        int rowSum = 0;
        for (int col = 0; col < arr[selectedRow].length; col++) {
            rowSum += arr[selectedRow][col];
        }
        return rowSum;
    }

    public static int colSum(int[][] arr, int selectedColumn) {
        int colSum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (col == selectedColumn) {
                    colSum += arr[row][col];
                }
            }
        }
        return colSum;
    }

    public static void printRowSums(int[][] arr) {
        //int[] arrRowSums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                //arrRowSums[i]+= arr[i][j];
                rowSum += arr[i][j];
            }
            System.out.printf("Sum Row %d = %d\n", i, rowSum);
        }
    }

    public static void printRowSumsV1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Sum Row %d = %d\n", i, rowSum(arr, i));
        }
    }


    public static void printColSums(int[][] arr) {
        for (int col = 0; col < getMaxRowLength(arr); col++) {
            int colSum = 0;
            for (int row = 0; row < arr.length; row++) {
                if (col < arr[row].length) {
                    colSum += arr[row][col];
                }
            }
            System.out.printf("Sum Col %d = %d \n", col, colSum);
        }
    }

    public static void printColSumsV1(int[][] arr) {
        for (int col = 0; col < getMaxRowLength(arr); col++) {
            System.out.printf("Sum Col %d = %d\n", col, colSum(arr, col));
        }
    }


}



