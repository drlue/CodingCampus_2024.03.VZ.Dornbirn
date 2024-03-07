package franco.homework;

public class ChritsmasTree {
    public static void main(String[] args) {

        printChristmasTree("X",20);
        //triangleBottomRight(5);
        //printChristmasTree2(9);

    }

    public static void triangleBottomRight(int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < size - row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public static void printChristmasTree(String text,int size) {
        for (int row = 1; row <= size+1; row++) {
            for (int column = 1; column <= 2 * size-1; column++) {
                if ( row + column <= size + 1 || column >= row + (size - 1)) {
                    System.out.print(" ");
                }
                else  {
                    System.out.print(text);
                }
            }
            System.out.println("");
        }
        for (int count = 0; count < size; count++) {
            System.out.print("O ");
        }
        System.out.println();
        //print tree stump
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

    public static void printChristmasTree2(int height){
        int width = 2 * height - 1;
        //Baum
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col >= height - 1 - row && col <= row + height - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        //Kugeln
        for (int col = 0; col < width; col++) {
            if (col % 2 != 0) {
                System.out.print(".");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
        //Stamm soll sich proportional zu height ändern
        int bStamm = width / 2 - 1;
        int hStamm = height / 2;
        for (int row = 0; row < hStamm; row++) {
            for (int col = 0; col < width; col++) {
                if (col >= width / 2 - bStamm / 2 && col <= width / 2 + bStamm / 2) {
                    System.out.print("+");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}