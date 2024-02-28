package gyula.week01;

public class Methods {
    public static void main(String[] args) {
        printEmptySquare("X ", 5);

        System.out.println("Hello World!");
    }

    public static void printSquare(String text, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }


    public static void printEmptySquare(String text, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || col == 0 || row == size-1 || col == size-1) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
