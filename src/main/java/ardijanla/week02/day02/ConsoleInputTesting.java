package ardijanla.week02.day02;

import java.util.Scanner;

public class ConsoleInputTesting {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getStringWithMessage("Wie ist dein name? => ");
        int age = getIntWithMessage("Wie alt bist du? => ",12,100);
        int shoesize = getIntWithMessage("Was ist deine Schuhgroesse? =>",19,55);
        System.out.printf("Dein Name ist: %s \nDein Alter ist: %d \nDeine Schuhgroesse ist: %d\n", text, age,shoesize);

        System.out.println("WILLKOMMEN " + text);
    }


    public static void clearScreenError() {
        System.out.flush();
        System.out.println("\nZu viele fehler gemacht program wird beendet");
        System.out.close();
        System.exit(0);
    }


    public static String getStringWithMessage(String message) {


        System.out.print(message);
        String inputtext = sc.nextLine();

        while (inputtext.length() > 15 || inputtext.length() < 2) {
            if (inputtext.length() > 15) {
                System.out.println("Der Name ist zu lange... Bitte nochmal eingeben");
                System.out.print(message);
                inputtext = sc.nextLine();
            } else if (inputtext.length() < 2) {
                System.out.println("Der Name ist zu kurz. Bitte nochmal eingeben");
                System.out.print(message);
                inputtext = sc.nextLine();
            }
        }
        return inputtext;
    }


    public static int getIntWithMessage(String message,int minValue,int maxValue) {
        boolean tryInput = false;
        int input = Integer.MIN_VALUE;
        int maxTrys = 3;
        int trys = 0;

        while (!tryInput && trys < maxTrys) {

            System.out.print(message);
            if (sc.hasNextInt()){
                input = sc.nextInt();
                if (input < minValue ) {
                    trys++;
                    System.out.printf("Die Zahl darf nicht kleiner als %d sein. %d versuche übrig \n",minValue,maxTrys - trys);


                } else if (input > maxValue) {
                    trys++;
                    System.out.printf("Die Zahl darf nicht größer als %d sein. %d versuche übrig \n",maxValue,maxTrys - trys);

                } else {
                    tryInput = true;
                }

            }else{
                trys++;
                System.out.printf("Das ist kein Zahl! noch %d versuche \n",maxTrys - trys );

            }
            sc.nextLine();
        }

        if (tryInput) {
            return input;
        } else {
            clearScreenError();
            return 9999999;
        }


    }


}
