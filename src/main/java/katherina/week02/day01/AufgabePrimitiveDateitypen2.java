package katherina.week02.day01;

public class AufgabePrimitiveDateitypen2 {
    public static void main(String[] args) {
        System.out.println("\nDivida et Impera");
        teilHerrschaft(20);
    }


    public static void teilHerrschaft(int zahl) {
        for (int startwert = 0; startwert <= zahl; startwert++) {
            System.out.println(startwert);
            System.out.println(startwert/5);
            System.out.println(startwert/5.0);
            System.out.println();
        }
    }

}
