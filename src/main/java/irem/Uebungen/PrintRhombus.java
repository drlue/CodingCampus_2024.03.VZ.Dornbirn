package irem.Uebungen;

public class PrintRhombus {

    public static void main(String[] args) {
        printRhombus("x", 7);
    }

    public static void printRhombus(String symbol, int size) {
        
        int height = size * 2 - 1;

        for(int i = 0; i < height; i++) {
            int printCount = i < size ? i + 1 : height - i;
            int spaces = Math.abs(size - 1 - i);

            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < printCount; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
