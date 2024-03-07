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
        String answer = null;
        do {
            System.out.println("Was möchten Sie zeichnen?");
            System.out.println();
            System.out.println("   1)Dreieck\n   2)Rechteck\n   3)Rhombus\n");

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
                formname = "das Rechteck";
            } else {
                formname = "der Rhombus";
            }

            System.out.println("Wie groß soll " + formname + " sein (0-30) ?");
            resultOK = false;
            int userinputNUM2 = 0;

            while (!resultOK) {
                System.out.print("HIER AUSWAHL TREFFEN ==>");
                try {
                    String userinput = sc.nextLine();
                    userinputNUM2 = Integer.parseInt(userinput);
                    if (userinputNUM2 >= 1 && userinputNUM2 <= 30) {
                        resultOK = true;

                    } else {
                        System.out.println("Nur Groesse von 0-30 moeglich");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Es wurde keine Zahl eingeben");
                }
            }


            //ZEICHENAUSWAHL

            System.out.println(formname + " wird mit einem Buchstaben gezeichnet\nWas fuer ein Buchstabe soll zum zeichnen verwendet werden?");
            System.out.print("HIER AUSWAHL TREFFEN ==>");
            String userinput3 = sc.nextLine();

            if (userinputNUM == 1) {
                demian.week01.day01.AufgabenMethodenUNDschleifen.printTriangleBottomLeft(userinput3, userinputNUM2);
            } else if (userinputNUM == 2) {
                demian.week01.day01.AufgabenMethodenUNDschleifen.printEmptySquare(userinput3, userinputNUM2);
            } else if (userinputNUM == 3) {
                demian.week01.day01.AufgabenMethodenUNDschleifen.printrhombus(userinput3, userinputNUM2);
            }

            //ZURÜCK ZUM MENÜ
            System.out.println("Möchten Sie noch etwas Zeichnen (J/N) ? ");
            while (true) {
                answer = sc.nextLine();
                if (answer.equals("J") || answer.equals("j")) {
                    break;
                } else {
                    System.out.println("Keine Gültige Eingabe. Möglichkeiten: J,j,N,n");
                }
            }
        }
        while (answer.equals("J") || answer.equals("j"));
    }
}
