package christian.week01.day01;

public class Methods {
    public static void main(String[] args) {

        System.out.println(printEmptySquare('x', 3));
    }

    public static String charXCount(char a, int count) {
        String solution = "";
        for (int i = count; i > 0; i--) {
            solution += a;
        }
        return solution;
    }

    public static void printSquare(char a, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println();
            for (int j = 0; j < count; j++) {
                System.out.print(a);
            }

        }
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

    public static void printRectangle(char a, int counthorizontal, int countvertical) {
        for (int i = 0; i <= countvertical - 1; i++) {
            System.out.println();
            for (int j = 0; j <= counthorizontal; j++) {
                System.out.print(a);
            }
        }
    }

    public static String printTriangleBottomLeft(char a, int count) {
        String solution = "";
        for (int i = 0; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                solution += a;

            }
            solution += "\n";
        }
        return solution;
    }

    public static String printTriangleTopLeft(char a, int count) {
        String solution = "";
        for (int i = count; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                solution += a;
            }
            solution += "\n";
        }
        return solution;
    }

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
    // bessere practice

}
