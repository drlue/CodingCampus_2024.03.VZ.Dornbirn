package franco.week02.day03;

import java.util.Random;
import static franco.week02.day03.UserInputNameAndNumber.*;

public class GuessingGameEx {
    //random generator
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.printf("%4s%S|| %n||%S|| %n", "||", "*Welcome to*", "*guessing game*");
      //  String name = getTextFromUser("Please enter your name:");

        getNumberFromUser();

        //Weekend job
       // boolean playAgain;
//        do {
//            getNumberFromUser();  // call method to play one game
//            System.out.println("Would you like to play again?Y/N");
//            playAgain = scan.nextBoolean();
//        } while (playAgain);
//        System.out.println("Thanks for playing.Goodbye.");
    }

    public static void getNumberFromUser() {
        int randomNumber = random.nextInt(0, 100);
        int userTry = 0;
        int userNumber;
        System.out.println(randomNumber);
        System.out.println("Try to guess a number between 0 and 100\nType in your number:");

        while (true) {
            userNumber = scan.nextInt();
            userTry++;
            if (userNumber == randomNumber) {
                System.out.println("Congratulation you've guessed the number " + randomNumber +
                        "in" + userTry + " times");
                break;
            }
            if (userTry == 6) {
                System.out.println("Unfortunately you've run of trial. (Max. try is 6)");
                System.out.println("The mysterious number was " + randomNumber);
                break;
            }
            if (userNumber < randomNumber) {
                System.out.println("Your number is too low! \nYou have " + (6 - userTry) + " time left! Try again ");
            } else if (userNumber > randomNumber) {
                System.out.println("Your number is too high! \nYou have " + (6 - userTry) + " time left! Try again ");
            }

        }

    }

}
