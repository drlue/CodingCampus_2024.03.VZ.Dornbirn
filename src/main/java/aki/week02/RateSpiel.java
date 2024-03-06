package aki.week02;

import java.util.Random;
import java.util.Scanner;

public class RateSpiel {
    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my Random Number Game");
        int ziel = rand.nextInt(0, 101);

        int userZahl = Integer.MIN_VALUE;
        while (userZahl != ziel) {
            userZahl = InputUebung.userNumbers("Please write down a Random number from 0 to 100: ", 0, 100);
            if (userZahl < ziel) {
                System.out.println("Your Number is smaller than the Random, try again!");
            } else if (userZahl > ziel) {
                System.out.println("Your Number is bigger than the Random, try again!");
            }
        }
        System.out.println("You got the Random Number! Good Job!");
    }
}
