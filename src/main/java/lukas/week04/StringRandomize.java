package lukas.week04;

import lukas.Helper;

import java.util.Random;

public class StringRandomize {

    public static Random random = new Random();

    public static void main(String[] args) {

        String txt = Helper.readStringFromConsole("Randomize String\nBitte Text eingeben: >>>");
        System.out.println(randomizeString(txt));


    }

    public static String randomizeString(String txt) {
        char[] randChars = txt.toCharArray();
        for (int i = 0; i < randChars.length; i++) {
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

//    public static int[] numbersToChooseFrom(String txt) {
//        int[] result = new int[txt.length()];
//        for (int i = 0; i < result.length; i++) {
//            result[i]
//        }

}



