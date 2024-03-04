package demian.week02.day01;

public class AufgabeRechnenPrimitive {
    public static void main(String[] args) {

        System.out.println("================================================================");
        System.out.println("================================================================");
        System.out.println("================================================================");
        System.out.println();
        //  AUFGABE 1,2,3:
        //  Im folgenden werden verschiedene Datentypen verwendet. Erstelle wo nötig Methoden um die Komplexität gering zu halten
        //  Formel für die Faktorialrechnung ist:
        //  10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
        //  ACHTUNG: Denke daran, wie groß diese Werte werden und wähle den geeigneten Datentyp: long.

        System.out.print("Aufgabe Faktorialrechnungen bis: ");
        //num definieren für Faktorialrechnung
        int num = 25;
        System.out.println(num + "!\n");
        factorial(num);

        //AUFGABE 4:
        // Von 0 bis 100 Zählen in 0.1er Schritten
        // Erstelle eine Methode, die von 0 bis 100 in 0.1er Schritten zählt, und alle Werte ausgibt
        // Löse das Problem mit mindestens zwei verschiedenen Varianten

        System.out.println("AUFGABE 4");
        printTenthSteps();

    }

    //AUFGABE 1,2,3
    public static void factorial(int number) {
        long sum = 1;
        for (int count = 1; count <= number; count++) {
            System.out.printf("%2d!:", count);
            sum = sum * count;
            if (count <= 20) {
                System.out.printf("%46d\n", sum);
            } else {
                System.out.println("Zahl zu groß um mit long-Variable zu berechnen");
            }
        }
    }

    //AUFGABE 4
    public static void printTenthSteps() {
        for (float count = 0; count <= 100; count = count+0.1f) {
            System.out.printf("%6.2f\n",count);
        }
    }



}
