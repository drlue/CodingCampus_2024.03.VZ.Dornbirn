package luki.week06;

import java.util.Locale;
import java.util.Scanner;

public class ParseFloat {
    public static void main(String[] args) {
        String f = "10.10";
        System.out.printf("%f", Float.parseFloat(f));
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("%f", Float.parseFloat(f));
        System.out.println();

        Locale.setDefault(Locale.GERMAN);


        Scanner s = new Scanner(f);
        System.out.println(s.nextFloat());
    }
}
