package samet.week2.day1;

import java.util.Scanner;


public class KursTeilnehmerForSchleife {
    public static void main(String[] args) {
        int guests;
        Scanner scan = new Scanner(System.in);

        System.out.println("Anzahl der angemeldeten Teilnehmer: ");
        guests = scan.nextInt();

        while (true) {
            System.out.println("+X Teilnehmer anmelden, 0 Programm beenden, -X Teilnehmer abmelden");
            int value = scan.nextInt();
            if (value == 0) {
                break;
            }
            if (value > 0) {
                for (int i = 0; i < value; i++) {
                    System.out.println("Teilnehmer angemeldet");
                    guests++;
                }
            }
            if (value < 0) {
                for (int i = 0; i > value; i--) {
                    System.out.println("Teilnehmer abgemeldet");
                    guests--;
                }
            }
            System.out.println(guests + "Teilnehmer angemeldet");

        }
    }

}


