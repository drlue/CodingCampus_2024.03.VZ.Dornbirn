package aki.week03;

public class PascalDreieck {
    public static void main(String[] args) {
        int[][] array2D = pascalDreieck(10, 10);

        printArray(array2D);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" %6d", arr[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] pascalDreieck(int row, int col) {
        int[][] result = new int[row][col];
        for (int irow = 0; irow < result.length; irow++) {
            for (int icol = 0; icol < result[irow].length; icol++) {
                if (irow == 0 || icol == 0) {
                    result[irow][icol] = 1;
                } else {
                    result[irow][icol] = result[irow][icol - 1] + result[irow - 1][icol];
                }
            }
        }
        return result;
    }
}
