package samet.week04.day04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WhenIsSunday {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int toDay = calendar.get(Calendar.DAY_OF_WEEK);
        int daysTillSunday = Calendar.SUNDAY - toDay;
        if (daysTillSunday < 0) {
            daysTillSunday += 7;

        }
        //zähle zum heutigem Datum days dazu
        calendar.add(Calendar.DAY_OF_YEAR, daysTillSunday);
        System.out.println(daysTillSunday + " Tage bis zum nächsten Sonntag!");
        //definiere Datumsformat
        DateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        //gib mir das neue Datum von calendar als Typ Datum
        Date nextSundayAsDate = calendar.getTime();
        //bringe dieses Datum ins gewünschte Format
        String parsedDate = myFormat.format(nextSundayAsDate);
        System.out.println(parsedDate + " Datum des nächsten Sonntags!");


    }

}
