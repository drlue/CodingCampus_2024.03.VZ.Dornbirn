package demian.week04.day02;

import data.Texts;

import java.util.Arrays;

public class BuchstabenZaehlen1 {

    public static void main(String[] args) {

        String text = "Hallo, was geht ab ??!! Kannst du überhaupt Zeichen zählen?";
        System.out.println("Text:" + text);
        char[] textarray = text.toCharArray();


        int[] buchstabenzaehler = new int[Character.MAX_VALUE];

        for(char element : textarray){
            buchstabenzaehler[element]++;
        }

        System.out.println("Anzahl im Text vorkommender Zeichen:");
        for (int idx = 0; idx < buchstabenzaehler.length; idx++) {
            if (buchstabenzaehler[idx] > 0){
                System.out.printf("%c : " , idx);
                System.out.println(buchstabenzaehler[idx]);
            }

        }

    }
}
