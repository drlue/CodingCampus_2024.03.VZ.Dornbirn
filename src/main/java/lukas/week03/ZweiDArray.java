package lukas.week03;

import java.util.Arrays;
import java.util.Random;

public class ZweiDArray {


    public static Random random = new Random();

    public static void main(String[] args) {

        int[][] arr = random2dArray(3, 10);
        //int[][] arr = {{3, 4, 5, 6, 7, 8, 9}, {0, 1, 2}, {10, 11, 12, 13}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        //print2dArray(arr);
        print2dArrayTxt(arr);

        while (true) {
            int userInput = lukas.Helper.readIntFromConsole("Zeilensumme (1) oder Spaltensumme (2) berechnen >>>", 1, 2);

            //PRINT ROW SUM
            if (userInput == 1) {
                int selectedRow = lukas.Helper.readIntFromConsole("Wähle Zeile (0 bis " + (arr.length - 1) + ") oder alle Zeile (-1) >>>", -1, arr.length - 1);
                if (selectedRow == -1) {
                    System.out.println(Arrays.toString(rowSums(arr)));
                } else {
                    System.out.printf("Sum Row %d = %d\n", selectedRow, rowSum(arr, selectedRow));
                }

                //PRINT COL SUM
            } else if (userInput == 2) {
                int selectedCol = lukas.Helper.readIntFromConsole("Wähle Spalte (0 bis " + (getMaxRowLength(arr) - 1) + ") oder alle Spalten (-1) >>>", -1, (getMaxRowLength(arr) - 1));
                if (selectedCol == -1) {
                    System.out.println(Arrays.toString(colSums(arr)));
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
        int maxWidth = String.valueOf(getMaxValue(arr)).length();
        print2dArrayTxt(arr, maxWidth+1);
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

    //ROW UND COL SUM
    //////////////////////////////////////////////////////////////////

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

    public static int[] rowSums(int[][] arr) {
        int[] arrRowSum = new int[arr.length];
        for (int i = 0; i < arrRowSum.length; i++) {
            arrRowSum[i] = rowSum(arr, i);
        }
        return arrRowSum;
    }

    public static int[] colSums(int[][] arr) {
        int[] arrColSum = new int[getMaxRowLength(arr)];
        for (int i = 0; i < arrColSum.length; i++) {
            arrColSum[i] = colSum(arr, i);
        }
        return arrColSum;
    }


    //MIN MAX
    //////////////////////////////////////////////////////
    public static int getMinRowValue(int[][] arr, int row) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] < minVal) {
                minVal = arr[row][i];
            }
        }
        return minVal;
    }

    public static int getMaxRowValue(int[][] arr, int row) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] > maxVal) {
                maxVal = arr[row][i];
            }
        }
        return maxVal;
    }

    public static int getMinColValue(int[][] arr, int col) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == col && arr[i][j] < minVal) {
                    minVal = arr[i][j];
                }
            }
        }
        return minVal;
    }

    public static int getMaxColValue(int[][] arr, int col) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == col && arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }
        return maxVal;
    }


    public static int getMaxValue(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }
        return maxVal;
    }


    //MIN MAX ARRAYS
    //////////////////////////////////////////////////////////

    public static int[] getMinRowValues(int[][] arr) {
        int[] minRowValues = new int[arr.length];
        for (int i = 0; i < minRowValues.length; i++) {
            minRowValues[i] = getMinRowValue(arr, i);
        }
        return minRowValues;
    }

    public static int[] getMaxRowValues(int[][] arr) {
        int[] maxRowValues = new int[arr.length];
        for (int i = 0; i < maxRowValues.length; i++) {
            maxRowValues[i] = getMaxRowValue(arr, i);
        }
        return maxRowValues;
    }

    public static int[] getMinColValues(int[][] arr) {
        int[] minColValues = new int[getMaxRowLength(arr)];
        for (int i = 0; i < minColValues.length; i++) {
            minColValues[i] = getMinColValue(arr, i);
        }
        return minColValues;
    }

    public static int[] getMaxColValues(int[][] arr) {
        int[] maxColValues = new int[getMaxRowLength(arr)];
        for (int i = 0; i < maxColValues.length; i++) {
            maxColValues[i] = getMaxColValue(arr, i);
        }
        return maxColValues;
    }

}



