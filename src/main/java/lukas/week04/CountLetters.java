package lukas.week04;

import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {

        String txt = "Das ist der Testtext.αβγδΑΔΦΓΚ";
        System.out.println("char maxChar = " + (char) getMaxChar(txt));
        System.out.println("int maxChar = " + getMaxChar(txt));
        printCharCount(txt);


    }

    public static int getMaxChar(String txt) {
        int maxChar = 0;
        char[] arr = txt.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChar) {
                maxChar = arr[i];
            }
        }
        return maxChar;
    }


    public static int[] countChars(String txt) {
        char[] charArr = txt.toCharArray();
        int[] result = new int[getMaxChar(txt) + 1];
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (j == (int) charArr[i]) {
                    result[j]++;
                }
            }
        }
        return result;
    }

    public static int[] countCharsV2(String txt) {
        char[] charArr = txt.toCharArray();
        int[] result = new int[Character.MAX_VALUE];
        for (int i = 0; i < charArr.length; i++) {
            result[charArr[i]]++;
        }
        return result;
    }

    public static void printCharCount(String txt) {
        int[] countArr = countCharsV2(txt);
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) {
                System.out.printf("%s: %d\n", (char) i, countArr[i]);
            }

        }
    }


}
