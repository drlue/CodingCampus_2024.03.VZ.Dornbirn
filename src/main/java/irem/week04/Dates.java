package irem.week04;

import java.sql.SQLOutput;
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


        DateFormat format = new SimpleDateFormat("EEE", new Locale("sv"));
        int espanolDialects = 0;
        for (Locale l : Locale.getAvailableLocales()) {
            System.out.println(l.getDisplayName() + "-> " + l.getLanguage());
            if (l.getLanguage().startsWith("es")) {
                espanolDialects++;
            }
        }

        System.out.println("Avaible locals:" + Locale.getAvailableLocales().length);
        System.out.println("Espanol dislacts:" + espanolDialects);
       // System.out.println(fomat3.format(inOneHourFromNow));

        //String einlesen

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        DateFormat df = new SimpleDateFormat("dd. MM. yyyy HH:mm");
        System.out.println("Ihre Eingabe war:" + input);
        try {
            Date parsedDate = df.parse(input);
            System.out.println("Das eingegebene Datum ist" + parsedDate);
        } catch (ParseException e) {
            System.err.println("Ihre eingabe ist ungültig" + e.getMessage());
        }
    }



}
