package christian.week01.trash;

public class dustbinWeek01 {
    public static void main(String[] args) {

    }

    public static String printSquareString(char a, int count) {
        String solution = "";
        boolean first = true;
        int globalCount = 0;
        while (globalCount <= count) {
            if (first == true) {
                for (int i = 0; i < count; i++) {
                    solution += a;
                    first = false;
                    globalCount++;
                }

            } else {
                for (int i = 0; i < count - 1; i++) {
                    solution += "\n";
                    globalCount++;
                    for (int j = 0; j < count; j++) {
                        solution += a;
                    }
                }
            }

        }
        return solution;
    }
    // unnötig kompliziert + funktioniert nicht mit count 2
    public static String printEmptySquare(char a, int count) {
        String solution = "";
        int globalCount = 1;
        for (int i = 0; i < count; i++) {
            if (globalCount == 1 || globalCount == count) {
                for (int k = 0; k < count; k++) {
                    solution += a;
                }

            } else {
                solution += a;
                for (int j = count - 2; j > 0; j--) {
                    solution += " ";
                }
                solution += a;
            }
            globalCount += 1;
            solution += "\n";
        }
        return solution;
    }
    //Dreieck Rechts unten ohne Stringbuilder
    public static String printTriangleBottomRight(char a, int count) {
        String solution = "";
        int leerZeichenAnzahl = count - 1;
        int zeichenAnzahl = count - leerZeichenAnzahl;
        for (int i = count; i > 0; i--) {
            for (int j = leerZeichenAnzahl; j > 0; j--) {
                solution += " ";
            }
            for (int k = zeichenAnzahl; k > 0; k--) {
                solution += a;
            }
            leerZeichenAnzahl -= 1;
            zeichenAnzahl += 1;
            solution += "\n";
        }
        return solution;
    }
    //  ausgefüllte Dreieck linksunten
    public static String printXTriangleBottomLeft(char xChar, int count) {
        String solution = "";
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (col == 0 || row == count - 1 || row == col || col < row) {
                    solution += xChar;
                } else {
                    solution += ".";
                }
            }
            solution += "\n";
        }
        return solution;
    }

    //  ausgefüllte Dreieck linksoben
    public static String printXTriangleTopLeft(char xChar, int count) {
        String solution = "";
        //
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (row + col < count) {
                    solution += xChar;
                } else {
                    solution += ".";
                }
            }
            solution += "\n";
        }
        return solution;
    }
}
