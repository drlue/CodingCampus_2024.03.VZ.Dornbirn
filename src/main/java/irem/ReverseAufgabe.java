package irem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseAufgabe {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String text = "hello World";
        System.out.println(Arrays.toString(text.toCharArray()));
        System.out.println();
        char[] arr = text.toCharArray();
        reverseWord(arr);
        System.out.println(new String(arr));
    }

    public static String reverseWord(char[] word) {
        char[] charArray = word;
        int start = 0;
        int end = word.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }
}




