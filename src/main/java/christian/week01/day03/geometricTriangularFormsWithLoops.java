package christian.week01.day03;

public class geometricTriangularFormsWithLoops {
    public static void main(String[] args) {

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
    //  ausgefüllte Dreieck rechtsoben
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

    //  ausgefüllte Dreieck rechtsunten
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

}
