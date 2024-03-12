package katherina.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class ArraysTeil2 {

    static Random random = new Random();

    public static void main(String[] args) {
        int randomNumbers = random.nextInt(0, 101);


        int[] zufallswerte = createRandomArray(10);
        //Ich habe meine Schublade mit "Zufallswerte" benannt, sind ja mehrere. Und ich bestimme, dass sie 100 Werte enthält.
        System.out.println(Arrays.toString(zufallswerte));
        printWithForEach(zufallswerte);
        System.out.println("======");
        printWithForI(zufallswerte);
        System.out.println("======");
        printWithIfElse(zufallswerte);
        System.out.println("======");


        System.out.println("Zweiter Wert:" + zufallswerte[1]);
        System.out.println("Fünfter Wert:" + zufallswerte[4]);
        System.out.println("Zehnter Wert:" + zufallswerte[9]);

    }

    public static void printWithForEach(int[] arr) {
        System.out.print("[");
        for (int wert : arr) {
            System.out.printf("%d, ", wert);
        }
        System.out.print("]");
    }

    public static void printWithForI(int[] arr) {
        System.out.print("[");
        for (int i = 0; i-1 < (arr.length - 1); ++i) {
            System.out.print(arr[i] + ", ");
            for (int j = arr.length-1; j == arr.length; j++) {
                System.out.printf("%d",arr[j]);
            }
        }
        System.out.print("]");
    }

    /*Richtige Lösung nach Gyula:

public static void printWithForI(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static void printWithForEach(int[] arr){
        System.out.print("[");
        boolean first = true;
        for (int value : arr){
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(value);
            first = false;
        }
        System.out.println("]");
    }
     */

    public static void printWithIfElse(int[] arr) {
        System.out.print("[");
        int i = 0;
        while (i < arr.length) {

            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");

            } else {
                System.out.print(arr[i]);
                System.out.print("]");
            }
            i++;

        }

    }

    public static void printWithIfElseByGyula(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(0, 101);
        }
        return result;
    }
}


