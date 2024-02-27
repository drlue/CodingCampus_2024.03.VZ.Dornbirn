package aki.week01.day01;

public class AufgabeChar {
    public static void main(String[] args) {
        printTriangle("x", 3);
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

    public static void printTriangleBottomLeft(String zeichen, int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String zeichen, int number) {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String zeichen, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String zeichen, int number) {
        for (int i = number; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String zeichen, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1) {
                    System.out.print(zeichen);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}