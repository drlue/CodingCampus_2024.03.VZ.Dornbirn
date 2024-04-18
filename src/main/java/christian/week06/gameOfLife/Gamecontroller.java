package christian.week06.gameOfLife;

import java.util.Vector;

public class Gamecontroller {
    private int cellsalive;
    private Vector<Cell> listOfCells;

    private Cell[][] backendGrid;
    private int sizeOfGrid;

    public Gamecontroller(int sizeOfGrid) {
        cellsalive = 0;
        this.sizeOfGrid = sizeOfGrid;
        listOfCells = new Vector<Cell>(sizeOfGrid * sizeOfGrid);
        backendGrid = new Cell[sizeOfGrid][sizeOfGrid];

    }

    public void printFrontend() {
        for (int row = 0; row < sizeOfGrid; row++) {
            for (int col = 0; col < sizeOfGrid; col++) {
                if (backendGrid[row][col].status == Cell.Status.ALIVE) {
                    System.out.print(" X ");
                } else {
                    System.out.print("| |");
                }
            }
            System.out.println();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    public void createBackend() {
        for (int row = 0; row < this.sizeOfGrid; row++) {
            for (int col = 0; col < this.sizeOfGrid; col++) {
                backendGrid[row][col] = new Cell(row, col);
                listOfCells.add(backendGrid[row][col]);
            }
        }
    }

    public void lifeOrDeath() {
        for (int row = 0; row < sizeOfGrid; row++) {
            for (int col = 0; col < sizeOfGrid; col++) {
                int livingneighbors = 0;
                if (backendGrid[row][col].status == Cell.Status.ALIVE) {
                    livingneighbors = checkNeighbors(row, col);

                }
            }
        }
    }

    public int checkNeighbors(int row, int col) {
        int livingneighbors = 0;
        if (row != 0 && col != 0 && row != sizeOfGrid - 1 && col != sizeOfGrid - 1) {

            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {

                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }

                }
            }
        }
        return livingneighbors;
    }
}
