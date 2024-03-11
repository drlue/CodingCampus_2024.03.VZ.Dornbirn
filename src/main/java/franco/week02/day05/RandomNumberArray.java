package franco.week02.day05;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] crazyNum = generateRandomNumArray(10, -50, 50);
        System.out.println(Arrays.toString(crazyNum));

        System.out.println("number greater than 30: " + countNumGreaterThan30(crazyNum));
        System.out.println("divide by two: " + divideByTwo(crazyNum));

        //for loop
        for (int i = 0; i < crazyNum.length; i++) {
            System.out.println("For loop crazy num " + crazyNum[i]);
        }
        //For each loop
        for (int number : crazyNum) {
            System.out.println("For each printed number " + number);
        }
    }

    public static int[] generateRandomNumArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(min, max + 1);

        }
        return array;
    }

    public static int countNumGreaterThan30(int[] array) {
        int greaterThan30 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 30) {
                greaterThan30++;
            }
        }
        return greaterThan30;
    }

    //Count element which is divisible by 2
    public static int divideByTwo(int[] array) {
        int divided = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                
               divided++;
            }
        }

        return divided;
    }
}


