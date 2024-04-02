package franco.week04;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class BirthdayBash {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Date date=getBirthDate();
        dayOfbirth(date);

    }

    public static Date getBirthDate(){
        Date date= new Date();
        boolean validDate= false;
        while(!validDate){
            System.out.println("Please type in your birthday in the form of dd.MM.yyyy;");
            String input=scan.nextLine();
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            try{
                date  = format.parse(input);
                validDate=true;

            }catch (ParseException e){
                System.err.println("Please enter a valid date!!");
            }
        }
        return date;
    }
    public static void dayOfbirth(Date date){

        DateFormat format= new SimpleDateFormat("EEEE");
        System.out.println(format.format(date)+ " was your birthday!");

    }
}
