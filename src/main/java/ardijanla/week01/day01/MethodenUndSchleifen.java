package ardijanla.week01.day01;

public class MethodenUndSchleifen {

    public static void main(String[] args) {
        System.out.println("Print Char");
        printChars("A", 3);
        printSquare("B", 5);
        printRect("C", 2, 5);
        printTriangleBottomLeft("T", 5);
        printTriangleTopLeft("X", 5);
        printTriangleTopRight("S", 5);
        printTriangleBottomRight("H", 5);
        printEmptySquare("K", 5);
        printSlash("B", 4, true);
        printSlash("B", 4, false);
        printTriangle("X", 5);
        printRhombus("X",7);

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
        System.out.println("Print Rectangle");

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
        printChars(x,bottom * 2 -1);
    }


    public static void printRhombus(String x, int size){

        int h2 = size / 2;
        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size - row - (size / 2) -1; col++) {
                System.out.print(".");
            }
            System.out.print(x);
            for (int col = 0; col < 2 * row -1; col++) {
                System.out.print(".");
            }
            if (row != 0){
                System.out.print(x);
            }








            System.out.println();
        }


    }


}









