
package christian.week01.day01;

public class StringBuilder {

public static void main(String[] args) {
    System.out.println(printEmptyXSquare("x", 10));
    }
    // leeres Quadrat ausgeben
    public static String printEmptyXSquare(String xChar, int count) {
    String solution = "";
        java.lang.StringBuilder solutionB = new java.lang.StringBuilder();
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (row == 0 || col == 0 || row == count - 1 || col == count - 1) {
                   solutionB.append(xChar);
                } else {
                   solutionB.append(" ");
                }
            }
            solutionB.append("\n");
        }
        solution = solutionB.toString();
        return solution;
    }
}
