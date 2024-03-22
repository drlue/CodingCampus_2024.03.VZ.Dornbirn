package lukas.week04;

import lukas.Helper;

import java.util.Random;

public class StringRandomize {

    public static Random random = new Random();

    public static void main(String[] args) {
        String txt = Helper.readStringFromConsole("Randomize String\nBitte Text eingeben: >>>");
        System.out.println(randomizeString(txt));
        System.out.println(randomizeStringInspiredByGyula(txt));
    }

    public static String randomizeString(String txt) {
        char[] randChars = txt.toCharArray();
        for (int i = 0; i < randChars.length - 1; i++) {
            int randNumber = random.nextInt(i, randChars.length);
            swapChar(randChars, i, randNumber);
        }
        return new String(randChars);
    }

    public static void swapChar(char[] arr, int pos1, int pos2) {
        char tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    public static String randomizeStringInspiredByGyula(String txt) {
        char[] randChars = txt.toCharArray();
        for (int i = 0; i < randChars.length * 5; i++) {
            for (int j = 0; j < randChars.length - 1; j++) {
                swapChar(randChars, random.nextInt(randChars.length - 1), random.nextInt(randChars.length - 1));
            }
        }
        return new String(randChars);
    }



}



