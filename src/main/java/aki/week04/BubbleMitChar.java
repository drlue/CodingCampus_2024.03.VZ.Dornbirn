package aki.week04;

import java.util.Arrays;

public class BubbleMitChar {
    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};

        bubbleNamesSortByCharArray(names, 4);
        System.out.println(Arrays.toString(names));
    }

    public static void bubbleNamesSortByCharArray(String[] arr, int indexOfName) {
        if (indexOfName < 0 || minLength(arr) <= indexOfName) {
            System.out.println("Index " + indexOfName + " is not Possible.");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].toCharArray()[indexOfName] > arr[j + 1].toCharArray()[indexOfName]) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static int minLength(String[] arr) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minLen) {
                minLen = arr[i].length();
            }
        }
        return minLen;
    }
}
