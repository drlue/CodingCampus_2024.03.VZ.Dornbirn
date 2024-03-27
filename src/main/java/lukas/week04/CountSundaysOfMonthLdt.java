package lukas.week04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class CountSundaysOfMonthLdt {
    public static void main(String[] args) {
        int year = 2024;
        int month = 3;
        String monthName = LocalDate.of(year, month, 1).getMonth().getDisplayName(TextStyle.FULL, Locale.GERMAN);
        System.out.print("Anzahl Sonntage im Monat " + monthName + " " + year + ":   ");
        System.out.println(getSundaysLocalDate(year, month));
        printSundaysInMonth(year, month);
    }

    public static int getSundaysLocalDate(int year, int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        Month ldMonth = localDate.getMonth();
        int count = 0;
        while (localDate.getMonth() == ldMonth) {
            if (localDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            localDate = localDate.plusDays(1);
        }
        return count;
    }

    public static void printSundaysInMonth(int year, int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        Month ldMonth = localDate.getMonth();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int count = 0;
        while (localDate.getMonth() == ldMonth) {
            if (localDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
                System.out.printf("%d. Sonntag:  %s\n", count, dtf.format(localDate));
            }
            localDate = localDate.plusDays(1);
        }
    }
}
