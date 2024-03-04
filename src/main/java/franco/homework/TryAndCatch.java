package franco.homework;


import java.io.PrintStream;
import java.util.Scanner;


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

//        try {
//            if (op =='A') {
//                printTriangle
//
//            }
//
//
//        } catch (Exception e) {
//
//        }

    }
}
