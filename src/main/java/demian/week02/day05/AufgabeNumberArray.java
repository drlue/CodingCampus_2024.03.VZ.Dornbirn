package demian.week02.day05;

import demian.week02.day02.Scanner;

import java.util.Arrays;

public class AufgabeNumberArray {


    public static void main(String[] args) {

        //AUFGABE:
        // Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

        System.out.println("Array erstellen und mit 1,2,3... befüllen");
        int userinput = Scanner.getINT("Geben Sie bitte die gewünschte Größe des Arrays an ==>", 0, 888);
        int[] userSIZEDarray = new int[userinput];
        for (int i = 0; i < userinput; i++) {
            userSIZEDarray[i] = i + 1;
        }
        System.out.println(Arrays.toString(userSIZEDarray));

        // Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.

        System.out.println("Array erstellen und mit 10,9,8,...,1 befüllen");
        userinput = Scanner.getINT("Geben Sie bitte die gewünschte Größe des Arrays an ==>", 0, 888);
        int[] userSIZEDarray2 = new int[userinput];
        for (int arrayELEMENT = 0; arrayELEMENT < userinput; arrayELEMENT++) {
            userSIZEDarray2[arrayELEMENT] = userinput-arrayELEMENT;
        }
        System.out.println(Arrays.toString(userSIZEDarray2));

        //



    }
}
