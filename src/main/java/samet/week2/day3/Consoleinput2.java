package samet.week2.day3;

import samet.week2.day2.UserInputTest;

import java.util.Scanner;
import java.util.Random;

public class Consoleinput2 {
    public static Random random = new Random();


    public static void main(String[] args) {

        System.out.println("Willkommen beim super coolen Zahlen Ratespiel\nErrate die Zahl zwischen 0 und 100!");
        int numberToGuess = random.nextInt(101);
//        System.out.println(numberToGuess);
        int numberOfTries = 0;
        int guess = Integer.MIN_VALUE;
        boolean win = false;


        while (!win) {
            //   System.out.println();
            guess = UserInputTest.getIntFromConsole("Gib die Zahl nun ein: ", 0, 100); //scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {

                System.out.println("Zu niedrig versuch es höher!");
            } else if (guess > numberToGuess) {
                System.out.println("Zu hoch versuch es niedrieger!");
            } else {
                win = true;
            }
        }
        System.out.println("GEWONNEN!");
        System.out.println("Die Zahl war " + numberToGuess);
        System.out.println("Du brauchtest " + numberOfTries + " versuche!");

    }

}















