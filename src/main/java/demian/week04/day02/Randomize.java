package demian.week04.day02;

import demian.allmethods.AllMethods;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;


public class Randomize {

    public static Random random = new Random();


    public static void main(String[] args) {

        //Aufgabe: Es soll ein Wort über die Kommandozeile eingelesen werden,
        // dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden.
        // Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[],
        // befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

        Scanner sc = new Scanner(System.in);


        System.out.print("Geben Sie hier ein Wort ein:");
        String userinput = sc.nextLine();
        // Randomize Word
        String randomizedWord = randomizeString(userinput);
        System.out.println(randomizedWord);
    }

    public static String randomizeString(String word) {
        char[] charArray = word.toCharArray();
        for (int idx = 0; idx < charArray.length*5; idx++) {
            int random1 = random.nextInt(word.length());
            int random2 = random.nextInt(word.length());
            char temp = charArray[random1];
            charArray[random1] = charArray[random2];
            charArray[random2] = temp;
        }
        return new String(charArray);
    }

}
