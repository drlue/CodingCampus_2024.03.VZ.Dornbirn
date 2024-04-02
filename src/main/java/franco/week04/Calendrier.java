package franco.week04;

import java.util.Calendar;
import java.util.Date;

public class Calendrier {
    public static void main(String[] args) {
        //create a new calendar object
        Calendar calendar = Calendar.getInstance();
        //System.out.println("calendar "+calendar);
        Date now = new Date();
        System.out.println("The time now is: " + now);
        // creating a Calendar object
        Calendar c = Calendar.getInstance();
        // set Months
        // MONTH starts with 0 i.e. ( 0 - Jan)
        c.set(Calendar.MONTH, 11);
        // set Date
        c.set(Calendar.DATE, 05);
        // set Year
        c.set(Calendar.YEAR, 1996);
        // creating a date object with specified time.
        Date dateOne = c.getTime();
        System.out.println("Lets see this date(05:11:1996): "+ dateOne);
        // creating a date of object
        // storing the current date
        Date currentDate = new Date();
        System.out.print("Is current Date after date one : ");
        // if currentDate is after dateOne
        System.out.println(currentDate.after(dateOne));
    }
}