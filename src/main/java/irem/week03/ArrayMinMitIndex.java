package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMinMitIndex {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayMin(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Count value over 50: " + countValueOver50(arr));
        System.out.println("Index of min value: " + minindex(arr));
    }
    public static int countValueOver50(int[] size) {
        int valueMinNumber = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] > 50) {
                valueMinNumber++;
            }
        }
        return valueMinNumber;
    }
    public static int minindex(int[] array) {
        if (array.length == 0) ;
        int index = 0;
        int min = array[index];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int[] createRandomArrayMin(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        return arr;
    }
}
