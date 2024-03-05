package christian.week02.day02;

import java.util.Scanner;

public class ConsoleInputTryOut {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getStringFromInput("Gib deinen Namen ein: "));
        System.out.println(getIntFromInputV2("Gib dein Alter ein: ", 0, 120));
    }

    public static String getStringFromInput(String message) {
        String result;
        System.out.print(message);
        result = sc.nextLine();

        return result;
    }

    public static int getIntFromInputV1(String message) {
        int result = 0;
        System.out.print(message);
        if (sc.hasNextInt()) {
            result = sc.nextInt();

        }
        return result;
    }

    public static int getIntFromInputV2(String message, int min, int max) {
        int result = 0;
        boolean resultfin = false;
        while (resultfin == false) {
            System.out.print("Gib dein Alter ein: ");
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                if (result >= min && result <= max) {
                    resultfin = true;
                } else {
                    System.out.println("Du bist zu alt oder zu jung");
                }
            }
            else{
                System.out.println("Das ist keine Zahl!");
                sc.nextLine();
            }
        }
        return result;
    }
}