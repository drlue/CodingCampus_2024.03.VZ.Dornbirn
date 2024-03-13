package samet.week03.day02;

import samet.week03.day03.PrintArray;

import java.util.Arrays;

public class BubbleSortGyulaEdition {

    public static void main(String[] args) {

        int [] arr = PrintArray.createRandArray(20);
        System.out.println(Arrays.toString(arr));
        sortBubbleAscending(arr);
        System.out.println(Arrays.toString(arr)+"Ascending");
        sortBubbleDescanding(arr);
        System.out.println(Arrays.toString(arr)+"Descanding");

    }

    public static void sortBubbleAscending(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortBubbleDescanding(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}




