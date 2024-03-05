package katherina.week02.day02;

import java.util.Scanner;

public class UserInputTests {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = getTextFromConsole("Bitte gib deinen Namen ein: ");
        int age = getIntFromConsole("Bitte gib dein Alter ein: ", 0, 100);
        int shoe = getIntFromConsole("Bitte gib deine Schuhgroesse ein: ", 18, 50);
        String eis = getTextFromConsole("Bitte gib deine Lieblingssorte Eis ein: ");
        double temp = getDoubleFromConsole("Bitte sag mir, wie warm es bei dir ist!", -90.0, 70.0);
        System.out.printf("Hi %s (%d) mit Schuhgroesse %d! Hier hast du eine Kugel %s in der Waffel. Mach es dir gemütlich! Eis bei %.2f %n Grad? Interessante Wahl! \n", text, age, shoe, eis, temp);
    }
    //Hier oben lege ich verschiedene Dinge fest, bzw. was gefragt werden soll. Einmal soll der Input beliebiger Text sein.
    //Und anschließend zwei Zahlen in einem bestimmten Umfang.
    // Ich kann das eigentlich ziemlich beliebig erweitern.

    public static String getTextFromConsole(String message) {
        System.out.print(message);

        String text = sc.nextLine();
        return text;
    }
    //Das hier wird auf alle Fälle gebraucht.

    public static int getIntFromConsole(String message, int mindestwert, int maximalwert) {
        System.out.print(message);
        int result = Integer.MIN_VALUE;
        //Das kleinste erlaubte Ergebnis darf nur so klein sein wie der festgelegte Mindestwert. Ich muss das nicht für beide abgefragten Zahlen
        //einzeln festlegen, es reicht, wenn ich das oben bei der Methode tue. (Mind == blown)
        while (result < mindestwert || result > maximalwert) {
            while (!sc.hasNextInt()) {
                System.out.println("Hi, dies ist keine gültige Eingabe. Hier sind nur ganze Zahlen erlaubt.");
                sc.nextLine();
                System.out.print(message);
            }
            //Wird eine Ganzzahl eingegeben, ist alles tutti. Ansonsten wird die Fehlermeldung gedruckt.
            result = sc.nextInt();
            sc.nextLine();
            if (result < mindestwert || result > maximalwert) {
                System.out.printf("Bitte gib einen gültigen Wert zwischen %d und %d ein.\n", mindestwert, maximalwert);
                System.out.print(message);
                //Und diese Abfrage prüft außerdem, ob - nachdem zumindest eine Zahl eingegeben wurde - diese auch im Geltungsbereich liegt.
            }
        }
        return result;
    }
//Wie oben, nur mit Double statt int.
    public static double getDoubleFromConsole(String message, double mindestwert, double maximalwert) {
        System.out.print(message);
        double result = Double.NEGATIVE_INFINITY;
        while (result < mindestwert || result > maximalwert) {
            while (!sc.hasNextDouble()) {
                System.out.println("Hi, dies ist keine gültige Eingabe. Hier sind nur Zahlen (und Vorzeichen) erlaubt.");
                sc.nextLine();
                System.out.print(message);
            }
            result = sc.nextDouble();
            sc.nextLine();
            if (result < mindestwert || result > maximalwert) {
                System.out.printf("Bitte gib einen gültigen Wert zwischen %f und %f ein.\n", mindestwert, maximalwert);
                System.out.print(message);
            }
        }
        return result;
    }
}

