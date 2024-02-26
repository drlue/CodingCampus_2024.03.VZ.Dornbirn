package demian.week01.day01;

public class Aufgaben {
    public static void main(String[] args) {

        //Aufgabe Print A

        System.out.println("Hello World!");
        System.out.println("");
        System.out.println("     /--\\ ");
        System.out.println("    / /\\ \\ ");
        System.out.println("   / /  \\ \\ ");
        System.out.println("  / /    \\ \\ ");
        System.out.println(" /  ======  \\ ");
        System.out.println("/_/        \\_\\");

        //Aufgabe Zählen
        // Zähle in einer Schleife von 0 bis inklusive 10 und gib die Zahlen aus.
        //
        //1.Verwende dazu eine for-Schleife
        //2.Verwende dazu eine while-Schleife und erstelle eine separate Zählvariable

        // 1.FOR SCHLEIFE
        System.out.println("Zählen mit for schleife");
        for (int index = 0; index <= 10; index++) {
            System.out.println(index);
        }

        // 2.WHILE SCHLEIFE
        System.out.println("Zählen mit while schleife");
        int index = 0;
        do {
            System.out.println(index);
            index++;

        } while (index < 10);
        System.out.println(index);


        // AUFGABE ZÄHLEN 2: Zähle in einer Schleife von 0 bis exklusive 10 und gib die Zählvariable aus.
        System.out.println("Zählen 2");
        for (int index2 = 0; index2 <= 9; index2++) {
            System.out.println(index2);
        }

        //Aufgabe: Zählen mit Trick
        System.out.println("Zählen mit Trick");

        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);

        }

        //Aufgabe: Rewind
        System.out.println("Aufgabe Rewind");
        for (int i = -10; i <= 10; i++) {
            System.out.println(i);

        }


    }

    public static String printChars (char a, int b) {}
    }

}
