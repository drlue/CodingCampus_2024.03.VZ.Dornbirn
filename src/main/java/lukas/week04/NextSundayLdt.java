package lukas.week04;

import lukas.Helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NextSundayLdt
{
    public static void main(String[] args) {
        LocalDate myDate = Helper.readLocaleDateFromConsole("Gib ein Datum ein >>>");
        LocalDate nextSun = getLocalDateOfNextSunday(myDate);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.printf("%-20s %-10s %-10s\n", "gew. Datum:", dtf1.format(myDate), dtf2.format(myDate));
        System.out.printf("%-20s %-10s %-10s\n", "nächster Sonntag:", dtf1.format(nextSun), dtf2.format(nextSun));
    }

    public static LocalDate getLocalDateOfNextSunday(LocalDate myDate){
        while (myDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
            myDate = myDate.plusDays(1);
        }
        return myDate;
    }

}
