package irem.week02;

public class Aufgabe1und2 {
    public static void main(String[] args) {
        for (double zahl = 0; zahl <= 100; zahl += 0.1){
            System.out.println("Unsere Zahl: " + zahl);
        }
        for (double zahl = 0; zahl <= 100; zahl += 0.1){
            System.out.printf("Unsere Zahl: %6.1f\n", zahl);
        }

        for (int i = 9000; i < 10000; i++) {
            System.out.println(i / 100.0);
        }

        System.out.println(".");
    }
}
