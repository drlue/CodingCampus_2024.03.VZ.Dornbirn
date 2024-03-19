package samet.week04.day01;

public class BubblesortWithStrings {

    public static void main(String[] args) {
        System.out.println("Die unsortierte Namensliste!\n");
        String names[] = {"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijan", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        printWithForI(names);
        bubblesortLengthAscending(names);
        System.out.println("Nach länge sortiert Aufstteigend!\n");
        printWithForI(names);
        bubblesortLengthDescending(names);
        System.out.println("Nach länge sortiert Absteigend!\n");
        printWithForI(names);
        bubbleSortAlphaAscending(names);
        System.out.println("Nach Alphabet sortiert Aufsteigend!\n");
        printWithForI(names);
        bubbleSortAlphaDescending(names);
        System.out.println("Nach Alphabet sortiert Absteigend!\n");
        printWithForI(names);
    }
    public static void printWithForI(String[] arr) {
        if (arr.length > 0) {
            for (int index = 0; index < arr.length - 1; ++index) {
                System.out.print("\"" + arr[index] + "\", ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }
    public static void bubblesortLengthAscending(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static String[] bubblesortLengthDescending(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void bubbleSortAlphaAscending(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1].compareTo(array[j]) < 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
        public static void bubbleSortAlphaDescending (String[]array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j + 1].compareTo(array[j]) > 0) {
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }




