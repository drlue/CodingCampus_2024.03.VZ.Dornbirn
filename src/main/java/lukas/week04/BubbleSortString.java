package lukas.week04;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BubbleSortString {

    public static void main(String[] args) {

        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};
        System.out.println(Arrays.toString(names));
        //bubble sort length
        System.out.println(Arrays.toString(bubbleSortLengthAsc(names)));
        System.out.println(Arrays.toString(bubbleSortLengthDesc(names)));
        //bubble sort lexicoraphical
        System.out.println(Arrays.toString(bubbleSortLexiAsc(names)));
        System.out.println(Arrays.toString(bubbleSortLexiDesc(names)));
        //bubble sort extended
        System.out.println(Arrays.toString(bubbleSortLexiExtended(names, true)));
        System.out.println(Arrays.toString(bubbleSortLexiExtended(names, false)));
        //bubble sort with character index
        System.out.println(Arrays.toString(bubbleSortCharIndex(names, 10)));

        /*
        String txt1 = "Abcd";
        String txt2 = "Azzz";
//        int i1 = (int)txt1.toCharArray()[0];
//        int i2 = (int)txt2.toCharArray()[0];
//        System.out.printf("i1 - i2 = %d - %d = %d\n", i1, i2, i1-i2);
        System.out.println("txt1.compareTo(txt2) = " + txt1.compareTo(txt2));
*/

    }

    //sorting methods
    //////////////////////////////////////////////////////////////
    public static String[] bubbleSortLengthAsc(String[] strings) {
        String[] result = copyArr(strings);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j].length() > result[j + 1].length()) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }

    public static String[] bubbleSortLengthDesc(String[] strings) {
        return reverseArr(bubbleSortLengthAsc(strings));
    }

    public static String[] bubbleSortLexiAsc(String[] strings) {
        String[] result = copyArr(strings);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j].compareTo(result[j + 1]) > 0) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }

    public static String[] bubbleSortLexiDesc(String[] strings) {
        return reverseArr(bubbleSortLexiAsc(strings));
    }

    public static String[] bubbleSortLexiExtended(String[] strings, boolean asc) {
        return asc ? bubbleSortLengthAsc(strings) : bubbleSortLengthDesc(strings);
    }


    public static String[] bubbleSortCharIndex(String[] strings, int pos) {
        String[] result = copyArr(strings);
        if(pos > getMinLengthOfStrings(strings)) {
            System.out.println("Pos größer als die minimalste Stringlänge. Array wird nicht sortiert");
        } else {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length - 1 - i; j++) {
                    if(result[j].charAt(pos) - result[j+1].charAt(pos) > 0) {
                        swap(result, j, j+1);
                    }
                }
            }
        }
        return result;
    }


    //general helper methods
    //////////////////////////////////////////////////////////////
    public static String[] copyArr(String[] inputArr) {
        String[] copyArr = new String[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            copyArr[i] = inputArr[i];
        }
        return copyArr;
    }

    public static String[] reverseArr(String[] inputArr) {
        String[] result = copyArr(inputArr);
        for (int i = 0; i < result.length / 2; i++) {
            swap(result, i, result.length - 1 - i);
        }
        return result;
    }

    public static void swap(String[] arr, int index1, int index2) {
        String swap = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = swap;
    }

    public static int getMaxLengthOfStrings(String[] strings) {
        int maxL = 0;
        for (String str : strings) {
            if (str.length() > maxL) {
                maxL = str.length();
            }
        }
        return maxL;
    }

    public static int getMinLengthOfStrings(String[] strings) {
        int minL = Integer.MAX_VALUE;
        for (String str : strings) {
            if (str.length()< minL) {
                minL = str.length();
            }
        }
        return minL;
    }
}


