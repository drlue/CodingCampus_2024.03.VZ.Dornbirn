package lukas.week04;

import lukas.Helper;

import java.util.Calendar;
import java.util.Date;

public class CalculateAge {

    public static void main(String[] args) {

        Date date = Helper.readDateFromConsole("Geburtsdatum eingeben (TT.MM.YYYY) >>>");
        int[] age = getAgeYD(date);
        System.out.printf("Alter:  %s und %s \n", (age[0] == 1) ? age[0] + " Jahr" : age[0] + " Jahre", (age[1] == 1) ? age[1] + " Tag" : age[1] + " Tage");

    }

    public static int[] getAgeYD(Date date) {
        Calendar calDateOfBirth = Calendar.getInstance();
        calDateOfBirth.setTime(date);
        Calendar calNow = Calendar.getInstance();


        int years = calNow.get(Calendar.YEAR) - calDateOfBirth.get(Calendar.YEAR);
        int days = 0;
        calDateOfBirth.add(Calendar.YEAR, years);

        //this year's birthday is in the future
        if (calDateOfBirth.get(Calendar.DAY_OF_YEAR) > calNow.get(Calendar.DAY_OF_YEAR)) {
            years = years - 1;
            calDateOfBirth.add(Calendar.YEAR, -1);
            System.out.println(calDateOfBirth.get(Calendar.YEAR));
            System.out.println(calDateOfBirth.getMaximum(Calendar.DAY_OF_YEAR));
            System.out.println(calDateOfBirth.get(Calendar.DAY_OF_YEAR));
            days = calDateOfBirth.getMaximum(Calendar.DAY_OF_YEAR) - calDateOfBirth.get(Calendar.DAY_OF_YEAR) + calNow.get(Calendar.DAY_OF_YEAR) - 1;
        } else { //this year's birthday is in the past
            days = calNow.get(Calendar.DAY_OF_YEAR) - calDateOfBirth.get(Calendar.DAY_OF_YEAR);
        }

        return new int[]{years, days};
    }


}
