package katherina.week01.day01;

public class AufgabeZaehlen1 {

    public static void main(String[] args) {
        for (int zahl = 0; zahl <= 10; zahl++)
        {
            System.out.println("Unsere Zahl " + zahl);
        }

        {
            int zahl2 = 0;
            while (zahl2 <= 10) {
                System.out.println("Unsere andere Zahl:" + zahl2);
                zahl2++;
            }
        }
    }
}

