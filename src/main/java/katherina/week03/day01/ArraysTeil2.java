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

/*
        System.out.println("Zweiter Wert:" + zufallswerte[1]);
        System.out.println("Fünfter Wert:" + zufallswerte[4]);
        System.out.println("Zehnter Wert:" + zufallswerte[9]);
 */
    }

    public static void printWithForEach(int[] arr) {
        for (int wert : arr) {
            System.out.printf("[%d, ]", wert);

        }
    }

    public static void printWithForI(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < (arr.length - 1); ++i) {
            System.out.print(arr[i] + ", ");
            for (int j = 8; j == arr.length; j++) {
                System.out.print(arr[j]);
            }
        }
        System.out.print("]");
    }

    public static void printWithIfElse(int[] arr) {
        System.out.print("[");
        int i = 0;
        while (i < arr.length) {

            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");

            } else {
                System.out.print(arr[9]);
                System.out.print("]");
            }
            i++;

        }

    }


    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(0, 101);
        }
        return result;
    }
}


