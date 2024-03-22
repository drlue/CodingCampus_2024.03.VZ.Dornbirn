package katherina.week04.day01;

import java.util.Arrays;
import java.util.Scanner;

public class StringSpielwiese {
    public static void main(String[] args) {

        String[] names = new String[]{"Joachim", "Mert", "Eric"};
        bubblesortAbisZett(names);
        System.out.println(">> Nach Alphabet sortiert, aufsteigend. <<");

        String[] names2 = {"Susan", "Thomas", "Judith", "Daniel", "Eva", "Ben",
                "Antonia", "Paul"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();

        System.out.println("== " + (word == word2));
        System.out.println("equals " + (word.equals(word2)));*/
//Aufgabenstellung fragt: Warum ist: word == word2 false, und word.equals(word2) true?
//Antwort: IntelliJ schlägt mir vor, den String-Vergleich mit == durch den Vergleich mit equals auf einen Klick zu ersetzen.
//Ich schließe daraus, dass es sich nicht um einen erlaubten/gültigen Operator für Strings handelt.

     //   System.out.println("Hallo" == "Hallo");
//Frage: Warum ist folgender Ausdruck wahr?
        //Ich hätte jetzt vermutet, dass das daran liegt, dass hier die Strings nicht in eine Variable gepackt wurden, sondern als Plaintext.




    }

    private static void bubblesortAbisZett(String[] names) {
            for (int index = 0; index < names.length; index++) {
                for (int jane = 0; jane < names.length - index - 1; jane++) {
                    if (names[jane].length() > names[jane + 1].length()) {
                        String temp = names[jane];
                        names[jane] = names[jane + 1];
                        names[jane + 1] = temp;
                    }
                }
            }
        }


    }
