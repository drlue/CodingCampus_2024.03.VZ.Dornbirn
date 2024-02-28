package irem;

public class PrintRectangle {

    public static void main(String[] args) {
        System.out.println( "printRectangele()");
        printRectangele("X", 10, 3);

    }



    public static void printRectangele(String text, int width, int height){
        for(int row = 0;row < height; row++) {
            for(int col = 0; col < width; col++) {

                System.out.print(text);

            }


            System.out.println();
        }

    }
}
