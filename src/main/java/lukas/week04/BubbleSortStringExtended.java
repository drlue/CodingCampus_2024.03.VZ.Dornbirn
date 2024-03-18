package lukas.week04;

import java.util.Arrays;

public class BubbleSortStringExtended {

    public static void main(String[] args) {

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.toString(bubbleSortExtended(names,true)));
        System.out.println(Arrays.toString(bubbleSortExtended(names,false)));


    }

    public static String[] bubbleSortExtended(String[] strings, boolean asc) {
        String[] result = BubbleSortString.copyArr(strings);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (asc) { //ascending
                    if (result[j].compareTo(result[j + 1]) > 0) {
                        BubbleSortString.swap(result, j, j + 1);
                    }
                } else {//descinding
                    if (result[j].compareTo(result[j + 1]) < 0) {
                        BubbleSortString.swap(result, j, j + 1);
                    }
                }
            }
        }
        return result;
    }
}