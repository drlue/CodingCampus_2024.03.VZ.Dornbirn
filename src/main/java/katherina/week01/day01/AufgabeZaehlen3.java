package katherina.week01.day01;

public class AufgabeZaehlen3 {

    public static void main(String[] args) {
        int zahl = 0;
        while (zahl <= 10) {
            if (zahl % 2 == 0) {
                System.out.println("Unsere geradlinige Zahl:" + zahl);
            }
            zahl++;
        }


        int zahlerina = 0;
        while (zahlerina <= 10) {
            System.out.println("Unsere wunderhübsche Zahl:" + zahlerina);
            zahlerina = zahlerina + 2;
        }
    }
}


