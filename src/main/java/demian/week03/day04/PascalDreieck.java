package demian.week03.day04;


import static demian.allmethods.AllMethods.*;

public class PascalDreieck {

    public static void main(String[] args) {

        // AUFGABE:
        // Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.
        // Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.

        int[][] test = create2DArrayCanvas(10,10,8);
        print2DArray(test);


        System.out.println("\nErstellung eines Pascal Dreiecks\n");
        int size = getINT("Test",0,30);
//        int size = demian.allmethods.AllMethods.getINT("Gewünschte Größe (0-30) hier angeben ==>", 0, 30);



    }

    public static void printPascalTriangle(int size) {

    }


}
