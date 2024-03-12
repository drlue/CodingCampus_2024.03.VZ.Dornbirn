package gyula.week03;

import java.util.Arrays;
import java.util.Random;

public class PrintArray {
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[] arr = createRandomArray(10);
        System.out.println(Arrays.toString(arr));
        printWithForI(arr);
        printWithForEach(arr);
    }

    public static void printWithForI(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void printWithForEach(int[] arr){
        System.out.print("[");
        boolean first = true;
        for (int value : arr){
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(value);
            first = false;
        }
        System.out.println("]");
    }

    public static int[] createRandomArray(int size){
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);
        }
        return result;
    }
}
