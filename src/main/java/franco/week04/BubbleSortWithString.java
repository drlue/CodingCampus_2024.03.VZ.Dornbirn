package franco.week04;

import java.util.Arrays;

public class BubbleSortWithString {


    public static void main(String[] args) {

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas",
                "Katherina", "Irem", "Ardijanla", "Aki", "Luki",
                "Sandro", "Berna", "Gyula"};

        System.out.println(Arrays.toString(names));
//
//        bubbleSortAscLetter(names);
//        System.out.println(Arrays.toString(names));
//        bubbleSortAscNameLength(names);
//        System.out.println(Arrays.toString(names));
//
//        bubbleSortAscOrDscNameLength(names, false);
//        System.out.println(Arrays.toString(names));

        bubbleSortCharIndex(names,1);
        System.out.println(Arrays.toString(names));


    }

    //Alphabetical order from a to z
    public static void bubbleSortAscLetter(String[] array) {


        String swapped;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1].compareTo(array[j]) < 0) {
                    swapped = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapped;
                }

            }
        }
    }

    //Alphabetical order from z to a
    public static void bubbleSortDscLetter(String[] array) {
        String swapped;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1].compareTo(array[j]) > 0) {
                    swapped = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapped;
                }
            }
        }
    }

    public static void bubbleSortAscNameLength(String[] array) {


        String swapped;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1].length() < array[j].length()) {
                    swapped = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapped;
                }
            }
        }
    }

    public static void bubbleSortDscNameLength(String[] array) {
        String swapped;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1].length() > array[j].length()) {
                    swapped = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapped;
                }
            }
        }
    }

    public static String[] bubbleSortAscOrDscNameLength(String[] stringArray, boolean ascending) {

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (ascending) {
                    if (stringArray[index - 1].length() > stringArray[index].length()) {
                        String temp = stringArray[index - 1];
                        stringArray[index - 1] = stringArray[index];
                        stringArray[index] = temp;
                        swap = true;
                    }
                } else {
                    if (stringArray[index - 1].length() < stringArray[index].length()) {
                        String temp = stringArray[index - 1];
                        stringArray[index - 1] = stringArray[index];
                        stringArray[index] = temp;
                        swap = true;
                    }
                }
            }
        }
        return stringArray;
    }

    public static void bubbleSortCharIndex(String[] array, int index) {
        if (index < 0 || minimumLength(array) <= index){
            System.out.println("Sort is not possible on index: " + index);
            return;
        }

        String swapped;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if(  (array[j+1].charAt(index) <(array[j].charAt(index)))){
                    swapped = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapped;

                }
            }
        }

    }
    public static int minimumLength(String[] arr){
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minLength){
                minLength = arr[i].length();
            }
        }
        return minLength;
    }


}