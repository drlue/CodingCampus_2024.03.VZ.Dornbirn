package demian.week02.day02;


import java.util.Scanner;

public class NachbauScannerNameAlterSchuhgroeße {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        textAnfrage("========================================\nHallo!\n\nBitte geben Sie hier ihren Namen ein ==> ");


    }
    //Wiederverwendbare Usereingaben:

    //Texteingabe
    public static void textAnfrage(String textAnfrage) {
        System.out.println(textAnfrage);
    }

}
