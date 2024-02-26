package demian.week01.day01;

public class Day1 {
    public static void main(String[] args) {
        //Variable declaration
        int number;
        //Initialization
        number = 3;
        System.out.println(number);

        //Declaration and Initialization
        int number2 = 10;
        System.out.println(number2);
        long nunber5 = 10;

        //Floating point number double precision
        double number3 = 10.123;
        //Floating point number single precision
        float number4 = 10.1234f;

        boolean trueorfalse = true;

        //Aufgabe V1 + V2 in V3 schreiben und Ausgeben
        int zahl1 = 8;
        int zahl2 = 5;
        int sum = zahl1 + zahl2;
        System.out.println("Ergebnis von 8+5 =" + sum); //mit dem + vor Summe wird ein String von

        //Aufgabe zahl 1 dividiert durch zahl 2 in einer neuen Variabel
        int sum2 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8/5 =" + sum2); //Achtung: Es wird nur eine Ganzzahl ausgegeben

        float sum3 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8/5 =" + sum3); // Ganzzahl durch ganzzahl gibt immer nur eine ganzzahl

        float sum4 = zahl1 / (float) zahl2;                 //zuerst zahl2 umändern in float
        System.out.println("Ergebnis von 8/5.0 =" + sum4);

        int index = 0;

        // Aufgabe index um 1 erhöhen

        index++;     // ++ wird oft bei schleifen gebraucht
        index += 1;
        index = index + 1;
        ++index;

        System.out.println("Index: " + index);
        System.out.println("Index++: " + index++);
        System.out.println("Index after ++: " + index);
        System.out.println("++Index: " + (++index));

        index += 2; // um zwei erhöhen
        index += 2; // mal 2
        index /= 2; // durch 2 ...  alternativ kann man natürlich "index = index / 2" verwenden

        //Aufgabe while Schleife
        index = 0;                                              //Deklarieren und Initialisieren
        while (index < 10) {                                     //Bedingungsprüfung: Programm geht immer in die SChleife bis die Bedingung nicht mehr erfüllt ist
            System.out.println("Current Index: " + index);        //Ausführen des SChleifenrumpfs (Alles in der geschwungenen Klammer)
            index++;                                            //Verändern der Variable
        }


        //Aufgabe for Schleife
        for (int index2 = 0; index2 <= 10; index2++) {           //Deklarieren und Initialisieurng; Bedingungsprüfen der Bedingung; Ausführen des Schleifenrumps; Inkrementieren der Variable
            System.out.println("Current Index2: " + index2);
        }

        //Do while schleife                                     //Hier wird im Gegensatz zur for Schleife vor der Bedingungsprüfung der do Rumpf ausgeführt
        index = 0;
        do {
            System.out.println("Do While Current Index: " + index);
            index++;
        } while (index < -10);
        System.out.println("Do While Current Index: " + index);


    }
}
