package samet.week04.day02;

import samet.week02.day02.UserInputTest;

import java.util.Arrays;
import java.util.Random;

public class StringReverse {
    public static Random rand = new Random();

    public static void main(String[] args) {

        String text = UserInputTest.getTextFromConsole("Willkommen beim Reverseprogramm!!!!!\nBitte geben Sie den Text ein?");
//        String text = "ABCDEF";
        System.out.println(reverseProgramm(text));
        System.out.println(randomizedString(text));


    }

    public static String reverseProgramm(String text){

        char[] originalArr = text.toCharArray();
        char[] reverseArr = new char[originalArr.length];
        for (int i = 0; i < originalArr.length; i++) {
            reverseArr[originalArr.length - i -1] = originalArr[i];

        }
        return new String(reverseArr);


    }

    public static String randomizedString(String text){

        char[] randomizedArr = text.toCharArray();
        for (int i = 0; i < 3 *randomizedArr.length; i++) {
            int pos1 = rand.nextInt(randomizedArr.length);
            int pos2 = rand.nextInt(randomizedArr.length);
            swap(randomizedArr, pos1, pos2);
        }
        return new String(randomizedArr);
    }

    public static void swap(char[] arr, int pos1, int pos2){
        if (pos1 >= 0 && pos1 < arr.length && pos2 >= 0 && pos2 < arr.length) {
            char temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Ungültige Index für die SWAP");
        }

    }



    }



