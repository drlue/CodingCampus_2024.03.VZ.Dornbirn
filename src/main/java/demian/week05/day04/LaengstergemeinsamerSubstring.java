package demian.week05.day04;

import java.util.Scanner;

public class LaengstergemeinsamerSubstring {

    public static void main(String[] args) {

        //Aufgabe:Der Anwender soll zwei Strings eingeben. Finde den längsten gemeinsamen Substring beider Strings.
        //
        //Finde das längste gemeinsame Wort
        //Erstelle aussagekräftige Unittests
        //Bonus finde die längste gemeinsame Zeichenkette
        //Erstelle aussagekräftige Unittests
        //Ausgabe 1
        //
        //Bitte gib Wort 1 ein:
        //>>>Hallo wie gehts dir?
        //Bitte gib Wort 2 ein:
        //>>>Mir gehts gut!
        //längster gemeinsamer Substring:
        //gehts
        //Ausgabe 2 (Bonus)
        //
        //Bitte gib Wort 1 ein:
        //>>>Barbara
        //Bitte gib Wort 2 ein:
        //>>>Rhabarber
        //längster gemeinsamer Substring:
        //bar

        System.out.print("Geben sie einen Text ein ==>");

        Scanner sc = new Scanner(System.in);

        String UserinputONE = sc.nextLine();
        String[] UserinputONEsplit = UserinputONE.split(" ");
        int longestwordcount = 0;
        String longestwordINPUT1 = "";
        for (int idx = 0; idx < UserinputONEsplit.length; idx++) {
            if (UserinputONEsplit[idx].length() > longestwordcount) {
                longestwordINPUT1 = UserinputONEsplit[idx];
                longestwordcount = UserinputONEsplit[idx].length();
            }
        }

        System.out.print("Geben sie hier einen aehnlichen Text ein ==>");

        String UserinputTWO = sc.nextLine();
        int longestwordcount2 = 0;
        String longestwordINPUT2 = "";
        String[] UserinputTWOsplit = UserinputTWO.split(" ");
        for (int idx = 0; idx < UserinputTWOsplit.length; idx++) {
            if (UserinputTWOsplit[idx].length() > longestwordcount2) {
                longestwordINPUT2 = UserinputTWOsplit[idx];
                longestwordcount2 = UserinputTWOsplit[idx].length();
            }
        }

        if (longestwordINPUT1.equals(longestwordINPUT2)){
            System.out.println("Das laengste gemeinsame Wort ist: " + longestwordINPUT1);
        } else {
            System.out.println("Das laengste Wort aus Satz eins ist: " + longestwordINPUT1);
            System.out.println("DAs laengste Wort aus Satz zwei ist: " + longestwordINPUT2);

        }

    }

}
