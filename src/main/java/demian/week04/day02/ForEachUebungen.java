package demian.week04.day02;

public class ForEachUebungen {

    public static void main(String[] args) {

        //Übung 1:
        // Summe eines Arrays: Schreibe ein Programm, das die Summe aller Elemente in einem Integer-Array berechnet und ausgibt.

        int [] test = {10,3,4,2,1};
        int summe = 0;
        for (int value:test){
            summe += value;
        }
        System.out.println(summe);

        //ÜBUNG 2:
        // Durchschnitt eines Arrays: Schreibe ein Programm,
        // das den Durchschnitt aller Elemente in einem Double-Array berechnet und ausgibt.

        double [] test2 = {1.2,1.45,1,3.456,1.23};
        double summe2 = 0;
        for (double element : test2){
            summe2 += element;
        }
        System.out.println(summe2);

        //ÜBUNG 2:
        // Maximaler Wert in einem Array: Schreibe ein Programm,
        // das den maximalen Wert in einem Integer-Array findet und ausgibt.

        int [] test3 = {1,4,6,3,2,46,8};
        int max = Integer.MIN_VALUE;
        for (int element : test3){
            if (element > max){
                max = element;
            }
        }
        System.out.println(max);

        //ÜBUNG 3:
        // Anzahl der Vokale in einem String: Schreibe ein Programm,
        // das die Anzahl der Vokale in einem String zählt.
        // Verwende dazu eine for-each-Schleife, um durch den String zu iterieren.

        String test4 = "ApepipopuAEae";
        char [] arr1 = test4.toCharArray();
        int count = 0;
        for (char element : arr1){
            if (element == 'A' || element == 'E' || element == 'I' || element == 'O' || element == 'U' || element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u' ){
                count++;
            }
        }
        System.out.println(count);


    }
}
