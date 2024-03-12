package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil4 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumbers = random.nextInt(0, 101);
        int[] zufallswerte = createRandomArray(10);
        printWithForI(zufallswerte);
    }

        public static void printWithForI(int[] arr) {
        int zaehlpixel = 0;
            for (int index = 0; index-1 < (arr.length - 1); ++index) {
                System.out.print(arr[index] + ", ");
                for (int j = arr.length-1; j == arr.length; j++) {
                    System.out.printf("%d",arr[j]);
                }
                if (index > 30) {
                    zaehlpixel++;
                    System.out.println(zaehlpixel);

                }
            }
        }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }
}