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

        printEmptySquare("A ",3);

        printSlash("X", 6, true);

        printSlash2("Y",5,true);

        printTri("X",4);


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

    public static void printRect(String text, int length, int height) {
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
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < number; j++) {
                System.out.print(text);

            }

            System.out.println();
        }

    }

    public static void printEmptySquare(String text, int number){
        for (int i = 1; i <= number; i++)  {
            for (int j = 1; j<= number; j++) {
                if (i==1||j==1||i==number||j==number){
                    System.out.print(text);}
                else {
                    System.out.print("  ");
                }

            }System.out.println();

        }

    }
    public static void printSlash(String text,int number,boolean isSlashOrNot){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++)
            {
                if (i==j)
                {
                    System.out.print(text);
                }
                else {
                    System.out.print(" ");

                }


            }
            System.out.println();

        }
    }

    public static void printSlash2(String text,int size,boolean isSlashOrNot){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
            {
                if (i + j == size - 1)
                {
                    System.out.print(text);
                }
                else {
                    System.out.print(".");
                }

            }

            System.out.println( );
        }
    }
     //Code  not functioning properly-Modification to be made
    public static void printTri(String text,int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i+j == size ||  i==j){
                    System.out.println(text);
                }
                else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }

    }


}
