package samet.week03.day01;
import java.util.Arrays;
import java.util.Random;

import java.util.Random;

public class RandomNumberArrayCrazyRange {
   static Random random = new Random();
    public static void main(String[] args) {
        int[] arr = randomNumberArrayCrazyRange(10);
        System.out.println(Arrays.toString(arr));

        }


        public static int[] randomNumberArrayCrazyRange(int size){

            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(-50, 50);
            }
            return arr;


        }








}
