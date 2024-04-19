package demian.week08.Enum;

import java.util.Locale;

import static java.time.DayOfWeek.MONDAY;

public class EnumUebungen {
    enum DayOfWeek {
        MONTAG,
        DIENSTAG,
        MITTWOCH,
        DONNERSTAG,
        Freitag,
        SAMSTAG,
        SONNTAG;
    }

    public static int getNumberOfDay(DayOfWeek day) {
        switch (day) {
            case MONTAG:
                return 0;
            case DIENSTAG:
                return 1;
            case MITTWOCH:
                return 2;
            case DONNERSTAG:
                return 3;
            case Freitag:
                return 4;
            case SAMSTAG:
                return 5;
            case SONNTAG:
                return 6;
            default:
                return Integer.MIN_VALUE;


        }
    }


    public static void main(String[] args) {

        for (DayOfWeek day : DayOfWeek.values()){
            int numb = getNumberOfDay(day);
            String pfeil = "-->";
            System.out.printf("%-10s %5s %5d%n",day,pfeil,numb);
        }


    }


}
