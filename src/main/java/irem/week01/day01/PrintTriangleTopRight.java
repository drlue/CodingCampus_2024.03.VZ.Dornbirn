package irem.week01.day01;

public class PrintTriangleTopRight{
    public static void main(String[] args) {
        System.out.println("PrintTriangleTopRight");
         printTriangleTopRight("x",5);

        System.out.println("PrintTriangleBottomRight");
        printTriangleBottomRight("x",8);
    }

    public static void printTriangleTopRight(String text, int number) {
        for (int col = 1; col <= number; col++) {
            for (int raw = 1; raw <= col; raw++) {
                //System.out.print(" . ");
                System.out.print(" ".repeat(text.length()));
            }
            for (int raw = col; raw <= number; raw++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight (String text, int number) {
        for(int reihe= 0; reihe < number; reihe++){
            for(int spalte= 0; spalte < number; spalte++) {
                if (spalte == number - 1 || reihe == number - 1 || reihe + spalte == number - 1 || spalte + reihe >= number) {
                    System.out.print(text);
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
