package christian.week01.day01;

public class MethodenRework {
    public static void main(String[] args) {
        System.out.println(printXChars('x', 10));
        System.out.println(printXSquare('x',9));
        printTriangleMiddle('x', 3);
        printRhombus('x', 9);
    }

    // Aufgabe xbeliebige Buchstaben ausgeben
    public static String printXChars(char xChar, int count) {
        String solution = "";
        java.lang.StringBuilder solutionB = new java.lang.StringBuilder(300);
        for (int row = 0; row < count; row++) {
            solutionB.append(xChar);
        }
        solution = solutionB.toString();
        return solution;
    }

    // ausgefülltes Quadrat mit Seitenlänge count ausgeben
    public static String printXSquare(char xChar, int count) {
        String solution = "";
        java.lang.StringBuilder solutionB = new java.lang.StringBuilder();
        for (int row = 0; row < count; row++) {
            solutionB.append(printXChars(xChar, count));
            solutionB.append("\n");

        }
        solution = solutionB.toString();
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



    // leeres Quadrat ausgeben
    public static String printEmptyXSquare(char xChar, int count) {
        String solution = "";
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (row == 0 || col == 0 || row == count - 1 || col == count - 1) {
                    solution += xChar;
                } else {
                    solution += " ";
                }
            }
            solution += "\n";
        }
        return solution;
    }

    //Slash oder Backslash aus Zeichen zeichnen
    public static void printSlash(char xChar, int count, boolean backslash) {
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (backslash && row == col) {
                    System.out.print(xChar);
                } else if (!backslash && row + col == count - 1) {
                    System.out.print(xChar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Dreick symmetrisch aus der Mitte zeichnen
    public static void printTriangleMiddle(char xChar, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height + height - 1; col++) {
                if (col + row == height - 1 || row == height - 1 || (col > height - 1 && row + (height - 1) == col)) {
                    System.out.print(xChar);
                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }

    }

    // Rhombus zeichnen
    public static void printRhombus(char xChar, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                if (col == -row + height / 2 || col == row + (height / 2) || col == row - (height / 2) || col == -row + 3 * (height / 2)) {
                    System.out.print(xChar);
                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }

    public static void printScalableX(char xChar, int height) {
String solution;
java.lang.StringBuilder solutionB = new java.lang.StringBuilder();
    }
}
