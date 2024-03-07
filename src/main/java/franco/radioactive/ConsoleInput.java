package franco.radioactive;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        name = name.toUpperCase();


        System.out.println("Welcome " + name);
        System.out.println("Type in a number between 1 to 100!");
        int num = scan.nextInt();

//        try
//        {
//            if (num < 0 || num > 100) {
//                System.out.println(num + " is the out range");
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("Please enter a number in ourr range");
//        }
    }
}









