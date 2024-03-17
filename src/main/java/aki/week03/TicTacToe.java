package aki.week03;


import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        battleArea(3,3);
    }

    public static int[][] battleArea(int number, int number2) {
        System.out.print("Put in the Column from 0 to 2: ");
        int test = userInput.nextInt();
        System.out.println("Now the Row from 0 to 2: ");
        int test2 = userInput.nextInt();
        int[][] area = new int[number][number2];
        for (int col = 0; col < area.length; col++) {
            for (int row = 0; row < area.length; row++) {
                if (area[col][row] == 0){
                    area[test][test2] = 1;
                }
            }
            System.out.println(Arrays.toString(area[col]));
        }
        return area;
    }
}
