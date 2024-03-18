package franco.week02.day03;

import java.util.Random;
import java.util.Scanner;

public class UserInputNameAndNumber {
    //Generate random number
    //public static Random rand = new Random();

    public static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        String name=getTextFromUser("Welcome please enter your name");
        int num = getIntFromUser("Now enter a number please");
        System.out.printf("Hello %s your lucky number is %d! \n",name,num);

    }

    public static String getTextFromUser(String message) {
        System.out.println(message);
        String name= scan.nextLine();
        
        //trim and length = 0 in documentation
        //https://www.baeldung.com/java-blank-empty-strings
        while (isNotString(name)||name.trim().isEmpty()){

            System.out.println("Please enter a valid name:");
            name = scan.nextLine();
        }

        System.out.println("Thank you "+name.toUpperCase()+"!");

        return name.toUpperCase();
    }

    public static int getIntFromUser(String message){
        System.out.println(message);
       // int result = scan.nextInt();

        int result = 0;
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a real number...");
            scan.nextLine();
          //  System.out.print(message);
        }
        result = scan.nextInt();
        scan.nextLine();
        return result;
    }
    //Check if string has got any number or sign
    public static boolean isNotString(String name) {
        return name.matches(".*\\d.*");
    }

}
