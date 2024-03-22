package irem.week04;

import java.util.Calendar;
import java.util.Scanner;

public class HowManySundaysAreThereInAmonth {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getSundays(2024, 10));
        System.out.println(getSundays(2024, 9));
    }

    public static int getSundays(int year, int month) {
        month -= 1;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countSundays = 0;

        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(year, month, day);
            // Prüfe, ob der Tag ein Sonntag ist
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                countSundays++;
            }
        }

        return countSundays;
    }
}




