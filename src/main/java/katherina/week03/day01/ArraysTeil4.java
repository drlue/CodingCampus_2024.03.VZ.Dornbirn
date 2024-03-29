package katherina.week03.day01;

import java.util.Random;

public class ArraysTeil4 {

    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        //Kontrollsequenz    System.out.println(Arrays.toString(zufallswerte));
        printWithForI(zufallswerte);
        zaehlen(zufallswerte);
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

    public static int zaehlen(int[] arrg) {
        int dreissigplus = 0;
        for (int index = 0; index < arrg.length; index++) {
            if (arrg[index] > 30) {
                dreissigplus++;
            }

        }
        System.out.println("So oft ist der Wert größer als dreißig: " + dreissigplus);

        return dreissigplus;
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }
}

 /*   public static void printWithForIByGyula(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print(arr[arr.length - 1] + " ");
        }
        System.out.println("ENDE");
    }

*/

