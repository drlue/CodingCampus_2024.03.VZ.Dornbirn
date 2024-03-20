package christian.week04.day03;

import christian.week04.day01.bubblesortWithStrings;
import data.Texts;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplace {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = Texts.HESSE;

        //Replace with Matcher.replaceAll or with String.replaceAll

        Pattern pattern = Pattern.compile("Hesse([a-z])?");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("HESSE");


//        text = wordToUpperCase(text, "Hesse");
        System.out.println(text);

        // Wird zu war oder ist


        String textGuterTag = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        String textWar = wordReplaceInText(textGuterTag, "wird", "ist");
        System.out.println(textWar);

        //delete char in string

        String deletedChars = deleteCharInString(textGuterTag);
        System.out.println(deletedChars);

        //längster gemeinsamer Substring;
        String mutual = getLongestMutualSubstring();
        System.out.println(mutual);
    }

    public static String wordToUpperCase(String text, String word) {
        text = text.replaceAll(word, word.toUpperCase());
        return text;
    }

    public static String wordReplaceInText(String text, String word, String replacment) {
        text = text.replaceAll(word, replacment);
        return text;
    }

    public static String deleteCharInString(String text) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");

        return text;
    }

    public static String getSentenceFromConsole() {
        String sentenceInput = sc.nextLine();
        return sentenceInput;
    }
    public static String getLongestMutualSubstring (){

        System.out.println("Gib einen Satz ein: ");
        String sentence1 = getSentenceFromConsole();
        System.out.println("Gib noch einen Satz ein: ");
        String sentence2 =  getSentenceFromConsole();

        StringTokenizer token1 = new StringTokenizer(sentence1);
        StringTokenizer token2 = new StringTokenizer(sentence2);

        int count1 = token1.countTokens();
        int count2 = token2.countTokens();

        String [] sentence1Array = new String[count1];
        String [] sentence2Array = new String[count2];

        for (int index = 0; index < count1; index++) {
            sentence1Array[index]=token1.nextToken();
        }
        for (int index = 0; index < count2; index++) {
            sentence2Array[index]=token2.nextToken();
        }
        bubblesortWithStrings.sortStringArrayAlphabeticalUp(sentence1Array);
        bubblesortWithStrings.sortStringArrayAlphabeticalUp(sentence2Array);

        for (int index1 = 0; index1 < sentence1Array.length; index1++) {
            for (int index2 = 0; index2 < sentence2Array.length; index2++) {
               if (sentence1Array[index1].equalsIgnoreCase(sentence2Array[index2])){
                   return sentence1Array[index1];
                }

            }

        }
        System.out.println("Es gibt keine übereinstimmenden Strings!");
        return "|noMutualSubstring|";
    }
}
