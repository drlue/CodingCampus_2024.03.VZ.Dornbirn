package ardijanla.week01.day01;

public class MethodenUndSchleifen {

    public static void main(String[] args) {
        System.out.println("Print Char");
        printChars("A", 3);
        printSquare("B", 5);
        printRect("C", 4, 5);
        printTriangleBottomLeft("T", 5);
        printTriangleTopLeft("X", 5);
        printTriangleTopRight("S", 5);
        printTriangleBottomRight("H", 5);
        printEmptySquare("K", 5);
        printSlash("B", 4, true);
        printSlash("B", 4, false);
        printTriangle("X", 10);
        printRhombus("X", 30);
        printX("X", 5);
        printChristmasTree("*", 9);
        Test();
        printCriclePythagoras(5);

    }

    public static String printChars(String character, int number) {

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < number; i++) {
            output.append(character);

        }
        System.out.println(output);
        return output.toString();
    }

    public static void printSquare(String character, int number) {
        System.out.println("Print Square");

        String Output = printChars(character, number);

        for (int i = 0; i < number; i++) {
            System.out.println(Output);
        }
    }

    public static void printRect(String character, int length, int height) {
//        System.out.println("Print Rectangle");

        String Output = printChars(character, length);

        for (int i = 0; i < height; i++) {
            System.out.println(Output);
        }
    }

    public static void printTriangleBottomLeft(String character, int length) {
        System.out.println("Print Triangle (1)");

        String Output = "";

        for (int i = 0; i < length; i++) {
            Output += character;
            System.out.println(Output);
        }
    }

    public static void printTriangleTopLeft(String character, int length) {
        System.out.println("Print Triangle (2)");


        for (int i = length; i > 0; i--) {

            printChars(character, i);
        }
    }

    public static void printTriangleTopRight(String character, int length) {
        System.out.println("Print Triangle (3)");

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }


    public static void printTriangleBottomRight(String character, int size) {
        System.out.println("Print Triangle (4)");

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }

    }

    public static void printEmptySquare(String x, int size) {
        System.out.println("Print Empty Square");


        printChars(x, size);
        for (int i = 0; i < size - 2; i++) {

            for (int j = 0; j < size; j++) {

                if (j == i) {
                    System.out.print(x);
                    for (int k = 0; k < size - 2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print(x);
                }
            }
            System.out.println();
        }
        printChars(x, size);
    }


    public static void printSlash(String x, int value, boolean backslash) {
        System.out.println("Print Slash");

        if (backslash) {
            // Diagonale von rechts unten nach links oben
            for (int i = 0; i < value; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(x);
            }
        } else {
            // Diagonale von links oben nach rechts unten
            for (int i = 0; i < value; i++) {
                for (int j = 0; j < value - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(x);
            }
        }
    }


    public static void printTriangle(String x, int size) {
        System.out.println("Print Triangle");

        int bottom = 0;

        for (int row = 0; row < size; row++) {
            bottom++;
            for (int Col = 0; Col < (size - row) - 1; Col++) {
                System.out.print(" ");
            }
            System.out.print(x);
            for (int i = 0; i < (2 * row) - 1; i++) {
                System.out.print(" ");
            }
            if (row != 0) {
                System.out.print(x);
            }


            System.out.println();
        }
        printChars(x, bottom * 2 - 1);
    }


    public static void printRhombus(String x, int size) {
        System.out.println("Rhombus");

        int s2 = size / 2;
        for (int row = 0; row <= size; row++) {
            int currentRow;


            if (row <= s2) {
                currentRow = row;
            } else {
                currentRow = size - row;
            }


            for (int col = 0; col < s2 - currentRow; col++) {
                System.out.print(".");
            }


            System.out.print(x);


            if (currentRow > 0) {

                for (int col = 0; col < 2 * currentRow - 1; col++) {
                    System.out.print(".");
                }
                System.out.print(x);
            }

            System.out.println();
        }
    }

    public static void printX(String ch, int size) {
        System.out.println("Print X");

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {


                if (row == col || row + col == size - 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


    public static void printChristmasTree(String ch, int size) {
        System.out.println("Christmas Tree");
        int counter = 1;

        for (int row = 0; row < size; row++) {
            counter++;
            for (int Col = 0; Col < (size - row) - 1; Col++) {
                System.out.print(" ");
            }
            System.out.print(ch);
            for (int i = 0; i < (2 * row) - 1; i++) {
                System.out.print(ch);
            }
            if (row != 0) {
                System.out.print(ch);
            }

            System.out.println();
        }

        printChars("o", size * 2 - 1);


        int logHeight = size / 3;
        for (int row = 0; row < logHeight; row++) {

            for (int col = 0; col < size / 2 + 2; col++) {
                System.out.print(".");

            }
            printRect("+", 5, 0);
        }


    }


    public static void Test() {
        int groesse = 9;

        char[][] koordinatenSystem = new char[groesse][groesse];

        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < groesse; j++) {
                koordinatenSystem[i][j] = ' ';
            }
        }

        for (int i = 0; i < groesse; i++) {
            koordinatenSystem[i][i] = 'X';
            koordinatenSystem[i][groesse - 1 - i] = 'X';
        }

        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < groesse; j++) {
                System.out.print(koordinatenSystem[i][j]);
            }
            System.out.println();
        }

    }


    public static void printCriclePythagoras(int n) {
        System.out.println("Print Circle");

        int durchmesser = n * n;

        for (int y = -n; y <= n; y++) {

            for (int x = -n; x <= n; x++) {

                if (y * y + x * x <= durchmesser) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


}









