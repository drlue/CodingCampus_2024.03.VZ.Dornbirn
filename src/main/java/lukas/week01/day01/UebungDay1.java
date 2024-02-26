package lukas.week01.day01;

public class UebungDay1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hallo12313föäasödlfkjasdfasdffasdkfj123");
        System.out.println("     /--\\");
        System.out.println("    / /\\ \\");
        System.out.println("   / /  \\ \\");
        System.out.println("  / /    \\ \\");
        System.out.println(" /  ======  \\");
        System.out.println("/ /        \\ \\");

        //Zählen 1a
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Zählen 1b
        int j = 0;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        //Zählen 2
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Zählen 3a
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Zählen 3b
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        //Zählen 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

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

        System.out.println("printTriangleBottomRight");
        printTriangleBottomRight("x", 5);
        System.out.println();

        System.out.println("printEmptySquare");
        printEmptySquare("x", 10);
        System.out.println();

        System.out.println("printEmptySquare A3");
        printEmptySquare("A", 3);
        System.out.println();

        System.out.println("printTriangle");


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

    @SuppressWarnings("unused")
    public static void printTriangle(String txt, int length){
        //Hier weitermachen
    }

}

