package gyula.week04;

import java.util.Arrays;

public class StringSortExample {
    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula" };
        sortByIndex(names, 2);
        System.out.println(Arrays.toString(names));
    }

    public static void sortByIndex(String[] arr, int index){
        if (index < 0 || minLength(arr) <= index){
            System.out.println("Sort is not possible on index: " + index);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].charAt(index) > arr[j +1].charAt(index)){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int minLength(String[] arr){
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minLen){
                minLen = arr[i].length();
            }
        }
        return minLen;
    }
}
