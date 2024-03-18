package christian.week04.day01;

import java.util.Arrays;

public class bubblesortWithStrings {
    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(sortStringArrayAlphabeticalAtIndex(names, 5)));
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
                } else {
                    if (stringArray[index - 1].length() < stringArray[index].length()) {
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

    public static String[] sortStringArrayAlphabeticalUpOrDown(String[] stringArray, boolean up) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 1; index < stringArray.length; index++) {
                if (up) {
                    if (stringArray[index].compareTo(stringArray[index - 1]) < 0) {
                        String temp = stringArray[index - 1];
                        stringArray[index - 1] = stringArray[index];
                        stringArray[index] = temp;
                        swapped = true;
                    }
                } else {
                    if (stringArray[index].compareTo(stringArray[index - 1]) > 0) {
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

//    public static String[] sortStringArrayAlphabeticalAtIndex(String[] stringArray, int indexBegin) {
//
//        boolean swapped = true;
//        while (swapped) {
//            swapped = false;
//            for (int index = 1; index < stringArray.length; index++) {
//                if (indexBegin < stringArray[index].length() && indexBegin < stringArray[index - 1].length()) {
//                    if (stringArray[index].charAt(indexBegin) < stringArray[index - 1].charAt(indexBegin)) {
//                        String temp = stringArray[index - 1];
//                        stringArray[index - 1] = stringArray[index];
//                        stringArray[index] = temp;
//                        swapped = true;
//                    }
//                } else {
//                    String temp = stringArray[index - 1];
//                    stringArray[index - 1] = stringArray[index];
//                    stringArray[index] = temp;
//                    swapped = true;
//                }
//            }
//        }
//        return stringArray;
//
//    }
//
//    public static String[] sortStringArrayAlphabeticalAtIndices(String[] stringArray, int indexBegin) {
//
//        boolean swapped = true;
//        while (swapped) {
//            swapped = false;
//            for (int index = 1; index < stringArray.length; index++) {
//
//                for (int charindex = 0 + indexBegin; charindex < stringArray[index].length() && charindex < stringArray[index - 1].length(); charindex++) {
//
//                    if (stringArray[index].charAt(charindex) < stringArray[index - 1].charAt(charindex)) {
//
//                        String temp = stringArray[index - 1];
//                        stringArray[index - 1] = stringArray[index];
//                        stringArray[index] = temp;
//                        swapped = true;
//                    }
//                }
//
//            }
//        }
//        return stringArray;
//
//    }
}
