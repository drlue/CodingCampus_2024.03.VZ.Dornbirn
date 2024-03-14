package katherina.week03.day04;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayIn2D {
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] zufallswerte = createRandomArray(10, 10);
        printArray(zufallswerte);
        System.out.println();


    }

    public static void printArray(int[][] awoo) {

        for (int row = 0; row < awoo.length; row++) {
            System.out.println(Arrays.toString(awoo[row]));
        }
    }

    public static int[][] createRandomArray(int size, int size2) {
        int[][] result = new int[size][size2];
        for (int index = 0; index < result.length; index++) {
            for (int jane = 0; jane < result.length; jane++) {
                result[index][jane] = random.nextInt(10, 100);
                //Ja, Aufgabe sagt 0 bis 100. Aber ich will eine gleichmäßige Optik! So!
            }
        }
        return result;
    }

}
