package christian.week01.day01;

public class Methods {
    public static void main(String[] args) {
        System.out.println(printSquareString('x', 10));
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
        if (first == true) {
            for (int i = 0; i < count; i++) {
                solution += a;
                first = false;
            }
        } else {
            for (int i = 0; i < count; i++) {
                solution += "\n";
                for (int j = 0; j < count; j++) {
                    solution += a;
                }
            }
        }
        return solution;
    }
}
