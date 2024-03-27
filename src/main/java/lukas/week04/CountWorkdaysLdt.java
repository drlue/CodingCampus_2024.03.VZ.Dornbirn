package lukas.week04;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class CountWorkdaysLdt {

    public static void main(String[] args) {

        int year = 2021;
        int month = 2;

        //Validate month
        //month = (month % 12 == 0) ? 12 : month % 12;

        if (month < 1 || month > 12 || year > Math.abs(999999999)) {
            System.out.println("Jahr oder Monat groesser als erlaubt");
        }

        else {
            String monthString = LocalDate.of(year, month, 1).getMonth().getDisplayName(TextStyle.FULL, Locale.GERMAN);
            System.out.printf("Anzahl Werktage %s %s: %3d\n", monthString, year, getWorkdays(year, month));
        }


    }

    public static int getWorkdays(int year, int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        Month ldMonth = localDate.getMonth();
        int count = 0;
        while (localDate.getMonth() == ldMonth) {
            if (localDate.getDayOfWeek() != DayOfWeek.SUNDAY && localDate.getDayOfWeek() != DayOfWeek.SATURDAY) {
                count++;
            }
            localDate = localDate.plusDays(1);
        }
        return count;
    }

}
