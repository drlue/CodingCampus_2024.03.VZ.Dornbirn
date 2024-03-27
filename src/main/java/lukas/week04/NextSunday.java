package lukas.week04;

import lukas.Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NextSunday {

    public static void main(String[] args) {
        Date myDate = Helper.readDateFromConsole("Gib ein Datum ein >>>");
        Date nextSun = getDateOfNextSunday(myDate);
        DateFormat df1 = new SimpleDateFormat("EEEE");
        DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.printf("%-20s %-10s %-10s\n", "gew. Datum:", df1.format(myDate), df2.format(myDate));
        System.out.printf("%-20s %-10s %-10s\n", "nächster Sonntag:", df1.format(nextSun), df2.format(nextSun));
    }

    public static Date getDateOfNextSunday(Date now) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int dayNr = cal.get(Calendar.DAY_OF_WEEK);
        int daysTillSunday = Calendar.SUNDAY + 7 - dayNr;
        cal.add(Calendar.DAY_OF_YEAR, daysTillSunday);
        return cal.getTime();
    }


}
