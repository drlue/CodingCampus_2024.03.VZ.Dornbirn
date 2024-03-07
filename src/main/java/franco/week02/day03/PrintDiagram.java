package franco.week02.day03;

import franco.homework.ChritsmasTree;
import franco.week01.day01.AufgabePrint;
import franco.week02.day02.UserInput;

import java.util.Scanner;

public class PrintDiagram {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        //simple welcoming message
        System.out.printf("%7s%S|| %n||%S|| %n", "||", "*Welcome to*", "*Self drawing experince*");
        //get name from user(not important)
        //String name= getTextFromUser("Please enter your name");
        int userOption = userChoice();
        String userSign = getCharacterForDrawing();
        int drawingSize = UserInput.getIntFromConsole("please choose a decent size for drawing to be print"
                , 1, 20);

        if (userOption == 1) {
            AufgabePrint.printEmptySquare(userSign, drawingSize);
        } else if (userOption == 2) {
            AufgabePrint.printTri(userSign, drawingSize);
        } else if (userOption == 3) {
            ChritsmasTree.printChristmasTree(userSign, drawingSize);
        }
    }
    public static int userChoice() {
        System.out.println("You have multiple option to draw different diagram!" +
                "\nPress:\n=>1 if you to draw a square!" +
                "\n=>2 if you want a simple triangle!" +
                "\n=>3 if you want a beautiful christmas tree!");

        //Check if choice is a real number within range 1-3
        int chosenNum = scan.nextInt();
        while (chosenNum < 0 || chosenNum > 3 || chosenNum == 0) {
            System.out.println("Please typing an option between the 3 option(1, 2, 3 )");
        }
        return chosenNum;
    }

    public static String getCharacterForDrawing() {

        //get character and check if one single character
        System.out.print("With what the draw should be print\nEg: X or Y or O\n only one single character please:");

        String sign = scan.nextLine();
        while (isNotString(sign) || sign.isEmpty() || sign.length() > 1) {
            System.out.println("Please enter a single symbol: ");
            sign = scan.nextLine();

        }
        //     System.out.println("Thank you " + name.toUpperCase());

        return sign;
    }
    //check that the user don't use any other character than the one
    public static boolean isNotString(String sign) {
        return sign.matches(".*\\d.*");
    }

}



