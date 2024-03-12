package katherina.week03.day02;

import java.util.Random;

public class ArrayRandomNumberMinMaxAvg {    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        //Kontrollsequenz    System.out.println(Arrays.toString(zufallswerte));
        printWithForI(zufallswerte);
        minimum(zufallswerte);
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

    public static int minimum(int[] arrg) {
        int mini = 0;
        for (int index = 0; index < arrg.length; index++) {
            if (arrg[index]<(mini)) {
                mini += arrg[index];
            }

        }
     //   System.out.println("Meist auskommentierter Kontrollwert - Minimalwert " + mini);

        return mini;
    }

    public static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for (int index = 0; index < result.length; index++) {
            result[index] = random.nextInt(1, 100);
        }
        return result;
    }
}
