package demian.week03.day04;


import static demian.allmethods.AllMethods.*;

public class PascalDreieck {

    public static void main(String[] args) {

        // AUFGABE:
        // Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.
        // Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.


        System.out.println("\nErstellung eines Pascal Dreiecks\n");
        int size = getINT("Gewünschte Größe (0-10) hier angeben ==>", 0, 10);

        int[][] canvas = create2DArrayCanvas(size, size, 1);
        System.out.println("Blanc Canvas: " + size + "x" + size);
        printARRAYheader(canvas);
        print2DArray(canvas);

        for (int row = 0; row < canvas.length; row++) {
            for (int col = 0; col < canvas[0].length; col++) {
                if (row == 0) {
                    canvas[row][col] = 1;
                } else if (col == 0) {
                    canvas[row][col] = 1;

                } else {
                    int sum = canvas[row-1][col] + canvas[row][col-1];
                    canvas[row][col] = sum;
                }
            }

        }
        System.out.println("Pascal Dreieck:");
        printARRAYheader(canvas);
        print2DArray(canvas);

    }




}
