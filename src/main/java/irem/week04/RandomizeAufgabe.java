package irem.week04;

import java.util.Arrays;
import java.util.Random;

public class RandomizeAufgabe {
    static Random random = new Random();

    public static void main(String[] args) {
        // String greeting="halloWorld";
        // System.out.println(greeting);
        //System.out.println(randomWord(greeting));

        String text = "hello World";
        System.out.println(Arrays.toString(text.toCharArray()));
        System.out.println();
        char[] arr = text.toCharArray();
        randomWord(text);
        System.out.println(new String(arr));
    }





    public static String randomWord(String text) {
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
