package aki.week03;

import java.util.Arrays;

public class ArrayAufgabeVomGyula {
    public static void main(String[] args) {
        int[] test = {1, 5, -1, 6, 3, -8, 3, -10};

        arrayAufgabe(test);
    }

    public static void arrayAufgabe(int[] zahl) {
        System.out.print("[");
        boolean first = true;
        for (int value : zahl){
            if (!first){
                System.out.print(", ");
            }
            first = false;
            System.out.print(value);
        }
        System.out.println("]");
    }
}
