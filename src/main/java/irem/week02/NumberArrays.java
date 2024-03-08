package irem.week02;

import java.util.Arrays;

public class NumberArrays {
    public static void main(String[] args) {

        //Deklaratiom und Initialisierung eines Arrays
        int[] meinArray = {1, 2, 3, 4, 5};

        //Durchlauf des Arrays und Ausgabe Jedes Elements
        for (int i = 0; i < meinArray.length; i++) {
            System.out.println(meinArray[i]);
        }



        int size = 20;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));




        }
    }

