package katherina.week03.day01;

import java.util.Random;

public class ArraysTeil5 {

    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        printWithForI(zufallswerte);
        summe(zufallswerte);
    }

    public static void printWithForI(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print(arr[arr.length - 1] + " ");
        }
        System.out.println("Fertig!");
    }

    public static int summe(int[] arrg) {
        int summant = 0;
        for (int index = 0; index != arrg.length; index++) {
            summant += arrg[index];
        }
        System.out.println("Dies ist die Summe der Zufallszahlen: " + summant);

        return summant;
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }
}