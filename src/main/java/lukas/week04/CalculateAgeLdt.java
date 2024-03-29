package lukas.week04;

import lukas.Helper;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculateAgeLdt {

    public static void main(String[] args) {

        LocalDate dateOfBirth = Helper.readLocaleDateFromConsole("Geburtsdatum eingeben >>>");
        LocalDate now = LocalDate.now();
        Period age = Period.between(dateOfBirth, now);
        System.out.printf(
                "Alter:  %s, %s und %s \n",
                (age.getYears() == 1) ? age.getYears() + " Jahr" : age.getYears() + " Jahre",
                (age.getDays() == 1) ? age.getMonths() + " Monat" : age.getMonths() + " Monate",
                (age.getDays() == 1) ? age.getDays() + " Tag" : age.getDays() + " Tage"
        );

        LocalDate tmp = now;
        tmp = tmp.minusDays(age.getDays());
        tmp = tmp.minusMonths(age.getMonths());

        long days = ChronoUnit.DAYS.between(tmp, now);
        System.out.println("bzw.");
        System.out.printf(
                "Alter:  %s und %s \n",
                (age.getYears() == 1) ? age.getYears() + " Jahr" : age.getYears() + " Jahre",
                (days == 1) ? days + " Tag" : days + " Tage"
        );


    }

}
