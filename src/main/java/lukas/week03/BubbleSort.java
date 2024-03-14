package lukas.week03;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = lukas.week02.UeArrays.randomArray(10);
        //int[] arr = {6,2,3,5,4,1,10,8,9,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        //Sortierung muss über zwei Schleifen laufen!
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                counter++;
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            System.out.printf("i = %-3d %s counter =%4d\n", i, Arrays.toString(arr), counter);
        }
        System.out.println("Counter = " + counter);
        int maxN = arr.length * (arr.length - 1) / 2;
        System.out.println("maxN = " + maxN);
    }
}
