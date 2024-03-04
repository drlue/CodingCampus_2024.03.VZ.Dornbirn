package samet.week2.day1;

import java.util.Scanner;

public class KursteilnehmerWhileSchleife {
    public static void main(String[] args) {
        int guests;
        Scanner scan = new Scanner(System.in);
        boolean weiter = true;


        System.out.println("Anzahl der angemeldeten Kursteilnehmer:");
        guests = scan.nextInt();

        while (weiter) {
            System.out.println("Teilnehmer anmelden (1), abmelden (2), Programm beenden (3)");
            int value = scan.nextInt();

            if (value == 1) {
                guests++;
            }
            if (value == 2) {
                guests--;
            }
            if (value == 3) {
                weiter = false;
            }
        }
        System.out.println("Anzahl der Gäste: " + guests);
    }
}






