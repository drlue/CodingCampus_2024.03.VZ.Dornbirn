package luki.week02.day04;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String numberInput = "\r\r\n\t   123\t\t\n";

        String sanitizedInput = numberInput.trim();

        int numberFromString = Integer.parseInt(sanitizedInput);
        System.out.println("Regular input: >>>" + numberInput + "<<<");
        System.out.println("Sanitized input: " + sanitizedInput);
        System.out.println("Number: " + numberFromString);

        String numberInput2 = "NotANumber";
        try {
            int numberFromString2 = Integer.parseInt(numberInput2);
            System.out.println("Number: " + numberFromString2);
        } catch(Exception exc) {
            System.out.println("ERROR!!!111elf: "+exc.getMessage());
            //exc.printStackTrace();
        }

        //Scanner

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bitte Zahl eingeben (kein Text!!!111elf)");
//        int userInput = scanner.nextInt();
//        System.out.println("Ihre Zahl ist: |"+userInput+"|");

        System.out.println("Your number is: "+readNumberFromUser());
    }

    public static int readNumberFromUser() {
        System.out.println("Bitte Zahl eingeben:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.MIN_VALUE;
        boolean isNumberOK = false;
        while(!isNumberOK) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                isNumberOK = true;
            } else {
                System.out.println("Bisch deppat, gib eine Zahl ein!!!");
                scanner.nextLine();
            }
        }
        return number;
    }

    public static int readNumberFromUser2() {
        System.out.println("Bitte Zahl eingeben:");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Bisch deppat, gib eine Zahl ein!!!");
                scanner.nextLine();
            }
        }
    }
}
