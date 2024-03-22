package samet.week04.day04;

import java.util.Calendar;

public class WhenIsSunday {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int wochenTag = calendar.get(Calendar.DAY_OF_WEEK);
        int days = Calendar.SUNDAY - wochenTag;
        if (days < 0){
            days += 7;

        }
        calendar.add(Calendar.DAY_OF_YEAR, days);
        System.out.println(days);


    }

}
