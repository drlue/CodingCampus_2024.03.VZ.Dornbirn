package christian.week03.day03;

public class TwoDArrayPascalTriangle {
    public static void main(String[] args) {
        System.out.println("Gib die gewünschte Größe des Pascal-Dreiecks ein!");
        int size = TwoDimensionArraySumOfRowOrCol.intReaderMinMax(1, 30);
        pascalTriangle(size);
    }

    public static long[][] pascalTriangle(int size) {
        long[][] arr = new long[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                    if (col == 0 || row == 0) {
                        arr[row][col] = 1;
                        System.out.printf("%12d", arr[row][col]);
                        System.out.print(" ");
                    } else {
                        arr[row][col] = arr[row - 1][col] + arr[row][col - 1];
                        System.out.printf("%12d", arr[row][col]);
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
        return arr;
    }
}
