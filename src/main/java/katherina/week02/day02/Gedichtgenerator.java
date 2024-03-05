package katherina.week02.day02;

import java.util.Scanner;

public class Gedichtgenerator {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Streng genommen ist das hier kein Generator, sondern ein Baukasten. Was wir hier bauen, nennt sich ein Pantun. " +
                "Stark vereinfacht gesagt: Eine ursprünglich malaiische Gedichtform, die aus mindestens vier Strophen zu je vier Zeilen bestehen.\n" +
                "Ganz streng genommen besteht jede Zeile aus acht bis zwölf Silben.\n" +
                "Ausserdem kann ein Pantun unendlich lang sein, mindestens aber hat das Gedicht vier Strophen. Dieser Baukasten hilft, diese Mindestlänge in der korrekten Reihenfolge zusammenzusetzen.\n" +
                        "Bitte vergiss nicht, dein Gedicht aus der Konsole zu kopieren, sobald es fertig ist. Sonst ist es hinterher weg! Auf nimmerwiedersehen! Futsch!");
        System.out.println();
        System.out.println();
        String text = getTextFromConsole1("Bitte gib die erste Zeile der ersten Strophe ein:");
        String text2 = getTextFromConsole2("Bitte gib die zweite Zeile der ersten Strophe ein:");
        String text3 = getTextFromConsole3("Bitte gib die dritte Zeile der ersten Strophe ein, sie sollte sich auf Zeile 1 reimen:");
        String text4 = getTextFromConsole4("Bitte gib die vierte Zeile der ersten Strophe ein, sie sollte sich auf Zeile 2 reimen:");
        String text5 = getTextFromConsole5("Bitte gib die zweite Zeile der zweiten Strophe ein:");
        String text6 = getTextFromConsole6("Bitte gib die zweite Zeile der zweiten Strophe ein, sie sollte sich auf Zeile 1 reimen:");
        String text7 = getTextFromConsole7("Bitte gib die zweite Zeile der dritten Strophe ein:");
        String text8 = getTextFromConsole8("Bitte gib die vierte Zeile der dritten Strophe ein, sie sollte sich auf Zeile 2 reimen:");


        System.out.println(text); //a , 1
        System.out.println(text2);//b , 2
        System.out.println(text3);//a , 3
        System.out.println(text4);//b , 4
        System.out.println(" ");
        System.out.println(text2);//b , 2
        System.out.println(text5);//c , 5
        System.out.println(text4);//b , 4
        System.out.println(text6);//c , 6
        System.out.println(" ");
        System.out.println(text5);//c , 5
        System.out.println(text7);//d , 7
        System.out.println(text6);//c , 6
        System.out.println(text8);//d , 8
        System.out.println(" ");
        System.out.println(text7);//d , 7
        System.out.println(text3);//a , 3
        System.out.println(text8);//d , 8
        System.out.println(text); //a , 1
    }

    public static String getTextFromConsole1(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }
    public static String getTextFromConsole2(String message) {
        System.out.print(message);

        String text2 = sc.nextLine();
        return text2;
    }
    public static String getTextFromConsole3(String message) {
        System.out.print(message);

        String text3 = sc.nextLine();
        return text3;
    }

    public static String getTextFromConsole4(String message) {
        System.out.print(message);

        String text4 = sc.nextLine();
        return text4;
    }

    public static String getTextFromConsole5(String message) {
        System.out.print(message);

        String text5 = sc.nextLine();
        return text5;
    }
    public static String getTextFromConsole6(String message) {
        System.out.print(message);

        String text6 = sc.nextLine();
        return text6;
    }
    public static String getTextFromConsole7(String message) {
        System.out.print(message);

        String text7 = sc.nextLine();
        return text7;
    }
    public static String getTextFromConsole8(String message) {
        System.out.print(message);

        String text8 = sc.nextLine();
        return text8;
    }
}
