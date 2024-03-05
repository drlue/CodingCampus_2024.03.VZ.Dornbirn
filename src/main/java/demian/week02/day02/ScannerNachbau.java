package demian.week02.day02;

import java.util.Scanner;


public class ScannerNachbau {


    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String username = consoleTEXTinput("========================================\nHallo!\n\nBitte geben Sie hier ihren Namen ein ==> ");
        int age = consoleINTEGERinput("Bitte geben Sie hier ihr Alter ein ==> ", 8, 120);
        System.out.printf("Hallo %s (%d)", username, age);


    }
    //Wiederverwendbare Usereingaben:

    //Texteingabe
    public static String consoleTEXTinput(String messageTOuser) {
        System.out.print(messageTOuser);
        String username = sc.next();

        return username;
    }

    public static Integer consoleINTEGERinput(String messageTOuser, int minAGE, int maxAGE) {
        System.out.print(messageTOuser);
        int age = Integer.MIN_VALUE;
        while (age < minAGE || age > maxAGE) {
            while (!sc.hasNextInt()) {
                System.out.println("Bitte keine Buchstaben oder Sonderzeichen");
                sc.nextLine();
                System.out.print(messageTOuser);
            }
            age = sc.nextInt();
            sc.nextLine();
            if(age<minAGE || age>maxAGE){
                System.out.printf("Nur Werte zwischen %d und %d gültig", minAGE, maxAGE);
                System.out.print(messageTOuser);

            }

        }
        return age;
    }


    public static int getIntFromConsoleV4GYULA(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        while (result < minValue || result > maxValue) {
            while (!sc.hasNextInt()) {
                System.out.println("Hello, es ist keine Zahl...");
                sc.nextLine();
                System.out.print(message);
            }
            result = sc.nextInt();
            sc.nextLine();
            if (result < minValue || result > maxValue) {
                System.out.printf("Bitte geben Sie einen Wert zwischen %d und %d!\n", minValue, maxValue);
                System.out.print(message);
            }
        }
        return result;
    }
}
