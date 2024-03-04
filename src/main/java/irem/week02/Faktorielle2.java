package irem.week02;

public class Faktorielle2 {
    public static void main(String[] args) {
        System.out.println("\n Faktorielle2 nummer 2");
        faktorielle2(20);
    }

    public static long faktorielle2(int zahl) {
        long teilErgebnis = 1;
        if (zahl > 1) {
            teilErgebnis = faktorielle2(zahl - 1) * zahl;
        }

        System.out.printf("%2d! = %20d\n", zahl, teilErgebnis);
        return teilErgebnis;
    }
}
//teil Ergebniss ist die bennenung für meinen Zwischenschritt