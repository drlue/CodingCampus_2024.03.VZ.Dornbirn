package aki.week03;

import java.util.Arrays;
import java.util.Random;

public class ArrayUe04 {
    public static Random random = new Random();

    public static void main(String[] args) {

        arraysZsmRechnen(10);
    }

    public static void arraysZsmRechnen(int randomNumber) {
        int[] numberArr = new int[randomNumber];
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = random.nextInt(-50, 100);

        }
        System.out.println(Arrays.toString(numberArr));
        System.out.print("The sum is: ");
        System.out.println(Arrays.stream(numberArr).sum());
    }
}
