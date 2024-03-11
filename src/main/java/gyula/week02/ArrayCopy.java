package gyula.week02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = ArrayExample.createArrASC(10);

        int[] copy = copyOf(arr);
        copy[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }

    public static int[] copyOf(int[] original){
        int[] result = new int[original.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = original[i];
        }
        return result;
    }
}
