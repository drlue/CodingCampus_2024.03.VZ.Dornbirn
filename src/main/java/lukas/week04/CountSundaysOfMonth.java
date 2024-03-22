package lukas.week04;

import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class CountSundaysOfMonth {
    public static void main(String[] args) {
        int year = 2024;
        int month = 3;
        String monthName = java.time.Month.values()[month].getDisplayName(TextStyle.FULL, Locale.GERMAN);
        System.out.println("Anzahl Sonntage im Monat " + monthName + " " + year+":");
        System.out.println(getSundays(year, month));
    }

    public static int getSundays(int year, int month) {
        int result = 0;

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);
        //cal.get(Calendar.YEAR);
        //System.out.printf("%1$td.%1$tm.%1$tY\n",cal.getTime());
        while (cal.get(Calendar.MONTH) + 1 == month) {
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                result++;
            }
            cal.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }

}
