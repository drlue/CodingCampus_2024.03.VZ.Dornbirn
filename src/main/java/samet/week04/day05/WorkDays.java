package samet.week04.day05;

import java.time.LocalDate;
import java.time.Month;

public class WorkDays {

    public static void main(String[] args) {


        int year = 2024;
        Month month = Month.JANUARY;
        int workDays = countWorkdays(year, month);
        System.out.println("Number of Workdays in:" + year +" "+ month);

    }

    public static int countWorkdays(int year, Month month){

        int workdays = 0;
        LocalDate date = LocalDate.of(year, month,1);

        while (date.getMonth() == month){

        }
        return workdays;
    }

}
