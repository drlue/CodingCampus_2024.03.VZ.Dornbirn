package aki.week04;


import java.util.Arrays;

public class BubbleMitStrings {
    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};

        bubbleNamesSortByNumber(names, true); //Ascending from 1 to x , true
        System.out.println(Arrays.toString(names));
        bubbleNamesSortByNumber(names, false); // Descending from x to 1, false
        System.out.println(Arrays.toString(names));
        bubbleNamesSortAsc(names);  //Ascending from A to Z
        System.out.println(Arrays.toString(names));
        bubbleNamesSortDesc(names);  //Descending from Z to A
        System.out.println(Arrays.toString(names));

    }

    public static void bubbleNamesSortDesc(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void bubbleNamesSortAsc(String[] arr) {

        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void bubbleNamesSortByNumberAsc(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void bubbleNamesSortByNumberDesc(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }


    public static void bubbleNamesSortByNumber(String[] arr, boolean asc) {
        if (asc) {
            bubbleNamesSortAsc(arr);
        }else {
            bubbleNamesSortDesc(arr);
        }
    }
}
