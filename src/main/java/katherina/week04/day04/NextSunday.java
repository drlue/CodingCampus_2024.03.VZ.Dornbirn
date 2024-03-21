package katherina.week04.day04;

//Aufgabe: Wann ist Sonntag?
//Erstelle eine neue Calendar Instanz und gib das Datum des nächsten Sonntags aus.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextSunday {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date today = new Date();

        DateFormat dataformat = new SimpleDateFormat("EEEEEEEEE");
        DateFormat dataformat2 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Der heutige Wochentag ist ein: "+dataformat.format(calendar.get(Calendar.DAY_OF_WEEK))+ " am " +dataformat2.format(today)+".");
        System.out.println("Wann ist der nächste Sonntag?");

    }
}
