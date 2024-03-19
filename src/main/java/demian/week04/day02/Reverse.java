package demian.week04.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // AUFGABE: Es soll ein Wort über die Kommandozeile eingelesen werden, dieses Wort soll umgedreht und anschließend ausgegeben werden.
        // Verwende hierfür text.toCharArray() für das Aufsplitten und new String(charArray) zum Zusammenfügen.

        // Willkommen zum Reverseprogramm!!!111
        // >>>Hallo
        // ollaH


        System.out.print("Hallo bitte Wort hier eingeben ===>");
        String userinput = sc.nextLine();
        System.out.println("Ihr Wort umgedreht: " + reverseString(userinput) + "      (Your input:" + userinput + ")");


    }

    public static String reverseString(String inputString) {

        char[] temp = inputString.toCharArray();
        for (int idx = 0; idx < temp.length / 2; idx++) {
            char buffer = temp[temp.length - idx - 1];
            temp[temp.length - idx - 1] = temp[idx];
            temp[idx] = buffer;
        }
        String reversedinputString = new String(temp);
        return reversedinputString;
    }
}


