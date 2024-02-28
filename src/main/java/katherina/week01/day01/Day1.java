package katherina.week01.day01;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        //Wir deklarieren eine Variable!
        int number;
        //Initialisierung - ich sage, was das für ein Ding ist und im nächsten Schritt werfe ich dort einen Wert rein
        //In diesem Fall: Eine Zahl.
        number = 15;
        System.out.println(number);

        //Und nun beides in einer Zeile!
        int number2 = 9;
        System.out.println(number2);
        long number5 = 18;
        //Wie int, aber mit längeren Zahlen. Long 32 Bit, das andere eben doppelt so lang.
        System.out.println(number5);

        //Floating point number double precision
        double number3 = 4.131;
        //Floating point number single precision
        float number4 = 4.131654f;
        //Der Double ist doppelt so genau wie der Float!
        System.out.println(number3);
        System.out.println(number4);

        boolean trueOrFalse = true;

        boolean number4IsBiggerThanNumber3 = number4 > number3;
        //Hier fehlt die Ausgabe.


        String name = "Katherina";
        int zahl1 = 8;
        int zahl2 = 5;
        int sum = zahl1 + zahl2;
        System.out.println("Ergebnis von 8 + 5 =" + sum);
//Wir können also einen Text mit einem anderen verbinden. String plus irgendwas anderes ist ein String.

        int sum2 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 : 5 =" + sum2);
        //int gibt immer ganze Zahlen aus, ist also NICHT geeignet für diese Gleichung. Testen wir das mal weiter:

        float sum3 = zahl1 / zahl2;
        System.out.println("Ergebnis von 8 : 5 =" + sum3);
        //Gibt wieder 1 aus, weil auch Ganzzahlen im Ausgang. Neuer Versuch:

        float sum4 = (float) zahl1 / zahl2;
        System.out.println("Ergebis von 8 : 5 =" + sum4);
        //Perfekt! Eine der beiden Zahlen muss eine Fließkommazahl sein, also ein Float. Dann klappt es auch mit den Fließkommas. Das nennt sich "Casting".
        //Das hat ein paar Grenzen, ich kann aus Boolean keine Zahl machen und aus Strings auch nicht, sogar wenn da Zahlen drin sind.
        //Das Konzept geht mit allen vier Grundrechenarten. (Weitere Operationen kommen später. Geduld, junge Padawane.)

        int index = 0;
        //Ich mache eine Int-Variable, namens Index, mit dem Wert 0. Wie erhöhe ich den?
        //increment index by 1
        index++;
        index += 1;
        index = index + 1;
        ++index;
        System.out.println("Index: " + index);
        System.out.println("Index++: " + index++);
//Das nachgestellte ++ macht: Ich nehme den Wert und dann erhöhe ich den Wert.
        System.out.println("Index after ++:" + index);
        //Und hier ist es die fünf.
        //Und was passiert nun?
        System.out.println("++Index: " + (++index));
//Dann wird der Wert direkt erhöht und dann erst der ursprüngliche Wert ausgelesen. Also plus, plus, und vier. Ergibt sechs.

        //Das funktioniert auch mit Minus, also -- macht um eins niedriger. Aber es gibt kein Malmal/Durchdurch.

        index += 2;
        index *= 2;
        index /= 2;
        index = index / 2;
        //Die letzten zwei bedeuten das Gleiche.)

        index = 0;
        while (index <= 10) {//Bedingung
            System.out.println("Current Index:" + index);//Starter
            index++;//Rumpf.
        }
        //Prüfen, Ausführen, Verändern der Zählvariable.
//Je nachdem, ob beim Gleichheitszeichen gar kein Modifikator steht (endlose Ausgabe) oder andere Modifikatoren, wird mal mehr mal weniger weit gezählt. ! - ungleich. Und dann größer und kleiner.

        //Vorschleife:
        for (int index2 = 0; index2 <= 10; index2++) {
            System.out.println("Current Index2: " + index2);
        }

        //Do-While.Schleife!

        index = 0;
        do {
            System.out.println("Do While Current Index: " + index);
            index++;
        } while (index < -10);

        // System.out.println("Die Summe von 10 und 20 ist: " + add( a:10, b:20));

        //int sum5 = add( a:10, b:20);
        //System.out.println("Die Summe von 10 und 20 ist: " + sum5);

    }

    /**
     * This method adds to given numbers
     *
     * @param a the first number
     * @param b the second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;

    }
}

//Beispiel für "Do- While"
// String username = "";
//Scanner scanner = new Scanner(System.in);
//do {
//  System.out.println("Please tell me your name:");
//username = scanner.nextLine();
//} while (username.equals(""));

//System.out.println("Your name is: " + username);


