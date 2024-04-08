package aki.week06;

import java.util.Scanner;

public class CheckIfNumber {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int size = readNumberFromConsole("Write down a Number", 10000,10000);
    }
    public static int readNumberFromConsole(String message, int minValue, int maxValue) {
        System.out.println(message);
        int zahl = Integer.MIN_VALUE;
        while (zahl == Integer.MIN_VALUE) {
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("Please write a Number");
            }
            zahl = scan.nextInt();
            scan.nextLine();
            if (zahl < minValue || zahl > maxValue) {
                System.out.println("Please write a Number from  " + minValue + " and " + maxValue + "!");
                zahl = Integer.MIN_VALUE;
            }
        }
        return zahl;
    }
}
