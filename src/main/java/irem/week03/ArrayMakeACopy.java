package irem.week03;

import christian.week02.day05.Array;

import java.util.Arrays;

public class ArrayMakeACopy {
    public static void main(String[] args) {
        int[] orginal = {1, 2, 3, 4, 5};
        int[] newArray = makeACopy(orginal);
        newArray[4] = 1000;
        System.out.println("orginal " + Arrays.toString(orginal));
        System.out.println("kopie " + Arrays.toString(newArray));

    }


    public static int[] makeACopy(int[] original) {
        int[]copy=new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i]=original[i];
            System.out.println(copy[i]);
        }

        return copy;
    }
}