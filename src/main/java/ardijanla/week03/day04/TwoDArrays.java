package ardijanla.week03.day04;


import ardijanla.week03.day01.Arrayss;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class TwoDArrays {
    static Scanner ReadLine = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] canvas = buildCanvas();
        boolean user = true;
        showCanvas(canvas);

        while (true) {

            System.out.println(user);
            int input = ReadLine.nextInt();
            setMark(canvas, user, input);
            showCanvas(canvas);
            user = false;
            System.out.println(user);
            input = ReadLine.nextInt();
            setMark(canvas, user, input);
            showCanvas(canvas);
            user = true;


        }

    }

    public static String[][] buildCanvas() {

        String[][] canvasToBuild = new String[3][3];
        for (int row = 0; row < canvasToBuild.length; row++) {
            for (int col = 0; col < canvasToBuild.length; col++) {
                canvasToBuild[row][col] = ".";
            }
        }

        for (int i = 0; i < 8; i++) {
            liste.add(i);
        }


        return canvasToBuild;
    }

    public static void showCanvas(String[][] canvasToShow) {

        for (int row = 0; row < canvasToShow.length; row++) {
            for (int col = 0; col < canvasToShow.length; col++) {
                System.out.printf("|%s", canvasToShow[row][col]);

            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }
    static List<Integer> liste = new ArrayList<>();

    public static void setMark(String[][] canvas, boolean user, int userInput) {
        String mark = user ? "O" : "X";

        if (liste.contains(userInput)) {
            switch (userInput) {
                case 0: canvas[0][0] = mark; break;
                case 1: canvas[0][1] = mark; break;
                case 2: canvas[0][2] = mark; break;
                case 3: canvas[1][0] = mark; break;
                case 4: canvas[1][1] = mark; break;
                case 5: canvas[1][2] = mark; break;
                case 6: canvas[2][0] = mark; break;
                case 7: canvas[2][1] = mark; break;
                case 8: canvas[2][2] = mark; break;
            }
            liste.remove(Integer.valueOf(userInput));
        } else {
            System.out.println("Das Feld ist bereits belegt. Wähle ein anderes.");

        }



    }
    public static boolean validateUserInput(int[][] canvas,int userInput,boolean user){
        boolean validate = true;




        return  true;
    }

}


