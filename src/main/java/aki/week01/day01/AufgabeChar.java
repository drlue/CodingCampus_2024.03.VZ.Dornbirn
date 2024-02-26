package aki.week01.day01;

public class AufgabeChar {
    public static void main(String[] args) {
        printChars("x", 2);

        System.out.println();

        printSquare("y", 3);

        System.out.println();

        printRectangle("x", 10, 3);
    }

    public static void printChars(String zeichen, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(zeichen);
        }
    }

    public static void printSquare(String zeichen1, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(zeichen1);
            }
            System.out.println();
        }
    }

    public static void printRectangle(String zeichen, int number, int number2) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number2; j++) {
            }
            System.out.print(zeichen);
        }
        System.out.println();
    }
}

