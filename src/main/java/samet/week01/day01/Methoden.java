package samet.week01.day01;

public class Methoden {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            greetings("Samet", "Sevimli");
        }

        System.out.println("\nprintChars()");
        printChars("A ", 10);

        System.out.println("\nprintSquare()");
        printSquare("B ", 10);

        System.out.println("\nprintRect()");
        printRect("C ", 10, 3);

        System.out.println("\nprintTriangleBottomLeft()");
        printTriangleBottomLeft("D ", 4);

        System.out.println("\nprintTriangleTopLeft()");
        printTriangleTopLeft("E ", 5);

    }

    public static void greetings(String name, String nname) {
        System.out.println("Hallo " + name + " " + nname);
    }

    public static void printChars(String txt, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(txt);
        }
        System.out.println();
    }


    public static void printSquare(String txt, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(txt);
                if (j == width - 1) {
                    System.out.println();
                }
            }

        }
        System.out.println();


    }

    public static void printRect(String txt, int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(txt);
            }
            System.out.println();

        }

    }

    public static void printTriangleBottomLeft(String text, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(text);
            }

            System.out.println();


        }

    }

    public static void printTriangleTopLeft(String text, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(text);

            }

            System.out.println();

        }


    }


}

