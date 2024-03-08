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

        int value = 5;
        myFunction(value);
        System.out.println("Value after: " + value);

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void doSomething(int[] x){
        for (int i = 0; i < x.length; i++) {
            x[i] = 100;
        }
    }

    public static void myFunction(int x){
        x = x + 2;
    }
}
