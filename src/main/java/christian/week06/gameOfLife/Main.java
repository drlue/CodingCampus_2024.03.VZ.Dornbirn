package christian.week06.gameOfLife;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rnd = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Welcome to the game of life!\n" +
                "You can coose between different randomizationsettings\n" +
                "Would you like to start a game? Y/N");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            System.out.printf("How big should the grid be?");
            int intinput = sc.nextInt();
            Gamecontroller game = new Gamecontroller(intinput);
            game.createBackend();
            game.createLivingCells((intinput*intinput)-(intinput*3));
            game.countCellsAlive();
            while (game.getCellsalive()!=0){
                game.setCellsalive(0);
                game.printFrontend();
                game.lifeOrDeath();
                game.countCellsAlive();
            }
        }
    }
}
