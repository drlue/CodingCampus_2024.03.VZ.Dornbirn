package christian.week04.day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class KalenderDatum {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        wannUndWo();
//        String Tag = geburtstagsTagAusgebenWithDateClass();
//        System.out.println(Tag);
//        geburtstagsTagAusgebenWithCalendarClass();
//        System.out.println(wannIstSontag());
//        System.out.println(wievieleSonntageInMonatX(2021, 10));
        Example();
    }

    public static void wannUndWo() {
        Date now = new Date();
        System.out.println(now);
        System.out.println();

        System.out.println("Nur das Datum:");
        DateFormat dateformatDatum = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(dateformatDatum.format(now));
        System.out.println();

        System.out.println("Nur die Uhrzeit:");
        DateFormat dateformatUhrzeit = new SimpleDateFormat("HH:mm");
        System.out.println(dateformatUhrzeit.format(now));
        System.out.println();

        System.out.println("Datum und Uhrzeit:");
        DateFormat dateformatDatumUndUhrzeit = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println(dateformatDatumUndUhrzeit.format(now));
        System.out.println();

        System.out.println("Datum und Uhrzeit und Zeitzone:");
        System.out.println(dateformatDatumUndUhrzeit.format(now) + " " + dateformatDatumUndUhrzeit.getTimeZone().toZoneId());
        System.out.println();

        System.out.println("Millisekunden seit 1970:");
        System.out.println(now.getTime());
        System.out.println();
    }


    public static String geburtstagsTagAusgebenWithDateClass() {
        System.out.println("Gib deinen Geburtstag in folgendem Format ein: DD.MM.YYYY");


        DateFormat dateformatDatum = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat dateformatTag = new SimpleDateFormat("EEEE");

        Date geburtsDatum = null;
        boolean valid = false;

        while (!valid)
            try {
                String geburtstag = sc.nextLine();
                geburtsDatum = dateformatDatum.parse(geburtstag);
                valid = true;
            } catch (ParseException pe) {
                System.out.println("Ungültige Eingabe!");
            }

        System.out.println("Dein Geburtstag war ein: " + dateformatTag.format(geburtsDatum));

        String geburtstagTAg = dateformatTag.format(geburtsDatum);
        return geburtstagTAg;
    }

    public static void geburtstagsTagAusgebenWithCalendarClass() {
        System.out.println("Gib deinen Geburtstag in folgendem Format ein: DD.MM.YYYY");

        Calendar kalender = null;
        DateFormat datumFormat = new SimpleDateFormat("dd.MM.yyyy");

        while (kalender == null) {
            try {
                String geburtstag = sc.nextLine();
                Date datum = datumFormat.parse(geburtstag);
                kalender = Calendar.getInstance();
                kalender.setTime(datum);
            } catch (ParseException pe) {
                System.out.println("Ungültige Eingabe!");
            }
        }

        System.out.println(kalender.get(Calendar.DAY_OF_WEEK));

        //einfacher mit Array und Index day_of_week
//        String[] days = {"Sonntag", "Montag"};

        switch (kalender.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("Sonntag");
                break;
            case 2:
                System.out.println("Montag");
                break;
            case 3:
                System.out.println("Dienstag");
                break;
            case 4:
                System.out.println("Mittwoch");
                break;
            case 5:
                System.out.println("Donnerstag");
                break;
            case 6:
                System.out.println("Freitag");
                break;
            case 7:
                System.out.println("Samstag");
                break;
        }
    }

    public static String wannIstSontag() {


        Calendar kalender = Calendar.getInstance();

        while (kalender.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            kalender.add(Calendar.DAY_OF_MONTH, 1);
        }
        return kalender.getTime().toString();
    }

    public static int wievieleSonntageInMonatX(int jahr, int monat) {
        int sum = 0;

        Calendar kalender = Calendar.getInstance();
        kalender.set(jahr, monat, 1);

        while (kalender.get(Calendar.DAY_OF_MONTH) < kalender.getMaximum(Calendar.DAY_OF_MONTH)) {
            kalender.add(Calendar.DAY_OF_MONTH, 1);
            if (kalender.get(Calendar.DAY_OF_MONTH) == Calendar.SUNDAY) {
                sum += 1;
            }
        }

        return sum;
    }
    public static void Example() {
        // creating Calendar object
        Calendar calendar = Calendar.getInstance();

        // Program to demonstrate get() method
        // of Calendar class
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));


        // Program to demonstrate getMaximum() method
        // of Calendar class
        System.out.println();
        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);

        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in a year: " + max);


        // Program to demonstrate getMinimum() method
        // of Calendar class
        System.out.println();
        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min);

        min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + min);


        // Program to demonstrate add() method
        // of Calendar class
        System.out.println();
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());

    }
}
//Date t = new Date();
////t.getYear()
//
//        System.out.println("Daylight: "+TimeZone.getDefault().getDSTSavings());
//
//Date now = new Date();
//
//
//        System.out.println("Now in daylight saving: "+TimeZone.getDefault().inDaylightTime(now));
//
//Calendar c = Calendar.getInstance();
//        c.add(Calendar.MONTH, 1);
//        System.out.println("One month later in daylight saving: "+TimeZone.getDefault().inDaylightTime(c.getTime()));
//
//
//LocalDateTime t1 = LocalDateTime.now();
//        System.out.println(t1);
//t1 = t1.plus(1, ChronoUnit.HOURS).plusDays(10).plusDays(5);
//        System.out.println(t1);

