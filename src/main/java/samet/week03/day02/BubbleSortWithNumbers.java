package samet.week03.day02;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortWithNumbers {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101);
        }
        System.out.println(Arrays.toString(numbers )+"Before");

        boolean swappSomthing = true;

        while (swappSomthing) {
            swappSomthing = false;

            for (int i = 0; i < numbers.length -1; i++){
                if (numbers[i] > numbers[i + 1]) {
                    swappSomthing = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers )+"After");


        for (int i = 0; i < numbers.length -1 ; i++) {
            if (numbers[i] < numbers[i +  1]) {
                swappSomthing = true;
                int temp  = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;

            }

        }
        System.out.println(Arrays.toString(numbers )+"After, Des");


    }

}





