package katherina.week03.day02;

import java.util.Random;

import static java.util.Arrays.sort;

public class Bubblesort {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] zufallswerte = createRandomArray(10);
        printWithForI(zufallswerte);
     System.out.println("Aufsteigende Sortierung:  " + nachhoch(zufallswerte));
  //      System.out.println("Absteigende Sortierung:  " + nachunten(zufallswerte));

    }

    public static void printWithForI(int[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print(arr[index] + ", ");
            }
            System.out.print(arr[arr.length - 1] + " ");
        }
        System.out.println(">>Dies ist unsortiert! Hiiiiilfe! Sortier das!<<");
    }

    public static int nachhoch(int[] arrg) {
        int value = 0;
        for (int index = 0; index < arrg.length-1; index++) {
            if (arrg[index] < arrg[index+1]) {
                continue;
            }
            value = arrg[index];
            arrg[index] = arrg[index+1];
            arrg[index+1] = value;
            sort(new int[]{value});
        }
        return value;
    }

    public static int minimum(int[] arrg) {
        int mini = Integer.MAX_VALUE;
        for (int index = 0; index < arrg.length; index++) {
            if (mini > arrg[index]) {
                mini = arrg[index];
            }
        }
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
