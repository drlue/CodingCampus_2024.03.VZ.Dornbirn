package irem.week02;

public class Faktorielle3 {
    public static void main(String[] args) {
        System.out.println("\n Faktorielle3 nummer 3");
        faktorielle3(20);
    }

    public static long faktorielle3(int zahl) {
        long teilErgebnis = 1;
        for (int aktuellerwert = 1; aktuellerwert <= zahl; aktuellerwert++) {
            teilErgebnis *= aktuellerwert;
            System.out.printf("%2d! = %20d\n", aktuellerwert, teilErgebnis);
        }
            return teilErgebnis;
        }
    }
//teil Ergebniss ist die bennenung für meinen Zwischenschritt
//aktuellerwert ist die bennenung für den wert der aktuell ist

