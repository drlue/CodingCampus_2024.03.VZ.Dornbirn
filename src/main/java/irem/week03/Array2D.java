package irem.week03;


import java.util.Arrays;
import java.util.Random;

public class Array2D {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArray(15);
        System.out.println(Arrays.toString(arr));
        int[][] array = new int[3][3];
        printArray(array);
    }


    public static void printArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }
    }

    public static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 101);
        }
        return arr;
    }


}


