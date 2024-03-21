package irem.week04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Kalender {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Date now = new Date();
        System.out.println(now);

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(format.format(now));

        DateFormat format2 = new SimpleDateFormat("HH.mm.ss");
        System.out.println(format2.format(now));

        DateFormat format3 = new SimpleDateFormat("dd.MM.yyyy  HH.mm.ss  z ");
        format3.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(format3.format(now));

        DateFormat format4 = new SimpleDateFormat("ss. S ");
        System.out.println(format4.format(now));

    }
}
