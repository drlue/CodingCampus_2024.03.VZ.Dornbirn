package demian.week02.day03;

import java.util.Scanner;

public class AufgabeMenu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //AUFGABE:
        //Erstelle ein Menü dass über die Konsole gesteuert werden kann.
        //Durch dieses Menü können die verschiedenen geometrischen Programme ausgewählt und ausgeführt werden.
        //Hierbei kann auf die Methode der vorhergehenden Aufgabe zurückgegriffen werden.

        //  BSP.:
        //        Willkommen bei meinen Aufgaben!
        //        Was möchten Sie zeichnen?
        //          1) Christbaum
        //          2) Quader
        //          3) Rhombus
        //        Bitte wählen Sie nun?
        //          >>>2
        //        Wie groß soll der Quader sein?
        //          >>>4
        //        Welches Zeichen soll verwendet werden?
        //          >>>*
        //          ****
        //          *  *
        //          *  *
        //          ****
        //        Möchten Sie noch etwas zeichnen? (j/n)
        //          >>>n
        //        Auf Wiedersehen!

        System.out.println("============================================= ");
        System.out.println("=================MENÜ======================== ");
        System.out.println("============================================= ");
        System.out.println();
        System.out.println("Wilkommen bei meinen Aufgaben!\nWas möchten Sie zeichnen?");
        System.out.println();
        System.out.println("   1)Dreieck\n   2)Quader\n   3)Rhombus\n");

        //FORMAUSWAHL:

        boolean resultOK = false;
        int userinputNUM = 0;

        while (!resultOK) {
            System.out.print("HIER AUSWAHL TREFFEN ==>");
            try {
                String userinput = sc.nextLine();
                userinputNUM = Integer.parseInt(userinput);
                if (userinputNUM >= 1 && userinputNUM <= 3) {
                    resultOK = true;

                } else {
                    System.out.println("Es stehen nur 1,2 oder 3 zur Verfügung ");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es wurde keine Zahl eingeben");
            }
        }

        //GROESSENAUSWAHL:

        String formname = "";
        if (userinputNUM == 1) {
            formname = "das Dreieck";
        } else if (userinputNUM == 2) {
            formname = "der Quader";
        } else {
            formname = "der Rhombus";
        }

        System.out.println("Wie groß soll " + formname + " sein (0-30) ?");
        resultOK = false;
        userinputNUM = 0;

        while (!resultOK) {
            System.out.print("HIER AUSWAHL TREFFEN ==>");
            try {
                String userinput = sc.nextLine();
                userinputNUM = Integer.parseInt(userinput);
                if (userinputNUM >= 1 && userinputNUM <= 30) {
                    resultOK = true;

                } else {
                    System.out.println("Nur Groesse von 0-30 moeglich");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es wurde keine Zahl eingeben");
            }
        }
    }
}
