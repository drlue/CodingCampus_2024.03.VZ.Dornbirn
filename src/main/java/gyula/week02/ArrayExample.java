package gyula.week02;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = new int[5];
        arr[2] = 7;
        System.out.println(arr[2]);
        // System.out.println(arr[6]); // Causes ArrayOutOfBoundsException
        System.out.println(Arrays.toString(arr));
        doSomething(arr);
        System.out.println("arr after: " + arr[2]);

        int intValue = 5;
        myFunction(intValue);
        System.out.println("Value after: " + intValue);

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        int[] test1 = createArrASC(15);
        System.out.println(Arrays.toString(test1));

        for (int i = 0; i < test1.length; i++) {
            int value = test1[i];

            System.out.println(value);
        }

        for (int value : test1){
            System.out.println(value);
        }

    }

    public static void doSomething(int[] x){
        for (int i = 0; i < x.length; i++) {
            x[i] = 100;
        }
    }

    public static void myFunction(int x){
        x = x + 2;
    }


    public static int[] createArrASC(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        return arr;
    }
}
