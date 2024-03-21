package irem.week04;

import java.util.Arrays;
import java.util.Random;

public class RandomizeAufgabe {
    static Random random = new Random();

    public static void main(String[] args) {

        String text = "hello World";
        System.out.println(Arrays.toString(text.toCharArray()));
        System.out.println();
        char[] arr = text.toCharArray();
        boolean randomize;
        randomWord(text);
        System.out.println(new String(arr));
    }

    public static String randomWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;

        }
        return new String(charArray);
    }
    public static String randomize(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            int randomInd = random.nextInt(charArray.length);
            char temp = charArray[i];
            charArray[i] = charArray[randomInd];
            charArray[randomInd] = temp;
        }
        return new String(charArray);
    }
}
