package aki.week01.day01;

public class AufgabeSchleifen {
    public static void main(String[] args) {
        //Zählen
        for (int zahl1 = 0; zahl1 <= 10; zahl1++) {
            System.out.println("for-Schleife: " + zahl1);
        }

        System.out.println("--------------------");

        //Zählen 2
        int counter = 0;
        while (counter < 10) {
            System.out.println("while-Schleife: " + counter);
            counter++;
        }

        System.out.println("--------------------");

        //Zählen mit Trick
        for (int count = 0; count <= 10; count++) {
            if (count % 2 == 0) {
                System.out.println("Gerade Zahl: " + count);
            }
        }

        System.out.println("--------------------");

        //Rewind
        int plusZuMinus = 10;

        while (plusZuMinus >= -10) {
            System.out.println("Plus zu Minus: " + plusZuMinus);
            plusZuMinus--;
        }
    }
}
