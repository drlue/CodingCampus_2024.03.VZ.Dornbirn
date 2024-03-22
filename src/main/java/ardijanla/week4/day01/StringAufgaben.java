package ardijanla.week4.day01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringAufgaben {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};


        //sortiere die Namen der lange nach aufsteigend!
        System.out.println("\nString bubble sort ASC by name length");
        String[] sortedNames = stringBubbleSortASC(names);
        printArray(sortedNames);

        //Sortiere die Namen nach Länge absteigend (Descending)
        System.out.println("\nString bubble sort DESC by name length");
        String[] sortedNames1 = stringBubbleSortDESC(names);
        printArray(sortedNames1);


        //Sortiere die Namen lexicographic aufsteigend (Ascending)
        System.out.println("\nString bubble sort ASC by Lexiko");
        String[] sortedNamesbyLexico = stringBubbleSortLexikoASC(names);
        printArray(sortedNamesbyLexico);

        //Sortiere die Namen lexikographisch absteigend (Descending)
        System.out.println("\nString bubble sort DESC by Lexiko");
        String[] sortedNamesbyLexicoDESC = stringBubbleSortLexikoDESC(names);
        printArray(sortedNamesbyLexicoDESC);

        //Bubblesort mit Strings Extended entsceiden pb aufsteigend oder absteigend
        System.out.println("\nString bubble sort DESC/ASC by Lexiko");
        String[] sortedNamesExt = stringBubbleSortLexikoExt(names, true);
        printArray(sortedNamesExt);

        //Sorting with index where to sort
        System.out.println("\nString bubble sort with index");
        String[] sorting = bubbleSortWithIndex(names, 2);
        printArray(sorting);

        //Reverse String
        System.out.println("\nReverse String");
        String input = sc.nextLine();
        System.out.println(reverseStringArray(input));


        //Randomize Sorting
        System.out.println("\nString Randomize Input");
        String input1 = "QWERTZ";
        System.out.println(RandomizeString(input1));





    }

    public static void printArray(String[] arrayToPrint) {
        for (String e : arrayToPrint) {
            System.out.println(e);
        }
    }

    public static String[] stringBubbleSortASC(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {
                if (strArray[j].length() > strArray[j + 1].length()) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }
        return strArray;

    }

    public static String[] stringBubbleSortDESC(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {
                if (strArray[j].length() < strArray[j + 1].length()) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }
        return strArray;
    }

    public static String[] stringBubbleSortLexikoASC(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {
                if (0 < strArray[j].compareTo(strArray[j + 1])) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }
        return strArray;
    }

    public static String[] stringBubbleSortLexikoDESC(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {
                if (0 > strArray[j].compareTo(strArray[j + 1])) {
                    String temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }
        }
        return strArray;
    }

    public static String[] stringBubbleSortLexikoExt(String[] strArray, boolean ascOrDesc) {
        return ascOrDesc ? stringBubbleSortLexikoDESC(strArray) : stringBubbleSortLexikoASC(strArray);
    }

    //alle die zu kurz sind am ende ausgeben
    public static String[] bubbleSortWithIndex(String[] strArray, int place) {
        String[] exceptionArray = new String[1];
        exceptionArray[0] = "The Index was not Correct";
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1; j++) {
                if (strArray[j].length() - 1 >= place) {
                    if ((strArray[j].charAt(place) > strArray[j + 1].charAt(place))) {
                        String temp = strArray[j];
                        strArray[j] = strArray[j + 1];
                        strArray[j + 1] = temp;
                    }
                } else {
                    return exceptionArray;
                }
            }
        }
        return strArray;
    }

    public static String reverseStringArray(String str) {
        char[] strArray = str.toCharArray();
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = strArray[str.length() - 1 - i];
        }
        return new String(charArray);
    }


    public static String RandomizeString1(String str) {
        char[] charArray = str.toCharArray();
        char[] newChar = new char[str.length()];
        int randomIndex = rnd.nextInt(str.length());

        for (int i = 0; i < str.length(); i++) {

            while (newChar[randomIndex] != '\u0000') {
                randomIndex = rnd.nextInt(str.length() -i);
            }
            newChar[randomIndex] = charArray[i];
        }
        return Arrays.toString(newChar);
    }

    public static String RandomizeString(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            int randomIndex = i + rnd.nextInt(charArray.length - i);
            char temp = charArray[i];
            charArray[i] = charArray[randomIndex];
            charArray[randomIndex] = temp;
        }
        return new String(charArray);
    }


}

