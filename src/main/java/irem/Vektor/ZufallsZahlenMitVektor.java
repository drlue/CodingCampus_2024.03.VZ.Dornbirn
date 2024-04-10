package irem.Vektor;

import java.util.Random;
import java.util.Vector;

public class ZufallsZahlenMitVektor {

    public static void main(String[] args) {
        Vector<Integer> zufallsZahlen = new Vector<Integer>();
        Random rand = new Random();

        for (int i = 0; i <20; i++) {

            zufallsZahlen.add(rand.nextInt(101));
        }
        System.out.println(zufallsZahlen);
    }
}
