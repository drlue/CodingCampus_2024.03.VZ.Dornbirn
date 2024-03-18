package lukas.week04;

import java.util.Scanner;

public class StringComparison {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();

        System.out.println("== "+(word == word2)); //falsch, da der Speicherplatz verglichen wird
        System.out.println("equals "+(word.equals(word2))); //true

        System.out.println("Hallo == Hallo? "+ ("Hallo" == "Hallo")); //true da String nicht in einer Variable gespeichert?
        System.out.println("Hallo equals Hallo? "+ ("Hallo".equals("Hallo"))); //true
    }



}
