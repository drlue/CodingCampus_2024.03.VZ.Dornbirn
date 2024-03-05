package christian.week02.day02;

import java.util.Scanner;

public class StringOderIntEinlesenUndAusgeben {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Der eingegebene String ist: "+"\n" + stringReader("Gib einen String ein: "));
    }
    public static String stringReader (String message){
        System.out.println(message);
        String text = sc.nextLine();
        return text;
    }

}
