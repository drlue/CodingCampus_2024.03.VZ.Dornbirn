package gyula.week01;

public class Triangle {
    public static void main(String[] args) {
        triangle("A ", 15);
    }

    public static void triangle(String text, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < 2 * size -1; col++) {
                if (row + col == size -1 || col == row + size - 1 || row == size -1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
