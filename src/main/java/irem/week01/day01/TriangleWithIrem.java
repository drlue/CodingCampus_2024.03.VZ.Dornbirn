package irem.week01.day01;

public class TriangleWithIrem {
    public static void main(String[] args) {
        triangleTopRight("A ", 5);
        System.out.println("\n");
        triangleBottomRight("B ", 5);
        System.out.println("\n");
        triangleBottomLeft("C ", 5);
        System.out.println("\n");
        triangleTopLeft("D ", 5);

        System.out.println("\n");
        triangleTopLeftMatrix("E ", 8);

    }

    public static void triangleTopRight(String text, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(". ");
            }
            for (int col = 0; col < size - row; col++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void triangleBottomRight(String text, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row - 1; col++) {
                System.out.print(". ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void triangleBottomLeft(String text, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(text);
            }
            for (int col = 0; col < size - row - 1; col++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }

    public static void triangleTopLeft(String text, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size - row; col++) {
                System.out.print(text);
            }
            for (int col = 0; col < row; col++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }



    public static void triangleTopLeftMatrix(String text, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < 2 * size -1; col++) {
                if (col + row == size - 1 || col == row + size -1 || row == size -1) {
                    System.out.print(text);
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}