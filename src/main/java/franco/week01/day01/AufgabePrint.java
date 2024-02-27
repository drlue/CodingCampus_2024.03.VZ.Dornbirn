package franco.week01.day01;

public class AufgabePrint {
    public static void main(String[] args) {


        //Calling the methods
        printChars("*", 10);

        printSquare("x", 10);

        printTriangleBottomLeft("* ", 4);

        printTriangleTopLeft("+ ", 5);

        printTriangleTopRight("* ", 5);

        printEmptySquare("+ ", 10);


    }


    //Print one character on single line(Method)
    public static void printChars(String text, int zahl) {

        for (int i = 0; i < zahl; i++) {
            System.out.print(text);

        }
        System.out.println();

    }

    //Print one character multiple time and on multiple row
    public static void printSquare(String text, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(text);
                if (j == number - 1) {
                    System.out.println();
                }

            }

        }
    }

    public static void printRect(String text, int number) {
        //for(int=)
    }

    //Print a triangle right to left
    public static void printTriangleBottomLeft(String text, int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft(String text, int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(text);
            }
            System.out.println();

        }
    }

    public static void printTriangleTopRight(String text, int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print(text);

            }

            System.out.println();
        }

    }

    public static void printEmptySquare(String text, int number){
        for (int i = 0; i <= number; i++)  {
            for (int j = 0; j<= number; j++) {
                if (i==0||j==0||i==number||j==number){
                    System.out.print(text);}
                else {
                    System.out.print("  ");
                }

            }System.out.println();

        }

    }
}
