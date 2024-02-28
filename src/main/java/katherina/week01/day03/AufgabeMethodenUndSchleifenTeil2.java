package katherina.week01.day03;

public class AufgabeMethodenUndSchleifenTeil2 {
    public static void main(String[] args) {
        System.out.println("\nprintEmptySquare");
        printemptySquare("x ", 10);
        System.out.println("\nprintEmptySquare2");
        printemptySquare2("A", 3);
        System.out.println("\nprintSlash");
        printSlash("x ", 3, true);
        System.out.println("\nprintSlash2");
        printSlash("y ", 4, false);
        System.out.println("\nprintTriangle");
        printTriangle("x ", 3);
        System.out.println("\nprintTriangle");
        printTriangle("x ", 5);
        System.out.println("\nprintTriangle");
        printTriangle("x ", 1);
    }

    public static void printemptySquare(String text, int size) {
        for (int reihe = 0; reihe < size; reihe++) {
            for (int buchstabe = 0; buchstabe < size; buchstabe++) {
                if (buchstabe == 0 || reihe == 0 || reihe == size - 1 || buchstabe == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    //Merke: Wenn in einer if-else-Kontrollschleife Bedingungen mittels oder definiert werden, darf ein = nie allein stehen. Sonst will die Software
    // eine boolean-Variable daraus machen und das ist meist nicht Sinn der Übung. Betonung liegt auf meist, weil vielleicht manchmal ja doch.

    public static void printemptySquare2(String text, int size) {
        for (int reihe = 0; reihe < size; reihe++) {
            for (int buchstabe = 0; buchstabe < size; buchstabe++) {
                if (buchstabe == 0 || reihe == 0 || reihe == size - 1 || buchstabe == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printSlash(String text, int size, boolean b) {
        if (b) {
            printSlashBackward(text, size);
        } else {
            printSlashForward(text, size);
        }
    }
    //Im Grunde genommen kann ich mit dieser Funktion sagen: Zeig mir mal Variante 1 und Variante 2. Ich habe die jeweiligen Funktionen einzeln gebaut und dann kann ich sie über einen Schalter "zusammenführen".
    //Das werde ich gleich mit verschiedengroßen Dreiecken selbst ausprobieren. (Siehe "Die Rückkehr der Dreiecke")

    public static void printSlashForward(String text, int size) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int spalte = 0; spalte < size; spalte++) {
                if (reihe == spalte) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }

    public static void printSlashBackward(String text, int size) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int spalte = 0; spalte < size; spalte++) {
                if (reihe + spalte == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }

    //Episode III: Die Rückkehr der Dreiecke!
    //Ich habe hier so viel Spaß!

    public static void printTriangle(String text, int size) {
        for (int reihe = 0; reihe < size; reihe++) {
            for (int spalte = 0; spalte < 2*size-1; spalte++) {

            }
            System.out.println();
        }
    }
}

