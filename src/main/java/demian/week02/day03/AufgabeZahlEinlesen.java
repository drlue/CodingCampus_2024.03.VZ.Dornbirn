package demian.week02.day03;

import java.util.Scanner;

public class AufgabeZahlEinlesen {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Aufgabe: Lies mit Hilfe des berühmten Scanners einen int des Benutzers ein und gib diese aus.

        System.out.print("Bitte eine Zahl hier eingeben ==> ");

        //Version 1: Wird keine Zahl eingegeben kann das Programm abstürzen

//       String userinput = sc.nextLine();
//       int number = Integer.parseInt(userinput);
//       System.out.println("Ihre eingegebene Zahl lautet: " + number);

        //Version 2:Frag solange nach einer Zahl bis auch eine eingegeben wurde, das Programm darf bei Fehleingabe nicht abstürzen


        boolean resultOK = false;
        while(resultOK == false){
        try {
            String userinput = sc.nextLine();
            int number = Integer.parseInt(userinput);
            System.out.println("Ihre eingegebene Zahl lautet: " + number);
            resultOK = true;
        } catch (NumberFormatException nfe){
            System.out.println("Ungueltige Eingabe (Nur Ganzzahlen erlaubt)");
            System.out.print("Bitte eine Zahl hier eingeben ==> ");
            resultOK = false;
        }
            }

    }
}
