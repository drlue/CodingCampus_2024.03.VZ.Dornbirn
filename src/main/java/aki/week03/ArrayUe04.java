package aki.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayUe04 {
    public static Random random = new Random();

    public static void main(String[] args) {

        arraysZsmRechnen(10);
    }

    public static void arraysZsmRechnen(int randomNumber) {
        int rando = random.nextInt(0, 100);
        int[] numberArr = new int[randomNumber];
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = random.nextInt(-50, 100);

        }
        System.out.println(Arrays.toString(numberArr));
        System.out.println("The sum is: ");
        System.out.println(Arrays.stream(numberArr).sum());
    }
}
