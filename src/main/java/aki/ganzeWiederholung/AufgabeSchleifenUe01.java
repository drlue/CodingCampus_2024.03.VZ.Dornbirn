package aki.ganzeWiederholung;

public class AufgabeSchleifenUe01 {
    //Zähle in einer Schleife von 0 bis inklusive 10 und gib die Zahlen aus.
    //
    //Verwende dazu eine for-Schleife
    //Verwende dazu eine while-Schleife und erstelle eine separate Zählvariable
    public static void main(String[] args) {
        int zahl = 10;
        for (int i = 0; i <= zahl; i++) {
            System.out.print(i);
        }
        int zero = 0;
        System.out.println();
        while (zero <= zahl){
            System.out.print(zero);
            zero++;
        }
    }
}
