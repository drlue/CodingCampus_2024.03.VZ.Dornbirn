package christian.week02.day02;

import java.util.Scanner;

public class StringOderIntEinlesenUndAusgeben {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Der eingegebene String ist: " + "\n" + stringReader("Gib einen String ein: "));
        System.out.println("Der eingegebene Integer ist" + "\n" + intReaderV2("Gib eine Ganzzahl ein: "));
    }

    public static String stringReader(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static int intReaderV1(String message) {
        System.out.println(message);
        int integer = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Das war keine Ganzzahl!");
            System.out.println(message);
            sc.nextLine();
        }
        integer = sc.nextInt();
        return integer;
    }
    public static int intReaderV2(String message){
        int integer = 0;
        System.out.println(message);
        while (!sc.hasNextInt()) {
            System.out.println("Das war keine Ganzzahl!");
            System.out.println(message);
            sc.next();
        }
        integer = sc.nextInt();
        return integer;
    }

}
