package christian.week01.day04;

public class UebungenFaktoriell {
    public static void main(String[] args) {

    }

    // Aufgabe Faktoriell1
    public static long faktoriell1(long x) {
        long solution = 1;
        for (long i = x; i > 1; i--) {
            solution *= i;
        }
        return solution;
    }

    // Aufgabe Faktoriell2
    public static void faktoriell2() {
        for (long i = 1; i <= 20; i++) {
            System.out.println(faktoriell1(i));

        }
    }

    // Aufgabe Faktoriell3
    public static void faktoriell3() {
        for (long i = 1; i <= 20; i++) {
            System.out.printf("%19d%n", faktoriell1(i));

        }
    }
}
