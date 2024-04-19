package christian.week06.gameOfLife;

import java.io.IOException;
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

    public int getCellsalive() {
        return cellsalive;
    }

    public void setCellsalive(int cellsalive) {
        this.cellsalive = cellsalive;
    }

    public void printFrontend(){
        System.out.println();
        for (int row = 0; row < sizeOfGrid; row++) {
            for (int col = 0; col < sizeOfGrid; col++) {
                if (backendGrid[row][col].status == Cell.Status.ALIVE) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println();
//        Main.clearScreen();
    }

    public void createBackend() {
        for (int row = 0; row < this.sizeOfGrid; row++) {
            for (int col = 0; col < this.sizeOfGrid; col++) {
                backendGrid[row][col] = new Cell(row, col);
                listOfCells.add(backendGrid[row][col]);
            }
        }
    }
    public void createLivingCells(int number){
        for (int i = 0; i < number; i++) {
            int randomRow = Main.rnd.nextInt(sizeOfGrid);
            int randomCol = Main.rnd.nextInt(sizeOfGrid);
            backendGrid[randomRow][randomCol].status = Cell.Status.ALIVE;
        }

    }

    public void lifeOrDeath() {
        for (int row = 0; row < sizeOfGrid; row++) {
            for (int col = 0; col < sizeOfGrid; col++) {
                int livingneighbors = 0;

                livingneighbors = checkNeighbors2(row, col);
                setLifeOrDeath(row,col,livingneighbors);
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
            }//Ecke links oben
        } else if (row == 0 && col == 0) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }

            }// Ecke rechts oben
        } else if (row == 0 && col == sizeOfGrid - 1) {
            for (int i = 0; i < 2; i++) {
                for (int j = -1; j < 1; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }
            }//Ecke links unten
        } else if (row == sizeOfGrid - 1 && col == 0) {
            for (int i = -1; i < 1; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }

            }//Ecke rechts unten
        } else if (row == sizeOfGrid - 1 && col == sizeOfGrid - 1) {
            for (int i = -1; i < 1; i++) {
                for (int j = -1; j < 1; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }
            }//Kante oben
        } else if (row == 0) {
            for (int i = 0; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if ((i != 0 && j != 0) && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }
            }// Kante links
        } else if (col == 0) {
            for (int i = -1; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }
            }//Kante unten
        } else if (row == sizeOfGrid - 1) {
            for (int i = -1; i < 1; i++) {
                for (int j = -1; j < 2; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }
            }//kante rechts
        } else if (col == sizeOfGrid - 1) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 1; j++) {
                    if (i != 0 && j != 0 && backendGrid[row + i][col + j].status == Cell.Status.ALIVE) {
                        livingneighbors++;
                    }
                }
            }
        }
        return livingneighbors;
    }

    public int checkNeighbors2(int row, int col){
        int livingNeighbors = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if(backendGrid[(row+(sizeOfGrid-1)+i)%(sizeOfGrid-1)]
                              [(col+(sizeOfGrid-1)+j)%(sizeOfGrid-1)]
                              .status == Cell.Status.ALIVE){
                    livingNeighbors++;
                }
            }
        }

        return livingNeighbors;
    }

    public void setLifeOrDeath(int row, int col, int livingneighbors) {
        if (backendGrid[row][col].status == Cell.Status.ALIVE) {
            if (livingneighbors <= 2) {
                backendGrid[row][col].status= Cell.Status.DEAD;
            } else if (livingneighbors>3) {
                backendGrid[row][col].status= Cell.Status.DEAD;
            }
        } else {
            if (livingneighbors==3){
                backendGrid[row][col].status= Cell.Status.ALIVE;
            }
        }
    }
    public void countCellsAlive (){
        for (Cell c : listOfCells){
            if(c.status==Cell.Status.ALIVE){
                cellsalive++;
            }
        }
    }
}
