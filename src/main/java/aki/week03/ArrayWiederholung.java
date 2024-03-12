package aki.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayWiederholung {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] randomNumber = arrayGenerator(10,-50,101);
                System.out.println("Number of times the Number is Greater than 30: " + catchNumberGreaterThan30(randomNumber));
    }

    public static int catchNumberGreaterThan30(int[] size) {
        int numberOver30 = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] > 30) {
                numberOver30++;
            }
        }
        return numberOver30;
    }

    public static int[] arrayGenerator(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(min,max);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
