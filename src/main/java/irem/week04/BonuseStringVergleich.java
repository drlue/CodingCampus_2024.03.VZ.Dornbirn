package irem.week04;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class BonuseStringVergleich {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie String 1 ein:");
        String word = sc.nextLine();
        System.out.println("Geben Sie String 2 ein:");
        String word2 = sc.nextLine();

        System.out.println("== " + (word == word2));
        System.out.println("equals " + (word.equals(word2)));
//der benutzer wird zweimal auffgefordert einen string eizugeben
//anschließend wird überprüft ob die beiden Strings word und word2 auf dasselbe objekt im speicher zeigen mit einnem ==
//danach wird überprüft ob die beiden strings den gleichen wert enthalten
// die ausgabe ist faslch da wir mit einem operator kein string verwenden können
// die ausgabe ist wahr KANN ICH MIR NICHT ERKLÄREN


        System.out.println("Hello" == "Hello");
        //warum ist die ausgabe wahr?
        //KANN ICH MIR NICHT ERKLÄREN
    }
}




