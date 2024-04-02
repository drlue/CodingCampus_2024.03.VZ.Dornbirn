package franco.week01.day01;

public class AufgabePrint {
    public static void main(String[] args) {

//        //Calling the methods
//        printChars("*", 10);
//0
//        printSquare("x", 10);
//
//        printTriangleBottomLeft("* ", 4);
//
        printTriangleTopLeft("+ ", 5);

//        printTriangleTopRight("* ", 5);
//
//        printEmptySquare("+ ", 10);
//
//        printEmptySquare("A ", 3);
//
//        printSlash("X", 6, true);
//
//        printSlash2("Y", 5, true);
//
//        printTri("X", 5);
//
//        printX("X", 5);
//
//        printRhombus("x", 7);
//
  //        printChristmasTree(9);
//
//        printRect("X ", 10, 3);

 //       printCirclePythagoras(10);

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
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < length; column++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    //Print a triangle right to left
    public static void printTriangleBottomLeft(String text, int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
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

    public static void printEmptySquare(String text, int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || j == 1 || i == number || j == number) {
                    System.out.print(text+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printSlash(String text, int number, boolean isSlashOrNot) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    public static void printSlash2(String text, int size, boolean isSlashOrNot) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void printTri(String text, int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= 2 * size - 1; column++) {
                if (row == size || row + column == size + 1 || column == row + (size - 1)) {
                    System.out.print(text);

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }


    public static void printX(String text, int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {

                if (row + column == size - 1 || row == column) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void printRhombus(String text, int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (column == (size / 2) - row || column == row - (size / 2)
                        || column == row + (size / 2) ||
                        column == (3 * (size / 2)) - row) {

                    System.out.print(text);

                } else {
                    System.out.print("_");
                }
            }
            System.out.println("_");
        }
    }

    public static void printChristmasTree(int size) {

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= 2 * size - 1; column++) {
                if (row == size || row + column <= size + 1 || column >= row + (size - 1)) {
                    System.out.print("X");

                }
                else {
                    System.out.print(" ");
                }
                //The stump of the tree
                //proportional according to the height given
            }
            System.out.println("");
        }
        for (int row = 0; row <(size/3)-1 ; row++) {
            for (int column =0; column <=size; column++) {

                if(column<size/3||column>=(2*size)/3){
                System.out.print("  ");}
                else{
                    System.out.print("++");
                }
            }
            System.out.println();
        }

    }

    //need some modification
    public static void printCirclePythagoras(int size) {
        for (int row = 0; row < size * 2; row++) {
            for (int col = 0; col < size * 2; col++) {
                if (row*row+col*col == size*size) {
                    System.out.print("x");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
