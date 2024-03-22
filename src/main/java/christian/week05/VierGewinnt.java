package christian.week05;

public class VierGewinnt {
    public static String[][] gameboard = new String[6][15];
    public static int[][] gamelogic = new int[7][7];

    public static void main(String[] args) {
        initializeGamelogic();
        alterGameboardVisual();
        // Spielfeld generieren und initialisieren
        // 6X7 int [][], leeres spielfeld ist mit 0 initialisiert
        // 7X15 String [][] für Darstellung
        // Gameloop
        // Spielerwechsel und Spielereingabe
        // Winconditions
        // Gameend
    }

    public static void initializeGamelogic() {
        for (int row = 0; row < gamelogic.length; row++) {
            for (int col = 0; col < gamelogic[row].length; col++) {
                if (row == gamelogic.length - 1) {
                    gamelogic[row][col] = 1;
                } else {
                    gamelogic[row][col] = 0;
                }
                System.out.print(gamelogic[row][col]);
            }
            System.out.println();
        }
    }

    public static void alterGameboardVisual() {
        for (int row = 0; row < gameboard.length; row++) {
            for (int col = 0; col < gameboard[row].length; col++) {
                if (col % 2 == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }
    }

    public static void alterGamelogic(int colSelection) {
        boolean nextPlaceIsFree = true;
        for (int row = 0; row < gamelogic.length; row++) {
            while (nextPlaceIsFree) {
                if (gamelogic[row][colSelection] == 0) {
                    if (gamelogic[row + 1][colSelection] == 0) {

                    }
                }
            }
        }
    }
}
