package katherina.week03.day04;

import java.util.Arrays;
import java.util.Random;

public class ArrayIn2D {

    //Hier sind die Grunderklärungen von Sandro drin
    static Random random = new Random();

    public static void main(String[] args) {

        int[][] array = new int[3][3];
        printArray(array);

        System.out.println();
        createArray(10, 5);


    }

    public static int[][] createArray(int row, int collum) {
        int[][] result = new int[row][collum];
        for (int irow = 0; irow < result.length ; irow++) {
            for (int icollum = 0; icollum < result[irow].length; icollum++) {
                result[irow][icollum] = 7;
            }

        }
        return result;
    }

    public static void printArray(int[][] awoo) {

        for (int row = 0; row < awoo.length; row++) {
            System.out.println(Arrays.toString(awoo[row]));
        }


    }

   /* public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }
*/
}
