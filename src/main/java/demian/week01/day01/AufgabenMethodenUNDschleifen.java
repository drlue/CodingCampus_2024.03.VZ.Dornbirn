package demian.week01.day01;

public class AufgabenMethodenUNDschleifen {
    public static void main(String[] args) {

        //Aufgabe Print A

        System.out.println("Hello World!");
        System.out.println();
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

        } while (index < 11);
        System.out.println(index);


        // AUFGABE ZÄHLEN 2: Zähle in einer Schleife von 0 bis exklusive 10 und gib die Zählvariable aus.
        System.out.println("Zählen 2");
        for (int index2 = 0; index2 < 10; index2++) {
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

        ////////////////////////////////////////
        ///////////METHODEN AUFGABE/////////////
        ////////////////////////////////////////

        System.out.println();
        System.out.println("Aufgabe: Zeichenkette Ausgeben");
        printChars("x", 10);

        System.out.println();
        System.out.println("Aufgabe: Quadrat Ausgeben");
        printSquare("x", 10);

        System.out.println();
        System.out.println("Aufgabe: Rechteck Ausgeben");
        printReqt("A", 10, 5);

        System.out.println();
        System.out.println("Aufgabe: Dreieck mit Ecke links unten");
        printTriangleBottomLeft("X", 5);

        System.out.println();
        System.out.println("Aufgabe: Dreieck mit Ecke links oben");
        printTriangleTopLeft("x", 5);

        System.out.println();
        System.out.println("Aufgabe: Dreieck mit Ecke rechts oben");
        printTriangleTopRight("X", 5);

        System.out.println();
        System.out.println("Aufgabe: Dreieck mit Ecke rechts unten");
        printTriangleBottomRight("x", 5);

        System.out.println();
        System.out.println("Aufgabe: \nPrint Empty Square");
        printEmptySquare("X", 10);
        System.out.println();
        printEmptySquare("A", 3);

        System.out.println();
        System.out.println("Aufgabe: Triangle");
        printTriangle("A", 5);

        System.out.println();
        System.out.println("Rhombus");
        printrhombus("A", 10);

        System.out.println();
        System.out.println("Rhombus vereinfachtes Programm");
        printrhombusEINFACH("X", 8);


    }


    //AUFGABE: Zeichenkette Ausgeben
    //Erstelle eine Methode die eine bestimmte Anzahl parameterisierbarer Zeichen einer Zeile ausgibt.
    //Aufruf: printChars("x", 10);
    //Ausgabe: xxxxxxxxxx
    public static void printChars(String Zeichen, int Zahl) {
        for (int i = 0; i <= Zahl; i++) {
            System.out.print(Zeichen);
        }
    }


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
    public static void printSquare(String zeichen, int zahl) {
        for (int a = 0; a < zahl; a++) {
            for (int i = 0; i < zahl; i++) {
                System.out.print(zeichen);
            }

            System.out.println();


        }
    }


    //AUFGABE: Rechteck Ausgeben
    //Erstelle eine Methode welche ein Viereck mit variabler Größe und mit angegebenem Zeichen ausgibt.
    //Aufruf: printReqt("x", 10, 5);
    //Ausgabe: xxxxxxxxxx
    //         xxxxxxxxxx
    //         xxxxxxxxxx
    //         xxxxxxxxxx
    //         xxxxxxxxxx
    public static void printReqt(String Zeichen, int breite, int hoehe) {
        for (int i = 0; i < hoehe; i++) {
            for (int a = 0; a < breite; a++) {
                System.out.print(Zeichen);
            }
            System.out.println();
        }
    }


    //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
    //Aufruf: printTriangleBottomLeft("x", 4);
    //Ausgabe: x
    //         xx
    //         xxx
    //         xxxx
    public static void printTriangleBottomLeft(String Zeichen, int Schenkellaenge) {
        for (int i = 0; i < Schenkellaenge; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print(Zeichen);
            }
            System.out.println();
        }
    }


    //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
    //Aufruf: printTriangleTopLeft("x", 4);
    //Ausgabe: xxxx
    //         xxx
    //         xx
    //         x
    public static void printTriangleTopLeft(String Zeichen, int Schenkellaenge) {
        for (int rowx = 0; rowx < Schenkellaenge; rowx++) {
            for (int col = 0; col < Schenkellaenge - rowx; col++) {
                System.out.print(Zeichen);
            }
            System.out.println();
        }
    }

    //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
    //Aufruf: printTriangleTopRight("x", 4);
    //Ausgabe: xxxx
    //          xxx
    //           xx
    //            x
    public static void printTriangleTopRight(String zeichen, int schenkellaenge) {
        for (int zeile = 0; zeile < schenkellaenge; zeile++) {
            for (int spalte = 0; spalte < schenkellaenge; spalte++) {
                if (spalte >= zeile) {
                    System.out.print(zeichen);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    }

    //AUFGABE: Erstelle eine Methode welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
    //Aufruf printTriangleBottomRight("x", 4);
    //Ausgabe:    x
    //           xx
    //          xxx
    //         xxxx
    public static void printTriangleBottomRight(String zeichen, int schenkellaenge) {
        for (int row = 0; row < schenkellaenge; row++) {
            for (int col = 0; col < schenkellaenge; col++) {
                if (col < (schenkellaenge - row - 1)) {
                    System.out.print('.');
                } else {
                    System.out.print(zeichen);
                }
            }
            System.out.println();
        }
    }

    //AUFGABE: Erstelle eine Methode welche ein Quader mit variabler Größe und mit angegebenem Zeichen ausgibt.
    //Aufruf: printEmptySquare("x", 10);
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
    public static void printEmptySquare(String zeichen, int laenge) {
        for (int row = 0; row < laenge; row++) {
            for (int col = 0; col < laenge; col++) {
                if (row == 0 || row == (laenge - 1) || col == 0 || col == (laenge - 1)) {
                    System.out.print(zeichen);
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }


    /* AUFGABE: Print Slash
    Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,
    weiters soll der Parameter backslash angegeben werden können.
    Wenn backslash wahr ist, soll die Diagonale von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.

    Aufruf:
    printSlash("x", 3, true);
    Ausgabe:
    x
     x
      x
    printSlash("y", 4, false);
     */

    /* AUFGABE: Triangle
    Erstelle eine Methode welche ein Dreieck von variabler Größe und mit angegebene Zeichen ausgibt.
    Dabei sollen die angegebene Größe die Höhe des Dreiecks sein. Nimm an dass die Zahl immer Ungerade ist.

    AUFRUF: printTriangle("x", 3);
    */
    public static void printTriangle(String zeichen, int hoehe) {
        for (int row = 0; row < hoehe; row++) {
            for (int col = 0; col < (2 * hoehe - 1); col++) {
                if (row + 4 == col) {
                    System.out.print("A");
                } else if (row == hoehe - 1) {
                    System.out.print("C");

                } else if (row + col == hoehe - 1) {
                    System.out.print("B");

                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    public static void printrhombus(String text, int size) {
        for (int row = 0; row < 2 * size - 1; row++) {
            for (int col = 0; col < 2 * size - 1; col++) {
                if (row + col == size - 1) {
                    System.out.print('A');
                } else if (col == row + size - 1) {
                    System.out.print("B");
                } else if (col + size - 1 == row) {
                    System.out.print("C");
                } else if (row + col == 3 * size - 3) {
                    System.out.print("D");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void printrhombusEINFACH(String text, int size) {
        for (int row = 0; row < 2 * size - 1; row++) {
            for (int col = 0; col < 2 * size - 1; col++) {
                if (row + col == size - 1 ||
                        col == row + size - 1 ||
                        col + size - 1 == row ||
                        row + col == 3 * size - 3) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


}
