package franco.homework;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FactorialNum {


    public static void main(String[] args) {
//        factorial number
//
//        int num;
//        int fact=1;
        Scanner scan = new Scanner(System.in);
//
//        System.out.println("give a positive number");
//        num = scan.nextInt();
//        for (int i = 1; i <=num ; i++) {
//            fact*=i;
//        }
//
//        System.out.println("factorial " +fact);

// multiply to the power of given num
//        int base;
//        int power;
//        int result = 1;
//        System.out.println("Write down the base: ");
//        base=scan.nextInt();
//        System.out.println("Write the power: ");
//        power=scan.nextInt();
//
//        for (int ind = 1; ind <=power ; ind++) {
//            result *= base;
//        }
//        System.out.println("The result:"+result);

        //reverse digit
        int remainder;
        int number;
        int temp;
        int reverse = 0;
        System.out.println("please write a 3 or more digit number: ");
        number= scan.nextInt();
        temp=number;
        while(temp>0){
            remainder=temp%10;
            reverse=reverse*10+remainder;
            temp/=10;

        }
        System.out.println("The reverse of "+number+ "is "+reverse);

    }
}
//temp = 12345: The original number provided by the user.
//        remainder = 0: Initialized to 0. This variable will store the last digit of temp.
//Loop Execution:
//
//Iteration 1:
//remainder = temp % 10 = 12345 % 10 = 5: Extracts the last digit of temp, which is 5.
//reverse = reverse * 10 + remainder = 0 * 10 + 5 = 5: The reversed number is currently 5.
//temp /= 10 = 12345 / 10 = 1234: Removes the last digit from temp.
//Iteration 2:
//remainder = temp % 10 = 1234 % 10 = 4: Extracts the last digit of the updated temp, which is 4.
//reverse = reverse * 10 + remainder = 5 * 10 + 4 = 54: The reversed number is now 54.
//temp /= 10 = 1234 / 10 = 123: Removes the last digit from temp.
//Iteration 3:
//remainder = temp % 10 = 123 % 10 = 3: Extracts the last digit of the updated temp, which is 3.
//reverse = reverse * 10 + remainder = 54 * 10 + 3 = 543: The reversed number is now 543.
//temp /= 10 = 123 / 10 = 12: Removes the last digit from temp.
//Iteration 4:
//remainder = temp % 10 = 12 % 10 = 2: Extracts the last digit of the updated temp, which is 2.
//reverse = reverse * 10 + remainder = 543 * 10 + 2 = 5432: The reversed number is now 5432.
//temp /= 10 = 12 / 10 = 1: Removes the last digit from temp.
//Iteration 5:
//remainder = temp % 10 = 1 % 10 = 1: Extracts the last digit of the updated temp, which is 1.
//reverse = reverse * 10 + remainder = 5432 * 10 + 1 = 54321: The reversed number is now 54321.
//temp /= 10 = 1 / 10 = 0: Removes the last digit from temp.
//Loop Termination:
//
//Since temp becomes 0, the loop terminates.
