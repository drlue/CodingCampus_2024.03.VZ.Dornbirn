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
        System.out.println("Aufgabe 2: \n" + randomNumber + " ist kleiner als 5 oder größer als 100");
        System.out.print("Pruefung ergibt: ");
        System.out.println(lowerthan5orbiggerthan100(randomNumber));

        //Aufgabe 3:
        System.out.println();
        System.out.println("Aufgabe 3: \n" + randomNumber + " ist Positiv und ungerade");
        System.out.print("Pruefung ergibt: ");
        System.out.println(positivANDuneven(randomNumber));

        //Aufgabe 4:
        System.out.println();
        System.out.println("Aufgabe 4: \n" + randomNumber + " ist Kleiner als 0 aber nicht -1");
        System.out.print("Pruefung ergibt: ");
        System.out.println(lowerthan0butNOTminues1(randomNumber));

        //Aufgabe 5:
        System.out.println();
        System.out.println("Aufgabe 5: \n" + randomNumber + " ist größer gleich 5 und kleiner gleich 100 ");
        System.out.print("Pruefung ergibt: ");
        System.out.println(greaterTHAN5andLOWERorEQUAL100(randomNumber));

        //Aufgabe 6:
        System.out.println();
        System.out.println("Aufgabe 6: \n" + randomNumber + " ist ohne Rest durch 3 oder 16 Teilbar, aber nicht durch 32 ");
        System.out.print("Pruefung ergibt: ");
        System.out.println(dividibleBY3or16butNOT32(randomNumber));

    }

    //Die Zahl ist: Ist gerade und größer als 10 (Connecting logical operators)
    public static boolean evenandbiggerthan10(int number) {
        return ((number % 2 == 0) && (number > 10));
    }

    //Die Zahl ist: Ist kleiner als 5 oder größer als 100 (if then else)
    public static boolean lowerthan5orbiggerthan100(int number) {
        if (number < 5 || number > 100) {
            return true;
        } else {
            return false;
        }
    }

    // Die Zahl ist: Positiv und ungerade (if then else, without nesting)
    public static boolean positivANDuneven(int number) {
        if ((number > 0) && ((number % 2) != 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Die Zahl ist: Die Zahl ist: Kleiner als 0 aber nicht -1
    public static boolean lowerthan0butNOTminues1(int number) {
        return ((number < 0) && (number != -1));
    }

    // Die Zahl ist: Ist größer gleich 5 und kleiner gleich 100
    public static boolean greaterTHAN5andLOWERorEQUAL100(int number) {
        return (number > 5) && (number <= 100);
    }

    // Die Zahl ist: Ohne Rest durch 3 oder 16 Teilbar, aber nicht durch 32
    public static boolean dividibleBY3or16butNOT32(int number) {
        if (( (number % 3) == 0 || (number % 16) == 0 ) && number % 32 != 0) {
            return true;
        } else {
            return false;

        }
    }


}
