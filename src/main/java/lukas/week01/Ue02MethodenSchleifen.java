package lukas.week01;

public class Ue02MethodenSchleifen {
    public static void main(String[] args) {

        System.out.println("printChars");
        printChars("x", 10);
        System.out.println();

        System.out.println("printSquare");
        printSquare("x", 10);
        System.out.println();

        System.out.println("printSquare2");
        printSquare2("x", 10);
        System.out.println();

        System.out.println("printRectangle");
        printRectangle("x", 10, 3);
        System.out.println();

        System.out.println("printTriangleBottomLeft");
        printTriangleBottomLeft("x", 4);
        System.out.println();

        System.out.println("printTriangleTopLeft");
        printTriangleTopLeft("x", 5);
        System.out.println();

        System.out.println("printTriangleTopRight");
        printTriangleTopRight("x", 5);
        System.out.println();

        System.out.println("printTriangleTopRight2");
        printTriangelTopRight2("x", 5);
        System.out.println();

        System.out.println("printTriangleBottomRight");
        printTriangleBottomRight("x", 5);
        System.out.println();

        System.out.println("printEmptySquare");
        printEmptySquare("x", 10);
        System.out.println();

        System.out.println("printEmptySquare A3");
        printEmptySquare("A", 3);
        System.out.println();

        System.out.println("printSlash");
        printSlash("x", 3, true);
        System.out.println();

        System.out.println("printBackSlash");
        printSlash("y", 4, false);
        System.out.println();

        System.out.println("printTriangle");
        printTriangle("x", 3);
        System.out.println();

        System.out.println("printTriangle 2");
        printTriangle("x", 5);
        System.out.println();

        System.out.println("printTriangle 3");
        printTriangle("x", 1);
        System.out.println();

        System.out.println("printRhombus");
        printRhombus("x", 7);
        System.out.println();

        System.out.println("printX");
        printX("x", 7);
        System.out.println();

        System.out.println("printChristmasTree");
        printChristmasTree(5, 2, 5);
        System.out.println();
    }

    public static void printChars(String txt, int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print(txt);
        }
    }

    public static void printSquare(String txt, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(txt);
                if (j == length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void printSquare2(String txt, int length) {
        for (int i = 0; i < length; i++) {
            printChars(txt, length);
            System.out.println();
        }
    }

    public static void printRectangle(String txt, int width, int height) {
        for (int i = 0; i < height; i++) {
            printChars(txt, width);
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String txt, int length) {
        for (int i = 0; i < length; i++) {
            printChars(txt, i + 1);
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String txt, int length) {
        for (int i = length; i > 0; i--) {
            printChars(txt, i);
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String txt, int length) {
        for (int i = 0; i < length; i++) {
            printChars(" ", i);
            printChars(txt, length - i);
            System.out.println();
        }
    }

    public static void printTriangelTopRight2(String txt, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print(txt);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String txt, int length) {
        for (int i = 0; i < length; i++) {
            printChars(" ", length - i);
            printChars(txt, i + 1);
            System.out.println();
        }
    }

    public static void printEmptySquare(String txt, int length) {
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1) {
                printChars(txt, length);
            } else {
                printChars(txt, 1);
                printChars(" ", length - 2);
                printChars(txt, 1);
            }
            System.out.println();
        }
    }

    //@SuppressWarnings("unused")
    public static void printSlash(String txt, int length, boolean backslash) {
        for (int i = 0; i < length; i++) {
            int lengthEmpty;
            if (backslash) {
                lengthEmpty = i;
            } else {
                lengthEmpty = length - i;
            }
            printChars(" ", lengthEmpty);
            System.out.println(txt);
        }
    }

    public static void printTriangle(String txt, int height) {
        for (int i = 0; i < height; i++) {
            //Leerzeichen alle Zeilen
            printChars(" ", height - i - 1);
            //Erste Zeile
            if (i == 0) {
                printChars(txt, 1);
                System.out.println();
            }
            //Regelfall
            else if (i < height - 1) {
                printChars(txt, 1);
                printChars(" ", i * 2 - 1);
                System.out.println(txt);
            }
            //Letzte Zeile
            else {
                printChars(txt, height * 2 - 1);
            }
        }
    }

    public static void printRhombus(String txt, int height) {
        int h2 = height / 2;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                if (row + col == h2 || row - col == h2 || col - row == h2 || col + row == h2 * 3) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printX(String txt, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height; col++) {
                if (row == col || row + col == height - 1) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printChristmasTree(int size, int hStamm, int bStamm) {
        //Baum
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2; col++) {
                if (col >= size - 1 - row && col <= size - 1 + row) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Kugeln
        for (int col2 = 0; col2 < size * 2 - 1; col2++) {
            if (col2 % 2 != 0) {
                System.out.print(" ");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
        //Stamm
        for (int row3 = 0; row3 < hStamm; row3++) {
            for (int col3 = 0; col3 < size * 2; col3++) {
                if (col3 >= size - 1 - bStamm / 2 && col3 <= size - 1 + bStamm / 2) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
