package irem.Datenklasse;

public class Tester {
    //Überschreibe die toString() Methode und erstelle einen schönen String mit den gegebenen Werten.
    public static void main(String[] args) {
        int[] beispielArray1 = {1, 3, -2, 7, -4, 5};
        System.out.println(Berechner.berechne(beispielArray1));

        int[] zufallsArray = new int[10];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < zufallsArray.length; i++) {
            zufallsArray[i] = rand.nextInt(100) - 50;
        }
        System.out.println("Zufallsarray: ");
        for (int zahl : zufallsArray) {
            System.out.print(zahl + " ");
        }
        System.out.println("\n" + Berechner.berechne(zufallsArray));
    }
}


