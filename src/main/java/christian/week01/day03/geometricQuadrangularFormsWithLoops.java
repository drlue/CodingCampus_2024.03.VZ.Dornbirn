package christian.week01.day03;

public class geometricQuadrangularFormsWithLoops {
    public static void main(String[] args) {

    }

    //X mal char ausgeben ohne Stringbuilder
    public static String charXCount(char a, int count) {
        String solution = "";
        for (int row = count; row > 0; row--) {
            solution += a;
        }
        return solution;
    }

    //X mal char ausgeben mit Stringbuilder
    public static String charXCountStrBuilder(char a, int count) {
        String solution = "";
        StringBuilder solutionB = new StringBuilder();
        for (int row = count; row > 0; row--) {
            solutionB.append(a);
        }
        solution = solutionB.toString();
        return solution;
    }

    // Viereck ausgefüllt ausgeben ohne Rückgabewert
    public static void printSquare(char a, int count) {

        for (int row = 0; row < count; row++) {
            System.out.println();
            for (int col = 0; col < count; col++) {
                System.out.print(a);
            }

        }
    }
// Viereck ausgefüllt mit Seitelänge counthorizontal/countvertical
    public static void printRectangle(char a, int counthorizontal, int countvertical) {
        for (int i = 0; i <= countvertical - 1; i++) {
            System.out.println();
            for (int j = 0; j <= counthorizontal; j++) {
                System.out.print(a);
            }
        }
    }
    // Quadrat leer ausgeben ohne Stringbuilder
    public static String printEmptyXSquare(String xChar, int count) {
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

}
