package samet.week04.day04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class HowManySunndaysPerMonth {

    public static void main(String[] args) {

        int year = 2024;
        Month month = Month.JUNE;
        int sundays = countSundays(year, month);
        System.out.println("Number of Sundays in " + year + " " + month + " " + sundays);

    }

    public static int countSundays(int year, Month month) {

        int sundays = 0;
        LocalDate date = LocalDate.of(year, month, 1);

        while (date.getMonth() == month) {

            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundays++;
            }
            date = date.plusDays(1);
        }

        return sundays;


    }
}
