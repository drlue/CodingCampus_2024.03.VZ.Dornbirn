package samet.week2.day3;

import java.util.Scanner;
import java.util.Random;

public class Consoleinput2 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();






    public static void main(String[] args) {

        String text = getFromConsole("Willkommen beim super coolen Zahlen Ratespiel\nErrate die Zahl zwischen 0 und 100!\nGib die Zahl nun ein:");
        int numberToGuess = random.nextInt(101);
        System.out.println(numberToGuess);
        int numberOfTries = 1;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win =false;


        while (win ==false) {
         //   System.out.println();
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Zu niedrig versuch es höher!");

            } else if (guess > numberToGuess) {
                System.out.println("Zu hoch versuch es niedrieger!");
            }
        }
        System.out.println("GEWONNEN!");
        System.out.println("Die Zahl war " + numberToGuess);
        System.out.println("Du brauchtest " +numberOfTries+ " versuche!");

    }

    public static String getFromConsole(String message) {
        System.out.println(message);

        String text = scanner.nextLine();
        return text;

    }

}















