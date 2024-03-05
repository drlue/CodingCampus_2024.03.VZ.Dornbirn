package samet.week01.day05;

public class PrimitiveDatenTypen {


    public static void main(String[] args) {
        System.out.println("Aufgabe 1: " + faktiiorelle1(10));
        faktiiorelle2(20);
        faktiirelle3(20);
        countTo100InSteps(0.1F);
        System.out.println(calculatePi(0.00001));
        System.out.println("Pi: " + Math.PI);

    }


    public static long faktiiorelle1(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result = i * result;
        }
        return result;
    }

    public static void faktiiorelle2(int value) {
        long result = 1;
        System.out.println("\nAufgabe 2:");
        for (int i = 1; i <= value; i++) {
            result = i * result;
            System.out.println(" " + result);

        }
    }

    public static void faktiirelle3(int value) {
        long result = 1;
        System.out.println("\nAufgabe 3:");
        for (int i = 1; i <= value; i++) {
            result = i * result;
            System.out.printf("%2d! = %19d%n", i, result);

        }
    }

    public static void countTo100InSteps(float value) {
        for (double d = 0; d <= 100; d += value) {
            System.out.printf(" %5.1f\n", d, d);
        }


        for (int i = 900; i < 1000; i++) {
            System.out.println(i / 10.0);
        }

        for (int i = 0; i <= 20; i++) {
            System.out.println("---");
            System.out.println("i: " + i);
            System.out.println(i / 5);
            System.out.println(i / 5.0);
        }
    }

    public static double calculatePi(double precision){
        int nenner = 1;
        double piMin = 0;
        double piMax = 4;
        while (piMax - piMin > precision){
            piMax = piMin + 4.0 / nenner;
            nenner += 2;
            piMin = piMax - 4.0 / nenner;
            nenner += 2;
        }

        System.out.printf("PI: %16.14f - %16.14f%n", piMin, piMax);
        return piMin;
    }





}






