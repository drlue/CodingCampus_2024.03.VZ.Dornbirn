package luki.week04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date inOneHourFromNow = new Date(System.currentTimeMillis() + 60 * 60 * 1000);
        System.out.println(inOneHourFromNow);

        //Stunde 0-23
        DateFormat format = new SimpleDateFormat("HH");
        System.out.println(format.format(inOneHourFromNow));

        System.exit(0);
        //Stunde 0-23 : Minuten
        DateFormat format2 = new SimpleDateFormat("HH:mm");
        System.out.println(format2.format(inOneHourFromNow));

        //Aktueller Wochentag
        DateFormat format3 = new SimpleDateFormat("EEEE", new Locale("ar"));
        int espanolDialects = 0;
        for (Locale l : Locale.getAvailableLocales()) {
            System.out.println(l.getDisplayName() + " -> " + l.getLanguage());
            if (l.getLanguage().startsWith("es")) {
                espanolDialects++;
            }
        }
        System.out.println("Available locales: " + Locale.getAvailableLocales().length);
        System.out.println("Espanol dislacts: " + espanolDialects);
        System.out.println(format3.format(inOneHourFromNow));


        //String einlesen in der Form Tag.Monat.Jahr Stunde(0-23):Minute

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bitte geben Sie ein Datum im Format Tag.Monat.Jahr Stunde:Minute ein!");
//        String input = scanner.nextLine();
//        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
//        System.out.println("Ihre Eingabe war: " + input);
//
//        try {
//            Date parsedDate = df.parse(input);
//            System.out.println("Das Eingegebene Datum ist: " + df.format(parsedDate));
//        } catch (ParseException e) {
//            System.err.println("Ihre eingabe ist ungültig!!! "+e.getMessage());
//        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        calendar.add(Calendar.HOUR_OF_DAY, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        //Get java.util.Date from Calendar
        System.out.println(calendar.getTime());

        System.out.println("Tag des Monats: "+calendar.get(Calendar.DATE));
        System.out.println("Aktuelles Jahr: "+calendar.get(Calendar.YEAR));

        System.out.println("Die Woche Startet: "+calendar.getFirstDayOfWeek());
        System.out.println("Aktueller Wochentag: "+calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("Tag am Ende des Monats: "+calendar.getMaximum(Calendar.DATE));

        //Set java.util.Date
        calendar.setTime(new Date());

    }
}
