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

}
