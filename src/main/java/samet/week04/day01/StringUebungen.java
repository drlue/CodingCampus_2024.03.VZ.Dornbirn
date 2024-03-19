package samet.week04.day01;

import java.util.Scanner;

public class StringUebungen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();

        System.out.println("== " + (word == word2));
        System.out.println("equals " + (word.equals(word2)));


// Wenn wir mit der String Klasse arbeiten immer "equals" benutzen und nicht ==. Equals vergleicht ob der String exakt identlisch ist,
// == Vergleicht nur den Speicherplatz.




    }
}
