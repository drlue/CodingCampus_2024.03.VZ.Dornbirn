package katherina.week04.day05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class SundayPerYearPerMonth {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();

        System.out.println("Willkommen zum Programm, das dir die Anzahl an Sonntagen in einem bestimmten Monat (in einem konkreten Jahr) ausgibt.");
        System.out.println();

        int year = fetchyear("Bitte gib ein Jahr ein! (Beispielsweise 2015)", -12000, Integer.MAX_VALUE);
        System.out.println("Deine Eingabe lautet also "+year);
        int month = fetchmonth("Bitte gib einen Monat ein. Nutze dabei die Schreibweise mit zwei Ziffern. (Beispielsweise 01): ", 1, 12);
        System.out.println("Deine Eingabe lautet also "+month);
        System.out.println("Nun zaubern wir ein bisschen und wandeln das in ein Datum um ...");

        int x = year;
        int y = month;
        LocalDate start = LocalDate.now().withMonth(y).withYear(x);{
            System.out.println("Du willst also wissen, wie viele Sonntage es im "+start.format(DateTimeFormatter.ofPattern("MMMM yyyy G"))+" gibt. Interessant!");

            int daysPerMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int sundayCount = 0;

            for (int day = 1; day <=daysPerMonth ; day++) {
                calendar.set(year, month, day);
                if (calendar.get(Calendar.DAY_OF_MONTH) == Calendar.SUNDAY) {
                    sundayCount++;
                }
            }
            System.out.println("Es gibt "+sundayCount + "Sonntage im "+start.format(DateTimeFormatter.ofPattern("MMMM yyyy G"))+" !");

        }


    }
    public static int fetchyear(String message, int minvalue, int maxvalue) {
        String[] errorMessages = new String[]{
                "Hasi, du musst mir schon ein gültiges Jahr nennen, damit ich dir die Sonntage sagen kann.",
                "Mausi, willst du mich ärgern? Glaub mir, das klappt nicht. Schreib eine Jahreszahl hin!",
                "Also. Ich erkläre das jetzt ganz leicht verständlich: Du schreibst die Antwort mit Zahlen. Die Dingsis auf deinem Nummernblock. Deal? Deal.",
                "Ich will ja wirklich keine Capslock nutzen müssen, aber WEIẞT DU SCHON, was eine Jahreszahl ist?!?!?!",
                "Du kämpfst wie eine schwangere Kuh! Äh, Moment, falsches Skript. Du sollst ein Jahr eingeben! Siehe Beispiel!",
                "Tja, das hast du nun davon. Du musst das komplett neu starten wegen dieser Fehleingabe. Selber schuld."
        };
        System.out.print(message);
        int input = Integer.MIN_VALUE;
        while (input < minvalue || input > maxvalue) {
            while (!sc.hasNextInt()) {
                int errorMessageIndex = new Random().nextInt(errorMessages.length);
                System.out.println(errorMessages[errorMessageIndex]);
                sc.nextLine();
                System.out.print(message);
            }
            input = sc.nextInt();
            sc.nextLine();
            if (input < minvalue || input > maxvalue) {
                int errorMessageIndex = new Random().nextInt(errorMessages.length);
                System.out.println(errorMessages[errorMessageIndex]);
                System.out.print(message);
            }
        }
        return input;
    }

    public static int fetchmonth(String message, int minvalue, int maxvalue) {
        String[] errorMessages = new String[]{
                "Hasi, du musst mir schon einen gültigen Monat nennen, damit ich dir die Sonntage sagen kann.",
                "Mausi, willst du mich ärgern? Glaub mir, das klappt nicht. Schreib eine Monatszahl hin!",
                "Also. Ich erkläre das jetzt ganz leicht verständlich: Du schreibst die Antwort mit Zahlen. Die Dingsis auf deinem Nummernblock. Deal? Deal.",
                "Ich will ja wirklich keine Capslock nutzen müssen, aber WEIẞT DU SCHON, was eine Monatszahl ist?!?!?!",
                "Du kämpfst wie eine schwangere Kuh! Äh, Moment, falsches Skript. Du sollst einen Monat eingeben! Siehe Beispiel!",
                "Tja, das hast du nun davon. Du musst das komplett neu starten wegen dieser Fehleingabe. Selber schuld."
        };
        System.out.print(message);
        int input = Integer.MIN_VALUE;
        while (input < minvalue || input > maxvalue) {
            while (!sc.hasNextInt()) {
                int errorMessageIndex = new Random().nextInt(errorMessages.length);
                System.out.println(errorMessages[errorMessageIndex]);
                sc.nextLine();
                System.out.print(message);
            }
            input = sc.nextInt();
            sc.nextLine();
            if (input < minvalue || input > maxvalue) {
                int errorMessageIndex = new Random().nextInt(errorMessages.length);
                System.out.println(errorMessages[errorMessageIndex]);
                System.out.print(message);
            }
        }
        return input;
    }
}
