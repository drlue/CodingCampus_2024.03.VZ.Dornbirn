package demian.week05.day04;

public class sandkasten {

    public static void main(String[] args) {

        String input = "1 2 3;4 5 6;7 8 9"; // Beispiel-String für einen 2D-Array
        String[] rows = input.split(";");
        int[][] array2D = new int[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            String[] columns = rows[i].split(" ");
            array2D[i] = new int[columns.length];
            for (int j = 0; j < columns.length; j++) {
                array2D[i][j] = Integer.parseInt(columns[j]);
            }
        }

        // Ausgabe des 2D-Arrays
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
