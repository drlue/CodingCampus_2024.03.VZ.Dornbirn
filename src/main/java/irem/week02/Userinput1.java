package irem.week02;
import java.util.Scanner;
public class Userinput1 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String text = Pain1Akazuki("Geben Sie Ihre Name ein ==> ");
        int age = Pain4Akazuki("Geben Sie Ihre Alter ein ==> ", 0, 100);
        int shoe = Pain4Akazuki("Geben Sie Ihre Schuhgröße ein ==> ", 18, 50);

        System.out.printf("Hello %s (%d) with %d shoe size!\n", text, age, shoe);

    }

    public static String Pain1Akazuki(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }

    public static int Pain2Akazuki(String message) {
        System.out.println(message);

        int result = 0;
        if (sc.hasNextInt()) {
            result = sc.nextInt();
        } else {
            System.out.println("Holla, es ist keine Zahl...");
        }
        return result;
    }

    public static int Pain3Akazuki(String message) {
        System.out.print(message);

        int result = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Hella, es ist keine Zahl...");
            sc.nextLine();
            System.out.print(message);
        }
        result = sc.nextInt();
        sc.nextLine();
        return result;

    }

    public static int Pain4Akazuki(String message, int minValue, int maxValue) {
        System.out.print(message);

        int result = Integer.MIN_VALUE;
        while (result < minValue || result > maxValue) {
            while (!sc.hasNextInt()) {
                System.out.println("Hollo, es ist keine Zahl...");
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

