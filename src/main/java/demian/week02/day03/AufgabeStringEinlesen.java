package demian.week02.day03;

import java.io.InputStream;
import java.util.Scanner;

public class AufgabeStringEinlesen {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Aufgabe: Lies mit Hilfe des berühmten Scanners einen String des Benutzers ein und gib diesen aus.

        System.out.println("Bitte geben Sie mir hier Informationen ==> ");
        String Userinput = sc.nextLine();
        System.out.println("Ihre Eingabe lautet: "+Userinput);

    }
}
