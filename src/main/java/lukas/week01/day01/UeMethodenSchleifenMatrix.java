package lukas.week01.day01;

public class UeMethodenSchleifenMatrix {
    public static void main(String[] args) {

        System.out.println("printSquare");
        printSquare("x", 10);
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

        System.out.println("printTriangleBottomRight");
        printTriangleBottomRight("x", 5);
        System.out.println();

        System.out.println("printEmptySquare");
        printEmptySquare("x", 10);
        System.out.println();

        System.out.println("printEmptySquare 2");
        printEmptySquare("A", 3);
        System.out.println();

        System.out.println("printBackslash");
        printSlash("x", 5, true);
        System.out.println();

        System.out.println("printSlash");
        printSlash("y", 5, false);
        System.out.println();
        


    }

    public static void printSquare(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(txt);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String txt, int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(txt);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col <= row) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < size - row) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < row) {
                    System.out.print(" ");
                } else {
                    System.out.print(txt);
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < size-row-1) {
                    System.out.print(" ");
                } else {
                    System.out.print(txt);
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String txt, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size-1 || col == 0 || col == size-1) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printSlash(String txt, int size, boolean backslash){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((backslash && col == row) || (!backslash && col == size-1 - row)) {
                    System.out.print(txt);
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
