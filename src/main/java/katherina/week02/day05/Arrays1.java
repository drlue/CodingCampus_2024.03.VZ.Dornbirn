package katherina.week02.day05;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int zahl = Arrays1.zahlEinlesen("Bitte gib die gewüschte Anzahl der Schubladen ein! ", 0, 1000);
        System.out.printf("Du hast nun %d Schubladen: ", zahl);
        int[] schublade = new int[zahl];
        for (int position = 0; position < schublade.length; position++) {
            schublade[position] = position + 1;
        }
        System.out.println(Arrays.toString(schublade));

        int[] gedrehteSchublade = new int[zahl];
        for (int position = 0; position < gedrehteSchublade.length; position++) {
            gedrehteSchublade[position] = gedrehteSchublade.length - position;
        }
        System.out.println(Arrays.toString(gedrehteSchublade));


        int[] kopie = kopieren(schublade);
        kopie[0] = 100;
        System.out.println("test: " + Arrays.toString(schublade));
        System.out.println("copy: " + Arrays.toString(kopie));
        //Ich lege ein(en?) Integer-Array an. Diesem weise ich die Methode "kopieren" zu, und als Objekt der Methode mein Array "schublade".
        //Dabei belege ich im Integer-Array namens "kopie" die Position 0 mit dem Wert "100" (darf beliebiger Wert sein, Hauptsache ersichtlich geändert!)
        //-> damit überschreibe ich den originalen Wert, der von der Methode darunter eigentlich belegt wurde.
        // Um zu testen, ob das funktioniert hat, gebe ich einmal die Werte des originalen Arrays aus, und einmal die veränderten.
    }

    public static int[] kopieren(int[] original) {
        int[] result = new int[original.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = original[i];
        }
        return result;
    }
    //Das ist die Hilfsmethode, damit "kopieren" auch tatsächlich die oben genannte Funktion ausübt. (Mache "kopieren" mit dem Integer-Array namens original)
    //Für das neu angelegte Integer-Array "result" gilt: Es ist exakt genauso lang, wie das original-Array lang ist.
    //Die Elemente darin sollen so lange um eins weiterzählen, bis diese Länge erreicht ist und auch sonst identisch zu den Elementen in "original" sein.
    //Nun, bis auf das eine Element in der einen Position, das ich oben händisch überschrieben habe!


    public static int zahlEinlesen(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int zahl = Integer.MIN_VALUE;
        while (zahl < mindestwert || zahl > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Hier muss eine Zahl stehen!");
                sc.nextLine();
                System.out.print(message);
            }
            zahl = sc.nextInt();
            sc.nextLine();
            if (zahl < mindestwert || zahl > maximalwert) {
                System.out.printf("Gib eine Zahl zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return zahl;
    }

}
