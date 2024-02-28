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

        System.out.println("printTriangle");
        printTriangle("x", 5);
        System.out.println();

        System.out.println("printRhombus");
        printRhombus("x", 7);
        System.out.println();

        System.out.println("printX");
        printX("x", 5);
        System.out.println();

        System.out.println("printChristmasTree");
        printChristmasTree( 15);
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
                if (col < size - row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(txt);
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printSlash(String txt, int size, boolean backslash) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((backslash && col == row) || (!backslash && col == size - 1 - row)) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2 - 1; col++) {
                if (col == size - 1 - row || col == size - 1 + row || row == size - 1) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus(String txt, int size) {
        int h2 = size / 2;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                //if 4x Geradengleichung (1x je Seite) Abszisse (x) -> col, Ordinate (y) -> row
                if (row == -col + h2 || row == col + h2 || row == col - h2 || row == -col + 3 * h2) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printX(String txt, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col || row == -col + size - 1 ) {
                    System.out.print(txt);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printChristmasTree(int height){
        int width = 2*height-1;
        //Baum
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if(col >= height-1-row && col <= row+height-1){
                    System.out.print("x");
                }else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        //Kugeln
        for (int col = 0; col < width; col++) {
            if(col%2!=0) {
                System.out.print(".");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
        //Stamm soll sich proportional zu height ändern
        int bStamm = width/2-1;
        int hStamm = height/2;
        for (int row = 0; row < hStamm; row++) {
            for (int col = 0; col < width; col++) {
                if(col >= width/2 - bStamm/2 && col <= width/2 + bStamm/2) {
                    System.out.print("+");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


}
