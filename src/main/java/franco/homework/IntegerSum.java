package franco.homework;

import java.util.Arrays;
import java.util.Random;

public class IntegerSum {
    public static void main(String[] args) {

        //Generate random numbers
        Random random = new Random();
        int[] numbers = new int[18];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(numbers));
        sumOfNumber(numbers);

    }

    public static void sumOfNumber(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        System.out.println("sum of even numbers is: " + sumEven);
        System.out.println("sum of odd numbers is: " + sumOdd);
    }
}
