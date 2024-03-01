package demian.week01.day05;

public class AufgabeRechnenPrimitive {
    public static void main(String[] args) {

        //  Im folgenden werden verschiedene Datentypen verwendet. Erstelle wo nötig Methoden um die Komplexität gering zu halten
        //  Formel für die Faktorialrechnung ist:
        //  10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
        //  ACHTUNG: Denke daran, wie groß diese Werte werden und wähle den geeigneten Datentyp: long.

        System.out.println("Aufgabe 1:");
        int numb = 10;
        long calc = factorial(numb);
        System.out.print(numb + "!=");
        System.out.println(calc);

    }

    public static long factorial(int number) {
        long sum = 0;
        for (int count = 0; count <= number; count++) {


        }
        return sum;
    }

}
