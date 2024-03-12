package katherina.week03.day01;

import java.util.Random;

public class ArraysTeil3 {

    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Random Number Array Crazy Range");
        int[] zufallswerte = createRandomArray(10);
        printWithForEach(zufallswerte);
        System.out.println("");
    }

    public static void printWithForEach(int[] arr) {
        boolean first = true;
        for (int wert : arr) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(wert);
            first = false;
        }
    }


    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(-50, 50);
        }
        return result;
    }
}
