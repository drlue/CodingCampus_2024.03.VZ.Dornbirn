package aki.week03;

import java.util.Arrays;

public class ArrayUe {
    public static void main(String[] args) {
        plus("plus");
        minus("minus");
    }

    public static void plus(String b) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        System.out.println(Arrays.toString(number));
    }

    public static void minus(String a) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = number.length - i;
        }
        System.out.println(Arrays.toString(number));
    }
}
