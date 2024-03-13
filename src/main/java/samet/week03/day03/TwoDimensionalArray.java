package samet.week03.day03;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    static Random random = new Random();

    public static void main(String[] args) {

        int[][] arr = createRandomInt(5, 5);
        System.out.println(Arrays.toString(arr));

    }

    public static int[][] createRandomInt(int row, int col) {

        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(100);

            }
        }
        return arr;

    }

}
