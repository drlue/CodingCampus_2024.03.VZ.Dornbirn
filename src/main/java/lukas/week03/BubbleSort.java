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
        int a = 0;
        int swap = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                a++;
                if (arr[i + 1] < arr[i]) {
                    swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }
            }
            System.out.printf("j = %-3d %s a =%4d\n", j, Arrays.toString(arr), a);
        }
        System.out.println("Counter = " + a);
        int maxN = arr.length * (arr.length - 1) / 2;
        System.out.println("maxN = " + maxN);
    }
}
