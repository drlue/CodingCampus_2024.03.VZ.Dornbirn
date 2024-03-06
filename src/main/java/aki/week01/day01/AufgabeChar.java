package aki.week01.day01;

public class AufgabeChar {
    public static void main(String[] args) {
        printRhombus("x", " ", ".", 7);
    }

    public static void printChars(String zeichen, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
    }

    public static void printSquare(String zeichen1, int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(zeichen1);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String zeichen, int number, int number2) {
        for (int i = 0; i < number2; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(zeichen);
            }
            System.out.println(zeichen);
        }
    }

    public static int printTriangleBottomLeft(String zeichen, int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
        return number;
    }

    public static int printTriangleTopLeft(String zeichen, int number) {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
        return number;
    }

    public static int printTriangleTopRight(String zeichen, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
        return number;
    }

    public static int printTriangleBottomRight(String zeichen, int number) {
        for (int i = number; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
        return number;
    }

    public static void printEmptySquare(String zeichen, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1) {
                    System.out.print(zeichen);
                } else {
                    System.out.print(" ".repeat(zeichen.length()));
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle(String zeichen, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2 - 1; col++) {
                if (col == size - row - 1 || col == size + row - 1 || row == size - 1) {
                    System.out.print(zeichen);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus(String x, String leer, String dot, int size) {
        for (int row = 0; row < size * 2; row++) {
            for (int col = 0; col < size * 4; col++) {
                if (col == size - row - 1 || col == size + row - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(dot);
                }
            }
            System.out.println();
        }
    }
}