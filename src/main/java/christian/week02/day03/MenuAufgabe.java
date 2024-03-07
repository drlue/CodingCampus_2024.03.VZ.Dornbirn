package christian.week02.day03;

import christian.week01.day03.geometricQuadrangularFormsWithLoops;
import christian.week01.day03.geometricTriangularFormsWithLoops;

import java.util.Scanner;

public class MenuAufgabe {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean wiederholungbool = true;
        while (wiederholungbool == true) {

            System.out.println("Willkommen bei meinen Aufgaben!");
            System.out.printf("Was möchtest du Zeichnen?\n 1) Dreieck \n 2) Quadrat \n 3) Rhombus\n");

            int programmAuswahl = einsZweiOderDreiEingabe();
            String zeichenAuswahl = charakterEingabe();
            int groesseAuswahl = groesseEingabe(0, 50);

            if (programmAuswahl == 1) {
                geometricTriangularFormsWithLoops.printTriangleMiddle(zeichenAuswahl, groesseAuswahl);
            } else if (programmAuswahl == 2) {
                System.out.println(
                        geometricQuadrangularFormsWithLoops.printEmptyXSquare(zeichenAuswahl, groesseAuswahl));
            } else if (programmAuswahl == 3) {
                geometricTriangularFormsWithLoops.printRhombus(zeichenAuswahl, groesseAuswahl);
            }

//bitte nicht schimpfen XD
            String wiederholungStr = "";
            System.out.println("Möchtest du noch etwas zeichnen lassen? Wähle zwischen y/n");
            wiederholungStr = sc.nextLine();
            if (wiederholungStr.equalsIgnoreCase("n")) {
                wiederholungbool = false;
            } else {
                wiederholungbool = true;
            }

        }
    }

    public static int einsZweiOderDreiEingabe() {
        int result = Integer.MIN_VALUE;
        boolean resultfin = false;
        System.out.println("Wähle zwischen den 3 vorgegebenen Optionen! Wähle 1,2 oder 3!");

        while (resultfin == false) {
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                if (result > 0 && result < 4) {
                    resultfin = true;
                } else {
                    System.out.println("Bitte wähle zwischen 1,2 oder 3!");
                }
            } else {
                System.out.println("Bitte wähle zwischen 1,2 oder 3!");
            }
            //while(sc.hasNextLine())
            sc.nextLine();
        }
        return result;
    }

    public static String charakterEingabe() {
        String buchstabe = "";
        System.out.println("Bitte gib ein Zeichen ein!");
        boolean ready = false;

        while (ready == false) {
            buchstabe = sc.nextLine();
            if (buchstabe.length() != 1) {
                System.out.println("Bitte gib nur ein Zeichen ein!");
            } else {
                ready = true;
            }
        }
        return buchstabe;
    }

    public static int groesseEingabe(int min, int max) {
        int result = -1;

        while (result < min || result > max) {
            System.out.printf("Bitte gib eine Ganzzahl zwischen %d und %d als gewünschte Größe ein! \n", min, max);
            while (sc.hasNextInt() == false) {
                System.out.printf("Bitte gib eine Ganzzahl zwischen %d und %d als gewünschte Größe ein! \n", min, max);
                sc.nextLine();
            }
            result = sc.nextInt();
            sc.nextLine();
        }
        return result;
    }
}
