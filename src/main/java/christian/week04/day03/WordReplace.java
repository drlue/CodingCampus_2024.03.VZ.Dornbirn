package christian.week04.day03;

import data.Texts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplace {
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
        String textWar = wordReplaceInText(textGuterTag,"wird","ist");
        System.out.println(textWar);

        //delete char in string

        String deletedChars = deleteCharInString(textGuterTag);
        System.out.println(deletedChars);
    }
    public static String wordToUpperCase(String text, String word) {
        text = text.replaceAll(word,word.toUpperCase());
        return text;
    }

    public static String wordReplaceInText (String text, String word, String replacment){
        text = text.replaceAll(word,replacment);
        return text;
    }

    public static String deleteCharInString (String text){
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");

        return text;
    }

}
