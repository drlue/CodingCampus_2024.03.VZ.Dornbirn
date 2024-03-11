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
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("[" + arr[i] + ", ");
            System.out.print("]");
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
