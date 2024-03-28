package demian.allmethods;

import java.util.Random;


public class AllMethods {

    public static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {

    }

    /////////////////////////////////////////
    ////////////////PRINT////////////////////
    ////////////STRUCTURES///////////////////
    /////////////////////////////////////////
    /////////////////////////////////////////

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

    /////////////////////////////////////////
    ////////////////CONSOLE//////////////////
    ///////////////////INPUT/////////////////
    /////////////////////////////////////////
    /////////////////////////////////////////
    /////////////////////////////////////////

    public static int getINT(String messageTOuser, int minVAL, int maxVAL) {
        int result = Integer.MIN_VALUE;
        String txt;
        while (result == Integer.MIN_VALUE) {
            try {
                System.out.print(messageTOuser);
                txt = sc.nextLine();
                result = Integer.parseInt(txt);
                if (result < minVAL || result > maxVAL) {
                    System.out.printf("Nur Werte zwischen %d und %d sind zulaessig \n", minVAL, maxVAL);
                    result = Integer.MIN_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Eingegebener Wert ist keine Zahl");
            }
        }
        return result;
    }

    /////////////////////////////////////////
    ////////////////ARRAY////////////////////
    /////////////////////////////////////////
    /////////////////////////////////////////
    /////////////////////////////////////////
    /////////////////////////////////////////


    // Durchsucht den String Array und gibt die kürzeste String Länge als integer zurück
    public static int minLength(String[] arr) {
        int minLength = Integer.MAX_VALUE;
        for (int idx = 0; idx < arr.length - 1; idx++) {
            if (arr[idx].length() < minLength) {
                minLength = arr[idx].length();
            }
        }
        return minLength;
    }


    public static int[][] random2DArray(int rows, int cols, int randomNUMbound) {
        Random random = new Random();
        int[][] array = new int[rows][cols];
        for (int idxrow = 0; idxrow < rows; idxrow++) {
            for (int idxcol = 0; idxcol < cols; idxcol++) {
                array[idxrow][idxcol] = random.nextInt(randomNUMbound);
            }
        }
        return array;
    }

    public static void print2DArray(int[][] twoDimensionalarray) {

        for (int idxrow = 0; idxrow < twoDimensionalarray.length; idxrow++) {
            System.out.print("R" + idxrow);
            for (int idxcol = 0; idxcol < twoDimensionalarray[0].length; idxcol++) {
                System.out.printf("%5d", twoDimensionalarray[idxrow][idxcol]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int sumOFrow(int[][] array, int row) {
        int sum = 0;
        for (int idx = 0; idx < array[0].length; idx++) {
            sum += array[row][idx];
        }
        return sum;
    }

    public static int sumOFcol(int[][] array, int col) {
        int sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx][col];
        }
        return sum;
    }

    public static int[][] create2DArrayCanvas(int rows, int cols, int canvas) {
        int[][] array2D = new int[rows][cols];
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[0].length; col++) {
                array2D[row][col] = canvas;
            }
        }
        return array2D;
    }

    // PRINT COLUMN NAMES OVER ARRAY
    public static void printARRAYheader(int[][] array) {
        System.out.print("    ");
        for (int col = 0; col < array[0].length; col++) {
            System.out.printf("|C" + col + "|  ");
        }
        System.out.println();
    }

    public static int giveBackLongestLength(String[] stringarray) {
        int longest = 0;
        for (String element : stringarray) {
            if (element.length() > longest) {
                longest = element.length();
            }
        }
        return longest;
    }


}
