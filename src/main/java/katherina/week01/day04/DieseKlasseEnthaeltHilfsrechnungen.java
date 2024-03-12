package katherina.week01.day04;

public class DieseKlasseEnthaeltHilfsrechnungen {
    public static void main(String[] args) {
        int zahl = 0;
        while (zahl <= 101) {
            if (((zahl % 3 == 0) || (zahl % 16 == 0)) && (zahl % 32 != 0)) {
                System.out.println("Unsere merkwürdig teilbare Zahl:" + zahl);
            }
            zahl++;
        }

        int jahreszahl = 0;
        while (jahreszahl <= 3000) {
            if (((jahreszahl % 4 == 0) && (jahreszahl % 100 != 0)) || (jahreszahl % 400 == 0)) {
                System.out.println("Unsere Schaltjahre:" + jahreszahl);
            }
            jahreszahl++;
        }
        //Die Aufgabenstellung sieht zwar nur einen Scope von 100 vor, aber wer weiß, wann ich das noch mal brauche.

        int untergrenze = -100; int obergrenze = 101; int mittelwert = ((untergrenze+obergrenze))/2;
        System.out.println("Der Mittelwert beträgt:"+ mittelwert);

        int g = 20; int m = 12;
        System.out.println("Das jährliche Taschengeld beträgt"+ g*m);
        //Im Bus haben drei Kinder miteinander darüber gestritten, wie viel Taschengeld ein anderes Kind am Ende des Jahres hat, wenn es 20€ im Monat kriegt und komplett spart.

    }

}
