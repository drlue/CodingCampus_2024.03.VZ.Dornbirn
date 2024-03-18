package christian.week04.day01;

import java.util.Scanner;

public class StringSandbox {
    public static Scanner sc = new Scanner(System.in);
   static String nameD = "wie";
    public static void main(String[] args) {
        String nameA = "wer";
        String nameB = "das";
        String nameC = "wswdfasdfasd";
        System.out.println("String.equals A to B:");
        System.out.println(nameA.equals(nameB));
        System.out.println("String.compare B to C :");
        System.out.println(nameB.compareTo(nameC));
        System.out.println("String.contentequals B to \"was\" :");

        System.out.println(nameB.contentEquals("was"));
        System.out.println("\"hallo\" == \"hallo\"");
        System.out.println("hallo"=="hallo");
        System.out.println("Golbaler String (kein Parameter der Methode) wird in Void methode verändert");
        System.out.println(nameD);
        isStringMutable();
        System.out.println(nameD);
        System.out.println("Golbaler String als parameter übergeben wird in Void methode nicht verändert, weil Kopie");
        System.out.println(nameD);
        isStringMutable2(nameD);
        System.out.println(nameD);
    }

    public static void isStringMutable(){
        nameD = "Wo";
    }
    public static void isStringMutable2(String nameD){
        nameD = "wie";
        System.out.println("Ausgabe in Methode gibt änderung aus");
        System.out.println(nameD);
    }
    public static boolean StringEquals (String nameA, String nameB){
        return nameA.equals(nameB);


    }
}
