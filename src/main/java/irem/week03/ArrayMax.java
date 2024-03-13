package irem.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayMax {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArrayMax(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max:" + maxvalueFromArray(arr));

    }
    public static int maxvalueFromArray(int[] size) {
        int valueMaxNumber = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] > 50) {
                valueMaxNumber++;
            }
        }
        return valueMaxNumber;
    }

        public static int[] createRandomArrayMax(int size){
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1, 100);
            }
            return arr;
        }
    }
