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
        printSlash2("y ", 4, false);
        System.out.println("\nprintTriangle");
        printTriangle("x ",3);
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

    public static void printSlash2(String text, int size, boolean b) {
        for (int reihe = 0; size > reihe; reihe++) {
            for (int spalte = 0; spalte < size; spalte++) {
                if (reihe + spalte == size-1) {
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
        for (int reihe = 0; size > reihe; reihe++) {
            for (int spalte = 0; spalte < size; spalte++) {
                if (reihe + spalte == size-1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

    }
}

