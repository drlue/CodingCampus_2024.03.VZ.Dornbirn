package lukas.week04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CountWorkdaysLdt {

    public static void main(String[] args) {

        int year = 2024;
        int month = 3;
        System.out.println("");

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
