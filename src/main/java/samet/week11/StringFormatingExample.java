package samet.week11;

import java.util.Scanner;

public class StringFormatingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib bitte einen Stadtname ein: ");
        String name = sc.nextLine();

        System.out.printf("(%-10s)%n", name);
        printName(name, 10);
    }

    private static void printName(String txt, int len){
        if (txt.length() > len){
            if (len > 3){
                txt = txt.substring(0, len - 3).concat("...");
            } else {
                txt = txt.substring(0, len);
            }
        }
        String formatString = String.format("[%%-%ds]%%n", len);
        System.out.printf(formatString, txt);
    }
}
