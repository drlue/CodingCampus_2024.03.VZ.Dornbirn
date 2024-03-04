package irem.week02;

public class BerechnungPiLeibnizReihe {
    public static void main(String[] args) {
        printLeibnitz();
    }

    public static void printLeibnitz(){
        double pi = 0;
        int div = 1;
        for (int i = 0; i < 500000; i++) {
            pi += 4.0 / div;
            System.out.println(pi);
            div += 2;
            pi -= 4.0 / div;
            System.out.println(pi);
            div += 2;
        }
    }

    public static double calculatePi(double precision) {
        int nenner  = 1;
        double piMin = 0;
        double piMax = 4;
        while(piMax - piMin>precision){
            piMax= piMin + 4.0/ nenner;
            nenner += 2;
            piMin = piMax-4.0 / nenner;
            nenner += 2;
        }
        return piMin;
    }
}

