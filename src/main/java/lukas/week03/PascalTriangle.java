package lukas.week03;

public class PascalTriangle {

    public static void main(String[] args) {

        lukas.week03.ZweiDArray.print2dArrayTxt(createPascalTriangle(10), 8);


    }

    public static int[][] createPascalTriangle(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //first col and row always 1
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        return arr;
    }
}
