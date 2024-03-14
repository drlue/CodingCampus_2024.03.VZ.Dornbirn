package aki.week03;

import java.util.Arrays;

public class ZweiDArray {
    public static void main(String[] args) {
        int[][] array2D = create2Darr(10, 10);

        printArray(array2D);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static int[][] create2Darr(int row, int col) {
        int temp = 0;
        int[][] result = new int[row][col];
        for (int irow = 0; irow < result.length; irow++) {
            for (int icol = 0; icol < result[irow].length; icol++) {
                if (result[0][icol] == 0 || result[irow][0] == 0) {
                    result[irow][icol] = 1;
                } else if (result[icol][0] == 0) {
                    result[irow][icol] = temp++;
                }
            }
        }
        return result;
    }
}
