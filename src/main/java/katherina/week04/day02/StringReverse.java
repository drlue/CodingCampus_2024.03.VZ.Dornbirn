package katherina.week04.day02;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Willkommen zum Programm, das dir die Worte auf der Tastatur herumdreht!");
        String text = getTextFromConsole("Bitte gib den Text ein, der umgedreht werden soll:  ");
        System.out.println();
        System.out.println("Teilen wir deine Eingabe mal auf, wie eine Tafel Schokolade:");
        System.out.println();
        System.out.println(Arrays.toString(text.toCharArray()));
        System.out.println("Tada, alles schön gestückelt. \n Und nun ... eine Prise Magie!");
       // String text = "Willkommen zum Programm, das dir die Worte auf der Tastatur herumdreht!".repeat(5000);
        //wiederholt den Vorgang 5000 Mal. (Zum Verwenden "getTextFromConsole auskommentieren!)
        System.out.println("Am Anfang war : " + text);
        char[] arr = text.toCharArray();
        char[] arr2 = text.toCharArray();
   //     long start = System.currentTimeMillis();
        reverseThroughBubble(arr);
//        long end = System.currentTimeMillis();
//        System.out.println((end - start) + " ms by reverseThroughBubble");
//        start = System.currentTimeMillis();
        reverseByGyula(arr2);
//        end = System.currentTimeMillis();
//        System.out.println((end - start) + " ms by reverseByGyula");
        System.out.println(new String(arr));
    }

    public static void reverseByGyula(char[] array){
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            System.out.println(new String(array));
        }
    }
    //Dieser Beispielcode von Gyula tauscht immer jeweils das erste und das letzte eingegebene Zeichen aus und ist innerhalb weniger Milisekunden fertig.

    public static void reverseThroughBubble(char[] array) {
        for (int index = 0; index < array.length -1; index++) {
            for (int jane = 0; jane < array.length - index -1; jane++) {
                char temp = array[jane];
                array[jane] = array[jane + 1];
                array[jane + 1] = temp;
                System.out.println(new String(array));
            }
        }
    }
//Mein Code macht einen Bubblesort und sortiert dabei jeden. einzelnen. Buchstaben einzeln von ganz vorn nach ganz hinten. Das dauert bei längeren
    //Eingaben ziemlich lange.
    //Oben und derzeit auskommentiert findet sich Code, der dazu dient, anhand eines langen Satzes den Zeitunterschied zu messen.

    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }
}
