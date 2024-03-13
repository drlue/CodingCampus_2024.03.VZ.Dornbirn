package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMin {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayMin(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min:" + minvalueFromArray(arr));
    }
    public static int minvalueFromArray(int[] size) {
        int valueMinNumber = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] > 50) {
                valueMinNumber++;
            }
        }
        return valueMinNumber;
    }

    public static int[] createRandomArrayMin(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        return arr;
    }
}
