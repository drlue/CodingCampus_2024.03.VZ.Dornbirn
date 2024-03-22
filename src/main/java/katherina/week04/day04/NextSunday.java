package katherina.week04.day04;

//Aufgabe: Wann ist Sonntag?
//Erstelle eine neue Calendar Instanz und gib das Datum des nächsten Sonntags aus.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;

public class NextSunday {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date today = new Date();

        DateFormat dataformat = new SimpleDateFormat("EEEE");
        DateFormat dataformat2 = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Der heutige Wochentag ist ein " + dataformat.format(today) + ", am " + dataformat2.format(today) + ".");
        System.out.println("Wann ist der nächste Sonntag?");
        calendar.setTime(today);
        int weekdaynumber = calendar.get(DAY_OF_WEEK);
        int sundayCountDown = Calendar.SUNDAY + 7 - weekdaynumber;
        calendar.add(Calendar.DAY_OF_YEAR, sundayCountDown);
        Date sunday = calendar.getTime();
        System.out.println("Der nächste Sonntag ist in " + sundayCountDown + " Tagen!");
        System.out.print("Und zwar am " + dataformat2.format(sunday));


    }
}
