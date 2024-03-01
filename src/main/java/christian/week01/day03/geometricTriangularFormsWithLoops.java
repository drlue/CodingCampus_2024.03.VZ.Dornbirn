package christian.week01.day03;

public class geometricTriangularFormsWithLoops {
    public static void main(String[] args) {
        System.out.println(printTriangleTopLeft('x',5));

    }
    //Dreieck Links unten ohne Stringbuilder
    public static String printTriangleBottomLeft(char a, int count) {
        String solution = "";
        for (int row = 0; row <= count; row++) {
            for (int col = 1; col <= row; col++) {
                solution += a;

            }
            solution += "\n";
        }
        return solution;
    }
    //Dreieck Links unten mit Stringbuilder
    public static String printTriangleBottomLeftStrBuilder(char a, int count) {
        String solution = "";
        StringBuilder solutionB = new StringBuilder();
        for (int row = 0; row <= count; row++) {
            for (int col = 1; col <= row; col++) {
                solutionB.append(a);

            }
            solutionB.append(" ");
        }
        solution = solutionB.toString();
        return solution;
    }
    //Dreieck Links oben ohne Stringbuilder
    public static String printTriangleTopLeft(char a, int count) {
        String solution = "";
        for (int row = count; row > 0; row--) {
            for (int col = row; col > 0; col--) {
                solution += a;
            }
            solution += "\n";
        }
        return solution;
    }
    // Dreieck Rechts oben ohne Stringbuilder
    public static String printXTriangleTopRight(char xChar, int count) {
        String solution = "";
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (col == count - 1 || row == 0 || row == col || col > row) {
                    solution += xChar;
                } else {
                    solution += ".";
                }
            }
            solution += "\n";
        }
        return solution;
    }

    // Dreieck Rechts unten ohne Stringbuilder
    public static String printXTriangleBottomRight(char xChar, int count) {
        String solution = "";
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (row == count - 1 || col == count - 1 || row + col > count - 2) {
                    solution += xChar;
                } else {
                    solution += ".";
                }
            }
            solution += "\n";
        }
        return solution;
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

}
