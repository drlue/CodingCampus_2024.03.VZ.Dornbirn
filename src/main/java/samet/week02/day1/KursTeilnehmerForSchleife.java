package samet.week02.day1;

import java.util.Scanner;


import static gyula.week02.UserInputExample.sc;


public class KursTeilnehmerForSchleife {
    public static void main(String[] args) { //Version 1
        int guests;
        Scanner scan = new Scanner(System.in);

        System.out.println("Anzahl der angemeldeten Teilnehmer: ");
        guests = scan.nextInt();

        while (true) {
            System.out.println("+X Teilnehmer anmelden, 0 Programm beenden, -X Teilnehmer abmelden");
            while (!sc.hasNextInt()) {
                System.out.println("Hello, es ist keine Zahl...");
                sc.nextLine();

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
}