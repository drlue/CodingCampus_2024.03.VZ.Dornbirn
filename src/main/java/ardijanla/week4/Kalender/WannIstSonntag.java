package ardijanla.week4.Kalender;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Date;

public class WannIstSonntag {
    public static void main(String[] args) {
        //erstellt eine Instanz mit dem aktuellen datum
        Calendar date1 = Calendar.getInstance();
        System.out.println(date1);
        while(date1.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
            date1.add(Calendar.DAY_OF_WEEK,1);
        }
        System.out.println(date1.getTime());




    }






}
