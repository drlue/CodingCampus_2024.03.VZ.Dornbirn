package demian.week01.day04;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //ARBEITEN MIT LOGISCHEN OPERATOREN

        //Übung 1 ausführen:
        printUebung1();


    }

    /*ÜBUNG 1:
    Größer als 3 und eine gerade Zahl oder 11
    */
    public static void printUebung1()

    {

        Random random = new Random();
        //Random number between 100 and 100
        int randomNumber = random.nextInt(-100, 101);

        System.out.println("Uebung 0");
        System.out.println("Generierte Zufallszahl zwischen -100 und 101:" + randomNumber);

        if ((randomNumber > 3) && (randomNumber % 2 == 0) || randomNumber == 0) {
            System.out.println("Zahl ist Größer als 3 und eine gerade Zahl oder 11");
        } else {
            System.out.println("Zahl ist NICHT Größer als 3 und eine gerade Zahl oder 11");
        }
    }
}
