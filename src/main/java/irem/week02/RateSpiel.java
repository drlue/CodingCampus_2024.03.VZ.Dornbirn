package irem.week02;

import java.util.Random;
import java.util.Scanner;

public class RateSpiel {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Wilkommen im Spiel errate die Zahl! ");
        int goal = rand.nextInt(0,100);
        int zahl = Integer.MIN_VALUE;
        while (zahl != goal) {

            zahl = UserInput.getIntFromConsole("Gib die Zahl nun ein: ", 0, 100);

            if (zahl < goal) {
                System.out.println("Es ist zu klein.");
            } else if (zahl > goal)
                System.out.println("Es ist zu GROSS.");
        }
        System.out.println("Gratulation:)!! Du hast genau getroffen.");
    }


}


