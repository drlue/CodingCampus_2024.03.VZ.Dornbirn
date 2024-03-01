package christian.week01.day01;

public class Methods {
    public static void main(String[] args) {

        System.out.println(printEmptySquare('x', 3));
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
