package christian.week01.day01;

public class StringBuilderTryOut {

    public static void main(String[] args) {

        System.out.println(printEmptyXSquare("x", 10));
    }

    // leeres Quadrat ausgeben mit Stringbuilder .append und .insert (int offset, string)
    public static String printEmptyXSquare(String xChar, int count) {
        String solution;
        StringBuilder solutionB = new StringBuilder();
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (row == 0 || col == 0 || row == count - 1 || col == count - 1) {
                    solutionB.append(xChar);
                } else {
                    solutionB.insert(solutionB.length(), " ");
                }
            }
            solutionB.append("\n");
        }
        solution = solutionB.toString();
        return solution;
    }
}