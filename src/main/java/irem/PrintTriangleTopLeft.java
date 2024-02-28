package irem;

public class PrintTriangleTopLeft {
    public static void main(String[] args) {
        System.out.println("PrintTriangleLeft");
        PrintTriangleTopLeft("x", 5);

    }

    public static void PrintTriangleTopLeft(String Text, int nummer) {

        for (int col = 0; col < nummer; col++) {
            for (int row = 0; row < nummer - col; row++) {

                System.out.print("x");
            }
            System.out.println();
        }
    }
}