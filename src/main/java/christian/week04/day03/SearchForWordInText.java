package christian.week04.day03;

import data.Texts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForWordInText {
    public static Scanner sc = new Scanner(Texts.HESSE);

    public static void main(String[] args) {
        String text = Texts.HESSE;
        System.out.println(text);
        int sum = countWord("Hesse([a-z])?");
        System.out.printf("Das gesuchte Wort kommt %d mal vor", sum);

    }

    public static int countWord(String searchPattern) {
        int countSearchPattern = 0;
        while (sc.hasNext()) {

            String word = sc.next();
            String pattern = searchPattern;
            if (word.matches(searchPattern)) {
                countSearchPattern += 1;
            }
        }
        return countSearchPattern;
    }


}
