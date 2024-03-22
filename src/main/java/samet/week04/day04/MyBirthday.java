package samet.week04.day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyBirthday {

    public static void main(String[] args) throws ParseException {

        Calendar calender = Calendar.getInstance();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Birthday?");
        String input = scanner.nextLine();
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat weekday = new SimpleDateFormat("EEEE");

        try {
            Date parsedDate = format.parse(input);
            System.out.println("Your Birthday is: " + input + parsedDate);

            System.out.println("Der Wochentag ist " + weekday.format(parsedDate));
        } catch (ParseException e){
            System.err.println("Die eingabe war ungültig! " +e.getMessage());

        }




    }
}
