package franco.week03;

public class PascalTriangle {
    public static void main(String[] args) {
        createPascalTriangle(10);


    }

    public static int[][] createPascalTriangle(int size) {

        int[][] array = new int[size][size];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                //First row and column always 1
                if (row == 0 || column == 0) {
                    array[row][column] = 1;
                    System.out.printf("%6d", array[row][column]);
                } else {
             //add the value one position to the left and the value one position above in the same column
                    array[row][column] = array[row][column - 1] + array[row - 1][column];
                    System.out.printf("%6d", array[row][column]);
                }
            }
            System.out.println();
        }
        return array;
    }
}
