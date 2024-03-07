package franco.radioactive;
import java.util.Scanner;
import franco.week01.day01.AufgabePrint;
import static franco.week01.day01.AufgabePrint.*;


public class TryAndCatch {
    public static void main(String[] args) {
        //To use the Scanner class, create an object of the class and use any of the
        // available methods found in the Scanner class documentation.
        // In our example, we will use the nextLine() method, which is used to read Strings:

        int[] counts = new int[26];

        Scanner myObj = new Scanner(System.in);
        Scanner operation= new Scanner(System.in);
        System.out.println("Please enter a your name:");
        String name = myObj.nextLine();

        //Convert to upperCase
        name = name.toUpperCase();
        System.out.println("Welcome " + name);
        System.out.println(name + " what operation would you want to proceed?");
        System.out.printf("Press A if you want to print a square! %n" +
                          "Press B if want to print a triangle! %n" +
                           "Press C if want to print a Square!");

        char op = operation.next().charAt(0);

        try {
            if (op =='A') {

                printSquare(" x",6);
            }

            if(op=='B')
            {
                printTriangleTopLeft("O",7);
            }
            if(op=='C'){
                printChristmasTree(9);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");

        }

    }
}
