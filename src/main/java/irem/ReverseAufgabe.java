package irem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseAufgabe {
    static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hier werden die Wörter von Mubo gemixt");
        String text1 = getTextFromConsole("Hau ein Wort rein und lass uns mixen:  ");
        System.out.println();
        System.out.println(Arrays.toString(text1.toCharArray()));
        System.out.println();
        char[] arr = text1.toCharArray();
        reverseWord(arr);
        System.out.println(new String(arr));
    }
    public static String reverseWord(char[] word) {
        for (int count = 0; count < 5 + 2 * word.length; count++) {
            int start = random.nextInt(word.length);
            int end = random.nextInt(word.length);

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
        }
        return new String(word);
    }
    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }
}




