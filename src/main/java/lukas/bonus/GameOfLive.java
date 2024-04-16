package lukas.bonus;

import lukas.Helper;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GameOfLive {
    private static int cols = 20;
    private static int rows = 20;


    public static void main(String[] args) {
        int[][] grid = new int[rows][cols];
        initGeneration(grid);
        printGrid(grid);
        //System.out.println();
        //System.out.println();
        while (true) {
            Helper.clearScreen();
            grid = computeNewGeneration(grid);
            printGrid(grid);
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //System.out.println();
            //System.out.println();
        }
    }

    public static void initGeneration(int[][] grid) {
//        Random random = new Random();
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                grid[i][j] = random.nextInt(2);
//            }
//        }
        placeGlider(grid,1,1);
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] == 1 ? "x" : " ");
            }
            System.out.println();
        }
    }

    public static int countNeighbors(int[][] grid, int x, int y) {
        int sum = 0;
        //regular cell
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (i != 0 || j != 0) { //do not count cell itself!
                        sum += grid[(x + grid.length + i) % grid.length][(y + grid[0].length+ j) % grid[0].length];
                        //wenn
                    }
                }
            }
        return sum;
    }

    public static int[][] computeNewGeneration(int[][] grid) {
        int[][] gridNew = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                int state = grid[i][j];
                int neighbors = countNeighbors(grid, i, j);
                if (state == 0 && neighbors == 3) {
                    gridNew[i][j] = 1;
                } else if (state == 1 && (neighbors < 2 || neighbors > 3)) {
                    gridNew[i][j] = 0;
                } else {
                    gridNew[i][j] = state;
                }
            }
        }
        return gridNew;
    }

    public static void placeGlider(int[][] grid, int x, int y){
        //.x.
        //..x
        //xxx

        grid[x][y+1] = 1;
        grid[x+1][y+2] = 1;
        grid[x+2][y] = 1;
        grid[x+2][y+1] = 1;
        grid[x+2][y+2] = 1;


    }


}
