package katherina.week04.day04;

//Aufgabe: Mein Geburtstag
//Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von SimpleDateFormat.parse() verarbeitet.
// Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
// Hierbei kann Calendar verwendet werden.

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class BirthdayKid {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Bitte gib dein Geburtsdatum im Format 'Tag'.'Monat'.'Jahr' ein! Beispielsweise: 09.01.2011");
        String input = sc.nextLine();
        DateFormat dataformat = new SimpleDateFormat("dd.MM.yyyy");
       System.out.println("Deine Eingabe war: " + input);
        try {
            Date parsedDate = dataformat.parse(input);
            System.out.println("Das eingegebene Datum ist: " + dataformat.format(parsedDate));
        } catch (ParseException e) {
            System.err.println("Hasi, dein Geburtstag besteht doch wohl hoffenlich aus Ganzzahlen. Also gib gefälligst auch welche ein."+e.getMessage());
        }
        DateFormat dataformat2 = new SimpleDateFormat("EEEEEEEEEEE",new Locale("de-AT"));

        System.out.println("Dein Geburtstag war an einem "+dataformat2);

    }
}