package katherina.week04.day02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringRandomize {
    public static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    //Es soll ein Wort über die Kommandozeile eingelesen werden, dieses die Buchstaben des Wortes sollen zufällig
    // vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten,
    // erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes,
    // füge es mittels new String(charArray) zusammen und gib es aus.

    public static void main(String[] args) {
        System.out.println("Willkommen zum Programm, das dir die Worte auf der Tastatur durcheinanderweht!");
        String text = getTextFromConsole("Bitte gib den Text ein, der vom Winde verweht werden soll:  ");
        System.out.println();
        System.out.println("Teilen wir deine Eingabe mal auf, wie eine Tafel Schokolade:");
        System.out.println();
        System.out.println(Arrays.toString(text.toCharArray()));
        System.out.println("Tada, alles schön gleichmäßig verteilt. \n Und nun ... eine Prise Chaosmagie!");
        char[] arr = text.toCharArray();
        windy(arr);
        System.out.println(new String(arr));
    }

    public static void windy(char[] array) {
        for (int count = 0; count < 5 + 2* array.length; count++) {
            int pos1 = random.nextInt(array.length);
            int pos2 = random.nextInt(array.length);

            char temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
            System.out.println(new String(array));
        }

    }
//Korrektur sieht vor: Es wird die Position gewürfelt und auf diese Weise werden auch keine Zeichen überschrieben!

    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }
}
