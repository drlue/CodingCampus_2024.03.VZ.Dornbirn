package irem;

public class PrintTriangleTopRight{
    public static void main(String[] args) {
        System.out.println("PrintTriangleTopRight");
         printTriangleTopRight("x",5);


    }

    public static void printTriangleTopRight(String text, int number) {
        for (int col = 1; col <= number; col++) {
            for (int raw = 1; raw <= col; raw++) {
                System.out.print(" . ");
            }
            for (int raw = col; raw <= number; raw++) {
                System.out.print(text);}
        }
    }
}
