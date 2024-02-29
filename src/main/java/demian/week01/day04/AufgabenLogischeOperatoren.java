package demian.week01.day04;

import java.util.Random;

public class AufgabenLogischeOperatoren {
    public static void main(String[] args) {
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||| \n||||||||||||| LOGISCHE OPERATOREN ||||||||||||||||||| \n|||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Random random = new Random();
        //Random number between 100 and 100
        int randomNumber = random.nextInt(-100, 200);
        System.out.println("Random Number Generator: " + randomNumber);
        System.out.println();

        //Aufgabe 1:
        System.out.println("Aufgabe 1: \n" + randomNumber + " ist gerade und größer als 10");
        System.out.print("Pruefung ergibt: ");
        System.out.println(evenandbiggerthan10(randomNumber));

        //Aufgabe 2:
        System.out.println();
        System.out.println("Aufgabe 2: \n" + randomNumber + " Ist kleiner als 5 oder größer als 100");
        System.out.print("Pruefung ergibt: ");
        System.out.println(lowerthan5orbiggerthan100(randomNumber));

        //Aufgabe 3:



    }

    //Die Zahl ist: Ist gerade und größer als 10
    public static boolean evenandbiggerthan10(int randomNumber) {
        return ((randomNumber % 2 == 0) && (randomNumber > 10));
    }

    //Die Zahl ist: Ist kleiner als 5 oder größer als 100
    public static boolean lowerthan5orbiggerthan100(int randomNumber) {
        if (randomNumber < 5 || randomNumber > 100) {
            return true;
        } else {
            return false;
        }
    }
}
