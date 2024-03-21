package irem.week04;

import java.util.Calendar;
import java.util.Scanner;

public class WhenIsSunday {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DAY_OF_WEEK);

        int daysUntilNextSunday = Calendar.SUNDAY - today;

        if (daysUntilNextSunday <= 0) {

            daysUntilNextSunday += 7;
        }

        calendar.add(Calendar.DAY_OF_YEAR, daysUntilNextSunday);

        System.out.println("Das Datum des nächsten Sonntags ist: " +
                calendar.get(Calendar.DAY_OF_MONTH) + "." +
                (calendar.get(Calendar.MONTH) + 1) + "." + // Monat ist 0-basiert
                calendar.get(Calendar.YEAR));
    }
}


