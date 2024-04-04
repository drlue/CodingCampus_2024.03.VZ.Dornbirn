package lukas.week04;

import lukas.Helper;

import java.nio.charset.StandardCharsets;

public class StringLongestCommonSubstring {

    public static void main(String[] args) {


        String txtInput1 = Helper.readStringFromConsole("Bitte gib String 1 ein: >>> ");
        String txtInput2 = Helper.readStringFromConsole("Bitte gib String 2 ein: >>> ");
        System.out.println(findLongestCommonWord(txtInput1, txtInput2));


    }

    public static String findLongestCommonWord(String txt1, String txt2) {
        String[] arr1 = txt1.split("\s");
        String[] arr2 = txt2.split("\s");
        String word = "No common words";
        int wordLength = 0;
        for (String word1 : arr1) {
            for (String word2 : arr2) {
                if (word2.equals(word1) && word2.length() > wordLength) {
                    word = word2;
                }
            }
        }
        return word;
    }

    public static String findLongestCommonSubstring(String txt1, String txt2) {
        String subStr ="No common substring";
        char[] charArr1 = txt1.toCharArray();
        char[] charArr2 = txt2.toCharArray();
        String commonSubstring;
        int substringLength = 0;
        for (int i = 0; i < charArr1.length; i++) {
            for (int j = 0; j < charArr2.length; j++) {

            }

        }
        return subStr;
    }


}


