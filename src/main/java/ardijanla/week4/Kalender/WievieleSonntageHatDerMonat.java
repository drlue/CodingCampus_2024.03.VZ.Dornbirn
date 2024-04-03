package ardijanla.week4.Kalender;


import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;

public class WievieleSonntageHatDerMonat {
    public static void main(String[] args) {
        getSundays(2020, 8);
    }

    public static void getSundays(int year, int month) {

        try{
            LocalDate date = LocalDate.of(year, month, 1);
            LocalDate firstSunday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

            while(firstSunday.getMonthValue() == month){
                System.out.println(firstSunday);
                firstSunday = firstSunday.plusWeeks(1);
            }
        }catch(DateTimeException e){
            System.out.println("Gib das datum wie ein mensch ein");
        }

    }
}
