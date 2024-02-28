package demian.week01.day01;

public class Aufgaben {
    public static void main(String[] args) {

        //Aufgabe Print A

        System.out.println("Hello World!");
        System.out.println("");
        System.out.println("     /--\\ ");
        System.out.println("    / /\\ \\ ");
        System.out.println("   / /  \\ \\ ");
        System.out.println("  / /    \\ \\ ");
        System.out.println(" /  ======  \\ ");
        System.out.println("/_/        \\_\\");

        //Aufgabe Zählen
        // Zähle in einer Schleife von 0 bis inklusive 10 und gib die Zahlen aus.
        //
        //1.Verwende dazu eine for-Schleife
        //2.Verwende dazu eine while-Schleife und erstelle eine separate Zählvariable

        // 1.FOR SCHLEIFE
        System.out.println("Zählen mit for schleife");
        for (int index = 0; index <= 10; index++) {
            System.out.println(index);
        }

        // 2.WHILE SCHLEIFE
        System.out.println("Zählen mit while schleife");
        int index = 0;
        do {
            System.out.println(index);
            index++;

        } while (index < 10);
        System.out.println(index);


        // AUFGABE ZÄHLEN 2: Zähle in einer Schleife von 0 bis exklusive 10 und gib die Zählvariable aus.
        System.out.println("Zählen 2");
        for (int index2 = 0; index2 <= 9; index2++) {
            System.out.println(index2);
        }

        //Aufgabe: Zählen mit Trick
        System.out.println("Zählen mit Trick");

        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);

        }

        //Aufgabe: Rewind
        System.out.println("Aufgabe Rewind");
        for (int i = -10; i <= 10; i++) {
            System.out.println(i);

        }

        System.out.println();
        //AUFGABE: Zeichenkette Ausgeben
        //Erstelle eine Methode die eine bestimmte Anzahl parameterisierbarer Zeichen einer Zeile ausgibt.
        //Aufruf: printChars("x", 10);
        //Ausgabe: xxxxxxxxxx
        System.out.println("Aufgabe: Zeichenkette Ausgeben");
        printChars("x", 10);

        System.out.println();
        System.out.println();
        System.out.println();
        //AUFGABE: Quadrat Ausgeben
        //Erstelle eine Methode welche ein Quader mit variabler Größe und mit angegebenem Zeichen ausgibt.
        //Aufruf: printSquare("x", 10);
        //Ausgabe: xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        System.out.println("Aufgabe: Quadrat Ausgeben");
        printSquare("x", 10);


        System.out.println();
        System.out.println();
        System.out.println();
        //AUFGABE: Rechteck Ausgeben
        //Erstelle eine Methode welche ein Viereck mit variabler Größe und mit angegebenem Zeichen ausgibt.
        //Aufruf: printReqt("x", 10, 5);
        //Ausgabe: xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx
        //         xxxxxxxxxx

        System.out.println("Aufgabe: Rechteck Ausgeben");
        printReqt("A", 10, 5);


        System.out.println();
        System.out.println();
        System.out.println();
        //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
        //Aufruf: printTriangleBottomLeft("x", 4);
        //Ausgabe: x
        //         xx
        //         xxx
        //         xxxx
        System.out.println("Aufgabe: Dreieck mit Ecke links unten");
        printTriangleBottomLeft("X", 5);


        System.out.println();
        System.out.println();
        System.out.println();
        //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
        //Aufruf: printTriangleTopLeft("x", 4);
        //Ausgabe: xxxx
        //         xxx
        //         xx
        //         x
        System.out.println("Aufgabe: Dreieck mit Ecke links oben");
        printTriangleTopLeft("x", 5);

        System.out.println();
        System.out.println();
        System.out.println();
        //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
        //Aufruf: printTriangleTopRight("x", 4);
        //Ausgabe: xxxx
        //          xxx
        //           xx
        //            x
        System.out.println("Aufgabe: Dreieck mit Ecke rechts oben");
        printTriangleTopRight("X",5);


        //Ausgabe: xxxxxxxxxx
        //         x        x
        //         x        x
        //         x        x
        //         x        x
        //         x        x
        //         x        x
        //         x        x
        //         x        x
        //         x        x
        //         xxxxxxxxxx


    }

    public static void printChars(String Zeichen, int Zahl) {
        for (int i = 0; i <= Zahl; i++) {
            System.out.print("x");
        }
    }

    public static void printSquare(String Zeichen, int Zahl) {
        for (int a = 0; a <= Zahl; a++) {
            for (int i = 0; i <= Zahl; i++) {
                System.out.print("x");
            }
            ;
            System.out.println();

        }
    }

    public static void printReqt(String Zeichen, int breite, int hoehe) {
        for (int i = 1; i <= hoehe; i++) {
            for (int a = 1; a <= breite; a++) {
                System.out.print(Zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String Zeichen, int Schenkellaenge) {
        for (int i = 1; i <= Schenkellaenge; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print(Zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String Zeichen, int Schenkellaenge) {
        for (int Spalten = 0; Spalten <= Schenkellaenge; Spalten++) {
            for (int Zeile = 1; Zeile <= Schenkellaenge -Spalten; Zeile++) {
                System.out.print(Zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String Zeichen, int Schenkellaenge){
        for (int Spalte = 0; Spalte <= Schenkellaenge; Spalte++){
            for (int Zeile = 1; Zeile <= Schenkellaenge; Zeile++){
                if (Zeile > Spalte){
                    System.out.print(Zeichen);
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    }

}
