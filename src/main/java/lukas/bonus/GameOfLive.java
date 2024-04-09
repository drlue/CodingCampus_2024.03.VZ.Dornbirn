package lukas.bonus;

import java.util.Random;

public class GameOfLive {
    private static int cols = 10;
    private static int rows = 10;


    public static void main(String[] args) {
        int[][] grid = new int[rows][cols];
        initGeneration(grid);
        printGrid(grid);
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
                grid = computeNewGeneration(grid);
                printGrid(grid);
                System.out.println();
                System.out.println();
        }
    }

    public static void initGeneration(int[][] grid) {
        Random random = new Random();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = random.nextInt(2);
            }
        }
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] == 1 ? " * |" : "   |");
            }
            System.out.println();
        }
    }

    public static int countNeighbors(int[][] grid, int x, int y) {
        int sum = 0;
        //regular cell
        if (x != 0 && x != grid.length - 1 && y != 0 && y != grid[0].length - 1) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (x != i && y != j) { //do not count cell itself!
                        sum += grid[x + i][y + j];
                    }
                }
            }
        }

        return sum;
    }

    public static int[][] computeNewGeneration(int[][] grid) {
        int[][] gridNew = grid.clone();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                int state = grid[i][j];
                int neighbors = countNeighbors(grid, i, j);
                if (state == 0 && neighbors > 2) {
                    gridNew[i][j] = 1;
                } else if (state == 1 && neighbors < 2 || neighbors > 3) {
                    gridNew[i][j] = 0;
                } else {
                    gridNew[i][j] = state;
                }
            }
        }
        return gridNew;
    }


}
