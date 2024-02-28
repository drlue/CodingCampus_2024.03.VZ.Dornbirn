package christian.week01.day01;

public class StringBuilder {
    public static void main(String[] args) {

    }
    // leeres Quadrat ausgeben
    public static String printEmptyXSquare(char xChar, int count) {
        String solution = " ";
        StringBuilder solutionB = new StringBuilder();
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                if (row == 0 || col == 0 || row == count - 1 || col == count - 1) {
                    //solutionB.append(solution.length(),xChar);
                } else {
                    //solution.insert(solution.length()," ");
                }
            }
            //solution.insert(solution.length(),"\n");
        }
        return solution;
    }
}
