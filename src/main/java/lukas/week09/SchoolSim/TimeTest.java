package lukas.week09.SchoolSim;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {

    public static void main(String[] args) {
        parseHour("07:00");
        testEnd("08:45");
    }

    public static void parseHour(String input) {

        LocalTime myTime = LocalTime.parse(input, DateTimeFormatter.ofPattern("HH:mm"));
        if (myTime == LocalTime.parse("08:00")) {
            System.out.print("Juppi Arbeitsbeginn! ");
        }
        System.out.println("It is" + myTime);

    }

    public static void testEnd(String myString) {

        LocalTime myTime = LocalTime.parse(myString);
        LocalTime startTime = LocalTime.parse("08:00", DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = startTime.plusMinutes(45);

        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(myTime);
        if (myTime.equals(endTime)) {
            System.out.println("myTime == endTime");
        }




    }

}


