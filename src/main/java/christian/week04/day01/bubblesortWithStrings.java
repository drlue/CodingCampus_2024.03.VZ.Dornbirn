package christian.week04.day01;

import java.util.Arrays;

public class bubblesortWithStrings {
    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(sortStringArrayLengthUp(names)));
        System.out.println(Arrays.toString(names));
    }

    public static String[] sortStringArrayLengthUpOrDown(String[] stringArray, boolean up) {

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (up) {
                    if (stringArray[index - 1].length() > stringArray[index].length()) {
                        String temp = stringArray[index - 1];
                        stringArray[index - 1] = stringArray[index];
                        stringArray[index] = temp;
                        swapped = true;
                    }
                }
                else {
                    if (stringArray[index - 1].length() > stringArray[index].length()) {
                        String temp = stringArray[index - 1];
                        stringArray[index - 1] = stringArray[index];
                        stringArray[index] = temp;
                        swapped = true;
                    }
                }
            }
        }
        return stringArray;
    }

    public static String[] sortStringArrayLengthUp(String[] stringArray) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (stringArray[index - 1].length() > stringArray[index].length()) {
                    String temp = stringArray[index - 1];
                    stringArray[index - 1] = stringArray[index];
                    stringArray[index] = temp;
                    swapped = true;
                }
            }
        }
        return stringArray;
    }

    public static String[] sortStringArrayLengthDown(String[] stringArray) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (stringArray[index - 1].length() < stringArray[index].length()) {
                    String temp = stringArray[index - 1];
                    stringArray[index - 1] = stringArray[index];
                    stringArray[index] = temp;
                    swapped = true;
                }
            }
        }
        return stringArray;
    }

    public static String[] sortStringArrayAlphabeticalUp(String[] stringArray) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (stringArray[index].compareTo(stringArray[index - 1]) < 0) {
                    String temp = stringArray[index - 1];
                    stringArray[index - 1] = stringArray[index];
                    stringArray[index] = temp;
                    swapped = true;
                }
            }
        }
        return stringArray;
    }

    public static String[] sortStringArrayAlphabeticalDown(String[] stringArray) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (stringArray[index].compareTo(stringArray[index - 1]) > 0) {
                    String temp = stringArray[index - 1];
                    stringArray[index - 1] = stringArray[index];
                    stringArray[index] = temp;
                    swapped = true;
                }
            }
        }
        return stringArray;
    }

}
